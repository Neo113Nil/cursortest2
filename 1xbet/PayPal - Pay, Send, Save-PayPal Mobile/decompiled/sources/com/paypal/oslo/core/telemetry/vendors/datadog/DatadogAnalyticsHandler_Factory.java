package com.paypal.oslo.core.telemetry.vendors.datadog;

/* loaded from: classes10.dex */
public final class DatadogAnalyticsHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAnalyticsHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> getHighSpeedVideoSizes;

    private DatadogAnalyticsHandler_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAnalyticsHandler get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAnalyticsHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> provider) {
        return new com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAnalyticsHandler_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAnalyticsHandler newInstance(com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver analyticsRegistryResolver) {
        return new com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAnalyticsHandler(analyticsRegistryResolver);
    }
}
