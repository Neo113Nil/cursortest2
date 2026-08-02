package com.paypal.oslo.feature.wallet.preferred.data.repository.online;

/* loaded from: classes16.dex */
public final class OnlinePaymentRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private OnlinePaymentRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.preferred.data.repository.online.OnlinePaymentRepositoryImpl(apolloClient);
    }
}
