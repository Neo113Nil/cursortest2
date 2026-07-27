package w2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: w2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1228g extends C1235n {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10504c = AtomicIntegerFieldUpdater.newUpdater(C1228g.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1228g(C1227f c1227f, Throwable th, boolean z3) {
        super(th, z3);
        if (th == null) {
            th = new CancellationException("Continuation " + c1227f + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
