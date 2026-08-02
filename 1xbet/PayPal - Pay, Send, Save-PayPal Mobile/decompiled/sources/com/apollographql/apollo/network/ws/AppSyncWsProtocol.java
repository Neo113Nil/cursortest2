package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 &2\u00020\u0001:\u0002'&BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB7\b\u0016\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u0012\"\b\b\u0000\u0010\u0016*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u0012\"\b\b\u0000\u0010\u0016*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ%\u0010\u001d\u001a\u00020\u00122\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R:\u0010$\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R&\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010%"}, d2 = {"Lcom/apollographql/apollo/network/ws/AppSyncWsProtocol;", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "", "connectionAcknowledgeTimeoutMs", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "connectionPayload", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(JLkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;)V", "authorization", "(Ljava/util/Map;JLcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;)V", "", "connectionInit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "startOperation", "(Lcom/apollographql/apollo/api/ApolloRequest;)V", "stopOperation", "messageMap", "handleServerMessage", "(Ljava/util/Map;)V", "getHighSpeedVideoFpsRanges", "J", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "Companion", "Factory"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppSyncWsProtocol extends com.apollographql.apollo.network.ws.WsProtocol {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.network.ws.AppSyncWsProtocol.Companion INSTANCE = new com.apollographql.apollo.network.ws.AppSyncWsProtocol.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.util.Map<java.lang.String, ? extends java.lang.Object> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$1", f = "AppSyncWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.ws.AppSyncWsProtocol$1, reason: invalid class name */
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
            return ((com.apollographql.apollo.network.ws.AppSyncWsProtocol.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.apollographql.apollo.network.ws.AppSyncWsProtocol.AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.AppSyncWsProtocol.AnonymousClass1> continuation) {
            super(1, continuation);
        }
    }

    public /* synthetic */ AppSyncWsProtocol(long j, com.apollographql.apollo.network.ws.AppSyncWsProtocol.AnonymousClass1 anonymousClass1, com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object>) ((i & 2) != 0 ? new com.apollographql.apollo.network.ws.AppSyncWsProtocol.AnonymousClass1(null) : anonymousClass1), webSocketConnection, listener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppSyncWsProtocol(long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object> function1, com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener) {
        super(webSocketConnection, listener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$2", f = "AppSyncWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.ws.AppSyncWsProtocol$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> {
        final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> continuation) {
            return ((com.apollographql.apollo.network.ws.AppSyncWsProtocol.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.apollographql.apollo.network.ws.AppSyncWsProtocol.AnonymousClass2(this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.AppSyncWsProtocol.AnonymousClass2> continuation) {
            super(1, continuation);
            this.getHighSpeedVideoFpsRanges = map;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppSyncWsProtocol(java.util.Map<java.lang.String, ? extends java.lang.Object> map, long j, com.apollographql.apollo.network.ws.WebSocketConnection webSocketConnection, com.apollographql.apollo.network.ws.WsProtocol.Listener listener) {
        this(j, new com.apollographql.apollo.network.ws.AppSyncWsProtocol.AnonymousClass2(map, null), webSocketConnection, listener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketConnection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (kotlinx.coroutines.TimeoutKt.withTimeout(r4, r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.apollographql.apollo.network.ws.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object connectionInit(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$1 appSyncWsProtocol$connectionInit$1;
        int i;
        com.apollographql.apollo.network.ws.AppSyncWsProtocol appSyncWsProtocol;
        if (continuation instanceof com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$1) {
            appSyncWsProtocol$connectionInit$1 = (com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$1) continuation;
            if ((appSyncWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                appSyncWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = appSyncWsProtocol$connectionInit$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appSyncWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    sendMessageMapText(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("type", "connection_init")));
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> function1 = this.getHighSpeedVideoFpsRangesFor;
                    appSyncWsProtocol$connectionInit$1.getHighSpeedVideoSizes = this;
                    appSyncWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = function1.invoke(appSyncWsProtocol$connectionInit$1);
                    if (obj != coroutine_suspended) {
                        appSyncWsProtocol = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                appSyncWsProtocol = (com.apollographql.apollo.network.ws.AppSyncWsProtocol) appSyncWsProtocol$connectionInit$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                appSyncWsProtocol.getHighSpeedVideoSizes = (java.util.Map) obj;
                long j = this.Camera2StreamConfigurationMap;
                com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$2 appSyncWsProtocol$connectionInit$2 = new com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$2(this, null);
                appSyncWsProtocol$connectionInit$1.getHighSpeedVideoSizes = null;
                appSyncWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        appSyncWsProtocol$connectionInit$1 = new com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$1(this, continuation);
        java.lang.Object obj2 = appSyncWsProtocol$connectionInit$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appSyncWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        appSyncWsProtocol.getHighSpeedVideoSizes = (java.util.Map) obj2;
        long j2 = this.Camera2StreamConfigurationMap;
        com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$2 appSyncWsProtocol$connectionInit$22 = new com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$2(this, null);
        appSyncWsProtocol$connectionInit$1.getHighSpeedVideoSizes = null;
        appSyncWsProtocol$connectionInit$1.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final <D extends com.apollographql.apollo.api.Operation.Data> void startOperation(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        sendMessageMapText(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START), kotlin.TuplesKt.to("id", request.getRequestUuid().toString()), kotlin.TuplesKt.to("payload", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.apollographql.apollo.api.Adapters.m9946toJson$default(com.apollographql.apollo.api.Adapters.NullableAnyAdapter, com.apollographql.apollo.api.http.DefaultHttpRequestComposer.INSTANCE.composePayload(request), null, null, 6, null)), kotlin.TuplesKt.to(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("authorization", this.getHighSpeedVideoSizes)))))));
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final <D extends com.apollographql.apollo.api.Operation.Data> void stopOperation(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        sendMessageMapText(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "stop"), kotlin.TuplesKt.to("id", request.getRequestUuid().toString())));
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
        if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE)) {
            kotlin.jvm.internal.Intrinsics.areEqual(obj, "ka");
            return;
        }
        com.apollographql.apollo.network.ws.WsProtocol.Listener listener2 = getListener();
        java.lang.Object obj5 = messageMap.get("id");
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj5, "");
        listener2.operationComplete((java.lang.String) obj5);
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R:\u0010\u001c\u001a(\b\u0001\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/apollographql/apollo/network/ws/AppSyncWsProtocol$Factory;", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "", "connectionAcknowledgeTimeoutMs", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "", "connectionPayload", "<init>", "(JLkotlin/jvm/functions/Function1;)V", "authorization", "(Ljava/util/Map;J)V", "Lcom/apollographql/apollo/network/ws/WebSocketConnection;", "webSocketConnection", "Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/apollographql/apollo/network/ws/WsProtocol;", "create", "(Lcom/apollographql/apollo/network/ws/WebSocketConnection;Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;Lkotlinx/coroutines/CoroutineScope;)Lcom/apollographql/apollo/network/ws/WsProtocol;", "getHighResolutionOutputSizeshNQ4ISI", "J", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements com.apollographql.apollo.network.ws.WsProtocol.Factory {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final long Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> getHighSpeedVideoFpsRanges;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRanges = function1;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$Factory$1", f = "AppSyncWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.apollographql.apollo.network.ws.AppSyncWsProtocol$Factory$1, reason: invalid class name */
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation, java.lang.Object> {
            int Camera2StreamConfigurationMap;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.Camera2StreamConfigurationMap != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation continuation) {
                return ((com.apollographql.apollo.network.ws.AppSyncWsProtocol.Factory.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                return new com.apollographql.apollo.network.ws.AppSyncWsProtocol.Factory.AnonymousClass1(continuation);
            }

            AnonymousClass1(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.AppSyncWsProtocol.Factory.AnonymousClass1> continuation) {
                super(1, continuation);
            }
        }

        public /* synthetic */ Factory(long j, com.apollographql.apollo.network.ws.AppSyncWsProtocol.Factory.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 10000L : j, (kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, ? extends java.lang.Object>) ((i & 2) != 0 ? new com.apollographql.apollo.network.ws.AppSyncWsProtocol.Factory.AnonymousClass1(null) : anonymousClass1));
        }

        public /* synthetic */ Factory(java.util.Map map, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((java.util.Map<java.lang.String, ? extends java.lang.Object>) map, (i & 2) != 0 ? 10000L : j);
        }

        @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$Factory$2", f = "AppSyncWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.apollographql.apollo.network.ws.AppSyncWsProtocol$Factory$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.lang.Object> {
            int Camera2StreamConfigurationMap;
            final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.Camera2StreamConfigurationMap != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return this.getHighSpeedVideoFpsRangesFor;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> continuation) {
                return ((com.apollographql.apollo.network.ws.AppSyncWsProtocol.Factory.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                return new com.apollographql.apollo.network.ws.AppSyncWsProtocol.Factory.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.AppSyncWsProtocol.Factory.AnonymousClass2> continuation) {
                super(1, continuation);
                this.getHighSpeedVideoFpsRangesFor = map;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Factory(java.util.Map<java.lang.String, ? extends java.lang.Object> map, long j) {
            this(j, new com.apollographql.apollo.network.ws.AppSyncWsProtocol.Factory.AnonymousClass2(map, null));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
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
            return new com.apollographql.apollo.network.ws.AppSyncWsProtocol(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, webSocketConnection, listener);
        }

        public Factory() {
            this(0L, (kotlin.jvm.functions.Function1) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\u0004*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/apollographql/apollo/network/ws/AppSyncWsProtocol$Companion;", "", "<init>", "()V", "", "baseUrl", "", "authorization", "payload", "buildUrl", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "(Ljava/util/Map;)Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.String buildUrl$default(com.apollographql.apollo.network.ws.AppSyncWsProtocol.Companion companion, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                map2 = kotlin.collections.MapsKt.emptyMap();
            }
            return companion.buildUrl(str, map, map2);
        }

        public final java.lang.String buildUrl(java.lang.String baseUrl, java.util.Map<java.lang.String, ? extends java.lang.Object> authorization, java.util.Map<java.lang.String, ? extends java.lang.Object> payload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorization, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
            return com.apollographql.apollo.api.http.DefaultHttpRequestComposer.INSTANCE.appendQueryParameters(baseUrl, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, getHighSpeedVideoFpsRanges(authorization)), kotlin.TuplesKt.to("payload", getHighSpeedVideoFpsRanges(payload))));
        }

        private static java.lang.String getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            okio.Buffer buffer = new okio.Buffer();
            com.apollographql.apollo.api.json.JsonWriters.writeAny(new com.apollographql.apollo.api.json.BufferedSinkJsonWriter(buffer, null), map);
            return buffer.readByteString().base64();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
