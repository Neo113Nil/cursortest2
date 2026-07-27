package D4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: D4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0016p {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f525b = AtomicIntegerFieldUpdater.newUpdater(C0016p.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f526a;

    public C0016p(Throwable th, boolean z) {
        this.f526a = th;
        this._handled = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f526a + ']';
    }
}
