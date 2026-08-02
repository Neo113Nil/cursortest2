package com.paypal.oslo.feature.cryptocurrency.data.repository.receive;

/* loaded from: classes12.dex */
public final class CryptoReceiveRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private CryptoReceiveRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl(apolloClient);
    }
}
