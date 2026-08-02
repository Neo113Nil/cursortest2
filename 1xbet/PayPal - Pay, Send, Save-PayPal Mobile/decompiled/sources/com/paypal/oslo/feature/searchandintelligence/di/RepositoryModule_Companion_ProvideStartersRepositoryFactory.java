package com.paypal.oslo.feature.searchandintelligence.di;

/* loaded from: classes14.dex */
public final class RepositoryModule_Companion_ProvideStartersRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private RepositoryModule_Companion_ProvideStartersRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository get() {
        return provideStartersRepository(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.di.RepositoryModule_Companion_ProvideStartersRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2) {
        return new com.paypal.oslo.feature.searchandintelligence.di.RepositoryModule_Companion_ProvideStartersRepositoryFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository provideStartersRepository(com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager searchAndIntelligenceConfigManager, com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.searchandintelligence.di.RepositoryModule.INSTANCE.provideStartersRepository(searchAndIntelligenceConfigManager, apolloClient));
    }
}
