package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {}, l = {92}, m = "awaitUntilReadable", n = {}, s = {})
/* loaded from: classes3.dex */
final class ByteReadChannelOperationsKt$awaitUntilReadable$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = io.ktor.utils.io.ByteReadChannelOperationsKt.getHighSpeedVideoFpsRanges(null, 0, this);
        return highSpeedVideoFpsRanges;
    }

    ByteReadChannelOperationsKt$awaitUntilReadable$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$awaitUntilReadable$1> continuation) {
        super(continuation);
    }
}
