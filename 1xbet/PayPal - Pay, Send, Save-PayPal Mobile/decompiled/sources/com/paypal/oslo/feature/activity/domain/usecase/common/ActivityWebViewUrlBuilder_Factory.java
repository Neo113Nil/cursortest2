package com.paypal.oslo.feature.activity.domain.usecase.common;

/* loaded from: classes10.dex */
public final class ActivityWebViewUrlBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityWebViewUrlBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> getHighResolutionOutputSizeshNQ4ISI;

    private ActivityWebViewUrlBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.usecase.common.ActivityWebViewUrlBuilder get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.common.ActivityWebViewUrlBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.core.webview.config.WebEnvironmentProvider> provider) {
        return new com.paypal.oslo.feature.activity.domain.usecase.common.ActivityWebViewUrlBuilder_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.common.ActivityWebViewUrlBuilder newInstance(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        return new com.paypal.oslo.feature.activity.domain.usecase.common.ActivityWebViewUrlBuilder(webEnvironmentProvider);
    }
}
