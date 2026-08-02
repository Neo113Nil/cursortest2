package com.paypal.oslo.feature.p2p.data.remoteconfig;

/* loaded from: classes13.dex */
public final class P2pFeatureGateManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGateManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private P2pFeatureGateManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGateManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGateManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGateManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGateManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.p2p.data.remoteconfig.P2pFeatureGateManagerImpl(featureGate);
    }
}
