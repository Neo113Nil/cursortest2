package com.paypal.oslo.feature.wallet.amexandp3.data.repository;

/* loaded from: classes15.dex */
public final class RetrievePaymentTokenRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private RetrievePaymentTokenRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.amexandp3.data.repository.RetrievePaymentTokenRepositoryImpl(apolloClient);
    }
}
