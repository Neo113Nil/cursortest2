package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\bJ&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0013\u001a\u00020\u00038CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/apollographql/apollo/network/ws/DefaultWebSocketEngine;", "Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "Lkotlin/Function0;", "Lokhttp3/WebSocket$Factory;", "webSocketFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "(Lokhttp3/WebSocket$Factory;)V", "()V", "", "url", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "headers", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "open", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultWebSocketEngine implements com.apollographql.apollo.network.ws.WebSocketEngine {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    /* renamed from: $r8$lambda$cdSsgcLX3aIIFvCtZ6Je-2DYsrc, reason: not valid java name */
    public static /* synthetic */ okhttp3.WebSocket.Factory m9984$r8$lambda$cdSsgcLX3aIIFvCtZ6Je2DYsrc(okhttp3.WebSocket.Factory factory) {
        return factory;
    }

    public DefaultWebSocketEngine(final kotlin.jvm.functions.Function0<? extends okhttp3.WebSocket.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.apollographql.apollo.network.ws.DefaultWebSocketEngine.$r8$lambda$a0EfyqhNVOmljFpRimnsiaC4h8w(kotlin.jvm.functions.Function0.this);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketEngine(final okhttp3.WebSocket.Factory factory) {
        this((kotlin.jvm.functions.Function0<? extends okhttp3.WebSocket.Factory>) new kotlin.jvm.functions.Function0() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.apollographql.apollo.network.ws.DefaultWebSocketEngine.m9984$r8$lambda$cdSsgcLX3aIIFvCtZ6Je2DYsrc(okhttp3.WebSocket.Factory.this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
    }

    public DefaultWebSocketEngine() {
        this(com.apollographql.apollo.network.OkHttpExtensionsKt.getDefaultOkHttpClientBuilder().build());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.network.ws.WebSocketEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object open(java.lang.String str, java.util.List<com.apollographql.apollo.api.http.HttpHeader> list, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.WebSocketConnection> continuation) {
        com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1 defaultWebSocketEngine$open$1;
        int i;
        final okhttp3.WebSocket newWebSocket;
        final kotlinx.coroutines.channels.Channel channel;
        if (continuation instanceof com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1) {
            defaultWebSocketEngine$open$1 = (com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1) continuation;
            if ((defaultWebSocketEngine$open$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                defaultWebSocketEngine$open$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = defaultWebSocketEngine$open$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultWebSocketEngine$open$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                    final kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    newWebSocket = ((okhttp3.WebSocket.Factory) this.getHighSpeedVideoSizes.getValue()).newWebSocket(new okhttp3.Request.Builder().url(str).headers(com.apollographql.apollo.network.OkHttpExtensionsKt.toOkHttpHeaders(list)).build(), new okhttp3.WebSocketListener() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$webSocket$1
                        @Override // okhttp3.WebSocketListener
                        public final void onOpen(okhttp3.WebSocket webSocket, okhttp3.Response response) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                            CompletableDeferred$default.complete(kotlin.Unit.INSTANCE);
                        }

                        @Override // okhttp3.WebSocketListener
                        public final void onMessage(okhttp3.WebSocket webSocket, java.lang.String text) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
                            Channel$default.mo9266trySendJP2dKIU(text);
                        }

                        @Override // okhttp3.WebSocketListener
                        public final void onMessage(okhttp3.WebSocket webSocket, okio.ByteString bytes) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
                            Channel$default.mo9266trySendJP2dKIU(bytes.utf8());
                        }

                        @Override // okhttp3.WebSocketListener
                        public final void onFailure(okhttp3.WebSocket webSocket, java.lang.Throwable t, okhttp3.Response response) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
                            CompletableDeferred$default.complete(kotlin.Unit.INSTANCE);
                            Channel$default.close(new com.apollographql.apollo.exception.ApolloNetworkException("Web socket communication error", t));
                        }

                        @Override // okhttp3.WebSocketListener
                        public final void onClosing(okhttp3.WebSocket webSocket, int code, java.lang.String reason) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                            CompletableDeferred$default.complete(kotlin.Unit.INSTANCE);
                            Channel$default.close(new com.apollographql.apollo.exception.ApolloWebSocketClosedException(code, reason, null, 4, null));
                        }

                        @Override // okhttp3.WebSocketListener
                        public final void onClosed(okhttp3.WebSocket webSocket, int code, java.lang.String reason) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(Channel$default, null, 1, null);
                        }
                    });
                    defaultWebSocketEngine$open$1.getHighResolutionOutputSizeshNQ4ISI = Channel$default;
                    defaultWebSocketEngine$open$1.getHighSpeedVideoSizes = newWebSocket;
                    defaultWebSocketEngine$open$1.Camera2StreamConfigurationMap = 1;
                    if (CompletableDeferred$default.await(defaultWebSocketEngine$open$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channel = Channel$default;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    newWebSocket = (okhttp3.WebSocket) defaultWebSocketEngine$open$1.getHighSpeedVideoSizes;
                    channel = (kotlinx.coroutines.channels.Channel) defaultWebSocketEngine$open$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                channel.invokeOnClose(new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.apollographql.apollo.network.ws.DefaultWebSocketEngine.m9983$r8$lambda$OP_HPTrHjZS6fpuolJbq2ACsTc(okhttp3.WebSocket.this, (java.lang.Throwable) obj2);
                    }
                });
                return new com.apollographql.apollo.network.ws.WebSocketConnection() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$3
                    @Override // com.apollographql.apollo.network.ws.WebSocketConnection
                    public final java.lang.Object receive(kotlin.coroutines.Continuation<? super java.lang.String> continuation2) {
                        return channel.receive(continuation2);
                    }

                    @Override // com.apollographql.apollo.network.ws.WebSocketConnection
                    public final void send(okio.ByteString data) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                        if (newWebSocket.send(data)) {
                            return;
                        }
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    }

                    @Override // com.apollographql.apollo.network.ws.WebSocketConnection
                    public final void send(java.lang.String string) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
                        if (newWebSocket.send(string)) {
                            return;
                        }
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    }

                    @Override // com.apollographql.apollo.network.ws.WebSocketConnection
                    public final void close() {
                        newWebSocket.close(1000, null);
                    }
                };
            }
        }
        defaultWebSocketEngine$open$1 = new com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1(this, continuation);
        java.lang.Object obj2 = defaultWebSocketEngine$open$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultWebSocketEngine$open$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        channel.invokeOnClose(new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.apollographql.apollo.network.ws.DefaultWebSocketEngine.m9983$r8$lambda$OP_HPTrHjZS6fpuolJbq2ACsTc(okhttp3.WebSocket.this, (java.lang.Throwable) obj22);
            }
        });
        return new com.apollographql.apollo.network.ws.WebSocketConnection() { // from class: com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$3
            @Override // com.apollographql.apollo.network.ws.WebSocketConnection
            public final java.lang.Object receive(kotlin.coroutines.Continuation<? super java.lang.String> continuation2) {
                return channel.receive(continuation2);
            }

            @Override // com.apollographql.apollo.network.ws.WebSocketConnection
            public final void send(okio.ByteString data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                if (newWebSocket.send(data)) {
                    return;
                }
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel, null, 1, null);
            }

            @Override // com.apollographql.apollo.network.ws.WebSocketConnection
            public final void send(java.lang.String string) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
                if (newWebSocket.send(string)) {
                    return;
                }
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel, null, 1, null);
            }

            @Override // com.apollographql.apollo.network.ws.WebSocketConnection
            public final void close() {
                newWebSocket.close(1000, null);
            }
        };
    }

    /* renamed from: $r8$lambda$OP_-HPTrHjZS6fpuolJbq2ACsTc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9983$r8$lambda$OP_HPTrHjZS6fpuolJbq2ACsTc(okhttp3.WebSocket webSocket, java.lang.Throwable th) {
        webSocket.close(1001, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ okhttp3.WebSocket.Factory $r8$lambda$a0EfyqhNVOmljFpRimnsiaC4h8w(kotlin.jvm.functions.Function0 function0) {
        return (okhttp3.WebSocket.Factory) function0.invoke();
    }
}
