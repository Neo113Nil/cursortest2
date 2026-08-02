package com.paypal.oslo.feature.merchantbanking.data.remoteconfig;

/* loaded from: classes13.dex */
public final class MerchantBankingFeatureGateImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> Camera2StreamConfigurationMap;

    private MerchantBankingFeatureGateImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.merchantbanking.data.remoteconfig.MerchantBankingFeatureGateImpl(featureGate);
    }
}
