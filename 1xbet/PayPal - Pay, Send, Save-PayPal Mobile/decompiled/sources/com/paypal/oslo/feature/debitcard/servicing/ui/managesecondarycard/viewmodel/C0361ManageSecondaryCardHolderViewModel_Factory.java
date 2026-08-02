package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0361ManageSecondaryCardHolderViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> getHighSpeedVideoFpsRangesFor;

    private C0361ManageSecondaryCardHolderViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel get(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return newInstance(debitCardProductName, this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.C0361ManageSecondaryCardHolderViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> provider3) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.C0361ManageSecondaryCardHolderViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel newInstance(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardReducer manageSecondaryCardReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase getDebitInstrumentsUseCase, com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel(debitCardProductName, manageSecondaryCardReducer, getDebitInstrumentsUseCase, debitCardWebViewUrlBuilder);
    }
}
