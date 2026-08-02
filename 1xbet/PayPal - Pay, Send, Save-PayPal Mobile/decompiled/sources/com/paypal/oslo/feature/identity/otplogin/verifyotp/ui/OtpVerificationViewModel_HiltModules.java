package com.paypal.oslo.feature.identity.otplogin.verifyotp.ui;

/* loaded from: classes12.dex */
public final class OtpVerificationViewModel_HiltModules {
    private OtpVerificationViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel otpVerificationViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
