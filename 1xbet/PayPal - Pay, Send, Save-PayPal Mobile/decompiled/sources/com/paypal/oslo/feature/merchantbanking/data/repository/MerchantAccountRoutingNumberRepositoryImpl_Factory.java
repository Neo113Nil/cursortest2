package com.paypal.oslo.feature.merchantbanking.data.repository;

/* loaded from: classes13.dex */
public final class MerchantAccountRoutingNumberRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private MerchantAccountRoutingNumberRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl(apolloClient);
    }
}
