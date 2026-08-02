package com.paypal.oslo.feature.cryptocurrency.ui.common.formatter;

/* loaded from: classes12.dex */
public final class ExchangeRateFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> getHighSpeedVideoFpsRanges;

    private ExchangeRateFormatter_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter newInstance(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter(cryptoPriceFormatter);
    }
}
