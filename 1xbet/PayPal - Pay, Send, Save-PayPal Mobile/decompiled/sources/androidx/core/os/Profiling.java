package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\u0004\u0010\u000b\u001a#\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroid/content/Context;", "context", "Lkotlinx/coroutines/flow/Flow;", "Landroid/os/ProfilingResult;", "registerForAllProfilingResults", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/Flow;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/Consumer;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V", "unregisterForAllProfilingResults", "(Landroid/content/Context;Ljava/util/function/Consumer;)V", "Landroidx/core/os/ProfilingRequest;", "profilingRequest", "requestProfiling", "(Landroid/content/Context;Landroidx/core/os/ProfilingRequest;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Profiling {
    public static final kotlinx.coroutines.flow.Flow<android.os.ProfilingResult> registerForAllProfilingResults(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.core.os.Profiling$registerForAllProfilingResults$1(context, null));
    }

    public static final void registerForAllProfilingResults(android.content.Context context, java.util.concurrent.Executor executor, java.util.function.Consumer<android.os.ProfilingResult> consumer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumer, "");
        ((android.os.ProfilingManager) context.getSystemService(android.os.ProfilingManager.class)).registerForAllProfilingResults(executor, consumer);
    }

    public static final void unregisterForAllProfilingResults(android.content.Context context, java.util.function.Consumer<android.os.ProfilingResult> consumer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumer, "");
        ((android.os.ProfilingManager) context.getSystemService(android.os.ProfilingManager.class)).unregisterForAllProfilingResults(consumer);
    }

    public static final void requestProfiling(android.content.Context context, androidx.core.os.ProfilingRequest profilingRequest, java.util.concurrent.Executor executor, java.util.function.Consumer<android.os.ProfilingResult> consumer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilingRequest, "");
        ((android.os.ProfilingManager) context.getSystemService(android.os.ProfilingManager.class)).requestProfiling(profilingRequest.getProfilingType(), profilingRequest.getParams(), profilingRequest.getTag(), profilingRequest.getCancellationSignal(), executor, consumer);
    }
}
