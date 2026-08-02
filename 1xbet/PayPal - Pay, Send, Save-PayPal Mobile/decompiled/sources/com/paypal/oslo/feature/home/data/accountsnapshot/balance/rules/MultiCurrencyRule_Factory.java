package com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules;

/* loaded from: classes12.dex */
public final class MultiCurrencyRule_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.MultiCurrencyRule> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> getHighSpeedVideoFpsRangesFor;

    private MultiCurrencyRule_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.MultiCurrencyRule get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.MultiCurrencyRule_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> provider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.MultiCurrencyRule_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.MultiCurrencyRule newInstance(com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider balanceStringProvider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.MultiCurrencyRule(balanceStringProvider);
    }
}
