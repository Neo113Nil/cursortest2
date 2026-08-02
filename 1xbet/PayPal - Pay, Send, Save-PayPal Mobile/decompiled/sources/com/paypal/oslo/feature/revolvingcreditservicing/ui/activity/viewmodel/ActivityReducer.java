package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityEvent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityEvent$OnLoadActivitiesOverview;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "args", "output", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityEvent$OnLoadActivitiesOverview;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ActivityReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ActivityReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Initial) {
            return event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnViewCreate ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading(((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnViewCreate) event).getArgs()), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Initial) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading)) {
            if (state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading reloading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading) state;
                return event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesOverview ? output((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesOverview) event, reloading.getArgs()) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(reloading, event);
            }
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment)) {
                        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment)) {
                            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError)) {
                                if (state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Error) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                                }
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError cancelPaymentError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError) state;
                            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnRetryCancel) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment(cancelPaymentError.getUiModel(), cancelPaymentError.getRepaymentId(), cancelPaymentError.getArgs()), null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(cancelPaymentError, event);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment retryCancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment) state;
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnCancelPaymentSuccess) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading(retryCancelingPayment.getArgs(), retryCancelingPayment.getUiModel()), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.ShowCancelPaymentSuccessToast.INSTANCE);
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnCancelPaymentFailed) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError(retryCancelingPayment.getUiModel(), retryCancelingPayment.getRepaymentId(), retryCancelingPayment.getArgs()), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(retryCancelingPayment, event);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment cancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment) state;
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnCancelPaymentSuccess) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading(cancelingPayment.getArgs(), cancelingPayment.getUiModel()), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.DismissBottomSheetAndShowSuccessToast.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnCancelPaymentFailed) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelPaymentError(cancelingPayment.getUiModel(), cancelingPayment.getRepaymentId(), cancelingPayment.getArgs()), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.DismissCancelPaymentBottomSheet.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(cancelingPayment, event);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment startingCancelPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment) state;
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnDismissCancelPaymentBottomSheet) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready(startingCancelPayment.getUiModel(), startingCancelPayment.getArgs(), null, 4, null), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.DismissCancelPaymentBottomSheet.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnConfirmCancelPayment) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment(startingCancelPayment.getUiModel(), startingCancelPayment.getRepaymentId(), startingCancelPayment.getArgs()), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(startingCancelPayment, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnTryAgainButtonClick) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading(ready.getArgs(), ready.getUiModel()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesOverview) {
                return output((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesOverview) event, ready.getArgs());
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnScrollTriggersToLoadMoreActivities) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel uiModel = ready.getUiModel();
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel paginationState = ready.getUiModel().getPaginationState();
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.copy$default(uiModel, null, null, null, paginationState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.CanLoadMore ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.ShouldLoadMore(((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.CanLoadMore) paginationState).getNextOffset().intValue()) : paginationState, null, null, 55, null), null, null, 6, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnAddingMoreActivities) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnAddingMoreActivities onAddingMoreActivities = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnAddingMoreActivities) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityUiModelMapperKt.addMoreTransactions(ready.getUiModel(), onAddingMoreActivities.getPending(), onAddingMoreActivities.getCompleted(), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.INSTANCE.create(onAddingMoreActivities.getHasNextPage(), onAddingMoreActivities.getNextOffset())), null, null, 6, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadingMoreActivities) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.copy$default(ready.getUiModel(), null, null, null, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.LoadingMore.INSTANCE, null, null, 55, null), null, null, 6, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnTransactionClick) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenTransactionDetail(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.TransactionToActivityDetailArgsMapperKt.mapToActivityDetailDestinationArgs(((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnTransactionClick) event).getTransaction().getRawTransaction(), ready.getArgs().getCreditAccountId(), ready.getArgs().getCpi(), ready.getCustomerServiceContact())));
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnCancelTransactionClick) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.StartingCancelPayment(ready.getUiModel(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnCancelTransactionClick) event).getTransaction().getId(), ready.getArgs()), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.ShowCancelPaymentBottomSheet.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnGoToStatementClick) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.OpenStatements(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubArgsToStatementHubArgsMapperKt.toStatementHubArgs(ready.getArgs())));
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnPaymentCanceled) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Reloading(ready.getArgs(), ready.getUiModel()), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect.ShowCancelPaymentSuccessToast.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadingMoreActivitiesFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.copy$default(ready.getUiModel(), null, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Error(((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadingMoreActivitiesFailed) event).getNextOffset()), null, null, 55, null), null, null, 6, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnClearPaginationError) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel paginationState2 = ready.getUiModel().getPaginationState();
                if (!(paginationState2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.CanLoadMore) && !(paginationState2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Disabled)) {
                    if ((paginationState2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Error) || (paginationState2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.LoadingMore)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.copy$default(ready.getUiModel(), null, null, null, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Disabled.INSTANCE, null, null, 55, null), null, null, 6, null), null, 2, null);
                    }
                    if (!(paginationState2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.ShouldLoadMore)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.copy$default(ready.getUiModel(), null, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.CanLoadMore(((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.ShouldLoadMore) paginationState2).getNextOffset().intValue()), null, null, 55, null), null, null, 6, null), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading loading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Loading) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesOverview) {
            return output((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesOverview) event, loading.getArgs());
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesAndPaymentsFailed) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Error error = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_pending));
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_upcoming)), error, new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivitySectionUiState.Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_completed)), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.Disabled.INSTANCE, null, null, 48, null), loading.getArgs(), 0 == true ? 1 : 0, 4, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }

    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityUiEffect>> output(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnLoadActivitiesOverview onLoadActivitiesOverview, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLoadActivitiesOverview, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityHubArgs, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel activityUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel(onLoadActivitiesOverview.getUpcoming(), onLoadActivitiesOverview.getPending(), onLoadActivitiesOverview.getCompleted(), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityPaginationStateUiModel.INSTANCE.create(onLoadActivitiesOverview.getHasNextPage(), onLoadActivitiesOverview.getNextOffset()), null, null, 48, null);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = onLoadActivitiesOverview.getCustomerServiceContact();
        if (customerServiceContact == null) {
            customerServiceContact = activityHubArgs.getCustomerServiceContact();
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.Ready(activityUiModel, activityHubArgs, customerServiceContact), null, 2, null);
    }
}
