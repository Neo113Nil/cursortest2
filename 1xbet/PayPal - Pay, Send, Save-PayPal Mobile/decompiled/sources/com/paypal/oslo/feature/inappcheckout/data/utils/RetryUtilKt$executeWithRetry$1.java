package com.paypal.oslo.feature.inappcheckout.data.utils;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.utils.RetryUtilKt", f = "RetryUtil.kt", i = {0, 0, 0, 0, 1, 1}, l = {23, 31}, m = "executeWithRetry", n = {"block", "maxRetries", "it", "$i$a$-repeat-RetryUtilKt$executeWithRetry$2", "block", "maxRetries"}, nl = {25, -1}, s = {"L$0", "I$0", "I$2", "I$3", "L$0", "I$0"}, v = 2)
/* loaded from: classes13.dex */
final class RetryUtilKt$executeWithRetry$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.inappcheckout.data.utils.RetryUtilKt.executeWithRetry(0, null, this);
    }

    RetryUtilKt$executeWithRetry$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.utils.RetryUtilKt$executeWithRetry$1> continuation) {
        super(continuation);
    }
}
