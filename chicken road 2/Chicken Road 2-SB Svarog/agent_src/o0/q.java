package o0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.AbstractC0044a;
import m0.AbstractC0062t;
import m0.C0054k;
import m0.L;
import m0.Q;

/* loaded from: classes.dex */
public final class q extends AbstractC0044a implements r, g {

    /* renamed from: e, reason: collision with root package name */
    public final c f1096e;

    public q(Y.i iVar, c cVar) {
        super(iVar, true);
        this.f1096e = cVar;
    }

    @Override // m0.AbstractC0044a
    public final void K(Throwable th, boolean z2) {
        if (this.f1096e.e(th, false) || z2) {
            return;
        }
        AbstractC0062t.c(this.f915d, th);
    }

    @Override // m0.AbstractC0044a
    public final void L(Object obj) {
        this.f1096e.e(null, false);
    }

    public final void N(p pVar) {
        c cVar = this.f1096e;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f1062k;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, pVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    io.flutter.plugin.platform.i iVar = e.f1081q;
                    if (obj != iVar) {
                        if (obj == e.f1082r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    io.flutter.plugin.platform.i iVar2 = e.f1082r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, iVar, iVar2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != iVar) {
                            break;
                        }
                    }
                    pVar.i(cVar.k());
                    return;
                }
            }
        }
    }

    @Override // m0.T, m0.K
    public final void a(CancellationException cancellationException) {
        Object y2 = y();
        if (y2 instanceof C0054k) {
            return;
        }
        if ((y2 instanceof Q) && ((Q) y2).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new L(r(), null, this);
        }
        p(cancellationException);
    }

    @Override // o0.t
    public final Object i(Object obj) {
        return this.f1096e.i(obj);
    }

    @Override // m0.T
    public final void p(CancellationException cancellationException) {
        this.f1096e.e(cancellationException, true);
        o(cancellationException);
    }
}
