package com.paypal.oslo.feature.contacts.data.repository;

/* loaded from: classes12.dex */
public final class RecentSearchesRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private RecentSearchesRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoSizes), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> provider3) {
        return new com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper contactDomainModelMapper) {
        return new com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl(lazy, coroutineDispatcher, contactDomainModelMapper);
    }
}
