package com.paypal.oslo.feature.activity.data.repository.ledger;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\r2\n\u0010\f\u001a\u00060\u0012j\u0002`\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00172\u0006\u0010\f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\n\u0010\f\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b \u0010!J(\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\n\u0010\"\u001a\u00060\nj\u0002`\u000bH\u0080@¢\u0006\u0004\b#\u0010\u0011J(\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\r2\n\u0010$\u001a\u00060\u0012j\u0002`\u0013H\u0080@¢\u0006\u0004\b%\u0010\u0016J!\u0010*\u001a\u00020\u000f2\u0010\u0010)\u001a\f\u0012\b\u0012\u00060'j\u0002`(0&H\u0000¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020\u00142\u0010\u0010)\u001a\f\u0012\b\u0012\u00060,j\u0002`-0&H\u0000¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108"}, d2 = {"Lcom/paypal/oslo/feature/activity/data/repository/ledger/ActivityLedgerRepositoryImpl;", "Lcom/paypal/oslo/feature/activity/domain/repository/ledger/IActivityLedgerRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "activityErrorMapper", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/activity/graphql/GetUserSectionedActivitiesQuery;", "Lcom/paypal/oslo/feature/activity/domain/base/alias/SectionedActivitiesQuery;", "query", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "Lcom/paypal/oslo/feature/activity/domain/ledger/remote/ActivityItemsResult;", "fetchActivityLedgerItems", "(Lcom/paypal/oslo/feature/activity/graphql/GetUserSectionedActivitiesQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery;", "Lcom/paypal/oslo/feature/activity/domain/base/alias/FilteredActivitiesQuery;", "Lcom/paypal/oslo/feature/activity/domain/widget/remote/ActivityWidgetResult;", "fetchActivityWidgetItems", "(Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "pageCursor", "Lcom/paypal/oslo/feature/activity/graphql/GetUserActivitiesQuery;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "fetchGetUserActivityLedgerItems", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/paypal/oslo/feature/activity/graphql/GetUserActivitiesQuery;)Lkotlinx/coroutines/flow/Flow;", "fetchGetFilteredActivitiesWidgetNextPageItems", "(Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery;)Lkotlinx/coroutines/flow/Flow;", "activityLedgerQueriesInputTypes", "executeGraphQLQueryForResult$activity_prodRelease", "activityWidgetQuery", "executeGraphQLQueryForWidgetResult$activity_prodRelease", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserSectionedActivitiesQuery$Data;", "Lcom/paypal/oslo/feature/activity/domain/base/alias/SectionedActivitiesQueryData;", "graphQLData", "getActivityItemsDomainResult$activity_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Lcom/paypal/oslo/feature/activity/domain/ledger/remote/ActivityItemsResult;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery$Data;", "Lcom/paypal/oslo/feature/activity/domain/base/alias/FilteredActivitiesQueryData;", "getActivityWidgetDomainResult$activity_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Lcom/paypal/oslo/feature/activity/domain/widget/remote/ActivityWidgetResult;", "Lcom/apollographql/apollo/ApolloClient;", "getApolloClient$activity_prodRelease", "()Lcom/apollographql/apollo/ApolloClient;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "getActivityErrorMapper$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIoDispatcher$activity_prodRelease", "()Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerRepositoryImpl implements com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper activityErrorMapper;
    private final com.apollographql.apollo.ApolloClient apolloClient;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher;

    @javax.inject.Inject
    public ActivityLedgerRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.apolloClient = apolloClient;
        this.activityErrorMapper = iActivityErrorMapper;
        this.ioDispatcher = coroutineDispatcher;
    }

    /* renamed from: getApolloClient$activity_prodRelease, reason: from getter */
    public final com.apollographql.apollo.ApolloClient getApolloClient() {
        return this.apolloClient;
    }

    /* renamed from: getActivityErrorMapper$activity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper getActivityErrorMapper() {
        return this.activityErrorMapper;
    }

    public /* synthetic */ ActivityLedgerRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(apolloClient, iActivityErrorMapper, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    /* renamed from: getIoDispatcher$activity_prodRelease, reason: from getter */
    public final kotlinx.coroutines.CoroutineDispatcher getIoDispatcher() {
        return this.ioDispatcher;
    }

    @Override // com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository
    public final java.lang.Object fetchActivityLedgerItems(com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery getUserSectionedActivitiesQuery, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.ioDispatcher, new com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$fetchActivityLedgerItems$2(this, getUserSectionedActivitiesQuery, null), continuation);
    }

    @Override // com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository
    public final java.lang.Object fetchActivityWidgetItems(com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getUserFilteredActivitiesQuery, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, com.paypal.oslo.feature.activity.domain.widget.remote.ActivityWidgetResult>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.ioDispatcher, new com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$fetchActivityWidgetItems$2(this, getUserFilteredActivitiesQuery, null), continuation);
    }

    @Override // com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> fetchGetUserActivityLedgerItems(final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> pageCursor, final com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageCursor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        return new androidx.paging.Pager(new androidx.paging.PagingConfig(60, 12, false, 0, 0, 0, 56, null), null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl.m11766$r8$lambda$DI89AHQ2nBOFIcM0eH0JG8c5Og(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl.this, pageCursor, query);
            }
        }, 2, null).getFlow();
    }

    @Override // com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> fetchGetFilteredActivitiesWidgetNextPageItems(final com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery query) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        return new androidx.paging.Pager(new androidx.paging.PagingConfig(60, 12, false, 0, 0, 0, 56, null), null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl.m11768$r8$lambda$r_rV6aHZUzLOhTs75uzFA7wtk(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl.this, query);
            }
        }, 2, null).getFlow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeGraphQLQueryForResult$activity_prodRelease(com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery getUserSectionedActivitiesQuery, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult>> continuation) {
        com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForResult$1 activityLedgerRepositoryImpl$executeGraphQLQueryForResult$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForResult$1) {
            activityLedgerRepositoryImpl$executeGraphQLQueryForResult$1 = (com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForResult$1) continuation;
            if ((activityLedgerRepositoryImpl$executeGraphQLQueryForResult$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                activityLedgerRepositoryImpl$executeGraphQLQueryForResult$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForResult$1 activityLedgerRepositoryImpl$executeGraphQLQueryForResult$12 = activityLedgerRepositoryImpl$executeGraphQLQueryForResult$1;
                java.lang.Object obj = activityLedgerRepositoryImpl$executeGraphQLQueryForResult$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityLedgerRepositoryImpl$executeGraphQLQueryForResult$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    activityLedgerRepositoryImpl$executeGraphQLQueryForResult$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getUserSectionedActivitiesQuery);
                    activityLedgerRepositoryImpl$executeGraphQLQueryForResult$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.apolloClient, getUserSectionedActivitiesQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, activityLedgerRepositoryImpl$executeGraphQLQueryForResult$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl.$r8$lambda$QTvLqf50IGm2I7Pj8Lajqj1ku8o(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                    }
                });
            }
        }
        activityLedgerRepositoryImpl$executeGraphQLQueryForResult$1 = new com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForResult$1(this, continuation);
        com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForResult$1 activityLedgerRepositoryImpl$executeGraphQLQueryForResult$122 = activityLedgerRepositoryImpl$executeGraphQLQueryForResult$1;
        java.lang.Object obj2 = activityLedgerRepositoryImpl$executeGraphQLQueryForResult$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityLedgerRepositoryImpl$executeGraphQLQueryForResult$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl.$r8$lambda$QTvLqf50IGm2I7Pj8Lajqj1ku8o(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.GraphQLData) obj22);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeGraphQLQueryForWidgetResult$activity_prodRelease(com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getUserFilteredActivitiesQuery, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, com.paypal.oslo.feature.activity.domain.widget.remote.ActivityWidgetResult>> continuation) {
        com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1 activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1) {
            activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1 = (com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1) continuation;
            if ((activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1 activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$12 = activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1;
                java.lang.Object obj = activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getUserFilteredActivitiesQuery);
                    activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.apolloClient, getUserFilteredActivitiesQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl.m11767$r8$lambda$dRaPEE5qKh8zTY2HoNuNYSBpo(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                    }
                });
            }
        }
        activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1 = new com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1(this, continuation);
        com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1 activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$122 = activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1;
        java.lang.Object obj2 = activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl.m11767$r8$lambda$dRaPEE5qKh8zTY2HoNuNYSBpo(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.GraphQLData) obj22);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult getActivityItemsDomainResult$activity_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Data> graphQLData) {
        com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Completed completed;
        com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Pending pending;
        com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Upcoming upcoming;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Data data = graphQLData.getData();
        java.util.List list = null;
        java.lang.Object[] objArr = 0;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment activitiesFragment = (data == null || (upcoming = data.getUpcoming()) == null) ? null : upcoming.getActivitiesFragment();
        com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Data data2 = graphQLData.getData();
        com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment activitiesFragment2 = (data2 == null || (pending = data2.getPending()) == null) ? null : pending.getActivitiesFragment();
        com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery.Data data3 = graphQLData.getData();
        return new com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult(new com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.SectionedActivitiesQueriesResult(activitiesFragment, activitiesFragment2, (data3 == null || (completed = data3.getCompleted()) == null) ? null : completed.getActivitiesFragment()), list, 2, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.activity.domain.widget.remote.ActivityWidgetResult getActivityWidgetDomainResult$activity_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data> graphQLData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        return new com.paypal.oslo.feature.activity.domain.widget.remote.ActivityWidgetResult(graphQLData.getData(), null, 2, 0 == true ? 1 : 0);
    }

    /* renamed from: $r8$lambda$DI89AHQ2nBOFIcM0eH0JG-8c5Og, reason: not valid java name */
    public static /* synthetic */ androidx.paging.PagingSource m11766$r8$lambda$DI89AHQ2nBOFIcM0eH0JG8c5Og(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl activityLedgerRepositoryImpl, kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow, com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery getUserActivitiesQuery) {
        return new com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl(mutableStateFlow, getUserActivitiesQuery, activityLedgerRepositoryImpl.ioDispatcher, activityLedgerRepositoryImpl.apolloClient, activityLedgerRepositoryImpl.activityErrorMapper);
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsResult $r8$lambda$QTvLqf50IGm2I7Pj8Lajqj1ku8o(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl activityLedgerRepositoryImpl, com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        return activityLedgerRepositoryImpl.getActivityItemsDomainResult$activity_prodRelease(graphQLData);
    }

    /* renamed from: $r8$lambda$dRaPEE5-qKh8zTY-2HoNuNYSBpo, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.widget.remote.ActivityWidgetResult m11767$r8$lambda$dRaPEE5qKh8zTY2HoNuNYSBpo(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl activityLedgerRepositoryImpl, com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        return activityLedgerRepositoryImpl.getActivityWidgetDomainResult$activity_prodRelease(graphQLData);
    }

    /* renamed from: $r8$lambda$r_rV6aHZUzLOhTs75-uzFA7w-tk, reason: not valid java name */
    public static /* synthetic */ androidx.paging.PagingSource m11768$r8$lambda$r_rV6aHZUzLOhTs75uzFA7wtk(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl activityLedgerRepositoryImpl, com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getUserFilteredActivitiesQuery) {
        return new com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl(getUserFilteredActivitiesQuery, activityLedgerRepositoryImpl.ioDispatcher, activityLedgerRepositoryImpl.apolloClient, activityLedgerRepositoryImpl.activityErrorMapper);
    }
}
