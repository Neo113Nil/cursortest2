package com.paypal.oslo.feature.businesscustomers.common;

/* loaded from: classes11.dex */
public final class BusinessCustomerFeatureGateManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesscustomers.common.BusinessCustomerFeatureGateManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private BusinessCustomerFeatureGateManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesscustomers.common.BusinessCustomerFeatureGateManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businesscustomers.common.BusinessCustomerFeatureGateManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.businesscustomers.common.BusinessCustomerFeatureGateManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesscustomers.common.BusinessCustomerFeatureGateManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.businesscustomers.common.BusinessCustomerFeatureGateManagerImpl(featureGate);
    }
}
