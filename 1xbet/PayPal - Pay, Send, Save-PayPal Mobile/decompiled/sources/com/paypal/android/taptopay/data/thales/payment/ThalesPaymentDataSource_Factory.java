package com.paypal.android.taptopay.data.thales.payment;

/* loaded from: classes10.dex */
public final class ThalesPaymentDataSource_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource get() {
        return newInstance();
    }

    public static com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource_Factory create() {
        return com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource newInstance() {
        return new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource();
    }

    static final class InstanceHolder {
        private static final com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource_Factory();

        private InstanceHolder() {
        }
    }
}
