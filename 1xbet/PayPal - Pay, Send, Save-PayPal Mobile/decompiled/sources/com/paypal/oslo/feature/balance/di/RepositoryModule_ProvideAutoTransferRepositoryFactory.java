package com.paypal.oslo.feature.balance.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideAutoTransferRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private RepositoryModule_ProvideAutoTransferRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository get() {
        return provideAutoTransferRepository(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideAutoTransferRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.balance.di.RepositoryModule_ProvideAutoTransferRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository provideAutoTransferRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.RepositoryModule.INSTANCE.provideAutoTransferRepository(apolloClient));
    }
}
