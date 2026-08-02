package com.paypal.oslo.feature.qrc.ui.success;

/* loaded from: classes14.dex */
public final class PaymentSuccessReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessReducer_Factory create() {
        return com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessReducer_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessReducer newInstance() {
        return new com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessReducer_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessReducer_Factory();

        private InstanceHolder() {
        }
    }
}
