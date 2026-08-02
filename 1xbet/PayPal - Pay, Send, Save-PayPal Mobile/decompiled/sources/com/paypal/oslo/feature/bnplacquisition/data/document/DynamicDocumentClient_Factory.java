package com.paypal.oslo.feature.bnplacquisition.data.document;

/* loaded from: classes11.dex */
public final class DynamicDocumentClient_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.data.document.DynamicDocumentClient> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> getHighSpeedVideoSizes;

    private DynamicDocumentClient_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.data.document.DynamicDocumentClient get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.document.DynamicDocumentClient_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider3) {
        return new com.paypal.oslo.feature.bnplacquisition.data.document.DynamicDocumentClient_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.document.DynamicDocumentClient newInstance(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator, com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.data.document.DynamicDocumentClient(downloadManager, urlValidator, graphQlConfig);
    }
}
