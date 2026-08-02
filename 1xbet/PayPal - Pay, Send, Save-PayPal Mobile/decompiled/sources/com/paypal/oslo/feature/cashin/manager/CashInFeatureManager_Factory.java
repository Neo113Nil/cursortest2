package com.paypal.oslo.feature.cashin.manager;

/* loaded from: classes11.dex */
public final class CashInFeatureManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.manager.CashInFeatureManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private CashInFeatureManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.manager.CashInFeatureManager get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cashin.manager.CashInFeatureManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.cashin.manager.CashInFeatureManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.manager.CashInFeatureManager newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.cashin.manager.CashInFeatureManager(featureGate);
    }
}
