package com.paypal.oslo.feature.pools.data.repository;

/* loaded from: classes13.dex */
public final class PoolDetailsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private PoolDetailsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighResolutionOutputSizeshNQ4ISI));
    }

    public static com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl(lazy);
    }
}
