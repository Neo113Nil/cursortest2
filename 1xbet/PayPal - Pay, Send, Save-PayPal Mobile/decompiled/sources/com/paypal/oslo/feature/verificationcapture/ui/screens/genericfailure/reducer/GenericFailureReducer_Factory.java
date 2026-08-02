package com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer;

/* loaded from: classes15.dex */
public final class GenericFailureReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer.GenericFailureReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer.GenericFailureReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer.GenericFailureReducer_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer.GenericFailureReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer.GenericFailureReducer newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer.GenericFailureReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer.GenericFailureReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.reducer.GenericFailureReducer_Factory();

        private InstanceHolder() {
        }
    }
}
