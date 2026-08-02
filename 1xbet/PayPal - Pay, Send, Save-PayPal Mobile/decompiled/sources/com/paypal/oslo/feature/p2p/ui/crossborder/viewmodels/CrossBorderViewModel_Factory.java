package com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels;

/* loaded from: classes13.dex */
public final class CrossBorderViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> getHighSpeedVideoSizes;

    private CrossBorderViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer> provider5) {
        return new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel newInstance(com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase getFxQuoteUseCase, com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase updateAmountAndIntentUseCase, com.paypal.oslo.feature.p2p.ui.review.mappers.AmountToUiAmountMapper amountToUiAmountMapper, com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter amountFormatter, com.paypal.oslo.feature.p2p.ui.crossborder.reducers.CrossBorderReducer crossBorderReducer) {
        return new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel(getFxQuoteUseCase, updateAmountAndIntentUseCase, amountToUiAmountMapper, amountFormatter, crossBorderReducer);
    }
}
