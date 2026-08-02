package com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository;

/* loaded from: classes15.dex */
public final class RewardsSummaryRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private RewardsSummaryRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache activeOffersCache) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RewardsSummaryRepositoryImpl(lazy, activeOffersCache);
    }
}
