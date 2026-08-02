package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel;

/* loaded from: classes12.dex */
public final class ManageSecondaryCardHolderViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.C0361ManageSecondaryCardHolderViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private ManageSecondaryCardHolderViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.C0361ManageSecondaryCardHolderViewModel_Factory c0361ManageSecondaryCardHolderViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0361ManageSecondaryCardHolderViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(debitCardProductName);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.C0361ManageSecondaryCardHolderViewModel_Factory c0361ManageSecondaryCardHolderViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel_Factory_Impl(c0361ManageSecondaryCardHolderViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.C0361ManageSecondaryCardHolderViewModel_Factory c0361ManageSecondaryCardHolderViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel_Factory_Impl(c0361ManageSecondaryCardHolderViewModel_Factory));
    }
}
