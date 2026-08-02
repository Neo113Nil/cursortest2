package com.paypal.oslo.feature.bnplacquisition.config;

/* loaded from: classes11.dex */
public final class BnplAcquisitionConfigManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.config.BnplAcquisitionConfigManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager> getHighSpeedVideoFpsRanges;

    private BnplAcquisitionConfigManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.config.BnplAcquisitionConfigManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.BnplAcquisitionConfigManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.config.BnplAcquisitionConfigManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.BnplAcquisitionConfigManagerImpl newInstance(com.paypal.oslo.feature.bnplacquisition.remoteconfigs.featureflags.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.bnplacquisition.config.BnplAcquisitionConfigManagerImpl(featureGateManager);
    }
}
