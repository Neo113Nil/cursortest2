package com.paypal.oslo.feature.pools.data.repository;

/* loaded from: classes13.dex */
public final class PoolsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRanges;

    private PoolsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.pools.data.repository.PoolsRepositoryImpl(lazy, coroutineDispatcher);
    }
}
