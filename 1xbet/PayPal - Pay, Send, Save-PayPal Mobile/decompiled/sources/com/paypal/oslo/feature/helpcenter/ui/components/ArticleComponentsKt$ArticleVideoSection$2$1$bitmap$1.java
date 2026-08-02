package com.paypal.oslo.feature.helpcenter.ui.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$ArticleVideoSection$2$1$bitmap$1", f = "ArticleComponents.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ArticleComponentsKt$ArticleVideoSection$2$1$bitmap$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super android.graphics.Bitmap>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return com.paypal.oslo.feature.helpcenter.ui.util.VideoThumbnailExtractor.extractThumbnail$default(com.paypal.oslo.feature.helpcenter.ui.util.VideoThumbnailExtractor.INSTANCE, this.getHighResolutionOutputSizeshNQ4ISI.getVideoSource(), 0L, 2, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$ArticleVideoSection$2$1$bitmap$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$ArticleVideoSection$2$1$bitmap$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArticleComponentsKt$ArticleVideoSection$2$1$bitmap$1(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video video, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$ArticleVideoSection$2$1$bitmap$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = video;
    }
}
