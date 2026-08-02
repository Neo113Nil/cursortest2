package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ReaderJob", f = "ByteReadChannelOperations.kt", i = {}, l = {311, 313}, m = "flushAndClose", n = {}, s = {})
/* loaded from: classes3.dex */
final class ReaderJob$flushAndClose$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.utils.io.ReaderJob Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.flushAndClose(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReaderJob$flushAndClose$1(io.ktor.utils.io.ReaderJob readerJob, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ReaderJob$flushAndClose$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = readerJob;
    }
}
