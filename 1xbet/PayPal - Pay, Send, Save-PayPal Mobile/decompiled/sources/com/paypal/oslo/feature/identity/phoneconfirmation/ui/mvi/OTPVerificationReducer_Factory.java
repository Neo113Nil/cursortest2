package com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi;

/* loaded from: classes13.dex */
public final class OTPVerificationReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer_Factory create() {
        return com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer newInstance() {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer_Factory();

        private InstanceHolder() {
        }
    }
}
