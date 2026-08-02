package com.paypal.oslo.feature.cryptocurrency.ui.onboarding;

/* loaded from: classes12.dex */
public final class CryptoOnboardingViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.onboarding.C0342CryptoOnboardingViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private CryptoOnboardingViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.onboarding.C0342CryptoOnboardingViewModel_Factory c0342CryptoOnboardingViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0342CryptoOnboardingViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel create(java.lang.String str) {
        return this.getHighSpeedVideoFpsRangesFor.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.onboarding.C0342CryptoOnboardingViewModel_Factory c0342CryptoOnboardingViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel_Factory_Impl(c0342CryptoOnboardingViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.onboarding.C0342CryptoOnboardingViewModel_Factory c0342CryptoOnboardingViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel_Factory_Impl(c0342CryptoOnboardingViewModel_Factory));
    }
}
