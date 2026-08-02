package com.paypal.oslo.feature.activity.domain.usecase.ledger;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0013\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0014\u0010\u0019J\u0017\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001dR\"\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerUseCase;", "", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;", "repository", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "activityFeatureManager", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "activityLedgerUseCaseInputQueryType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "invoke", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserSectionedActivitiesQuery;", "Lcom/paypal/oslo/feature/activity/domain/base/alias/SectionedActivitiesQuery;", "p0", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/activity/graphql/GetUserSectionedActivitiesQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "p1", "(ZLcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;)Larrow/core/Ior;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getNextPageCursor$activity_prodRelease", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "cursor", "", "updateCursorValue$activity_prodRelease", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/manager/ActivityFeatureManager;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "showEmptyUIContent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getShowEmptyUIContent$activity_prodRelease", "pageCursor", "getPageCursor$activity_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.manager.ActivityFeatureManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> pageCursor;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> showEmptyUIContent;

    @javax.inject.Inject
    public ActivityLedgerUseCase(com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository iActivityLedgerRepository, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityLedgerRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoFpsRanges = iActivityLedgerRepository;
        this.getHighSpeedVideoFpsRangesFor = activityFeatureManager;
        this.getHighSpeedVideoSizes = dynamicConfiguration;
        this.showEmptyUIContent = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.pageCursor = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getShowEmptyUIContent$activity_prodRelease() {
        return this.showEmptyUIContent;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getPageCursor$activity_prodRelease() {
        return this.pageCursor;
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
        if (!(access$prepareLedgerQueryBasedOnCaseInput instanceof com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery)) {
            access$prepareLedgerQueryBasedOnCaseInput = null;
        }
        com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery getUserSectionedActivitiesQuery = (com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery) access$prepareLedgerQueryBasedOnCaseInput;
        if (getUserSectionedActivitiesQuery != null) {
            return getHighSpeedVideoSizes(getUserSectionedActivitiesQuery, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Failed to cast query result to expected type ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(activityLedgerUseCaseInputQueryType.getClass()).getSimpleName())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery getUserSectionedActivitiesQuery, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
        com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase$executeRepositoryQueryForResult$1 activityLedgerUseCase$executeRepositoryQueryForResult$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase$executeRepositoryQueryForResult$1) {
            activityLedgerUseCase$executeRepositoryQueryForResult$1 = (com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase$executeRepositoryQueryForResult$1) continuation;
            if ((activityLedgerUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                activityLedgerUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = activityLedgerUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityLedgerUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighSpeedVideoFpsRangesFor.isLedgerMockApiCallEnabled()) {
                        com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository iActivityLedgerRepository = this.getHighSpeedVideoFpsRanges;
                        activityLedgerUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getUserSectionedActivitiesQuery);
                        activityLedgerUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoSizes = 1;
                        obj = iActivityLedgerRepository.fetchActivityLedgerItems(getUserSectionedActivitiesQuery, activityLedgerUseCase$executeRepositoryQueryForResult$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return getHighSpeedVideoSizes(true, (com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError) null);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError iActivityDomainError = (com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError) ((arrow.core.Either.Left) either).getValue();
                    updateCursorValue$activity_prodRelease(null);
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModelKt.toDomainErrorUIModel(iActivityDomainError), 1, null));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult activityItemsResult = (com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult) ((arrow.core.Either.Right) right).getValue();
                    activityItemsResult.getActivityItemDomainTransformedResult$activity_prodRelease();
                    activityItemsResult.filterSupportedActions$activity_prodRelease(com.paypal.oslo.feature.activity.domain.usecase.common.extensions.DynamicConfigurationExtensionsKt.getLedgerSupportedActions(this.getHighSpeedVideoSizes));
                    updateCursorValue$activity_prodRelease(activityItemsResult.getGetHighSpeedVideoFpsRanges());
                    right = new arrow.core.Either.Right(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(activityItemsResult));
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return right.toIor();
            }
        }
        activityLedgerUseCase$executeRepositoryQueryForResult$1 = new com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase$executeRepositoryQueryForResult$1(this, continuation);
        java.lang.Object obj2 = activityLedgerUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityLedgerUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        return right.toIor();
    }

    private final arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult> getHighSpeedVideoSizes(boolean p0, com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError p1) {
        updateCursorValue$activity_prodRelease(null);
        com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult mockActivityItemsResult = com.paypal.oslo.feature.activity.domain.ledger.remote.mock.ActivityLedgerGraphQLMockTestResults.INSTANCE.getMockActivityItemsResult();
        mockActivityItemsResult.getActivityItemDomainTransformedResult$activity_prodRelease();
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(mockActivityItemsResult));
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getNextPageCursor$activity_prodRelease() {
        return this.pageCursor;
    }

    public final void updateCursorValue$activity_prodRelease(java.lang.String cursor) {
        this.pageCursor.setValue(cursor);
    }
}
