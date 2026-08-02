package com.paypal.oslo.feature.helpcenter.ui.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$ArticleVideoSection$2$1", f = "ArticleComponents.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ArticleComponentsKt$ArticleVideoSection$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Failed failed;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.Camera2StreamConfigurationMap.getThumbnailUrl() == null) {
                this.getHighSpeedVideoFpsRangesFor.setValue(com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Loading.INSTANCE);
                this.getHighSpeedVideoFpsRanges = 1;
                obj = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$ArticleVideoSection$2$1$bitmap$1(this.Camera2StreamConfigurationMap, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        androidx.compose.runtime.MutableState<com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState> mutableState = this.getHighSpeedVideoFpsRangesFor;
        if (bitmap != null) {
            failed = new com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Success(bitmap);
        } else {
            failed = com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Failed.INSTANCE;
        }
        mutableState.setValue(failed);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$ArticleVideoSection$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$ArticleVideoSection$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArticleComponentsKt$ArticleVideoSection$2$1(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video video, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$ArticleVideoSection$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = video;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}
