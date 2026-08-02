package com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility;

/* loaded from: classes13.dex */
public final class CommsSilentPushEligibilityChecker_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsSilentPushEligibilityChecker> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsSilentPushEligibilityChecker get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsSilentPushEligibilityChecker_Factory create() {
        return com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsSilentPushEligibilityChecker_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsSilentPushEligibilityChecker newInstance() {
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsSilentPushEligibilityChecker();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsSilentPushEligibilityChecker_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsSilentPushEligibilityChecker_Factory();

        private InstanceHolder() {
        }
    }
}
