package y2;

import B2.v;
import g2.InterfaceC0319c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w2.AbstractC1222a;
import w2.AbstractC1242v;
import w2.C1235n;
import w2.Q;
import w2.X;

/* loaded from: classes.dex */
public final class n extends AbstractC1222a implements o, f {

    /* renamed from: d, reason: collision with root package name */
    public final b f10628d;

    public n(g2.h hVar, b bVar) {
        super(hVar, true);
        this.f10628d = bVar;
    }

    @Override // w2.AbstractC1222a
    public final void S(Throwable th, boolean z3) {
        if (this.f10628d.f(th, false) || z3) {
            return;
        }
        AbstractC1242v.e(this.f10494c, th);
    }

    @Override // w2.AbstractC1222a
    public final void T(Object obj) {
        this.f10628d.f(null, false);
    }

    public final void V(E2.g gVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b bVar = this.f10628d;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f10598j;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, gVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(bVar);
            v vVar = d.f10616q;
            if (obj != vVar) {
                if (obj == d.f10617r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            v vVar2 = d.f10617r;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, vVar, vVar2)) {
                if (atomicReferenceFieldUpdater.get(bVar) != vVar) {
                    break;
                }
            }
            gVar.invoke(bVar.m());
            return;
        }
    }

    @Override // w2.Z, w2.P
    public final void b(CancellationException cancellationException) {
        Object C2 = C();
        if (C2 instanceof C1235n) {
            return;
        }
        if ((C2 instanceof X) && ((X) C2).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Q(t(), null, this);
        }
        r(cancellationException);
    }

    @Override // y2.q
    public final Object j(Object obj) {
        return this.f10628d.j(obj);
    }

    @Override // y2.q
    public final Object l(InterfaceC0319c interfaceC0319c, Object obj) {
        return this.f10628d.l(interfaceC0319c, obj);
    }

    @Override // w2.Z
    public final void r(CancellationException cancellationException) {
        this.f10628d.f(cancellationException, true);
        q(cancellationException);
    }
}
