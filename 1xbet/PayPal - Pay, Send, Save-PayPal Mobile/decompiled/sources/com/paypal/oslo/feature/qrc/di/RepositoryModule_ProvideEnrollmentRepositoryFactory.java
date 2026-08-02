package com.paypal.oslo.feature.qrc.di;

/* loaded from: classes14.dex */
public final class RepositoryModule_ProvideEnrollmentRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private RepositoryModule_ProvideEnrollmentRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository get() {
        return provideEnrollmentRepository(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.qrc.di.RepositoryModule_ProvideEnrollmentRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.qrc.di.RepositoryModule_ProvideEnrollmentRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository provideEnrollmentRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.qrc.domain.repository.EnrollmentRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.qrc.di.RepositoryModule.INSTANCE.provideEnrollmentRepository(apolloClient));
    }
}
