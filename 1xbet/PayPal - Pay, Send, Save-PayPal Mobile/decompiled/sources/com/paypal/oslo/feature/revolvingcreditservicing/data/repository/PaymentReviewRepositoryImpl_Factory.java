package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

/* loaded from: classes14.dex */
public final class PaymentReviewRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.MakePaymentResponseMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private PaymentReviewRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.MakePaymentResponseMapper> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.MakePaymentResponseMapper> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.MakePaymentResponseMapper makePaymentResponseMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentReviewRepositoryImpl(apolloClient, makePaymentResponseMapper);
    }
}
