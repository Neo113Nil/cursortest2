package io.ktor.network.sockets;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.ServerSocketImpl", f = "ServerSocketImpl.kt", i = {}, l = {41}, m = "acceptSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class ServerSocketImpl$acceptSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.network.sockets.ServerSocketImpl getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI((kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Socket>) this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServerSocketImpl$acceptSuspend$1(io.ktor.network.sockets.ServerSocketImpl serverSocketImpl, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = serverSocketImpl;
    }
}
