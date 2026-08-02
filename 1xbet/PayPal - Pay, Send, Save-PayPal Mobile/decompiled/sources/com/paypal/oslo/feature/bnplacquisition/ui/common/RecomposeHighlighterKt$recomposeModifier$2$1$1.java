package com.paypal.oslo.feature.bnplacquisition.ui.common;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.RecomposeHighlighterKt$recomposeModifier$2$1$1", f = "RecomposeHighlighter.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, nl = {66}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class RecomposeHighlighterKt$recomposeModifier$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Long> getHighSpeedVideoFpsRanges;
    final /* synthetic */ long[] getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.DelayKt.delay(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoFpsRanges.setValue(kotlin.coroutines.jvm.internal.Boxing.boxLong(this.getHighSpeedVideoFpsRangesFor[0]));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.common.RecomposeHighlighterKt$recomposeModifier$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.RecomposeHighlighterKt$recomposeModifier$2$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecomposeHighlighterKt$recomposeModifier$2$1$1(androidx.compose.runtime.MutableState<java.lang.Long> mutableState, long[] jArr, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.RecomposeHighlighterKt$recomposeModifier$2$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighSpeedVideoFpsRangesFor = jArr;
    }
}
