package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel;

/* loaded from: classes12.dex */
public final class DebitCardManagementViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.C0360DebitCardManagementViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private DebitCardManagementViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.C0360DebitCardManagementViewModel_Factory c0360DebitCardManagementViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0360DebitCardManagementViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent, com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType, com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction debitCardAcquisitionOnArrivalAction, com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction debitCardPostEnrollmentAction) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(debitCardProductName, debitCardFlow, debitCardFlowIntent, debitCardActivationResultType, debitCardAcquisitionOnArrivalAction, debitCardPostEnrollmentAction);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.C0360DebitCardManagementViewModel_Factory c0360DebitCardManagementViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel_Factory_Impl(c0360DebitCardManagementViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.C0360DebitCardManagementViewModel_Factory c0360DebitCardManagementViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel_Factory_Impl(c0360DebitCardManagementViewModel_Factory));
    }
}
