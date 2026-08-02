package com.paypal.oslo.feature.debitcard.servicing.data.repository;

/* loaded from: classes12.dex */
public final class DebitCardServicingRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.data.repository.DebitCardServicingRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private DebitCardServicingRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.data.repository.DebitCardServicingRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges));
    }

    public static com.paypal.oslo.feature.debitcard.servicing.data.repository.DebitCardServicingRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.data.repository.DebitCardServicingRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.data.repository.DebitCardServicingRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.debitcard.servicing.data.repository.DebitCardServicingRepositoryImpl(lazy);
    }
}
