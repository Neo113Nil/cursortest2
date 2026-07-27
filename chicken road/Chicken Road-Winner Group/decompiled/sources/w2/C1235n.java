package w2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: w2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1235n {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10516b = AtomicIntegerFieldUpdater.newUpdater(C1235n.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f10517a;

    public C1235n(Throwable th, boolean z3) {
        this.f10517a = th;
        this._handled = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f10517a + ']';
    }
}
