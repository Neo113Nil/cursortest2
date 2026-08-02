package io.ktor.network.sockets;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.DatagramSocketImpl", f = "DatagramSocketImpl.kt", i = {0}, l = {90}, m = "receiveSuspend", n = {"buffer"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class DatagramSocketImpl$receiveSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.network.sockets.DatagramSocketImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSocketImpl$receiveSuspend$1(io.ktor.network.sockets.DatagramSocketImpl datagramSocketImpl, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.DatagramSocketImpl$receiveSuspend$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = datagramSocketImpl;
    }
}
