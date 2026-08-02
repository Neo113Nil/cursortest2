package com.apollographql.apollo.network.websocket;

@kotlin.Deprecated(message = "Migrate your server to GraphQLWsProtocol instead")
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\u0012 \b\u0002\u0010\u0005\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000f\u001a\u00020\b\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\b\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR/\u0010\u0005\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/apollographql/apollo/network/websocket/SubscriptionWsProtocol;", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "connectionPayload", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/apollographql/apollo/network/websocket/ClientMessage;", "connectionInit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "operationStart", "(Lcom/apollographql/apollo/api/ApolloRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operationStop", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lcom/apollographql/apollo/network/websocket/ClientMessage;", "ping", "()Lcom/apollographql/apollo/network/websocket/ClientMessage;", "pong", "", "text", "Lcom/apollographql/apollo/network/websocket/ServerMessage;", "parseServerMessage", "(Ljava/lang/String;)Lcom/apollographql/apollo/network/websocket/ServerMessage;", "Lkotlin/jvm/functions/Function1;", "getConnectionPayload", "()Lkotlin/jvm/functions/Function1;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SubscriptionWsProtocol implements com.apollographql.apollo.network.websocket.WsProtocol {
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> connectionPayload;

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public final com.apollographql.apollo.network.websocket.ClientMessage ping() {
        return null;
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public final com.apollographql.apollo.network.websocket.ClientMessage pong() {
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.websocket.SubscriptionWsProtocol$1", f = "SubscriptionWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.websocket.SubscriptionWsProtocol$1, reason: invalid class name */
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
            return ((com.apollographql.apollo.network.websocket.SubscriptionWsProtocol.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.apollographql.apollo.network.websocket.SubscriptionWsProtocol.AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.SubscriptionWsProtocol.AnonymousClass1> continuation) {
            super(1, continuation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionWsProtocol(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.connectionPayload = function1;
    }

    public /* synthetic */ SubscriptionWsProtocol(com.apollographql.apollo.network.websocket.SubscriptionWsProtocol.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.apollographql.apollo.network.websocket.SubscriptionWsProtocol.AnonymousClass1(null) : anonymousClass1);
    }

    public final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> getConnectionPayload() {
        return this.connectionPayload;
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public final java.lang.String getName() {
        return "graphql-ws";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object connectionInit(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.ClientMessage> continuation) {
        com.apollographql.apollo.network.websocket.SubscriptionWsProtocol$connectionInit$1 subscriptionWsProtocol$connectionInit$1;
        java.lang.Object obj;
        int i;
        java.util.Map map;
        if (continuation instanceof com.apollographql.apollo.network.websocket.SubscriptionWsProtocol$connectionInit$1) {
            subscriptionWsProtocol$connectionInit$1 = (com.apollographql.apollo.network.websocket.SubscriptionWsProtocol$connectionInit$1) continuation;
            if ((subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoSizes -= 2147483648;
                obj = subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    linkedHashMap.put("type", "connection_init");
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> function1 = this.connectionPayload;
                    subscriptionWsProtocol$connectionInit$1.Camera2StreamConfigurationMap = linkedHashMap;
                    subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoSizes = 1;
                    java.lang.Object invoke = function1.invoke(subscriptionWsProtocol$connectionInit$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map = linkedHashMap;
                    obj = invoke;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (java.util.Map) subscriptionWsProtocol$connectionInit$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (obj != null) {
                    map.put("payload", obj);
                }
                return com.apollographql.apollo.network.websocket.ClientMessageKt.toClientMessage(map);
            }
        }
        subscriptionWsProtocol$connectionInit$1 = new com.apollographql.apollo.network.websocket.SubscriptionWsProtocol$connectionInit$1(this, continuation);
        obj = subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionWsProtocol$connectionInit$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        if (obj != null) {
        }
        return com.apollographql.apollo.network.websocket.ClientMessageKt.toClientMessage(map);
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public final <D extends com.apollographql.apollo.api.Operation.Data> java.lang.Object operationStart(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.ClientMessage> continuation) {
        return com.apollographql.apollo.network.websocket.ClientMessageKt.toClientMessage(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("id", apolloRequest.getRequestUuid().toString()), kotlin.TuplesKt.to("type", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START), kotlin.TuplesKt.to("payload", com.apollographql.apollo.api.http.DefaultHttpRequestComposer.INSTANCE.composePayload(apolloRequest))));
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.network.websocket.ClientMessage operationStop(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return com.apollographql.apollo.network.websocket.ClientMessageKt.toClientMessage(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "stop"), kotlin.TuplesKt.to("id", request.getRequestUuid().toString())));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r3.equals("error") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        r4 = r2.get("id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        if ((r4 instanceof java.lang.String) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        r5 = (java.lang.String) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (r5 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        r2 = new java.lang.StringBuilder("No 'id' found in message: '");
        r2.append(r12);
        r2.append("'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        return new com.apollographql.apollo.network.websocket.ResponseServerMessage(r5, r2.get("payload"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        return new com.apollographql.apollo.network.websocket.CompleteServerMessage(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, "error") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
    
        return new com.apollographql.apollo.network.websocket.OperationErrorServerMessage(r5, r2.get("payload"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        throw new java.lang.IllegalStateException("".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        if (r3.equals(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008e, code lost:
    
        if (r3.equals(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE) != false) goto L30;
     */
    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.apollographql.apollo.network.websocket.ServerMessage parseServerMessage(java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        try {
            java.lang.Object readAny = com.apollographql.apollo.api.json.JsonReaders.readAny(com.apollographql.apollo.api.json.JsonReaders.jsonReader(new okio.Buffer().writeUtf8(text)));
            kotlin.jvm.internal.Intrinsics.checkNotNull(readAny, "");
            java.util.Map map = (java.util.Map) readAny;
            java.lang.Object obj = map.get("type");
            java.lang.String str = null;
            java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str2 == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No 'type' found in server message: '");
                sb.append(text);
                sb.append("'");
                return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(sb.toString());
            }
            switch (str2.hashCode()) {
                case -599445191:
                    break;
                case 3076010:
                    break;
                case 96784904:
                    break;
                case 1198953831:
                    if (str2.equals("connection_error")) {
                        return new com.apollographql.apollo.network.websocket.ConnectionErrorServerMessage(map.get("payload"));
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown type: '");
                    sb2.append(str2);
                    sb2.append("' found in server message: '");
                    sb2.append(text);
                    sb2.append("'");
                    return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(sb2.toString());
                case 1270515624:
                    if (str2.equals("connection_ack")) {
                        return com.apollographql.apollo.network.websocket.ConnectionAckServerMessage.INSTANCE;
                    }
                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Unknown type: '");
                    sb22.append(str2);
                    sb22.append("' found in server message: '");
                    sb22.append(text);
                    sb22.append("'");
                    return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(sb22.toString());
                default:
                    java.lang.StringBuilder sb222 = new java.lang.StringBuilder("Unknown type: '");
                    sb222.append(str2);
                    sb222.append("' found in server message: '");
                    sb222.append(text);
                    sb222.append("'");
                    return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(sb222.toString());
            }
        } catch (java.lang.Exception unused) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid JSON: '");
            sb3.append(text);
            sb3.append("'");
            return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(sb3.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionWsProtocol() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
