package com.paypal.oslo.feature.contacts.data.repository;

/* loaded from: classes12.dex */
public final class CreateRecentSearchRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.data.repository.CreateRecentSearchRepositoryImpl> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private CreateRecentSearchRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.data.repository.CreateRecentSearchRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.contacts.data.repository.CreateRecentSearchRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2, dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> provider3) {
        return new com.paypal.oslo.feature.contacts.data.repository.CreateRecentSearchRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.contacts.data.repository.CreateRecentSearchRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper contactDomainModelMapper) {
        return new com.paypal.oslo.feature.contacts.data.repository.CreateRecentSearchRepositoryImpl(lazy, coroutineDispatcher, contactDomainModelMapper);
    }
}
