package com.paypal.oslo.feature.pools.ui.poolslist;

/* loaded from: classes13.dex */
public final class PoolsListViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.usecase.GetPoolsPaginatedUseCase> getHighSpeedVideoFpsRangesFor;

    private PoolsListViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.usecase.GetPoolsPaginatedUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.usecase.GetPoolsPaginatedUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.pools.ui.poolslist.PoolsListReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper> provider3) {
        return new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel newInstance(com.paypal.oslo.feature.pools.domain.usecase.GetPoolsPaginatedUseCase getPoolsPaginatedUseCase, com.paypal.oslo.feature.pools.ui.poolslist.PoolsListReducer poolsListReducer, com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper poolUiErrorMapper) {
        return new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListViewModel(getPoolsPaginatedUseCase, poolsListReducer, poolUiErrorMapper);
    }
}
