package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementObservabilityMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/ObservabilityMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementObservabilityMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent> {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;

    @javax.inject.Inject
    public StatementObservabilityMiddleware() {
        super("StatementObservabilityMiddleware");
        this.cpi = com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware
    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
        return this.cpi;
    }
}
