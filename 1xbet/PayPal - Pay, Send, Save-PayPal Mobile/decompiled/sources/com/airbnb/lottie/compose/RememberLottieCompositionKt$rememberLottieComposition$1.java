package com.airbnb.lottie.compose;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class RememberLottieCompositionKt$rememberLottieComposition$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num, java.lang.Throwable th, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return new com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1(continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    RememberLottieCompositionKt$rememberLottieComposition$1(kotlin.coroutines.Continuation<? super com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1> continuation) {
        super(3, continuation);
    }
}
