package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository;

/* loaded from: classes15.dex */
public final class RedeemPointsToBalanceRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.RedeemPointsToBalanceRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private RedeemPointsToBalanceRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.RedeemPointsToBalanceRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap));
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.RedeemPointsToBalanceRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.RedeemPointsToBalanceRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.RedeemPointsToBalanceRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.data.repository.RedeemPointsToBalanceRepositoryImpl(lazy);
    }
}
