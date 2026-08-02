package com.paypal.oslo.feature.inappcheckout.data.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aV\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012(\u0010\b\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0080@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"T", "", "maxRetries", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "", "block", "executeWithRetry", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RetryUtilKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0066 -> B:16:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object executeWithRetry(int i, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends T>>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends T>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.utils.RetryUtilKt$executeWithRetry$1 retryUtilKt$executeWithRetry$1;
        int i2;
        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends T>>, ? extends java.lang.Object> function12;
        int i3;
        int i4;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.utils.RetryUtilKt$executeWithRetry$1) {
            retryUtilKt$executeWithRetry$1 = (com.paypal.oslo.feature.inappcheckout.data.utils.RetryUtilKt$executeWithRetry$1) continuation;
            if ((retryUtilKt$executeWithRetry$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                retryUtilKt$executeWithRetry$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = retryUtilKt$executeWithRetry$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = retryUtilKt$executeWithRetry$1.getHighSpeedVideoSizesFor;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    function12 = function1;
                    i3 = i;
                    i4 = 0;
                    if (i4 >= i3) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = retryUtilKt$executeWithRetry$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                int i6 = retryUtilKt$executeWithRetry$1.getHighResolutionOutputSizeshNQ4ISI;
                int i7 = retryUtilKt$executeWithRetry$1.Camera2StreamConfigurationMap;
                i4 = retryUtilKt$executeWithRetry$1.getHighSpeedVideoFpsRangesFor;
                i3 = retryUtilKt$executeWithRetry$1.getHighSpeedVideoFpsRanges;
                kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, ? extends T>>, ? extends java.lang.Object> function13 = (kotlin.jvm.functions.Function1) retryUtilKt$executeWithRetry$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Either either = (arrow.core.Either) obj;
                if (!either.isRight()) {
                    return either;
                }
                i4++;
                function12 = function13;
                if (i4 >= i3) {
                    retryUtilKt$executeWithRetry$1.getHighSpeedVideoSizes = function12;
                    retryUtilKt$executeWithRetry$1.getHighSpeedVideoFpsRanges = i3;
                    retryUtilKt$executeWithRetry$1.getHighSpeedVideoFpsRangesFor = i4;
                    retryUtilKt$executeWithRetry$1.Camera2StreamConfigurationMap = i4;
                    retryUtilKt$executeWithRetry$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    retryUtilKt$executeWithRetry$1.getHighSpeedVideoSizesFor = 1;
                    java.lang.Object invoke = function12.invoke(retryUtilKt$executeWithRetry$1);
                    if (invoke != coroutine_suspended) {
                        function13 = function12;
                        obj = invoke;
                        arrow.core.Either either2 = (arrow.core.Either) obj;
                        if (!either2.isRight()) {
                        }
                    }
                } else {
                    retryUtilKt$executeWithRetry$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                    retryUtilKt$executeWithRetry$1.getHighSpeedVideoFpsRanges = i3;
                    retryUtilKt$executeWithRetry$1.getHighSpeedVideoSizesFor = 2;
                    java.lang.Object invoke2 = function12.invoke(retryUtilKt$executeWithRetry$1);
                    if (invoke2 != coroutine_suspended) {
                        return invoke2;
                    }
                }
                return coroutine_suspended;
            }
        }
        retryUtilKt$executeWithRetry$1 = new com.paypal.oslo.feature.inappcheckout.data.utils.RetryUtilKt$executeWithRetry$1(continuation);
        java.lang.Object obj2 = retryUtilKt$executeWithRetry$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = retryUtilKt$executeWithRetry$1.getHighSpeedVideoSizesFor;
        if (i2 != 0) {
        }
    }

    public static /* synthetic */ java.lang.Object executeWithRetry$default(int i, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return executeWithRetry(i, function1, continuation);
    }
}
