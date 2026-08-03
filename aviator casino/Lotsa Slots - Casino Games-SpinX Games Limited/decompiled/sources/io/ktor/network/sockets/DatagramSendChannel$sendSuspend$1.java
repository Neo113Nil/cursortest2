package io.ktor.network.sockets;

/* compiled from: DatagramSendChannel.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", i = {0, 0}, l = {136}, m = "sendSuspend", n = {"buffer", com.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_ADDRESS}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class DatagramSendChannel$sendSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.network.sockets.DatagramSendChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSendChannel$sendSuspend$1(io.ktor.network.sockets.DatagramSendChannel datagramSendChannel, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.DatagramSendChannel$sendSuspend$1> continuation) {
        super(continuation);
        this.this$0 = datagramSendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object sendSuspend;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendSuspend = this.this$0.sendSuspend(null, null, this);
        return sendSuspend;
    }
}
