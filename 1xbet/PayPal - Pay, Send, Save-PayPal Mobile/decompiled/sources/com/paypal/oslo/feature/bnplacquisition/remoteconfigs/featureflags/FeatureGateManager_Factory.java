package com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags;

/* loaded from: classes11.dex */
public final class FeatureGateManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private FeatureGateManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager(featureGate);
    }
}
