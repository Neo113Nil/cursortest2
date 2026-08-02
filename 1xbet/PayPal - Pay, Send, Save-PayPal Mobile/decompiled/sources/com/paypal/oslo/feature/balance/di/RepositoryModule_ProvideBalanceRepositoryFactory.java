package com.paypal.oslo.feature.balance.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideBalanceRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private RepositoryModule_ProvideBalanceRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository get() {
        return provideBalanceRepository(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideBalanceRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideBalanceRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository provideBalanceRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.RepositoryModule.INSTANCE.provideBalanceRepository(apolloClient));
    }
}
