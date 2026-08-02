package com.paypal.oslo.feature.debitcard.cardacquisition.data.repository;

/* loaded from: classes12.dex */
public final class DebitCardAcquisitionRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.cardacquisition.data.repository.DebitCardAcquisitionRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private DebitCardAcquisitionRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.cardacquisition.data.repository.DebitCardAcquisitionRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoSizes));
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.data.repository.DebitCardAcquisitionRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.data.repository.DebitCardAcquisitionRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.data.repository.DebitCardAcquisitionRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.data.repository.DebitCardAcquisitionRepositoryImpl(lazy);
    }
}
