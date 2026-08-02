package com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility;

/* loaded from: classes13.dex */
public final class CommsV1EligibilityChecker_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsV1EligibilityChecker> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsV1EligibilityChecker get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsV1EligibilityChecker_Factory create() {
        return com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsV1EligibilityChecker_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsV1EligibilityChecker newInstance() {
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsV1EligibilityChecker();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsV1EligibilityChecker_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsV1EligibilityChecker_Factory();

        private InstanceHolder() {
        }
    }
}
