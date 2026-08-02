package com.paypal.oslo.feature.balance.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideFetchDepositOptionsCallFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private RepositoryModule_ProvideFetchDepositOptionsCallFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall get() {
        return provideFetchDepositOptionsCall(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideFetchDepositOptionsCallFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideFetchDepositOptionsCallFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall provideFetchDepositOptionsCall(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.RepositoryModule.INSTANCE.provideFetchDepositOptionsCall(apolloClient));
    }
}
