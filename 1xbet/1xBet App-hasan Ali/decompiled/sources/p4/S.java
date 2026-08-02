package p4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class S extends X {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18762p = AtomicIntegerFieldUpdater.newUpdater(S.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: o, reason: collision with root package name */
    public final E.q0 f18763o;

    public S(E.q0 q0Var) {
        this.f18763o = q0Var;
    }

    @Override // p4.X
    public final boolean k() {
        return true;
    }

    @Override // p4.X
    public final void l(Throwable th) {
        if (f18762p.compareAndSet(this, 0, 1)) {
            this.f18763o.c(th);
        }
    }
}
