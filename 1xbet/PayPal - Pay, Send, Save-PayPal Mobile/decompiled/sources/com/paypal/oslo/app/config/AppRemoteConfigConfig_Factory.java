package com.paypal.oslo.app.config;

/* loaded from: classes10.dex */
public final class AppRemoteConfigConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.app.config.AppRemoteConfigConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> getHighSpeedVideoFpsRangesFor;

    private AppRemoteConfigConfig_Factory(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.config.AppRemoteConfigConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.app.config.AppRemoteConfigConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider) {
        return new com.paypal.oslo.app.config.AppRemoteConfigConfig_Factory(provider);
    }

    public static com.paypal.oslo.app.config.AppRemoteConfigConfig newInstance(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        return new com.paypal.oslo.app.config.AppRemoteConfigConfig(environmentProvider);
    }
}
