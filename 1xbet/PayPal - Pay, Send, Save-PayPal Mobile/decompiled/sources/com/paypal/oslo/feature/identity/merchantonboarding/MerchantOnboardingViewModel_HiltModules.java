package com.paypal.oslo.feature.identity.merchantonboarding;

/* loaded from: classes12.dex */
public final class MerchantOnboardingViewModel_HiltModules {
    private MerchantOnboardingViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
