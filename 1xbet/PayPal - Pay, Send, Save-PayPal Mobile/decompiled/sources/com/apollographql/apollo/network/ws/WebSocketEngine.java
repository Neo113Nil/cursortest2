package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "", "", "url", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "headers", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "open", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface WebSocketEngine {
    java.lang.Object open(java.lang.String str, java.util.List<com.apollographql.apollo.api.http.HttpHeader> list, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.WebSocketConnection> continuation);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object open$default(com.apollographql.apollo.network.ws.WebSocketEngine webSocketEngine, java.lang.String str, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: open");
        }
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return webSocketEngine.open(str, list, continuation);
    }
}
