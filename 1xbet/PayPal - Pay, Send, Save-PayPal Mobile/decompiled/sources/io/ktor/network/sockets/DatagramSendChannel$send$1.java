package io.ktor.network.sockets;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", i = {0, 0, 1}, l = {201, 95}, m = "send", n = {"element", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
final class DatagramSendChannel$send$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.network.sockets.DatagramSendChannel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.send2((io.ktor.network.sockets.Datagram) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSendChannel$send$1(io.ktor.network.sockets.DatagramSendChannel datagramSendChannel, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.DatagramSendChannel$send$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = datagramSendChannel;
    }
}
