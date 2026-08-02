package com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling;

/* loaded from: classes12.dex */
public final class PollCryptoHoldingsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getHighSpeedVideoSizes;

    private PollCryptoHoldingsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository cryptoHoldingsRepository, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase(cryptoHoldingsRepository, currencyProvider, dynamicConfigurationManager, coroutineDispatcher);
    }
}
