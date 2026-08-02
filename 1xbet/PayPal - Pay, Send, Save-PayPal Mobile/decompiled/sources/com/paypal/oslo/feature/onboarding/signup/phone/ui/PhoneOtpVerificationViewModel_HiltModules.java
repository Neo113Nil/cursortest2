package com.paypal.oslo.feature.onboarding.signup.phone.ui;

/* loaded from: classes13.dex */
public final class PhoneOtpVerificationViewModel_HiltModules {
    private PhoneOtpVerificationViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
