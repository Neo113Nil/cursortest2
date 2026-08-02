package com.paypal.oslo.feature.pools.data.repository;

/* loaded from: classes13.dex */
public final class CreatePoolRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private CreatePoolRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighResolutionOutputSizeshNQ4ISI));
    }

    public static com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl(lazy);
    }
}
