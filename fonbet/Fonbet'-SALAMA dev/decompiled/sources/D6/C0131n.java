package D6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: D6.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0131n extends C0138v {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1859c = AtomicIntegerFieldUpdater.newUpdater(C0131n.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0131n(C0130m c0130m, Throwable th, boolean z4) {
        super(z4, th);
        if (th == null) {
            th = new CancellationException("Continuation " + c0130m + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
