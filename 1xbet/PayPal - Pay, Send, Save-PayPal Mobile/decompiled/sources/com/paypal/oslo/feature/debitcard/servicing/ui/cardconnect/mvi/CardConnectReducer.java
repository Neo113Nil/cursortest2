package com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/cardconnect/mvi/CardConnectEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardConnectReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CardConnectReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "CardConnectReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState state, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.Loading)) {
            if (state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreated) {
                return event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkLaunched ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.KnotSdkActive.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreated) state, event);
            }
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.KnotSdkActive)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed sessionCreationFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.RetryClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.Loading(sessionCreationFailed.getRetryCount() + 1), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.DismissClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(sessionCreationFailed, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.NavigateBack.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(sessionCreationFailed, event);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.KnotSdkActive knotSdkActive = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.KnotSdkActive) state;
            if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkSuccess) && !(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkError) && !(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkEvent)) {
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.KnotSdkExit) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(knotSdkActive, com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.NavigateBack.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(knotSdkActive, event);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(knotSdkActive, null, 2, null);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.Loading) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionLoading) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionSuccess) {
            com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionSuccess createSessionSuccess = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionSuccess) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreated(createSessionSuccess.getSession()), new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEffect.LaunchKnotSdk(createSessionSuccess.getSession()));
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionFailed) {
            com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionFailed createSessionFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectEvent.CreateSessionFailed) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.cardconnect.mvi.CardConnectState.SessionCreationFailed(createSessionFailed.getErrorType(), createSessionFailed.getErrorInfo(), loading.getRetryCount()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }
}
