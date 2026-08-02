package com.paypal.oslo.feature.balance.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideFetchAutoReloadConfigCallFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private RepositoryModule_ProvideFetchAutoReloadConfigCallFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall get() {
        return provideFetchAutoReloadConfigCall(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideFetchAutoReloadConfigCallFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideFetchAutoReloadConfigCallFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall provideFetchAutoReloadConfigCall(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.RepositoryModule.INSTANCE.provideFetchAutoReloadConfigCall(apolloClient));
    }
}
