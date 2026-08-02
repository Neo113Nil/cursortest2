package com.paypal.oslo.feature.shaketoreport.utils;

/* loaded from: classes14.dex */
public final class ScreenshotConverterImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shaketoreport.utils.ScreenshotConverterImpl> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;

    private ScreenshotConverterImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shaketoreport.utils.ScreenshotConverterImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.shaketoreport.utils.ScreenshotConverterImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.shaketoreport.utils.ScreenshotConverterImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.shaketoreport.utils.ScreenshotConverterImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.shaketoreport.utils.ScreenshotConverterImpl(context);
    }
}
