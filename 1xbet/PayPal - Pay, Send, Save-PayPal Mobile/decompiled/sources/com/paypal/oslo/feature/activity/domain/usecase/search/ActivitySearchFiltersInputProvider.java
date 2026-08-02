package com.paypal.oslo.feature.activity.domain.usecase.search;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/search/ActivitySearchFiltersInputProvider;", "", "<init>", "()V", "", "query", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "getActivitySearchInputQueryType$activity_prodRelease", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitySearchSuggestionsInput;", "getSearchSuggestionSearchInput$activity_prodRelease", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivitySearchSuggestionsInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivitySearchFiltersInputProvider {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchFiltersInputProvider INSTANCE = new com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchFiltersInputProvider();

    private ActivitySearchFiltersInputProvider() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType getActivitySearchInputQueryType$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchFiltersInputProvider activitySearchFiltersInputProvider, java.lang.String str, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            activitySearchFilterType = null;
        }
        return activitySearchFiltersInputProvider.getActivitySearchInputQueryType$activity_prodRelease(str, activitySearchFilterType);
    }

    public final com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType getActivitySearchInputQueryType$activity_prodRelease(java.lang.String query, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType filter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        kotlin.Pair<java.util.Date, java.util.Date> transformInUTCFormat = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.transformInUTCFormat(new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year(-3, 0, 2, null));
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
        return new com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerPaginationQueryType(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(new com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Completed(null, 1, null), new com.paypal.oslo.api.graphql.schema.type.ActivitiesInput(id, new com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput(com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.getUTCStringValue$activity_prodRelease(transformInUTCFormat.getFirst())), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.getUTCStringValue$activity_prodRelease(transformInUTCFormat.getSecond())), com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchExtensionKt.toSearchTextOptional(filter, query), null, null, null, null, null, null, null, null, null, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchExtensionKt.toMoneyMovementDirectionOptional(filter), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536866808, null), com.apollographql.apollo.api.Optional.INSTANCE.present(60), null, 8, null))));
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput getSearchSuggestionSearchInput$activity_prodRelease(java.lang.String query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        kotlin.Pair<java.util.Date, java.util.Date> transformInUTCFormat = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.transformInUTCFormat(new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year(-3, 0, 2, null));
        return new com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput(com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.getUTCStringValue$activity_prodRelease(transformInUTCFormat.getFirst())), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.getUTCStringValue$activity_prodRelease(transformInUTCFormat.getSecond())), query, 3);
    }
}
