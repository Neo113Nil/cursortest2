package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0363ManageWalletViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetWalletInstrumentsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletReducer> getHighSpeedVideoSizes;

    private C0363ManageWalletViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetWalletInstrumentsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletReducer> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel get(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
        return newInstance(debitCardProductName, str, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.C0363ManageWalletViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetWalletInstrumentsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletReducer> provider5) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.C0363ManageWalletViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel newInstance(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetWalletInstrumentsUseCase getWalletInstrumentsUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase lockCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase unlockCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.CancelCardUseCase cancelCardUseCase, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletReducer manageWalletReducer) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel(debitCardProductName, str, getWalletInstrumentsUseCase, lockCardUseCase, unlockCardUseCase, cancelCardUseCase, manageWalletReducer);
    }
}
