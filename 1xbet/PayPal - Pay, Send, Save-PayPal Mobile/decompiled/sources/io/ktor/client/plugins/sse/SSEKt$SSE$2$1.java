package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$1", f = "SSE.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SSEKt$SSE$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, io.ktor.http.content.OutgoingContent, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, java.lang.Object> {
    final /* synthetic */ long Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.sse.SSEConfig> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object orNull;
        java.lang.Object orNull2;
        java.lang.Object orNull3;
        java.lang.Object orNull4;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.getInputSizeshNQ4ISI;
        io.ktor.http.content.OutgoingContent outgoingContent = (io.ktor.http.content.OutgoingContent) this.getOutputFormats;
        orNull = httpRequestBuilder.getAttributes().getOrNull(io.ktor.client.plugins.sse.BuildersKt.getSseRequestAttr());
        if (!kotlin.jvm.internal.Intrinsics.areEqual(orNull, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
            return outgoingContent;
        }
        org.slf4j.Logger logger = io.ktor.client.plugins.sse.SSEKt.getLOGGER();
        if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Sending SSE request to ");
            sb.append(httpRequestBuilder.getUrl());
            logger.trace(sb.toString());
        }
        httpRequestBuilder.setCapability(io.ktor.client.plugins.sse.SSECapability.INSTANCE, kotlin.Unit.INSTANCE);
        orNull2 = httpRequestBuilder.getAttributes().getOrNull(io.ktor.client.plugins.sse.BuildersKt.getReconnectionTimeAttr());
        kotlin.time.Duration duration = (kotlin.time.Duration) orNull2;
        orNull3 = httpRequestBuilder.getAttributes().getOrNull(io.ktor.client.plugins.sse.BuildersKt.getShowCommentEventsAttr());
        java.lang.Boolean bool = (java.lang.Boolean) orNull3;
        orNull4 = httpRequestBuilder.getAttributes().getOrNull(io.ktor.client.plugins.sse.BuildersKt.getShowRetryEventsAttr());
        java.lang.Boolean bool2 = (java.lang.Boolean) orNull4;
        httpRequestBuilder.getAttributes().put(io.ktor.client.request.HttpRequestKt.getResponseAdapterAttributeKey(), new io.ktor.client.request.SSEClientResponseAdapter());
        httpRequestBuilder.getAttributes().put(io.ktor.client.plugins.sse.SSEKt.getSSEClientForReconnectionAttr(), this.getHighResolutionOutputSizeshNQ4ISI.getClient());
        io.ktor.http.ContentType contentType = outgoingContent.getContentType();
        if (contentType != null) {
            io.ktor.http.HttpMessagePropertiesKt.contentType(httpRequestBuilder, contentType);
        }
        return new io.ktor.client.plugins.sse.SSEClientContent(duration != null ? duration.getGetHighResolutionOutputSizeshNQ4ISI() : this.Camera2StreamConfigurationMap, bool != null ? bool.booleanValue() : this.getHighSpeedVideoSizes, bool2 != null ? bool2.booleanValue() : this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, getGetHighSpeedVideoSizes(), httpRequestBuilder, outgoingContent, null);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.http.content.OutgoingContent outgoingContent, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent> continuation) {
        io.ktor.client.plugins.sse.SSEKt$SSE$2$1 sSEKt$SSE$2$1 = new io.ktor.client.plugins.sse.SSEKt$SSE$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        sSEKt$SSE$2$1.getInputSizeshNQ4ISI = httpRequestBuilder;
        sSEKt$SSE$2$1.getOutputFormats = outgoingContent;
        return sSEKt$SSE$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SSEKt$SSE$2$1(io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.sse.SSEConfig> clientPluginBuilder, long j, boolean z, boolean z2, int i, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.SSEKt$SSE$2$1> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = clientPluginBuilder;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRanges = z2;
        this.getHighSpeedVideoFpsRangesFor = i;
    }
}
