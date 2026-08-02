package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0001!B)\u0012 \b\u0002\u0010\u0005\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000f\u001a\u00020\b\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\b\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR/\u0010\u0005\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/apollographql/apollo/network/websocket/AppSyncWsProtocol;", "Lcom/apollographql/apollo/network/websocket/WsProtocol;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "authorization", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/apollographql/apollo/network/websocket/ClientMessage;", "connectionInit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "operationStart", "(Lcom/apollographql/apollo/api/ApolloRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operationStop", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lcom/apollographql/apollo/network/websocket/ClientMessage;", "ping", "()Lcom/apollographql/apollo/network/websocket/ClientMessage;", "pong", "", "text", "Lcom/apollographql/apollo/network/websocket/ServerMessage;", "parseServerMessage", "(Ljava/lang/String;)Lcom/apollographql/apollo/network/websocket/ServerMessage;", "Lkotlin/jvm/functions/Function1;", "getAuthorization", "()Lkotlin/jvm/functions/Function1;", "getName", "()Ljava/lang/String;", "name", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppSyncWsProtocol implements com.apollographql.apollo.network.websocket.WsProtocol {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.network.websocket.AppSyncWsProtocol.Companion INSTANCE = new com.apollographql.apollo.network.websocket.AppSyncWsProtocol.Companion(null);
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> authorization;

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.websocket.AppSyncWsProtocol$1", f = "AppSyncWsProtocol.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.websocket.AppSyncWsProtocol$1, reason: invalid class name */
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
            return ((com.apollographql.apollo.network.websocket.AppSyncWsProtocol.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.apollographql.apollo.network.websocket.AppSyncWsProtocol.AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.AppSyncWsProtocol.AnonymousClass1> continuation) {
            super(1, continuation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppSyncWsProtocol(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.authorization = function1;
    }

    public /* synthetic */ AppSyncWsProtocol(com.apollographql.apollo.network.websocket.AppSyncWsProtocol.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.apollographql.apollo.network.websocket.AppSyncWsProtocol.AnonymousClass1(null) : anonymousClass1);
    }

    public final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> getAuthorization() {
        return this.authorization;
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public final java.lang.String getName() {
        return "graphql-ws";
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public final java.lang.Object connectionInit(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.ClientMessage> continuation) {
        return com.apollographql.apollo.network.websocket.ClientMessageKt.toClientMessage(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "connection_init")));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <D extends com.apollographql.apollo.api.Operation.Data> java.lang.Object operationStart(com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.ClientMessage> continuation) {
        com.apollographql.apollo.network.websocket.AppSyncWsProtocol$operationStart$1 appSyncWsProtocol$operationStart$1;
        int i;
        kotlin.Pair[] pairArr;
        int i2;
        java.lang.String str;
        kotlin.Pair[] pairArr2;
        java.lang.String str2;
        kotlin.Pair[] pairArr3;
        java.lang.String str3;
        kotlin.Pair[] pairArr4;
        if (continuation instanceof com.apollographql.apollo.network.websocket.AppSyncWsProtocol$operationStart$1) {
            appSyncWsProtocol$operationStart$1 = (com.apollographql.apollo.network.websocket.AppSyncWsProtocol$operationStart$1) continuation;
            if ((appSyncWsProtocol$operationStart$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                appSyncWsProtocol$operationStart$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = appSyncWsProtocol$operationStart$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appSyncWsProtocol$operationStart$1.getOutputMinFrameDuration;
                int i3 = 1;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String m9946toJson$default = com.apollographql.apollo.api.Adapters.m9946toJson$default(com.apollographql.apollo.api.Adapters.NullableAnyAdapter, com.apollographql.apollo.api.http.DefaultHttpRequestComposer.INSTANCE.composePayload(apolloRequest), null, null, 6, null);
                    pairArr = new kotlin.Pair[3];
                    pairArr[0] = kotlin.TuplesKt.to("type", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START);
                    pairArr[1] = kotlin.TuplesKt.to("id", apolloRequest.getRequestUuid().toString());
                    i2 = 2;
                    kotlin.Pair[] pairArr5 = new kotlin.Pair[2];
                    pairArr5[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, m9946toJson$default);
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> function1 = this.authorization;
                    appSyncWsProtocol$operationStart$1.getHighSpeedVideoFpsRanges = pairArr;
                    appSyncWsProtocol$operationStart$1.getHighSpeedVideoFpsRangesFor = pairArr5;
                    appSyncWsProtocol$operationStart$1.Camera2StreamConfigurationMap = pairArr;
                    str = "payload";
                    appSyncWsProtocol$operationStart$1.getInputSizeshNQ4ISI = "payload";
                    appSyncWsProtocol$operationStart$1.getInputFormats = pairArr5;
                    appSyncWsProtocol$operationStart$1.getOutputFormats = com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS;
                    appSyncWsProtocol$operationStart$1.getHighSpeedVideoSizesFor = "authorization";
                    appSyncWsProtocol$operationStart$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    appSyncWsProtocol$operationStart$1.getHighSpeedVideoSizes = 1;
                    appSyncWsProtocol$operationStart$1.getOutputMinFrameDuration = 1;
                    obj = function1.invoke(appSyncWsProtocol$operationStart$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pairArr2 = pairArr;
                    str2 = "authorization";
                    pairArr3 = pairArr5;
                    str3 = com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS;
                    pairArr4 = pairArr3;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = appSyncWsProtocol$operationStart$1.getHighSpeedVideoSizes;
                    i2 = appSyncWsProtocol$operationStart$1.getHighResolutionOutputSizeshNQ4ISI;
                    str2 = (java.lang.String) appSyncWsProtocol$operationStart$1.getHighSpeedVideoSizesFor;
                    str3 = (java.lang.String) appSyncWsProtocol$operationStart$1.getOutputFormats;
                    pairArr4 = (kotlin.Pair[]) appSyncWsProtocol$operationStart$1.getInputFormats;
                    str = (java.lang.String) appSyncWsProtocol$operationStart$1.getInputSizeshNQ4ISI;
                    pairArr = (kotlin.Pair[]) appSyncWsProtocol$operationStart$1.Camera2StreamConfigurationMap;
                    pairArr3 = (kotlin.Pair[]) appSyncWsProtocol$operationStart$1.getHighSpeedVideoFpsRangesFor;
                    pairArr2 = (kotlin.Pair[]) appSyncWsProtocol$operationStart$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                pairArr4[i3] = kotlin.TuplesKt.to(str3, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(str2, obj)));
                pairArr[i2] = kotlin.TuplesKt.to(str, kotlin.collections.MapsKt.mapOf(pairArr3));
                return com.apollographql.apollo.network.websocket.ClientMessageKt.toClientMessage(kotlin.collections.MapsKt.mapOf(pairArr2));
            }
        }
        appSyncWsProtocol$operationStart$1 = new com.apollographql.apollo.network.websocket.AppSyncWsProtocol$operationStart$1(this, continuation);
        java.lang.Object obj2 = appSyncWsProtocol$operationStart$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appSyncWsProtocol$operationStart$1.getOutputMinFrameDuration;
        int i32 = 1;
        if (i != 0) {
        }
        pairArr4[i32] = kotlin.TuplesKt.to(str3, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(str2, obj2)));
        pairArr[i2] = kotlin.TuplesKt.to(str, kotlin.collections.MapsKt.mapOf(pairArr3));
        return com.apollographql.apollo.network.websocket.ClientMessageKt.toClientMessage(kotlin.collections.MapsKt.mapOf(pairArr2));
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.network.websocket.ClientMessage operationStop(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return com.apollographql.apollo.network.websocket.ClientMessageKt.toClientMessage(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "stop"), kotlin.TuplesKt.to("id", request.getRequestUuid().toString())));
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public final com.apollographql.apollo.network.websocket.ClientMessage ping() {
        return com.apollographql.apollo.network.websocket.ClientMessageKt.toClientMessage(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "ping")));
    }

    @Override // com.apollographql.apollo.network.websocket.WsProtocol
    public final com.apollographql.apollo.network.websocket.ClientMessage pong() {
        return com.apollographql.apollo.network.websocket.ClientMessageKt.toClientMessage(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", "pong")));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r3.equals(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        r4 = r2.get("id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if ((r4 instanceof java.lang.String) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        r5 = (java.lang.String) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        if (r5 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        r2 = new java.lang.StringBuilder("No 'id' found in message: '");
        r2.append(r11);
        r2.append("'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ed, code lost:
    
        return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        return new com.apollographql.apollo.network.websocket.ResponseServerMessage(r5, r2.get("payload"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0104, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
    
        return new com.apollographql.apollo.network.websocket.CompleteServerMessage(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
    
        throw new java.lang.IllegalStateException("".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:
    
        if (r3.equals(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE) != false) goto L41;
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
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No 'type' found in server message: '");
                sb.append(this);
                sb.append("'");
                return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(sb.toString());
            }
            switch (str.hashCode()) {
                case -599445191:
                    break;
                case 3414:
                    if (str.equals("ka")) {
                        return com.apollographql.apollo.network.websocket.PingServerMessage.INSTANCE;
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown type: '");
                    sb2.append(str);
                    sb2.append("' found in server message: '");
                    sb2.append(text);
                    sb2.append("'");
                    return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(sb2.toString());
                case 3076010:
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        java.lang.Object obj2 = map.get("id");
                        r5 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                        return r5 != null ? new com.apollographql.apollo.network.websocket.OperationErrorServerMessage(r5, map.get("payload")) : new com.apollographql.apollo.network.websocket.ParseErrorServerMessage("General error: ".concat(java.lang.String.valueOf(text)));
                    }
                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Unknown type: '");
                    sb22.append(str);
                    sb22.append("' found in server message: '");
                    sb22.append(text);
                    sb22.append("'");
                    return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(sb22.toString());
                case 1198953831:
                    if (str.equals("connection_error")) {
                        return new com.apollographql.apollo.network.websocket.ConnectionErrorServerMessage(map.get("payload"));
                    }
                    java.lang.StringBuilder sb222 = new java.lang.StringBuilder("Unknown type: '");
                    sb222.append(str);
                    sb222.append("' found in server message: '");
                    sb222.append(text);
                    sb222.append("'");
                    return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(sb222.toString());
                case 1270515624:
                    if (str.equals("connection_ack")) {
                        return com.apollographql.apollo.network.websocket.ConnectionAckServerMessage.INSTANCE;
                    }
                    java.lang.StringBuilder sb2222 = new java.lang.StringBuilder("Unknown type: '");
                    sb2222.append(str);
                    sb2222.append("' found in server message: '");
                    sb2222.append(text);
                    sb2222.append("'");
                    return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(sb2222.toString());
                default:
                    java.lang.StringBuilder sb22222 = new java.lang.StringBuilder("Unknown type: '");
                    sb22222.append(str);
                    sb22222.append("' found in server message: '");
                    sb22222.append(text);
                    sb22222.append("'");
                    return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(sb22222.toString());
            }
        } catch (java.lang.Exception unused) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid JSON: '");
            sb3.append(this);
            sb3.append("'");
            return new com.apollographql.apollo.network.websocket.ParseErrorServerMessage(sb3.toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\u0004*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/apollographql/apollo/network/websocket/AppSyncWsProtocol$Companion;", "", "<init>", "()V", "", "baseUrl", "", "authorization", "payload", "buildUrl", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "(Ljava/util/Map;)Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.String buildUrl$default(com.apollographql.apollo.network.websocket.AppSyncWsProtocol.Companion companion, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public AppSyncWsProtocol() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
