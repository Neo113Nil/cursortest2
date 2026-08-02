package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002*\u0012&\u0012$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/client/plugins/sse/AfterRender;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/http/content/OutgoingContent;", "Lkotlin/coroutines/Continuation;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class AfterRender implements io.ktor.client.plugins.api.ClientHook<kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequestBuilder, ? super io.ktor.http.content.OutgoingContent, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object>> {
    public static final io.ktor.client.plugins.sse.AfterRender INSTANCE = new io.ktor.client.plugins.sse.AfterRender();

    private AfterRender() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public final /* synthetic */ void install(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequestBuilder, ? super io.ktor.http.content.OutgoingContent, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object> function3) {
        kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequestBuilder, ? super io.ktor.http.content.OutgoingContent, ? super kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, ? extends java.lang.Object> function32 = function3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function32, "");
        io.ktor.util.pipeline.PipelinePhase pipelinePhase = new io.ktor.util.pipeline.PipelinePhase("AfterRender");
        httpClient.getRequestPipeline().insertPhaseAfter(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getRender(), pipelinePhase);
        httpClient.getRequestPipeline().intercept(pipelinePhase, new io.ktor.client.plugins.sse.AfterRender$install$1(function32, null));
    }
}
