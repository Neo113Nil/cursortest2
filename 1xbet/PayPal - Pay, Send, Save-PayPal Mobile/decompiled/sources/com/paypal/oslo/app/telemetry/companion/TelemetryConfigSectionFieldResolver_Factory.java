package com.paypal.oslo.app.telemetry.companion;

/* loaded from: classes10.dex */
public final class TelemetryConfigSectionFieldResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManager> Camera2StreamConfigurationMap;

    private TelemetryConfigSectionFieldResolver_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManager> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManager> provider) {
        return new com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver_Factory(provider);
    }

    public static com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver newInstance(com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManager adobeEnvironmentManager) {
        return new com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionFieldResolver(adobeEnvironmentManager);
    }
}
