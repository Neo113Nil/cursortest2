package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

/* loaded from: classes14.dex */
public final class PaymentOptionsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private PaymentOptionsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.PaymentOptionsRepositoryImpl(apolloClient);
    }
}
