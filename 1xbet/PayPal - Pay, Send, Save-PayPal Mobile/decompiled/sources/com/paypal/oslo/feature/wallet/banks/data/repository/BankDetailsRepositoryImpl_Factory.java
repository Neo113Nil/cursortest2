package com.paypal.oslo.feature.wallet.banks.data.repository;

/* loaded from: classes15.dex */
public final class BankDetailsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private BankDetailsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl(apolloClient);
    }
}
