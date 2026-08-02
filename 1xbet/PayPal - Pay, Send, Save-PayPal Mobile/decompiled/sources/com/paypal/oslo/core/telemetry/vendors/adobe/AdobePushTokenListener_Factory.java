package com.paypal.oslo.core.telemetry.vendors.adobe;

/* loaded from: classes10.dex */
public final class AdobePushTokenListener_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushTokenListener> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> getHighSpeedVideoSizes;

    private AdobePushTokenListener_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushTokenListener get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushTokenListener_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> provider) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushTokenListener_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushTokenListener newInstance(com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushTokenListener(telemetryFeatureGateProvider);
    }
}
