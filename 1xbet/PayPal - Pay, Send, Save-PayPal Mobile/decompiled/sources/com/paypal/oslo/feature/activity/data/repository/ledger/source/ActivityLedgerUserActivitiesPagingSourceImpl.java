package com.paypal.oslo.feature.activity.data.repository.ledger.source;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B9\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001b2\u0006\u0010\u001a\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\f\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u000e\u001a\u00020\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010."}, d2 = {"Lcom/paypal/oslo/feature/activity/data/repository/ledger/source/ActivityLedgerUserActivitiesPagingSourceImpl;", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/source/IActivityLedgerUserActivitiesSource;", "Landroidx/paging/PagingSource;", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "completedActivitiesPageCursor", "Lcom/paypal/oslo/feature/activity/graphql/GetUserActivitiesQuery;", "completedActivitiesQuery", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "errorMapper", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/paypal/oslo/feature/activity/graphql/GetUserActivitiesQuery;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;)V", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/String;", "query", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserActivitiesQuery$Data;", "getUserActivitiesLedgerItems", "(Lcom/paypal/oslo/feature/activity/graphql/GetUserActivitiesQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getCompletedActivitiesPageCursor$activity_prodRelease", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserActivitiesQuery;", "getCompletedActivitiesQuery$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/graphql/GetUserActivitiesQuery;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIoDispatcher$activity_prodRelease", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/apollographql/apollo/ApolloClient;", "getApolloClient$activity_prodRelease", "()Lcom/apollographql/apollo/ApolloClient;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "getErrorMapper$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerUserActivitiesPagingSourceImpl extends androidx.paging.PagingSource<java.lang.String, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> implements com.paypal.oslo.feature.activity.domain.repository.ledger.source.IActivityLedgerUserActivitiesSource {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient apolloClient;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> completedActivitiesPageCursor;
    private final com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery completedActivitiesQuery;
    private final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper errorMapper;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher;

    public ActivityLedgerUserActivitiesPagingSourceImpl(kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> mutableStateFlow, com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery getUserActivitiesQuery, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableStateFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserActivitiesQuery, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityErrorMapper, "");
        this.completedActivitiesPageCursor = mutableStateFlow;
        this.completedActivitiesQuery = getUserActivitiesQuery;
        this.ioDispatcher = coroutineDispatcher;
        this.apolloClient = apolloClient;
        this.errorMapper = iActivityErrorMapper;
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getCompletedActivitiesPageCursor$activity_prodRelease() {
        return this.completedActivitiesPageCursor;
    }

    /* renamed from: getCompletedActivitiesQuery$activity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery getCompletedActivitiesQuery() {
        return this.completedActivitiesQuery;
    }

    public /* synthetic */ ActivityLedgerUserActivitiesPagingSourceImpl(kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow, com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery getUserActivitiesQuery, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableStateFlow, getUserActivitiesQuery, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher, apolloClient, iActivityErrorMapper);
    }

    /* renamed from: getIoDispatcher$activity_prodRelease, reason: from getter */
    public final kotlinx.coroutines.CoroutineDispatcher getIoDispatcher() {
        return this.ioDispatcher;
    }

    /* renamed from: getApolloClient$activity_prodRelease, reason: from getter */
    public final com.apollographql.apollo.ApolloClient getApolloClient() {
        return this.apolloClient;
    }

    /* renamed from: getErrorMapper$activity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper getErrorMapper() {
        return this.errorMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:11:0x0034, B:12:0x0087, B:14:0x0091, B:16:0x009b, B:18:0x00a1, B:20:0x00a9, B:22:0x00af, B:23:0x00b5, B:25:0x00cc, B:27:0x00d2, B:28:0x00d8, B:34:0x00de, B:36:0x00e2, B:38:0x00fd, B:39:0x0102, B:43:0x0043, B:45:0x004b, B:46:0x0053), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:11:0x0034, B:12:0x0087, B:14:0x0091, B:16:0x009b, B:18:0x00a1, B:20:0x00a9, B:22:0x00af, B:23:0x00b5, B:25:0x00cc, B:27:0x00d2, B:28:0x00d8, B:34:0x00de, B:36:0x00e2, B:38:0x00fd, B:39:0x0102, B:43:0x0043, B:45:0x004b, B:46:0x0053), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.String> loadParams, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.String, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> continuation) {
        com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl$load$1 activityLedgerUserActivitiesPagingSourceImpl$load$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page page;
        com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery.Completed completed;
        try {
            if (continuation instanceof com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl$load$1) {
                activityLedgerUserActivitiesPagingSourceImpl$load$1 = (com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl$load$1) continuation;
                if ((activityLedgerUserActivitiesPagingSourceImpl$load$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    activityLedgerUserActivitiesPagingSourceImpl$load$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = activityLedgerUserActivitiesPagingSourceImpl$load$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = activityLedgerUserActivitiesPagingSourceImpl$load$1.getHighSpeedVideoFpsRanges;
                    int i2 = 2;
                    java.util.List list = null;
                    java.lang.Object[] objArr = 0;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String key = loadParams.getKey();
                        if (key == null) {
                            key = this.completedActivitiesPageCursor.getValue();
                        }
                        com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery getUserActivitiesQuery = this.completedActivitiesQuery;
                        com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery copy = getUserActivitiesQuery.copy(com.paypal.oslo.api.graphql.schema.type.ActivitiesInput.copy$default(getUserActivitiesQuery.getInput(), null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(key), 7, null));
                        activityLedgerUserActivitiesPagingSourceImpl$load$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loadParams);
                        activityLedgerUserActivitiesPagingSourceImpl$load$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(key);
                        activityLedgerUserActivitiesPagingSourceImpl$load$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy);
                        activityLedgerUserActivitiesPagingSourceImpl$load$1.getHighSpeedVideoFpsRanges = 1;
                        obj = getUserActivitiesLedgerItems(copy, activityLedgerUserActivitiesPagingSourceImpl$load$1);
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
                        com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery.Data data = (com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery.Data) ((arrow.core.Either.Right) either).getValue();
                        com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment activitiesFragment = (data == null || (completed = data.getCompleted()) == null) ? null : completed.getActivitiesFragment();
                        com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment activityPageFragment = (activitiesFragment == null || (page = activitiesFragment.getPage()) == null) ? null : page.getActivityPageFragment();
                        com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult activityItemsResult = new com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult(new com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.GetUserActivitiesQueriesResultForPagination(activitiesFragment), list, i2, objArr == true ? 1 : 0);
                        activityItemsResult.transformPaginationItemsToDomain$activity_prodRelease();
                        return new androidx.paging.PagingSource.LoadResult.Page(activityItemsResult.getActivityItemDomainList$activity_prodRelease(), null, (activityPageFragment == null || !activityPageFragment.getHasNextPage()) ? null : activityPageFragment.getCursor());
                    }
                    if (either instanceof arrow.core.Either.Left) {
                        return new androidx.paging.PagingSource.LoadResult.Error(new java.lang.Exception(((com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError) ((arrow.core.Either.Left) either).getValue()).getErrorMessage()));
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            if (i != 0) {
            }
            either = ((arrow.core.Ior) obj).toEither();
            if (!(either instanceof arrow.core.Either.Right)) {
            }
        } catch (java.lang.Exception e) {
            return new androidx.paging.PagingSource.LoadResult.Error(new java.lang.Exception(new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(this.errorMapper.mapToDomainError(e).getErrorMessage(), null, 2, null).getErrorMessage()));
        }
        activityLedgerUserActivitiesPagingSourceImpl$load$1 = new com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl$load$1(this, continuation);
        java.lang.Object obj2 = activityLedgerUserActivitiesPagingSourceImpl$load$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityLedgerUserActivitiesPagingSourceImpl$load$1.getHighSpeedVideoFpsRanges;
        int i22 = 2;
        java.util.List list2 = null;
        java.lang.Object[] objArr2 = 0;
    }

    @Override // androidx.paging.PagingSource
    public final java.lang.String getRefreshKey(androidx.paging.PagingState<java.lang.String, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> state) {
        androidx.paging.PagingSource.LoadResult.Page<java.lang.String, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> closestPageToPosition;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        java.lang.Integer anchorPosition = state.getAnchorPosition();
        if (anchorPosition == null || (closestPageToPosition = state.closestPageToPosition(anchorPosition.intValue())) == null) {
            return null;
        }
        return closestPageToPosition.getNextKey();
    }

    @Override // com.paypal.oslo.feature.activity.domain.repository.ledger.source.IActivityLedgerUserActivitiesSource
    public final java.lang.Object getUserActivitiesLedgerItems(com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery getUserActivitiesQuery, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery.Data>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.ioDispatcher, new com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl$getUserActivitiesLedgerItems$2(this, getUserActivitiesQuery, null), continuation);
    }
}
