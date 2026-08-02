package com.paypal.oslo.feature.activity.ui.search.view.preview;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/view/preview/ActivitySearchPreviewProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/paypal/oslo/feature/activity/ui/search/view/preview/ActivitySearchPreviewParams;", "<init>", "()V", "Lkotlin/sequences/Sequence;", "getHighSpeedVideoSizes", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ActivitySearchPreviewProvider implements androidx.compose.ui.tooling.preview.PreviewParameterProvider<com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams> getHighSpeedVideoFpsRangesFor;

    public ActivitySearchPreviewProvider() {
        com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams activitySearchPreviewParams = new com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams("Initial Empty State", new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState(null, null, null, null, 15, null), null, null, null, 28, null);
        com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams activitySearchPreviewParams2 = new com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams("Search Results", new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState("results", "results", null, null, 12, null), com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchFilterScreenPreviewKt.access$getMockSearchResults(), null, null, 24, null);
        com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams activitySearchPreviewParams3 = new com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams("Loading State", new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState(null, "loading", null, null, 13, null), null, null, new androidx.paging.LoadStates(androidx.paging.LoadState.Loading.INSTANCE, new androidx.paging.LoadState.NotLoading(false), new androidx.paging.LoadState.NotLoading(true)), 12, null);
        com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams activitySearchPreviewParams4 = new com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams("Error State", new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState("error", "error", null, null, 12, null), null, null, new androidx.paging.LoadStates(new androidx.paging.LoadState.Error(new java.lang.Throwable("Simulated error")), new androidx.paging.LoadState.NotLoading(false), new androidx.paging.LoadState.NotLoading(true)), 12, null);
        com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams activitySearchPreviewParams5 = new com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams("Empty Results State", new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState(null, "empty", null, null, 13, null), null, null, new androidx.paging.LoadStates(new androidx.paging.LoadState.NotLoading(true), new androidx.paging.LoadState.NotLoading(false), new androidx.paging.LoadState.NotLoading(true)), 12, null);
        com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams activitySearchPreviewParams6 = new com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams("Short Query State", new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState(null, "ab", null, null, 13, null), null, null, null, 28, null);
        com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams activitySearchPreviewParams7 = new com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams("Suggestions shimmer", new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState("su", null, null, null, 12, null), null, com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Loading.INSTANCE, null, 20, null);
        com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState activitySearchUiState = new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState("sug", null, null, null, 12, null);
        com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult activitySearchSuggestionResult = new com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult(new com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data(com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchFilterScreenPreviewKt.mockSuggestions()));
        activitySearchSuggestionResult.transformToDomainResult$activity_prodRelease();
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        this.getHighSpeedVideoFpsRangesFor = kotlin.sequences.SequencesKt.sequenceOf((java.lang.Object[]) new com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams[]{activitySearchPreviewParams, activitySearchPreviewParams2, activitySearchPreviewParams3, activitySearchPreviewParams4, activitySearchPreviewParams5, activitySearchPreviewParams6, activitySearchPreviewParams7, new com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams("Suggestions results", activitySearchUiState, null, new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(activitySearchSuggestionResult)), null, 20, null), new com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams("With Selected Filter", new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState(null, null, null, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType.Refunds.INSTANCE, 7, null), null, null, null, 28, null)});
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final /* bridge */ java.lang.String getDisplayName(int i) {
        return super.getDisplayName(i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final kotlin.sequences.Sequence<com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams> getValues() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
