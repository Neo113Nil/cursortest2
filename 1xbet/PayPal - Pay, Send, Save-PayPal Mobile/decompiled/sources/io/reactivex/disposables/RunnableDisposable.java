package io.reactivex.disposables;

/* loaded from: classes17.dex */
final class RunnableDisposable extends io.reactivex.disposables.ReferenceDisposable<java.lang.Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    @Override // io.reactivex.disposables.ReferenceDisposable
    protected final /* synthetic */ void getHighSpeedVideoSizes(java.lang.Runnable runnable) {
        runnable.run();
    }

    RunnableDisposable(java.lang.Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RunnableDisposable(disposed=");
        sb.append(isDisposed());
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }
}
