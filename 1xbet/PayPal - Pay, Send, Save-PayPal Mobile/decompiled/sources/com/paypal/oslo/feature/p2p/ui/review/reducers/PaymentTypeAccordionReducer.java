package com.paypal.oslo.feature.p2p.ui.review.reducers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/reducers/PaymentTypeAccordionReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentTypeAccordionUiState;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent;", "", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentTypeAccordionUiState;Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentTypeAccordionReducer implements com.paypal.oslo.core.mvi.Reducer {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.ui.review.reducers.PaymentTypeAccordionReducer INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.reducers.PaymentTypeAccordionReducer();

    private PaymentTypeAccordionReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PaymentTypeAccordionReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output> reduce(com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState state, com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        boolean z = false;
        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelected)) {
            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SetLoading)) {
                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeConfirmedByServer)) {
                    if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelectionReverted)) {
                        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.Expanded)) {
                            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.Collapsed)) {
                                if (event instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SupportedTransferTypesLoaded) {
                                    com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SupportedTransferTypesLoaded supportedTransferTypesLoaded = (com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SupportedTransferTypesLoaded) event;
                                    boolean z2 = supportedTransferTypesLoaded.getTransferSelectionRequirement() == com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement.PREDETERMINED || supportedTransferTypesLoaded.getTransferSelectionRequirement() == null;
                                    if (supportedTransferTypesLoaded.getSupportedTransferTypesCount() == 1 && z2) {
                                        z = true;
                                    }
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState.copy$default(state, null, null, false, !z, false, false, null, 119, null), null, 2, null);
                                }
                                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.AwaitingConfirmationChanged)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState.copy$default(state, null, null, false, false, ((com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.AwaitingConfirmationChanged) event).isAwaiting(), false, null, 111, null), null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState.copy$default(state, null, null, false, false, false, false, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState.copy$default(state, null, null, true, false, false, false, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState.copy$default(state, null, state.getLastConfirmedTypeId(), true, false, false, false, null, 89, null), null, 2, null);
                }
                com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeConfirmedByServer typeConfirmedByServer = (com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeConfirmedByServer) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState.copy$default(state, null, typeConfirmedByServer.getConfirmedTypeId(), false, false, false, false, typeConfirmedByServer.getConfirmedTypeId(), 25, null), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState.copy$default(state, null, null, false, false, false, true, null, 95, null), null, 2, null);
        }
        com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelected typeSelected = (com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelected) event;
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.review.state.PaymentTypeAccordionUiState.copy$default(state, null, typeSelected.getSelectedTypeId(), typeSelected.getShouldCollapse() ? false : state.isExpanded(), false, false, false, null, 121, null), null, 2, null);
    }
}
