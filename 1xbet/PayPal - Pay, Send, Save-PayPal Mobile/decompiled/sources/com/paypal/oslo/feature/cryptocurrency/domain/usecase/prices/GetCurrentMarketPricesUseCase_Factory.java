package com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices;

/* loaded from: classes12.dex */
public final class GetCurrentMarketPricesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getHighSpeedVideoFpsRangesFor;

    private GetCurrentMarketPricesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase(cryptoMarketPricesRepository, currencyProvider);
    }
}
