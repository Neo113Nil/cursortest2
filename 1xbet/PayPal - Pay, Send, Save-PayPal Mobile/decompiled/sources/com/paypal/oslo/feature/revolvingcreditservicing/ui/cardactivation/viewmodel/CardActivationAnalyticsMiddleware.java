package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationAnalyticsMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/ObservabilityMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "Lcom/paypal/oslo/core/mvi/UiState;", "preState", "currentState", "", "trackByState", "(Lcom/paypal/oslo/core/mvi/UiState;Lcom/paypal/oslo/core/mvi/UiState;)V", "Lcom/paypal/oslo/core/mvi/Event;", "event", "trackByEvent", "(Lcom/paypal/oslo/core/mvi/Event;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CardActivationAnalyticsMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationState, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent> {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware
    public final void trackByEvent(com.paypal.oslo.core.mvi.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware
    public final void trackByState(com.paypal.oslo.core.mvi.UiState preState, com.paypal.oslo.core.mvi.UiState currentState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentState, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public CardActivationAnalyticsMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        super("CardActivationAnalyticsMiddleware");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.cpi = creditProductIdentifier;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware
    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
        return this.cpi;
    }
}
