package com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions;

/* loaded from: classes12.dex */
public final class CryptoSubscriptionCapabilitiesRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private CryptoSubscriptionCapabilitiesRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl(apolloClient);
    }
}
