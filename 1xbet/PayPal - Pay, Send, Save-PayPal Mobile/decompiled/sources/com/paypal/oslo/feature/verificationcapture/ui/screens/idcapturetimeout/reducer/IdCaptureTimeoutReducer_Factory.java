package com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer;

/* loaded from: classes15.dex */
public final class IdCaptureTimeoutReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer.IdCaptureTimeoutReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer.IdCaptureTimeoutReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer.IdCaptureTimeoutReducer_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer.IdCaptureTimeoutReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer.IdCaptureTimeoutReducer newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer.IdCaptureTimeoutReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer.IdCaptureTimeoutReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.reducer.IdCaptureTimeoutReducer_Factory();

        private InstanceHolder() {
        }
    }
}
