package io.ktor.client.engine;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0011\u001a\u00020\f8WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineBase;", "Lio/ktor/client/engine/HttpClientEngine;", "", "engineName", "<init>", "(Ljava/lang/String;)V", "", "close", "()V", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext$delegate", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class HttpClientEngineBase implements io.ktor.client.engine.HttpClientEngine {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.client.engine.HttpClientEngineBase.class, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private volatile /* synthetic */ int closed;

    /* renamed from: coroutineContext$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy coroutineContext;

    /* renamed from: dispatcher$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy dispatcher;

    public HttpClientEngineBase(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.closed = 0;
        this.dispatcher = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.engine.HttpClientEngineBase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return io.ktor.client.engine.HttpClientEngineBase.m23243$r8$lambda$W8fN_h3EvbqRkagcFJfwwhBvw(io.ktor.client.engine.HttpClientEngineBase.this);
            }
        });
        this.coroutineContext = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.engine.HttpClientEngineBase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return io.ktor.client.engine.HttpClientEngineBase.$r8$lambda$xUkIJ7zl4ITmOe0gubGVLQrZPEM(io.ktor.client.engine.HttpClientEngineBase.this);
            }
        });
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return io.ktor.client.engine.HttpClientEngine.DefaultImpls.getSupportedCapabilities(this);
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public void install(io.ktor.client.HttpClient httpClient) {
        io.ktor.client.engine.HttpClientEngine.DefaultImpls.install(this, httpClient);
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public kotlinx.coroutines.CoroutineDispatcher getDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) this.dispatcher.getValue();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return (kotlin.coroutines.CoroutineContext) this.coroutineContext.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (getHighResolutionOutputSizeshNQ4ISI.compareAndSet(this, 0, 1)) {
            kotlin.coroutines.CoroutineContext.Element element = getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
            kotlinx.coroutines.CompletableJob completableJob = element instanceof kotlinx.coroutines.CompletableJob ? (kotlinx.coroutines.CompletableJob) element : null;
            if (completableJob == null) {
                return;
            }
            completableJob.complete();
        }
    }

    /* renamed from: $r8$lambda$W8fN_h3EvbqRkag-cFJfwwhBv-w, reason: not valid java name */
    public static /* synthetic */ kotlinx.coroutines.CoroutineDispatcher m23243$r8$lambda$W8fN_h3EvbqRkagcFJfwwhBvw(io.ktor.client.engine.HttpClientEngineBase httpClientEngineBase) {
        kotlinx.coroutines.CoroutineDispatcher dispatcher = httpClientEngineBase.getConfig().getDispatcher();
        return dispatcher == null ? io.ktor.client.engine.HttpClientEngineBase_jvmKt.ioDispatcher() : dispatcher;
    }

    public static /* synthetic */ kotlin.coroutines.CoroutineContext $r8$lambda$xUkIJ7zl4ITmOe0gubGVLQrZPEM(io.ktor.client.engine.HttpClientEngineBase httpClientEngineBase) {
        kotlin.coroutines.CoroutineContext plus = io.ktor.util.CoroutinesUtilsKt.SilentSupervisor$default(null, 1, null).plus(httpClientEngineBase.getDispatcher());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(httpClientEngineBase.getHighSpeedVideoFpsRangesFor);
        sb.append("-context");
        return plus.plus(new kotlinx.coroutines.CoroutineName(sb.toString()));
    }
}
