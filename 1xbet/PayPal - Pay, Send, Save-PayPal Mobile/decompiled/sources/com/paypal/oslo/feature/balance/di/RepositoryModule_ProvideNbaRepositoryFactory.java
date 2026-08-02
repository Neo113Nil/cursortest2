package com.paypal.oslo.feature.balance.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideNbaRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private RepositoryModule_ProvideNbaRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository get() {
        return provideNbaRepository(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideNbaRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideNbaRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository provideNbaRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.balance.domain.repository.nba.NbaRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.RepositoryModule.INSTANCE.provideNbaRepository(apolloClient));
    }
}
