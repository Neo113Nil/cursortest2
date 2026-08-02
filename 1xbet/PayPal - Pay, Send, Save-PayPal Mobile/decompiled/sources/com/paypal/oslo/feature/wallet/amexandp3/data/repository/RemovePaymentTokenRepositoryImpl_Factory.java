package com.paypal.oslo.feature.wallet.amexandp3.data.repository;

/* loaded from: classes15.dex */
public final class RemovePaymentTokenRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.amexandp3.data.repository.RemovePaymentTokenRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private RemovePaymentTokenRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.amexandp3.data.repository.RemovePaymentTokenRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.data.repository.RemovePaymentTokenRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.amexandp3.data.repository.RemovePaymentTokenRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.data.repository.RemovePaymentTokenRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.amexandp3.data.repository.RemovePaymentTokenRepositoryImpl(apolloClient);
    }
}
