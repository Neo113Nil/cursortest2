package com.paypal.oslo.feature.pools.domain.usecase;

/* loaded from: classes13.dex */
public final class GetPoolDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pools.domain.usecase.GetPoolDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.repository.PoolDetailsRepository> getHighSpeedVideoFpsRangesFor;

    private GetPoolDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.repository.PoolDetailsRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pools.domain.usecase.GetPoolDetailsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.pools.domain.usecase.GetPoolDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.repository.PoolDetailsRepository> provider) {
        return new com.paypal.oslo.feature.pools.domain.usecase.GetPoolDetailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.pools.domain.usecase.GetPoolDetailsUseCase newInstance(com.paypal.oslo.feature.pools.domain.repository.PoolDetailsRepository poolDetailsRepository) {
        return new com.paypal.oslo.feature.pools.domain.usecase.GetPoolDetailsUseCase(poolDetailsRepository);
    }
}
