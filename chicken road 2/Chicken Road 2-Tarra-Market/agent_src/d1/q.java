package d1;

import b1.AbstractC0013a;
import b1.AbstractC0030s;
import b1.C0023k;
import b1.K;
import b1.P;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class q extends AbstractC0013a implements r, g {

    /* renamed from: d, reason: collision with root package name */
    public final c f948d;

    public q(M0.i iVar, c cVar) {
        super(iVar, true);
        this.f948d = cVar;
    }

    @Override // b1.AbstractC0013a
    public final void J(Throwable th, boolean z2) {
        if (this.f948d.f(th, false) || z2) {
            return;
        }
        AbstractC0030s.c(this.f650c, th);
    }

    @Override // b1.AbstractC0013a
    public final void K(Object obj) {
        this.f948d.f(null, false);
    }

    public final void M(p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar = this.f948d;
        cVar.getClass();
        do {
            atomicReferenceFieldUpdater = c.f912k;
            if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, pVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(cVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(cVar);
            C0.a aVar = e.f932q;
            if (obj != aVar) {
                if (obj == e.f933r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            C0.a aVar2 = e.f933r;
            while (!atomicReferenceFieldUpdater.compareAndSet(cVar, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(cVar) != aVar) {
                    break;
                }
            }
            pVar.invoke(cVar.k());
            return;
        }
    }

    @Override // b1.S, b1.J
    public final void a(CancellationException cancellationException) {
        Object x2 = x();
        if (x2 instanceof C0023k) {
            return;
        }
        if ((x2 instanceof P) && ((P) x2).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new K(q(), null, this);
        }
        o(cancellationException);
    }

    @Override // d1.t
    public final Object d(Object obj) {
        return this.f948d.d(obj);
    }

    @Override // b1.S
    public final void o(CancellationException cancellationException) {
        this.f948d.f(cancellationException, true);
        n(cancellationException);
    }
}
