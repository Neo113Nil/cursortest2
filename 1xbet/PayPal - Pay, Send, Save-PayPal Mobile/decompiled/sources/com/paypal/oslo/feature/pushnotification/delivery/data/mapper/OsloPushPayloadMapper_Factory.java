package com.paypal.oslo.feature.pushnotification.delivery.data.mapper;

/* loaded from: classes13.dex */
public final class OsloPushPayloadMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper> getHighSpeedVideoSizes;

    private OsloPushPayloadMapper_Factory(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader> provider, dagger.internal.Provider<com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper> provider2) {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper newInstance(com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader mediaImageLoader, com.paypal.oslo.feature.pushnotification.delivery.data.mapper.CustomViewMapper customViewMapper) {
        return new com.paypal.oslo.feature.pushnotification.delivery.data.mapper.OsloPushPayloadMapper(mediaImageLoader, customViewMapper);
    }
}
