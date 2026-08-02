package org.betup.ui.tour;

import android.content.Context;
import android.os.Bundle;
import io.github.dreierf.materialintroscreen.MaterialIntroActivity;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.model.local.Language;
import org.betup.services.LocaleService;
import org.betup.services.quiz.QuizTourInfoProvider;
import org.betup.ui.fragment.tutorial.CustomLayoutIntroFragment;

/* loaded from: classes4.dex */
public class IntroQuizActivity extends MaterialIntroActivity {

    @Inject
    QuizTourInfoProvider quizTourInfoProvider;

    @Override // io.github.dreierf.materialintroscreen.MaterialIntroActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getApplicationContext()).getComponent().inject(this);
        addSlide(CustomLayoutIntroFragment.INSTANCE.newInstance(R.layout.intro_quiz_1));
        int i = AnonymousClass1.$SwitchMap$org$betup$model$local$Language[Language.getCurrent().ordinal()];
        if (i == 1) {
            addSlide(CustomLayoutIntroFragment.INSTANCE.newInstance(R.layout.intro_quiz_2_ru));
        } else if (i == 2) {
            addSlide(CustomLayoutIntroFragment.INSTANCE.newInstance(R.layout.intro_quiz_2_es));
        } else if (i == 3) {
            addSlide(CustomLayoutIntroFragment.INSTANCE.newInstance(R.layout.intro_quiz_2_de));
        } else if (i == 4) {
            addSlide(CustomLayoutIntroFragment.INSTANCE.newInstance(R.layout.intro_quiz_2_fr));
        } else if (i == 5) {
            addSlide(CustomLayoutIntroFragment.INSTANCE.newInstance(R.layout.intro_quiz_2_it));
        } else {
            addSlide(CustomLayoutIntroFragment.INSTANCE.newInstance(R.layout.intro_quiz_2));
        }
        addSlide(CustomLayoutIntroFragment.INSTANCE.newInstance(R.layout.intro_quiz_3));
    }

    /* renamed from: org.betup.ui.tour.IntroQuizActivity$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$model$local$Language;

        static {
            int[] iArr = new int[Language.values().length];
            $SwitchMap$org$betup$model$local$Language = iArr;
            try {
                iArr[Language.RUSSIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$model$local$Language[Language.SPANISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$model$local$Language[Language.GERMAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$betup$model$local$Language[Language.FRENCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$betup$model$local$Language[Language.ITALIAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleService.onAttach(base));
    }

    @Override // io.github.dreierf.materialintroscreen.MaterialIntroActivity
    public void onFinish() {
        super.onFinish();
        this.quizTourInfoProvider.saveTourWasShown();
    }
}
