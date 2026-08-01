package io.ktor.network.sockets;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ServerSocketImpl.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.ServerSocketImpl", f = "ServerSocketImpl.kt", i = {}, l = {41}, m = "acceptSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class ServerSocketImpl$acceptSuspend$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServerSocketImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServerSocketImpl$acceptSuspend$1(ServerSocketImpl serverSocketImpl, Continuation<? super ServerSocketImpl$acceptSuspend$1> continuation) {
        super(continuation);
        this.this$0 = serverSocketImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object acceptSuspend;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        acceptSuspend = this.this$0.acceptSuspend(this);
        return acceptSuspend;
    }
}
