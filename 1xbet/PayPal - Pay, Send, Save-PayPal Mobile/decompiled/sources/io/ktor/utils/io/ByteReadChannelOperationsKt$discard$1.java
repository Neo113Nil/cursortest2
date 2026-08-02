package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {393}, m = "discard", n = {"$this$discard", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "remaining"}, s = {"L$0", "J$0", "J$1"})
/* loaded from: classes3.dex */
final class ByteReadChannelOperationsKt$discard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.discard(null, 0L, this);
    }

    ByteReadChannelOperationsKt$discard$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$discard$1> continuation) {
        super(continuation);
    }
}
