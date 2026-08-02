package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

/* loaded from: classes15.dex */
public final class DownloadDocumentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> getHighSpeedVideoSizes;

    private DownloadDocumentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider2, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider2, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider3) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase newInstance(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.core.network.rest.config.RestConfig restConfig, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase(downloadManager, restConfig, urlValidator);
    }
}
