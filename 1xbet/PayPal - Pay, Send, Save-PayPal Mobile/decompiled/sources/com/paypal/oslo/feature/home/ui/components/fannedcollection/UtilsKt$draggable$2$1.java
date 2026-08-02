package com.paypal.oslo.feature.home.ui.components.fannedcollection;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.ui.components.fannedcollection.UtilsKt$draggable$2$1", f = "Utils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class UtilsKt$draggable$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.invoke();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.paypal.oslo.feature.home.ui.components.fannedcollection.UtilsKt$draggable$2$1(this.getHighSpeedVideoFpsRanges, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UtilsKt$draggable$2$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.ui.components.fannedcollection.UtilsKt$draggable$2$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = function0;
    }
}
