package com.paypal.oslo.feature.xoom.domain.usecase;

/* loaded from: classes16.dex */
public final class ValidateInactiveUserUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.repository.XoomRepository> getHighSpeedVideoSizes;

    private ValidateInactiveUserUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.repository.XoomRepository> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.repository.XoomRepository> provider2) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase newInstance(com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase executeWithAuthRetryUseCase, com.paypal.oslo.feature.xoom.domain.repository.XoomRepository xoomRepository) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase(executeWithAuthRetryUseCase, xoomRepository);
    }
}
