package com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase;

/* loaded from: classes12.dex */
public final class CryptoHubUseCases_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase> getHighSpeedVideoSizes;

    private CryptoHubUseCases_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase> provider5) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases newInstance(com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getCryptoHoldingsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase getCurrentMarketPricesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase filterMarketPricesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase getCryptoCapabilitiesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases(getCryptoHoldingsUseCase, getCurrentMarketPricesUseCase, filterMarketPricesUseCase, getCryptoCapabilitiesUseCase, checkCryptoProvisioningUseCase);
    }
}
