package com.paypal.oslo.core.telemetry.vendors.pie;

/* loaded from: classes5.dex */
public final class PieModule_ProvidePieServiceFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.pie.PieService> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryServiceProvider> getHighSpeedVideoFpsRangesFor;

    private PieModule_ProvidePieServiceFactory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryServiceProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.pie.PieService get() {
        return providePieService(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.pie.PieModule_ProvidePieServiceFactory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryServiceProvider> provider) {
        return new com.paypal.oslo.core.telemetry.vendors.pie.PieModule_ProvidePieServiceFactory(provider);
    }

    public static com.paypal.oslo.core.telemetry.vendors.pie.PieService providePieService(com.paypal.oslo.core.telemetry.config.TelemetryServiceProvider telemetryServiceProvider) {
        return (com.paypal.oslo.core.telemetry.vendors.pie.PieService) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.pie.PieModule.INSTANCE.providePieService(telemetryServiceProvider));
    }
}
