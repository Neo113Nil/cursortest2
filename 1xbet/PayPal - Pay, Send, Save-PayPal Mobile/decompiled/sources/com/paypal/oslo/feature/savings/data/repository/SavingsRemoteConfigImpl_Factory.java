package com.paypal.oslo.feature.savings.data.repository;

/* loaded from: classes14.dex */
public final class SavingsRemoteConfigImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.data.repository.SavingsRemoteConfigImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> Camera2StreamConfigurationMap;

    private SavingsRemoteConfigImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.data.repository.SavingsRemoteConfigImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.savings.data.repository.SavingsRemoteConfigImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.savings.data.repository.SavingsRemoteConfigImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.data.repository.SavingsRemoteConfigImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.savings.data.repository.SavingsRemoteConfigImpl(featureGate);
    }
}
