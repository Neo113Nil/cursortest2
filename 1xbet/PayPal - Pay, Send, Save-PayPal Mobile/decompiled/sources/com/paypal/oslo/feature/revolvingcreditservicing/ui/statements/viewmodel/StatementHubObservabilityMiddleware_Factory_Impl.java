package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel;

/* loaded from: classes14.dex */
public final class StatementHubObservabilityMiddleware_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0426StatementHubObservabilityMiddleware_Factory getHighSpeedVideoFpsRanges;

    private StatementHubObservabilityMiddleware_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0426StatementHubObservabilityMiddleware_Factory c0426StatementHubObservabilityMiddleware_Factory) {
        this.getHighSpeedVideoFpsRanges = c0426StatementHubObservabilityMiddleware_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware create(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return this.getHighSpeedVideoFpsRanges.get(creditProductIdentifier);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0426StatementHubObservabilityMiddleware_Factory c0426StatementHubObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware_Factory_Impl(c0426StatementHubObservabilityMiddleware_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0426StatementHubObservabilityMiddleware_Factory c0426StatementHubObservabilityMiddleware_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware_Factory_Impl(c0426StatementHubObservabilityMiddleware_Factory));
    }
}
