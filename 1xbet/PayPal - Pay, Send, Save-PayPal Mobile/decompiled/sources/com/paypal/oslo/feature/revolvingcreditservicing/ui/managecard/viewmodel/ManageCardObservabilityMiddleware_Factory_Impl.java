package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel;

/* loaded from: classes14.dex */
public final class ManageCardObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0408ManageCardObservabilityMiddleware_Factory getHighSpeedVideoSizes;

    private ManageCardObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0408ManageCardObservabilityMiddleware_Factory c0408ManageCardObservabilityMiddleware_Factory) {
        this.getHighSpeedVideoSizes = c0408ManageCardObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighSpeedVideoSizes.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0408ManageCardObservabilityMiddleware_Factory c0408ManageCardObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware_Factory_Impl(c0408ManageCardObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.C0408ManageCardObservabilityMiddleware_Factory c0408ManageCardObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardObservabilityMiddleware_Factory_Impl(c0408ManageCardObservabilityMiddleware_Factory));
    }
}
