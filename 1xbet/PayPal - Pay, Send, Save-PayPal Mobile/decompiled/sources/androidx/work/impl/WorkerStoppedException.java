package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/work/impl/WorkerStoppedException;", "Ljava/util/concurrent/CancellationException;", "", "reason", "<init>", "(I)V", com.visa.cbp.getEncExpo.warmup, "getReason", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkerStoppedException extends java.util.concurrent.CancellationException {
    private final int reason;

    public WorkerStoppedException(int i) {
        this.reason = i;
    }

    public final int getReason() {
        return this.reason;
    }
}
