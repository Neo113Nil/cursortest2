package com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings;

/* loaded from: classes12.dex */
public final class GetCryptoHoldingsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getHighResolutionOutputSizeshNQ4ISI;

    private GetCryptoHoldingsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase(cryptoHoldingsRepository, currencyProvider);
    }
}
