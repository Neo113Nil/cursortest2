package com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel;

/* loaded from: classes14.dex */
public final class BackupPaymentMethodObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.C0390BackupPaymentMethodObservabilityMiddleware_Factory getHighResolutionOutputSizeshNQ4ISI;

    private BackupPaymentMethodObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.C0390BackupPaymentMethodObservabilityMiddleware_Factory c0390BackupPaymentMethodObservabilityMiddleware_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0390BackupPaymentMethodObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.C0390BackupPaymentMethodObservabilityMiddleware_Factory c0390BackupPaymentMethodObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodObservabilityMiddleware_Factory_Impl(c0390BackupPaymentMethodObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.C0390BackupPaymentMethodObservabilityMiddleware_Factory c0390BackupPaymentMethodObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodObservabilityMiddleware_Factory_Impl(c0390BackupPaymentMethodObservabilityMiddleware_Factory));
    }
}
