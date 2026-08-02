package com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase;

/* loaded from: classes14.dex */
public final class DownloadFileUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> getHighSpeedVideoFpsRangesFor;

    private DownloadFileUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase newInstance(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase(downloadManager, urlValidator);
    }
}
