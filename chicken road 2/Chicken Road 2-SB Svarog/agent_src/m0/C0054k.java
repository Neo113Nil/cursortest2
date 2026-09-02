package m0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: m0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0054k {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f933b = AtomicIntegerFieldUpdater.newUpdater(C0054k.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f934a;

    public C0054k(Throwable th, boolean z2) {
        this.f934a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f934a + ']';
    }
}
