package com.paypal.oslo.feature.helpcenter.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterGenericError;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/Article;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl$fetchArticle$2", f = "ArticleRepositoryImpl.kt", i = {0, 0, 0}, l = {76}, m = "invokeSuspend", n = {"input", "query", "apolloCall"}, nl = {77}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class ArticleRepositoryImpl$fetchArticle$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError, ? extends com.paypal.oslo.feature.helpcenter.domain.models.Article>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.ApolloClient apolloClient;
        com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError helpCenterGenericError;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.api.graphql.schema.type.HelpArticleInput helpArticleInput = new com.paypal.oslo.api.graphql.schema.type.HelpArticleInput(this.getHighSpeedVideoFpsRanges, com.paypal.oslo.api.graphql.schema.type.HelpChannel.FAQ, com.paypal.oslo.api.graphql.schema.type.AccountCategory.CONSUMER, true);
            com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery getHelpCenterArticleQuery = new com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery(helpArticleInput);
            apolloClient = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(apolloClient.query(getHelpCenterArticleQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(helpArticleInput);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getHelpCenterArticleQuery);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
            this.Camera2StreamConfigurationMap = 1;
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
        com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.Data data = graphQLData != null ? (com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.Data) graphQLData.getData() : null;
        com.paypal.oslo.feature.helpcenter.graphql.GetHelpCenterArticleQuery.HelpArticle helpArticle = data != null ? data.getHelpArticle() : null;
        if (helpArticle == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "ArticleContent empty", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("articleId", this.getHighSpeedVideoFpsRanges)), null, 4, null);
            if (callError != null) {
                helpCenterGenericError = com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl.access$handleError(this.getInputSizeshNQ4ISI, callError);
            } else {
                helpCenterGenericError = new com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError("No article content returned", null);
            }
            return new arrow.core.Ior.Left(helpCenterGenericError);
        }
        com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl.access$logResponse(this.getInputSizeshNQ4ISI, callError, helpArticle);
        com.paypal.oslo.feature.helpcenter.domain.models.Article article = com.paypal.oslo.feature.helpcenter.data.mapper.ArticleContentMapper.INSTANCE.toArticle(helpArticle);
        if (callError != null) {
            return new arrow.core.Ior.Both(com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl.access$handleError(this.getInputSizeshNQ4ISI, callError), article);
        }
        return new arrow.core.Ior.Right(article);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterGenericError, ? extends com.paypal.oslo.feature.helpcenter.domain.models.Article>> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl$fetchArticle$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl$fetchArticle$2(this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArticleRepositoryImpl$fetchArticle$2(java.lang.String str, com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl articleRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.data.repository.ArticleRepositoryImpl$fetchArticle$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getInputSizeshNQ4ISI = articleRepositoryImpl;
    }
}
