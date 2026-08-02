package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel;

/* loaded from: classes14.dex */
public final class ChooseWayToPayObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.C0400ChooseWayToPayObservabilityMiddleware_Factory getHighResolutionOutputSizeshNQ4ISI;

    private ChooseWayToPayObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.C0400ChooseWayToPayObservabilityMiddleware_Factory c0400ChooseWayToPayObservabilityMiddleware_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0400ChooseWayToPayObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.C0400ChooseWayToPayObservabilityMiddleware_Factory c0400ChooseWayToPayObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayObservabilityMiddleware_Factory_Impl(c0400ChooseWayToPayObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.C0400ChooseWayToPayObservabilityMiddleware_Factory c0400ChooseWayToPayObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayObservabilityMiddleware_Factory_Impl(c0400ChooseWayToPayObservabilityMiddleware_Factory));
    }
}
