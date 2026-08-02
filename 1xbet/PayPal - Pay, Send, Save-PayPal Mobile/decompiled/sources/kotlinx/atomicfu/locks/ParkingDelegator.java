package kotlinx.atomicfu.locks;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0004j\u0002`\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0015\u0010\u0014"}, d2 = {"Lkotlinx/atomicfu/locks/ParkingDelegator;", "", "<init>", "()V", "Ljava/lang/Thread;", "Lkotlinx/atomicfu/locks/Camera2StreamConfigurationMap;", "createRef", "()Ljava/lang/Thread;", "ref", "Lkotlin/Function0;", "", "shouldWait", "", "wait", "(Ljava/lang/Thread;Lkotlin/jvm/functions/Function0;)V", "", "nanos", "timedWait", "(Ljava/lang/Thread;JLkotlin/jvm/functions/Function0;)V", "wake", "(Ljava/lang/Thread;)V", "destroyRef"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ParkingDelegator {
    public static final kotlinx.atomicfu.locks.ParkingDelegator INSTANCE = new kotlinx.atomicfu.locks.ParkingDelegator();

    private ParkingDelegator() {
    }

    public final java.lang.Thread createRef() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentThread, "");
        return currentThread;
    }

    public final void wait(java.lang.Thread ref, kotlin.jvm.functions.Function0<java.lang.Boolean> shouldWait) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ref, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shouldWait, "");
        java.util.concurrent.locks.LockSupport.park();
    }

    public final void timedWait(java.lang.Thread ref, long nanos, kotlin.jvm.functions.Function0<java.lang.Boolean> shouldWait) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ref, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shouldWait, "");
        java.util.concurrent.locks.LockSupport.parkNanos(nanos);
    }

    public final void wake(java.lang.Thread ref) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ref, "");
        java.util.concurrent.locks.LockSupport.unpark(ref);
    }

    public final void destroyRef(java.lang.Thread ref) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ref, "");
    }
}
