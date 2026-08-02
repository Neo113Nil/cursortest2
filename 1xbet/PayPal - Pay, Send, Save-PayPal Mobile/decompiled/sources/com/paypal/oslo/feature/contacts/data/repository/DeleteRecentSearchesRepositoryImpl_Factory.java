package com.paypal.oslo.feature.contacts.data.repository;

/* loaded from: classes12.dex */
public final class DeleteRecentSearchesRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private DeleteRecentSearchesRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> provider3) {
        return new com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper contactDomainModelMapper) {
        return new com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl(lazy, coroutineDispatcher, contactDomainModelMapper);
    }
}
