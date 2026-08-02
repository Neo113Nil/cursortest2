package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd;

/* loaded from: classes12.dex */
public final class PYUSDRewardsSettingsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase> getOutputFormats;

    private PYUSDRewardsSettingsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator> provider6) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getOutputFormats = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.getHighSpeedVideoSizes = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator> provider6) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel newInstance(com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase updatePYUSDRewardsEnrollmentUseCase, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper pYUSDRewardsStatusUiMapper, com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper pYUSDRewardsHoldingsUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel(getPYUSDRewardsStatusUseCase, updatePYUSDRewardsEnrollmentUseCase, pYUSDRewardsStatusUiMapper, getAssetHoldingUseCase, pYUSDRewardsHoldingsUiMapper, cryptocurrencyProvisioningCoordinator);
    }
}
