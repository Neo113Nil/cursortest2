package p4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: p4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2275o {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18811b = AtomicIntegerFieldUpdater.newUpdater(C2275o.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f18812a;

    public C2275o(Throwable th, boolean z3) {
        this.f18812a = th;
        this._handled$volatile = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f18812a + ']';
    }
}
