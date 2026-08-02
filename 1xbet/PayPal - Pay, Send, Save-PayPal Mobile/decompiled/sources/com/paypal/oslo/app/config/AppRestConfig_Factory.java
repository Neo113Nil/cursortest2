package com.paypal.oslo.app.config;

/* loaded from: classes10.dex */
public final class AppRestConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.app.config.AppRestConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> getHighSpeedVideoSizes;

    private AppRestConfig_Factory(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.config.AppRestConfig get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.app.config.AppRestConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider) {
        return new com.paypal.oslo.app.config.AppRestConfig_Factory(provider);
    }

    public static com.paypal.oslo.app.config.AppRestConfig newInstance(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        return new com.paypal.oslo.app.config.AppRestConfig(environmentProvider);
    }
}
