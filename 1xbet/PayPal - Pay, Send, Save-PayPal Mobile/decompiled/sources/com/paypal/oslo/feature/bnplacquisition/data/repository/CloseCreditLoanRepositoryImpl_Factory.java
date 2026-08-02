package com.paypal.oslo.feature.bnplacquisition.data.repository;

/* loaded from: classes11.dex */
public final class CloseCreditLoanRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.data.repository.CloseCreditLoanRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private CloseCreditLoanRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.data.repository.CloseCreditLoanRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap));
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.CloseCreditLoanRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.CloseCreditLoanRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.CloseCreditLoanRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.CloseCreditLoanRepositoryImpl(lazy);
    }
}
