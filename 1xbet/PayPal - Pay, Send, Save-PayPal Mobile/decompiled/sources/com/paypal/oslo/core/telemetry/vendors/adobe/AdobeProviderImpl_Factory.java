package com.paypal.oslo.core.telemetry.vendors.adobe;

/* loaded from: classes10.dex */
public final class AdobeProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> getHighSpeedVideoFpsRangesFor;

    private AdobeProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProviderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> provider) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProviderImpl newInstance(com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeProviderImpl(telemetryFeatureGateProvider);
    }
}
