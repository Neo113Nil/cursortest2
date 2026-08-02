package com.paypal.oslo.feature.cryptocurrency.ui.common.formatter;

/* loaded from: classes12.dex */
public final class CryptoAmountFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter_Factory create() {
        return com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter newInstance() {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter_Factory();

        private InstanceHolder() {
        }
    }
}
