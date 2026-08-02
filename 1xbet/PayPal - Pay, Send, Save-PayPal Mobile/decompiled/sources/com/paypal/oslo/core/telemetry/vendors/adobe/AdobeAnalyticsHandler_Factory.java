package com.paypal.oslo.core.telemetry.vendors.adobe;

/* loaded from: classes10.dex */
public final class AdobeAnalyticsHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.adobe.AdobeAnalyticsHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> Camera2StreamConfigurationMap;

    private AdobeAnalyticsHandler_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeAnalyticsHandler get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobeAnalyticsHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver> provider) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeAnalyticsHandler_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobeAnalyticsHandler newInstance(com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver analyticsRegistryResolver) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeAnalyticsHandler(analyticsRegistryResolver);
    }
}
