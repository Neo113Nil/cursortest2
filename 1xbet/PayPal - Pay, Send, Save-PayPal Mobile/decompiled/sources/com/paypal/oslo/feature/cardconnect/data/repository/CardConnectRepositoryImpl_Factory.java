package com.paypal.oslo.feature.cardconnect.data.repository;

/* loaded from: classes11.dex */
public final class CardConnectRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cardconnect.data.repository.CardConnectRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private CardConnectRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cardconnect.data.repository.CardConnectRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap));
    }

    public static com.paypal.oslo.feature.cardconnect.data.repository.CardConnectRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.cardconnect.data.repository.CardConnectRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.cardconnect.data.repository.CardConnectRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.cardconnect.data.repository.CardConnectRepositoryImpl(lazy);
    }
}
