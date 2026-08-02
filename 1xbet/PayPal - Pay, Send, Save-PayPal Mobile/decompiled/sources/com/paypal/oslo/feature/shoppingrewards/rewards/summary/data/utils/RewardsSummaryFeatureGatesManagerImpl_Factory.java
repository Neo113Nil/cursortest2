package com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils;

/* loaded from: classes15.dex */
public final class RewardsSummaryFeatureGatesManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryFeatureGatesManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private RewardsSummaryFeatureGatesManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryFeatureGatesManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryFeatureGatesManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryFeatureGatesManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryFeatureGatesManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryFeatureGatesManagerImpl(featureGate);
    }
}
