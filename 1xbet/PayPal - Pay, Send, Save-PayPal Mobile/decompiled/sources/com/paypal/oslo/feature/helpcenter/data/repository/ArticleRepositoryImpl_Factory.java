package com.paypal.oslo.feature.helpcenter.data.repository;

/* loaded from: classes12.dex */
public final class ArticleRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private ArticleRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl(apolloClient, coroutineDispatcher);
    }
}
