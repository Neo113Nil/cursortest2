package kotlinx.coroutines.scheduling;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/coroutines/scheduling/UnlimitedIoScheduler;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "p0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "p1", "", "dispatchYield", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatch", "", "", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/CoroutineDispatcher;", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class UnlimitedIoScheduler extends kotlinx.coroutines.CoroutineDispatcher {
    public static final kotlinx.coroutines.scheduling.UnlimitedIoScheduler INSTANCE = new kotlinx.coroutines.scheduling.UnlimitedIoScheduler();

    private UnlimitedIoScheduler() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(kotlin.coroutines.CoroutineContext p0, java.lang.Runnable p1) {
        kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE.dispatchWithContext$kotlinx_coroutines_core(p1, true, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(kotlin.coroutines.CoroutineContext p0, java.lang.Runnable p1) {
        kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE.dispatchWithContext$kotlinx_coroutines_core(p1, true, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int p0, java.lang.String p1) {
        kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(p0);
        if (p0 >= kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE) {
            return kotlinx.coroutines.internal.LimitedDispatcherKt.namedOrThis(this, p1);
        }
        return super.limitedParallelism(p0, p1);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: toString */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return "Dispatchers.IO";
    }
}
