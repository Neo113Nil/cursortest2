package com.paypal.oslo.core.imaging;

/* loaded from: classes10.dex */
public final class ImageLoaderFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.core.imaging.ImageLoaderFactory> {
    private final dagger.internal.Provider<okhttp3.Interceptor> Camera2StreamConfigurationMap;

    private ImageLoaderFactory_Factory(dagger.internal.Provider<okhttp3.Interceptor> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.imaging.ImageLoaderFactory get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.imaging.ImageLoaderFactory_Factory create(dagger.internal.Provider<okhttp3.Interceptor> provider) {
        return new com.paypal.oslo.core.imaging.ImageLoaderFactory_Factory(provider);
    }

    public static com.paypal.oslo.core.imaging.ImageLoaderFactory newInstance(okhttp3.Interceptor interceptor) {
        return new com.paypal.oslo.core.imaging.ImageLoaderFactory(interceptor);
    }
}
