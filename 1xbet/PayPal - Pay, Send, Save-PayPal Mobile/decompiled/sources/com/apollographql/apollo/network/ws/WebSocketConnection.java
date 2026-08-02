package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "", "", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokio/ByteString;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "send", "(Lokio/ByteString;)V", "string", "(Ljava/lang/String;)V", "close", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface WebSocketConnection {
    void close();

    java.lang.Object receive(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    void send(java.lang.String string);

    void send(okio.ByteString data);
}
