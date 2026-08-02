package com.paypal.oslo.feature.smartroute.manager;

/* loaded from: classes15.dex */
public final class SmartRouteFeatureManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.manager.SmartRouteFeatureManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;

    private SmartRouteFeatureManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.manager.SmartRouteFeatureManager get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.smartroute.manager.SmartRouteFeatureManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.smartroute.manager.SmartRouteFeatureManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.smartroute.manager.SmartRouteFeatureManager newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.smartroute.manager.SmartRouteFeatureManager(featureGate);
    }
}
