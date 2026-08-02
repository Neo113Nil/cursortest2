package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00010BC\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010-\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010,R\u0014\u0010\u001f\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010/"}, d2 = {"Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport;", "Lcom/apollographql/apollo/network/NetworkTransport;", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "p0", "", "p1", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "p2", "Lkotlin/time/Duration;", "p3", "p4", "p5", "Lcom/apollographql/apollo/network/websocket/SubscriptionParserFactory;", "p6", "<init>", "(Lcom/apollographql/apollo/network/websocket/WebSocketEngine;Ljava/lang/String;Lcom/apollographql/apollo/network/websocket/WsProtocol;JLkotlin/time/Duration;JLcom/apollographql/apollo/network/websocket/SubscriptionParserFactory;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "execute", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lkotlinx/coroutines/flow/Flow;", "", "dispose", "()V", "Lcom/apollographql/apollo/exception/ApolloException;", "reason", "closeConnection", "(Lcom/apollographql/apollo/exception/ApolloException;)V", "getHighSpeedVideoSizesFor", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "getHighSpeedVideoFpsRanges", "getOutputFormats", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRangesFor", "Lkotlin/time/Duration;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/network/websocket/SubscriptionParserFactory;", "getOutputMinFrameDuration", "Lcom/apollographql/apollo/network/websocket/internal/WebSocketPool;", "Lcom/apollographql/apollo/network/websocket/internal/WebSocketPool;", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebSocketNetworkTransport implements com.apollographql.apollo.network.NetworkTransport {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.websocket.SubscriptionParserFactory getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.websocket.internal.WebSocketPool getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.time.Duration getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.websocket.WebSocketEngine getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.websocket.WsProtocol Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    private WebSocketNetworkTransport(com.apollographql.apollo.network.websocket.WebSocketEngine webSocketEngine, java.lang.String str, com.apollographql.apollo.network.websocket.WsProtocol wsProtocol, long j, kotlin.time.Duration duration, long j2, com.apollographql.apollo.network.websocket.SubscriptionParserFactory subscriptionParserFactory) {
        this.getHighSpeedVideoFpsRanges = webSocketEngine;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = wsProtocol;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoSizes = duration;
        this.getOutputFormats = j2;
        this.getOutputMinFrameDuration = subscriptionParserFactory;
        this.getHighSpeedVideoSizesFor = new com.apollographql.apollo.network.websocket.internal.WebSocketPool(webSocketEngine, str, wsProtocol, j, duration, j2, null);
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> execute(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return kotlinx.coroutines.flow.FlowKt__ContextKt.buffer$default(kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.apollographql.apollo.network.websocket.WebSocketNetworkTransport$execute$flow$1(new kotlin.jvm.internal.Ref.BooleanRef(), request, this, null)), Integer.MAX_VALUE, null, 2, null);
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final void dispose() {
        this.getHighSpeedVideoSizesFor.close();
    }

    public final void closeConnection(com.apollographql.apollo.exception.ApolloException reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        this.getHighSpeedVideoSizesFor.closeAllConnections(reason);
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0018\u0010!\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010&"}, d2 = {"Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport$Builder;", "", "<init>", "()V", "", "serverUrl", "(Ljava/lang/String;)Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport$Builder;", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "webSocketEngine", "(Lcom/apollographql/apollo/network/websocket/WebSocketEngine;)Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport$Builder;", "Lkotlin/time/Duration;", "idleTimeout", "idleTimeout-BwNAW2A", "(Lkotlin/time/Duration;)Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport$Builder;", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "wsProtocol", "(Lcom/apollographql/apollo/network/websocket/WsProtocol;)Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport$Builder;", "pingInterval", "pingInterval-BwNAW2A", "connectionAcknowledgeTimeout", "connectionAcknowledgeTimeout-BwNAW2A", "Lcom/apollographql/apollo/network/websocket/SubscriptionParserFactory;", "parserFactory", "(Lcom/apollographql/apollo/network/websocket/SubscriptionParserFactory;)Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport$Builder;", "Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport;", "build", "()Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getOutputFormats", "Lcom/apollographql/apollo/network/websocket/WebSocketEngine;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/time/Duration;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/network/websocket/SubscriptionParserFactory;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private kotlin.time.Duration getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private kotlin.time.Duration getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private com.apollographql.apollo.network.websocket.SubscriptionParserFactory getHighSpeedVideoSizesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private kotlin.time.Duration getOutputFormats;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.String Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        private com.apollographql.apollo.network.websocket.WsProtocol getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private com.apollographql.apollo.network.websocket.WebSocketEngine getHighSpeedVideoFpsRanges;

        public final com.apollographql.apollo.network.websocket.WebSocketNetworkTransport.Builder serverUrl(java.lang.String serverUrl) {
            this.Camera2StreamConfigurationMap = serverUrl;
            return this;
        }

        public final com.apollographql.apollo.network.websocket.WebSocketNetworkTransport.Builder webSocketEngine(com.apollographql.apollo.network.websocket.WebSocketEngine webSocketEngine) {
            this.getHighSpeedVideoFpsRanges = webSocketEngine;
            return this;
        }

        /* renamed from: idleTimeout-BwNAW2A, reason: not valid java name */
        public final com.apollographql.apollo.network.websocket.WebSocketNetworkTransport.Builder m9981idleTimeoutBwNAW2A(kotlin.time.Duration idleTimeout) {
            this.getOutputFormats = idleTimeout;
            return this;
        }

        public final com.apollographql.apollo.network.websocket.WebSocketNetworkTransport.Builder wsProtocol(com.apollographql.apollo.network.websocket.WsProtocol wsProtocol) {
            this.getHighResolutionOutputSizeshNQ4ISI = wsProtocol;
            return this;
        }

        /* renamed from: pingInterval-BwNAW2A, reason: not valid java name */
        public final com.apollographql.apollo.network.websocket.WebSocketNetworkTransport.Builder m9982pingIntervalBwNAW2A(kotlin.time.Duration pingInterval) {
            this.getHighSpeedVideoFpsRangesFor = pingInterval;
            return this;
        }

        /* renamed from: connectionAcknowledgeTimeout-BwNAW2A, reason: not valid java name */
        public final com.apollographql.apollo.network.websocket.WebSocketNetworkTransport.Builder m9980connectionAcknowledgeTimeoutBwNAW2A(kotlin.time.Duration connectionAcknowledgeTimeout) {
            this.getHighSpeedVideoSizes = connectionAcknowledgeTimeout;
            return this;
        }

        public final com.apollographql.apollo.network.websocket.WebSocketNetworkTransport.Builder parserFactory(com.apollographql.apollo.network.websocket.SubscriptionParserFactory parserFactory) {
            this.getHighSpeedVideoSizesFor = parserFactory;
            return this;
        }

        public final com.apollographql.apollo.network.websocket.WebSocketNetworkTransport build() {
            long duration;
            long duration2;
            com.apollographql.apollo.network.websocket.WebSocketEngine webSocketEngine = this.getHighSpeedVideoFpsRanges;
            if (webSocketEngine == null) {
                webSocketEngine = com.apollographql.apollo.network.websocket.WebSocketEngine_jvmKt.WebSocketEngine();
            }
            com.apollographql.apollo.network.websocket.WebSocketEngine webSocketEngine2 = webSocketEngine;
            java.lang.String str = this.Camera2StreamConfigurationMap;
            if (str == null) {
                throw new java.lang.IllegalStateException("Apollo: 'serverUrl' is required".toString());
            }
            kotlin.time.Duration duration3 = this.getOutputFormats;
            if (duration3 != null) {
                duration = duration3.getGetHighResolutionOutputSizeshNQ4ISI();
            } else {
                kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                duration = kotlin.time.DurationKt.toDuration(60, kotlin.time.DurationUnit.SECONDS);
            }
            long j = duration;
            com.apollographql.apollo.network.websocket.GraphQLWsProtocol graphQLWsProtocol = this.getHighResolutionOutputSizeshNQ4ISI;
            if (graphQLWsProtocol == null) {
                graphQLWsProtocol = new com.apollographql.apollo.network.websocket.GraphQLWsProtocol(new com.apollographql.apollo.network.websocket.WebSocketNetworkTransport$Builder$build$1(null));
            }
            com.apollographql.apollo.network.websocket.WsProtocol wsProtocol = graphQLWsProtocol;
            kotlin.time.Duration duration4 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.time.Duration duration5 = this.getHighSpeedVideoSizes;
            if (duration5 != null) {
                duration2 = duration5.getGetHighResolutionOutputSizeshNQ4ISI();
            } else {
                kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
                duration2 = kotlin.time.DurationKt.toDuration(10, kotlin.time.DurationUnit.SECONDS);
            }
            long j2 = duration2;
            com.apollographql.apollo.network.websocket.DefaultSubscriptionParserFactory defaultSubscriptionParserFactory = this.getHighSpeedVideoSizesFor;
            if (defaultSubscriptionParserFactory == null) {
                defaultSubscriptionParserFactory = com.apollographql.apollo.network.websocket.DefaultSubscriptionParserFactory.INSTANCE;
            }
            return new com.apollographql.apollo.network.websocket.WebSocketNetworkTransport(webSocketEngine2, str, wsProtocol, j2, duration4, j, defaultSubscriptionParserFactory, null);
        }
    }

    public /* synthetic */ WebSocketNetworkTransport(com.apollographql.apollo.network.websocket.WebSocketEngine webSocketEngine, java.lang.String str, com.apollographql.apollo.network.websocket.WsProtocol wsProtocol, long j, kotlin.time.Duration duration, long j2, com.apollographql.apollo.network.websocket.SubscriptionParserFactory subscriptionParserFactory, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(webSocketEngine, str, wsProtocol, j, duration, j2, subscriptionParserFactory);
    }
}
