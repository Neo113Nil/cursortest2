package com.paypal.oslo.feature.onboarding.mgm.domain;

/* loaded from: classes13.dex */
public final class MGMUrlProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> getHighResolutionOutputSizeshNQ4ISI;

    private MGMUrlProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider) {
        return new com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider newInstance(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        return new com.paypal.oslo.feature.onboarding.mgm.domain.MGMUrlProvider(webEnvironmentProvider);
    }
}
