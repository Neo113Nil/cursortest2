package com.paypal.oslo.feature.directdeposit.manager;

/* loaded from: classes12.dex */
public final class DirectDepositFeatureManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> Camera2StreamConfigurationMap;

    private DirectDepositFeatureManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager(featureGate);
    }
}
