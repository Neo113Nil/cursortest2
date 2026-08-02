package com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer;

/* loaded from: classes13.dex */
public final class RypReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer_Factory();

        private InstanceHolder() {
        }
    }
}
