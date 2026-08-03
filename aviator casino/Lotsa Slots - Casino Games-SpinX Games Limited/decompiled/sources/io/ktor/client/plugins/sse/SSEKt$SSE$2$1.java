package io.ktor.client.plugins.sse;

/* compiled from: SSE.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$1", f = "SSE.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SSEKt$SSE$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, io.ktor.http.content.OutgoingContent, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, java.lang.Object> {
    final /* synthetic */ int $maxReconnectionAttempts;
    final /* synthetic */ long $reconnectionTime;
    final /* synthetic */ boolean $showCommentEvents;
    final /* synthetic */ boolean $showRetryEvents;
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.sse.SSEConfig> $this_createClientPlugin;
    /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SSEKt$SSE$2$1(io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.sse.SSEConfig> clientPluginBuilder, long j, boolean z, boolean z2, int i, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.SSEKt$SSE$2$1> continuation) {
        super(3, continuation);
        this.$this_createClientPlugin = clientPluginBuilder;
        this.$reconnectionTime = j;
        this.$showCommentEvents = z;
        this.$showRetryEvents = z2;
        this.$maxReconnectionAttempts = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.http.content.OutgoingContent outgoingContent, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent> continuation) {
        io.ktor.client.plugins.sse.SSEKt$SSE$2$1 sSEKt$SSE$2$1 = new io.ktor.client.plugins.sse.SSEKt$SSE$2$1(this.$this_createClientPlugin, this.$reconnectionTime, this.$showCommentEvents, this.$showRetryEvents, this.$maxReconnectionAttempts, continuation);
        sSEKt$SSE$2$1.L$0 = httpRequestBuilder;
        sSEKt$SSE$2$1.L$1 = outgoingContent;
        return sSEKt$SSE$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object attributeValue;
        java.lang.Object attributeValue2;
        java.lang.Object attributeValue3;
        java.lang.Object attributeValue4;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.L$0;
            io.ktor.http.content.OutgoingContent outgoingContent = (io.ktor.http.content.OutgoingContent) this.L$1;
            attributeValue = io.ktor.client.plugins.sse.SSEKt.getAttributeValue(httpRequestBuilder, io.ktor.client.plugins.sse.BuildersKt.getSseRequestAttr());
            if (!kotlin.jvm.internal.Intrinsics.areEqual(attributeValue, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                return outgoingContent;
            }
            org.slf4j.Logger logger = io.ktor.client.plugins.sse.SSEKt.getLOGGER();
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                logger.trace("Sending SSE request to " + httpRequestBuilder.getUrl());
            }
            httpRequestBuilder.setCapability(io.ktor.client.plugins.sse.SSECapability.INSTANCE, kotlin.Unit.INSTANCE);
            attributeValue2 = io.ktor.client.plugins.sse.SSEKt.getAttributeValue(httpRequestBuilder, io.ktor.client.plugins.sse.BuildersKt.getReconnectionTimeAttr());
            kotlin.time.Duration duration = (kotlin.time.Duration) attributeValue2;
            attributeValue3 = io.ktor.client.plugins.sse.SSEKt.getAttributeValue(httpRequestBuilder, io.ktor.client.plugins.sse.BuildersKt.getShowCommentEventsAttr());
            java.lang.Boolean bool = (java.lang.Boolean) attributeValue3;
            attributeValue4 = io.ktor.client.plugins.sse.SSEKt.getAttributeValue(httpRequestBuilder, io.ktor.client.plugins.sse.BuildersKt.getShowRetryEventsAttr());
            java.lang.Boolean bool2 = (java.lang.Boolean) attributeValue4;
            httpRequestBuilder.getAttributes().put(io.ktor.client.request.HttpRequestKt.getResponseAdapterAttributeKey(), new io.ktor.client.request.SSEClientResponseAdapter());
            httpRequestBuilder.getAttributes().put(io.ktor.client.plugins.sse.SSEKt.getSSEClientForReconnectionAttr(), this.$this_createClientPlugin.getClient());
            io.ktor.http.ContentType contentType = outgoingContent.getContentType();
            if (contentType != null) {
                io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder, contentType);
            }
            return new io.ktor.client.plugins.sse.SSEClientContent(duration != null ? duration.getRawValue() : this.$reconnectionTime, bool != null ? bool.booleanValue() : this.$showCommentEvents, bool2 != null ? bool2.booleanValue() : this.$showRetryEvents, this.$maxReconnectionAttempts, get$context(), httpRequestBuilder, outgoingContent, null);
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
