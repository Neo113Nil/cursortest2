package com.paypal.oslo.feature.wallet.banks.data.repository;

/* loaded from: classes15.dex */
public final class BankAccountDetailsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsErrorMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper> getHighSpeedVideoFpsRangesFor;

    private BankAccountDetailsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsErrorMapper> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsErrorMapper> provider3) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper bankAccountDetailsMapper, com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsErrorMapper bankAccountDetailsErrorMapper) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl(apolloClient, bankAccountDetailsMapper, bankAccountDetailsErrorMapper);
    }
}
