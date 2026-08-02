package com.paypal.oslo.feature.identity.sso;

/* loaded from: classes13.dex */
public final class IdentitySessionTransferImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> getHighSpeedVideoFpsRangesFor;

    private IdentitySessionTransferImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator> provider2, dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator> provider2, dagger.internal.Provider<com.paypal.oslo.core.identity.config.AuthConfigProvider> provider3) {
        return new com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl newInstance(com.paypal.oslo.feature.identity.sso.domain.usecase.TokenToCodeUseCase tokenToCodeUseCase, com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator pKCEGenerator, com.paypal.oslo.core.identity.config.AuthConfigProvider authConfigProvider) {
        return new com.paypal.oslo.feature.identity.sso.IdentitySessionTransferImpl(tokenToCodeUseCase, pKCEGenerator, authConfigProvider);
    }
}
