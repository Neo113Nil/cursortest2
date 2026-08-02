package com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel;

/* loaded from: classes15.dex */
public final class VerificationSuccessViewModel_HiltModules {
    private VerificationSuccessViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel.VerificationSuccessViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel.VerificationSuccessViewModel verificationSuccessViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel.VerificationSuccessViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
