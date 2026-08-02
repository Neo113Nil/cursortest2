package com.paypal.oslo.feature.identity.sso.domain.usecase;

/* loaded from: classes13.dex */
public final class TokenToCodeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.repository.TokenToCodeRepository> getHighSpeedVideoSizes;

    private TokenToCodeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.repository.TokenToCodeRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.repository.TokenToCodeRepository> provider) {
        return new com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase newInstance(com.paypal.oslo.feature.identity.sso.domain.repository.TokenToCodeRepository tokenToCodeRepository) {
        return new com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase(tokenToCodeRepository);
    }
}
