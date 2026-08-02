package com.paypal.oslo.feature.identity.merchantonboarding;

/* loaded from: classes12.dex */
public final class MerchantOnboardingViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.CodeToTokenExchange> getHighSpeedVideoSizes;

    private MerchantOnboardingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.CodeToTokenExchange> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.CodeToTokenExchange> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase> provider2) {
        return new com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel newInstance(com.paypal.oslo.feature.identity.api.CodeToTokenExchange codeToTokenExchange, com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase updateTokenUseCase) {
        return new com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel(codeToTokenExchange, updateTokenUseCase);
    }
}
