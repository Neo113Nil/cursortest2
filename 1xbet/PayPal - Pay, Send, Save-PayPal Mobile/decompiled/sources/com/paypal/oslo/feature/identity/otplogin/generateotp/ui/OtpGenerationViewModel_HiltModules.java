package com.paypal.oslo.feature.identity.otplogin.generateotp.ui;

/* loaded from: classes12.dex */
public final class OtpGenerationViewModel_HiltModules {
    private OtpGenerationViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
