package com.paypal.oslo.feature.balance.manager;

/* loaded from: classes11.dex */
public final class BalanceFeatureManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.manager.BalanceFeatureManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private BalanceFeatureManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.manager.BalanceFeatureManager get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.manager.BalanceFeatureManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.balance.manager.BalanceFeatureManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.manager.BalanceFeatureManager newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.balance.manager.BalanceFeatureManager(featureGate);
    }
}
