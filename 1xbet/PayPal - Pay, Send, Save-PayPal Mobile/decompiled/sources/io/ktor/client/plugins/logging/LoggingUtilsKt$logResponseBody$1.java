package io.ktor.client.plugins.logging;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingUtilsKt", f = "LoggingUtils.kt", i = {0, 0}, l = {71}, m = "logResponseBody", n = {"$this$logResponseBody_u24lambda_u244", "charset$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class LoggingUtilsKt$logResponseBody$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.logging.LoggingUtilsKt.logResponseBody(null, null, null, this);
    }

    LoggingUtilsKt$logResponseBody$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.LoggingUtilsKt$logResponseBody$1> continuation) {
        super(continuation);
    }
}
