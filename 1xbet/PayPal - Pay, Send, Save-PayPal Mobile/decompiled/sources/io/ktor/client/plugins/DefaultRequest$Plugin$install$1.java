package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.DefaultRequest$Plugin$install$1", f = "DefaultRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class DefaultRequest$Plugin$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.client.plugins.DefaultRequest getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function1;
        org.slf4j.Logger logger;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRanges;
        java.lang.String obj2 = ((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getUrl().toString();
        io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder defaultRequestBuilder = new io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder();
        io.ktor.client.plugins.DefaultRequest defaultRequest = this.getHighSpeedVideoFpsRangesFor;
        io.ktor.util.StringValuesKt.appendAll(defaultRequestBuilder.getHeaders(), ((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getHeaders());
        io.ktor.http.Headers build = defaultRequestBuilder.getHeaders().build();
        function1 = defaultRequest.getHighSpeedVideoFpsRanges;
        function1.invoke(defaultRequestBuilder);
        java.util.Iterator<T> it = build.entries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            java.util.List<java.lang.String> all = defaultRequestBuilder.getHeaders().getAll(str);
            if (all == null) {
                defaultRequestBuilder.getHeaders().appendAll(str, list);
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(all, list) && !kotlin.jvm.internal.Intrinsics.areEqual(str, io.ktor.http.HttpHeaders.INSTANCE.getCookie())) {
                defaultRequestBuilder.getHeaders().remove(str);
                defaultRequestBuilder.getHeaders().appendAll(str, list);
                defaultRequestBuilder.getHeaders().appendMissing(str, all);
            }
        }
        io.ktor.client.plugins.DefaultRequest.Companion.access$mergeUrls(io.ktor.client.plugins.DefaultRequest.INSTANCE, defaultRequestBuilder.getUrl().build(), ((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getUrl());
        for (io.ktor.util.AttributeKey<?> attributeKey : defaultRequestBuilder.getAttributes().getAllKeys()) {
            if (!((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getAttributes().contains(attributeKey)) {
                io.ktor.util.Attributes attributes = ((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getAttributes();
                kotlin.jvm.internal.Intrinsics.checkNotNull(attributeKey, "");
                attributes.put(attributeKey, defaultRequestBuilder.getAttributes().get(attributeKey));
            }
        }
        ((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getHeaders().clear();
        ((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getHeaders().appendAll(defaultRequestBuilder.getHeaders().build());
        logger = io.ktor.client.plugins.DefaultRequestKt.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Applied DefaultRequest to ");
        sb.append(obj2);
        sb.append(". New url: ");
        sb.append(((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getUrl());
        logger.trace(sb.toString());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.DefaultRequest$Plugin$install$1 defaultRequest$Plugin$install$1 = new io.ktor.client.plugins.DefaultRequest$Plugin$install$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        defaultRequest$Plugin$install$1.getHighSpeedVideoFpsRanges = pipelineContext;
        return defaultRequest$Plugin$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultRequest$Plugin$install$1(io.ktor.client.plugins.DefaultRequest defaultRequest, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.DefaultRequest$Plugin$install$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = defaultRequest;
    }
}
