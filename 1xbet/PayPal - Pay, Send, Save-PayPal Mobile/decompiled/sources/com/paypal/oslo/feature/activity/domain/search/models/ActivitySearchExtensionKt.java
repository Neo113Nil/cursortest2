package com.paypal.oslo.feature.activity.domain.search.models;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", "", "defaultQuery", "Lcom/apollographql/apollo/api/Optional;", "toSearchTextOptional", "(Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;Ljava/lang/String;)Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyMovementDirection;", "toMoneyMovementDirectionOptional", "(Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;)Lcom/apollographql/apollo/api/Optional;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivitySearchExtensionKt {
    public static final com.apollographql.apollo.api.Optional<java.lang.String> toSearchTextOptional(com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (activitySearchFilterType instanceof com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType) {
            return com.apollographql.apollo.api.Optional.INSTANCE.present(((com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType) activitySearchFilterType).getSearchText());
        }
        if (activitySearchFilterType instanceof com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType) {
            return com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        if (activitySearchFilterType != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.apollographql.apollo.api.Optional.INSTANCE.present(str);
    }

    public static final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyMovementDirection> toMoneyMovementDirectionOptional(com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType) {
        return activitySearchFilterType instanceof com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType ? com.apollographql.apollo.api.Optional.INSTANCE.present(((com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType) activitySearchFilterType).getMoneyMovementDirection()) : com.apollographql.apollo.api.Optional.INSTANCE.absent();
    }
}
