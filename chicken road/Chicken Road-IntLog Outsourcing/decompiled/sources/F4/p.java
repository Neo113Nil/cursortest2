package F4;

import D4.AbstractC0001a;
import D4.AbstractC0024y;
import D4.C0016p;
import D4.Y;
import D4.e0;
import G0.C0051a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public final class p extends AbstractC0001a implements q, f {

    /* renamed from: d, reason: collision with root package name */
    public final b f739d;

    public p(InterfaceC1223i interfaceC1223i, b bVar) {
        super(interfaceC1223i, true);
        this.f739d = bVar;
    }

    @Override // D4.AbstractC0001a
    public final void W(Throwable th, boolean z) {
        if (this.f739d.g(th, false) || z) {
            return;
        }
        AbstractC0024y.j(th, this.f486c);
    }

    @Override // D4.AbstractC0001a
    public final void X(Object obj) {
        this.f739d.g(null, false);
    }

    public final void Z(o oVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b bVar = this.f739d;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f702k;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, oVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(bVar);
            C0051a c0051a = d.f722q;
            if (obj != c0051a) {
                if (obj == d.f723r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            C0051a c0051a2 = d.f723r;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, c0051a, c0051a2)) {
                if (atomicReferenceFieldUpdater.get(bVar) != c0051a) {
                    break;
                }
            }
            oVar.invoke(bVar.n());
            return;
        }
    }

    @Override // D4.g0, D4.X
    public final void b(CancellationException cancellationException) {
        Object D5 = D();
        if (D5 instanceof C0016p) {
            return;
        }
        if ((D5 instanceof e0) && ((e0) D5).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Y(s(), null, this);
        }
        p(cancellationException);
    }

    @Override // F4.r
    public final Object e(InterfaceC1218d interfaceC1218d) {
        return this.f739d.e(interfaceC1218d);
    }

    @Override // F4.s
    public final Object h(Object obj) {
        return this.f739d.h(obj);
    }

    @Override // F4.s
    public final Object i(Object obj, InterfaceC1218d interfaceC1218d) {
        return this.f739d.i(obj, interfaceC1218d);
    }

    @Override // D4.g0
    public final void p(CancellationException cancellationException) {
        this.f739d.g(cancellationException, true);
        n(cancellationException);
    }
}
