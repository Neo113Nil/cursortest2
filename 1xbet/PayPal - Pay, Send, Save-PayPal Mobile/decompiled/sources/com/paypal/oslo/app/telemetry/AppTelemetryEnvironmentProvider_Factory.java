package com.paypal.oslo.app.telemetry;

/* loaded from: classes10.dex */
public final class AppTelemetryEnvironmentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.telemetry.AppTelemetryEnvironmentProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> getHighSpeedVideoFpsRangesFor;

    private AppTelemetryEnvironmentProvider_Factory(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.telemetry.AppTelemetryEnvironmentProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.app.telemetry.AppTelemetryEnvironmentProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider) {
        return new com.paypal.oslo.app.telemetry.AppTelemetryEnvironmentProvider_Factory(provider);
    }

    public static com.paypal.oslo.app.telemetry.AppTelemetryEnvironmentProvider newInstance(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        return new com.paypal.oslo.app.telemetry.AppTelemetryEnvironmentProvider(environmentProvider);
    }
}
