package com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/widgetFullScreen/ActivityWidgetFullScreenUseCase;", "", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;)V", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "activityLedgerUseCaseInputQueryType", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "invoke", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetFullScreenUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ActivityWidgetFullScreenUseCase(com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository iActivityLedgerRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityLedgerRepository, "");
        this.getHighSpeedVideoFpsRanges = iActivityLedgerRepository;
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> invoke(com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType activityLedgerUseCaseInputQueryType) {
        com.apollographql.apollo.api.Query access$prepareLedgerQueryBasedOnCaseInput;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerUseCaseInputQueryType, "");
        com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper activityLedgerUseCaseInputQueryMapper = com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper.INSTANCE;
        java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> activityInput = activityLedgerUseCaseInputQueryType.getActivityInput();
        if (activityLedgerUseCaseInputQueryType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityWidgetQueryType) {
            access$prepareLedgerQueryBasedOnCaseInput = com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper.access$prepareWidgetQueryBasedOnCaseInput(activityLedgerUseCaseInputQueryMapper, activityInput);
        } else if ((activityLedgerUseCaseInputQueryType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerQueryType) || (activityLedgerUseCaseInputQueryType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerFilterQueryType)) {
            access$prepareLedgerQueryBasedOnCaseInput = com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper.access$prepareLedgerQueryBasedOnCaseInput(activityLedgerUseCaseInputQueryMapper, activityInput);
        } else {
            if (!(activityLedgerUseCaseInputQueryType instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerPaginationQueryType)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            access$prepareLedgerQueryBasedOnCaseInput = com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryMapper.access$prepareLedgerPaginationQueryBasedOnCaseInput(activityLedgerUseCaseInputQueryMapper, activityInput);
        }
        if (!(access$prepareLedgerQueryBasedOnCaseInput instanceof com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery)) {
            access$prepareLedgerQueryBasedOnCaseInput = null;
        }
        com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getUserFilteredActivitiesQuery = (com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery) access$prepareLedgerQueryBasedOnCaseInput;
        if (getUserFilteredActivitiesQuery != null) {
            return this.getHighSpeedVideoFpsRanges.fetchGetFilteredActivitiesWidgetNextPageItems(getUserFilteredActivitiesQuery);
        }
        throw new java.lang.UnsupportedOperationException("Failed to cast query result to expected type ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(activityLedgerUseCaseInputQueryType.getClass()).getSimpleName())));
    }
}
