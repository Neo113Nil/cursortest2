package com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer;

/* loaded from: classes15.dex */
public final class VerificationSuccessReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer_Factory();

        private InstanceHolder() {
        }
    }
}
