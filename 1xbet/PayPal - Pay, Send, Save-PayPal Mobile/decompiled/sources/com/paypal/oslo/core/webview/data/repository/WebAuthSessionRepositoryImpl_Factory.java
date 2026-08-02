package com.paypal.oslo.core.webview.data.repository;

/* loaded from: classes10.dex */
public final class WebAuthSessionRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.domain.IdentitySessionTransfer> getHighSpeedVideoSizes;

    private WebAuthSessionRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.IdentitySessionTransfer> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.IdentitySessionTransfer> provider) {
        return new com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl newInstance(com.paypal.oslo.core.identity.domain.IdentitySessionTransfer identitySessionTransfer) {
        return new com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl(identitySessionTransfer);
    }
}
