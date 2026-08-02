package com.apollographql.apollo.network.ws;

@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001NB\u0084\u0001\b\u0002\u0012\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012/\u0010\u0014\u001a+\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001f\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0011¢\u0006\u0004\b&\u0010'R*\u0010*\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010+\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00101R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R=\u00106\u001a+\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020<0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010@R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0007¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010=\u001a\u00020G8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010HR\u0014\u0010J\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010IR\u0014\u0010M\u001a\u00020K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010L"}, d2 = {"Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport;", "Lcom/apollographql/apollo/network/NetworkTransport;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "p0", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "p1", "Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "p2", "", "p3", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "p4", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "", "p5", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/apollographql/apollo/network/ws/WebSocketEngine;JLcom/apollographql/apollo/network/ws/WsProtocol$Factory;Lkotlin/jvm/functions/Function3;)V", "Lkotlinx/coroutines/CoroutineScope;", "", "getHighSpeedVideoSizes", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "execute", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lkotlinx/coroutines/flow/Flow;", "dispose", "()V", "reason", "closeConnection", "(Ljava/lang/Throwable;)V", "getOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "getOutputStallDuration", "Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "Camera2StreamConfigurationMap", "J", "getOutputFormats", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "getHighSpeedVideoSizesFor", "Lkotlin/jvm/functions/Function3;", "getInputFormats", "Lkotlinx/coroutines/channels/Channel;", "Lcom/apollographql/apollo/network/ws/internal/Message;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineScope;", "getOutputSizes", "Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$listener$1;", "Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$listener$1;", "getOutputMinFrameDurationlomOqCM", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebSocketNetworkTransport implements com.apollographql.apollo.network.NetworkTransport {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.SharedFlow<com.apollographql.apollo.network.ws.internal.Event> getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getOutputSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Long, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.ws.WebSocketNetworkTransport$listener$1 getOutputMinFrameDurationlomOqCM;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.apollographql.apollo.network.ws.internal.Event> getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.ws.WsProtocol.Factory getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> getHighSpeedVideoSizesFor;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.ws.WebSocketEngine Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> subscriptionCount;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.apollographql.apollo.network.ws.WebSocketNetworkTransport$listener$1] */
    private WebSocketNetworkTransport(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> function1, java.util.List<com.apollographql.apollo.api.http.HttpHeader> list, com.apollographql.apollo.network.ws.WebSocketEngine webSocketEngine, long j, com.apollographql.apollo.network.ws.WsProtocol.Factory factory, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function3) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRangesFor = list;
        this.Camera2StreamConfigurationMap = webSocketEngine;
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoSizes = factory;
        this.getInputFormats = function3;
        this.getHighSpeedVideoSizesFor = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        kotlinx.coroutines.flow.MutableSharedFlow<com.apollographql.apollo.network.ws.internal.Event> MutableSharedFlow = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(0, Integer.MAX_VALUE, kotlinx.coroutines.channels.BufferOverflow.SUSPEND);
        this.getOutputMinFrameDuration = MutableSharedFlow;
        this.getOutputFormats = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow);
        this.subscriptionCount = MutableSharedFlow.getSubscriptionCount();
        kotlinx.coroutines.CoroutineDispatcher limitedParallelism$default = kotlinx.coroutines.CoroutineDispatcher.limitedParallelism$default(kotlinx.coroutines.Dispatchers.getDefault(), 1, null, 2, null);
        this.getInputSizeshNQ4ISI = limitedParallelism$default;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(limitedParallelism$default);
        this.getOutputSizes = CoroutineScope;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.apollographql.apollo.network.ws.WebSocketNetworkTransport.AnonymousClass1(null), 3, null);
        this.getOutputMinFrameDurationlomOqCM = new com.apollographql.apollo.network.ws.WsProtocol.Listener() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$listener$1
            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public final void operationResponse(java.lang.String id, java.util.Map<java.lang.String, ? extends java.lang.Object> payload) {
                kotlinx.coroutines.channels.Channel channel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
                channel = com.apollographql.apollo.network.ws.WebSocketNetworkTransport.this.getHighSpeedVideoSizesFor;
                channel.mo9266trySendJP2dKIU(new com.apollographql.apollo.network.ws.internal.OperationResponse(id, payload));
            }

            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public final void operationError(java.lang.String id, java.util.Map<java.lang.String, ? extends java.lang.Object> payload) {
                kotlinx.coroutines.channels.Channel channel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
                channel = com.apollographql.apollo.network.ws.WebSocketNetworkTransport.this.getHighSpeedVideoSizesFor;
                channel.mo9266trySendJP2dKIU(new com.apollographql.apollo.network.ws.internal.OperationError(id, payload));
            }

            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public final void operationComplete(java.lang.String id) {
                kotlinx.coroutines.channels.Channel channel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
                channel = com.apollographql.apollo.network.ws.WebSocketNetworkTransport.this.getHighSpeedVideoSizesFor;
                channel.mo9266trySendJP2dKIU(new com.apollographql.apollo.network.ws.internal.OperationComplete(id));
            }

            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public final void generalError(java.util.Map<java.lang.String, ? extends java.lang.Object> payload) {
                kotlinx.coroutines.channels.Channel channel;
                channel = com.apollographql.apollo.network.ws.WebSocketNetworkTransport.this.getHighSpeedVideoSizesFor;
                channel.mo9266trySendJP2dKIU(new com.apollographql.apollo.network.ws.internal.GeneralError(payload));
            }

            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public final void networkError(java.lang.Throwable cause) {
                kotlinx.coroutines.channels.Channel channel;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
                channel = com.apollographql.apollo.network.ws.WebSocketNetworkTransport.this.getHighSpeedVideoSizesFor;
                channel.mo9266trySendJP2dKIU(new com.apollographql.apollo.network.ws.internal.NetworkError(cause));
            }
        };
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getSubscriptionCount() {
        return this.subscriptionCount;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$1", f = "WebSocketNetworkTransport.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (com.apollographql.apollo.network.ws.WebSocketNetworkTransport.this.getHighSpeedVideoSizes(coroutineScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.apollographql.apollo.network.ws.WebSocketNetworkTransport.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.apollographql.apollo.network.ws.WebSocketNetworkTransport.AnonymousClass1 anonymousClass1 = com.apollographql.apollo.network.ws.WebSocketNetworkTransport.this.new AnonymousClass1(continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.WebSocketNetworkTransport.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:61|62|63|(3:113|(3:116|(5:118|119|72|73|(6:75|76|77|78|79|80))(1:120)|114)|121)(1:67)|68|69|70|71|72|73|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:75|(1:76)|77|78|79|80) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03a3, code lost:
    
        if (r10.send(r11, r1) == r8) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x037a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x037b, code lost:
    
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0193, code lost:
    
        if (r0 != r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0324, code lost:
    
        if (((com.apollographql.apollo.network.ws.WsProtocol) r0).connectionInit(r1) != r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0411, code lost:
    
        if (r0.send(r9, r1) == r8) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0346, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0347, code lost:
    
        r4 = r5;
        r5 = r6;
        r6 = r14;
        r14 = r15;
        r15 = r9;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x036e, code lost:
    
        if (r10.send(r11, r1) != r8) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b0 A[Catch: Exception -> 0x0104, TryCatch #5 {Exception -> 0x0104, blocks: (B:62:0x0290, B:65:0x029c, B:68:0x02c5, B:113:0x02a6, B:114:0x02aa, B:116:0x02b0, B:119:0x02c0, B:151:0x00ff), top: B:150:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, com.apollographql.apollo.network.ws.WsProtocol] */
    /* JADX WARN: Type inference failed for: r1v28, types: [T, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r9v41, types: [T, kotlinx.coroutines.Job] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x03a7 -> B:16:0x017d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0415 -> B:12:0x041b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$1 webSocketNetworkTransport$supervise$1;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        java.util.LinkedHashMap linkedHashMap;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        long j;
        com.apollographql.apollo.network.ws.internal.Message message;
        java.util.Map map;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef6;
        kotlinx.coroutines.CoroutineScope coroutineScope3;
        com.apollographql.apollo.network.ws.WebSocketEngine webSocketEngine;
        com.apollographql.apollo.network.ws.internal.Message message2;
        java.util.Map map2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef7;
        kotlin.jvm.internal.Ref.ObjectRef objectRef8;
        kotlin.jvm.internal.Ref.ObjectRef objectRef9;
        com.apollographql.apollo.network.ws.internal.Message message3;
        java.util.Map map3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef10;
        kotlinx.coroutines.CoroutineScope coroutineScope4;
        kotlinx.coroutines.CoroutineScope coroutineScope5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef11;
        kotlinx.coroutines.CoroutineScope coroutineScope6;
        kotlin.jvm.internal.Ref.ObjectRef objectRef12;
        com.apollographql.apollo.network.ws.internal.Message message4;
        com.apollographql.apollo.network.ws.internal.Command command;
        com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$1 webSocketNetworkTransport$supervise$12;
        java.util.Map map4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef13;
        kotlin.jvm.internal.Ref.ObjectRef objectRef14;
        kotlinx.coroutines.CoroutineScope coroutineScope7;
        long j2;
        ?? launch$default;
        java.util.List<com.apollographql.apollo.api.http.HttpHeader> list;
        java.util.Iterator<T> it;
        java.util.List<com.apollographql.apollo.api.http.HttpHeader> list2;
        java.lang.Object obj;
        int i;
        int i2;
        java.lang.Object obj2;
        ?? launch$default2;
        if (continuation instanceof com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$1) {
            webSocketNetworkTransport$supervise$1 = (com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$1) continuation;
            if ((webSocketNetworkTransport$supervise$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                webSocketNetworkTransport$supervise$1.getOutputFormats -= 2147483648;
                java.lang.Object obj3 = webSocketNetworkTransport$supervise$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = 1;
                java.lang.Object obj4 = null;
                switch (webSocketNetworkTransport$supervise$1.getOutputFormats) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj3);
                        objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                        objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                        objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                        linkedHashMap = new java.util.LinkedHashMap();
                        coroutineScope2 = coroutineScope;
                        j = 0;
                        kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel = this.getHighSpeedVideoSizesFor;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                        webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                        webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                        webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = obj4;
                        webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                        webSocketNetworkTransport$supervise$1.getOutputFormats = i3;
                        obj3 = channel.receive(webSocketNetworkTransport$supervise$1);
                        break;
                    case 1:
                        j = webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap;
                        linkedHashMap = (java.util.Map) webSocketNetworkTransport$supervise$1.getInputFormats;
                        objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI;
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes;
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor;
                        coroutineScope2 = (kotlinx.coroutines.CoroutineScope) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        message4 = (com.apollographql.apollo.network.ws.internal.Message) obj3;
                        if (message4 instanceof com.apollographql.apollo.network.ws.internal.Event) {
                            if (message4 instanceof com.apollographql.apollo.network.ws.internal.NetworkError) {
                                getHighSpeedVideoSizes(objectRef3, objectRef2, objectRef);
                                kotlin.jvm.functions.Function3<java.lang.Throwable, java.lang.Long, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function3 = this.getInputFormats;
                                if (function3 != null) {
                                    java.lang.Throwable cause = ((com.apollographql.apollo.network.ws.internal.NetworkError) message4).getCause();
                                    java.lang.Long boxLong = kotlin.coroutines.jvm.internal.Boxing.boxLong(j);
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                                    webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                                    webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                                    webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = message4;
                                    webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                    webSocketNetworkTransport$supervise$1.getOutputFormats = 2;
                                    java.lang.Object invoke = function3.invoke(cause, boxLong, webSocketNetworkTransport$supervise$1);
                                    if (invoke != coroutine_suspended) {
                                        java.util.Map map5 = linkedHashMap;
                                        message = message4;
                                        obj3 = invoke;
                                        coroutineScope3 = coroutineScope2;
                                        objectRef6 = objectRef;
                                        objectRef5 = objectRef2;
                                        objectRef4 = objectRef3;
                                        map = map5;
                                        if (((java.lang.Boolean) obj3).booleanValue() == i3) {
                                            i = i3;
                                            if (i == 0) {
                                                j++;
                                                kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel2 = this.getHighSpeedVideoSizesFor;
                                                com.apollographql.apollo.network.ws.internal.RestartConnection restartConnection = com.apollographql.apollo.network.ws.internal.RestartConnection.INSTANCE;
                                                webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope3;
                                                webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef6;
                                                webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef5;
                                                webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef4;
                                                webSocketNetworkTransport$supervise$1.getInputFormats = map;
                                                webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = null;
                                                webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                                webSocketNetworkTransport$supervise$1.getOutputFormats = 3;
                                                if (channel2.send(restartConnection, webSocketNetworkTransport$supervise$1) != coroutine_suspended) {
                                                    linkedHashMap = map;
                                                    objectRef3 = objectRef4;
                                                    objectRef2 = objectRef5;
                                                    objectRef = objectRef6;
                                                    coroutineScope2 = coroutineScope3;
                                                    obj4 = null;
                                                    kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel3 = this.getHighSpeedVideoSizesFor;
                                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                                                    webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                                                    webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                                                    webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = obj4;
                                                    webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                                    webSocketNetworkTransport$supervise$1.getOutputFormats = i3;
                                                    obj3 = channel3.receive(webSocketNetworkTransport$supervise$1);
                                                }
                                            } else {
                                                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getOutputMinFrameDuration.tryEmit(message));
                                                linkedHashMap = map;
                                                objectRef3 = objectRef4;
                                                objectRef2 = objectRef5;
                                                objectRef = objectRef6;
                                                coroutineScope2 = coroutineScope3;
                                                j = 0;
                                                obj4 = null;
                                                kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel32 = this.getHighSpeedVideoSizesFor;
                                                webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                                                webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                                                webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                                                webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                                                webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                                                webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = obj4;
                                                webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                                webSocketNetworkTransport$supervise$1.getOutputFormats = i3;
                                                obj3 = channel32.receive(webSocketNetworkTransport$supervise$1);
                                            }
                                        }
                                        i = 0;
                                        if (i == 0) {
                                        }
                                    }
                                } else {
                                    coroutineScope3 = coroutineScope2;
                                    objectRef6 = objectRef;
                                    objectRef5 = objectRef2;
                                    objectRef4 = objectRef3;
                                    map = linkedHashMap;
                                    message = message4;
                                    i = 0;
                                    if (i == 0) {
                                    }
                                }
                            } else {
                                if (!(message4 instanceof com.apollographql.apollo.network.ws.internal.ConnectionReEstablished)) {
                                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getOutputMinFrameDuration.tryEmit(message4));
                                } else {
                                    java.util.Iterator it2 = linkedHashMap.values().iterator();
                                    while (it2.hasNext()) {
                                        this.getHighSpeedVideoSizesFor.mo9266trySendJP2dKIU((com.apollographql.apollo.network.ws.internal.StartOperation) it2.next());
                                    }
                                }
                                j = 0;
                                obj4 = null;
                                kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel322 = this.getHighSpeedVideoSizesFor;
                                webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                                webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                                webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                                webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                                webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                                webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = obj4;
                                webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                webSocketNetworkTransport$supervise$1.getOutputFormats = i3;
                                obj3 = channel322.receive(webSocketNetworkTransport$supervise$1);
                            }
                        } else {
                            if (!(message4 instanceof com.apollographql.apollo.network.ws.internal.Command)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            if (message4 instanceof com.apollographql.apollo.network.ws.internal.Dispose) {
                                getHighSpeedVideoSizes(objectRef3, objectRef2, objectRef);
                                return kotlin.Unit.INSTANCE;
                            }
                            if (objectRef3.element == 0) {
                                if (message4 instanceof com.apollographql.apollo.network.ws.internal.StopOperation) {
                                    linkedHashMap.remove(((com.apollographql.apollo.network.ws.internal.StopOperation) message4).getRequest().getRequestUuid());
                                    obj4 = null;
                                    kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel3222 = this.getHighSpeedVideoSizesFor;
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                                    webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                                    webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                                    webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = obj4;
                                    webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                    webSocketNetworkTransport$supervise$1.getOutputFormats = i3;
                                    obj3 = channel3222.receive(webSocketNetworkTransport$supervise$1);
                                } else {
                                    try {
                                    } catch (java.lang.Exception e) {
                                        e = e;
                                        coroutineScope4 = coroutineScope2;
                                        kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel4 = this.getHighSpeedVideoSizesFor;
                                        com.apollographql.apollo.network.ws.internal.NetworkError networkError = new com.apollographql.apollo.network.ws.internal.NetworkError(e);
                                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope4;
                                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                                        webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                                        webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                                        webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = null;
                                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizesFor = null;
                                        webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                        webSocketNetworkTransport$supervise$1.getOutputFormats = 6;
                                        break;
                                    }
                                    com.apollographql.apollo.network.ws.WebSocketEngine webSocketEngine2 = this.Camera2StreamConfigurationMap;
                                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                                    webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                                    webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                                    webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = message4;
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizesFor = webSocketEngine2;
                                    webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                    webSocketNetworkTransport$supervise$1.getOutputFormats = 4;
                                    java.lang.Object invoke2 = function1.invoke(webSocketNetworkTransport$supervise$1);
                                    if (invoke2 != coroutine_suspended) {
                                        objectRef8 = objectRef2;
                                        objectRef9 = objectRef;
                                        map2 = linkedHashMap;
                                        objectRef7 = objectRef3;
                                        webSocketEngine = webSocketEngine2;
                                        message2 = message4;
                                        obj3 = invoke2;
                                        java.lang.String str = (java.lang.String) obj3;
                                        list = this.getHighSpeedVideoFpsRangesFor;
                                        if ((list instanceof java.util.Collection) || !list.isEmpty()) {
                                            it = list.iterator();
                                            while (it.hasNext()) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.apollographql.apollo.api.http.HttpHeader) it.next()).getName(), com.google.common.net.HttpHeaders.SEC_WEBSOCKET_PROTOCOL)) {
                                                    list2 = this.getHighSpeedVideoFpsRangesFor;
                                                    obj = coroutine_suspended;
                                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef9;
                                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef8;
                                                    webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef7;
                                                    webSocketNetworkTransport$supervise$1.getInputFormats = map2;
                                                    webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = message2;
                                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizesFor = null;
                                                    webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                                    webSocketNetworkTransport$supervise$1.getOutputFormats = 5;
                                                    obj3 = webSocketEngine.open(str, list2, webSocketNetworkTransport$supervise$1);
                                                    coroutine_suspended = obj;
                                                    if (obj3 != coroutine_suspended) {
                                                        message3 = message2;
                                                        map3 = map2;
                                                        objectRef10 = objectRef7;
                                                        coroutineScope5 = coroutineScope2;
                                                        try {
                                                        } catch (java.lang.Exception e2) {
                                                            e = e2;
                                                            linkedHashMap = map3;
                                                            objectRef3 = objectRef10;
                                                            objectRef2 = objectRef8;
                                                            coroutineScope4 = coroutineScope5;
                                                            objectRef = objectRef9;
                                                            kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel42 = this.getHighSpeedVideoSizesFor;
                                                            com.apollographql.apollo.network.ws.internal.NetworkError networkError2 = new com.apollographql.apollo.network.ws.internal.NetworkError(e);
                                                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope4;
                                                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                                                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                                                            webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                                                            webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                                                            webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = null;
                                                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizesFor = null;
                                                            webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                                            webSocketNetworkTransport$supervise$1.getOutputFormats = 6;
                                                        }
                                                        objectRef10.element = this.getHighSpeedVideoSizes.create((com.apollographql.apollo.network.ws.WebSocketConnection) obj3, this.getOutputMinFrameDurationlomOqCM, coroutineScope5);
                                                        T t = objectRef10.element;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                                                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope5;
                                                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef9;
                                                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef8;
                                                        webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef10;
                                                        webSocketNetworkTransport$supervise$1.getInputFormats = map3;
                                                        webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = message3;
                                                        webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                                        webSocketNetworkTransport$supervise$1.getOutputFormats = 7;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        obj = coroutine_suspended;
                                        list2 = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.apollographql.apollo.api.http.HttpHeader>) this.getHighSpeedVideoFpsRangesFor, new com.apollographql.apollo.api.http.HttpHeader(com.google.common.net.HttpHeaders.SEC_WEBSOCKET_PROTOCOL, this.getHighSpeedVideoSizes.getName()));
                                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef9;
                                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef8;
                                        webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef7;
                                        webSocketNetworkTransport$supervise$1.getInputFormats = map2;
                                        webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = message2;
                                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizesFor = null;
                                        webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                        webSocketNetworkTransport$supervise$1.getOutputFormats = 5;
                                        obj3 = webSocketEngine.open(str, list2, webSocketNetworkTransport$supervise$1);
                                        coroutine_suspended = obj;
                                        if (obj3 != coroutine_suspended) {
                                        }
                                    }
                                }
                            } else {
                                objectRef12 = objectRef;
                                command = (com.apollographql.apollo.network.ws.internal.Command) message4;
                                if (command instanceof com.apollographql.apollo.network.ws.internal.StartOperation) {
                                    com.apollographql.apollo.network.ws.internal.StartOperation startOperation = (com.apollographql.apollo.network.ws.internal.StartOperation) message4;
                                    linkedHashMap.put(startOperation.getRequest().getRequestUuid(), message4);
                                    T t2 = objectRef3.element;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
                                    ((com.apollographql.apollo.network.ws.WsProtocol) t2).startOperation(startOperation.getRequest());
                                } else if (command instanceof com.apollographql.apollo.network.ws.internal.StopOperation) {
                                    com.apollographql.apollo.network.ws.internal.StopOperation stopOperation = (com.apollographql.apollo.network.ws.internal.StopOperation) message4;
                                    linkedHashMap.remove(stopOperation.getRequest().getRequestUuid());
                                    T t3 = objectRef3.element;
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(t3);
                                    ((com.apollographql.apollo.network.ws.WsProtocol) t3).stopOperation(stopOperation.getRequest());
                                } else if (command instanceof com.apollographql.apollo.network.ws.internal.RestartConnection) {
                                    kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel5 = this.getHighSpeedVideoSizesFor;
                                    com.apollographql.apollo.network.ws.internal.ConnectionReEstablished connectionReEstablished = new com.apollographql.apollo.network.ws.internal.ConnectionReEstablished();
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef12;
                                    webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                                    webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                                    webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                                    webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = null;
                                    webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                    webSocketNetworkTransport$supervise$1.getOutputFormats = 9;
                                    break;
                                }
                                webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                                map4 = linkedHashMap;
                                objectRef13 = objectRef3;
                                objectRef14 = objectRef2;
                                coroutineScope7 = coroutineScope2;
                                j2 = j;
                                if (map4.isEmpty()) {
                                    launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope7, null, null, new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$4(this, objectRef13, objectRef14, objectRef12, null), 3, null);
                                    objectRef12.element = launch$default2;
                                    i2 = 1;
                                    obj2 = null;
                                } else {
                                    kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) objectRef12.element;
                                    i2 = 1;
                                    obj2 = null;
                                    if (job != null) {
                                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                    }
                                    objectRef12.element = null;
                                }
                                webSocketNetworkTransport$supervise$1 = webSocketNetworkTransport$supervise$12;
                                linkedHashMap = map4;
                                objectRef3 = objectRef13;
                                objectRef2 = objectRef14;
                                i3 = i2;
                                obj4 = obj2;
                                j = j2;
                                objectRef = objectRef12;
                                coroutineScope2 = coroutineScope7;
                                kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel32222 = this.getHighSpeedVideoSizesFor;
                                webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                                webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                                webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                                webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                                webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                                webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = obj4;
                                webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                                webSocketNetworkTransport$supervise$1.getOutputFormats = i3;
                                obj3 = channel32222.receive(webSocketNetworkTransport$supervise$1);
                                break;
                            }
                        }
                        return coroutine_suspended;
                    case 2:
                        j = webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap;
                        message = (com.apollographql.apollo.network.ws.internal.Message) webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration;
                        map = (java.util.Map) webSocketNetworkTransport$supervise$1.getInputFormats;
                        objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI;
                        objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes;
                        objectRef6 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor;
                        coroutineScope3 = (kotlinx.coroutines.CoroutineScope) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        if (((java.lang.Boolean) obj3).booleanValue() == i3) {
                        }
                        i = 0;
                        if (i == 0) {
                        }
                        break;
                    case 3:
                        j = webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap;
                        linkedHashMap = (java.util.Map) webSocketNetworkTransport$supervise$1.getInputFormats;
                        objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI;
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes;
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor;
                        coroutineScope2 = (kotlinx.coroutines.CoroutineScope) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel322222 = this.getHighSpeedVideoSizesFor;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                        webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                        webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                        webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = obj4;
                        webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                        webSocketNetworkTransport$supervise$1.getOutputFormats = i3;
                        obj3 = channel322222.receive(webSocketNetworkTransport$supervise$1);
                        break;
                    case 4:
                        j = webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap;
                        webSocketEngine = (com.apollographql.apollo.network.ws.WebSocketEngine) webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizesFor;
                        message2 = (com.apollographql.apollo.network.ws.internal.Message) webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration;
                        map2 = (java.util.Map) webSocketNetworkTransport$supervise$1.getInputFormats;
                        objectRef7 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI;
                        objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes;
                        objectRef9 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor;
                        coroutineScope2 = (kotlinx.coroutines.CoroutineScope) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                        } catch (java.lang.Exception e3) {
                            e = e3;
                            linkedHashMap = map2;
                            objectRef3 = objectRef7;
                            objectRef2 = objectRef8;
                            objectRef = objectRef9;
                            coroutineScope4 = coroutineScope2;
                            kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel422 = this.getHighSpeedVideoSizesFor;
                            com.apollographql.apollo.network.ws.internal.NetworkError networkError22 = new com.apollographql.apollo.network.ws.internal.NetworkError(e);
                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope4;
                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                            webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                            webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                            webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = null;
                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizesFor = null;
                            webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                            webSocketNetworkTransport$supervise$1.getOutputFormats = 6;
                            break;
                        }
                        java.lang.String str2 = (java.lang.String) obj3;
                        list = this.getHighSpeedVideoFpsRangesFor;
                        if (list instanceof java.util.Collection) {
                            break;
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        obj = coroutine_suspended;
                        list2 = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.apollographql.apollo.api.http.HttpHeader>) this.getHighSpeedVideoFpsRangesFor, new com.apollographql.apollo.api.http.HttpHeader(com.google.common.net.HttpHeaders.SEC_WEBSOCKET_PROTOCOL, this.getHighSpeedVideoSizes.getName()));
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef9;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef8;
                        webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef7;
                        webSocketNetworkTransport$supervise$1.getInputFormats = map2;
                        webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = message2;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizesFor = null;
                        webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                        webSocketNetworkTransport$supervise$1.getOutputFormats = 5;
                        obj3 = webSocketEngine.open(str2, list2, webSocketNetworkTransport$supervise$1);
                        coroutine_suspended = obj;
                        if (obj3 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 5:
                        j = webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap;
                        message3 = (com.apollographql.apollo.network.ws.internal.Message) webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration;
                        map3 = (java.util.Map) webSocketNetworkTransport$supervise$1.getInputFormats;
                        objectRef10 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef15 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef16 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor;
                        kotlinx.coroutines.CoroutineScope coroutineScope8 = (kotlinx.coroutines.CoroutineScope) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                            objectRef8 = objectRef15;
                            coroutineScope5 = coroutineScope8;
                            objectRef9 = objectRef16;
                        } catch (java.lang.Exception e4) {
                            e = e4;
                            linkedHashMap = map3;
                            objectRef3 = objectRef10;
                            objectRef2 = objectRef15;
                            objectRef = objectRef16;
                            coroutineScope4 = coroutineScope8;
                            kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel4222 = this.getHighSpeedVideoSizesFor;
                            com.apollographql.apollo.network.ws.internal.NetworkError networkError222 = new com.apollographql.apollo.network.ws.internal.NetworkError(e);
                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope4;
                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                            webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                            webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                            webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = null;
                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizesFor = null;
                            webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                            webSocketNetworkTransport$supervise$1.getOutputFormats = 6;
                            break;
                        }
                        objectRef10.element = this.getHighSpeedVideoSizes.create((com.apollographql.apollo.network.ws.WebSocketConnection) obj3, this.getOutputMinFrameDurationlomOqCM, coroutineScope5);
                        T t4 = objectRef10.element;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(t4);
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope5;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef9;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef8;
                        webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef10;
                        webSocketNetworkTransport$supervise$1.getInputFormats = map3;
                        webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = message3;
                        webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                        webSocketNetworkTransport$supervise$1.getOutputFormats = 7;
                        break;
                    case 6:
                        j = webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap;
                        linkedHashMap = (java.util.Map) webSocketNetworkTransport$supervise$1.getInputFormats;
                        objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI;
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes;
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor;
                        coroutineScope4 = (kotlinx.coroutines.CoroutineScope) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        coroutineScope2 = coroutineScope4;
                        i3 = 1;
                        obj4 = null;
                        kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel3222222 = this.getHighSpeedVideoSizesFor;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                        webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                        webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                        webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = obj4;
                        webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                        webSocketNetworkTransport$supervise$1.getOutputFormats = i3;
                        obj3 = channel3222222.receive(webSocketNetworkTransport$supervise$1);
                        break;
                    case 7:
                        j = webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap;
                        message3 = (com.apollographql.apollo.network.ws.internal.Message) webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration;
                        map3 = (java.util.Map) webSocketNetworkTransport$supervise$1.getInputFormats;
                        objectRef10 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI;
                        objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes;
                        objectRef9 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor;
                        coroutineScope5 = (kotlinx.coroutines.CoroutineScope) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                        } catch (java.lang.Exception e5) {
                            e = e5;
                            linkedHashMap = map3;
                            objectRef3 = objectRef10;
                            objectRef2 = objectRef8;
                            objectRef11 = objectRef9;
                            coroutineScope6 = coroutineScope5;
                            T t5 = 0;
                            objectRef3.element = t5;
                            kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel6 = this.getHighSpeedVideoSizesFor;
                            com.apollographql.apollo.network.ws.internal.NetworkError networkError3 = new com.apollographql.apollo.network.ws.internal.NetworkError(e);
                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope6;
                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef11;
                            webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                            webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                            webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                            webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = t5;
                            webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                            webSocketNetworkTransport$supervise$1.getOutputFormats = 8;
                            break;
                        }
                        kotlinx.coroutines.CoroutineScope coroutineScope9 = coroutineScope5;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef17 = objectRef9;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef18 = objectRef8;
                        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope9, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$3(objectRef10, null), 1, null);
                        objectRef18.element = launch$default;
                        coroutineScope2 = coroutineScope9;
                        message4 = message3;
                        linkedHashMap = map3;
                        objectRef3 = objectRef10;
                        objectRef2 = objectRef18;
                        objectRef12 = objectRef17;
                        command = (com.apollographql.apollo.network.ws.internal.Command) message4;
                        if (command instanceof com.apollographql.apollo.network.ws.internal.StartOperation) {
                        }
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        map4 = linkedHashMap;
                        objectRef13 = objectRef3;
                        objectRef14 = objectRef2;
                        coroutineScope7 = coroutineScope2;
                        j2 = j;
                        if (map4.isEmpty()) {
                        }
                        webSocketNetworkTransport$supervise$1 = webSocketNetworkTransport$supervise$12;
                        linkedHashMap = map4;
                        objectRef3 = objectRef13;
                        objectRef2 = objectRef14;
                        i3 = i2;
                        obj4 = obj2;
                        j = j2;
                        objectRef = objectRef12;
                        coroutineScope2 = coroutineScope7;
                        kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel32222222 = this.getHighSpeedVideoSizesFor;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                        webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                        webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                        webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = obj4;
                        webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                        webSocketNetworkTransport$supervise$1.getOutputFormats = i3;
                        obj3 = channel32222222.receive(webSocketNetworkTransport$supervise$1);
                        break;
                    case 8:
                        j = webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap;
                        linkedHashMap = (java.util.Map) webSocketNetworkTransport$supervise$1.getInputFormats;
                        objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI;
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes;
                        objectRef11 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor;
                        coroutineScope6 = (kotlinx.coroutines.CoroutineScope) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        objectRef = objectRef11;
                        coroutineScope2 = coroutineScope6;
                        i3 = 1;
                        obj4 = null;
                        kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel322222222 = this.getHighSpeedVideoSizesFor;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                        webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                        webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                        webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = obj4;
                        webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                        webSocketNetworkTransport$supervise$1.getOutputFormats = i3;
                        obj3 = channel322222222.receive(webSocketNetworkTransport$supervise$1);
                        break;
                    case 9:
                        long j3 = webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap;
                        java.util.Map map6 = (java.util.Map) webSocketNetworkTransport$supervise$1.getInputFormats;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef19 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.internal.Ref.ObjectRef objectRef20 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes;
                        objectRef12 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor;
                        coroutineScope7 = (kotlinx.coroutines.CoroutineScope) webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj3);
                        webSocketNetworkTransport$supervise$12 = webSocketNetworkTransport$supervise$1;
                        j2 = j3;
                        map4 = map6;
                        objectRef13 = objectRef19;
                        objectRef14 = objectRef20;
                        if (map4.isEmpty()) {
                        }
                        webSocketNetworkTransport$supervise$1 = webSocketNetworkTransport$supervise$12;
                        linkedHashMap = map4;
                        objectRef3 = objectRef13;
                        objectRef2 = objectRef14;
                        i3 = i2;
                        obj4 = obj2;
                        j = j2;
                        objectRef = objectRef12;
                        coroutineScope2 = coroutineScope7;
                        kotlinx.coroutines.channels.Channel<com.apollographql.apollo.network.ws.internal.Message> channel3222222222 = this.getHighSpeedVideoSizesFor;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRanges = coroutineScope2;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoFpsRangesFor = objectRef;
                        webSocketNetworkTransport$supervise$1.getHighSpeedVideoSizes = objectRef2;
                        webSocketNetworkTransport$supervise$1.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                        webSocketNetworkTransport$supervise$1.getInputFormats = linkedHashMap;
                        webSocketNetworkTransport$supervise$1.getOutputMinFrameDuration = obj4;
                        webSocketNetworkTransport$supervise$1.Camera2StreamConfigurationMap = j;
                        webSocketNetworkTransport$supervise$1.getOutputFormats = i3;
                        obj3 = channel3222222222.receive(webSocketNetworkTransport$supervise$1);
                        break;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        webSocketNetworkTransport$supervise$1 = new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$1(this, continuation);
        java.lang.Object obj32 = webSocketNetworkTransport$supervise$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i32 = 1;
        java.lang.Object obj42 = null;
        switch (webSocketNetworkTransport$supervise$1.getOutputFormats) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.network.ws.WsProtocol> objectRef, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef2, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef3) {
        com.apollographql.apollo.network.ws.WsProtocol wsProtocol = objectRef.element;
        if (wsProtocol != null) {
            wsProtocol.close();
        }
        objectRef.element = null;
        kotlinx.coroutines.Job job = objectRef2.element;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        objectRef2.element = null;
        kotlinx.coroutines.Job job2 = objectRef3.element;
        if (job2 != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        objectRef3.element = null;
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> execute(final com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        final com.apollographql.apollo.internal.DeferredJsonMerger deferredJsonMerger = new com.apollographql.apollo.internal.DeferredJsonMerger();
        final kotlinx.coroutines.flow.SharedFlow onSubscription = kotlinx.coroutines.flow.FlowKt.onSubscription(this.getOutputFormats, new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$1(this, request, null));
        final kotlinx.coroutines.flow.Flow transformWhile = com.apollographql.apollo.internal.FlowsKt.transformWhile(new kotlinx.coroutines.flow.Flow<com.apollographql.apollo.network.ws.internal.Event>() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.network.ws.internal.Event> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1.AnonymousClass2(flowCollector, request), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.apollographql.apollo.api.ApolloRequest getHighSpeedVideoFpsRanges;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                com.apollographql.apollo.network.ws.internal.Event event = (com.apollographql.apollo.network.ws.internal.Event) obj;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(event.getId(), this.getHighSpeedVideoFpsRanges.getRequestUuid().toString()) || event.getId() == null) {
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2", f = "WebSocketNetworkTransport.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int getHighResolutionOutputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizes = obj;
                        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.apollographql.apollo.api.ApolloRequest apolloRequest) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    this.getHighSpeedVideoFpsRanges = apolloRequest;
                }
            }
        }, new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$3(request, null));
        final kotlinx.coroutines.flow.Flow flow = new kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>>() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1.AnonymousClass2(flowCollector, request, deferredJsonMerger, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.apollographql.apollo.api.ApolloRequest Camera2StreamConfigurationMap;
                final /* synthetic */ com.apollographql.apollo.internal.DeferredJsonMerger getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;
                final /* synthetic */ com.apollographql.apollo.network.ws.WebSocketNetworkTransport getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    com.apollographql.apollo.api.ApolloResponse build;
                    kotlin.Pair pair;
                    if (continuation instanceof com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRanges;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                com.apollographql.apollo.network.ws.internal.Event event = (com.apollographql.apollo.network.ws.internal.Event) obj;
                                if (event instanceof com.apollographql.apollo.network.ws.internal.OperationResponse) {
                                    java.util.Map<java.lang.String, ? extends java.lang.Object> payload = ((com.apollographql.apollo.network.ws.internal.OperationResponse) event).getPayload();
                                    com.apollographql.apollo.api.ExecutionContext.Element element = this.Camera2StreamConfigurationMap.getExecutionContext().get(com.apollographql.apollo.api.CustomScalarAdapters.INSTANCE);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(element);
                                    com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters = (com.apollographql.apollo.api.CustomScalarAdapters) element;
                                    if (com.apollographql.apollo.internal.DeferredJsonMergerKt.isDeferred(payload)) {
                                        pair = kotlin.TuplesKt.to(this.getHighResolutionOutputSizeshNQ4ISI.merge(payload), this.getHighResolutionOutputSizeshNQ4ISI.getMergedFragmentIds());
                                    } else {
                                        pair = kotlin.TuplesKt.to(payload, null);
                                    }
                                    build = com.apollographql.apollo.api.Operations.toApolloResponse(com.apollographql.apollo.api.json.JsonReaders.jsonReader((java.util.Map<java.lang.String, ? extends java.lang.Object>) ((java.util.Map) pair.component1())), this.Camera2StreamConfigurationMap.getOperation(), this.Camera2StreamConfigurationMap.getRequestUuid(), customScalarAdapters, (java.util.Set) pair.component2());
                                    if (!this.getHighResolutionOutputSizeshNQ4ISI.getHasNext()) {
                                        this.getHighResolutionOutputSizeshNQ4ISI.reset();
                                    }
                                } else if (!(event instanceof com.apollographql.apollo.network.ws.internal.OperationError)) {
                                    if (!(event instanceof com.apollographql.apollo.network.ws.internal.NetworkError)) {
                                        if (!(event instanceof com.apollographql.apollo.network.ws.internal.ConnectionReEstablished) && !(event instanceof com.apollographql.apollo.network.ws.internal.OperationComplete) && !(event instanceof com.apollographql.apollo.network.ws.internal.GeneralError)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        throw new java.lang.IllegalStateException("Unexpected event ".concat(java.lang.String.valueOf(event)).toString());
                                    }
                                    com.apollographql.apollo.network.ws.WebSocketNetworkTransport webSocketNetworkTransport = this.getHighSpeedVideoFpsRangesFor;
                                    com.apollographql.apollo.api.ApolloRequest apolloRequest = this.Camera2StreamConfigurationMap;
                                    build = new com.apollographql.apollo.api.ApolloResponse.Builder(apolloRequest.getOperation(), apolloRequest.getRequestUuid()).exception(new com.apollographql.apollo.exception.ApolloNetworkException("Network error while executing ".concat(java.lang.String.valueOf(apolloRequest.getOperation().name())), ((com.apollographql.apollo.network.ws.internal.NetworkError) event).getCause())).isLast(true).build();
                                } else {
                                    com.apollographql.apollo.network.ws.WebSocketNetworkTransport webSocketNetworkTransport2 = this.getHighSpeedVideoFpsRangesFor;
                                    build = new com.apollographql.apollo.api.ApolloResponse.Builder(r4.getOperation(), this.Camera2StreamConfigurationMap.getRequestUuid()).exception(new com.apollographql.apollo.exception.SubscriptionOperationException(this.Camera2StreamConfigurationMap.getOperation().name(), ((com.apollographql.apollo.network.ws.internal.OperationError) event).getPayload())).isLast(true).build();
                                }
                                anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                                if (flowCollector.emit(build, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2", f = "WebSocketNetworkTransport.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int getHighSpeedVideoFpsRanges;
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRangesFor = obj;
                        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                        return com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.apollographql.apollo.api.ApolloRequest apolloRequest, com.apollographql.apollo.internal.DeferredJsonMerger deferredJsonMerger, com.apollographql.apollo.network.ws.WebSocketNetworkTransport webSocketNetworkTransport) {
                    this.getHighSpeedVideoFpsRanges = flowCollector;
                    this.Camera2StreamConfigurationMap = apolloRequest;
                    this.getHighResolutionOutputSizeshNQ4ISI = deferredJsonMerger;
                    this.getHighSpeedVideoFpsRangesFor = webSocketNetworkTransport;
                }
            }
        };
        return kotlinx.coroutines.flow.FlowKt.onCompletion(new kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>>() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1.AnonymousClass2(flowCollector, deferredJsonMerger), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.apollographql.apollo.internal.DeferredJsonMerger getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                if (!this.getHighResolutionOutputSizeshNQ4ISI.getIsEmptyPayload()) {
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2", f = "WebSocketNetworkTransport.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int getHighResolutionOutputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRanges = obj;
                        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.apollographql.apollo.internal.DeferredJsonMerger deferredJsonMerger) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = deferredJsonMerger;
                }
            }
        }, new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$6(this, request, null));
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final void dispose() {
        this.getHighSpeedVideoSizesFor.mo9266trySendJP2dKIU(com.apollographql.apollo.network.ws.internal.Dispose.INSTANCE);
    }

    public final void closeConnection(java.lang.Throwable reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        this.getHighSpeedVideoSizesFor.mo9266trySendJP2dKIU(new com.apollographql.apollo.network.ws.internal.NetworkError(reason));
    }

    @kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0005\u001a\u00020\u00002\u001e\u0010\u0005\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ>\u0010!\u001a\u00020\u00002/\u0010!\u001a+\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001d¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R.\u0010(\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010*R\u0018\u0010&\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R?\u00103\u001a+\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00102"}, d2 = {"Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "", "<init>", "()V", "", "serverUrl", "(Ljava/lang/String;)Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;)Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "headers", "addHeaders", "(Ljava/util/List;)Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "webSocketEngine", "(Lcom/apollographql/apollo/network/ws/WebSocketEngine;)Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "", "idleTimeoutMillis", "(J)Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "protocolFactory", "protocol", "(Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;)Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "", "reopenWhen", "(Lkotlin/jvm/functions/Function3;)Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport;", "build", "()Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "", "Ljava/util/List;", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "Ljava/lang/Long;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "Lkotlin/jvm/functions/Function3;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Builder {
        private com.apollographql.apollo.network.ws.WsProtocol.Factory Camera2StreamConfigurationMap;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> getHighSpeedVideoSizesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHighSpeedVideoSizes = new java.util.ArrayList();

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.Long getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private com.apollographql.apollo.network.ws.WebSocketEngine getHighSpeedVideoFpsRanges;

        public final com.apollographql.apollo.network.ws.WebSocketNetworkTransport.Builder serverUrl(java.lang.String serverUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverUrl, "");
            this.getHighSpeedVideoFpsRangesFor = new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$Builder$serverUrl$1$1(serverUrl, null);
            return this;
        }

        public final com.apollographql.apollo.network.ws.WebSocketNetworkTransport.Builder serverUrl(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> serverUrl) {
            this.getHighSpeedVideoFpsRangesFor = serverUrl;
            return this;
        }

        public final com.apollographql.apollo.network.ws.WebSocketNetworkTransport.Builder addHeader(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.getHighSpeedVideoSizes.add(new com.apollographql.apollo.api.http.HttpHeader(name2, value));
            return this;
        }

        public final com.apollographql.apollo.network.ws.WebSocketNetworkTransport.Builder addHeaders(java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            this.getHighSpeedVideoSizes.addAll(headers);
            return this;
        }

        public final com.apollographql.apollo.network.ws.WebSocketNetworkTransport.Builder headers(java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            this.getHighSpeedVideoSizes.clear();
            this.getHighSpeedVideoSizes.addAll(headers);
            return this;
        }

        public final com.apollographql.apollo.network.ws.WebSocketNetworkTransport.Builder webSocketEngine(com.apollographql.apollo.network.ws.WebSocketEngine webSocketEngine) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketEngine, "");
            this.getHighSpeedVideoFpsRanges = webSocketEngine;
            return this;
        }

        public final com.apollographql.apollo.network.ws.WebSocketNetworkTransport.Builder idleTimeoutMillis(long idleTimeoutMillis) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Long.valueOf(idleTimeoutMillis);
            return this;
        }

        public final com.apollographql.apollo.network.ws.WebSocketNetworkTransport.Builder protocol(com.apollographql.apollo.network.ws.WsProtocol.Factory protocolFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolFactory, "");
            this.Camera2StreamConfigurationMap = protocolFactory;
            return this;
        }

        public final com.apollographql.apollo.network.ws.WebSocketNetworkTransport.Builder reopenWhen(kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> reopenWhen) {
            this.getHighSpeedVideoSizesFor = reopenWhen;
            return this;
        }

        public final com.apollographql.apollo.network.ws.WebSocketNetworkTransport build() {
            kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> function1 = this.getHighSpeedVideoFpsRangesFor;
            if (function1 == null) {
                throw new java.lang.IllegalStateException("No serverUrl specified".toString());
            }
            java.util.List<com.apollographql.apollo.api.http.HttpHeader> list = this.getHighSpeedVideoSizes;
            com.apollographql.apollo.network.ws.DefaultWebSocketEngine defaultWebSocketEngine = this.getHighSpeedVideoFpsRanges;
            if (defaultWebSocketEngine == null) {
                defaultWebSocketEngine = new com.apollographql.apollo.network.ws.DefaultWebSocketEngine();
            }
            com.apollographql.apollo.network.ws.WebSocketEngine webSocketEngine = defaultWebSocketEngine;
            java.lang.Long l = this.getHighResolutionOutputSizeshNQ4ISI;
            long longValue = l != null ? l.longValue() : 60000L;
            com.apollographql.apollo.network.ws.SubscriptionWsProtocol.Factory factory = this.Camera2StreamConfigurationMap;
            if (factory == null) {
                factory = new com.apollographql.apollo.network.ws.SubscriptionWsProtocol.Factory(0L, null, null, 7, null);
            }
            return new com.apollographql.apollo.network.ws.WebSocketNetworkTransport(function1, list, webSocketEngine, longValue, factory, this.getHighSpeedVideoSizesFor, null);
        }
    }

    public /* synthetic */ WebSocketNetworkTransport(kotlin.jvm.functions.Function1 function1, java.util.List list, com.apollographql.apollo.network.ws.WebSocketEngine webSocketEngine, long j, com.apollographql.apollo.network.ws.WsProtocol.Factory factory, kotlin.jvm.functions.Function3 function3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, list, webSocketEngine, j, factory, function3);
    }
}
