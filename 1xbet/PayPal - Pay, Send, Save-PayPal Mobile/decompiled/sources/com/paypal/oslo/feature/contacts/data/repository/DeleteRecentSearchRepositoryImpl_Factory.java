package com.paypal.oslo.feature.contacts.data.repository;

/* loaded from: classes12.dex */
public final class DeleteRecentSearchRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private DeleteRecentSearchRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> provider3) {
        return new com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper contactDomainModelMapper) {
        return new com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchRepositoryImpl(lazy, coroutineDispatcher, contactDomainModelMapper);
    }
}
