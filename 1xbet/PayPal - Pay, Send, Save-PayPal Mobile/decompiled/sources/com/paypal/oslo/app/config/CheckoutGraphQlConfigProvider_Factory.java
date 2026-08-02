package com.paypal.oslo.app.config;

/* loaded from: classes10.dex */
public final class CheckoutGraphQlConfigProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.config.CheckoutGraphQlConfigProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> Camera2StreamConfigurationMap;

    private CheckoutGraphQlConfigProvider_Factory(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.config.CheckoutGraphQlConfigProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.app.config.CheckoutGraphQlConfigProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider) {
        return new com.paypal.oslo.app.config.CheckoutGraphQlConfigProvider_Factory(provider);
    }

    public static com.paypal.oslo.app.config.CheckoutGraphQlConfigProvider newInstance(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        return new com.paypal.oslo.app.config.CheckoutGraphQlConfigProvider(environmentProvider);
    }
}
