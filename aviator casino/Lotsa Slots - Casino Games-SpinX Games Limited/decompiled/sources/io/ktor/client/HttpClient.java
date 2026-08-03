package io.ktor.client;

/* compiled from: HttpClient.kt */
@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001c\u001a\u00020\u00002\u001b\u0010\u001b\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010;\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010E\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010I\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010N\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lio/ktor/client/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/engine/HttpClientEngine;", "engine", "Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "userConfig", "<init>", "(Lio/ktor/client/engine/HttpClientEngine;Lio/ktor/client/HttpClientConfig;)V", "", "manageEngine", "(Lio/ktor/client/engine/HttpClientEngine;Lio/ktor/client/HttpClientConfig;Z)V", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/call/HttpClientCall;", "execute$ktor_client_core", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Lio/ktor/client/engine/HttpClientEngineCapability;", "capability", "isSupported", "(Lio/ktor/client/engine/HttpClientEngineCapability;)Z", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", com.helpshift.proactive.InAppViewConstants.CONFIG, "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/HttpClient;", "close", "()V", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/engine/HttpClientEngine;", "getEngine", "()Lio/ktor/client/engine/HttpClientEngine;", "Lio/ktor/client/HttpClientConfig;", "Z", "Lkotlinx/coroutines/CompletableJob;", "clientJob", "Lkotlinx/coroutines/CompletableJob;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/client/request/HttpRequestPipeline;", "requestPipeline", "Lio/ktor/client/request/HttpRequestPipeline;", "getRequestPipeline", "()Lio/ktor/client/request/HttpRequestPipeline;", "Lio/ktor/client/statement/HttpResponsePipeline;", "responsePipeline", "Lio/ktor/client/statement/HttpResponsePipeline;", "getResponsePipeline", "()Lio/ktor/client/statement/HttpResponsePipeline;", "Lio/ktor/client/request/HttpSendPipeline;", "sendPipeline", "Lio/ktor/client/request/HttpSendPipeline;", "getSendPipeline", "()Lio/ktor/client/request/HttpSendPipeline;", "Lio/ktor/client/statement/HttpReceivePipeline;", "receivePipeline", "Lio/ktor/client/statement/HttpReceivePipeline;", "getReceivePipeline", "()Lio/ktor/client/statement/HttpReceivePipeline;", "Lio/ktor/util/Attributes;", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "engineConfig", "Lio/ktor/client/engine/HttpClientEngineConfig;", "getEngineConfig", "()Lio/ktor/client/engine/HttpClientEngineConfig;", "Lio/ktor/events/Events;", "monitor", "Lio/ktor/events/Events;", "getMonitor", "()Lio/ktor/events/Events;", "getConfig$ktor_client_core", "()Lio/ktor/client/HttpClientConfig;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpClient implements kotlinx.coroutines.CoroutineScope, java.io.Closeable {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater closed$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.client.HttpClient.class, "closed");
    private final io.ktor.util.Attributes attributes;
    private final kotlinx.coroutines.CompletableJob clientJob;
    private volatile /* synthetic */ int closed;
    private final io.ktor.client.HttpClientConfig<io.ktor.client.engine.HttpClientEngineConfig> config;
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final io.ktor.client.engine.HttpClientEngine engine;
    private final io.ktor.client.engine.HttpClientEngineConfig engineConfig;
    private boolean manageEngine;
    private final io.ktor.events.Events monitor;
    private final io.ktor.client.statement.HttpReceivePipeline receivePipeline;
    private final io.ktor.client.request.HttpRequestPipeline requestPipeline;
    private final io.ktor.client.statement.HttpResponsePipeline responsePipeline;
    private final io.ktor.client.request.HttpSendPipeline sendPipeline;
    private final io.ktor.client.HttpClientConfig<? extends io.ktor.client.engine.HttpClientEngineConfig> userConfig;

    public HttpClient(io.ktor.client.engine.HttpClientEngine engine, io.ktor.client.HttpClientConfig<? extends io.ktor.client.engine.HttpClientEngineConfig> userConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(engine, "engine");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.engine = engine;
        this.userConfig = userConfig;
        boolean z = false;
        this.closed = 0;
        kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) engine.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE));
        this.clientJob = Job;
        this.coroutineContext = engine.getCoroutineContext().plus(Job);
        int i = 1;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        this.requestPipeline = new io.ktor.client.request.HttpRequestPipeline(z, i, defaultConstructorMarker);
        io.ktor.client.statement.HttpResponsePipeline httpResponsePipeline = new io.ktor.client.statement.HttpResponsePipeline(z, i, defaultConstructorMarker);
        this.responsePipeline = httpResponsePipeline;
        io.ktor.client.request.HttpSendPipeline httpSendPipeline = new io.ktor.client.request.HttpSendPipeline(z, i, defaultConstructorMarker);
        this.sendPipeline = httpSendPipeline;
        this.receivePipeline = new io.ktor.client.statement.HttpReceivePipeline(z, i, defaultConstructorMarker);
        this.attributes = io.ktor.util.AttributesJvmKt.Attributes(true);
        this.engineConfig = engine.getConfig();
        this.monitor = new io.ktor.events.Events();
        io.ktor.client.HttpClientConfig<io.ktor.client.engine.HttpClientEngineConfig> httpClientConfig = new io.ktor.client.HttpClientConfig<>();
        this.config = httpClientConfig;
        if (this.manageEngine) {
            Job.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClient$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit _init_$lambda$0;
                    _init_$lambda$0 = io.ktor.client.HttpClient._init_$lambda$0(io.ktor.client.HttpClient.this, (java.lang.Throwable) obj);
                    return _init_$lambda$0;
                }
            });
        }
        engine.install(this);
        httpSendPipeline.intercept(io.ktor.client.request.HttpSendPipeline.INSTANCE.getReceive(), new io.ktor.client.HttpClient.AnonymousClass2(null));
        io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.HttpRequestLifecycleKt.getHttpRequestLifecycle(), null, 2, null);
        io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.BodyProgressKt.getBodyProgress(), null, 2, null);
        io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.DoubleReceivePluginKt.getSaveBody(), null, 2, null);
        if (userConfig.getUseDefaultTransformers()) {
            httpClientConfig.install("DefaultTransformers", new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClient$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return io.ktor.client.HttpClient.lambda$2$lambda$1((io.ktor.client.HttpClient) obj);
                }
            });
        }
        io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.HttpSend.INSTANCE, null, 2, null);
        io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.HttpCallValidatorKt.getHttpCallValidator(), null, 2, null);
        if (userConfig.getFollowRedirects()) {
            io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.HttpRedirectKt.getHttpRedirect(), null, 2, null);
        }
        httpClientConfig.plusAssign(userConfig);
        if (userConfig.getUseDefaultTransformers()) {
            io.ktor.client.HttpClientConfig.install$default(httpClientConfig, io.ktor.client.plugins.HttpPlainTextKt.getHttpPlainText(), null, 2, null);
        }
        io.ktor.client.plugins.DefaultResponseValidationKt.addDefaultResponseValidation(httpClientConfig);
        httpClientConfig.install(this);
        httpResponsePipeline.intercept(io.ktor.client.statement.HttpResponsePipeline.INSTANCE.getReceive(), new io.ktor.client.HttpClient.AnonymousClass4(null));
    }

    public final io.ktor.client.engine.HttpClientEngine getEngine() {
        return this.engine;
    }

    public /* synthetic */ HttpClient(io.ktor.client.engine.HttpClientEngine httpClientEngine, io.ktor.client.HttpClientConfig httpClientConfig, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClientEngine, (i & 2) != 0 ? new io.ktor.client.HttpClientConfig() : httpClientConfig);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpClient(io.ktor.client.engine.HttpClientEngine engine, io.ktor.client.HttpClientConfig<? extends io.ktor.client.engine.HttpClientEngineConfig> userConfig, boolean z) {
        this(engine, userConfig);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(engine, "engine");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfig, "userConfig");
        this.manageEngine = z;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final io.ktor.client.request.HttpRequestPipeline getRequestPipeline() {
        return this.requestPipeline;
    }

    public final io.ktor.client.statement.HttpResponsePipeline getResponsePipeline() {
        return this.responsePipeline;
    }

    public final io.ktor.client.request.HttpSendPipeline getSendPipeline() {
        return this.sendPipeline;
    }

    public final io.ktor.client.statement.HttpReceivePipeline getReceivePipeline() {
        return this.receivePipeline;
    }

    public final io.ktor.util.Attributes getAttributes() {
        return this.attributes;
    }

    public final io.ktor.client.engine.HttpClientEngineConfig getEngineConfig() {
        return this.engineConfig;
    }

    public final io.ktor.events.Events getMonitor() {
        return this.monitor;
    }

    public final io.ktor.client.HttpClientConfig<io.ktor.client.engine.HttpClientEngineConfig> getConfig$ktor_client_core() {
        return this.config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit _init_$lambda$0(io.ktor.client.HttpClient httpClient, java.lang.Throwable th) {
        if (th != null) {
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(httpClient.engine, null, 1, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: HttpClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "call"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", i = {0, 0}, l = {1370, 1372}, m = "invokeSuspend", n = {"$this$intercept", "call"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.HttpClient$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super io.ktor.client.HttpClient.AnonymousClass2> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            io.ktor.client.HttpClient.AnonymousClass2 anonymousClass2 = io.ktor.client.HttpClient.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = pipelineContext;
            anonymousClass2.L$1 = obj;
            return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object obj2;
            io.ktor.util.pipeline.PipelineContext pipelineContext;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.util.pipeline.PipelineContext pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.L$0;
                obj2 = this.L$1;
                if (!(obj2 instanceof io.ktor.client.call.HttpClientCall)) {
                    throw new java.lang.IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj2.getClass()) + ").").toString());
                }
                this.L$0 = pipelineContext2;
                this.L$1 = obj2;
                this.label = 1;
                java.lang.Object execute = io.ktor.client.HttpClient.this.getReceivePipeline().execute(kotlin.Unit.INSTANCE, ((io.ktor.client.call.HttpClientCall) obj2).getResponse(), this);
                if (execute == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pipelineContext = pipelineContext2;
                obj = execute;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                obj2 = this.L$1;
                pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            ((io.ktor.client.call.HttpClientCall) obj2).setResponse$ktor_client_core((io.ktor.client.statement.HttpResponse) obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (pipelineContext.proceedWith(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    static final kotlin.Unit lambda$2$lambda$1(io.ktor.client.HttpClient install) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(install, "$this$install");
        io.ktor.client.plugins.DefaultTransformKt.defaultTransformers(install);
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: HttpClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", i = {0}, l = {1404}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    /* renamed from: io.ktor.client.HttpClient$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall>, io.ktor.client.statement.HttpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass4(kotlin.coroutines.Continuation<? super io.ktor.client.HttpClient.AnonymousClass4> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall> pipelineContext, io.ktor.client.statement.HttpResponseContainer httpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            io.ktor.client.HttpClient.AnonymousClass4 anonymousClass4 = io.ktor.client.HttpClient.this.new AnonymousClass4(continuation);
            anonymousClass4.L$0 = pipelineContext;
            return anonymousClass4.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            io.ktor.util.pipeline.PipelineContext pipelineContext;
            java.lang.Throwable th;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.util.pipeline.PipelineContext pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.L$0;
                try {
                    this.L$0 = pipelineContext2;
                    this.label = 1;
                    java.lang.Object proceed = pipelineContext2.proceed(this);
                    if (proceed == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pipelineContext = pipelineContext2;
                    obj = proceed;
                } catch (java.lang.Throwable th2) {
                    pipelineContext = pipelineContext2;
                    th = th2;
                    io.ktor.client.HttpClient.this.getMonitor().raise(io.ktor.client.utils.ClientEventsKt.getHttpResponseReceiveFailed(), new io.ktor.client.utils.HttpResponseReceiveFail(((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getResponse(), th));
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    io.ktor.client.HttpClient.this.getMonitor().raise(io.ktor.client.utils.ClientEventsKt.getHttpResponseReceiveFailed(), new io.ktor.client.utils.HttpResponseReceiveFail(((io.ktor.client.call.HttpClientCall) pipelineContext.getContext()).getResponse(), th));
                    throw th;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object execute$ktor_client_core(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
        io.ktor.client.HttpClient$execute$1 httpClient$execute$1;
        int i;
        if (continuation instanceof io.ktor.client.HttpClient$execute$1) {
            httpClient$execute$1 = (io.ktor.client.HttpClient$execute$1) continuation;
            if ((httpClient$execute$1.label & Integer.MIN_VALUE) != 0) {
                httpClient$execute$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpClient$execute$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpClient$execute$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.monitor.raise(io.ktor.client.utils.ClientEventsKt.getHttpRequestCreated(), httpRequestBuilder);
                    io.ktor.client.request.HttpRequestPipeline httpRequestPipeline = this.requestPipeline;
                    java.lang.Object body = httpRequestBuilder.getBody();
                    httpClient$execute$1.label = 1;
                    obj = httpRequestPipeline.execute(httpRequestBuilder, body, httpClient$execute$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
                return (io.ktor.client.call.HttpClientCall) obj;
            }
        }
        httpClient$execute$1 = new io.ktor.client.HttpClient$execute$1(this, continuation);
        java.lang.Object obj2 = httpClient$execute$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpClient$execute$1.label;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (io.ktor.client.call.HttpClientCall) obj2;
    }

    public final boolean isSupported(io.ktor.client.engine.HttpClientEngineCapability<?> capability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capability, "capability");
        return this.engine.getSupportedCapabilities().contains(capability);
    }

    public final io.ktor.client.HttpClient config(kotlin.jvm.functions.Function1<? super io.ktor.client.HttpClientConfig<?>, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.client.engine.HttpClientEngine httpClientEngine = this.engine;
        io.ktor.client.HttpClientConfig httpClientConfig = new io.ktor.client.HttpClientConfig();
        httpClientConfig.plusAssign(this.userConfig);
        block.invoke(httpClientConfig);
        return new io.ktor.client.HttpClient(httpClientEngine, httpClientConfig, this.manageEngine);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (closed$FU.compareAndSet(this, 0, 1)) {
            io.ktor.util.Attributes attributes = (io.ktor.util.Attributes) this.attributes.get(io.ktor.client.plugins.HttpClientPluginKt.getPLUGIN_INSTALLED_LIST());
            java.util.Iterator<T> it = attributes.getAllKeys().iterator();
            while (it.hasNext()) {
                io.ktor.util.AttributeKey attributeKey = (io.ktor.util.AttributeKey) it.next();
                kotlin.jvm.internal.Intrinsics.checkNotNull(attributeKey, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                java.lang.Object obj = attributes.get(attributeKey);
                if (obj instanceof java.lang.AutoCloseable) {
                    ((java.lang.AutoCloseable) obj).close();
                }
            }
            this.clientJob.complete();
            if (this.manageEngine) {
                this.engine.close();
            }
        }
    }

    public java.lang.String toString() {
        return "HttpClient[" + this.engine + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
    }
}
