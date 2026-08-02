package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.repository;

/* loaded from: classes15.dex */
public final class OffersRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.repository.OffersRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private OffersRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.repository.OffersRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoSizes));
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.repository.OffersRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.repository.OffersRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.repository.OffersRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.data.repository.OffersRepositoryImpl(lazy);
    }
}
