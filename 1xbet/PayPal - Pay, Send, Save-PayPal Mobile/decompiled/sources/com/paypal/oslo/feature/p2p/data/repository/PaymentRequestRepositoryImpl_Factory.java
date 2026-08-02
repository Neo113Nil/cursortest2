package com.paypal.oslo.feature.p2p.data.repository;

/* loaded from: classes13.dex */
public final class PaymentRequestRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.GetPaymentRequestMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.StartPaymentTransferAttemptForSubflowMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private PaymentRequestRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.GetPaymentRequestMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.StartPaymentTransferAttemptForSubflowMapper> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.GetPaymentRequestMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.StartPaymentTransferAttemptForSubflowMapper> provider3) {
        return new com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl newInstance(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider, com.paypal.oslo.feature.p2p.data.mapper.GetPaymentRequestMapper getPaymentRequestMapper, com.paypal.oslo.feature.p2p.data.mapper.StartPaymentTransferAttemptForSubflowMapper startPaymentTransferAttemptForSubflowMapper) {
        return new com.paypal.oslo.feature.p2p.data.repository.PaymentRequestRepositoryImpl(provider, getPaymentRequestMapper, startPaymentTransferAttemptForSubflowMapper);
    }
}
