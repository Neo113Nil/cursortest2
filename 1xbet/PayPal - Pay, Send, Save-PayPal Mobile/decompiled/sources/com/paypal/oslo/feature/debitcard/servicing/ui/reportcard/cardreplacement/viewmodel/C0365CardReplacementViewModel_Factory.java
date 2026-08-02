package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0365CardReplacementViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReissueCardUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentShipmentUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter> getHighSpeedVideoSizes;

    private C0365CardReplacementViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementReducer> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReissueCardUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentShipmentUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel get(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), cardReplacementInfo, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.C0365CardReplacementViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementReducer> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReissueCardUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentShipmentUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter> provider5) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.C0365CardReplacementViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel newInstance(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementReducer cardReplacementReducer, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, android.content.Context context, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReissueCardUseCase reissueCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentShipmentUseCase getDebitInstrumentShipmentUseCase, com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter debitCardDateFormatter) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel(cardReplacementReducer, cardReplacementInfo, context, reissueCardUseCase, getDebitInstrumentShipmentUseCase, debitCardDateFormatter);
    }
}
