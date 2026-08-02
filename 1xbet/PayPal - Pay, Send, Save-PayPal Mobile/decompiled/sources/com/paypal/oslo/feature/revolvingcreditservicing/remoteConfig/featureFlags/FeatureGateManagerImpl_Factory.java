package com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags;

/* loaded from: classes14.dex */
public final class FeatureGateManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private FeatureGateManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManagerImpl(featureGate);
    }
}
