package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {446, 461, 485}, m = "readUTF8LineTo-RRvyBJ8", n = {"$this$readUTF8LineTo_u2dRRvyBJ8", "out", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "lineEnding", "$this$readUTF8LineTo_u2dRRvyBJ8", "out", "lineBuffer", "lineEnding", "$this$readUTF8LineTo_u2dRRvyBJ8", "out", "lineBuffer", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "lineEnding"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "L$3", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class ByteReadChannelOperationsKt$readUTF8LineTo$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.m23407readUTF8LineToRRvyBJ8(null, null, 0, 0, this);
    }

    ByteReadChannelOperationsKt$readUTF8LineTo$2(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$readUTF8LineTo$2> continuation) {
        super(continuation);
    }
}
