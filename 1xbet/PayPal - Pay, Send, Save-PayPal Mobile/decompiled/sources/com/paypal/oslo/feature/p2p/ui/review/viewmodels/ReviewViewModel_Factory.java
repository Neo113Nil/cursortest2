package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

/* loaded from: classes13.dex */
public final class ReviewViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase> getHighSpeedVideoSizes;

    private ReviewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase> provider5) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel newInstance(com.paypal.oslo.feature.p2p.domain.usecase.ExecuteSendTransferUseCase executeSendTransferUseCase, com.paypal.oslo.feature.p2p.domain.usecase.ExecuteRequestTransferUseCase executeRequestTransferUseCase, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase, com.paypal.oslo.feature.p2p.ui.review.mappers.TransferErrorToUiTextMapper transferErrorToUiTextMapper, com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase resolvePlanContingencyUseCase) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ReviewViewModel(executeSendTransferUseCase, executeRequestTransferUseCase, getPaymentTransferAttemptUseCase, transferErrorToUiTextMapper, resolvePlanContingencyUseCase);
    }
}
