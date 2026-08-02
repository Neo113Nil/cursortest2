package com.paypal.oslo.feature.pushnotification.delivery.domain.usecase;

/* loaded from: classes13.dex */
public final class HandleCommsPushNotificationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper>> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator<?>>> getHighSpeedVideoSizes;

    private HandleCommsPushNotificationUseCase_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator<?>>> provider, dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper>> provider2, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider4, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator<?>>> provider, dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper>> provider2, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider4, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase> provider5) {
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase newInstance(java.util.Set<com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator<?>> set, java.util.Set<com.paypal.oslo.feature.pushnotification.delivery.domain.mapper.PushNotificationDataMapper> set2, com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer notificationRenderer, kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationImpressionUseCase trackPushNotificationImpressionUseCase) {
        return new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase(set, set2, notificationRenderer, coroutineScope, trackPushNotificationImpressionUseCase);
    }
}
