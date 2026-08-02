package com.paypal.oslo.feature.qrc.featureflags;

/* loaded from: classes14.dex */
public final class QrcFeatureGateConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGateConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;

    private QrcFeatureGateConfig_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGateConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGateConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGateConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGateConfig newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.qrc.featureflags.QrcFeatureGateConfig(featureGate);
    }
}
