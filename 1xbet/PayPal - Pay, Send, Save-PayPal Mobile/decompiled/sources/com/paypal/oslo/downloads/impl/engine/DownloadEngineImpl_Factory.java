package com.paypal.oslo.downloads.impl.engine;

/* loaded from: classes10.dex */
public final class DownloadEngineImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadHttpClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.ContentValidator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.util.FileDeleter> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.engine.ResumeHandler> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor> getOutputMinFrameDuration;

    private DownloadEngineImpl_Factory(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadHttpClient> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.ContentValidator> provider2, dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> provider3, dagger.internal.Provider<com.paypal.oslo.downloads.impl.engine.ResumeHandler> provider4, dagger.internal.Provider<com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory> provider5, dagger.internal.Provider<com.paypal.oslo.downloads.impl.util.FileDeleter> provider6, dagger.internal.Provider<com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor> provider7, dagger.internal.Provider<kotlinx.serialization.json.Json> provider8) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getInputSizeshNQ4ISI = provider4;
        this.getOutputFormats = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
        this.getOutputMinFrameDuration = provider7;
        this.getHighResolutionOutputSizeshNQ4ISI = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputMinFrameDuration.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.downloads.api.DownloadHttpClient> provider, dagger.internal.Provider<com.paypal.oslo.downloads.api.validation.ContentValidator> provider2, dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> provider3, dagger.internal.Provider<com.paypal.oslo.downloads.impl.engine.ResumeHandler> provider4, dagger.internal.Provider<com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory> provider5, dagger.internal.Provider<com.paypal.oslo.downloads.impl.util.FileDeleter> provider6, dagger.internal.Provider<com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor> provider7, dagger.internal.Provider<kotlinx.serialization.json.Json> provider8) {
        return new com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl newInstance(com.paypal.oslo.downloads.api.DownloadHttpClient downloadHttpClient, com.paypal.oslo.downloads.api.validation.ContentValidator contentValidator, com.paypal.oslo.downloads.impl.di.DownloadDispatchers downloadDispatchers, com.paypal.oslo.downloads.impl.engine.ResumeHandler resumeHandler, com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory downloadProgressTrackerFactory, com.paypal.oslo.downloads.impl.util.FileDeleter fileDeleter, com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor responseMetadataExtractor, kotlinx.serialization.json.Json json) {
        return new com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl(downloadHttpClient, contentValidator, downloadDispatchers, resumeHandler, downloadProgressTrackerFactory, fileDeleter, responseMetadataExtractor, json);
    }
}
