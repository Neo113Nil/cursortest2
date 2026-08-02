package com.paypal.oslo.feature.wallet.me.di;

/* loaded from: classes16.dex */
public final class AccountsTabContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.me.di.AccountsTabContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.me.di.AccountsTabContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.wallet.me.di.AccountsTabContentProvider_Factory create() {
        return com.paypal.oslo.feature.wallet.me.di.AccountsTabContentProvider_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.wallet.me.di.AccountsTabContentProvider newInstance() {
        return new com.paypal.oslo.feature.wallet.me.di.AccountsTabContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.wallet.me.di.AccountsTabContentProvider_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.wallet.me.di.AccountsTabContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
