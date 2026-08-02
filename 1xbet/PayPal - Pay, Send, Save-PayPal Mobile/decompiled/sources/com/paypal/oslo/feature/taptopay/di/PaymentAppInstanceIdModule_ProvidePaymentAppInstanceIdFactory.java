package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes15.dex */
public final class PaymentAppInstanceIdModule_ProvidePaymentAppInstanceIdFactory implements dagger.internal.Factory<java.lang.String> {
    private final dagger.internal.Provider<com.payair.logic.managers.SetupManager> getHighSpeedVideoFpsRanges;

    private PaymentAppInstanceIdModule_ProvidePaymentAppInstanceIdFactory(dagger.internal.Provider<com.payair.logic.managers.SetupManager> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.String get() {
        return providePaymentAppInstanceId(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.PaymentAppInstanceIdModule_ProvidePaymentAppInstanceIdFactory create(dagger.internal.Provider<com.payair.logic.managers.SetupManager> provider) {
        return new com.paypal.oslo.feature.taptopay.di.PaymentAppInstanceIdModule_ProvidePaymentAppInstanceIdFactory(provider);
    }

    public static java.lang.String providePaymentAppInstanceId(com.payair.logic.managers.SetupManager setupManager) {
        return com.paypal.oslo.feature.taptopay.di.PaymentAppInstanceIdModule.INSTANCE.providePaymentAppInstanceId(setupManager);
    }
}
