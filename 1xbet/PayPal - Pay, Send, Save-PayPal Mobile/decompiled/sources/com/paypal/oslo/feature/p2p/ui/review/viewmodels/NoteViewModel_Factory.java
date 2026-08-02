package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

/* loaded from: classes13.dex */
public final class NoteViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateNoteUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> getHighSpeedVideoSizes;

    private NoteViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateNoteUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateNoteUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider2) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel newInstance(com.paypal.oslo.feature.p2p.domain.usecase.UpdateNoteUseCase updateNoteUseCase, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.NoteViewModel(updateNoteUseCase, getPaymentTransferAttemptUseCase);
    }
}
