package com.paypal.oslo.feature.smartroute.domain.usecase;

/* loaded from: classes15.dex */
public final class AutoReloadFlowOrchestrator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase> getHighSpeedVideoSizes;

    private AutoReloadFlowOrchestrator_Factory(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase> provider4) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator newInstance(com.paypal.oslo.feature.smartroute.domain.usecase.GetAutoReloadSetupDetailsUseCase getAutoReloadSetupDetailsUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.SetupAutoReloadUseCase setupAutoReloadUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase deactivateAutoReloadUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase saveDistributionConfigurationUseCase) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator(getAutoReloadSetupDetailsUseCase, setupAutoReloadUseCase, deactivateAutoReloadUseCase, saveDistributionConfigurationUseCase);
    }
}
