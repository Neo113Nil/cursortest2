package com.paypal.oslo.feature.identity.sso;

/* loaded from: classes13.dex */
public final class CodeToTokenExchangeImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase> getHighSpeedVideoSizes;

    private CodeToTokenExchangeImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> provider2) {
        return new com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl newInstance(com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase codeToTokenUseCase, com.paypal.oslo.core.identity.config.AuthConfigProvider authConfigProvider) {
        return new com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl(codeToTokenUseCase, authConfigProvider);
    }
}
