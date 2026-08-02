package com.paypal.oslo.feature.bnplacquisition.data.document;

/* loaded from: classes11.dex */
public final class StaticDocumentClient_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.data.document.StaticDocumentClient> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> getHighSpeedVideoFpsRangesFor;

    private StaticDocumentClient_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.data.document.StaticDocumentClient get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.document.StaticDocumentClient_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.data.document.StaticDocumentClient_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.document.StaticDocumentClient newInstance(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator) {
        return new com.paypal.oslo.feature.bnplacquisition.data.document.StaticDocumentClient(downloadManager, urlValidator);
    }
}
