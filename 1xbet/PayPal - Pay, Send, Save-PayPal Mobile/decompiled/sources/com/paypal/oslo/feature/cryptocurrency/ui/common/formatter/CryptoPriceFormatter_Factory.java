package com.paypal.oslo.feature.cryptocurrency.ui.common.formatter;

/* loaded from: classes12.dex */
public final class CryptoPriceFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter_Factory create() {
        return com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter newInstance() {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter_Factory();

        private InstanceHolder() {
        }
    }
}
