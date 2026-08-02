package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {87}, m = "readDouble", n = {"$this$readDouble"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class ByteReadChannelOperationsKt$readDouble$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.readDouble(null, this);
    }

    ByteReadChannelOperationsKt$readDouble$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$readDouble$1> continuation) {
        super(continuation);
    }
}
