package com.paypal.oslo.feature.mosaic.widget;

/* loaded from: classes13.dex */
public final class MosaicDocUploadWidgetProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoSizes;

    private MosaicDocUploadWidgetProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetProviderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetProviderImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetProviderImpl newInstance(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetProvider idScanWidgetProvider, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.mosaic.widget.MosaicDocUploadWidgetProviderImpl(idScanWidgetProvider, userStore);
    }
}
