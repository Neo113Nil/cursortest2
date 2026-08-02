package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

/* loaded from: classes15.dex */
public final class ShoppingIABRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.ShoppingIABRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfig.Manager> getHighSpeedVideoFpsRangesFor;

    private ShoppingIABRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfig.Manager> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.ShoppingIABRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighResolutionOutputSizeshNQ4ISI));
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.ShoppingIABRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfig.Manager> provider, dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.ShoppingIABRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.ShoppingIABRepositoryImpl newInstance(com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfig.Manager manager, dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.ShoppingIABRepositoryImpl(manager, lazy);
    }
}
