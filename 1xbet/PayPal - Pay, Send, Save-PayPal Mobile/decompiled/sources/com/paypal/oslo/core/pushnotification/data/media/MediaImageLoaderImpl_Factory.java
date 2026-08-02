package com.paypal.oslo.core.pushnotification.data.media;

/* loaded from: classes10.dex */
public final class MediaImageLoaderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.imaging.ImageLoaderFactory> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private MediaImageLoaderImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.imaging.ImageLoaderFactory> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.imaging.ImageLoaderFactory> provider2) {
        return new com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl newInstance(android.content.Context context, com.paypal.oslo.core.imaging.ImageLoaderFactory imageLoaderFactory) {
        return new com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl(context, imageLoaderFactory);
    }
}
