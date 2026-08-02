package com.paypal.oslo.feature.identity.challenges.stepupotp.ui;

/* loaded from: classes12.dex */
public final class StepupOtpContentProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider_Factory create() {
        return com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider newInstance() {
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider_Factory();

        private InstanceHolder() {
        }
    }
}
