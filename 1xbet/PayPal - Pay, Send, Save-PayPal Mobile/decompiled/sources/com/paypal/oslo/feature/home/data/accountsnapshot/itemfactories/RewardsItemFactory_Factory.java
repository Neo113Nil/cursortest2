package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

/* loaded from: classes12.dex */
public final class RewardsItemFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.RewardsItemFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.RewardsStringProvider> getHighSpeedVideoFpsRangesFor;

    private RewardsItemFactory_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.RewardsStringProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.RewardsItemFactory get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.RewardsItemFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.RewardsStringProvider> provider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.RewardsItemFactory_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.RewardsItemFactory newInstance(com.paypal.oslo.feature.home.domain.RewardsStringProvider rewardsStringProvider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.RewardsItemFactory(rewardsStringProvider);
    }
}
