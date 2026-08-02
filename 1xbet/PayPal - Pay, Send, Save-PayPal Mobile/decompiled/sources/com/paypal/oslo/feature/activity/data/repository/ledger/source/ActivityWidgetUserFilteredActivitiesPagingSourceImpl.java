package com.paypal.oslo.feature.activity.data.repository.ledger.source;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00192\u0006\u0010\u0018\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/activity/data/repository/ledger/source/ActivityWidgetUserFilteredActivitiesPagingSourceImpl;", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/source/IActivityWidgetUserFilteredActivitiesPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery;", "userFilteredActivitiesQuery", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "errorMapper", "<init>", "(Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;)V", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/String;", "query", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery$Data;", "getUserFilteredActivities", "(Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery;", "getUserFilteredActivitiesQuery$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIoDispatcher$activity_prodRelease", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/apollographql/apollo/ApolloClient;", "getApolloClient$activity_prodRelease", "()Lcom/apollographql/apollo/ApolloClient;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "getErrorMapper$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetUserFilteredActivitiesPagingSourceImpl extends androidx.paging.PagingSource<java.lang.String, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> implements com.paypal.oslo.feature.activity.domain.repository.ledger.source.IActivityWidgetUserFilteredActivitiesPagingSource {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient apolloClient;
    private final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper errorMapper;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher;
    private final com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery userFilteredActivitiesQuery;

    public ActivityWidgetUserFilteredActivitiesPagingSourceImpl(com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getUserFilteredActivitiesQuery, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserFilteredActivitiesQuery, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityErrorMapper, "");
        this.userFilteredActivitiesQuery = getUserFilteredActivitiesQuery;
        this.ioDispatcher = coroutineDispatcher;
        this.apolloClient = apolloClient;
        this.errorMapper = iActivityErrorMapper;
    }

    /* renamed from: getUserFilteredActivitiesQuery$activity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getUserFilteredActivitiesQuery() {
        return this.userFilteredActivitiesQuery;
    }

    public /* synthetic */ ActivityWidgetUserFilteredActivitiesPagingSourceImpl(com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getUserFilteredActivitiesQuery, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(getUserFilteredActivitiesQuery, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher, apolloClient, iActivityErrorMapper);
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
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[Catch: Exception -> 0x00f2, TryCatch #0 {Exception -> 0x00f2, blocks: (B:11:0x0034, B:12:0x007d, B:14:0x0087, B:16:0x0091, B:18:0x0097, B:20:0x009f, B:22:0x00a5, B:23:0x00ab, B:25:0x00bb, B:27:0x00c1, B:28:0x00c7, B:34:0x00cd, B:36:0x00d1, B:38:0x00ec, B:39:0x00f1, B:43:0x0043), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd A[Catch: Exception -> 0x00f2, TryCatch #0 {Exception -> 0x00f2, blocks: (B:11:0x0034, B:12:0x007d, B:14:0x0087, B:16:0x0091, B:18:0x0097, B:20:0x009f, B:22:0x00a5, B:23:0x00ab, B:25:0x00bb, B:27:0x00c1, B:28:0x00c7, B:34:0x00cd, B:36:0x00d1, B:38:0x00ec, B:39:0x00f1, B:43:0x0043), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.String> loadParams, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.String, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> continuation) {
        com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl$load$1 activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment.Page page;
        com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Activities activities;
        try {
            if (continuation instanceof com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl$load$1) {
                activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1 = (com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl$load$1) continuation;
                if ((activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1.getHighSpeedVideoFpsRangesFor;
                    int i2 = 2;
                    java.util.List list = null;
                    java.lang.Object[] objArr = 0;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String key = loadParams.getKey();
                        com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getUserFilteredActivitiesQuery = this.userFilteredActivitiesQuery;
                        com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery copy = getUserFilteredActivitiesQuery.copy(com.paypal.oslo.api.graphql.schema.type.ActivitiesInput.copy$default(getUserFilteredActivitiesQuery.getFiltered(), null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(key), 7, null));
                        activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loadParams);
                        activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(key);
                        activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy);
                        activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = getUserFilteredActivities(copy, activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1);
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
                        com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data data = (com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data) ((arrow.core.Either.Right) either).getValue();
                        com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment activitiesFragment = (data == null || (activities = data.getActivities()) == null) ? null : activities.getActivitiesFragment();
                        com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment activityPageFragment = (activitiesFragment == null || (page = activitiesFragment.getPage()) == null) ? null : page.getActivityPageFragment();
                        com.paypal.oslo.feature.activity.domain.widget.remote.ActivityWidgetResult activityWidgetResult = new com.paypal.oslo.feature.activity.domain.widget.remote.ActivityWidgetResult(data, list, i2, objArr == true ? 1 : 0);
                        activityWidgetResult.transformToDomainResult$activity_prodRelease();
                        return new androidx.paging.PagingSource.LoadResult.Page(activityWidgetResult.getActivityItemDomainList$activity_prodRelease(), null, (activityPageFragment == null || !activityPageFragment.getHasNextPage()) ? null : activityPageFragment.getCursor());
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
        activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1 = new com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl$load$1(this, continuation);
        java.lang.Object obj2 = activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityWidgetUserFilteredActivitiesPagingSourceImpl$load$1.getHighSpeedVideoFpsRangesFor;
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

    @Override // com.paypal.oslo.feature.activity.domain.repository.ledger.source.IActivityWidgetUserFilteredActivitiesPagingSource
    public final java.lang.Object getUserFilteredActivities(com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getUserFilteredActivitiesQuery, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.ioDispatcher, new com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl$getUserFilteredActivities$2(this, getUserFilteredActivitiesQuery, null), continuation);
    }
}
