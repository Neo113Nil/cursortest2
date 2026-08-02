package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityDetailReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ActivityDetailReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ActivityDetailReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent event) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phoneNumber;
        java.lang.String nationalNumber;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.StartingCancelPayment)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment)) {
                        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment)) {
                            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelPaymentError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelPaymentError cancelPaymentError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelPaymentError) state;
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnCancelPaymentRetryClicked) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment(cancelPaymentError.getUiModel(), cancelPaymentError.getArgs()), null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(cancelPaymentError, event);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment retryCancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment) state;
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnPaymentCanceled) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(retryCancelingPayment, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateBackWithCancelResult.INSTANCE);
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnCancelPaymentFailed) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelPaymentError(retryCancelingPayment.getUiModel(), retryCancelingPayment.getArgs()), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(retryCancelingPayment, event);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment cancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnPaymentCanceled) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(cancelingPayment, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateBackWithCancelResult.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnCancelPaymentFailed) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelPaymentError(cancelingPayment.getUiModel(), cancelingPayment.getArgs()), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.DismissCancelPaymentBottomSheet.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(cancelingPayment, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.StartingCancelPayment startingCancelPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.StartingCancelPayment) state;
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnCancelPaymentBottomSheetDismissed.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready(startingCancelPayment.getUiModel(), startingCancelPayment.getArgs(), null, 4, null), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.DismissCancelPaymentBottomSheet.INSTANCE);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnConfirmCancelPayment.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment(startingCancelPayment.getUiModel(), startingCancelPayment.getArgs()), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(startingCancelPayment, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnBackButtonClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateBack.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnCopyTransactionIdClicked) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready copy$default = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready.copy$default(ready, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_activity_detail_transaction_copied_feedback, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), 3, null);
                java.lang.String referenceId = ready.getArgs().getTransaction().getReferenceId();
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy$default, referenceId != null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.CopyToClipboard(referenceId) : null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnContactSupportClicked) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready ready2 = ready;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact servicingContact = ready.getArgs().getServicingContact();
                if (servicingContact != null && (phoneNumber = servicingContact.getPhoneNumber()) != null && (nationalNumber = phoneNumber.getNationalNumber()) != null) {
                    r2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateToDialer(nationalNumber);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, r2);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnToastVisibilityChanged) {
                if (!((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnToastVisibilityChanged) event).isVisible()) {
                    ready = com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready.copy$default(ready, null, null, null, 3, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnCancelTransactionClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.StartingCancelPayment(ready.getUiModel(), ready.getArgs()), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.ShowCancelPaymentBottomSheet.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnViewCreated) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnInitializeScreen) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnInitializeScreen onInitializeScreen = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnInitializeScreen) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.Ready(onInitializeScreen.getUiModel(), onInitializeScreen.getArgs(), null, 4, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnBackButtonClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateBack.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
