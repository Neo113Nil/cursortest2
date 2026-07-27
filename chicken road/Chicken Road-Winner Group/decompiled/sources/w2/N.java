package w2;

import d2.C0279i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class N extends S {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(N.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final o2.l f10475e;

    public N(o2.l lVar) {
        this.f10475e = lVar;
    }

    @Override // o2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return C0279i.f4852a;
    }

    @Override // w2.U
    public final void j(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.f10475e.invoke(th);
        }
    }
}
