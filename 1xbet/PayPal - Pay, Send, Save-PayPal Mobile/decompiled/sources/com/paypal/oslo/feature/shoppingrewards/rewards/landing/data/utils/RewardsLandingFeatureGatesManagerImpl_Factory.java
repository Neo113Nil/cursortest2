package com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.utils;

/* loaded from: classes15.dex */
public final class RewardsLandingFeatureGatesManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.utils.RewardsLandingFeatureGatesManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;

    private RewardsLandingFeatureGatesManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.utils.RewardsLandingFeatureGatesManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.utils.RewardsLandingFeatureGatesManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.utils.RewardsLandingFeatureGatesManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.utils.RewardsLandingFeatureGatesManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.utils.RewardsLandingFeatureGatesManagerImpl(featureGate);
    }
}
