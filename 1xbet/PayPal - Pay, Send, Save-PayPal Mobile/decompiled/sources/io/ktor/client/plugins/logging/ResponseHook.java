package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u000024\u00120\u0012.\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002¢\u0006\u0002\b\t0\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/client/plugins/logging/ResponseHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/plugins/logging/ResponseHook$Context;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "<init>", "()V", "Context"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ResponseHook implements io.ktor.client.plugins.api.ClientHook<kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.logging.ResponseHook.Context, ? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> {
    public static final io.ktor.client.plugins.logging.ResponseHook INSTANCE = new io.ktor.client.plugins.logging.ResponseHook();

    private ResponseHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public final /* synthetic */ void install(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.logging.ResponseHook.Context, ? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.logging.ResponseHook.Context, ? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function32 = function3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function32, "");
        httpClient.getReceivePipeline().intercept(io.ktor.client.statement.HttpReceivePipeline.INSTANCE.getState(), new io.ktor.client.plugins.logging.ResponseHook$install$1(function32, null));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/client/plugins/logging/ResponseHook$Context;", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "", "context", "<init>", "(Lio/ktor/util/pipeline/PipelineContext;)V", "proceed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lio/ktor/util/pipeline/PipelineContext;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Context {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit> getHighSpeedVideoFpsRanges;

        public Context(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit> pipelineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pipelineContext, "");
            this.getHighSpeedVideoFpsRanges = pipelineContext;
        }

        public final java.lang.Object proceed(kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
            return this.getHighSpeedVideoFpsRanges.proceed(continuation);
        }
    }
}
