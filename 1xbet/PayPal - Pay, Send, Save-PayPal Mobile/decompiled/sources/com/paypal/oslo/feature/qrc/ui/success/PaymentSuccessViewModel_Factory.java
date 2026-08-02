package com.paypal.oslo.feature.qrc.ui.success;

/* loaded from: classes14.dex */
public final class PaymentSuccessViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessReducer> getHighSpeedVideoFpsRanges;

    private PaymentSuccessViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessReducer> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessReducer> provider) {
        return new com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel newInstance(com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessReducer paymentSuccessReducer) {
        return new com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessViewModel(paymentSuccessReducer);
    }
}
