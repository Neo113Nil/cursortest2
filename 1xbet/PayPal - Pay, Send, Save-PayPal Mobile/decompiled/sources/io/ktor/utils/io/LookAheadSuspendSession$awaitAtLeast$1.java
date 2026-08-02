package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.LookAheadSuspendSession", f = "LookAheadSession.kt", i = {0}, l = {42}, m = "awaitAtLeast", n = {com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY}, s = {"I$0"})
/* loaded from: classes17.dex */
final class LookAheadSuspendSession$awaitAtLeast$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.utils.io.LookAheadSuspendSession getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.awaitAtLeast(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LookAheadSuspendSession$awaitAtLeast$1(io.ktor.utils.io.LookAheadSuspendSession lookAheadSuspendSession, kotlin.coroutines.Continuation<? super io.ktor.utils.io.LookAheadSuspendSession$awaitAtLeast$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = lookAheadSuspendSession;
    }
}
