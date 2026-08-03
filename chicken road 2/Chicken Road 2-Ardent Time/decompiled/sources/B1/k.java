package B1;

/* loaded from: classes.dex */
public final class k extends E1.u {

    /* renamed from: e, reason: collision with root package name */
    public final B1.c f46e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceArray f47f;

    public k(long j2, B1.k kVar, B1.c cVar, int i2) {
        super(j2, kVar, i2);
        this.f46e = cVar;
        this.f47f = new java.util.concurrent.atomic.AtomicReferenceArray(B1.e.f23b * 2);
    }

    @Override // E1.u
    public final int f() {
        return B1.e.f23b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        kotlin.jvm.internal.i.b(r4);
        r7 = r4.f20b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        r7 = E1.AbstractC0000a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        z1.AbstractC1068v.d(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    @Override // E1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, k1.i iVar) {
        E1.A a2;
        int i3 = B1.e.f23b;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        java.lang.Object obj = this.f47f.get(i2 * 2);
        while (true) {
            java.lang.Object k2 = k(i2);
            boolean z3 = k2 instanceof z1.l0;
            B1.c cVar = this.f46e;
            if (z3 || (k2 instanceof B1.u)) {
                if (j(i2, k2, z2 ? B1.e.f31j : B1.e.f32k)) {
                    m(i2, null);
                    l(i2, !z2);
                    if (z2) {
                        kotlin.jvm.internal.i.b(cVar);
                        s1.l lVar = cVar.f20b;
                        if (lVar == null || (a2 = E1.AbstractC0000a.a(lVar, obj, null)) == null) {
                            return;
                        }
                        z1.AbstractC1068v.d(a2, iVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == B1.e.f31j || k2 == B1.e.f32k) {
                    break;
                }
                if (k2 != B1.e.f28g && k2 != B1.e.f27f) {
                    if (k2 == B1.e.f30i || k2 == B1.e.f25d || k2 == B1.e.f33l) {
                        return;
                    }
                    throw new java.lang.IllegalStateException(("unexpected state: " + k2).toString());
                }
            }
        }
    }

    public final boolean j(int i2, java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f47f;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.Object k(int i2) {
        return this.f47f.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        if (z2) {
            B1.c cVar = this.f46e;
            kotlin.jvm.internal.i.b(cVar);
            cVar.C((this.f303c * B1.e.f23b) + i2);
        }
        h();
    }

    public final void m(int i2, java.lang.Object obj) {
        this.f47f.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, C.j jVar) {
        this.f47f.set((i2 * 2) + 1, jVar);
    }
}
