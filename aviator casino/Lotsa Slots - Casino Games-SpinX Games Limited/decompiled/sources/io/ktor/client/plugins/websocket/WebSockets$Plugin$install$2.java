package io.ktor.client.plugins.websocket;

/* compiled from: WebSockets.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2", f = "WebSockets.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class WebSockets$Plugin$install$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall>, io.ktor.client.statement.HttpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean $extensionsSupported;
    final /* synthetic */ io.ktor.client.plugins.websocket.WebSockets $plugin;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSockets$Plugin$install$2(io.ktor.client.plugins.websocket.WebSockets webSockets, boolean z, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2> continuation) {
        super(3, continuation);
        this.$plugin = webSockets;
        this.$extensionsSupported = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall> pipelineContext, io.ktor.client.statement.HttpResponseContainer httpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2 webSockets$Plugin$install$2 = new io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2(this.$plugin, this.$extensionsSupported, continuation);
        webSockets$Plugin$install$2.L$0 = pipelineContext;
        webSockets$Plugin$install$2.L$1 = httpResponseContainer;
        return webSockets$Plugin$install$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.client.plugins.websocket.DelegatingClientWebSocketSession delegatingClientWebSocketSession;
        java.util.List<? extends io.ktor.websocket.WebSocketExtension<?>> emptyList;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
            io.ktor.client.statement.HttpResponseContainer httpResponseContainer = (io.ktor.client.statement.HttpResponseContainer) this.L$1;
            io.ktor.util.reflect.TypeInfo expectedType = httpResponseContainer.getExpectedType();
            java.lang.Object response = httpResponseContainer.getResponse();
            io.ktor.client.statement.HttpResponse response2 = ((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getResponse();
            io.ktor.http.HttpStatusCode status = response2.getStatus();
            io.ktor.http.content.OutgoingContent content = io.ktor.client.statement.HttpResponseKt.getRequest(response2).getContent();
            if (!(content instanceof io.ktor.client.plugins.websocket.WebSocketContent)) {
                org.slf4j.Logger logger = io.ktor.client.plugins.websocket.WebSocketsKt.getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                    logger.trace("Skipping non-websocket response from " + ((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getRequest().getUrl() + ": " + content);
                }
                return kotlin.Unit.INSTANCE;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getSwitchingProtocols())) {
                throw new io.ktor.client.plugins.websocket.WebSocketException("Handshake exception, expected status code " + io.ktor.http.HttpStatusCode.INSTANCE.getSwitchingProtocols().getValue() + " but was " + status.getValue());
            }
            if (!(response instanceof io.ktor.websocket.WebSocketSession)) {
                throw new io.ktor.client.plugins.websocket.WebSocketException("Handshake exception, expected `WebSocketSession` content but was " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(response.getClass()));
            }
            org.slf4j.Logger logger2 = io.ktor.client.plugins.websocket.WebSocketsKt.getLOGGER();
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
                logger2.trace("Receive websocket session from " + ((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getRequest().getUrl() + ": " + response);
            }
            if (this.$plugin.getMaxFrameSize() != 2147483647L) {
                ((io.ktor.websocket.WebSocketSession) response).setMaxFrameSize(this.$plugin.getMaxFrameSize());
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(expectedType.getType(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession.class))) {
                io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession = new io.ktor.client.plugins.websocket.DefaultClientWebSocketSession((io.ktor.client.call.HttpClientCall) pipelineContext.getContext(), this.$plugin.convertSessionToDefault$ktor_client_core((io.ktor.websocket.WebSocketSession) response));
                if (this.$extensionsSupported) {
                    emptyList = this.$plugin.completeNegotiation((io.ktor.client.call.HttpClientCall) pipelineContext.getContext());
                } else {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                }
                defaultClientWebSocketSession.start(emptyList);
                delegatingClientWebSocketSession = defaultClientWebSocketSession;
            } else {
                delegatingClientWebSocketSession = new io.ktor.client.plugins.websocket.DelegatingClientWebSocketSession((io.ktor.client.call.HttpClientCall) pipelineContext.getContext(), (io.ktor.websocket.WebSocketSession) response);
            }
            this.L$0 = null;
            this.label = 1;
            if (pipelineContext.proceedWith(new io.ktor.client.statement.HttpResponseContainer(expectedType, delegatingClientWebSocketSession), this) == coroutine_suspended) {
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
}
