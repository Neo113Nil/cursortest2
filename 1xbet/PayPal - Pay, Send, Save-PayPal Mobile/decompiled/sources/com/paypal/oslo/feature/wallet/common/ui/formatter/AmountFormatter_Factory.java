package com.paypal.oslo.feature.wallet.common.ui.formatter;

/* loaded from: classes15.dex */
public final class AmountFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter_Factory create() {
        return com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter newInstance() {
        return new com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter_Factory();

        private InstanceHolder() {
        }
    }
}
