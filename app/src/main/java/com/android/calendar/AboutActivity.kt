package com.android.calendar

import android.os.Bundle
import androidx.appcompat.widget.Toolbar

import com.android.calendar.BaseActivity

import ws.xsoh.etar.R

private val dynamicTheme = DynamicTheme()

class AboutActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dynamicTheme.onCreate(this)

        setContentView(R.layout.simple_frame_layout_material)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = getString(R.string.preferences_menu_about)

        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.body_frame, AboutFragment())
                    .commit()
        }

        setupInsets(findViewById(R.id.main_frame))
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

}
