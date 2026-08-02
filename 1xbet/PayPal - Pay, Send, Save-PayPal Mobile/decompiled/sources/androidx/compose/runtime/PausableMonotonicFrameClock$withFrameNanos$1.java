package androidx.compose.runtime;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", i = {0}, l = {61, 62}, m = "withFrameNanos", n = {"onFrame"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.runtime.PausableMonotonicFrameClock getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.withFrameNanos(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PausableMonotonicFrameClock$withFrameNanos$1(androidx.compose.runtime.PausableMonotonicFrameClock pausableMonotonicFrameClock, kotlin.coroutines.Continuation<? super androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pausableMonotonicFrameClock;
    }
}
