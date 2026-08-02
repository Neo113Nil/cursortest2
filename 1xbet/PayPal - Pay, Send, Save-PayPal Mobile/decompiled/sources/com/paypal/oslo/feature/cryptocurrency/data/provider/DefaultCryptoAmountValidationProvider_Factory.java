package com.paypal.oslo.feature.cryptocurrency.data.provider;

/* loaded from: classes12.dex */
public final class DefaultCryptoAmountValidationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.data.provider.DefaultCryptoAmountValidationProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.data.provider.DefaultCryptoAmountValidationProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.provider.DefaultCryptoAmountValidationProvider_Factory create() {
        return com.paypal.oslo.feature.cryptocurrency.data.provider.DefaultCryptoAmountValidationProvider_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.cryptocurrency.data.provider.DefaultCryptoAmountValidationProvider newInstance() {
        return new com.paypal.oslo.feature.cryptocurrency.data.provider.DefaultCryptoAmountValidationProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cryptocurrency.data.provider.DefaultCryptoAmountValidationProvider_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.cryptocurrency.data.provider.DefaultCryptoAmountValidationProvider_Factory();

        private InstanceHolder() {
        }
    }
}
