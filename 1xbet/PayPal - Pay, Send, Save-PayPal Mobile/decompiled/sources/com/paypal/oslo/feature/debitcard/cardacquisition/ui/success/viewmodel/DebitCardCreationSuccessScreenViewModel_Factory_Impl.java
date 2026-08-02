package com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel;

/* loaded from: classes12.dex */
public final class DebitCardCreationSuccessScreenViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.C0354DebitCardCreationSuccessScreenViewModel_Factory Camera2StreamConfigurationMap;

    private DebitCardCreationSuccessScreenViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.C0354DebitCardCreationSuccessScreenViewModel_Factory c0354DebitCardCreationSuccessScreenViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0354DebitCardCreationSuccessScreenViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, boolean z) {
        return this.Camera2StreamConfigurationMap.get(debitCardProductName, z);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.Factory> create(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.C0354DebitCardCreationSuccessScreenViewModel_Factory c0354DebitCardCreationSuccessScreenViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel_Factory_Impl(c0354DebitCardCreationSuccessScreenViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.C0354DebitCardCreationSuccessScreenViewModel_Factory c0354DebitCardCreationSuccessScreenViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel_Factory_Impl(c0354DebitCardCreationSuccessScreenViewModel_Factory));
    }
}
