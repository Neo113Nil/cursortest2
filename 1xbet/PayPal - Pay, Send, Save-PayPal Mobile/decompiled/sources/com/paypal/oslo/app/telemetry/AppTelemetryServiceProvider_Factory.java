package com.paypal.oslo.app.telemetry;

/* loaded from: classes10.dex */
public final class AppTelemetryServiceProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.telemetry.AppTelemetryServiceProvider> {
    private final dagger.internal.Provider<retrofit2.Retrofit> getHighSpeedVideoFpsRangesFor;

    private AppTelemetryServiceProvider_Factory(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.telemetry.AppTelemetryServiceProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.app.telemetry.AppTelemetryServiceProvider_Factory create(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        return new com.paypal.oslo.app.telemetry.AppTelemetryServiceProvider_Factory(provider);
    }

    public static com.paypal.oslo.app.telemetry.AppTelemetryServiceProvider newInstance(retrofit2.Retrofit retrofit) {
        return new com.paypal.oslo.app.telemetry.AppTelemetryServiceProvider(retrofit);
    }
}
