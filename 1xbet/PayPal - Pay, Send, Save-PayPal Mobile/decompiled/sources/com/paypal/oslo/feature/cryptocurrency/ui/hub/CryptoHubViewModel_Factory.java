package com.paypal.oslo.feature.cryptocurrency.ui.hub;

/* loaded from: classes12.dex */
public final class CryptoHubViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHubUiMappers> getInputFormats;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getOutputMinFrameDuration;

    private CryptoHubViewModel_Factory(dagger.internal.Provider<androidx.view.SavedStateHandle> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHubUiMappers> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider6, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator> provider7, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider8) {
        this.getOutputMinFrameDuration = provider;
        this.getHighSpeedVideoSizesFor = provider2;
        this.getInputFormats = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
        this.getHighSpeedVideoSizes = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel get() {
        return newInstance(this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoSizesFor.get(), this.getInputFormats.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel_Factory create(dagger.internal.Provider<androidx.view.SavedStateHandle> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHubUiMappers> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider6, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator> provider7, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider8) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel newInstance(androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases cryptoHubUseCases, com.paypal.oslo.feature.cryptocurrency.ui.hub.mapper.CryptoHubUiMappers cryptoHubUiMappers, com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade cryptoHubPollDataFacade, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade pYUSDRewardsCardFacade, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel(savedStateHandle, cryptoHubUseCases, cryptoHubUiMappers, cryptoHubPollDataFacade, pYUSDRewardsCardFacade, currencyProvider, cryptocurrencyProvisioningCoordinator, featureGateManager);
    }
}
