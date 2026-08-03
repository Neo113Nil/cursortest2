package H1;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f622g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, java.lang.Object obj, java.lang.Object obj2) {
        super(1);
        this.f620e = i2;
        this.f621f = obj;
        this.f622g = obj2;
    }

    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object hVar;
        B1.k kVar;
        h1.C0177i c0177i;
        h1.C0177i c0177i2;
        switch (this.f620e) {
            case 0:
                ((H1.c) this.f622g).getClass();
                ((H1.d) this.f621f).e(null);
                return h1.C0177i.f3302a;
            case 1:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H1.d.f625g;
                ((H1.c) this.f622g).getClass();
                H1.d dVar = (H1.d) this.f621f;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return h1.C0177i.f3302a;
            default:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                ((B1.p) this.f621f).invoke(th);
                F.C0014n c0014n = (F.C0014n) this.f622g;
                ((B1.c) c0014n.f500c).g(th, false);
                do {
                    B1.c cVar = (B1.c) c0014n.f500c;
                    cVar.getClass();
                    java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = B1.c.f11d;
                    long j2 = atomicLongFieldUpdater.get(cVar);
                    java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = B1.c.f10c;
                    long j3 = atomicLongFieldUpdater2.get(cVar);
                    if (cVar.r(j3, true)) {
                        hVar = new B1.h(cVar.m());
                    } else {
                        long j4 = j3 & 1152921504606846975L;
                        java.lang.Object obj2 = B1.j.f45a;
                        if (j2 < j4) {
                            java.lang.Object obj3 = B1.e.f32k;
                            B1.k kVar2 = (B1.k) B1.c.f15h.get(cVar);
                            for (boolean z2 = true; !cVar.r(atomicLongFieldUpdater2.get(cVar), z2); z2 = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                long j5 = B1.e.f23b;
                                java.lang.Object obj4 = obj2;
                                long j6 = andIncrement / j5;
                                int i2 = (int) (andIncrement % j5);
                                if (kVar2.f303c != j6) {
                                    B1.k l2 = cVar.l(j6, kVar2);
                                    if (l2 == null) {
                                        continue;
                                        obj2 = obj4;
                                    } else {
                                        kVar = l2;
                                    }
                                } else {
                                    kVar = kVar2;
                                }
                                java.lang.Object A2 = cVar.A(kVar, i2, andIncrement, obj3);
                                if (A2 == B1.e.f34m) {
                                    z1.l0 l0Var = obj3 instanceof z1.l0 ? (z1.l0) obj3 : null;
                                    if (l0Var != null) {
                                        l0Var.a(kVar, i2);
                                    }
                                    cVar.C(andIncrement);
                                    kVar.h();
                                    obj2 = obj4;
                                } else if (A2 == B1.e.f36o) {
                                    if (andIncrement < cVar.p()) {
                                        kVar.a();
                                    }
                                    kVar2 = kVar;
                                    obj2 = obj4;
                                } else {
                                    if (A2 == B1.e.f35n) {
                                        throw new java.lang.IllegalStateException("unexpected");
                                    }
                                    kVar.a();
                                    obj2 = A2;
                                }
                            }
                            hVar = new B1.h(cVar.m());
                        }
                        hVar = obj2;
                    }
                    c0177i = null;
                    if (hVar instanceof B1.i) {
                        hVar = null;
                    }
                    c0177i2 = h1.C0177i.f3302a;
                    if (hVar != null) {
                        F.L.f363e.invoke(hVar, th);
                        c0177i = c0177i2;
                    }
                } while (c0177i != null);
                return c0177i2;
        }
    }
}
