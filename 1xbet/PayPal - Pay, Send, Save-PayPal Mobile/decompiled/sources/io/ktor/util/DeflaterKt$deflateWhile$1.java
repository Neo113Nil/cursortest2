package io.ktor.util;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0, 0, 0}, l = {52}, m = "deflateWhile", n = {"$this$deflateWhile", "deflater", "buffer", "predicate"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes17.dex */
final class DeflaterKt$deflateWhile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getInputFormats = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoSizes = io.ktor.util.DeflaterKt.getHighSpeedVideoSizes(null, null, null, null, this);
        return highSpeedVideoSizes;
    }

    DeflaterKt$deflateWhile$1(kotlin.coroutines.Continuation<? super io.ktor.util.DeflaterKt$deflateWhile$1> continuation) {
        super(continuation);
    }
}
