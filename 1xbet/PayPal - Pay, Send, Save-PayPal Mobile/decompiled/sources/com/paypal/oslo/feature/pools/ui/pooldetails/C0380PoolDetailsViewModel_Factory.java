package com.paypal.oslo.feature.pools.ui.pooldetails;

/* renamed from: com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C0380PoolDetailsViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.usecase.GetPoolDetailsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsReducer> getHighSpeedVideoFpsRanges;

    private C0380PoolDetailsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.usecase.GetPoolDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsReducer> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    public final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel get(com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination poolDetailsDestination) {
        return newInstance(poolDetailsDestination, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.pools.ui.pooldetails.C0380PoolDetailsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.usecase.GetPoolDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsReducer> provider3) {
        return new com.paypal.oslo.feature.pools.ui.pooldetails.C0380PoolDetailsViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel newInstance(com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination poolDetailsDestination, com.paypal.oslo.feature.pools.domain.usecase.GetPoolDetailsUseCase getPoolDetailsUseCase, com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper poolUiErrorMapper, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsReducer poolDetailsReducer) {
        return new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel(poolDetailsDestination, getPoolDetailsUseCase, poolUiErrorMapper, poolDetailsReducer);
    }
}
