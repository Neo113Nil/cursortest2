package com.paypal.oslo.feature.p2p.ui.payrequest.reducers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/reducers/PayRequestReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/state/PayRequestState;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/effect/PayRequestEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/p2p/ui/payrequest/state/PayRequestState;Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PayRequestReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState, com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent, com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.ui.payrequest.reducers.PayRequestReducer INSTANCE = new com.paypal.oslo.feature.p2p.ui.payrequest.reducers.PayRequestReducer();

    private PayRequestReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PayRequestReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState, com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect>> reduce(com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState state, com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Error)) {
                if (!(state instanceof com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Success)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Success success = (com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Success) state;
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.CloseClicked.INSTANCE)) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(success, com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateBack.INSTANCE));
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PrimaryCtaClicked.INSTANCE)) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Success.copy$default(success, null, true, 1, null), null, 2, null));
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted) {
                    com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted paymentStarted = (com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted) event;
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(success, new com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateToPayment(paymentStarted.getAmountValue(), paymentStarted.getIntent())));
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStartFailed) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Error(((com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStartFailed) event).getMessage()), null, 2, null));
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(success, event));
            }
            com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Error error = (com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Error) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.CloseClicked.INSTANCE)) {
                return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(error, com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateBack.INSTANCE));
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(error, event));
        }
        com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Loading loading = (com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Loading) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.Initialize.INSTANCE)) {
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(loading, null, 2, null));
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoaded) {
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Success(((com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoaded) event).getData(), false, 2, null), null, 2, null));
        }
        if ((event instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoadFailed) || (event instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStartFailed)) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(event, "");
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(new com.paypal.oslo.feature.p2p.ui.payrequest.state.PayRequestState.Error(((com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.WithMessage) event).getMessage()), null, 2, null));
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted) {
            com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted paymentStarted2 = (com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted) event;
            return arrow.core.EitherKt.right(new com.paypal.oslo.core.mvi.Reducer.Output(loading, new com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateToPayment(paymentStarted2.getAmountValue(), paymentStarted2.getIntent())));
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent(loading, event));
    }
}
