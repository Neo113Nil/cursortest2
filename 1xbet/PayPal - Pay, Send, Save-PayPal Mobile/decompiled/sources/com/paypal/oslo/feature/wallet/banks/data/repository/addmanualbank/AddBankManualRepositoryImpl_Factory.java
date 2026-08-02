package com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank;

/* loaded from: classes15.dex */
public final class AddBankManualRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private AddBankManualRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper> provider2) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper bankAccountDetailsMapper) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl(apolloClient, bankAccountDetailsMapper);
    }
}
