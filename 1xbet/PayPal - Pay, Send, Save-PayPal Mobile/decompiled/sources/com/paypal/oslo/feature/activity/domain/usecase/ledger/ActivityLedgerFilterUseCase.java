package com.paypal.oslo.feature.activity.domain.usecase.ledger;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0014\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00172\u0006\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001eR\"\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerFilterUseCase;", "", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;", "repository", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "activityLedgerUseCaseInputQueryType", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "activityFilterType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "invoke", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserSectionedActivitiesQuery;", "Lcom/paypal/oslo/feature/activity/domain/base/alias/SectionedActivitiesQuery;", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/activity/graphql/GetUserSectionedActivitiesQuery;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/activity/domain/ledger/remote/ActivityItemsResult;", "", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/activity/domain/ledger/remote/ActivityItemsResult;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getNextPageCursor$activity_prodRelease", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "cursor", "updateCursorValue$activity_prodRelease", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "", "showEmptyUIContent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getShowEmptyUIContent$activity_prodRelease", "pageCursor", "getPageCursor$activity_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerFilterUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> pageCursor;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> showEmptyUIContent;

    @javax.inject.Inject
    public ActivityLedgerFilterUseCase(com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository iActivityLedgerRepository, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityLedgerRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoSizes = iActivityLedgerRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = dynamicConfiguration;
        this.showEmptyUIContent = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.pageCursor = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getShowEmptyUIContent$activity_prodRelease() {
        return this.showEmptyUIContent;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getPageCursor$activity_prodRelease() {
        return this.pageCursor;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType activityLedgerUseCaseInputQueryType, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
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
            return getHighResolutionOutputSizeshNQ4ISI(getUserSectionedActivitiesQuery, activityFilterType, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Failed to cast query result to expected type ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(activityLedgerUseCaseInputQueryType.getClass()).getSimpleName())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery getUserSectionedActivitiesQuery, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
        com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase$executeRepositoryQueryForResult$1 activityLedgerFilterUseCase$executeRepositoryQueryForResult$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult activityNetworkFailureResult;
        if (continuation instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase$executeRepositoryQueryForResult$1) {
            activityLedgerFilterUseCase$executeRepositoryQueryForResult$1 = (com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase$executeRepositoryQueryForResult$1) continuation;
            if ((activityLedgerFilterUseCase$executeRepositoryQueryForResult$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                activityLedgerFilterUseCase$executeRepositoryQueryForResult$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = activityLedgerFilterUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityLedgerFilterUseCase$executeRepositoryQueryForResult$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository iActivityLedgerRepository = this.getHighSpeedVideoSizes;
                    activityLedgerFilterUseCase$executeRepositoryQueryForResult$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getUserSectionedActivitiesQuery);
                    activityLedgerFilterUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoSizes = activityFilterType;
                    activityLedgerFilterUseCase$executeRepositoryQueryForResult$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = iActivityLedgerRepository.fetchActivityLedgerItems(getUserSectionedActivitiesQuery, activityLedgerFilterUseCase$executeRepositoryQueryForResult$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    activityFilterType = (com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType) activityLedgerFilterUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError iActivityDomainError = (com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult activitiesQueriesResult = null;
                    java.lang.Object[] objArr = 0;
                    java.lang.Object[] objArr2 = 0;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(activityFilterType, new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null))) {
                        activityNetworkFailureResult = new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModelKt.toDomainErrorUIModel(iActivityDomainError), 1, null);
                    } else {
                        com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult activityItemsResult = new com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult(activitiesQueriesResult, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
                        getHighSpeedVideoSizes(activityItemsResult, activityFilterType);
                        activityNetworkFailureResult = new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(activityItemsResult, com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModelKt.toDomainErrorUIModel(iActivityDomainError));
                    }
                    right = new arrow.core.Either.Left(activityNetworkFailureResult);
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult activityItemsResult2 = (com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult) ((arrow.core.Either.Right) right).getValue();
                    activityItemsResult2.getActivityItemDomainTransformedResultForFilters$activity_prodRelease();
                    activityItemsResult2.filterSupportedActions$activity_prodRelease(com.paypal.oslo.feature.activity.domain.usecase.common.extensions.DynamicConfigurationExtensionsKt.getLedgerSupportedActions(this.getHighResolutionOutputSizeshNQ4ISI));
                    updateCursorValue$activity_prodRelease(activityItemsResult2.getGetHighSpeedVideoFpsRanges());
                    getHighSpeedVideoSizes(activityItemsResult2, activityFilterType);
                    right = new arrow.core.Either.Right(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(activityItemsResult2));
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return right.toIor();
            }
        }
        activityLedgerFilterUseCase$executeRepositoryQueryForResult$1 = new com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase$executeRepositoryQueryForResult$1(this, continuation);
        java.lang.Object obj2 = activityLedgerFilterUseCase$executeRepositoryQueryForResult$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityLedgerFilterUseCase$executeRepositoryQueryForResult$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        return right.toIor();
    }

    private static void getHighSpeedVideoSizes(com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult activityItemsResult, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(activityFilterType, new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null)) || !activityItemsResult.getActivityItemDomainList$activity_prodRelease().isEmpty()) {
            return;
        }
        activityItemsResult.addActivityItemPlaceHolder$activity_prodRelease(com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityCompletedItemsDomainResultMapper.INSTANCE.getSectionHeader("", true));
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getNextPageCursor$activity_prodRelease() {
        return this.pageCursor;
    }

    public final void updateCursorValue$activity_prodRelease(java.lang.String cursor) {
        this.pageCursor.setValue(cursor);
    }
}
