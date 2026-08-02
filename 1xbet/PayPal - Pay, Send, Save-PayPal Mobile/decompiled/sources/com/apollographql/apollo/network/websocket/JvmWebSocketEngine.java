package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0017\u001a\u00020\u00038CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u00020\u00188\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/apollographql/apollo/network/websocket/JvmWebSocketEngine;", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "Lkotlin/Function0;", "Lokhttp3/WebSocket$Factory;", "webSocketFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "(Lokhttp3/WebSocket$Factory;)V", "", "url", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "headers", "Lcom/apollographql/apollo/network/websocket/WebSocketListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/apollographql/apollo/network/websocket/WebSocket;", "newWebSocket", "(Ljava/lang/String;Ljava/util/List;Lcom/apollographql/apollo/network/websocket/WebSocketListener;)Lcom/apollographql/apollo/network/websocket/WebSocket;", "", "close", "()V", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "Z", "getClosed", "()Z", "setClosed", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JvmWebSocketEngine implements com.apollographql.apollo.network.websocket.WebSocketEngine {
    private boolean closed;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ okhttp3.WebSocket.Factory $r8$lambda$TzDMp2pjFQJOEX1tRWU1rqpv8c8(okhttp3.WebSocket.Factory factory) {
        return factory;
    }

    public JvmWebSocketEngine(final kotlin.jvm.functions.Function0<? extends okhttp3.WebSocket.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.network.websocket.JvmWebSocketEngine$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.apollographql.apollo.network.websocket.JvmWebSocketEngine.$r8$lambda$Wj84AH1sABZFa_Ysjud2sDmTwXg(kotlin.jvm.functions.Function0.this);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmWebSocketEngine(final okhttp3.WebSocket.Factory factory) {
        this((kotlin.jvm.functions.Function0<? extends okhttp3.WebSocket.Factory>) new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.network.websocket.JvmWebSocketEngine$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.apollographql.apollo.network.websocket.JvmWebSocketEngine.$r8$lambda$TzDMp2pjFQJOEX1tRWU1rqpv8c8(okhttp3.WebSocket.Factory.this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void setClosed(boolean z) {
        this.closed = z;
    }

    @Override // com.apollographql.apollo.network.websocket.WebSocketEngine
    public final com.apollographql.apollo.network.websocket.WebSocket newWebSocket(java.lang.String url, java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers, com.apollographql.apollo.network.websocket.WebSocketListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        if (this.closed) {
            throw new java.lang.IllegalArgumentException("JvmWebSocketEngine is closed".toString());
        }
        return new com.apollographql.apollo.network.websocket.JvmWebSocket((okhttp3.WebSocket.Factory) this.getHighResolutionOutputSizeshNQ4ISI.getValue(), url, headers, listener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.closed = true;
    }

    public static /* synthetic */ okhttp3.WebSocket.Factory $r8$lambda$Wj84AH1sABZFa_Ysjud2sDmTwXg(kotlin.jvm.functions.Function0 function0) {
        return (okhttp3.WebSocket.Factory) function0.invoke();
    }
}
