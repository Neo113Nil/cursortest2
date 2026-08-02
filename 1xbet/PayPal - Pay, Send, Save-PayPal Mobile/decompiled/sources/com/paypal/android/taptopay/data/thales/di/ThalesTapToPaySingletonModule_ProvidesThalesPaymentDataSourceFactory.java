package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes4.dex */
public final class ThalesTapToPaySingletonModule_ProvidesThalesPaymentDataSourceFactory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource get() {
        return providesThalesPaymentDataSource();
    }

    public static com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvidesThalesPaymentDataSourceFactory create() {
        return com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvidesThalesPaymentDataSourceFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource providesThalesPaymentDataSource() {
        return (com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule.INSTANCE.providesThalesPaymentDataSource());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        private static final com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvidesThalesPaymentDataSourceFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.android.taptopay.data.thales.di.ThalesTapToPaySingletonModule_ProvidesThalesPaymentDataSourceFactory();

        private InstanceHolder() {
        }
    }
}
