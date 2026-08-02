package com.paypal.oslo.feature.cryptocurrency.ui.hub;

/* loaded from: classes12.dex */
public final class CryptoHubPollDataFacade_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase> getHighSpeedVideoSizes;

    private CryptoHubPollDataFacade_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase> provider3) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade newInstance(com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase pollCryptoHoldingsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase pollCryptoMarketPricesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase filterMarketPricesUseCase) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade(pollCryptoHoldingsUseCase, pollCryptoMarketPricesUseCase, filterMarketPricesUseCase);
    }
}
