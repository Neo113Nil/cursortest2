package com.paypal.oslo.feature.cryptocurrency.ui.onboarding;

/* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0342CryptoOnboardingViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter> Camera2StreamConfigurationMap;

    private C0342CryptoOnboardingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel get(java.lang.String str) {
        return newInstance(str, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.onboarding.C0342CryptoOnboardingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.onboarding.C0342CryptoOnboardingViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel newInstance(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter cryptoProvisioningFlowRouter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel(str, cryptoProvisioningFlowRouter);
    }
}
