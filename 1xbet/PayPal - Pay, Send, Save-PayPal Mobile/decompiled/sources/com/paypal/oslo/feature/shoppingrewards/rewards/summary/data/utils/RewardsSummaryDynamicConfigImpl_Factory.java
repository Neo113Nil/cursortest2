package com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils;

/* loaded from: classes15.dex */
public final class RewardsSummaryDynamicConfigImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoSizes;

    private RewardsSummaryDynamicConfigImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl(dynamicConfiguration);
    }
}
