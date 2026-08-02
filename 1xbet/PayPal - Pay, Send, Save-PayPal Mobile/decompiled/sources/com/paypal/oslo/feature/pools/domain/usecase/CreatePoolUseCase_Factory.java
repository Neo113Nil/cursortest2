package com.paypal.oslo.feature.pools.domain.usecase;

/* loaded from: classes13.dex */
public final class CreatePoolUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.repository.CreatePoolRepository> Camera2StreamConfigurationMap;

    private CreatePoolUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.repository.CreatePoolRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.pools.domain.repository.CreatePoolRepository> provider) {
        return new com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase newInstance(com.paypal.oslo.feature.pools.domain.repository.CreatePoolRepository createPoolRepository) {
        return new com.paypal.oslo.feature.pools.domain.usecase.CreatePoolUseCase(createPoolRepository);
    }
}
