package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0001\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0001\u0010\u0006\u001a\u0015\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0001\u0010\u0007"}, d2 = {"Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "WebSocketEngine", "()Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "Lkotlin/Function0;", "Lokhttp3/WebSocket$Factory;", "webSocketFactory", "(Lkotlin/jvm/functions/Function0;)Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "(Lokhttp3/WebSocket$Factory;)Lcom/apollographql/apollo/network/websocket/WebSocketEngine;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebSocketEngine_jvmKt {
    public static final com.apollographql.apollo.network.websocket.WebSocketEngine WebSocketEngine() {
        return new com.apollographql.apollo.network.websocket.JvmWebSocketEngine((kotlin.jvm.functions.Function0<? extends okhttp3.WebSocket.Factory>) new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.network.websocket.WebSocketEngine_jvmKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                okhttp3.WebSocket.Factory build;
                build = com.apollographql.apollo.network.OkHttpExtensionsKt.getDefaultOkHttpClientBuilder().build();
                return build;
            }
        });
    }

    public static final com.apollographql.apollo.network.websocket.WebSocketEngine WebSocketEngine(kotlin.jvm.functions.Function0<? extends okhttp3.WebSocket.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new com.apollographql.apollo.network.websocket.JvmWebSocketEngine(function0);
    }

    public static final com.apollographql.apollo.network.websocket.WebSocketEngine WebSocketEngine(okhttp3.WebSocket.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return new com.apollographql.apollo.network.websocket.JvmWebSocketEngine(factory);
    }
}
