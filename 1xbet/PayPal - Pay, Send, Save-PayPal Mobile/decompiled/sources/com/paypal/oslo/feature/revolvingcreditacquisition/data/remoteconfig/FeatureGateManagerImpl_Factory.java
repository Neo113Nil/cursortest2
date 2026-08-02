package com.paypal.oslo.feature.revolvingcreditacquisition.data.remoteconfig;

/* loaded from: classes14.dex */
public final class FeatureGateManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditacquisition.data.remoteconfig.FeatureGateManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private FeatureGateManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditacquisition.data.remoteconfig.FeatureGateManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.data.remoteconfig.FeatureGateManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.data.remoteconfig.FeatureGateManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.data.remoteconfig.FeatureGateManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.data.remoteconfig.FeatureGateManagerImpl(featureGate);
    }
}
