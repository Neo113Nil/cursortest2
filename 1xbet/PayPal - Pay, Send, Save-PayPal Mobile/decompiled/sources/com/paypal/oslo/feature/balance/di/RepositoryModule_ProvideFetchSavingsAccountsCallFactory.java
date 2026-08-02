package com.paypal.oslo.feature.balance.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideFetchSavingsAccountsCallFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private RepositoryModule_ProvideFetchSavingsAccountsCallFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall get() {
        return provideFetchSavingsAccountsCall(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideFetchSavingsAccountsCallFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideFetchSavingsAccountsCallFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall provideFetchSavingsAccountsCall(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.RepositoryModule.INSTANCE.provideFetchSavingsAccountsCall(apolloClient));
    }
}
