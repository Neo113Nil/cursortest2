package F6;

import D6.AbstractC0109a;
import D6.C0120f0;
import D6.C0138v;
import D6.E;
import D6.l0;
import D6.s0;
import F2.W0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends AbstractC0109a implements p, f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f2831d;

    public o(p065i6.i iVar, b bVar) {
        super(iVar, true);
        this.f2831d = bVar;
    }

    @Override // D6.AbstractC0109a
    public final void O(boolean z4, Throwable th) throws IllegalAccessException, InvocationTargetException {
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
            W0 w7 = d.f2815q;
            if (obj != w7) {
                if (obj == d.f2816r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            W0 w8 = d.f2816r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(bVar, w7, w8)) {
                    nVar.invoke(bVar.l());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(bVar) == w7);
        }
    }

    @Override // F6.r
    public final Object a(p065i6.d dVar, Object obj) {
        return this.f2831d.a(dVar, obj);
    }

    @Override // D6.s0, D6.InterfaceC0118e0
    public final void cancel(CancellationException cancellationException) {
        Object objX = x();
        if (objX instanceof C0138v) {
            return;
        }
        if ((objX instanceof l0) && ((l0) objX).d()) {
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
        CancellationException cancellationExceptionM = s0.M(this, cancellationException);
        this.f2831d.g(true, cancellationExceptionM);
        k(cancellationExceptionM);
    }
}
