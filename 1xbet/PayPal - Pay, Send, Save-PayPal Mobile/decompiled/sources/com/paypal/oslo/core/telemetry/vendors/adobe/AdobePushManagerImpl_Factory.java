package com.paypal.oslo.core.telemetry.vendors.adobe;

/* loaded from: classes10.dex */
public final class AdobePushManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> getHighSpeedVideoSizes;

    private AdobePushManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> provider) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManagerImpl newInstance(com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManagerImpl(telemetryFeatureGateProvider);
    }
}
