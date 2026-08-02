package com.paypal.oslo.feature.pushnotification.delivery.data.mapper;

/* loaded from: classes13.dex */
public final class CommsV1PushPayloadMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader> getHighSpeedVideoSizes;

    private CommsV1PushPayloadMapper_Factory(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper> provider2) {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper newInstance(com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader mediaImageLoader, com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper customViewMapper) {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CommsV1PushPayloadMapper(mediaImageLoader, customViewMapper);
    }
}
