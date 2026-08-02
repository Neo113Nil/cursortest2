package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel$loadArticle$2", f = "ArticleFullScreenViewModel.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, nl = {62}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ArticleFullScreenViewModel$loadArticle$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase fetchArticleUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Class<?> cls;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.util.ArrayList emptyList;
        java.lang.String articleTitle;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fetchArticleUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = fetchArticleUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = ((arrow.core.Ior) obj).toEither();
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel articleFullScreenViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.helpcenter.domain.models.Article article = (com.paypal.oslo.feature.helpcenter.domain.models.Article) ((arrow.core.Either.Right) either).getValue();
            articleFullScreenViewModel.getHighSpeedVideoSizes = str;
            mutableStateFlow3 = articleFullScreenViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(article));
            mutableStateFlow4 = articleFullScreenViewModel.getHighResolutionOutputSizeshNQ4ISI;
            java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.Article> relatedArticle = article.getRelatedArticle();
            if (relatedArticle == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.paypal.oslo.feature.helpcenter.domain.models.Article article2 : relatedArticle) {
                    java.lang.String articleId = article2.getArticleId();
                    com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData recommendedArticleUiData = (articleId == null || (articleTitle = article2.getArticleTitle()) == null) ? null : new com.paypal.oslo.feature.helpcenter.ui.models.RecommendedArticleUiData(articleId, articleTitle);
                    if (recommendedArticleUiData != null) {
                        arrayList.add(recommendedArticleUiData);
                    }
                }
                emptyList = arrayList;
            }
            mutableStateFlow4.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(emptyList));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError helpCenterDomainError = (com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.helpcenter.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("articleId", str);
            com.paypal.oslo.core.network.graphql.error.CallError callError = helpCenterDomainError.getCallError();
            java.lang.String simpleName = (callError == null || (cls = callError.getClass()) == null) ? null : cls.getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            pairArr[1] = kotlin.TuplesKt.to("errorType", simpleName);
            com.paypal.android.logger.Logger.e$default(logger, "FetchArticle failed", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
            mutableStateFlow = articleFullScreenViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.INSTANCE.from(helpCenterDomainError.getCallError()), null, 2, null));
            mutableStateFlow2 = articleFullScreenViewModel.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.INSTANCE.from(helpCenterDomainError.getCallError()), null, 2, null));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel$loadArticle$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel$loadArticle$2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArticleFullScreenViewModel$loadArticle$2(com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel articleFullScreenViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleFullScreenViewModel$loadArticle$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = articleFullScreenViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
