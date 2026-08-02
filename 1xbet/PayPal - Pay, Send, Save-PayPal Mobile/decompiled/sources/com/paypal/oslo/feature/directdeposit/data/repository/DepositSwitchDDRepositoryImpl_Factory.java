package com.paypal.oslo.feature.directdeposit.data.repository;

/* loaded from: classes12.dex */
public final class DepositSwitchDDRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private DepositSwitchDDRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl(apolloClient);
    }
}
