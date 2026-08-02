package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002"}, d2 = {"", "DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT", com.visa.cbp.getEncExpo.warmup}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConfigurationKt {
    public static final int DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT = 8;

    public static final /* synthetic */ java.util.concurrent.Executor access$asExecutor(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.coroutines.ContinuationInterceptor continuationInterceptor = coroutineContext != null ? (kotlin.coroutines.ContinuationInterceptor) coroutineContext.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE) : null;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = continuationInterceptor instanceof kotlinx.coroutines.CoroutineDispatcher ? (kotlinx.coroutines.CoroutineDispatcher) continuationInterceptor : null;
        if (coroutineDispatcher != null) {
            return kotlinx.coroutines.ExecutorsKt.asExecutor(coroutineDispatcher);
        }
        return null;
    }

    public static final /* synthetic */ java.util.concurrent.Executor access$createDefaultExecutor(final boolean z) {
        java.util.concurrent.ExecutorService newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(java.lang.Math.max(2, java.lang.Math.min(java.lang.Runtime.getRuntime().availableProcessors() - 1, 4)), new java.util.concurrent.ThreadFactory() { // from class: androidx.work.ConfigurationKt$createDefaultExecutor$factory$1
            private final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
                java.lang.String str = z ? "WM.task-" : "androidx.work-";
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(this.getHighSpeedVideoSizes.incrementAndGet());
                return new java.lang.Thread(runnable, sb.toString());
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "");
        return newFixedThreadPool;
    }

    public static final /* synthetic */ androidx.work.Tracer access$createDefaultTracer() {
        return new androidx.work.Tracer() { // from class: androidx.work.ConfigurationKt$createDefaultTracer$tracer$1
            @Override // androidx.work.Tracer
            public final boolean isEnabled() {
                return androidx.tracing.Trace.isEnabled();
            }

            @Override // androidx.work.Tracer
            public final void beginSection(java.lang.String label) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
                androidx.tracing.Trace.beginSection(label);
            }

            @Override // androidx.work.Tracer
            public final void endSection() {
                androidx.tracing.Trace.endSection();
            }

            @Override // androidx.work.Tracer
            public final void beginAsyncSection(java.lang.String methodName, int cookie) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "");
                androidx.tracing.Trace.beginAsyncSection(methodName, cookie);
            }

            @Override // androidx.work.Tracer
            public final void endAsyncSection(java.lang.String methodName, int cookie) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "");
                androidx.tracing.Trace.endAsyncSection(methodName, cookie);
            }
        };
    }
}
