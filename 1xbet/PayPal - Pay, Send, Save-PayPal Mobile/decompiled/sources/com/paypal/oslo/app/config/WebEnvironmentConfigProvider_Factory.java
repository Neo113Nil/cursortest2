package com.paypal.oslo.app.config;

/* loaded from: classes10.dex */
public final class WebEnvironmentConfigProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.config.WebEnvironmentConfigProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> getHighResolutionOutputSizeshNQ4ISI;

    private WebEnvironmentConfigProvider_Factory(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.config.WebEnvironmentConfigProvider get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.config.WebEnvironmentConfigProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider) {
        return new com.paypal.oslo.app.config.WebEnvironmentConfigProvider_Factory(provider);
    }

    public static com.paypal.oslo.app.config.WebEnvironmentConfigProvider newInstance(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        return new com.paypal.oslo.app.config.WebEnvironmentConfigProvider(environmentProvider);
    }
}
