package m0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class J extends M {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f895g = AtomicIntegerFieldUpdater.newUpdater(J.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: f, reason: collision with root package name */
    public final f0.l f896f;

    public J(f0.l lVar) {
        this.f896f = lVar;
    }

    @Override // f0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return W.g.f394a;
    }

    @Override // m0.O
    public final void o(Throwable th) {
        if (f895g.compareAndSet(this, 0, 1)) {
            this.f896f.i(th);
        }
    }
}
