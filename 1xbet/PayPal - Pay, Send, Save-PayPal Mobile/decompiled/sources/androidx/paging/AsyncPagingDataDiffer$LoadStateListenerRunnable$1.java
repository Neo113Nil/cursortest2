package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1;", "Ljava/lang/Runnable;", "", "run", "()V", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/paging/CombinedLoadStates;", "loadState", "Ljava/util/concurrent/atomic/AtomicReference;", "getLoadState", "()Ljava/util/concurrent/atomic/AtomicReference;", "setLoadState", "(Ljava/util/concurrent/atomic/AtomicReference;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AsyncPagingDataDiffer$LoadStateListenerRunnable$1 implements java.lang.Runnable {
    final /* synthetic */ androidx.paging.AsyncPagingDataDiffer<T> getHighResolutionOutputSizeshNQ4ISI;
    private java.util.concurrent.atomic.AtomicReference<androidx.paging.CombinedLoadStates> loadState = new java.util.concurrent.atomic.AtomicReference<>(null);

    AsyncPagingDataDiffer$LoadStateListenerRunnable$1(androidx.paging.AsyncPagingDataDiffer<T> asyncPagingDataDiffer) {
        this.getHighResolutionOutputSizeshNQ4ISI = asyncPagingDataDiffer;
    }

    public final java.util.concurrent.atomic.AtomicReference<androidx.paging.CombinedLoadStates> getLoadState() {
        return this.loadState;
    }

    public final void setLoadState(java.util.concurrent.atomic.AtomicReference<androidx.paging.CombinedLoadStates> atomicReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        this.loadState = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        androidx.paging.CombinedLoadStates combinedLoadStates = this.loadState.get();
        if (combinedLoadStates != null) {
            copyOnWriteArrayList = ((androidx.paging.AsyncPagingDataDiffer) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizesFor;
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((kotlin.jvm.functions.Function1) it.next()).invoke(combinedLoadStates);
            }
        }
    }
}
