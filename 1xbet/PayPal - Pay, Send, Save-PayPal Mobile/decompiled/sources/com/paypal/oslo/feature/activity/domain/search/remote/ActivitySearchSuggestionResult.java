package com.paypal.oslo.feature.activity.domain.search.remote;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0015j\b\u0012\u0004\u0012\u00020\u0007`\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/search/remote/ActivitySearchSuggestionResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/IActivityRemoteBaseResultContract;", "Lcom/paypal/oslo/feature/activity/graphql/GetActivitySearchSuggestionsQuery$Data;", "query", "<init>", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivitySearchSuggestionsQuery$Data;)V", "", "", "getSearchSuggestionsDomainList$activity_prodRelease", "()Ljava/util/List;", "", "isValid", "()Z", "", "transformToDomainResult$activity_prodRelease", "()V", "input", "toDomainModel", "Lcom/paypal/oslo/feature/activity/graphql/GetActivitySearchSuggestionsQuery$Data;", "getQuery", "()Lcom/paypal/oslo/feature/activity/graphql/GetActivitySearchSuggestionsQuery$Data;", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "getHighSpeedVideoSizes", "Ljava/util/ArrayList;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivitySearchSuggestionResult implements com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResultContract<com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.ArrayList<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data query;

    public ActivitySearchSuggestionResult(com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data data) {
        this.query = data;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
    }

    public /* synthetic */ ActivitySearchSuggestionResult(com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data data, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : data);
    }

    public final com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data getQuery() {
        return this.query;
    }

    public final java.util.List<java.lang.String> getSearchSuggestionsDomainList$activity_prodRelease() {
        return kotlin.collections.CollectionsKt.toList(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResultContract
    public final boolean isValid() {
        return this.query != null;
    }

    public final void transformToDomainResult$activity_prodRelease() {
        if (isValid()) {
            toDomainModel(this.query);
        }
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResultContract
    public final void toDomainModel(com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data input) {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        if (input != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.addAll(input.getActivitySearchSuggestions());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivitySearchSuggestionResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
