package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\t\u001a\u00020\u0002\"\b\b\u0000\u0010\u0006*\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\u0002\"\b\b\u0000\u0010\u0006*\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/websocket/WsProtocol;", "", "Lcom/apollographql/apollo/network/websocket/ClientMessage;", "connectionInit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "operationStart", "(Lcom/apollographql/apollo/api/ApolloRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operationStop", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lcom/apollographql/apollo/network/websocket/ClientMessage;", "ping", "()Lcom/apollographql/apollo/network/websocket/ClientMessage;", "pong", "", "text", "Lcom/apollographql/apollo/network/websocket/ServerMessage;", "parseServerMessage", "(Ljava/lang/String;)Lcom/apollographql/apollo/network/websocket/ServerMessage;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface WsProtocol {
    java.lang.Object connectionInit(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.ClientMessage> continuation);

    java.lang.String getName();

    <D extends com.apollographql.apollo.api.Operation.Data> java.lang.Object operationStart(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.ClientMessage> continuation);

    <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.network.websocket.ClientMessage operationStop(com.apollographql.apollo.api.ApolloRequest<D> request);

    com.apollographql.apollo.network.websocket.ServerMessage parseServerMessage(java.lang.String text);

    com.apollographql.apollo.network.websocket.ClientMessage ping();

    com.apollographql.apollo.network.websocket.ClientMessage pong();
}
