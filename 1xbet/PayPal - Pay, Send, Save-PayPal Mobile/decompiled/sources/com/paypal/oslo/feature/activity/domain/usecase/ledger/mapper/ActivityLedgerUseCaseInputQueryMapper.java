package com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u00028\u0000\"\u0012\b\u0000\u0010\u0006\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0080\b¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u00110\u0010*\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00060\rj\u0002`\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryMapper;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/Query;", "Lcom/apollographql/apollo/api/Query$Data;", "T", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "activityInputQueryType", "getActivityLedgerListQuery$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;)Lcom/apollographql/apollo/api/Query;", "", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitiesInput;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivitiesInput;", "key", "Lkotlin/Pair;", "", "getOrEmpty$activity_prodRelease", "(Ljava/util/Map;Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus;)Lkotlin/Pair;", "getEmptyFilterInput$activity_prodRelease", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivitiesInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerUseCaseInputQueryMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper();

    private ActivityLedgerUseCaseInputQueryMapper() {
    }

    public final /* synthetic */ <T extends com.apollographql.apollo.api.Query<? extends com.apollographql.apollo.api.Query.Data>> T getActivityLedgerListQuery$activity_prodRelease(com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType activityInputQueryType) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityInputQueryType, "");
        java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> activityInput = activityInputQueryType.getActivityInput();
        if (activityInputQueryType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityWidgetQueryType) {
            t = (T) access$prepareWidgetQueryBasedOnCaseInput(this, activityInput);
        } else if ((activityInputQueryType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerQueryType) || (activityInputQueryType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerFilterQueryType)) {
            t = (T) access$prepareLedgerQueryBasedOnCaseInput(this, activityInput);
        } else {
            if (!(activityInputQueryType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerPaginationQueryType)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            t = (T) access$prepareLedgerPaginationQueryBasedOnCaseInput(this, activityInput);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
        T t2 = t;
        if (t != null) {
            return t;
        }
        throw new java.lang.UnsupportedOperationException("Failed to cast query result to expected type ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(activityInputQueryType.getClass()).getSimpleName())));
    }

    public final kotlin.Pair<com.paypal.oslo.api.graphql.schema.type.ActivitiesInput, java.lang.Boolean> getOrEmpty$activity_prodRelease(java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> map, com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus activityGraphQLQueryFilterStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityGraphQLQueryFilterStatus, "");
        com.paypal.oslo.api.graphql.schema.type.ActivitiesInput activitiesInput = map.get(activityGraphQLQueryFilterStatus);
        if (activitiesInput == null) {
            activitiesInput = getEmptyFilterInput$activity_prodRelease();
        }
        return kotlin.TuplesKt.to(activitiesInput, java.lang.Boolean.valueOf(map.containsKey(activityGraphQLQueryFilterStatus)));
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivitiesInput getEmptyFilterInput$activity_prodRelease() {
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
        return new com.paypal.oslo.api.graphql.schema.type.ActivitiesInput(id, new com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null), null, null, 12, null);
    }

    public static final /* synthetic */ com.apollographql.apollo.api.Query access$prepareLedgerPaginationQueryBasedOnCaseInput(com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper activityLedgerUseCaseInputQueryMapper, java.util.Map map) {
        if (map.containsKey(new com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Completed(null, 1, null))) {
            return new com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery((com.paypal.oslo.api.graphql.schema.type.ActivitiesInput) kotlin.collections.MapsKt.getValue(map, new com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Completed(null, 1, null)));
        }
        throw new java.lang.UnsupportedOperationException("Unsupported queries are not yet implemented");
    }

    public static final /* synthetic */ com.apollographql.apollo.api.Query access$prepareLedgerQueryBasedOnCaseInput(com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper activityLedgerUseCaseInputQueryMapper, java.util.Map map) {
        com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Upcoming upcoming = new com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Upcoming(null, null, null, 7, null);
        com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Pending pending = new com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Pending(null, 1, null);
        com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Completed completed = new com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Completed(null, 1, null);
        kotlin.Pair<com.paypal.oslo.api.graphql.schema.type.ActivitiesInput, java.lang.Boolean> orEmpty$activity_prodRelease = activityLedgerUseCaseInputQueryMapper.getOrEmpty$activity_prodRelease(map, upcoming);
        com.paypal.oslo.api.graphql.schema.type.ActivitiesInput component1 = orEmpty$activity_prodRelease.component1();
        boolean booleanValue = orEmpty$activity_prodRelease.component2().booleanValue();
        return new com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery(component1, activityLedgerUseCaseInputQueryMapper.getOrEmpty$activity_prodRelease(map, pending).component1(), activityLedgerUseCaseInputQueryMapper.getOrEmpty$activity_prodRelease(map, completed).component1(), com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Boolean.valueOf(!booleanValue)), com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Boolean.valueOf(!r0.component2().booleanValue())));
    }

    public static final /* synthetic */ com.apollographql.apollo.api.Query access$prepareWidgetQueryBasedOnCaseInput(com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper activityLedgerUseCaseInputQueryMapper, java.util.Map map) {
        return new com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery(activityLedgerUseCaseInputQueryMapper.getOrEmpty$activity_prodRelease(map, new com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Recent(null, 1, null)).component1());
    }
}
