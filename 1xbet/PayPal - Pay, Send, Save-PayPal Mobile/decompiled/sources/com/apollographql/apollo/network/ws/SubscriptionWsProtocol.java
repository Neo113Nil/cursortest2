package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001&B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012.\b\u0002\u0010\r\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u0012\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u0012\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R:\u0010\u001f\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/apollographql/apollo/network/ws/SubscriptionWsProtocol;", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "connectionAcknowledgeTimeoutMs", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "connectionPayload", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "frameType", "<init>", "(Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;JLkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/network/ws/WsFrameType;)V", "", "connectionInit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messageMap", "handleServerMessage", "(Ljava/util/Map;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "startOperation", "(Lcom/apollographql/apollo/api/ApolloRequest;)V", "stopOperation", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "Factory"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionWsProtocol extends com.apollographql.apollo.network.ws.WsProtocol {
    private final com.apollographql.apollo.network.ws.WsFrameType Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol$1", f = "SubscriptionWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.ws.SubscriptionWsProtocol$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation, java.lang.Object> {
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation continuation) {
            return ((com.apollographql.apollo.network.ws.SubscriptionWsProtocol.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.apollographql.apollo.network.ws.SubscriptionWsProtocol.AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.SubscriptionWsProtocol.AnonymousClass1> continuation) {
            super(1, continuation);
        }
    }

    public /* synthetic */ SubscriptionWsProtocol(com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener, long j, com.apollographql.apollo.network.ws.SubscriptionWsProtocol.AnonymousClass1 anonymousClass1, com.apollographql.apollo.network.ws.WsFrameType wsFrameType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(webSocketConnection, listener, (i & 4) != 0 ? 10000L : j, (i & 8) != 0 ? new com.apollographql.apollo.network.ws.SubscriptionWsProtocol.AnonymousClass1(null) : anonymousClass1, (i & 16) != 0 ? com.apollographql.apollo.network.ws.WsFrameType.Text : wsFrameType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionWsProtocol(com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener, long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object> function1, com.apollographql.apollo.network.ws.WsFrameType wsFrameType) {
        super(webSocketConnection, listener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wsFrameType, "");
        this.getHighSpeedVideoSizes = j;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = wsFrameType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (kotlinx.coroutines.TimeoutKt.withTimeout(r4, r7, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.apollographql.apollo.network.ws.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object connectionInit(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$1 subscriptionWsProtocol$connectionInit$1;
        int i;
        java.util.Map<java.lang.String, ? extends java.lang.Object> mutableMapOf;
        java.util.Map map;
        if (continuation instanceof com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$1) {
            subscriptionWsProtocol$connectionInit$1 = (com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$1) continuation;
            if ((subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = subscriptionWsProtocol$connectionInit$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("type", "connection_init"));
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
                    subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoSizes = mutableMapOf;
                    subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = function1.invoke(subscriptionWsProtocol$connectionInit$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    mutableMapOf = (java.util.Map) subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                map = (java.util.Map) obj;
                if (map != null) {
                    mutableMapOf.put("payload", map);
                }
                sendMessageMap(mutableMapOf, this.Camera2StreamConfigurationMap);
                long j = this.getHighSpeedVideoSizes;
                com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$2 subscriptionWsProtocol$connectionInit$2 = new com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$2(this, null);
                subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoSizes = null;
                subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        subscriptionWsProtocol$connectionInit$1 = new com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$1(this, continuation);
        java.lang.Object obj2 = subscriptionWsProtocol$connectionInit$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        map = (java.util.Map) obj2;
        if (map != null) {
        }
        sendMessageMap(mutableMapOf, this.Camera2StreamConfigurationMap);
        long j2 = this.getHighSpeedVideoSizes;
        com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$2 subscriptionWsProtocol$connectionInit$22 = new com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$2(this, null);
        subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoSizes = null;
        subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final void handleServerMessage(java.util.Map<java.lang.String, ? extends java.lang.Object> messageMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageMap, "");
        java.lang.Object obj = messageMap.get("type");
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
            com.apollographql.apollo.network.ws.WsProtocol.Listener listener = getListener();
            java.lang.Object obj2 = messageMap.get("id");
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            java.lang.Object obj3 = messageMap.get("payload");
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
            listener.operationResponse((java.lang.String) obj2, (java.util.Map) obj3);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, "error")) {
            java.lang.Object obj4 = messageMap.get("id");
            if (obj4 instanceof java.lang.String) {
                getListener().operationError((java.lang.String) obj4, (java.util.Map) messageMap.get("payload"));
                return;
            } else {
                getListener().generalError((java.util.Map) messageMap.get("payload"));
                return;
            }
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE)) {
            com.apollographql.apollo.network.ws.WsProtocol.Listener listener2 = getListener();
            java.lang.Object obj5 = messageMap.get("id");
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj5, "");
            listener2.operationComplete((java.lang.String) obj5);
        }
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final <D extends com.apollographql.apollo.api.Operation.Data> void startOperation(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        sendMessageMap(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START), kotlin.TuplesKt.to("id", request.getRequestUuid().toString()), kotlin.TuplesKt.to("payload", com.apollographql.apollo.api.http.DefaultHttpRequestComposer.INSTANCE.composePayload(request))), this.Camera2StreamConfigurationMap);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final <D extends com.apollographql.apollo.api.Operation.Data> void stopOperation(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        sendMessageMap(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "stop"), kotlin.TuplesKt.to("id", request.getRequestUuid().toString())), this.Camera2StreamConfigurationMap);
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R:\u0010\u001b\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/apollographql/apollo/network/ws/SubscriptionWsProtocol$Factory;", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "", "connectionAcknowledgeTimeoutMs", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "connectionPayload", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "frameType", "<init>", "(JLkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/network/ws/WsFrameType;)V", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/apollographql/apollo/network/ws/WsProtocol;", "create", "(Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;Lkotlinx/coroutines/CoroutineScope;)Lcom/apollographql/apollo/network/ws/WsProtocol;", "getHighResolutionOutputSizeshNQ4ISI", "J", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/network/ws/WsFrameType;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements com.apollographql.apollo.network.ws.WsProtocol.Factory {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> getHighSpeedVideoSizes;
        private final long getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final com.apollographql.apollo.network.ws.WsFrameType Camera2StreamConfigurationMap;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object> function1, com.apollographql.apollo.network.ws.WsFrameType wsFrameType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wsFrameType, "");
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.getHighSpeedVideoSizes = function1;
            this.Camera2StreamConfigurationMap = wsFrameType;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol$Factory$1", f = "SubscriptionWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.apollographql.apollo.network.ws.SubscriptionWsProtocol$Factory$1, reason: invalid class name */
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation, java.lang.Object> {
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoSizes != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation continuation) {
                return ((com.apollographql.apollo.network.ws.SubscriptionWsProtocol.Factory.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                return new com.apollographql.apollo.network.ws.SubscriptionWsProtocol.Factory.AnonymousClass1(continuation);
            }

            AnonymousClass1(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.SubscriptionWsProtocol.Factory.AnonymousClass1> continuation) {
                super(1, continuation);
            }
        }

        public /* synthetic */ Factory(long j, com.apollographql.apollo.network.ws.SubscriptionWsProtocol.Factory.AnonymousClass1 anonymousClass1, com.apollographql.apollo.network.ws.WsFrameType wsFrameType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 10000L : j, (i & 2) != 0 ? new com.apollographql.apollo.network.ws.SubscriptionWsProtocol.Factory.AnonymousClass1(null) : anonymousClass1, (i & 4) != 0 ? com.apollographql.apollo.network.ws.WsFrameType.Text : wsFrameType);
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.Factory
        public final java.lang.String getName() {
            return "graphql-ws";
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.Factory
        public final com.apollographql.apollo.network.ws.WsProtocol create(com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener, kotlinx.coroutines.CoroutineScope scope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketConnection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
            return new com.apollographql.apollo.network.ws.SubscriptionWsProtocol(webSocketConnection, listener, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Factory(long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object> function1) {
            this(j, function1, null, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        }

        public Factory(long j) {
            this(j, null, null, 6, null);
        }

        public Factory() {
            this(0L, null, null, 7, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocol(com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener, long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object> function1) {
        this(webSocketConnection, listener, j, function1, null, 16, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocol(com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener, long j) {
        this(webSocketConnection, listener, j, null, null, 24, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocol(com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener) {
        this(webSocketConnection, listener, 0L, null, null, 28, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
    }
}
