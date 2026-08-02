package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel;

/* loaded from: classes12.dex */
public final class StepupOtpVerificationViewModel_HiltModules {
    private StepupOtpVerificationViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel stepupOtpVerificationViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
