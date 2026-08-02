package androidx.core.util;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/core/util/ContinuationRunnable;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/coroutines/Continuation;", "", "p0", "<init>", "(Lkotlin/coroutines/Continuation;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/coroutines/Continuation;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ContinuationRunnable extends java.util.concurrent.atomic.AtomicBoolean implements java.lang.Runnable {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.coroutines.Continuation<kotlin.Unit> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        super(false);
        this.Camera2StreamConfigurationMap = continuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.Continuation<kotlin.Unit> continuation = this.Camera2StreamConfigurationMap;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContinuationRunnable(ran = ");
        sb.append(get());
        sb.append(')');
        return sb.toString();
    }
}
