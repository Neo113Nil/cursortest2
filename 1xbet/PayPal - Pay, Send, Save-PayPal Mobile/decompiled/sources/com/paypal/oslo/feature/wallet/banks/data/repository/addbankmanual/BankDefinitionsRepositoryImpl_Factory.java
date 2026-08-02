package com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual;

/* loaded from: classes15.dex */
public final class BankDefinitionsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private BankDefinitionsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDefinitionsRepositoryImpl(apolloClient);
    }
}
