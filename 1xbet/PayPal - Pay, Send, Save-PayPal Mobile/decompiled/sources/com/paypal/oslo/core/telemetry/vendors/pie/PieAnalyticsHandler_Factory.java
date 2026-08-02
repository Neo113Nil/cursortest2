package com.paypal.oslo.core.telemetry.vendors.pie;

/* loaded from: classes10.dex */
public final class PieAnalyticsHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.pie.PieAnalyticsHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.pie.PieClient> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> getHighSpeedVideoSizes;

    private PieAnalyticsHandler_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> provider, dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.pie.PieClient> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.pie.PieAnalyticsHandler get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor));
    }

    public static com.paypal.oslo.core.telemetry.vendors.pie.PieAnalyticsHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> provider, dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.pie.PieClient> provider2) {
        return new com.paypal.oslo.core.telemetry.vendors.pie.PieAnalyticsHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.telemetry.vendors.pie.PieAnalyticsHandler newInstance(com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver analyticsRegistryResolver, dagger.Lazy<com.paypal.oslo.core.telemetry.vendors.pie.PieClient> lazy) {
        return new com.paypal.oslo.core.telemetry.vendors.pie.PieAnalyticsHandler(analyticsRegistryResolver, lazy);
    }
}
