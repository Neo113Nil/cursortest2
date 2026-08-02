package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel;

/* loaded from: classes14.dex */
public final class StatementDetailsObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.C0423StatementDetailsObservabilityMiddleware_Factory getHighResolutionOutputSizeshNQ4ISI;

    private StatementDetailsObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.C0423StatementDetailsObservabilityMiddleware_Factory c0423StatementDetailsObservabilityMiddleware_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0423StatementDetailsObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.C0423StatementDetailsObservabilityMiddleware_Factory c0423StatementDetailsObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware_Factory_Impl(c0423StatementDetailsObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.C0423StatementDetailsObservabilityMiddleware_Factory c0423StatementDetailsObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware_Factory_Impl(c0423StatementDetailsObservabilityMiddleware_Factory));
    }
}
