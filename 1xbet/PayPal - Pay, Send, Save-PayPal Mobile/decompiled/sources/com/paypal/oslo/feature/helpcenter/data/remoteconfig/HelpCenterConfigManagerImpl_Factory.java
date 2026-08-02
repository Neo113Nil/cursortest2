package com.paypal.oslo.feature.helpcenter.data.remoteconfig;

/* loaded from: classes12.dex */
public final class HelpCenterConfigManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.data.remoteconfig.HelpCenterConfigManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighResolutionOutputSizeshNQ4ISI;

    private HelpCenterConfigManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.data.remoteconfig.HelpCenterConfigManagerImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.helpcenter.data.remoteconfig.HelpCenterConfigManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.helpcenter.data.remoteconfig.HelpCenterConfigManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.data.remoteconfig.HelpCenterConfigManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.helpcenter.data.remoteconfig.HelpCenterConfigManagerImpl(featureGate);
    }
}
