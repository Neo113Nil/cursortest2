package com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules;

/* loaded from: classes12.dex */
public final class BalanceOnHoldRule_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceOnHoldRule> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> getHighSpeedVideoFpsRanges;

    private BalanceOnHoldRule_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceOnHoldRule get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceOnHoldRule_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> provider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceOnHoldRule_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceOnHoldRule newInstance(com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider balanceStringProvider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceOnHoldRule(balanceStringProvider);
    }
}
