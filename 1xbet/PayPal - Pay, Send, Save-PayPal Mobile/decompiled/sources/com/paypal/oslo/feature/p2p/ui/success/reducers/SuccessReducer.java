package com.paypal.oslo.feature.p2p.ui.success.reducers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/success/reducers/SuccessReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState;", "Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent;", "Lcom/paypal/oslo/feature/p2p/ui/success/effects/SuccessEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/p2p/ui/success/state/SuccessUiState;Lcom/paypal/oslo/feature/p2p/ui/success/events/SuccessEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuccessReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState, com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent, com.paypal.oslo.feature.p2p.ui.success.effects.SuccessEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.ui.success.reducers.SuccessReducer INSTANCE = new com.paypal.oslo.feature.p2p.ui.success.reducers.SuccessReducer();

    private SuccessReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "SuccessReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState, com.paypal.oslo.feature.p2p.ui.success.effects.SuccessEffect>> reduce(com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState state, com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent event) {
        com.paypal.oslo.feature.p2p.ui.success.state.SuccessState copy;
        com.paypal.oslo.feature.p2p.ui.success.state.SuccessState copy2;
        com.paypal.oslo.feature.p2p.ui.success.state.SuccessState copy3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.Initialize)) {
            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationSucceeded)) {
                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationFailed)) {
                    if (!(event instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.SharePaymentLink)) {
                        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.AttemptLeave)) {
                            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.DismissShareConfirmationSheet)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            if (state instanceof com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success) {
                                com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success success = (com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success) state;
                                copy = r5.copy((r22 & 1) != 0 ? r5.flowType : null, (r22 & 2) != 0 ? r5.amount : null, (r22 & 4) != 0 ? r5.currencyCode : null, (r22 & 8) != 0 ? r5.mediaState : null, (r22 & 16) != 0 ? r5.receiver : null, (r22 & 32) != 0 ? r5.payer : null, (r22 & 64) != 0 ? r5.note : null, (r22 & 128) != 0 ? r5.paymentLink : null, (r22 & 256) != 0 ? r5.hasSharedLink : false, (r22 & 512) != 0 ? success.getData().showShareConfirmationSheet : false);
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy), null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                        }
                        if (state instanceof com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success) {
                            com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success success2 = (com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success) state;
                            if (success2.getData().getFlowType() != com.paypal.oslo.feature.p2p.ui.success.state.FlowType.PAYPAL_LINK || success2.getData().getHasSharedLink()) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.p2p.ui.success.effects.SuccessEffect.NavigateAway.INSTANCE);
                            }
                            copy2 = r5.copy((r22 & 1) != 0 ? r5.flowType : null, (r22 & 2) != 0 ? r5.amount : null, (r22 & 4) != 0 ? r5.currencyCode : null, (r22 & 8) != 0 ? r5.mediaState : null, (r22 & 16) != 0 ? r5.receiver : null, (r22 & 32) != 0 ? r5.payer : null, (r22 & 64) != 0 ? r5.note : null, (r22 & 128) != 0 ? r5.paymentLink : null, (r22 & 256) != 0 ? r5.hasSharedLink : true, (r22 & 512) != 0 ? success2.getData().showShareConfirmationSheet : true);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success2.copy(copy2), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                    }
                    if (state instanceof com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success) {
                        com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success success3 = (com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success) state;
                        copy3 = r5.copy((r22 & 1) != 0 ? r5.flowType : null, (r22 & 2) != 0 ? r5.amount : null, (r22 & 4) != 0 ? r5.currencyCode : null, (r22 & 8) != 0 ? r5.mediaState : null, (r22 & 16) != 0 ? r5.receiver : null, (r22 & 32) != 0 ? r5.payer : null, (r22 & 64) != 0 ? r5.note : null, (r22 & 128) != 0 ? r5.paymentLink : null, (r22 & 256) != 0 ? r5.hasSharedLink : true, (r22 & 512) != 0 ? success3.getData().showShareConfirmationSheet : false);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success3.copy(copy3), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Error(((com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationFailed) event).getErrorMessage()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Success(((com.paypal.oslo.feature.p2p.ui.success.events.SuccessEvent.InitializationSucceeded) event).getSuccessState()), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.success.state.SuccessUiState.Loading.INSTANCE, null, 2, null);
    }
}
