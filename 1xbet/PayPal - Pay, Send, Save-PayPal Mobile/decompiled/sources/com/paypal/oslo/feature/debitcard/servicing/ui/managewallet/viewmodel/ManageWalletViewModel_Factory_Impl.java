package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel;

/* loaded from: classes12.dex */
public final class ManageWalletViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.C0363ManageWalletViewModel_Factory Camera2StreamConfigurationMap;

    private ManageWalletViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.C0363ManageWalletViewModel_Factory c0363ManageWalletViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0363ManageWalletViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
        return this.Camera2StreamConfigurationMap.get(debitCardProductName, str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.C0363ManageWalletViewModel_Factory c0363ManageWalletViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel_Factory_Impl(c0363ManageWalletViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.C0363ManageWalletViewModel_Factory c0363ManageWalletViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel_Factory_Impl(c0363ManageWalletViewModel_Factory));
    }
}
