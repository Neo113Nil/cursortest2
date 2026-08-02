package com.paypal.oslo.feature.qrc.di;

/* loaded from: classes14.dex */
public final class RepositoryModule_ProvideSessionRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.repository.SessionRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private RepositoryModule_ProvideSessionRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.repository.SessionRepository get() {
        return provideSessionRepository(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.qrc.di.RepositoryModule_ProvideSessionRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.qrc.di.RepositoryModule_ProvideSessionRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.qrc.domain.repository.SessionRepository provideSessionRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.qrc.domain.repository.SessionRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.qrc.di.RepositoryModule.INSTANCE.provideSessionRepository(apolloClient));
    }
}
