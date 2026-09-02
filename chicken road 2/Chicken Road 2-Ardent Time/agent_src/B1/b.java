package B1;

/* loaded from: classes.dex */
public final class b implements z1.l0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f7a = B1.e.f37p;

    /* renamed from: b, reason: collision with root package name */
    public z1.C1053f f8b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B1.c f9c;

    public b(B1.c cVar) {
        this.f9c = cVar;
    }

    @Override // z1.l0
    public final void a(E1.u uVar, int i2) {
        z1.C1053f c1053f = this.f8b;
        if (c1053f != null) {
            c1053f.a(uVar, i2);
        }
    }

    public final java.lang.Object b(C1.f fVar) {
        z1.C1053f c1053f;
        java.lang.Boolean bool;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B1.c.f15h;
        B1.c cVar = this.f9c;
        B1.k kVar = (B1.k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.r(B1.c.f10c.get(cVar), true)) {
                this.f7a = B1.e.f33l;
                java.lang.Throwable m2 = cVar.m();
                if (m2 == null) {
                    return java.lang.Boolean.FALSE;
                }
                int i2 = E1.v.f304a;
                throw m2;
            }
            long andIncrement = B1.c.f11d.getAndIncrement(cVar);
            long j2 = B1.e.f23b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (kVar.f303c != j3) {
                B1.k l2 = cVar.l(j3, kVar);
                if (l2 == null) {
                    continue;
                } else {
                    kVar = l2;
                }
            }
            java.lang.Object A2 = cVar.A(kVar, i3, andIncrement, null);
            C.j jVar = B1.e.f34m;
            if (A2 == jVar) {
                throw new java.lang.IllegalStateException("unreachable");
            }
            C.j jVar2 = B1.e.f36o;
            if (A2 == jVar2) {
                if (andIncrement < cVar.p()) {
                    kVar.a();
                }
            } else {
                if (A2 != B1.e.f35n) {
                    kVar.a();
                    this.f7a = A2;
                    return java.lang.Boolean.TRUE;
                }
                B1.c cVar2 = this.f9c;
                z1.C1053f c2 = z1.AbstractC1068v.c(u0.AbstractC0995a.o(fVar));
                try {
                    this.f8b = c2;
                    c1053f = c2;
                    try {
                        java.lang.Object A3 = cVar2.A(kVar, i3, andIncrement, this);
                        if (A3 == jVar) {
                            a(kVar, i3);
                        } else {
                            E1.p pVar = null;
                            k1.i iVar = c1053f.f8567e;
                            s1.l lVar = cVar2.f20b;
                            if (A3 == jVar2) {
                                if (andIncrement < cVar2.p()) {
                                    kVar.a();
                                }
                                B1.k kVar2 = (B1.k) B1.c.f15h.get(cVar2);
                                while (true) {
                                    if (cVar2.r(B1.c.f10c.get(cVar2), true)) {
                                        z1.C1053f c1053f2 = this.f8b;
                                        kotlin.jvm.internal.i.b(c1053f2);
                                        this.f8b = null;
                                        this.f7a = B1.e.f33l;
                                        java.lang.Throwable m3 = cVar.m();
                                        if (m3 == null) {
                                            c1053f2.l(java.lang.Boolean.FALSE);
                                        } else {
                                            c1053f2.l(a.AbstractC0059a.i(m3));
                                        }
                                    } else {
                                        long andIncrement2 = B1.c.f11d.getAndIncrement(cVar2);
                                        long j4 = B1.e.f23b;
                                        long j5 = andIncrement2 / j4;
                                        int i4 = (int) (andIncrement2 % j4);
                                        if (kVar2.f303c != j5) {
                                            B1.k l3 = cVar2.l(j5, kVar2);
                                            if (l3 != null) {
                                                kVar2 = l3;
                                            }
                                        }
                                        s1.l lVar2 = lVar;
                                        java.lang.Object A4 = cVar2.A(kVar2, i4, andIncrement2, this);
                                        if (A4 == B1.e.f34m) {
                                            a(kVar2, i4);
                                            break;
                                        }
                                        if (A4 == B1.e.f36o) {
                                            if (andIncrement2 < cVar2.p()) {
                                                kVar2.a();
                                            }
                                            lVar = lVar2;
                                        } else {
                                            if (A4 == B1.e.f35n) {
                                                throw new java.lang.IllegalStateException("unexpected");
                                            }
                                            kVar2.a();
                                            this.f7a = A4;
                                            this.f8b = null;
                                            bool = java.lang.Boolean.TRUE;
                                            if (lVar2 != null) {
                                                pVar = new E1.p(lVar2, A4, iVar);
                                            }
                                        }
                                    }
                                }
                            } else {
                                kVar.a();
                                this.f7a = A3;
                                this.f8b = null;
                                bool = java.lang.Boolean.TRUE;
                                if (lVar != null) {
                                    pVar = new E1.p(lVar, A3, iVar);
                                }
                            }
                            c1053f.d(bool, pVar);
                        }
                        return c1053f.t();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        c1053f.A();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c1053f = c2;
                }
            }
        }
    }
}
