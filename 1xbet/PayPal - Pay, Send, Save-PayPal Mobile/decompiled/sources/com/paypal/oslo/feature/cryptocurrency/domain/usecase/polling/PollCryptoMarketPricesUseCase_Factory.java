package com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling;

/* loaded from: classes12.dex */
public final class PollCryptoMarketPricesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private PollCryptoMarketPricesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase(cryptoMarketPricesRepository, currencyProvider, dynamicConfigurationManager, coroutineDispatcher);
    }
}
