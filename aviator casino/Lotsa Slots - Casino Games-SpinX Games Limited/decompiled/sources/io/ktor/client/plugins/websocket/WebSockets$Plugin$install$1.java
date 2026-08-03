package io.ktor.client.plugins.websocket;

/* compiled from: WebSockets.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1", f = "WebSockets.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class WebSockets$Plugin$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean $extensionsSupported;
    final /* synthetic */ io.ktor.client.plugins.websocket.WebSockets $plugin;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSockets$Plugin$install$1(boolean z, io.ktor.client.plugins.websocket.WebSockets webSockets, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1> continuation) {
        super(3, continuation);
        this.$extensionsSupported = z;
        this.$plugin = webSockets;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1 webSockets$Plugin$install$1 = new io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1(this.$extensionsSupported, this.$plugin, continuation);
        webSockets$Plugin$install$1.L$0 = pipelineContext;
        return webSockets$Plugin$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
            if (!io.ktor.http.URLProtocolKt.isWebsocket(((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getUrl().getProtocol())) {
                org.slf4j.Logger logger = io.ktor.client.plugins.websocket.WebSocketsKt.getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                    logger.trace("Skipping WebSocket plugin for non-websocket request: " + ((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getUrl());
                }
                return kotlin.Unit.INSTANCE;
            }
            org.slf4j.Logger logger2 = io.ktor.client.plugins.websocket.WebSocketsKt.getLOGGER();
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger2)) {
                logger2.trace("Sending WebSocket request " + ((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getUrl());
            }
            ((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).setCapability(io.ktor.client.plugins.websocket.WebSocketCapability.INSTANCE, kotlin.Unit.INSTANCE);
            if (this.$extensionsSupported) {
                this.$plugin.installExtensions((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext());
            }
            this.label = 1;
            if (pipelineContext.proceedWith(new io.ktor.client.plugins.websocket.WebSocketContent(), this) == coroutine_suspended) {
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
