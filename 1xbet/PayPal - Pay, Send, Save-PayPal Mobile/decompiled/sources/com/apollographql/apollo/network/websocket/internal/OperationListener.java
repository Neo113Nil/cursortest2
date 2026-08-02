package com.apollographql.apollo.network.websocket.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/websocket/internal/OperationListener;", "", "Lcom/apollographql/apollo/api/json/ApolloJsonElement;", "response", "", "onResponse", "(Ljava/lang/Object;)V", "onComplete", "()V", "payload", "onError", "Lcom/apollographql/apollo/exception/ApolloException;", "cause", "onTransportError", "(Lcom/apollographql/apollo/exception/ApolloException;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OperationListener {
    void onComplete();

    void onError(java.lang.Object payload);

    void onResponse(java.lang.Object response);

    void onTransportError(com.apollographql.apollo.exception.ApolloException cause);
}
