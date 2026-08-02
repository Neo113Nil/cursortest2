package io.ktor.client.plugins.websocket;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2", f = "WebSockets.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class WebSockets$Plugin$install$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall>, io.ktor.client.statement.HttpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.plugins.websocket.WebSockets getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.client.plugins.websocket.DelegatingClientWebSocketSession delegatingClientWebSocketSession;
        java.util.List<? extends io.ktor.websocket.WebSocketExtension<?>> emptyList;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRanges;
            io.ktor.client.statement.HttpResponseContainer httpResponseContainer = (io.ktor.client.statement.HttpResponseContainer) this.Camera2StreamConfigurationMap;
            io.ktor.util.reflect.TypeInfo expectedType = httpResponseContainer.getExpectedType();
            java.lang.Object response = httpResponseContainer.getResponse();
            io.ktor.client.statement.HttpResponse response2 = ((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getResponse();
            io.ktor.http.HttpStatusCode status = response2.getStatus();
            io.ktor.http.content.OutgoingContent camera2StreamConfigurationMap = io.ktor.client.statement.HttpResponseKt.getRequest(response2).getCamera2StreamConfigurationMap();
            if (!(camera2StreamConfigurationMap instanceof io.ktor.client.plugins.websocket.WebSocketContent)) {
                org.slf4j.Logger logger = io.ktor.client.plugins.websocket.WebSocketsKt.getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Skipping non-websocket response from ");
                    sb.append(((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getRequest().getGetHighSpeedVideoFpsRanges());
                    sb.append(": ");
                    sb.append(camera2StreamConfigurationMap);
                    logger.trace(sb.toString());
                }
                return kotlin.Unit.INSTANCE;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getSwitchingProtocols())) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Handshake exception, expected status code ");
                sb2.append(io.ktor.http.HttpStatusCode.INSTANCE.getSwitchingProtocols().getValue());
                sb2.append(" but was ");
                sb2.append(status.getValue());
                throw new io.ktor.client.plugins.websocket.WebSocketException(sb2.toString());
            }
            if (!(response instanceof io.ktor.websocket.WebSocketSession)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Handshake exception, expected `WebSocketSession` content but was ");
                sb3.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(response.getClass()));
                throw new io.ktor.client.plugins.websocket.WebSocketException(sb3.toString());
            }
            org.slf4j.Logger logger2 = io.ktor.client.plugins.websocket.WebSocketsKt.getLOGGER();
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Receive websocket session from ");
                sb4.append(((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getRequest().getGetHighSpeedVideoFpsRanges());
                sb4.append(": ");
                sb4.append(response);
                logger2.trace(sb4.toString());
            }
            if (this.getHighSpeedVideoSizes.getMaxFrameSize() != androidx.collection.SieveCacheKt.NodeLinkMask) {
                ((io.ktor.websocket.WebSocketSession) response).setMaxFrameSize(this.getHighSpeedVideoSizes.getMaxFrameSize());
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(expectedType.getType(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession.class))) {
                io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession = new io.ktor.client.plugins.websocket.DefaultClientWebSocketSession((io.ktor.client.call.HttpClientCall) pipelineContext.getContext(), this.getHighSpeedVideoSizes.convertSessionToDefault$ktor_client_core((io.ktor.websocket.WebSocketSession) response));
                if (this.getHighSpeedVideoFpsRangesFor) {
                    emptyList = io.ktor.client.plugins.websocket.WebSockets.access$completeNegotiation(this.getHighSpeedVideoSizes, (io.ktor.client.call.HttpClientCall) pipelineContext.getContext());
                } else {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                }
                defaultClientWebSocketSession.start(emptyList);
                delegatingClientWebSocketSession = defaultClientWebSocketSession;
            } else {
                delegatingClientWebSocketSession = new io.ktor.client.plugins.websocket.DelegatingClientWebSocketSession((io.ktor.client.call.HttpClientCall) pipelineContext.getContext(), (io.ktor.websocket.WebSocketSession) response);
            }
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
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

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall> pipelineContext, io.ktor.client.statement.HttpResponseContainer httpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2 webSockets$Plugin$install$2 = new io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        webSockets$Plugin$install$2.getHighSpeedVideoFpsRanges = pipelineContext;
        webSockets$Plugin$install$2.Camera2StreamConfigurationMap = httpResponseContainer;
        return webSockets$Plugin$install$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSockets$Plugin$install$2(io.ktor.client.plugins.websocket.WebSockets webSockets, boolean z, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = webSockets;
        this.getHighSpeedVideoFpsRangesFor = z;
    }
}
