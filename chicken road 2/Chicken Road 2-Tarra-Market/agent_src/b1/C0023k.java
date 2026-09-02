package b1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: b1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0023k {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f667b = AtomicIntegerFieldUpdater.newUpdater(C0023k.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f668a;

    public C0023k(Throwable th, boolean z2) {
        this.f668a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f668a + ']';
    }
}
