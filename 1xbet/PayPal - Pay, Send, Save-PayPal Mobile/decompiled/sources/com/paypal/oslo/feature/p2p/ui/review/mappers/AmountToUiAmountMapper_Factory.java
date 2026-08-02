package com.paypal.oslo.feature.p2p.ui.review.mappers;

/* loaded from: classes13.dex */
public final class AmountToUiAmountMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> getHighSpeedVideoSizes;

    private AmountToUiAmountMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper> provider2) {
        return new com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper newInstance(com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter amountFormatter, com.paypal.oslo.feature.p2p.ui.common.util.CurrencyFlagHelper currencyFlagHelper) {
        return new com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper(amountFormatter, currencyFlagHelper);
    }
}
