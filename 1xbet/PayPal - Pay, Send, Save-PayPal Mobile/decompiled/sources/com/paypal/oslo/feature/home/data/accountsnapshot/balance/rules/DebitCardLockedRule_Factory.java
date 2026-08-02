package com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules;

/* loaded from: classes12.dex */
public final class DebitCardLockedRule_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.DebitCardLockedRule> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> getHighResolutionOutputSizeshNQ4ISI;

    private DebitCardLockedRule_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.DebitCardLockedRule get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.DebitCardLockedRule_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider> provider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.DebitCardLockedRule_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.DebitCardLockedRule newInstance(com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider balanceStringProvider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.DebitCardLockedRule(balanceStringProvider);
    }
}
