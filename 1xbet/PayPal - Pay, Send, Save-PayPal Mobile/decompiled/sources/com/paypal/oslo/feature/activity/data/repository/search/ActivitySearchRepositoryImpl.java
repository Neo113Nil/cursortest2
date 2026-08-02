package com.paypal.oslo.feature.activity.data.repository.search;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/activity/data/repository/search/ActivitySearchRepositoryImpl;", "Lcom/paypal/oslo/feature/activity/domain/repository/search/IActivitySearchRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "activityErrorMapper", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivitySearchSuggestionsQuery;", "query", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "Lcom/paypal/oslo/feature/activity/domain/search/remote/ActivitySearchSuggestionResult;", "fetchSearchSuggestions", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivitySearchSuggestionsQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activitySearchSuggestionsQuery", "executeGraphQLQueryForResult$activity_prodRelease", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityErrorMapper;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivitySearchRepositoryImpl implements com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ActivitySearchRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.Camera2StreamConfigurationMap = iActivityErrorMapper;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
    }

    public /* synthetic */ ActivitySearchRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(apolloClient, iActivityErrorMapper, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    @Override // com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository
    public final java.lang.Object fetchSearchSuggestions(com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery getActivitySearchSuggestionsQuery, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$fetchSearchSuggestions$2(this, getActivitySearchSuggestionsQuery, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeGraphQLQueryForResult$activity_prodRelease(com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery getActivitySearchSuggestionsQuery, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult>> continuation) {
        com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$executeGraphQLQueryForResult$1 activitySearchRepositoryImpl$executeGraphQLQueryForResult$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$executeGraphQLQueryForResult$1) {
            activitySearchRepositoryImpl$executeGraphQLQueryForResult$1 = (com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$executeGraphQLQueryForResult$1) continuation;
            if ((activitySearchRepositoryImpl$executeGraphQLQueryForResult$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                activitySearchRepositoryImpl$executeGraphQLQueryForResult$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$executeGraphQLQueryForResult$1 activitySearchRepositoryImpl$executeGraphQLQueryForResult$12 = activitySearchRepositoryImpl$executeGraphQLQueryForResult$1;
                java.lang.Object obj = activitySearchRepositoryImpl$executeGraphQLQueryForResult$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activitySearchRepositoryImpl$executeGraphQLQueryForResult$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    activitySearchRepositoryImpl$executeGraphQLQueryForResult$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getActivitySearchSuggestionsQuery);
                    activitySearchRepositoryImpl$executeGraphQLQueryForResult$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRangesFor, getActivitySearchSuggestionsQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, activitySearchRepositoryImpl$executeGraphQLQueryForResult$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl.$r8$lambda$wFhQQVihVNlH9gDnXW_PYvfEFvw((com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                    }
                });
            }
        }
        activitySearchRepositoryImpl$executeGraphQLQueryForResult$1 = new com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$executeGraphQLQueryForResult$1(this, continuation);
        com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$executeGraphQLQueryForResult$1 activitySearchRepositoryImpl$executeGraphQLQueryForResult$122 = activitySearchRepositoryImpl$executeGraphQLQueryForResult$1;
        java.lang.Object obj2 = activitySearchRepositoryImpl$executeGraphQLQueryForResult$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activitySearchRepositoryImpl$executeGraphQLQueryForResult$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl.$r8$lambda$wFhQQVihVNlH9gDnXW_PYvfEFvw((com.paypal.oslo.core.network.graphql.GraphQLData) obj22);
            }
        });
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult $r8$lambda$wFhQQVihVNlH9gDnXW_PYvfEFvw(com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        return new com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult((com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery.Data) graphQLData.getData());
    }
}
