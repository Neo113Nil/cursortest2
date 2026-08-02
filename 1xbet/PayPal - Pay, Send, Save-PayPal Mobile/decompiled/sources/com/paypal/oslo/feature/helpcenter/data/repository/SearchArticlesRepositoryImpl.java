package com.paypal.oslo.feature.helpcenter.data.repository;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/data/repository/SearchArticlesRepositoryImpl;", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/SearchArticlesRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "query", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterDomainError;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/SearchArticleData;", "searchArticles", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SearchArticlesRepositoryImpl implements com.paypal.oslo.feature.helpcenter.domain.repository.SearchArticlesRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;
    public static final int $stable = 8;

    @javax.inject.Inject
    public SearchArticlesRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$executeSearchQuery(com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl searchArticlesRepositoryImpl, com.paypal.oslo.api.graphql.schema.type.SearchHelpArticlesInput searchHelpArticlesInput, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl$executeSearchQuery$1 searchArticlesRepositoryImpl$executeSearchQuery$1;
        int i;
        java.lang.String str2;
        com.paypal.oslo.core.network.graphql.error.CallError callError;
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item> list;
        com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.SearchHelpArticles searchHelpArticles;
        if (continuation instanceof com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl$executeSearchQuery$1) {
            searchArticlesRepositoryImpl$executeSearchQuery$1 = (com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl$executeSearchQuery$1) continuation;
            if ((searchArticlesRepositoryImpl$executeSearchQuery$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                searchArticlesRepositoryImpl$executeSearchQuery$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = searchArticlesRepositoryImpl$executeSearchQuery$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = searchArticlesRepositoryImpl$executeSearchQuery$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery searchHelpCenterArticlesQuery = new com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery(searchHelpArticlesInput);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Searching Help Center articles", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.QUERY_LENGTH, kotlin.coroutines.jvm.internal.Boxing.boxInt(str.length())), kotlin.TuplesKt.to("accountCategory", searchHelpArticlesInput.getAccountCategory().name()), kotlin.TuplesKt.to("channel", searchHelpArticlesInput.getChannel().name()), kotlin.TuplesKt.to(com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, searchHelpArticlesInput.getSearchType().name())), null, 4, null);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(searchArticlesRepositoryImpl.getHighSpeedVideoFpsRangesFor.query(searchHelpCenterArticlesQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    searchArticlesRepositoryImpl$executeSearchQuery$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(searchHelpArticlesInput);
                    searchArticlesRepositoryImpl$executeSearchQuery$1.Camera2StreamConfigurationMap = str;
                    searchArticlesRepositoryImpl$executeSearchQuery$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(searchHelpCenterArticlesQuery);
                    searchArticlesRepositoryImpl$executeSearchQuery$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    searchArticlesRepositoryImpl$executeSearchQuery$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, searchArticlesRepositoryImpl$executeSearchQuery$1, 2, null);
                    if (execute$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = execute$default;
                    str2 = str;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) searchArticlesRepositoryImpl$executeSearchQuery$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                arrow.core.Ior ior = (arrow.core.Ior) obj;
                callError = (com.paypal.oslo.core.network.graphql.error.CallError) ior.leftOrNull();
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ior.getOrNull();
                com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Data data = graphQLData == null ? (com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Data) graphQLData.getData() : null;
                java.util.List<com.paypal.oslo.feature.helpcenter.graphql.SearchHelpCenterArticlesQuery.Item> items = (data != null || (searchHelpArticles = data.getSearchHelpArticles()) == null) ? null : searchHelpArticles.getItems();
                list = items;
                if (list != null || list.isEmpty()) {
                    if (callError == null) {
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.helpcenter.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[3];
                        pairArr[0] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(data != null));
                        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.QUERY_LENGTH, kotlin.coroutines.jvm.internal.Boxing.boxInt(str2.length()));
                        pairArr[2] = kotlin.TuplesKt.to("error", callError.toString());
                        com.paypal.android.logger.Logger.d$default(logger, "Search failed with no results", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        return new arrow.core.Ior.Left(new com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError(null, callError, 1, null));
                    }
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.helpcenter.LoggerKt.log;
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                    pairArr2[0] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(data != null));
                    pairArr2[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.QUERY_LENGTH, kotlin.coroutines.jvm.internal.Boxing.boxInt(str2.length()));
                    com.paypal.android.logger.Logger.d$default(logger2, "Search succeeded with no results", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                    return new arrow.core.Ior.Right(kotlin.collections.CollectionsKt.emptyList());
                }
                if (callError != null) {
                    com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.helpcenter.LoggerKt.log;
                    kotlin.Pair[] pairArr3 = new kotlin.Pair[4];
                    pairArr3[0] = kotlin.TuplesKt.to("resultCount", java.lang.Integer.valueOf(items.size()));
                    pairArr3[1] = kotlin.TuplesKt.to("hasData", java.lang.Boolean.valueOf(data != null));
                    pairArr3[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.QUERY_LENGTH, java.lang.Integer.valueOf(str2.length()));
                    pairArr3[3] = kotlin.TuplesKt.to("error", callError.toString());
                    com.paypal.android.logger.Logger.d$default(logger3, "Received partial search response", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                } else {
                    com.paypal.android.logger.Logger logger4 = com.paypal.oslo.feature.helpcenter.LoggerKt.log;
                    kotlin.Pair[] pairArr4 = new kotlin.Pair[3];
                    pairArr4[0] = kotlin.TuplesKt.to("resultCount", java.lang.Integer.valueOf(items.size()));
                    pairArr4[1] = kotlin.TuplesKt.to("hasData", java.lang.Boolean.valueOf(data != null));
                    pairArr4[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.QUERY_LENGTH, java.lang.Integer.valueOf(str2.length()));
                    com.paypal.android.logger.Logger.d$default(logger4, "Successfully fetched search results", kotlin.collections.MapsKt.mapOf(pairArr4), null, 4, null);
                }
                java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.SearchArticleData> searchArticleDataList = com.paypal.oslo.feature.helpcenter.data.mapper.ArticlePreviewMapper.INSTANCE.toSearchArticleDataList(items);
                if (callError != null) {
                    return new arrow.core.Ior.Both(new com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError(null, callError, 1, null), searchArticleDataList);
                }
                return new arrow.core.Ior.Right(searchArticleDataList);
            }
        }
        searchArticlesRepositoryImpl$executeSearchQuery$1 = new com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl$executeSearchQuery$1(searchArticlesRepositoryImpl, continuation);
        java.lang.Object obj2 = searchArticlesRepositoryImpl$executeSearchQuery$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = searchArticlesRepositoryImpl$executeSearchQuery$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        arrow.core.Ior ior2 = (arrow.core.Ior) obj2;
        callError = (com.paypal.oslo.core.network.graphql.error.CallError) ior2.leftOrNull();
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) ior2.getOrNull();
        if (graphQLData2 == null) {
        }
        if (data != null) {
        }
        list = items;
        if (list != null) {
        }
        if (callError == null) {
        }
    }

    @Override // com.paypal.oslo.feature.helpcenter.domain.repository.SearchArticlesRepository
    public final java.lang.Object searchArticles(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError, ? extends java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.SearchArticleData>>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl$searchArticles$2(str, this, null), continuation);
    }
}
