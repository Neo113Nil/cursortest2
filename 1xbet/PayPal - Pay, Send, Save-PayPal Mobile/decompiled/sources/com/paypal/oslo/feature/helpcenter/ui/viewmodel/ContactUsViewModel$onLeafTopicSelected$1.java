package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$onLeafTopicSelected$1", f = "ContactUsViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m = "invokeSuspend", n = {}, nl = {185}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ContactUsViewModel$onLeafTopicSelected$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.helpcenter.domain.usecase.FetchArticleUseCase fetchArticleUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.helpcenter.ui.models.ScreenState failure;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                fetchArticleUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                this.Camera2StreamConfigurationMap = 1;
                obj = fetchArticleUseCase.invoke(this.getHighSpeedVideoSizes, this);
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
            mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
            if (ior instanceof arrow.core.Ior.Right) {
                java.lang.String articleTitle = ((com.paypal.oslo.feature.helpcenter.domain.models.Article) ((arrow.core.Ior.Right) ior).getValue()).getArticleTitle();
                failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(articleTitle != null ? articleTitle : "");
            } else if (ior instanceof arrow.core.Ior.Both) {
                java.lang.String articleTitle2 = ((com.paypal.oslo.feature.helpcenter.domain.models.Article) ((arrow.core.Ior.Both) ior).getRightValue()).getArticleTitle();
                failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success(articleTitle2 != null ? articleTitle2 : "");
            } else {
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.helpcenter.LoggerKt.log, "Failed to fetch article title for leaf topic", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("articleId", this.getHighSpeedVideoSizes)), null, 4, null);
                failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(null, null, 3, null);
            }
            mutableStateFlow2.setValue(failure);
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.helpcenter.LoggerKt.log.e("Exception fetching article title for leaf topic", e);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(null, null, 3, null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$onLeafTopicSelected$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$onLeafTopicSelected$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactUsViewModel$onLeafTopicSelected$1(com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel contactUsViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.viewmodel.ContactUsViewModel$onLeafTopicSelected$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = contactUsViewModel;
        this.getHighSpeedVideoSizes = str;
    }
}
