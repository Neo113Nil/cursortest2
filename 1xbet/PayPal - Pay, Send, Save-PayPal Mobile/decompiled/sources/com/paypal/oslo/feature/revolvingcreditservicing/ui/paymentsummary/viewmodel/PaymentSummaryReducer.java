package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentSummaryReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PaymentSummaryReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PaymentSummaryReducer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r5 == null) goto L12;
     */
    @Override // com.paypal.oslo.core.mvi.Reducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent event) {
        java.lang.String creditAccountId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnViewCreated) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnViewCreated) event;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview = onViewCreated.getPaymentSummaryOverview();
            if (paymentSummaryOverview != null && (creditAccountId = paymentSummaryOverview.getCreditAccountId()) != null) {
                if (kotlin.text.StringsKt.isBlank(creditAccountId)) {
                    creditAccountId = null;
                }
            }
            creditAccountId = onViewCreated.getCreditAccountId();
            if (creditAccountId == null || kotlin.text.StringsKt.isBlank(creditAccountId)) {
                creditAccountId = null;
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Loading(onViewCreated.getPaymentSummaryOverview(), creditAccountId), null, 2, null);
        }
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Reloading)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Ready)) {
                        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.StartingCancelPayment)) {
                            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.CancelingPayment)) {
                                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.RetryCancelingPayment)) {
                                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.FetchError)) {
                                        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.CancelPaymentError)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.CancelPaymentError cancelPaymentError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.CancelPaymentError) state;
                                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentRetryClicked) {
                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.RetryCancelingPayment(cancelPaymentError.getPaymentSummaryScreenUiModel(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentRetryClicked) event).getRepaymentId(), cancelPaymentError.getCreditAccountId()), null, 2, null);
                                        }
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(cancelPaymentError, event);
                                    }
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.FetchError fetchError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.FetchError) state;
                                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnRetryFetchPaymentSummaryClicked) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Reloading(fetchError.getCreditAccountId()), null, 2, null);
                                    }
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(fetchError, event);
                                }
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.RetryCancelingPayment retryCancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.RetryCancelingPayment) state;
                                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentCanceled) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Reloading(retryCancelingPayment.getCreditAccountId()), com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect.DismissBottomSheetAndShowSuccessToast.INSTANCE);
                                }
                                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentFailed) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.CancelPaymentError(retryCancelingPayment.getPaymentSummaryScreenUiModel(), retryCancelingPayment.getRepaymentId(), retryCancelingPayment.getCreditAccountId()), null, 2, null);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(retryCancelingPayment, event);
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.CancelingPayment cancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.CancelingPayment) state;
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentCanceled) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Reloading(cancelingPayment.getCreditAccountId()), com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect.DismissBottomSheetAndShowSuccessToast.INSTANCE);
                            }
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentFailed) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.CancelPaymentError(cancelingPayment.getPaymentSummaryScreenUiModel(), cancelingPayment.getRepaymentId(), cancelingPayment.getCreditAccountId()), com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect.DismissCancelPaymentBottomSheet.INSTANCE);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(cancelingPayment, event);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.StartingCancelPayment startingCancelPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.StartingCancelPayment) state;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentBottomSheetDismissed.INSTANCE)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Ready(startingCancelPayment.getPaymentSummaryScreenUiModel(), startingCancelPayment.getCreditAccountId()), com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect.DismissCancelPaymentBottomSheet.INSTANCE);
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnConfirmCancelPayment.INSTANCE)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.CancelingPayment(startingCancelPayment.getPaymentSummaryScreenUiModel(), startingCancelPayment.getRepaymentId(), startingCancelPayment.getCreditAccountId()), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(startingCancelPayment, event);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Ready) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.StartingCancelPayment(ready.getPaymentSummaryScreenUiModel(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentClicked) event).getRepaymentId(), ready.getCreditAccountId()), com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect.ShowCancelPaymentBottomSheet.INSTANCE);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnMakePaymentClicked.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect.NavigateToMakePayment.INSTANCE);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnAutopayIconClicked.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect.NavigateToAutopay.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentItemClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect.NavigateToPaymentDetail(((com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentItemClicked) event).getRepaymentActivity()));
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentCanceled) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Reloading(ready.getCreditAccountId()), com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryUiEffect.DismissBottomSheetAndShowSuccessToast.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Reloading reloading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Reloading) state;
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded onDataLoaded = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded) event;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel paymentSummaryUiModel = onDataLoaded.getPaymentSummaryUiModel();
                    java.lang.String creditAccountId2 = onDataLoaded.getCreditAccountId();
                    if (creditAccountId2 == null) {
                        creditAccountId2 = reloading.getCreditAccountId();
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Ready(paymentSummaryUiModel, creditAccountId2), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoadFailed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.FetchError(reloading.getCreditAccountId()), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(reloading, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Loading loading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded onDataLoaded2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded) event;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel paymentSummaryUiModel2 = onDataLoaded2.getPaymentSummaryUiModel();
                java.lang.String creditAccountId3 = onDataLoaded2.getCreditAccountId();
                if (creditAccountId3 == null) {
                    creditAccountId3 = loading.getCreditAccountId();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Ready(paymentSummaryUiModel2, creditAccountId3), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoadFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.FetchError(loading.getCreditAccountId()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Initial) state, event);
    }
}
