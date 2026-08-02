package com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0367ShowDebitCardViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer> getHighSpeedVideoFpsRangesFor;

    private C0367ShowDebitCardViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel get(java.lang.String str) {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), str);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.C0367ShowDebitCardViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager> provider3) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.C0367ShowDebitCardViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel newInstance(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer showDebitCardReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ShowDebitCardUseCase showDebitCardUseCase, com.paypal.oslo.feature.debitcard.shared.util.ClipboardManager clipboardManager, java.lang.String str) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel(showDebitCardReducer, showDebitCardUseCase, clipboardManager, str);
    }
}
