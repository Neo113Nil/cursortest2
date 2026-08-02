package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0362SecondaryCardManagementViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase> getHighSpeedVideoSizes;

    private C0362SecondaryCardManagementViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel get(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
        return newInstance(debitCardProductName, str, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.C0362SecondaryCardManagementViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase> provider4) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.C0362SecondaryCardManagementViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel newInstance(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardUserReducer manageSecondaryCardUserReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetDebitInstrumentsUseCase getDebitInstrumentsUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.LockCardUseCase lockCardUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.UnlockCardUseCase unlockCardUseCase) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel(debitCardProductName, str, manageSecondaryCardUserReducer, getDebitInstrumentsUseCase, lockCardUseCase, unlockCardUseCase);
    }
}
