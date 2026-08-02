package com.paypal.oslo.feature.businesshome.common.featuregate;

/* loaded from: classes11.dex */
public final class BusinessHomeFeatureGatesManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighResolutionOutputSizeshNQ4ISI;

    private BusinessHomeFeatureGatesManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager(featureGate);
    }
}
