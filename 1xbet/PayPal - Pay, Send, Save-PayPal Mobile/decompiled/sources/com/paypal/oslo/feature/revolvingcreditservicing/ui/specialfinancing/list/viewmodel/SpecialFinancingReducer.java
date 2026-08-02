package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/viewmodel/SpecialFinancingEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SpecialFinancingReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SpecialFinancingReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "SpecialFinancingReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent event) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.InitializingUiModel)) {
                    if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready)) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Empty.INSTANCE)) {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Error.INSTANCE)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnViewCreated.INSTANCE)) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Loading.INSTANCE, null, 2, null);
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnBackClicked.INSTANCE)) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateBack.INSTANCE);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnBackClicked.INSTANCE)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateBack.INSTANCE);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready) state;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnBackClicked.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateBack.INSTANCE);
                    }
                    if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnItemClicked)) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnScrollTriggersToLoadMorePromotionalActivities.INSTANCE)) {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivities.INSTANCE)) {
                                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnAddingMorePromotionalActivities) {
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnAddingMorePromotionalActivities onAddingMorePromotionalActivities = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnAddingMorePromotionalActivities) event;
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModelKt.addMoreItems(ready.getUiModel(), onAddingMorePromotionalActivities.getExpiring(), onAddingMorePromotionalActivities.getActive(), onAddingMorePromotionalActivities.getPaidOff(), com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.INSTANCE.create(onAddingMorePromotionalActivities.getHasNextPage(), onAddingMorePromotionalActivities.getNextOffset())), null, 2, null), null, 2, null);
                                }
                                if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivitiesFailed)) {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnClearPaginationError.INSTANCE)) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
                                    }
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel paginationState = ready.getUiModel().getPaginationState();
                                    if ((paginationState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.CanLoadMore) || (paginationState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.Disabled)) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
                                    }
                                    if ((paginationState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.Error) || (paginationState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.LoadingMore)) {
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel.copy$default(ready.getUiModel(), null, null, null, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.Disabled.INSTANCE, 7, null), null, 2, null), null, 2, null);
                                    }
                                    if (!(paginationState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.ShouldLoadMore)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel.copy$default(ready.getUiModel(), null, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.CanLoadMore(((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.ShouldLoadMore) paginationState).getNextOffset().intValue()), 7, null), null, 2, null), null, 2, null);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel.copy$default(ready.getUiModel(), null, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.Error(((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnLoadingMorePromotionalActivitiesFailed) event).getNextOffset()), 7, null), null, 2, null), null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel.copy$default(ready.getUiModel(), null, null, null, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.LoadingMore.INSTANCE, 7, null), null, 2, null), null, 2, null);
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel uiModel = ready.getUiModel();
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel paginationState2 = ready.getUiModel().getPaginationState();
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready.copy$default(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingUiModel.copy$default(uiModel, null, null, null, paginationState2 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.CanLoadMore ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.ShouldLoadMore(((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.uimodel.SpecialFinancingPaginationStateUiModel.CanLoadMore) paginationState2).getNextOffset().intValue()) : paginationState2, 7, null), null, 2, null), null, 2, null);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnItemClicked onItemClicked = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnItemClicked) event;
                    java.util.Iterator<T> it = ready.getSpecialFinancingArgs().getSpecialFinancingActivities().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) obj).getPromoId().toString(), onItemClicked.getItemId())) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity promotionalActivity = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivity) obj;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, promotionalActivity != null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateToDetail(promotionalActivity, ready.getSpecialFinancingArgs().getCreditProductIdentifier()) : null);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.InitializingUiModel initializingUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.InitializingUiModel) state;
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized onUiModelInitialized = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized) event;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready(onUiModelInitialized.getUiModel(), onUiModelInitialized.getSpecialFinancingArgs()), null, 2, null);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnNoSpecialFinancingPlans.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Empty.INSTANCE, null, 2, null);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoadFailed.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Error.INSTANCE, null, 2, null);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnBackClicked.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initializingUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateBack.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initializingUiModel, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Loading loading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoaded) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.InitializingUiModel(((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoaded) event).getPage()), null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoadFailed.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Error.INSTANCE, null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnBackClicked.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateBack.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Initial) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnViewCreated.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Loading.INSTANCE, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoaded) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.InitializingUiModel(((com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnDataLoaded) event).getPage()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized onUiModelInitialized2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnUiModelInitialized) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingState.Ready(onUiModelInitialized2.getUiModel(), onUiModelInitialized2.getSpecialFinancingArgs()), null, 2, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingEvent.OnBackClicked.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingUiEffect.NavigateBack.INSTANCE);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
