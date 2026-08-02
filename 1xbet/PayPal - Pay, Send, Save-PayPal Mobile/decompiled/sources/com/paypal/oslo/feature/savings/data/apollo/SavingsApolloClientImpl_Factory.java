package com.paypal.oslo.feature.savings.data.apollo;

/* loaded from: classes14.dex */
public final class SavingsApolloClientImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private SavingsApolloClientImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl(apolloClient);
    }
}
