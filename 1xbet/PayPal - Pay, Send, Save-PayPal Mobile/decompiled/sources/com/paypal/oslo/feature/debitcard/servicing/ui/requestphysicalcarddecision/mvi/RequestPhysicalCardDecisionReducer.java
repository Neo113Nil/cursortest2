package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEffect;", "<init>", "()V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent;)Larrow/core/Either;", "", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RequestPhysicalCardDecisionReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RequestPhysicalCardDecisionReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState state, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Success)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.Retry) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading(error.getRetryCount() + 1), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FlowCancelled) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEffect.NavigateBack.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Success) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FlowCancelled) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading(0, 1, null), com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEffect.NavigateBack.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.AgreementLinkClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEffect.NavigateToAgreementWebView(((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.AgreementLinkClicked) event).getAgreementUrl()));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchDebitInstrument) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading(0, 1, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchSuccess) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Success(((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchSuccess) event).getDebitInstrumentResponse()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchFailed) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error(((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FetchFailed) event).getErrorType(), loading.getRetryCount()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FlowCancelled) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading(0, 1, null), com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEffect.NavigateBack.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "RequestPhysicalCardDecisionReducer";
    }
}
