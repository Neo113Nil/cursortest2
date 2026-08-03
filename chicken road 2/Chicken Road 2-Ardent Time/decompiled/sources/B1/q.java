package B1;

/* loaded from: classes.dex */
public final class q extends z1.AbstractC1048a implements B1.r, B1.g {

    /* renamed from: d, reason: collision with root package name */
    public final B1.c f55d;

    public q(k1.i iVar, B1.c cVar) {
        super(iVar, true);
        this.f55d = cVar;
    }

    @Override // z1.AbstractC1048a
    public final void T(java.lang.Throwable th, boolean z2) {
        if (this.f55d.g(th, false) || z2) {
            return;
        }
        z1.AbstractC1068v.d(th, this.f8557c);
    }

    @Override // z1.AbstractC1048a
    public final void U(java.lang.Object obj) {
        this.f55d.g(null, false);
    }

    public final void W(B1.p pVar) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        B1.c cVar = this.f55d;
        cVar.getClass();
        do {
            atomicReferenceFieldUpdater = B1.c.f18k;
            if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, pVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(cVar) == null);
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(cVar);
            C.j jVar = B1.e.f38q;
            if (obj != jVar) {
                if (obj == B1.e.f39r) {
                    throw new java.lang.IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new java.lang.IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            C.j jVar2 = B1.e.f39r;
            while (!atomicReferenceFieldUpdater.compareAndSet(cVar, jVar, jVar2)) {
                if (atomicReferenceFieldUpdater.get(cVar) != jVar) {
                    break;
                }
            }
            pVar.invoke(cVar.m());
            return;
        }
    }

    @Override // z1.Z, z1.P, B1.s
    public final void a(java.util.concurrent.CancellationException cancellationException) {
        java.lang.Object D2 = D();
        if (D2 instanceof z1.C1061n) {
            return;
        }
        if ((D2 instanceof z1.X) && ((z1.X) D2).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new z1.Q(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // B1.t
    public final java.lang.Object e(java.lang.Object obj, k1.d dVar) {
        return this.f55d.e(obj, dVar);
    }

    @Override // B1.t
    public final java.lang.Object h(java.lang.Object obj) {
        return this.f55d.h(obj);
    }

    @Override // z1.Z
    public final void s(java.util.concurrent.CancellationException cancellationException) {
        this.f55d.g(cancellationException, true);
        r(cancellationException);
    }
}
