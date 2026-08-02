package com.paypal.oslo.feature.wallet.common.config;

/* loaded from: classes15.dex */
public final class WalletFeatureManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;

    private WalletFeatureManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.common.config.WalletFeatureManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.common.config.WalletFeatureManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.wallet.common.config.WalletFeatureManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.common.config.WalletFeatureManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.wallet.common.config.WalletFeatureManagerImpl(featureGate);
    }
}
