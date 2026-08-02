package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel$loadArticle$2", f = "ArticleBottomSheetViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, nl = {52}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ArticleBottomSheetViewModel$loadArticle$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase fetchArticleUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.helpcenter.ui.models.ScreenState failure;
        java.lang.Class<?> cls;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutableStateFlow2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                fetchArticleUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = mutableStateFlow2;
                this.getHighSpeedVideoSizes = 1;
                java.lang.Object invoke = fetchArticleUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableStateFlow3 = mutableStateFlow2;
                obj = invoke;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow3 = (kotlinx.coroutines.flow.MutableStateFlow) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            arrow.core.Either either = ((arrow.core.Ior) obj).toEither();
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel articleBottomSheetViewModel = this.Camera2StreamConfigurationMap;
            if (either instanceof arrow.core.Either.Right) {
                com.paypal.oslo.feature.helpcenter.domain.models.Article article = (com.paypal.oslo.feature.helpcenter.domain.models.Article) ((arrow.core.Either.Right) either).getValue();
                articleBottomSheetViewModel.Camera2StreamConfigurationMap = str;
                failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(article);
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
                failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.INSTANCE.from(helpCenterDomainError.getCallError()), null, 2, null);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mutableStateFlow3.setValue(failure);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "FetchArticle exception", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("articleId", this.getHighSpeedVideoFpsRangesFor)), null, e, 4, null);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.NETWORK_ERROR, null, 2, null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel$loadArticle$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel$loadArticle$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArticleBottomSheetViewModel$loadArticle$2(com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel articleBottomSheetViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.viewmodel.ArticleBottomSheetViewModel$loadArticle$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = articleBottomSheetViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
