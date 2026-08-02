package com.paypal.android.taptopay.data.thales.di;

/* loaded from: classes10.dex */
public final class TapToPayDataThalesApduServiceModule_ProvidePaymentServiceListenerFactory implements dagger.internal.Factory<com.gemalto.mfs.mwsdk.payment.PaymentServiceListener> {
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> getHighResolutionOutputSizeshNQ4ISI;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.android.taptopay.data.thales.di.TapToPayDataThalesApduServiceModule getHighSpeedVideoSizes;

    public TapToPayDataThalesApduServiceModule_ProvidePaymentServiceListenerFactory(com.paypal.android.taptopay.data.thales.di.TapToPayDataThalesApduServiceModule tapToPayDataThalesApduServiceModule, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher> provider2, javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider3) {
        this.getHighSpeedVideoSizes = tapToPayDataThalesApduServiceModule;
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.gemalto.mfs.mwsdk.payment.PaymentServiceListener get() {
        return providePaymentServiceListener(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.android.taptopay.data.thales.di.TapToPayDataThalesApduServiceModule_ProvidePaymentServiceListenerFactory create(com.paypal.android.taptopay.data.thales.di.TapToPayDataThalesApduServiceModule tapToPayDataThalesApduServiceModule, javax.inject.Provider<com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource> provider, javax.inject.Provider<com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher> provider2, javax.inject.Provider<com.paypal.android.taptopay.data.thales.card.CardDataSource> provider3) {
        return new com.paypal.android.taptopay.data.thales.di.TapToPayDataThalesApduServiceModule_ProvidePaymentServiceListenerFactory(tapToPayDataThalesApduServiceModule, provider, provider2, provider3);
    }

    public static com.gemalto.mfs.mwsdk.payment.PaymentServiceListener providePaymentServiceListener(com.paypal.android.taptopay.data.thales.di.TapToPayDataThalesApduServiceModule tapToPayDataThalesApduServiceModule, com.paypal.android.taptopay.data.thales.payment.ThalesPaymentDataSource thalesPaymentDataSource, com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher, com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource) {
        return (com.gemalto.mfs.mwsdk.payment.PaymentServiceListener) dagger.internal.Preconditions.checkNotNullFromProvides(tapToPayDataThalesApduServiceModule.providePaymentServiceListener(thalesPaymentDataSource, cardPaymentKeysReplenisher, cardDataSource));
    }
}
