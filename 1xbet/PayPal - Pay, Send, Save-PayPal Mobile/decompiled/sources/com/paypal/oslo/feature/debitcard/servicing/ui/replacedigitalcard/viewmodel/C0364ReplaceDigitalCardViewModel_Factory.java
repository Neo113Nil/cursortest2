package com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0364ReplaceDigitalCardViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase> getHighSpeedVideoSizes;

    private C0364ReplaceDigitalCardViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel get(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), cardReplacementInfo);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.C0364ReplaceDigitalCardViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase> provider2) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.C0364ReplaceDigitalCardViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel newInstance(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardReducer replaceDigitalCardReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase replaceDigitalCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel(replaceDigitalCardReducer, replaceDigitalCardUseCase, cardReplacementInfo);
    }
}
