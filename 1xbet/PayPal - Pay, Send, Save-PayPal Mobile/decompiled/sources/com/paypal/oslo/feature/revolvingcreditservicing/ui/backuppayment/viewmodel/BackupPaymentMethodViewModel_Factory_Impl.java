package com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel;

/* loaded from: classes14.dex */
public final class BackupPaymentMethodViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.C0391BackupPaymentMethodViewModel_Factory Camera2StreamConfigurationMap;

    private BackupPaymentMethodViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.C0391BackupPaymentMethodViewModel_Factory c0391BackupPaymentMethodViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0391BackupPaymentMethodViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination backupPaymentMethodDestination) {
        return this.Camera2StreamConfigurationMap.get(backupPaymentMethodDestination);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.C0391BackupPaymentMethodViewModel_Factory c0391BackupPaymentMethodViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel_Factory_Impl(c0391BackupPaymentMethodViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.C0391BackupPaymentMethodViewModel_Factory c0391BackupPaymentMethodViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel_Factory_Impl(c0391BackupPaymentMethodViewModel_Factory));
    }
}
