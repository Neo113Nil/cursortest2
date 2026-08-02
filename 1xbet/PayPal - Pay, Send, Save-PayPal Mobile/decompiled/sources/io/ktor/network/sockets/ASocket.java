package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lio/ktor/network/sockets/ASocket;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/getHighResolutionOutputSizeshNQ4ISI;", "Lkotlinx/coroutines/DisposableHandle;", "", "dispose", "()V", "Lkotlinx/coroutines/Job;", "getSocketContext", "()Lkotlinx/coroutines/Job;", "socketContext"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ASocket extends java.io.Closeable, kotlinx.coroutines.DisposableHandle {
    @Override // kotlinx.coroutines.DisposableHandle
    void dispose();

    kotlinx.coroutines.Job getSocketContext();

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void dispose(io.ktor.network.sockets.ASocket aSocket) {
            try {
                aSocket.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
