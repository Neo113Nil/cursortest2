package com.paypal.oslo.app.telemetry;

/* loaded from: classes10.dex */
public final class AppTelemetryFeatureGateProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.telemetry.AppTelemetryFeatureGateProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private AppTelemetryFeatureGateProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.telemetry.AppTelemetryFeatureGateProvider get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.app.telemetry.AppTelemetryFeatureGateProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.app.telemetry.AppTelemetryFeatureGateProvider_Factory(provider);
    }

    public static com.paypal.oslo.app.telemetry.AppTelemetryFeatureGateProvider newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.app.telemetry.AppTelemetryFeatureGateProvider(featureGate);
    }
}
