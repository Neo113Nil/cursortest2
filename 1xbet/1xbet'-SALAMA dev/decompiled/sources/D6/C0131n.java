package D6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: D6.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0131n extends C0138v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1859c = AtomicIntegerFieldUpdater.newUpdater(C0131n.class, "_resumed");
    private volatile int _resumed;

    public C0131n(C0130m c0130m, Throwable th, boolean z4) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0130m + " was cancelled normally");
        }
        super(z4, th);
        this._resumed = 0;
    }
}
