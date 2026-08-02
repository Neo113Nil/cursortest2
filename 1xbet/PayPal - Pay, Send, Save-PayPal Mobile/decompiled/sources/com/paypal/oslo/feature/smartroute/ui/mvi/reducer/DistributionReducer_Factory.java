package com.paypal.oslo.feature.smartroute.ui.mvi.reducer;

/* loaded from: classes15.dex */
public final class DistributionReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.ui.mvi.reducer.DistributionReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.ProcessSliderChangeUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.CalculateSourcePercentageUseCase> getHighSpeedVideoFpsRanges;

    private DistributionReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.ProcessSliderChangeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.CalculateSourcePercentageUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.ui.mvi.reducer.DistributionReducer get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.smartroute.ui.mvi.reducer.DistributionReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.ProcessSliderChangeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.usecase.CalculateSourcePercentageUseCase> provider2) {
        return new com.paypal.oslo.feature.smartroute.ui.mvi.reducer.DistributionReducer_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.smartroute.ui.mvi.reducer.DistributionReducer newInstance(com.paypal.oslo.feature.smartroute.domain.usecase.ProcessSliderChangeUseCase processSliderChangeUseCase, com.paypal.oslo.feature.smartroute.domain.usecase.CalculateSourcePercentageUseCase calculateSourcePercentageUseCase) {
        return new com.paypal.oslo.feature.smartroute.ui.mvi.reducer.DistributionReducer(processSliderChangeUseCase, calculateSourcePercentageUseCase);
    }
}
