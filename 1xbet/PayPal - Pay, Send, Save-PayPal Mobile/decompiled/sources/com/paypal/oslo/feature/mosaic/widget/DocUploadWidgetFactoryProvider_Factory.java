package com.paypal.oslo.feature.mosaic.widget;

/* loaded from: classes13.dex */
public final class DocUploadWidgetFactoryProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetFactoryProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoSizes;

    private DocUploadWidgetFactoryProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetFactoryProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetFactoryProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetFactoryProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetFactoryProvider newInstance(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetProvider idScanWidgetProvider, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.mosaic.widget.DocUploadWidgetFactoryProvider(idScanWidgetProvider, userStore);
    }
}
