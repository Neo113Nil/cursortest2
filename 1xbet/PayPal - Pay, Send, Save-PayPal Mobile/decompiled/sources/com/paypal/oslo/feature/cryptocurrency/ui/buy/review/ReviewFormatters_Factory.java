package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

/* loaded from: classes12.dex */
public final class ReviewFormatters_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> getHighSpeedVideoFpsRangesFor;

    private ReviewFormatters_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter> provider3) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters newInstance(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter exchangeRateFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter cryptoAmountFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters(cryptoPriceFormatter, exchangeRateFormatter, cryptoAmountFormatter);
    }
}
