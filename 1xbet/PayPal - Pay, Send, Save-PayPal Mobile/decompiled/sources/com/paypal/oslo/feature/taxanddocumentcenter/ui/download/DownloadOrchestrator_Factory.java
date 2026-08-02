package com.paypal.oslo.feature.taxanddocumentcenter.ui.download;

/* loaded from: classes15.dex */
public final class DownloadOrchestrator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase> getHighSpeedVideoFpsRangesFor;

    private DownloadOrchestrator_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator(downloadDocumentUseCase, coroutineScope);
    }
}
