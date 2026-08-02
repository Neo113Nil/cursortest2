package com.paypal.oslo.core.webview.domain.usecase;

/* loaded from: classes10.dex */
public final class ValidateURLUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.domain.provider.TrustedHostsProvider> getHighSpeedVideoSizes;

    private ValidateURLUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.webview.domain.provider.TrustedHostsProvider> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.webview.domain.provider.TrustedHostsProvider> provider) {
        return new com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase_Factory(provider);
    }

    public static com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase newInstance(com.paypal.oslo.core.webview.domain.provider.TrustedHostsProvider trustedHostsProvider) {
        return new com.paypal.oslo.core.webview.domain.usecase.ValidateURLUseCase(trustedHostsProvider);
    }
}
