package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0003\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/coroutines/DispatcherExecutor;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "p0", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class DispatcherExecutor implements java.util.concurrent.Executor {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;

    public DispatcherExecutor(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable p0) {
        if (kotlinx.coroutines.internal.DispatchedContinuationKt.safeIsDispatchNeeded(this.getHighSpeedVideoFpsRanges, kotlin.coroutines.EmptyCoroutineContext.INSTANCE)) {
            kotlinx.coroutines.internal.DispatchedContinuationKt.safeDispatch(this.getHighSpeedVideoFpsRanges, kotlin.coroutines.EmptyCoroutineContext.INSTANCE, p0);
        } else {
            p0.run();
        }
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges.toString();
    }
}
