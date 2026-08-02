package com.paypal.oslo.feature.home.data.accountsnapshot.balance;

/* loaded from: classes12.dex */
public final class BalanceStringProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProviderImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private BalanceStringProviderImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProviderImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProviderImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProviderImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProviderImpl(context);
    }
}
