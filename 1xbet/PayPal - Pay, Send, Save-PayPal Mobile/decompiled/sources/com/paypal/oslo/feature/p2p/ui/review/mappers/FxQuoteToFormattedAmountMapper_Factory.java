package com.paypal.oslo.feature.p2p.ui.review.mappers;

/* loaded from: classes13.dex */
public final class FxQuoteToFormattedAmountMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.mappers.FxQuoteToFormattedAmountMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> getHighSpeedVideoFpsRanges;

    private FxQuoteToFormattedAmountMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.mappers.FxQuoteToFormattedAmountMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.review.mappers.FxQuoteToFormattedAmountMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> provider) {
        return new com.paypal.oslo.feature.p2p.ui.review.mappers.FxQuoteToFormattedAmountMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.mappers.FxQuoteToFormattedAmountMapper newInstance(com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter amountFormatter) {
        return new com.paypal.oslo.feature.p2p.ui.review.mappers.FxQuoteToFormattedAmountMapper(amountFormatter);
    }
}
