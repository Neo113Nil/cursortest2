package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes5.dex */
public final class CancellableSimpleLock extends kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock {
    private final kotlin.jvm.functions.Function1<java.lang.InterruptedException, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    private final java.lang.Runnable getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancellableSimpleLock(java.util.concurrent.locks.Lock lock, java.lang.Runnable runnable, kotlin.jvm.functions.Function1<? super java.lang.InterruptedException, kotlin.Unit> function1) {
        super(lock);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = runnable;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CancellableSimpleLock(java.lang.Runnable runnable, kotlin.jvm.functions.Function1<? super java.lang.InterruptedException, kotlin.Unit> function1) {
        this(new java.util.concurrent.locks.ReentrantLock(), runnable, function1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock, kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public final void lock() {
        while (!getLock().tryLock(50L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            try {
                this.getHighSpeedVideoSizes.run();
            } catch (java.lang.InterruptedException e) {
                this.getHighSpeedVideoFpsRangesFor.invoke(e);
                return;
            }
        }
    }
}
