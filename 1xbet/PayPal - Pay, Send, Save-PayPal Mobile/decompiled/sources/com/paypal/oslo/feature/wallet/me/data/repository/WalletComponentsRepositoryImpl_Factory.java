package com.paypal.oslo.feature.wallet.me.data.repository;

/* loaded from: classes16.dex */
public final class WalletComponentsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> getHighSpeedVideoFpsRangesFor;

    private WalletComponentsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider2) {
        return new com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        return new com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl(apolloClient, walletFeatureManager);
    }
}
