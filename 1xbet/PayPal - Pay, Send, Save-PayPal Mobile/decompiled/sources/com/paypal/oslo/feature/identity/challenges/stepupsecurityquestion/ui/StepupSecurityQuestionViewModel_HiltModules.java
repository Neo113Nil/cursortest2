package com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui;

/* loaded from: classes12.dex */
public final class StepupSecurityQuestionViewModel_HiltModules {
    private StepupSecurityQuestionViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel stepupSecurityQuestionViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.challenges.stepupsecurityquestion.ui.StepupSecurityQuestionViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
