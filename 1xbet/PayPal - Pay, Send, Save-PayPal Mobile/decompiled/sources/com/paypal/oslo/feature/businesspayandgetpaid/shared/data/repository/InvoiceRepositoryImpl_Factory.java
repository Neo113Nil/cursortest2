package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

/* loaded from: classes11.dex */
public final class InvoiceRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private InvoiceRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges));
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl(lazy);
    }
}
