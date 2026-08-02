package com.apollographql.apollo.network;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/network/NetworkObserver;", "NoOpNetworkObserver", "Lcom/apollographql/apollo/network/NetworkObserver;", "getNoOpNetworkObserver", "()Lcom/apollographql/apollo/network/NetworkObserver;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkObserverKt {
    private static final com.apollographql.apollo.network.NetworkObserver NoOpNetworkObserver = new com.apollographql.apollo.network.NetworkObserver() { // from class: com.apollographql.apollo.network.NetworkObserverKt$NoOpNetworkObserver$1
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // com.apollographql.apollo.network.NetworkObserver
        public final void setListener(com.apollographql.apollo.network.NetworkObserver.Listener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            listener.networkChanged(true);
        }
    };

    public static final com.apollographql.apollo.network.NetworkObserver getNoOpNetworkObserver() {
        return NoOpNetworkObserver;
    }
}
