package com.paypal.oslo.feature.wallet.banks.data.repository;

/* loaded from: classes15.dex */
public final class OpenBankingInstitutionsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private OpenBankingInstitutionsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingInstitutionsRepositoryImpl(apolloClient);
    }
}
