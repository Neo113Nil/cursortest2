package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt", f = "ByteWriteChannelOperations.kt", i = {0}, l = {224}, m = "write", n = {"written"}, s = {"I$0"})
/* loaded from: classes3.dex */
final class ByteWriteChannelOperationsKt$write$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.write(null, 0, null, this);
    }

    ByteWriteChannelOperationsKt$write$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteWriteChannelOperationsKt$write$1> continuation) {
        super(continuation);
    }
}
