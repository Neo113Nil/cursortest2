package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationSideEffectMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;", "dataInvalidationEventBus", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentConfirmationSideEffectMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PaymentConfirmationSideEffectMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus dataInvalidationEventBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInvalidationEventBus, "");
        this.getHighSpeedVideoSizes = dataInvalidationEventBus;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (input.getEvent() instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent.OnDoneClicked) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationSideEffectMiddleware$invoke$1(this, null), 3, null);
        }
    }
}
