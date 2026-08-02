package com.paypal.oslo.core.telemetry.vendors.fpti;

/* loaded from: classes10.dex */
public final class FPTIAnalyticsHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIAnalyticsHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient> getHighSpeedVideoFpsRangesFor;

    private FPTIAnalyticsHandler_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> provider, dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIAnalyticsHandler get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor));
    }

    public static com.paypal.oslo.core.telemetry.vendors.fpti.FPTIAnalyticsHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> provider, dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient> provider2) {
        return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIAnalyticsHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.telemetry.vendors.fpti.FPTIAnalyticsHandler newInstance(com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver analyticsRegistryResolver, dagger.Lazy<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient> lazy) {
        return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIAnalyticsHandler(analyticsRegistryResolver, lazy);
    }
}
