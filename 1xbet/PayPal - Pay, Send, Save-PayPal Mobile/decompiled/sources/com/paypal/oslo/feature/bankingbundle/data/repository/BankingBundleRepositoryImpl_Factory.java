package com.paypal.oslo.feature.bankingbundle.data.repository;

/* loaded from: classes11.dex */
public final class BankingBundleRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private BankingBundleRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.bankingbundle.data.repository.BankingBundleRepositoryImpl(apolloClient);
    }
}
