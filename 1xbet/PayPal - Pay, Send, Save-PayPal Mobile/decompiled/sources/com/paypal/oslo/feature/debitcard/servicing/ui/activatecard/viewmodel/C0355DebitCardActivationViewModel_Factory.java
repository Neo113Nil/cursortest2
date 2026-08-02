package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0355DebitCardActivationViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationReducer> getHighSpeedVideoFpsRangesFor;

    private C0355DebitCardActivationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationReducer> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel get(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo) {
        return newInstance(debitCardActivationInfo, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.C0355DebitCardActivationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationReducer> provider2) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.C0355DebitCardActivationViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel newInstance(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ActivatePhysicalCardUseCase activatePhysicalCardUseCase, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationReducer debitCardActivationReducer) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel(debitCardActivationInfo, activatePhysicalCardUseCase, debitCardActivationReducer);
    }
}
