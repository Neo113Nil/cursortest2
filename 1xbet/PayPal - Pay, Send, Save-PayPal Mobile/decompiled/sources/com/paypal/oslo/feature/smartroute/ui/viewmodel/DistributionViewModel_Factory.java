package com.paypal.oslo.feature.smartroute.ui.viewmodel;

/* loaded from: classes15.dex */
public final class DistributionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.ui.mapper.DistributionConfigurationToUiMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.manager.SmartRouteFeatureManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.ui.mvi.reducer.DistributionReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.DistributionUseCasesProvider> getHighSpeedVideoSizes;

    private DistributionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.ui.mvi.reducer.DistributionReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.DistributionUseCasesProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.ui.mapper.DistributionConfigurationToUiMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator> provider4, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.manager.SmartRouteFeatureManager> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.ui.mvi.reducer.DistributionReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.DistributionUseCasesProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.ui.mapper.DistributionConfigurationToUiMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator> provider4, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.manager.SmartRouteFeatureManager> provider5) {
        return new com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel newInstance(com.paypal.oslo.feature.smartroute.ui.mvi.reducer.DistributionReducer distributionReducer, com.paypal.oslo.feature.smartroute.domain.usecase.DistributionUseCasesProvider distributionUseCasesProvider, com.paypal.oslo.feature.smartroute.ui.mapper.DistributionConfigurationToUiMapper distributionConfigurationToUiMapper, com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator autoReloadFlowOrchestrator, com.paypal.oslo.feature.smartroute.manager.SmartRouteFeatureManager smartRouteFeatureManager) {
        return new com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel(distributionReducer, distributionUseCasesProvider, distributionConfigurationToUiMapper, autoReloadFlowOrchestrator, smartRouteFeatureManager);
    }
}
