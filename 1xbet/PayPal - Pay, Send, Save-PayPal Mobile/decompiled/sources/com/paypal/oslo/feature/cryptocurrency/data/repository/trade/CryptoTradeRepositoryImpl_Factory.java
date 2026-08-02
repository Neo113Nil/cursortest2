package com.paypal.oslo.feature.cryptocurrency.data.repository.trade;

/* loaded from: classes12.dex */
public final class CryptoTradeRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private CryptoTradeRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl(apolloClient);
    }
}
