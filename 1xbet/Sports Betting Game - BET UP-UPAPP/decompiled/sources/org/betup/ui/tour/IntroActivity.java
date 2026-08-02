package org.betup.ui.tour;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.github.dreierf.materialintroscreen.MaterialIntroActivity;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.services.LocaleService;
import org.betup.ui.MainActivity;
import org.betup.ui.fragment.tutorial.IntroFragment;
import org.betup.ui.fragment.tutorial.TermsAndConditionsFragment;

/* loaded from: classes4.dex */
public class IntroActivity extends MaterialIntroActivity {
    @Override // io.github.dreierf.materialintroscreen.MaterialIntroActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getApplicationContext()).getComponent().inject(this);
        addSlide(IntroFragment.newInstance("", getString(R.string.intro_1_desc), R.drawable.intro_1));
        addSlide(IntroFragment.newInstance(getString(R.string.intro_2_title), getString(R.string.intro_2_desc), R.drawable.intro_2));
        addSlide(IntroFragment.newInstance(getString(R.string.intro_3_title), getString(R.string.intro_3_desc), R.drawable.intro_3));
        addSlide(new TermsAndConditionsFragment());
        setSkipButtonVisible();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleService.onAttach(base));
    }

    @Override // io.github.dreierf.materialintroscreen.MaterialIntroActivity
    public void onFinish() {
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
    }
}
