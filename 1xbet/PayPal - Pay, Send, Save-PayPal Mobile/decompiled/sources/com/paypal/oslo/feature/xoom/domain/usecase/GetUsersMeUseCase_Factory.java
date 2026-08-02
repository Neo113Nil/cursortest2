package com.paypal.oslo.feature.xoom.domain.usecase;

/* loaded from: classes16.dex */
public final class GetUsersMeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.repository.XoomRepository> getHighSpeedVideoSizes;

    private GetUsersMeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.repository.XoomRepository> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.repository.XoomRepository> provider2) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase newInstance(com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase executeWithAuthRetryUseCase, com.paypal.oslo.feature.xoom.domain.repository.XoomRepository xoomRepository) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase(executeWithAuthRetryUseCase, xoomRepository);
    }
}
