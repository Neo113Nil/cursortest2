package com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags;

/* loaded from: classes11.dex */
public final class FeatureGateManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.FeatureGateManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.api.config.BnplAcquisitionConfigManager> getHighSpeedVideoSizes;

    private FeatureGateManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.api.config.BnplAcquisitionConfigManager> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.FeatureGateManager get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.FeatureGateManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.api.config.BnplAcquisitionConfigManager> provider2) {
        return new com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.FeatureGateManager_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.FeatureGateManager newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplacquisition.api.config.BnplAcquisitionConfigManager bnplAcquisitionConfigManager) {
        return new com.paypal.oslo.feature.bnplservicing.remoteconfigs.featureflags.FeatureGateManager(featureGate, bnplAcquisitionConfigManager);
    }
}
