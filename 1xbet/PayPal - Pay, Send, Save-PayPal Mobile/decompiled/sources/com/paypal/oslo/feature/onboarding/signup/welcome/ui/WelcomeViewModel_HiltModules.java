package com.paypal.oslo.feature.onboarding.signup.welcome.ui;

/* loaded from: classes13.dex */
public final class WelcomeViewModel_HiltModules {
    private WelcomeViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
