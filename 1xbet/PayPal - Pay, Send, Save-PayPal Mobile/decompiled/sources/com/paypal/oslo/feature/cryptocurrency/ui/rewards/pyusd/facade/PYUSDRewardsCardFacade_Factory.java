package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade;

/* loaded from: classes12.dex */
public final class PYUSDRewardsCardFacade_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase> getOutputMinFrameDuration;

    private PYUSDRewardsCardFacade_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider6) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getOutputMinFrameDuration = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider6) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade newInstance(com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase getPYUSDRewardsHoldingsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase updatePYUSDRewardsEnrollmentUseCase, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper pYUSDRewardsStatusUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper pYUSDRewardsHoldingsUiMapper, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade(getPYUSDRewardsStatusUseCase, getPYUSDRewardsHoldingsUseCase, updatePYUSDRewardsEnrollmentUseCase, pYUSDRewardsStatusUiMapper, pYUSDRewardsHoldingsUiMapper, featureGateManager);
    }
}
