package com.paypal.oslo.feature.pushnotification.delivery.data.adapter;

/* loaded from: classes13.dex */
public final class CommsPushNotificationClickHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.work.WorkManager> getHighSpeedVideoSizesFor;

    private CommsPushNotificationClickHandler_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer> provider2, dagger.internal.Provider<androidx.work.WorkManager> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider4, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> provider6) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.Camera2StreamConfigurationMap = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer> provider2, dagger.internal.Provider<androidx.work.WorkManager> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider4, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.deeplink.DeeplinkResolver> provider6) {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler newInstance(android.content.Context context, com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderer notificationRenderer, androidx.work.WorkManager workManager, kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.TrackPushNotificationClickUseCase trackPushNotificationClickUseCase, com.paypal.oslo.core.deeplink.DeeplinkResolver deeplinkResolver) {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler(context, notificationRenderer, workManager, coroutineScope, trackPushNotificationClickUseCase, deeplinkResolver);
    }
}
