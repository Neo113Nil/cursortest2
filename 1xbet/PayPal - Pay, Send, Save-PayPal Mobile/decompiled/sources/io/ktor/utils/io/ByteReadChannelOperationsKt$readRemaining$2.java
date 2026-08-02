package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {239}, m = "readRemaining", n = {"$this$readRemaining", "result", "remaining"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class ByteReadChannelOperationsKt$readRemaining$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(null, 0L, this);
    }

    ByteReadChannelOperationsKt$readRemaining$2(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$readRemaining$2> continuation) {
        super(continuation);
    }
}
