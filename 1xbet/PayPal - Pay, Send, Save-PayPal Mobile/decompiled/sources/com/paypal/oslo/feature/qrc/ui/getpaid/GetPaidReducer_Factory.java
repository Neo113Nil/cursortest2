package com.paypal.oslo.feature.qrc.ui.getpaid;

/* loaded from: classes14.dex */
public final class GetPaidReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer_Factory create() {
        return com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer newInstance() {
        return new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidReducer_Factory();

        private InstanceHolder() {
        }
    }
}
