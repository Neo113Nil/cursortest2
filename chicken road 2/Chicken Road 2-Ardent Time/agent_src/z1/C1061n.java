package z1;

/* renamed from: z1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1061n {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8580b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(z1.C1061n.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f8581a;

    public C1061n(java.lang.Throwable th, boolean z2) {
        this.f8581a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + '[' + this.f8581a + ']';
    }
}
