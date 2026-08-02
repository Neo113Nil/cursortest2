package com.paypal.oslo.feature.wallet.amexandp3.data.repository;

/* loaded from: classes15.dex */
public final class ProvisionInstrumentsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private ProvisionInstrumentsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl(apolloClient);
    }
}
