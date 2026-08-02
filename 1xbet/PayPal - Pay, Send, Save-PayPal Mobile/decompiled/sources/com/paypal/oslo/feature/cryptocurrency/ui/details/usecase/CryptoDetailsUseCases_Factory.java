package com.paypal.oslo.feature.cryptocurrency.ui.details.usecase;

/* loaded from: classes12.dex */
public final class CryptoDetailsUseCases_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase> getHighSpeedVideoSizes;

    private CryptoDetailsUseCases_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase> provider5) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases newInstance(com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase getAssetPriceHistoryUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase pollCryptoDetailsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworksUseCase) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases(getAssetCurrentPriceUseCase, getAssetHoldingUseCase, getAssetPriceHistoryUseCase, pollCryptoDetailsUseCase, getAvailableNetworksUseCase);
    }
}
