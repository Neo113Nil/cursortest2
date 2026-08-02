package com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository;

/* loaded from: classes15.dex */
public final class RewardsLandingRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.RewardsLandingRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.utils.RewardsLandingFeatureGates.Manager> getHighSpeedVideoSizes;

    private RewardsLandingRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.utils.RewardsLandingFeatureGates.Manager> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.RewardsLandingRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.RewardsLandingRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.utils.RewardsLandingFeatureGates.Manager> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.RewardsLandingRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.RewardsLandingRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.utils.RewardsLandingFeatureGates.Manager manager) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.RewardsLandingRepositoryImpl(lazy, manager);
    }
}
