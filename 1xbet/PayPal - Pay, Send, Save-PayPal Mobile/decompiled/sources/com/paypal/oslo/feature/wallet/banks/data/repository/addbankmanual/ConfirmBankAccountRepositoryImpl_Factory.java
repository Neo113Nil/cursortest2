package com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual;

/* loaded from: classes15.dex */
public final class ConfirmBankAccountRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private ConfirmBankAccountRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.ConfirmBankAccountRepositoryImpl(apolloClient);
    }
}
