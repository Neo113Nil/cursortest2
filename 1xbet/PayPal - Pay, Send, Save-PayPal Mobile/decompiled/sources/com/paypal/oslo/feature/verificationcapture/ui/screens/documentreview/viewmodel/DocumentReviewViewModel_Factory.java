package com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel;

/* loaded from: classes15.dex */
public final class DocumentReviewViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase> getHighSpeedVideoFpsRangesFor;

    private DocumentReviewViewModel_Factory(dagger.internal.Provider<androidx.view.SavedStateHandle> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel_Factory create(dagger.internal.Provider<androidx.view.SavedStateHandle> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase> provider3) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel newInstance(androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.reducer.DocumentReviewReducer documentReviewReducer, com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase uploadDocumentUseCase) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel(savedStateHandle, documentReviewReducer, uploadDocumentUseCase);
    }
}
