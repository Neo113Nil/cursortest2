package com.paypal.oslo.feature.identity.clienttoken.domain.usecase;

/* loaded from: classes12.dex */
public final class GetClientTokenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.clienttoken.domain.repository.ClientTokenRepository> getHighSpeedVideoFpsRanges;

    private GetClientTokenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.clienttoken.domain.repository.ClientTokenRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.clienttoken.domain.repository.ClientTokenRepository> provider) {
        return new com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase newInstance(com.paypal.oslo.feature.identity.clienttoken.domain.repository.ClientTokenRepository clientTokenRepository) {
        return new com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase(clientTokenRepository);
    }
}
