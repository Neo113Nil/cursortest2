package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\t\u0010\u0004\u001a\u00020\u0005X\u0082\u0004R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/ThreadState;", "Lkotlinx/coroutines/JobNode;", "<init>", "()V", "_state", "Lkotlinx/atomicfu/AtomicInt;", "targetThread", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "Ljava/lang/Thread;", "cancelHandle", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "", "getOnCancelling", "()Z", "setup", "", "job", "Lkotlinx/coroutines/Job;", "clearInterrupt", "invoke", "cause", "", "invalidState", "", "state", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ThreadState extends kotlinx.coroutines.JobNode {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.ThreadState.class, "_state$volatile");
    private final java.lang.Thread Camera2StreamConfigurationMap = java.lang.Thread.currentThread();
    private volatile /* synthetic */ int _state$volatile;
    kotlinx.coroutines.DisposableHandle getHighSpeedVideoFpsRangesFor;

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return true;
    }

    static java.lang.Void getHighSpeedVideoFpsRangesFor(int i) {
        throw new java.lang.IllegalStateException("Illegal state ".concat(java.lang.String.valueOf(i)).toString());
    }

    public final void getHighResolutionOutputSizeshNQ4ISI() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = getHighSpeedVideoFpsRanges;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("Illegal state ".concat(java.lang.String.valueOf(i)).toString());
                    }
                    java.lang.Thread.interrupted();
                    return;
                }
            } else if (getHighSpeedVideoFpsRanges.compareAndSet(this, i, 1)) {
                kotlinx.coroutines.DisposableHandle disposableHandle = this.getHighSpeedVideoFpsRangesFor;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                    return;
                }
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(java.lang.Throwable cause) {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = getHighSpeedVideoFpsRanges;
        do {
            i = atomicIntegerFieldUpdater2.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    throw new java.lang.IllegalStateException("Illegal state ".concat(java.lang.String.valueOf(i)).toString());
                }
                return;
            }
            atomicIntegerFieldUpdater = getHighSpeedVideoFpsRanges;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.Camera2StreamConfigurationMap.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }
}
