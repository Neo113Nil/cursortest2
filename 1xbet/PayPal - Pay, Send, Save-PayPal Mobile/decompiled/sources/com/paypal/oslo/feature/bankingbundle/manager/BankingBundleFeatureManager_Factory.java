package com.paypal.oslo.feature.bankingbundle.manager;

/* loaded from: classes11.dex */
public final class BankingBundleFeatureManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;

    private BankingBundleFeatureManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager(featureGate);
    }
}
