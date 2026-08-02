package com.paypal.oslo.feature.activity.manager;

/* loaded from: classes10.dex */
public final class ActivityFeatureManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private ActivityFeatureManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.manager.ActivityFeatureManager get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.activity.manager.ActivityFeatureManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.activity.manager.ActivityFeatureManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.manager.ActivityFeatureManager newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.activity.manager.ActivityFeatureManager(featureGate);
    }
}
