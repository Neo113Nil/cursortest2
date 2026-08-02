package com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules;

/* loaded from: classes12.dex */
public final class NegativeBalanceRule_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.NegativeBalanceRule> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> Camera2StreamConfigurationMap;

    private NegativeBalanceRule_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.NegativeBalanceRule get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.NegativeBalanceRule_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> provider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.NegativeBalanceRule_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.NegativeBalanceRule newInstance(com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider balanceStringProvider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.NegativeBalanceRule(balanceStringProvider);
    }
}
