package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

/* loaded from: classes12.dex */
public final class StepupWebViewViewModel_HiltModules {
    private StepupWebViewViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel stepupWebViewViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
