package com.paypal.oslo.feature.activity.di.module;

/* loaded from: classes10.dex */
public final class RepositoryModule_ProvideActivityLedgerRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> getHighResolutionOutputSizeshNQ4ISI;

    private RepositoryModule_ProvideActivityLedgerRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository get() {
        return provideActivityLedgerRepository(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.activity.di.module.RepositoryModule_ProvideActivityLedgerRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2) {
        return new com.paypal.oslo.feature.activity.di.module.RepositoryModule_ProvideActivityLedgerRepositoryFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository provideActivityLedgerRepository(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper) {
        return (com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.activity.di.module.RepositoryModule.INSTANCE.provideActivityLedgerRepository(apolloClient, iActivityErrorMapper));
    }
}
