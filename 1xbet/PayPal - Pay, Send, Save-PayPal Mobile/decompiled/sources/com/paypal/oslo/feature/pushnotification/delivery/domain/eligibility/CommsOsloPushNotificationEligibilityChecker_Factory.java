package com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility;

/* loaded from: classes13.dex */
public final class CommsOsloPushNotificationEligibilityChecker_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsOsloPushNotificationEligibilityChecker> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsOsloPushNotificationEligibilityChecker get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsOsloPushNotificationEligibilityChecker_Factory create() {
        return com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsOsloPushNotificationEligibilityChecker_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsOsloPushNotificationEligibilityChecker newInstance() {
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsOsloPushNotificationEligibilityChecker();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsOsloPushNotificationEligibilityChecker_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility.CommsOsloPushNotificationEligibilityChecker_Factory();

        private InstanceHolder() {
        }
    }
}
