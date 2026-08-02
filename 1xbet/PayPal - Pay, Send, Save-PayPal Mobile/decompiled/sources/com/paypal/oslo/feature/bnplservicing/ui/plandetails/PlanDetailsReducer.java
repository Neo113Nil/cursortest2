package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsUiState;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;)Larrow/core/Either;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanDetailsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PlanDetailsReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PlanDetailsReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect>> reduce(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState state, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect>> output$default;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel copy;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel copy2;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel copy3;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel data;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel planDetailsUiModel;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel copy4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Error error = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Error) state;
                if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnBackClicked) {
                    if (((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnBackClicked) event).getSendPaymentResult()) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.SendPaymentSuccessResult("Payment completed successfully"));
                    } else {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateBack.INSTANCE);
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnErrorClosed.INSTANCE)) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateBack.INSTANCE);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnReloadData.INSTANCE)) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModelKt.getInitialLoading(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel.INSTANCE)), null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded) event).getUiModel(), null, null, 6, null), null, 2, null);
                } else {
                    output$default = event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnError ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
            } else {
                com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success success = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success) state;
                if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnBackClicked) {
                    if (((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnBackClicked) event).getSendPaymentResult()) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.SendPaymentSuccessResult("Payment completed successfully"));
                    } else {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateBack.INSTANCE);
                    }
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentScheduleClicked) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPaymentSchedule(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentScheduleClicked) event).getUiModel()));
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.UsedVccClicked) {
                    com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanSummaryUiModel.Alert alert = success.getUiModel().getPlanSummaryUiModel().getAlert();
                    if (alert == null || (data = alert.getData()) == null || (output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowUsedVccHalfSheet(data))) == null) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                    }
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiClicked) {
                    com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiClicked changeFiClicked = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiClicked) event;
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success.copy$default(success, null, new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel(changeFiClicked.getCreditAccountId(), changeFiClicked.getCreditProductIdentifier(), changeFiClicked.getSelectedFundingInstrumentId(), changeFiClicked.getFlowType(), null, null, null, 112, null), null, 5, null), null, 2, null);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.ChangeFiDismissed.INSTANCE)) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success.copy$default(success, null, null, kotlin.collections.CollectionsKt.emptyList(), 1, null), null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnAddFiSuccess) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success.copy$default(success, null, null, ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnAddFiSuccess) event).getNewFiIds(), 3, null), null, 2, null);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnNewFiConsumed.INSTANCE)) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success.copy$default(success, null, null, kotlin.collections.CollectionsKt.emptyList(), 3, null), null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.MakeAPaymentClicked) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateToMakePayment(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.MakeAPaymentClicked) event).getPlanId(), success.getUiModel().getCpi().name()));
                } else if (!(event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentSuccessReceived)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentMethodUpdatedSuccessfully.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnReloadData.INSTANCE)) {
                        if (!(event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnToastDismiss)) {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOffAutopayClicked.INSTANCE)) {
                                if (!(event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOnAutopayClicked)) {
                                    if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded) {
                                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded) event).getUiModel(), null, null, 6, null), null, 2, null);
                                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnError) {
                                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Error.INSTANCE, null, 2, null);
                                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TooltipClicked) {
                                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTooltip(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TooltipClicked) event).getItem()));
                                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PayIn30InfoClicked.INSTANCE)) {
                                        com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlansHeaderUiModel planHeaderUiModel = success.getUiModel().getPlanHeaderUiModel();
                                        com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanPayIn30HeaderUiModel planPayIn30HeaderUiModel = planHeaderUiModel instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanPayIn30HeaderUiModel ? (com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlanPayIn30HeaderUiModel) planHeaderUiModel : null;
                                        if (planPayIn30HeaderUiModel == null) {
                                            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                                        } else {
                                            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet(planPayIn30HeaderUiModel.getInfoSheetTitle(), planPayIn30HeaderUiModel.getInfoSheetDescription(), planPayIn30HeaderUiModel.getInfoSheetButtonText()));
                                        }
                                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.DownloadDocumentsClicked) {
                                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowDocumentsHalfSheet(new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel(success.getUiModel().getPlanSummaryUiModel().getDocumentsUiModel(), success.getUiModel().getPlanId(), success.getUiModel().getCpi())));
                                    } else if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.MoreTimeToPayClicked.INSTANCE)) {
                                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                                    } else {
                                        com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs snoozeArgs = success.getUiModel().getSnoozeArgs();
                                        if (snoozeArgs == null || (output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowSnoozeHalfSheet(snoozeArgs))) == null) {
                                            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                                        }
                                    }
                                } else {
                                    com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOnAutopayClicked turnOnAutopayClicked = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.TurnOnAutopayClicked) event;
                                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success.copy$default(success, null, new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel(turnOnAutopayClicked.getCreditAccountId(), turnOnAutopayClicked.getCreditProductIdentifier(), turnOnAutopayClicked.getSelectedFundingInstrumentId(), turnOnAutopayClicked.getFlowType(), null, null, null, 112, null), null, 5, null), null, 2, null);
                                }
                            } else {
                                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTurnOffAutopaySheet(new com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel(success.getUiModel().getPlanId(), success.getUiModel().getCpi(), success.getUiModel().getETag(), success.getUiModel().getTurnOffAutopayContent())));
                            }
                        } else {
                            copy2 = r7.copy((r34 & 1) != 0 ? r7.title : null, (r34 & 2) != 0 ? r7.planId : null, (r34 & 4) != 0 ? r7.cpi : null, (r34 & 8) != 0 ? r7.eTag : null, (r34 & 16) != 0 ? r7.autopayEnabled : false, (r34 & 32) != 0 ? r7.planHeaderUiModel : null, (r34 & 64) != 0 ? r7.paymentMethodUiModel : null, (r34 & 128) != 0 ? r7.planSummaryUiModel : null, (r34 & 256) != 0 ? r7.paymentScheduleUiModel : null, (r34 & 512) != 0 ? r7.planActivityUiModel : null, (r34 & 1024) != 0 ? r7.toastMessage : null, (r34 & 2048) != 0 ? r7.alertMessage : null, (r34 & 4096) != 0 ? r7.isAlertActionable : false, (r34 & 8192) != 0 ? r7.turnOffAutopayContent : null, (r34 & 16384) != 0 ? r7.snoozeArgs : null, (r34 & 32768) != 0 ? success.getUiModel().shouldShowPaymentMethod : false);
                            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success(copy2, null, null, 6, null), null, 2, null);
                        }
                    } else {
                        copy = r7.copy((r34 & 1) != 0 ? r7.title : null, (r34 & 2) != 0 ? r7.planId : null, (r34 & 4) != 0 ? r7.cpi : null, (r34 & 8) != 0 ? r7.eTag : null, (r34 & 16) != 0 ? r7.autopayEnabled : false, (r34 & 32) != 0 ? r7.planHeaderUiModel : null, (r34 & 64) != 0 ? r7.paymentMethodUiModel : null, (r34 & 128) != 0 ? r7.planSummaryUiModel : null, (r34 & 256) != 0 ? r7.paymentScheduleUiModel : null, (r34 & 512) != 0 ? r7.planActivityUiModel : null, (r34 & 1024) != 0 ? r7.toastMessage : null, (r34 & 2048) != 0 ? r7.alertMessage : null, (r34 & 4096) != 0 ? r7.isAlertActionable : false, (r34 & 8192) != 0 ? r7.turnOffAutopayContent : null, (r34 & 16384) != 0 ? r7.snoozeArgs : null, (r34 & 32768) != 0 ? success.getUiModel().shouldShowPaymentMethod : false);
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading(copy), null, 2, null);
                    }
                } else {
                    copy3 = r7.copy((r34 & 1) != 0 ? r7.title : null, (r34 & 2) != 0 ? r7.planId : null, (r34 & 4) != 0 ? r7.cpi : null, (r34 & 8) != 0 ? r7.eTag : null, (r34 & 16) != 0 ? r7.autopayEnabled : false, (r34 & 32) != 0 ? r7.planHeaderUiModel : null, (r34 & 64) != 0 ? r7.paymentMethodUiModel : null, (r34 & 128) != 0 ? r7.planSummaryUiModel : null, (r34 & 256) != 0 ? r7.paymentScheduleUiModel : null, (r34 & 512) != 0 ? r7.planActivityUiModel : null, (r34 & 1024) != 0 ? r7.toastMessage : ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.PaymentSuccessReceived) event).getMessage(), (r34 & 2048) != 0 ? r7.alertMessage : null, (r34 & 4096) != 0 ? r7.isAlertActionable : false, (r34 & 8192) != 0 ? r7.turnOffAutopayContent : null, (r34 & 16384) != 0 ? r7.snoozeArgs : null, (r34 & 32768) != 0 ? success.getUiModel().shouldShowPaymentMethod : false);
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading(copy3), null, 2, null);
                }
            }
        } else {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading loading = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnBackClicked) {
                if (((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnBackClicked) event).getSendPaymentResult()) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.SendPaymentSuccessResult("Payment completed successfully"));
                } else {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateBack.INSTANCE);
                }
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnLoadData) {
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded) {
                com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel uiModel = loading.getUiModel();
                copy4 = r6.copy((r34 & 1) != 0 ? r6.title : null, (r34 & 2) != 0 ? r6.planId : null, (r34 & 4) != 0 ? r6.cpi : null, (r34 & 8) != 0 ? r6.eTag : null, (r34 & 16) != 0 ? r6.autopayEnabled : false, (r34 & 32) != 0 ? r6.planHeaderUiModel : null, (r34 & 64) != 0 ? r6.paymentMethodUiModel : null, (r34 & 128) != 0 ? r6.planSummaryUiModel : null, (r34 & 256) != 0 ? r6.paymentScheduleUiModel : null, (r34 & 512) != 0 ? r6.planActivityUiModel : null, (r34 & 1024) != 0 ? r6.toastMessage : uiModel != null ? uiModel.getToastMessage() : null, (r34 & 2048) != 0 ? r6.alertMessage : null, (r34 & 4096) != 0 ? r6.isAlertActionable : false, (r34 & 8192) != 0 ? r6.turnOffAutopayContent : null, (r34 & 16384) != 0 ? r6.snoozeArgs : null, (r34 & 32768) != 0 ? ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnPlanDetailsLoaded) event).getUiModel().shouldShowPaymentMethod : false);
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Success(copy4, null, null, 6, null), null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnToastDismiss) {
                com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiModel uiModel2 = loading.getUiModel();
                if (uiModel2 != null) {
                    planDetailsUiModel = uiModel2.copy((r34 & 1) != 0 ? uiModel2.title : null, (r34 & 2) != 0 ? uiModel2.planId : null, (r34 & 4) != 0 ? uiModel2.cpi : null, (r34 & 8) != 0 ? uiModel2.eTag : null, (r34 & 16) != 0 ? uiModel2.autopayEnabled : false, (r34 & 32) != 0 ? uiModel2.planHeaderUiModel : null, (r34 & 64) != 0 ? uiModel2.paymentMethodUiModel : null, (r34 & 128) != 0 ? uiModel2.planSummaryUiModel : null, (r34 & 256) != 0 ? uiModel2.paymentScheduleUiModel : null, (r34 & 512) != 0 ? uiModel2.planActivityUiModel : null, (r34 & 1024) != 0 ? uiModel2.toastMessage : null, (r34 & 2048) != 0 ? uiModel2.alertMessage : null, (r34 & 4096) != 0 ? uiModel2.isAlertActionable : false, (r34 & 8192) != 0 ? uiModel2.turnOffAutopayContent : null, (r34 & 16384) != 0 ? uiModel2.snoozeArgs : null, (r34 & 32768) != 0 ? uiModel2.shouldShowPaymentMethod : false);
                } else {
                    planDetailsUiModel = null;
                }
                output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Loading(planDetailsUiModel), null, 2, null);
            } else {
                output$default = event instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent.OnError ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiState.Error.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
            }
        }
        if (output$default instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), false, 4, null);
            return output$default;
        }
        if (output$default instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), true);
            return output$default;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
