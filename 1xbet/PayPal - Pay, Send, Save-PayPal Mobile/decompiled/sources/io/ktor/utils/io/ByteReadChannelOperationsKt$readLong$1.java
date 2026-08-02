package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {76}, m = "readLong", n = {"$this$readLong"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class ByteReadChannelOperationsKt$readLong$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.readLong(null, this);
    }

    ByteReadChannelOperationsKt$readLong$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$readLong$1> continuation) {
        super(continuation);
    }
}
