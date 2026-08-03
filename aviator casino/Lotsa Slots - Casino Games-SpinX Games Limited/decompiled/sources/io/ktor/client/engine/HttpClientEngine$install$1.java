package io.ktor.client.engine;

/* compiled from: HttpClientEngine.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", i = {0, 0}, l = {154, 166}, m = "invokeSuspend", n = {"$this$intercept", "requestData"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class HttpClientEngine$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.HttpClient $client;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;
    final /* synthetic */ io.ktor.client.engine.HttpClientEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClientEngine$install$1(io.ktor.client.HttpClient httpClient, io.ktor.client.engine.HttpClientEngine httpClientEngine, kotlin.coroutines.Continuation<? super io.ktor.client.engine.HttpClientEngine$install$1> continuation) {
        super(3, continuation);
        this.$client = httpClient;
        this.this$0 = httpClientEngine;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.engine.HttpClientEngine$install$1 httpClientEngine$install$1 = new io.ktor.client.engine.HttpClientEngine$install$1(this.$client, this.this$0, continuation);
        httpClientEngine$install$1.L$0 = pipelineContext;
        httpClientEngine$install$1.L$1 = obj;
        return httpClientEngine$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.reflect.KType kType;
        io.ktor.client.request.HttpRequestData build;
        java.lang.Object executeWithinCallContext;
        io.ktor.util.pipeline.PipelineContext pipelineContext;
        kotlin.reflect.KType kType2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.L$0;
            java.lang.Object obj2 = this.L$1;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
            httpRequestBuilder.takeFromWithExecutionContext((io.ktor.client.request.HttpRequestBuilder) pipelineContext2.getContext());
            if (obj2 == null) {
                httpRequestBuilder.setBody(io.ktor.http.content.NullBody.INSTANCE);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
                try {
                    kType2 = kotlin.jvm.internal.Reflection.typeOf(java.lang.Object.class);
                } catch (java.lang.Throwable unused) {
                    kType2 = null;
                }
                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType2));
            } else if (obj2 instanceof io.ktor.http.content.OutgoingContent) {
                httpRequestBuilder.setBody(obj2);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(obj2);
                kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
                try {
                    kType = kotlin.jvm.internal.Reflection.typeOf(java.lang.Object.class);
                } catch (java.lang.Throwable unused2) {
                    kType = null;
                }
                httpRequestBuilder.setBodyType(new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType));
            }
            this.$client.getMonitor().raise(io.ktor.client.utils.ClientEventsKt.getHttpRequestIsReadyForSending(), httpRequestBuilder);
            build = httpRequestBuilder.build();
            build.getAttributes().put(io.ktor.client.engine.HttpClientEngineKt.getCLIENT_CONFIG(), this.$client.getConfig$ktor_client_core());
            io.ktor.client.engine.HttpClientEngineKt.validateHeaders(build);
            io.ktor.client.engine.HttpClientEngine.DefaultImpls.checkExtensions(this.this$0, build);
            this.L$0 = pipelineContext2;
            this.L$1 = build;
            this.label = 1;
            executeWithinCallContext = io.ktor.client.engine.HttpClientEngine.DefaultImpls.executeWithinCallContext(this.this$0, build, this);
            if (executeWithinCallContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            pipelineContext = pipelineContext2;
            obj = executeWithinCallContext;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            build = (io.ktor.client.request.HttpRequestData) this.L$1;
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        io.ktor.client.call.HttpClientCall httpClientCall = new io.ktor.client.call.HttpClientCall(this.$client, build, (io.ktor.client.request.HttpResponseData) obj);
        final io.ktor.client.statement.HttpResponse response = httpClientCall.getResponse();
        this.$client.getMonitor().raise(io.ktor.client.utils.ClientEventsKt.getHttpResponseReceived(), response);
        kotlinx.coroutines.Job job = kotlinx.coroutines.JobKt.getJob(response.getCoroutineContext());
        final io.ktor.client.HttpClient httpClient = this.$client;
        job.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.HttpClientEngine$install$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                kotlin.Unit invokeSuspend$lambda$2;
                invokeSuspend$lambda$2 = io.ktor.client.engine.HttpClientEngine$install$1.invokeSuspend$lambda$2(io.ktor.client.HttpClient.this, response, (java.lang.Throwable) obj3);
                return invokeSuspend$lambda$2;
            }
        });
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (pipelineContext.proceedWith(httpClientCall, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit invokeSuspend$lambda$2(io.ktor.client.HttpClient httpClient, io.ktor.client.statement.HttpResponse httpResponse, java.lang.Throwable th) {
        if (th != null) {
            httpClient.getMonitor().raise(io.ktor.client.utils.ClientEventsKt.getHttpResponseCancelled(), httpResponse);
        }
        return kotlin.Unit.INSTANCE;
    }
}
