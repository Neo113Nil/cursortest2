package com.paypal.oslo.core.identity;

/* loaded from: classes10.dex */
public final class AccessTokenAuthenticator_Factory implements dagger.internal.Factory<com.paypal.oslo.core.identity.AccessTokenAuthenticator> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> getHighResolutionOutputSizeshNQ4ISI;

    private AccessTokenAuthenticator_Factory(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.identity.AccessTokenAuthenticator get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.identity.AccessTokenAuthenticator_Factory create(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.TokenProvider> provider) {
        return new com.paypal.oslo.core.identity.AccessTokenAuthenticator_Factory(provider);
    }

    public static com.paypal.oslo.core.identity.AccessTokenAuthenticator newInstance(com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider) {
        return new com.paypal.oslo.core.identity.AccessTokenAuthenticator(tokenProvider);
    }
}
