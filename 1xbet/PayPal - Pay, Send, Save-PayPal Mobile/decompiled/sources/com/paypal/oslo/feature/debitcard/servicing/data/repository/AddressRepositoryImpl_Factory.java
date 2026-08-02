package com.paypal.oslo.feature.debitcard.servicing.data.repository;

/* loaded from: classes12.dex */
public final class AddressRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private AddressRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoSizes));
    }

    public static com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl(lazy);
    }
}
