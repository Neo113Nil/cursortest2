package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u000024\u00120\u0012.\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002¢\u0006\u0002\b\t0\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/client/plugins/logging/SendHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/plugins/logging/SendHook$Context;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "<init>", "()V", "Context"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class SendHook implements io.ktor.client.plugins.api.ClientHook<kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.logging.SendHook.Context, ? super io.ktor.client.request.HttpRequestBuilder, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> {
    public static final io.ktor.client.plugins.logging.SendHook INSTANCE = new io.ktor.client.plugins.logging.SendHook();

    private SendHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public final /* synthetic */ void install(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.logging.SendHook.Context, ? super io.ktor.client.request.HttpRequestBuilder, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.logging.SendHook.Context, ? super io.ktor.client.request.HttpRequestBuilder, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function32 = function3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function32, "");
        httpClient.getSendPipeline().intercept(io.ktor.client.request.HttpSendPipeline.INSTANCE.getMonitoring(), new io.ktor.client.plugins.logging.SendHook$install$1(function32, null));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lio/ktor/client/plugins/logging/SendHook$Context;", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "context", "<init>", "(Lio/ktor/util/pipeline/PipelineContext;)V", "content", "proceedWith", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/util/pipeline/PipelineContext;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Context {
        private final io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> getHighResolutionOutputSizeshNQ4ISI;

        public Context(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pipelineContext, "");
            this.getHighResolutionOutputSizeshNQ4ISI = pipelineContext;
        }

        public final java.lang.Object proceedWith(java.lang.Object obj, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
            return this.getHighResolutionOutputSizeshNQ4ISI.proceedWith(obj, continuation);
        }

        public final java.lang.Object proceed(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
            return this.getHighResolutionOutputSizeshNQ4ISI.proceed(continuation);
        }
    }
}
