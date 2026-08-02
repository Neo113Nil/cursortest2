package io.ktor.network.sockets;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.ConnectUtilsJvmKt", f = "ConnectUtilsJvm.kt", i = {0}, l = {21}, m = "tcpConnect", n = {"result$iv"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class ConnectUtilsJvmKt$tcpConnect$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return io.ktor.network.sockets.ConnectUtilsJvmKt.tcpConnect(null, null, null, this);
    }

    ConnectUtilsJvmKt$tcpConnect$1(kotlin.coroutines.Continuation<? super io.ktor.network.sockets.ConnectUtilsJvmKt$tcpConnect$1> continuation) {
        super(continuation);
    }
}
