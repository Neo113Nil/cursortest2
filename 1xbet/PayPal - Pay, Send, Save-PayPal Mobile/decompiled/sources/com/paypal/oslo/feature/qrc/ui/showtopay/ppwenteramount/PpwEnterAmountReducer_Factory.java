package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

/* loaded from: classes14.dex */
public final class PpwEnterAmountReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer_Factory create() {
        return com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer newInstance() {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer_Factory();

        private InstanceHolder() {
        }
    }
}
