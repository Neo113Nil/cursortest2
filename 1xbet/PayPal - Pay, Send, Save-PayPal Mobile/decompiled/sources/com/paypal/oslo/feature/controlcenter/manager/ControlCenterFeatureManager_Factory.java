package com.paypal.oslo.feature.controlcenter.manager;

/* loaded from: classes12.dex */
public final class ControlCenterFeatureManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.controlcenter.manager.ControlCenterFeatureManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> Camera2StreamConfigurationMap;

    private ControlCenterFeatureManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.controlcenter.manager.ControlCenterFeatureManager get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.controlcenter.manager.ControlCenterFeatureManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.controlcenter.manager.ControlCenterFeatureManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.controlcenter.manager.ControlCenterFeatureManager newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.controlcenter.manager.ControlCenterFeatureManager(featureGate);
    }
}
