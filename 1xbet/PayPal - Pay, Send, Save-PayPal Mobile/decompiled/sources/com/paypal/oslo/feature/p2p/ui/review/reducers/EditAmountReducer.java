package com.paypal.oslo.feature.p2p.ui.review.reducers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/reducers/EditAmountReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/EditAmountUiState;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/EditAmountEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/EditAmountUiState;Lcom/paypal/oslo/feature/p2p/ui/review/events/EditAmountEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EditAmountReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState, com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent, com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect> {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.ui.review.reducers.EditAmountReducer INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.reducers.EditAmountReducer();

    private EditAmountReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "EditAmountReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState, com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect>> reduce(com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState state, com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent event) {
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy;
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy2;
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy3;
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy4;
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy5;
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy6;
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy7;
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy8;
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy9;
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy10;
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy11;
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.LoadAmount)) {
            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoaded)) {
                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoadFailed)) {
                    if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmount)) {
                        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent)) {
                            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateStarted)) {
                                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateSuccess)) {
                                    if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateFailed)) {
                                        if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.TransferAttemptIdObtained)) {
                                            if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.SelectedIntentObtained)) {
                                                if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.CrossBorderSendAmountStored)) {
                                                    if (!(event instanceof com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.ReceiveCurrencyIdUpdated)) {
                                                        throw new kotlin.NoWhenBranchMatchedException();
                                                    }
                                                    copy = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.transferAttemptId : null, (r20 & 4) != 0 ? state.uiAmount : null, (r20 & 8) != 0 ? state.isLoading : false, (r20 & 16) != 0 ? state.errorResId : null, (r20 & 32) != 0 ? state.hasUserSelected : false, (r20 & 64) != 0 ? state.selectedIntent : null, (r20 & 128) != 0 ? state.crossBorderSendAmount : null, (r20 & 256) != 0 ? state.receiveCurrencyId : ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.ReceiveCurrencyIdUpdated) event).getReceiveCurrencyId());
                                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy, null, 2, null);
                                                }
                                                copy2 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.transferAttemptId : null, (r20 & 4) != 0 ? state.uiAmount : null, (r20 & 8) != 0 ? state.isLoading : false, (r20 & 16) != 0 ? state.errorResId : null, (r20 & 32) != 0 ? state.hasUserSelected : false, (r20 & 64) != 0 ? state.selectedIntent : null, (r20 & 128) != 0 ? state.crossBorderSendAmount : ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.CrossBorderSendAmountStored) event).getSendAmount(), (r20 & 256) != 0 ? state.receiveCurrencyId : null);
                                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
                                            }
                                            copy3 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.transferAttemptId : null, (r20 & 4) != 0 ? state.uiAmount : null, (r20 & 8) != 0 ? state.isLoading : false, (r20 & 16) != 0 ? state.errorResId : null, (r20 & 32) != 0 ? state.hasUserSelected : false, (r20 & 64) != 0 ? state.selectedIntent : ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.SelectedIntentObtained) event).getSelectedIntent(), (r20 & 128) != 0 ? state.crossBorderSendAmount : null, (r20 & 256) != 0 ? state.receiveCurrencyId : null);
                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy3, null, 2, null);
                                        }
                                        copy4 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.transferAttemptId : ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.TransferAttemptIdObtained) event).getTransferAttemptId(), (r20 & 4) != 0 ? state.uiAmount : null, (r20 & 8) != 0 ? state.isLoading : false, (r20 & 16) != 0 ? state.errorResId : null, (r20 & 32) != 0 ? state.hasUserSelected : false, (r20 & 64) != 0 ? state.selectedIntent : null, (r20 & 128) != 0 ? state.crossBorderSendAmount : null, (r20 & 256) != 0 ? state.receiveCurrencyId : null);
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy4, null, 2, null);
                                    }
                                    copy5 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.transferAttemptId : null, (r20 & 4) != 0 ? state.uiAmount : null, (r20 & 8) != 0 ? state.isLoading : false, (r20 & 16) != 0 ? state.errorResId : java.lang.Integer.valueOf(((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateFailed) event).getErrorMessageResId()), (r20 & 32) != 0 ? state.hasUserSelected : false, (r20 & 64) != 0 ? state.selectedIntent : null, (r20 & 128) != 0 ? state.crossBorderSendAmount : null, (r20 & 256) != 0 ? state.receiveCurrencyId : null);
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy5, null, 2, null);
                                }
                                com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateSuccess amountUpdateSuccess = (com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountUpdateSuccess) event;
                                copy6 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.transferAttemptId : null, (r20 & 4) != 0 ? state.uiAmount : null, (r20 & 8) != 0 ? state.isLoading : false, (r20 & 16) != 0 ? state.errorResId : null, (r20 & 32) != 0 ? state.hasUserSelected : true, (r20 & 64) != 0 ? state.selectedIntent : null, (r20 & 128) != 0 ? state.crossBorderSendAmount : null, (r20 & 256) != 0 ? state.receiveCurrencyId : null);
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy6, new com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect.AmountUpdateSuccess(amountUpdateSuccess.getFundingOptions(), amountUpdateSuccess.getPaymentTransferAttempt().getTransferAmount(), amountUpdateSuccess.getFxQuote()));
                            }
                            copy7 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.transferAttemptId : null, (r20 & 4) != 0 ? state.uiAmount : null, (r20 & 8) != 0 ? state.isLoading : true, (r20 & 16) != 0 ? state.errorResId : null, (r20 & 32) != 0 ? state.hasUserSelected : false, (r20 & 64) != 0 ? state.selectedIntent : null, (r20 & 128) != 0 ? state.crossBorderSendAmount : null, (r20 & 256) != 0 ? state.receiveCurrencyId : null);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy7, null, 2, null);
                        }
                        copy8 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.transferAttemptId : null, (r20 & 4) != 0 ? state.uiAmount : null, (r20 & 8) != 0 ? state.isLoading : true, (r20 & 16) != 0 ? state.errorResId : null, (r20 & 32) != 0 ? state.hasUserSelected : false, (r20 & 64) != 0 ? state.selectedIntent : null, (r20 & 128) != 0 ? state.crossBorderSendAmount : ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmountAndIntent) event).getSendAmount(), (r20 & 256) != 0 ? state.receiveCurrencyId : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy8, null, 2, null);
                    }
                    copy9 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.transferAttemptId : null, (r20 & 4) != 0 ? state.uiAmount : ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.UpdateAmount) event).getAmount(), (r20 & 8) != 0 ? state.isLoading : false, (r20 & 16) != 0 ? state.errorResId : null, (r20 & 32) != 0 ? state.hasUserSelected : true, (r20 & 64) != 0 ? state.selectedIntent : null, (r20 & 128) != 0 ? state.crossBorderSendAmount : null, (r20 & 256) != 0 ? state.receiveCurrencyId : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy9, null, 2, null);
                }
                copy10 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.transferAttemptId : null, (r20 & 4) != 0 ? state.uiAmount : null, (r20 & 8) != 0 ? state.isLoading : false, (r20 & 16) != 0 ? state.errorResId : java.lang.Integer.valueOf(((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoadFailed) event).getErrorMessageResId()), (r20 & 32) != 0 ? state.hasUserSelected : false, (r20 & 64) != 0 ? state.selectedIntent : null, (r20 & 128) != 0 ? state.crossBorderSendAmount : null, (r20 & 256) != 0 ? state.receiveCurrencyId : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy10, null, 2, null);
            }
            copy11 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.transferAttemptId : null, (r20 & 4) != 0 ? state.uiAmount : ((com.paypal.oslo.feature.p2p.ui.review.events.EditAmountEvent.AmountLoaded) event).getUiAmount(), (r20 & 8) != 0 ? state.isLoading : false, (r20 & 16) != 0 ? state.errorResId : null, (r20 & 32) != 0 ? state.hasUserSelected : false, (r20 & 64) != 0 ? state.selectedIntent : null, (r20 & 128) != 0 ? state.crossBorderSendAmount : null, (r20 & 256) != 0 ? state.receiveCurrencyId : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy11, null, 2, null);
        }
        copy12 = state.copy((r20 & 1) != 0 ? state.name : null, (r20 & 2) != 0 ? state.transferAttemptId : null, (r20 & 4) != 0 ? state.uiAmount : null, (r20 & 8) != 0 ? state.isLoading : true, (r20 & 16) != 0 ? state.errorResId : null, (r20 & 32) != 0 ? state.hasUserSelected : false, (r20 & 64) != 0 ? state.selectedIntent : null, (r20 & 128) != 0 ? state.crossBorderSendAmount : null, (r20 & 256) != 0 ? state.receiveCurrencyId : null);
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy12, null, 2, null);
    }
}
