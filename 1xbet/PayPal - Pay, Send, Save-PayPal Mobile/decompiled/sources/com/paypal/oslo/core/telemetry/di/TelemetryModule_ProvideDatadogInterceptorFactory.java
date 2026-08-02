package com.paypal.oslo.core.telemetry.di;

/* loaded from: classes5.dex */
public final class TelemetryModule_ProvideDatadogInterceptorFactory implements dagger.internal.Factory<okhttp3.Interceptor> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentProvider> getHighSpeedVideoFpsRanges;

    private TelemetryModule_ProvideDatadogInterceptorFactory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final okhttp3.Interceptor get() {
        return provideDatadogInterceptor(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.telemetry.di.TelemetryModule_ProvideDatadogInterceptorFactory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> provider2) {
        return new com.paypal.oslo.core.telemetry.di.TelemetryModule_ProvideDatadogInterceptorFactory(provider, provider2);
    }

    public static okhttp3.Interceptor provideDatadogInterceptor(com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentProvider telemetryEnvironmentProvider, com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity) {
        return (okhttp3.Interceptor) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.di.TelemetryModule.INSTANCE.provideDatadogInterceptor(telemetryEnvironmentProvider, appIdentity));
    }
}
