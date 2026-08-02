package com.paypal.oslo.feature.helpcenter.data.repository;

/* loaded from: classes12.dex */
public final class IpsArticlesRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private IpsArticlesRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.IpsArticlesRepositoryImpl(apolloClient, coroutineDispatcher);
    }
}
