package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvideThalesTransactionDataSourceFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.payment.TransactionDataSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.payment.TransactionDataSource get() {
        return provideThalesTransactionDataSource();
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideThalesTransactionDataSourceFactory create() {
        return com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideThalesTransactionDataSourceFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.android.taptopay.data.thales.payment.TransactionDataSource provideThalesTransactionDataSource() {
        return (com.paypal.android.taptopay.data.thales.payment.TransactionDataSource) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.provideThalesTransactionDataSource());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        private static final com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideThalesTransactionDataSourceFactory getHighSpeedVideoFpsRanges = new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvideThalesTransactionDataSourceFactory();

        private InstanceHolder() {
        }
    }
}
