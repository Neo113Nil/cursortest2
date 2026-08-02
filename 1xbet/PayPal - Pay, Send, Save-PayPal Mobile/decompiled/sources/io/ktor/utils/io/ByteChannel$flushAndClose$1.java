package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", i = {}, l = {128}, m = "flushAndClose", n = {}, s = {})
/* loaded from: classes3.dex */
final class ByteChannel$flushAndClose$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.utils.io.ByteChannel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.flushAndClose(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannel$flushAndClose$1(io.ktor.utils.io.ByteChannel byteChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteChannel$flushAndClose$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = byteChannel;
    }
}
