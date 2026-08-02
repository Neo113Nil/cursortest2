package com.paypal.oslo.feature.smartroute.domain.usecase;

/* loaded from: classes15.dex */
public final class DistributionUseCasesProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.domain.usecase.DistributionUseCasesProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase> getHighSpeedVideoSizes;

    private DistributionUseCasesProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.domain.usecase.DistributionUseCasesProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.DistributionUseCasesProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase> provider4) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.DistributionUseCasesProvider_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.DistributionUseCasesProvider newInstance(com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase getDistributionConfigurationUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase saveDistributionConfigurationUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase updatePyusdOptInStatusUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.DeactivateAutoReloadUseCase deactivateAutoReloadUseCase) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.DistributionUseCasesProvider(getDistributionConfigurationUseCase, saveDistributionConfigurationUseCase, updatePyusdOptInStatusUseCase, deactivateAutoReloadUseCase);
    }
}
