package com.paypal.oslo.feature.bnplacquisition.data.repository;

/* loaded from: classes11.dex */
public final class SubmitCreditApplicationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.data.repository.SubmitCreditApplicationRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private SubmitCreditApplicationRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.data.repository.SubmitCreditApplicationRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighResolutionOutputSizeshNQ4ISI));
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.SubmitCreditApplicationRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.SubmitCreditApplicationRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.SubmitCreditApplicationRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.SubmitCreditApplicationRepositoryImpl(lazy);
    }
}
