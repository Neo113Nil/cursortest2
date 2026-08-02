package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

/* loaded from: classes13.dex */
public final class EditAmountViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase> getHighSpeedVideoSizes;

    private EditAmountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider5) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel newInstance(com.paypal.oslo.feature.p2p.domain.usecase.GetAmountUseCase getAmountUseCase, com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper amountToUiAmountMapper, com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase updateAmountAndIntentUseCase, com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter amountFormatter, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.EditAmountViewModel(getAmountUseCase, amountToUiAmountMapper, updateAmountAndIntentUseCase, amountFormatter, getPaymentTransferAttemptUseCase);
    }
}
