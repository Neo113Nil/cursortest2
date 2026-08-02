package com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices;

/* loaded from: classes12.dex */
public final class GetAssetPriceHistoryUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getHighSpeedVideoSizes;

    private GetAssetPriceHistoryUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase(cryptoMarketPricesRepository, currencyProvider);
    }
}
