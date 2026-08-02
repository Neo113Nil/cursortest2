package com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling;

/* loaded from: classes12.dex */
public final class PollCryptoDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository> getHighSpeedVideoSizes;

    private PollCryptoDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository cryptoMarketPricesRepository, com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase(cryptoMarketPricesRepository, cryptoHoldingsRepository, currencyProvider, dynamicConfigurationManager, coroutineDispatcher);
    }
}
