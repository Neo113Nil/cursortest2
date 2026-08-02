package io.ktor.network.sockets;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", i = {0, 0}, l = {136}, m = "sendSuspend", n = {"buffer", "address"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class DatagramSendChannel$sendSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.network.sockets.DatagramSendChannel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.network.sockets.DatagramSendChannel.access$sendSuspend(this.Camera2StreamConfigurationMap, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSendChannel$sendSuspend$1(io.ktor.network.sockets.DatagramSendChannel datagramSendChannel, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = datagramSendChannel;
    }
}
