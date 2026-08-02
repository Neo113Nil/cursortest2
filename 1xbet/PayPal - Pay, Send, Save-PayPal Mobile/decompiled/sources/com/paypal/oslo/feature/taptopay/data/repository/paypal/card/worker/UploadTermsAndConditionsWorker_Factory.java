package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

/* loaded from: classes15.dex */
public final class UploadTermsAndConditionsWorker_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessUploadTnCResultHandler> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsUploader> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter> getHighSpeedVideoSizes;

    private UploadTermsAndConditionsWorker_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsUploader> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessUploadTnCResultHandler> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    public final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker get(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        return newInstance(context, workerParameters, this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsUploader> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessUploadTnCResultHandler> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker newInstance(android.content.Context context, androidx.work.WorkerParameters workerParameters, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsUploader termsAndConditionsUploader, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever termsAndConditionsRetriever, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessUploadTnCResultHandler processUploadTnCResultHandler, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter termsAndConditionsDeleter, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker(context, workerParameters, termsAndConditionsUploader, termsAndConditionsRetriever, processUploadTnCResultHandler, termsAndConditionsDeleter, coroutineDispatcher);
    }
}
