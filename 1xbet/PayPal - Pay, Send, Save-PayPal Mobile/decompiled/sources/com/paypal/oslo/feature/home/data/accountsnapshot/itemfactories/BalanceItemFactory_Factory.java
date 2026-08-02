package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

/* loaded from: classes12.dex */
public final class BalanceItemFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BalanceItemFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule>> getHighSpeedVideoSizes;

    private BalanceItemFactory_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> provider, dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule>> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BalanceItemFactory get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BalanceItemFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> provider, dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule>> provider2) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BalanceItemFactory_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BalanceItemFactory newInstance(com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider balanceStringProvider, java.util.Set<com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule> set) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BalanceItemFactory(balanceStringProvider, set);
    }
}
