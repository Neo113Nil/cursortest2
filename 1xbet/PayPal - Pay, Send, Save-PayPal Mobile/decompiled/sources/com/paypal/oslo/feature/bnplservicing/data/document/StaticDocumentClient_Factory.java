package com.paypal.oslo.feature.bnplservicing.data.document;

/* loaded from: classes11.dex */
public final class StaticDocumentClient_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.data.document.StaticDocumentClient> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> getHighSpeedVideoFpsRanges;

    private StaticDocumentClient_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.data.document.StaticDocumentClient get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.data.document.StaticDocumentClient_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider2) {
        return new com.paypal.oslo.feature.bnplservicing.data.document.StaticDocumentClient_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplservicing.data.document.StaticDocumentClient newInstance(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator) {
        return new com.paypal.oslo.feature.bnplservicing.data.document.StaticDocumentClient(downloadManager, urlValidator);
    }
}
