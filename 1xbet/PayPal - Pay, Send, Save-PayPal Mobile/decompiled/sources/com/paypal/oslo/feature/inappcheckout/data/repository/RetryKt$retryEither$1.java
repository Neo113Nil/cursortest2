package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt", f = "Retry.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {42, 64}, m = "retryEither", n = {"shouldRetryForError", "beforeNewAttempt", "block", "lastResult", "times", "delayMillis", "attempt", "shouldRetryForError", "beforeNewAttempt", "block", "lastResult", "result", "times", "delayMillis", "attempt", "shouldBreak"}, nl = {43, 41}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "Z$0"}, v = 2)
/* loaded from: classes13.dex */
final class RetryKt$retryEither$1<L, R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt.retryEither(0, 0L, null, null, null, this);
    }

    RetryKt$retryEither$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.RetryKt$retryEither$1> continuation) {
        super(continuation);
    }
}
