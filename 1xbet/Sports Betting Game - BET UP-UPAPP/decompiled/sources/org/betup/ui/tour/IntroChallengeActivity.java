package org.betup.ui.tour;

import android.content.Context;
import android.os.Bundle;
import io.github.dreierf.materialintroscreen.MaterialIntroActivity;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.services.LocaleService;
import org.betup.services.challenge.ChallengeTourInfoProvider;
import org.betup.ui.fragment.tutorial.CustomLayoutIntroFragment;

/* loaded from: classes4.dex */
public class IntroChallengeActivity extends MaterialIntroActivity {

    @Inject
    ChallengeTourInfoProvider challengeTourInfoProvider;

    @Override // io.github.dreierf.materialintroscreen.MaterialIntroActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getApplicationContext()).getComponent().inject(this);
        addSlide(CustomLayoutIntroFragment.INSTANCE.newInstance(R.layout.intro_challenge_1));
        addSlide(CustomLayoutIntroFragment.INSTANCE.newInstance(R.layout.intro_challenge_2));
        addSlide(CustomLayoutIntroFragment.INSTANCE.newInstance(R.layout.intro_challenge_3));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleService.onAttach(base));
    }

    @Override // io.github.dreierf.materialintroscreen.MaterialIntroActivity
    public void onFinish() {
        super.onFinish();
        this.challengeTourInfoProvider.saveTourWasShown();
    }
}
