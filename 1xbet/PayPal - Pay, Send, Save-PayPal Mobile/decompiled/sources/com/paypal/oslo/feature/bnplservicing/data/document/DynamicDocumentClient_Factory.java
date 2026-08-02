package com.paypal.oslo.feature.bnplservicing.data.document;

/* loaded from: classes11.dex */
public final class DynamicDocumentClient_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.data.document.DynamicDocumentClient> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> getHighSpeedVideoSizes;

    private DynamicDocumentClient_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.data.document.DynamicDocumentClient get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.data.document.DynamicDocumentClient_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.graphql.config.GraphQlConfig> provider3) {
        return new com.paypal.oslo.feature.bnplservicing.data.document.DynamicDocumentClient_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplservicing.data.document.DynamicDocumentClient newInstance(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator, com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig) {
        return new com.paypal.oslo.feature.bnplservicing.data.document.DynamicDocumentClient(downloadManager, urlValidator, graphQlConfig);
    }
}
