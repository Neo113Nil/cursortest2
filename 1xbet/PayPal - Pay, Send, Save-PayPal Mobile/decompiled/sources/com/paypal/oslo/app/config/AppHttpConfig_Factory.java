package com.paypal.oslo.app.config;

/* loaded from: classes10.dex */
public final class AppHttpConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.app.config.AppHttpConfig> {
    private final dagger.internal.Provider<java.util.List<okhttp3.Interceptor>> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.app.config.SSLConfig> getHighSpeedVideoFpsRanges;

    private AppHttpConfig_Factory(dagger.internal.Provider<com.paypal.oslo.app.config.SSLConfig> provider, dagger.internal.Provider<java.util.List<okhttp3.Interceptor>> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.config.AppHttpConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.config.AppHttpConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.app.config.SSLConfig> provider, dagger.internal.Provider<java.util.List<okhttp3.Interceptor>> provider2) {
        return new com.paypal.oslo.app.config.AppHttpConfig_Factory(provider, provider2);
    }

    public static com.paypal.oslo.app.config.AppHttpConfig newInstance(com.paypal.oslo.app.config.SSLConfig sSLConfig, java.util.List<okhttp3.Interceptor> list) {
        return new com.paypal.oslo.app.config.AppHttpConfig(sSLConfig, list);
    }
}
