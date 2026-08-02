package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

/* loaded from: classes11.dex */
public final class MakeAPaymentMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.MakeAPaymentConfig> getHighSpeedVideoSizes;

    private MakeAPaymentMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.MakeAPaymentConfig> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.MakeAPaymentConfig> provider3) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper newInstance(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider makeAPaymentContentProvider, com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.MakeAPaymentConfig makeAPaymentConfig) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper(bnplServFormatter, makeAPaymentContentProvider, makeAPaymentConfig);
    }
}
