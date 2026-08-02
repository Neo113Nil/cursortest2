package com.paypal.oslo.feature.pools.ui.createpool;

/* loaded from: classes13.dex */
public final class CreatePoolViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolReducer> getHighSpeedVideoSizes;

    private CreatePoolViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolReducer> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.pools.ui.createpool.CreatePoolReducer> provider3) {
        return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel newInstance(com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase createPoolUseCase, com.paypal.oslo.feature.pools.extensions.PoolUiErrorMapper poolUiErrorMapper, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolReducer createPoolReducer) {
        return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolViewModel(createPoolUseCase, poolUiErrorMapper, createPoolReducer);
    }
}
