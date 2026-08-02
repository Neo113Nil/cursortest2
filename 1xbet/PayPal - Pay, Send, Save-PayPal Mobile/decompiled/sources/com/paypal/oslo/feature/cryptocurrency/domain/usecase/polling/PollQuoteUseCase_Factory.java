package com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling;

/* loaded from: classes12.dex */
public final class PollQuoteUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRanges;

    private PollQuoteUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository cryptoQuoteRepository, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase(cryptoQuoteRepository, dynamicConfigurationManager, coroutineDispatcher);
    }
}
