package com.apollographql.apollo.network;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/NetworkObserver;", "Ljava/io/Closeable;", "Lokio/getOutputFormats;", "Lcom/apollographql/apollo/network/NetworkObserver$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setListener", "(Lcom/apollographql/apollo/network/NetworkObserver$Listener;)V", "Listener"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NetworkObserver extends java.io.Closeable {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/NetworkObserver$Listener;", "", "", "isOnline", "", "networkChanged", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void networkChanged(boolean isOnline);
    }

    void setListener(com.apollographql.apollo.network.NetworkObserver.Listener listener);
}
