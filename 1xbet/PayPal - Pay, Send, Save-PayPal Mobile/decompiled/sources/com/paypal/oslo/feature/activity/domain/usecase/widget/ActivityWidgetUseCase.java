package com.paypal.oslo.feature.activity.domain.usecase.widget;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/widget/ActivityWidgetUseCase;", "", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;)V", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "activityWidgetInputQueryType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "invoke", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery;", "Lcom/paypal/oslo/feature/activity/domain/base/alias/FilteredActivitiesQuery;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ActivityWidgetUseCase(com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository iActivityLedgerRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityLedgerRepository, "");
        this.getHighSpeedVideoFpsRanges = iActivityLedgerRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType activityLedgerUseCaseInputQueryType, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
        com.apollographql.apollo.api.Query access$prepareLedgerQueryBasedOnCaseInput;
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
            return Camera2StreamConfigurationMap(getUserFilteredActivitiesQuery, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Failed to cast query result to expected type ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(activityLedgerUseCaseInputQueryType.getClass()).getSimpleName())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getUserFilteredActivitiesQuery, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
        com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase$executeRepositoryQueryForResult$1 activityWidgetUseCase$executeRepositoryQueryForResult$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase$executeRepositoryQueryForResult$1) {
            activityWidgetUseCase$executeRepositoryQueryForResult$1 = (com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase$executeRepositoryQueryForResult$1) continuation;
            if ((activityWidgetUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                activityWidgetUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = activityWidgetUseCase$executeRepositoryQueryForResult$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityWidgetUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository iActivityLedgerRepository = this.getHighSpeedVideoFpsRanges;
                    activityWidgetUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getUserFilteredActivitiesQuery);
                    activityWidgetUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoSizes = 1;
                    obj = iActivityLedgerRepository.fetchActivityWidgetItems(getUserFilteredActivitiesQuery, activityWidgetUseCase$executeRepositoryQueryForResult$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.activity.domain.widget.remote.ActivityWidgetResult activityWidgetResult = (com.paypal.oslo.feature.activity.domain.widget.remote.ActivityWidgetResult) ((arrow.core.Either.Right) either).getValue();
                    activityWidgetResult.transformToDomainResult$activity_prodRelease();
                    return new arrow.core.Ior.Right(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(activityWidgetResult));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModelKt.toDomainErrorUIModel((com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError) ((arrow.core.Either.Left) either).getValue()), 1, null));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        activityWidgetUseCase$executeRepositoryQueryForResult$1 = new com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase$executeRepositoryQueryForResult$1(this, continuation);
        java.lang.Object obj2 = activityWidgetUseCase$executeRepositoryQueryForResult$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityWidgetUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
