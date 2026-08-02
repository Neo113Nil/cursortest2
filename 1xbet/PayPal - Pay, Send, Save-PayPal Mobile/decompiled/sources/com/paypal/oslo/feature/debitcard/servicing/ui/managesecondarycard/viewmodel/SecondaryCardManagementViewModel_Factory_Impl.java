package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel;

/* loaded from: classes12.dex */
public final class SecondaryCardManagementViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.C0362SecondaryCardManagementViewModel_Factory getHighSpeedVideoFpsRanges;

    private SecondaryCardManagementViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.C0362SecondaryCardManagementViewModel_Factory c0362SecondaryCardManagementViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0362SecondaryCardManagementViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
        return this.getHighSpeedVideoFpsRanges.get(debitCardProductName, str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.C0362SecondaryCardManagementViewModel_Factory c0362SecondaryCardManagementViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel_Factory_Impl(c0362SecondaryCardManagementViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.C0362SecondaryCardManagementViewModel_Factory c0362SecondaryCardManagementViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.SecondaryCardManagementViewModel_Factory_Impl(c0362SecondaryCardManagementViewModel_Factory));
    }
}
