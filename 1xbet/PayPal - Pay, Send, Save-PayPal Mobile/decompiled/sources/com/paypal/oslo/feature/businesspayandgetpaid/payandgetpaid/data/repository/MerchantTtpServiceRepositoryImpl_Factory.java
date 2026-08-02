package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository;

/* loaded from: classes11.dex */
public final class MerchantTtpServiceRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private MerchantTtpServiceRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor));
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.data.repository.MerchantTtpServiceRepositoryImpl(lazy);
    }
}
