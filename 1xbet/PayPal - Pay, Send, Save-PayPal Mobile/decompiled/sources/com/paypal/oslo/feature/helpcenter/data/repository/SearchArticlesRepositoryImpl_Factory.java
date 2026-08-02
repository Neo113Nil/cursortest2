package com.paypal.oslo.feature.helpcenter.data.repository;

/* loaded from: classes12.dex */
public final class SearchArticlesRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;

    private SearchArticlesRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl(apolloClient, coroutineDispatcher);
    }
}
