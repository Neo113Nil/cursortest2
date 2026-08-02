package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/network/sockets/Acceptable;", "Lio/ktor/network/sockets/ASocket;", "S", "accept", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Acceptable<S extends io.ktor.network.sockets.ASocket> extends io.ktor.network.sockets.ASocket {
    java.lang.Object accept(kotlin.coroutines.Continuation<? super S> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <S extends io.ktor.network.sockets.ASocket> void dispose(io.ktor.network.sockets.Acceptable<? extends S> acceptable) {
            io.ktor.network.sockets.ASocket.DefaultImpls.dispose(acceptable);
        }
    }
}
