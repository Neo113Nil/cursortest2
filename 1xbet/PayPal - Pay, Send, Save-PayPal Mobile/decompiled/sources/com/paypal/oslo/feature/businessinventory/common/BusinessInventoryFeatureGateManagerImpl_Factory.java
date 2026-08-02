package com.paypal.oslo.feature.businessinventory.common;

/* loaded from: classes11.dex */
public final class BusinessInventoryFeatureGateManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private BusinessInventoryFeatureGateManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl(featureGate);
    }
}
