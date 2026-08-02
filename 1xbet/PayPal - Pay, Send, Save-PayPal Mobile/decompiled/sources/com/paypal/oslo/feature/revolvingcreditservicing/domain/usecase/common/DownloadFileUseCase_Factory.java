package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common;

/* loaded from: classes14.dex */
public final class DownloadFileUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> getHighSpeedVideoSizes;

    private DownloadFileUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadManager> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.UrlValidator> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase newInstance(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase(downloadManager, urlValidator);
    }
}
