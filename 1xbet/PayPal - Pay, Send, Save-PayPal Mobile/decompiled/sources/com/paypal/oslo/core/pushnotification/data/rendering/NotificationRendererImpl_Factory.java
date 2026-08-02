package com.paypal.oslo.core.pushnotification.data.rendering;

/* loaded from: classes10.dex */
public final class NotificationRendererImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.pushnotification.data.rendering.NotificationRendererImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer>> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager> getHighSpeedVideoSizes;

    private NotificationRendererImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager> provider2, dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer>> provider3, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.pushnotification.data.rendering.NotificationRendererImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.pushnotification.data.rendering.NotificationRendererImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager> provider2, dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer>> provider3, dagger.internal.Provider<com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer> provider4) {
        return new com.paypal.oslo.core.pushnotification.data.rendering.NotificationRendererImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.core.pushnotification.data.rendering.NotificationRendererImpl newInstance(android.content.Context context, com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager notificationChannelManager, java.util.Set<com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer> set, com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer openWebDeeplinkNormalizer) {
        return new com.paypal.oslo.core.pushnotification.data.rendering.NotificationRendererImpl(context, notificationChannelManager, set, openWebDeeplinkNormalizer);
    }
}
