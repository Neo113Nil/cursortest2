package io.ktor.network.sockets;

import com.facebook.appevents.integrity.IntegrityManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DatagramSendChannel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", i = {0, 0}, l = {136}, m = "sendSuspend", n = {"buffer", IntegrityManager.INTEGRITY_TYPE_ADDRESS}, s = {"L$0", "L$1"})
/* loaded from: classes7.dex */
final class DatagramSendChannel$sendSuspend$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DatagramSendChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSendChannel$sendSuspend$1(DatagramSendChannel datagramSendChannel, Continuation<? super DatagramSendChannel$sendSuspend$1> continuation) {
        super(continuation);
        this.this$0 = datagramSendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendSuspend;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendSuspend = this.this$0.sendSuspend(null, null, this);
        return sendSuspend;
    }
}
