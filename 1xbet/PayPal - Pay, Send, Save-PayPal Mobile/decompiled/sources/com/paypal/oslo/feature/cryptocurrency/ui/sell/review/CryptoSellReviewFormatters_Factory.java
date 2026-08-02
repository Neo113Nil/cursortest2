package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

/* loaded from: classes12.dex */
public final class CryptoSellReviewFormatters_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter> getHighSpeedVideoFpsRangesFor;

    private CryptoSellReviewFormatters_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter> provider3) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters newInstance(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter exchangeRateFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoAmountFormatter cryptoAmountFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters(cryptoPriceFormatter, exchangeRateFormatter, cryptoAmountFormatter);
    }
}
