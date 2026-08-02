package com.paypal.oslo.feature.p2p.ui.transfer.viewmodels;

/* loaded from: classes13.dex */
public final class TransferViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.StartTransferAttemptUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferFlowConfigurationUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.transfer.mapper.StartPaymentTransferAttemptToTransferUiStateMapper> getOutputMinFrameDuration;

    private TransferViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.StartTransferAttemptUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.transfer.mapper.StartPaymentTransferAttemptToTransferUiStateMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferFlowConfigurationUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> provider6, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer> provider7) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getOutputMinFrameDuration = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getOutputFormats = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.Camera2StreamConfigurationMap = provider6;
        this.getHighSpeedVideoSizes = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.StartTransferAttemptUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.transfer.mapper.StartPaymentTransferAttemptToTransferUiStateMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferFlowConfigurationUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> provider6, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer> provider7) {
        return new com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel newInstance(com.paypal.oslo.feature.p2p.domain.usecase.StartTransferAttemptUseCase startTransferAttemptUseCase, com.paypal.oslo.feature.p2p.ui.transfer.mapper.StartPaymentTransferAttemptToTransferUiStateMapper startPaymentTransferAttemptToTransferUiStateMapper, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferFlowConfigurationUseCase getPaymentTransferFlowConfigurationUseCase, com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase updateAmountAndIntentUseCase, com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper amountToUiAmountMapper, com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferReducer transferReducer) {
        return new com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel(startTransferAttemptUseCase, startPaymentTransferAttemptToTransferUiStateMapper, getPaymentTransferFlowConfigurationUseCase, updateAmountAndIntentUseCase, amountToUiAmountMapper, p2pFeatureGateManager, transferReducer);
    }
}
