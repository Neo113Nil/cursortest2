package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer;

/* loaded from: classes15.dex */
public final class DocumentCaptureReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer_Factory();

        private InstanceHolder() {
        }
    }
}
