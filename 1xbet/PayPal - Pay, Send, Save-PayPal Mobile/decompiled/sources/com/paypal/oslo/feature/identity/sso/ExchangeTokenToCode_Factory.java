package com.paypal.oslo.feature.identity.sso;

/* loaded from: classes13.dex */
public final class ExchangeTokenToCode_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase> getHighSpeedVideoSizes;

    private ExchangeTokenToCode_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator> provider2, dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator> provider2, dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore> provider5) {
        return new com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode newInstance(com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase tokenToCodeUseCase, com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator pKCEGenerator, com.paypal.oslo.core.identity.config.AuthConfigProvider authConfigProvider, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore checkoutWebSSOIntentStore) {
        return new com.paypal.oslo.feature.identity.sso.ExchangeTokenToCode(tokenToCodeUseCase, pKCEGenerator, authConfigProvider, identityTokenStorage, checkoutWebSSOIntentStore);
    }
}
