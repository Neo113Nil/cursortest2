package com.paypal.oslo.core.telemetry.vendors.adobe;

/* loaded from: classes10.dex */
public final class AdobeIdentitiesManager_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRanges;

    private AdobeIdentitiesManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider> provider2) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager(appStorage, telemetryFeatureGateProvider);
    }
}
