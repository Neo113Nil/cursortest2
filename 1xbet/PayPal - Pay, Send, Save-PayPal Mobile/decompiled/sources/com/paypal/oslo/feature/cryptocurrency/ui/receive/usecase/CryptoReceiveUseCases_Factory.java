package com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase;

/* loaded from: classes12.dex */
public final class CryptoReceiveUseCases_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase> getHighSpeedVideoSizes;

    private CryptoReceiveUseCases_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase> provider3) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases newInstance(com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase evaluateCryptocurrencyTradeUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworksUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase generateReceiveAddressUseCase) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases(evaluateCryptocurrencyTradeUseCase, getAvailableNetworksUseCase, generateReceiveAddressUseCase);
    }
}
