package com.paypal.oslo.feature.xoom.domain.usecase;

/* loaded from: classes16.dex */
public final class ExecuteWithAuthRetryUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> getHighSpeedVideoFpsRangesFor;

    private ExecuteWithAuthRetryUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase newInstance(com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider) {
        return new com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase(tokenProvider);
    }
}
