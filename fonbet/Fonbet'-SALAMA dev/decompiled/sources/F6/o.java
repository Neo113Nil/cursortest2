package F6;

import D6.AbstractC0109a;
import D6.C0120f0;
import D6.C0138v;
import D6.E;
import D6.l0;
import D6.s0;
import F2.W0;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class o extends AbstractC0109a implements p, f {

    /* renamed from: d, reason: collision with root package name */
    public final b f2831d;

    public o(InterfaceC1292i interfaceC1292i, b bVar) {
        super(interfaceC1292i, true);
        this.f2831d = bVar;
    }

    @Override // D6.AbstractC0109a
    public final void O(boolean z4, Throwable th) {
        if (this.f2831d.g(false, th) || z4) {
            return;
        }
        E.k(this.f1816c, th);
    }

    @Override // D6.AbstractC0109a
    public final void P(Object obj) {
        this.f2831d.g(false, null);
    }

    public final void R(n nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b bVar = this.f2831d;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f2789B;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, nVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(bVar);
            W0 w02 = d.f2815q;
            if (obj != w02) {
                if (obj == d.f2816r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            W0 w03 = d.f2816r;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, w02, w03)) {
                if (atomicReferenceFieldUpdater.get(bVar) != w02) {
                    break;
                }
            }
            nVar.invoke(bVar.l());
            return;
        }
    }

    @Override // F6.r
    public final Object a(InterfaceC1287d interfaceC1287d, Object obj) {
        return this.f2831d.a(interfaceC1287d, obj);
    }

    @Override // D6.s0, D6.InterfaceC0118e0
    public final void cancel(CancellationException cancellationException) {
        Object x4 = x();
        if (x4 instanceof C0138v) {
            return;
        }
        if ((x4 instanceof l0) && ((l0) x4).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0120f0(n(), null, this);
        }
        l(cancellationException);
    }

    @Override // F6.r
    public final Object e(Object obj) {
        return this.f2831d.e(obj);
    }

    @Override // D6.s0
    public final void l(CancellationException cancellationException) {
        CancellationException M7 = s0.M(this, cancellationException);
        this.f2831d.g(true, M7);
        k(M7);
    }
}
