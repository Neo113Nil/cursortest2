package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt", f = "ByteWriteChannelOperations.kt", i = {0, 0}, l = {116}, m = "writePacket", n = {"$this$writePacket", "source"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class ByteWriteChannelOperationsKt$writePacket$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writePacket((io.ktor.utils.io.ByteWriteChannel) null, (kotlinx.io.Source) null, this);
    }

    ByteWriteChannelOperationsKt$writePacket$2(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteWriteChannelOperationsKt$writePacket$2> continuation) {
        super(continuation);
    }
}
