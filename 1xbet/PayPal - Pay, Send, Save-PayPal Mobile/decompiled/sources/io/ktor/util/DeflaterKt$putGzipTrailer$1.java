package io.ktor.util;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0}, l = {43, 44}, m = "putGzipTrailer", n = {"$this$putGzipTrailer", "deflater"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class DeflaterKt$putGzipTrailer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = io.ktor.util.DeflaterKt.getHighSpeedVideoFpsRanges(null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    DeflaterKt$putGzipTrailer$1(kotlin.coroutines.Continuation<? super io.ktor.util.DeflaterKt$putGzipTrailer$1> continuation) {
        super(continuation);
    }
}
