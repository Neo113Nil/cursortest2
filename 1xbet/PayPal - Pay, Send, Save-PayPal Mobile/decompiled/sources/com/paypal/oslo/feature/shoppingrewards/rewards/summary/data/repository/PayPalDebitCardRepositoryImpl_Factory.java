package com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository;

/* loaded from: classes15.dex */
public final class PayPalDebitCardRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.PayPalDebitCardRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryDynamicConfig> getHighSpeedVideoFpsRangesFor;

    private PayPalDebitCardRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryDynamicConfig> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.PayPalDebitCardRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.PayPalDebitCardRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryDynamicConfig> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.PayPalDebitCardRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.PayPalDebitCardRepositoryImpl newInstance(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryDynamicConfig rewardsSummaryDynamicConfig) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.PayPalDebitCardRepositoryImpl(stringResourceProvider, rewardsSummaryDynamicConfig);
    }
}
