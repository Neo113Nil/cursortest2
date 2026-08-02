package io.ktor.utils.io.jvm.javaio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.WritingKt", f = "Writing.kt", i = {0, 0, 0}, l = {25}, m = "copyTo", n = {"$this$copyTo", "out", "result"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes17.dex */
final class WritingKt$copyTo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return io.ktor.utils.io.jvm.javaio.WritingKt.copyTo(null, null, 0L, this);
    }

    WritingKt$copyTo$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1> continuation) {
        super(continuation);
    }
}
