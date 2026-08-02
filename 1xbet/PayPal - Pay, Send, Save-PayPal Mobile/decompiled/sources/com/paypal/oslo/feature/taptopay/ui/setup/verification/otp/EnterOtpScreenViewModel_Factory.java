package com.paypal.oslo.feature.taptopay.ui.setup.verification.otp;

/* loaded from: classes15.dex */
public final class EnterOtpScreenViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpScreenViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpScreenViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpScreenViewModel_Factory create() {
        return com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpScreenViewModel_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpScreenViewModel newInstance() {
        return new com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpScreenViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpScreenViewModel_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpScreenViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
