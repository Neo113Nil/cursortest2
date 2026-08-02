package com.paypal.oslo.feature.helpcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterGenericError;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/RecommendedArticleData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl$fetchRecommendedArticles$2", f = "HelpCenterRecommendedArticlesRepositoryImpl.kt", i = {0, 0, 0}, l = {72}, m = "invokeSuspend", n = {"input", "query", "apolloCall"}, nl = {73}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class HelpCenterRecommendedArticlesRepositoryImpl$fetchRecommendedArticles$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError, ? extends java.util.List<? extends com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData>>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.ApolloClient apolloClient;
        com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError helpCenterGenericError;
        java.util.List recommendedArticleDataList;
        com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.RecommendedHelpArticles recommendedHelpArticles;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.api.graphql.schema.type.RecommendedHelpArticlesInput recommendedHelpArticlesInput = new com.paypal.oslo.api.graphql.schema.type.RecommendedHelpArticlesInput(com.paypal.oslo.api.graphql.schema.type.HelpChannel.FAQ, com.paypal.oslo.api.graphql.schema.type.AccountCategory.CONSUMER, null, null, 12, null);
            com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery getHelpCenterRecommendedArticlesQuery = new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery(recommendedHelpArticlesInput);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Fetching recommended articles", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("accountCategory", recommendedHelpArticlesInput.getAccountCategory().name()), kotlin.TuplesKt.to("channel", recommendedHelpArticlesInput.getChannel().name())), null, 4, null);
            apolloClient = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(apolloClient.query(getHelpCenterRecommendedArticlesQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(recommendedHelpArticlesInput);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getHelpCenterRecommendedArticlesQuery);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ior.leftOrNull();
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ior.getOrNull();
        com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Data data = graphQLData != null ? (com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Data) graphQLData.getData() : null;
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item> items = (data == null || (recommendedHelpArticles = data.getRecommendedHelpArticles()) == null) ? null : recommendedHelpArticles.getItems();
        java.util.List<com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterRecommendedArticlesQuery.Item> list = items;
        if (list == null || list.isEmpty()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "No recommended articles returned", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(data != null))), null, 4, null);
            if (callError != null) {
                helpCenterGenericError = com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl.access$handleError(this.getHighSpeedVideoFpsRanges, callError);
            } else {
                helpCenterGenericError = new com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError("No recommended articles returned", null);
            }
            return new arrow.core.Ior.Left(helpCenterGenericError);
        }
        com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl.access$logResponse(this.getHighSpeedVideoFpsRanges, callError, data, items);
        com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl helpCenterRecommendedArticlesRepositoryImpl = this.getHighSpeedVideoFpsRanges;
        recommendedArticleDataList = com.paypal.oslo.feature.helpcenter.data.mapper.ArticlePreviewMapper.INSTANCE.toRecommendedArticleDataList(items);
        if (callError != null) {
            return new arrow.core.Ior.Both(com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl.access$handleError(this.getHighSpeedVideoFpsRanges, callError), recommendedArticleDataList);
        }
        return new arrow.core.Ior.Right(recommendedArticleDataList);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError, ? extends java.util.List<? extends com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData>>> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl$fetchRecommendedArticles$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl$fetchRecommendedArticles$2(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpCenterRecommendedArticlesRepositoryImpl$fetchRecommendedArticles$2(com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl helpCenterRecommendedArticlesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.data.repository.HelpCenterRecommendedArticlesRepositoryImpl$fetchRecommendedArticles$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = helpCenterRecommendedArticlesRepositoryImpl;
    }
}
