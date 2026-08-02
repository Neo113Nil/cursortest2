package com.paypal.oslo.feature.qrc.di;

/* loaded from: classes14.dex */
public final class RepositoryModule_ProvidePaymentRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private RepositoryModule_ProvidePaymentRepositoryFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository get() {
        return providePaymentRepository(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.qrc.di.RepositoryModule_ProvidePaymentRepositoryFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.qrc.di.RepositoryModule_ProvidePaymentRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository providePaymentRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.qrc.di.RepositoryModule.INSTANCE.providePaymentRepository(apolloClient));
    }
}
