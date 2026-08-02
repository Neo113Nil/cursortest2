package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0426StatementHubObservabilityMiddleware_Factory {
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware get(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return newInstance(creditProductIdentifier);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0426StatementHubObservabilityMiddleware_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0426StatementHubObservabilityMiddleware_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware(creditProductIdentifier);
    }

    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0426StatementHubObservabilityMiddleware_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0426StatementHubObservabilityMiddleware_Factory();

        private InstanceHolder() {
        }
    }
}
