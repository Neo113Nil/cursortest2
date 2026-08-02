package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

/* loaded from: classes11.dex */
public final class MakeAPaymentReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakePaymentValidator> getHighSpeedVideoSizes;

    private MakeAPaymentReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakePaymentValidator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakePaymentValidator> provider) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer newInstance(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakePaymentValidator makePaymentValidator) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer(makePaymentValidator);
    }
}
