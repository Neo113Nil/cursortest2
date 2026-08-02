package com.paypal.oslo.feature.pushnotification.shared.domain.handler;

/* loaded from: classes13.dex */
public final class CommsPushNotificationHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.shared.domain.handler.CommsPushNotificationHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsTokenRefreshListener> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker>> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsMessageDeliveryListener> getHighSpeedVideoSizes;

    private CommsPushNotificationHandler_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker>> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsMessageDeliveryListener> provider2, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsTokenRefreshListener> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.shared.domain.handler.CommsPushNotificationHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.pushnotification.shared.domain.handler.CommsPushNotificationHandler_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker>> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsMessageDeliveryListener> provider2, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsTokenRefreshListener> provider3) {
        return new com.paypal.oslo.feature.pushnotification.shared.domain.handler.CommsPushNotificationHandler_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.pushnotification.shared.domain.handler.CommsPushNotificationHandler newInstance(java.util.Set<com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker> set, com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsMessageDeliveryListener commsMessageDeliveryListener, com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsTokenRefreshListener commsTokenRefreshListener) {
        return new com.paypal.oslo.feature.pushnotification.shared.domain.handler.CommsPushNotificationHandler(set, commsMessageDeliveryListener, commsTokenRefreshListener);
    }
}
