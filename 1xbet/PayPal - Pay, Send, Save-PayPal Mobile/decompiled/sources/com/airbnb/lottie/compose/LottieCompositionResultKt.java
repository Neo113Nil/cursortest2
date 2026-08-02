package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResult;", "Lcom/airbnb/lottie/LottieComposition;", "awaitOrNull", "(Lcom/airbnb/lottie/compose/LottieCompositionResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LottieCompositionResultKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitOrNull(com.airbnb.lottie.compose.LottieCompositionResult lottieCompositionResult, kotlin.coroutines.Continuation<? super com.airbnb.lottie.LottieComposition> continuation) {
        com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1 lottieCompositionResultKt$awaitOrNull$1;
        int i;
        try {
            if (continuation instanceof com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1) {
                lottieCompositionResultKt$awaitOrNull$1 = (com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1) continuation;
                if ((lottieCompositionResultKt$awaitOrNull$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    lottieCompositionResultKt$awaitOrNull$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = lottieCompositionResultKt$awaitOrNull$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = lottieCompositionResultKt$awaitOrNull$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        lottieCompositionResultKt$awaitOrNull$1.getHighSpeedVideoSizes = 1;
                        obj = lottieCompositionResult.await(lottieCompositionResultKt$awaitOrNull$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (com.airbnb.lottie.LottieComposition) obj;
                }
            }
            if (i != 0) {
            }
            return (com.airbnb.lottie.LottieComposition) obj;
        } catch (java.lang.Throwable unused) {
            return null;
        }
        lottieCompositionResultKt$awaitOrNull$1 = new com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1(continuation);
        java.lang.Object obj2 = lottieCompositionResultKt$awaitOrNull$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lottieCompositionResultKt$awaitOrNull$1.getHighSpeedVideoSizes;
    }
}
