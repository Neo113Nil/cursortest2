package com.paypal.oslo.feature.activity.ui.search.model.states;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiState;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiState;Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivitySearchReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState, com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent, com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ActivitySearchReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ActivitySearchReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState, com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect>> reduce(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState state, com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchQueryChanged)) {
            if (!(event instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SuggestionItemClicked)) {
                if (!(event instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.BackClicked)) {
                    if (!(event instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemClicked)) {
                        if (!(event instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.FilterChipClicked)) {
                            if (event instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchSubmitted) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState.copy$default(state, null, kotlin.text.StringsKt.trim(((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchSubmitted) event).getQuery()).toString(), null, null, 13, null), null, 2, null);
                            }
                            if (event instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchCleared) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState.copy$default(state, "", null, null, null, 12, null), null, 2, null);
                            }
                            if (!(event instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemPrimaryActionClicked)) {
                                if (!(event instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.XoomTransactionTileActionPressedEvent)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleXoomTransactionTileAction(((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.XoomTransactionTileActionPressedEvent) event).getDestinationKey()));
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleSearchResultPrimaryAction(((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemPrimaryActionClicked) event).getActivityActionModel()));
                        }
                        com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.FilterChipClicked filterChipClicked = (com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.FilterChipClicked) event;
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState.copy$default(state, "", null, null, kotlin.jvm.internal.Intrinsics.areEqual(filterChipClicked.getFilter(), state.getSelectedFilter()) ? null : filterChipClicked.getFilter(), 4, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateToActivityDetailScreen(((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemClicked) event).getActivityTransactionModel()));
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateBack.INSTANCE);
            }
            com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SuggestionItemClicked suggestionItemClicked = (com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SuggestionItemClicked) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState.copy$default(state, suggestionItemClicked.getSuggestion(), suggestionItemClicked.getSuggestion(), null, null, 12, null), null, 2, null);
        }
        java.lang.String obj = kotlin.text.StringsKt.trim(((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchQueryChanged) event).getQuery()).toString();
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, state.getCurrentQuery())) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(state, null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState.copy$default(state, obj, null, null, null, 4, null), null, 2, null);
    }
}
