package D6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: D6.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0138v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1881b = AtomicIntegerFieldUpdater.newUpdater(C0138v.class, "_handled");
    private volatile int _handled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f1882a;

    public C0138v(boolean z4, Throwable th) {
        this.f1882a = th;
        this._handled = z4 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f1882a + ']';
    }
}
