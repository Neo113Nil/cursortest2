package com.paypal.oslo.feature.businessprofile.common.featuregate;

/* loaded from: classes11.dex */
public final class BusinessProfileFeatureGatesManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private BusinessProfileFeatureGatesManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl(featureGate);
    }
}
