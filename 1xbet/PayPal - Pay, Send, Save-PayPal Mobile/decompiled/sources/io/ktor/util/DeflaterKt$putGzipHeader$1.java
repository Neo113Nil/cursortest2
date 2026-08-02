package io.ktor.util;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 1}, l = {37, 38, 39}, m = "putGzipHeader", n = {"$this$putGzipHeader", "$this$putGzipHeader"}, s = {"L$0", "L$0"})
/* loaded from: classes17.dex */
final class DeflaterKt$putGzipHeader$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = io.ktor.util.DeflaterKt.getHighSpeedVideoFpsRanges((io.ktor.utils.io.ByteWriteChannel) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highSpeedVideoFpsRanges;
    }

    DeflaterKt$putGzipHeader$1(kotlin.coroutines.Continuation<? super io.ktor.util.DeflaterKt$putGzipHeader$1> continuation) {
        super(continuation);
    }
}
