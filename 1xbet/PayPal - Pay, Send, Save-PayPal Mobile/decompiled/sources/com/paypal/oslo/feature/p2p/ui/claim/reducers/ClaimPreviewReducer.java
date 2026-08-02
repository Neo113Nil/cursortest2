package com.paypal.oslo.feature.p2p.ui.claim.reducers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/reducers/ClaimPreviewReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;", "Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/p2p/ui/claim/state/ClaimPreviewUiState;Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClaimPreviewReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState, com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent, com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.ui.claim.reducers.ClaimPreviewReducer INSTANCE = new com.paypal.oslo.feature.p2p.ui.claim.reducers.ClaimPreviewReducer();

    private ClaimPreviewReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ClaimPreviewReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState, com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect>> reduce(com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState state, com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ScreenAppeared)) {
            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.AcceptMoneyClicked)) {
                if (event instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoaded) {
                    com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoaded dataLoaded = (com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoaded) event;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content(dataLoaded.getData(), dataLoaded.getTransactionId(), false), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.CloseClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateBack.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimSucceeded) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToSuccess.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoadFailed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToNetworkError.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimFailed) {
                    if (state instanceof com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content) {
                        state = com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content.copy$default((com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content) state, null, null, false, 3, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToNetworkError.INSTANCE);
                }
                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimDeclined)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToHardDecline.INSTANCE);
            }
            com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.AcceptMoneyClicked acceptMoneyClicked = (com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.AcceptMoneyClicked) event;
            com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content content = state instanceof com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content ? (com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content) state : null;
            return content == null ? com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, acceptMoneyClicked) : com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Content.copy$default(content, null, null, true, 3, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.claim.state.ClaimPreviewUiState.Loading.INSTANCE, null, 2, null);
    }
}
