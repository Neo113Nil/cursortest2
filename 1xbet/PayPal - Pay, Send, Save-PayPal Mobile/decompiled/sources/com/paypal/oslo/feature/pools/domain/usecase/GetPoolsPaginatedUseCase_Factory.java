package com.paypal.oslo.feature.pools.domain.usecase;

/* loaded from: classes13.dex */
public final class GetPoolsPaginatedUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pools.domain.usecase.GetPoolsPaginatedUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.repository.PoolsRepository> getHighSpeedVideoFpsRanges;

    private GetPoolsPaginatedUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.repository.PoolsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pools.domain.usecase.GetPoolsPaginatedUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.pools.domain.usecase.GetPoolsPaginatedUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.repository.PoolsRepository> provider) {
        return new com.paypal.oslo.feature.pools.domain.usecase.GetPoolsPaginatedUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.pools.domain.usecase.GetPoolsPaginatedUseCase newInstance(com.paypal.oslo.feature.pools.domain.repository.PoolsRepository poolsRepository) {
        return new com.paypal.oslo.feature.pools.domain.usecase.GetPoolsPaginatedUseCase(poolsRepository);
    }
}
