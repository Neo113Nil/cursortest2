package com.paypal.oslo.feature.verificationcapture.telemetry;

/* loaded from: classes15.dex */
public final class VerificationCaptureAnalyticsTracker_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureAnalyticsTracker> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureAnalyticsTracker get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureAnalyticsTracker_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureAnalyticsTracker_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureAnalyticsTracker newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureAnalyticsTracker();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureAnalyticsTracker_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureAnalyticsTracker_Factory();

        private InstanceHolder() {
        }
    }
}
