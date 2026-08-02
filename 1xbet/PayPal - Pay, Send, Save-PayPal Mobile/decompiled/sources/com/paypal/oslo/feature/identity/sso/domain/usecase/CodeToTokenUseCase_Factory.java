package com.paypal.oslo.feature.identity.sso.domain.usecase;

/* loaded from: classes13.dex */
public final class CodeToTokenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.repository.CodeToTokenRepository> getHighSpeedVideoSizes;

    private CodeToTokenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.repository.CodeToTokenRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.repository.CodeToTokenRepository> provider) {
        return new com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase newInstance(com.paypal.oslo.feature.identity.sso.domain.repository.CodeToTokenRepository codeToTokenRepository) {
        return new com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase(codeToTokenRepository);
    }
}
