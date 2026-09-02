package B1;

/* loaded from: classes.dex */
public class c implements B1.g {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f10c = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(B1.c.class, "sendersAndCloseStatus");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f11d = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(B1.c.class, "receivers");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f12e = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(B1.c.class, "bufferEnd");

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f13f = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(B1.c.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f14g = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(B1.c.class, java.lang.Object.class, "sendSegment");

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f15h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(B1.c.class, java.lang.Object.class, "receiveSegment");

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f16i = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(B1.c.class, java.lang.Object.class, "bufferEndSegment");

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f17j = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(B1.c.class, java.lang.Object.class, "_closeCause");

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f18k = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(B1.c.class, java.lang.Object.class, "closeHandler");
    private volatile java.lang.Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    public final int f19a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.l f20b;
    private volatile long bufferEnd;
    private volatile java.lang.Object bufferEndSegment;
    private volatile java.lang.Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile java.lang.Object receiveSegment;
    private volatile long receivers;
    private volatile java.lang.Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public c(int i2, s1.l lVar) {
        this.f19a = i2;
        this.f20b = lVar;
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException(B1.a.g(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        B1.k kVar = B1.e.f22a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f12e.get(this);
        B1.k kVar2 = new B1.k(0L, null, this, 3);
        this.sendSegment = kVar2;
        this.receiveSegment = kVar2;
        if (u()) {
            kVar2 = B1.e.f22a;
            kotlin.jvm.internal.i.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = kVar2;
        this._closeCause = B1.e.f40s;
    }

    public static final B1.k b(B1.c cVar, long j2, B1.k kVar) {
        java.lang.Object b2;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        cVar.getClass();
        B1.k kVar2 = B1.e.f22a;
        B1.d dVar = B1.d.f21a;
        loop0: while (true) {
            b2 = E1.AbstractC0000a.b(kVar, j2, dVar);
            if (!E1.AbstractC0000a.e(b2)) {
                E1.u c2 = E1.AbstractC0000a.c(b2);
                while (true) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14g;
                    E1.u uVar = (E1.u) atomicReferenceFieldUpdater.get(cVar);
                    if (uVar.f303c >= c2.f303c) {
                        break loop0;
                    }
                    if (!c2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, uVar, c2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != uVar) {
                            if (c2.e()) {
                                c2.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean e2 = E1.AbstractC0000a.e(b2);
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = f11d;
        if (e2) {
            cVar.s();
            if (kVar.f303c * B1.e.f23b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar.a();
            return null;
        }
        B1.k kVar3 = (B1.k) E1.AbstractC0000a.c(b2);
        long j5 = kVar3.f303c;
        if (j5 <= j2) {
            return kVar3;
        }
        long j6 = B1.e.f23b * j5;
        do {
            atomicLongFieldUpdater = f10c;
            j3 = atomicLongFieldUpdater.get(cVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * B1.e.f23b >= atomicLongFieldUpdater2.get(cVar)) {
            return null;
        }
        kVar3.a();
        return null;
    }

    public static final void c(B1.c cVar, java.lang.Object obj, z1.C1053f c1053f) {
        E1.A a2;
        s1.l lVar = cVar.f20b;
        if (lVar != null && (a2 = E1.AbstractC0000a.a(lVar, obj, null)) != null) {
            z1.AbstractC1068v.d(a2, c1053f.f8567e);
        }
        c1053f.l(a.AbstractC0059a.i(cVar.o()));
    }

    public static final int d(B1.c cVar, B1.k kVar, int i2, java.lang.Object obj, long j2, java.lang.Object obj2, boolean z2) {
        cVar.getClass();
        kVar.m(i2, obj);
        if (z2) {
            return cVar.B(kVar, i2, obj, j2, obj2, z2);
        }
        java.lang.Object k2 = kVar.k(i2);
        if (k2 == null) {
            if (cVar.f(j2)) {
                if (kVar.j(i2, null, B1.e.f25d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof z1.l0) {
            kVar.m(i2, null);
            if (cVar.y(k2, obj)) {
                kVar.n(i2, B1.e.f30i);
                return 0;
            }
            C.j jVar = B1.e.f32k;
            if (kVar.f47f.getAndSet((i2 * 2) + 1, jVar) != jVar) {
                kVar.l(i2, true);
            }
            return 5;
        }
        return cVar.B(kVar, i2, obj, j2, obj2, z2);
    }

    public static void q(B1.c cVar) {
        cVar.getClass();
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f13f;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(java.lang.Object obj) {
        if (obj instanceof z1.InterfaceC1052e) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return B1.e.a((z1.InterfaceC1052e) obj, h1.C0177i.f3302a, null);
        }
        throw new java.lang.IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final java.lang.Object A(B1.k kVar, int i2, long j2, java.lang.Object obj) {
        java.lang.Object k2 = kVar.k(i2);
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = kVar.f47f;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f10c;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return B1.e.f35n;
                }
                if (kVar.j(i2, k2, obj)) {
                    k();
                    return B1.e.f34m;
                }
            }
        } else if (k2 == B1.e.f25d && kVar.j(i2, k2, B1.e.f30i)) {
            k();
            java.lang.Object obj2 = atomicReferenceArray.get(i2 * 2);
            kVar.m(i2, null);
            return obj2;
        }
        while (true) {
            java.lang.Object k3 = kVar.k(i2);
            if (k3 == null || k3 == B1.e.f26e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i2, k3, B1.e.f29h)) {
                        k();
                        return B1.e.f36o;
                    }
                } else {
                    if (obj == null) {
                        return B1.e.f35n;
                    }
                    if (kVar.j(i2, k3, obj)) {
                        k();
                        return B1.e.f34m;
                    }
                }
            } else if (k3 != B1.e.f25d) {
                C.j jVar = B1.e.f31j;
                if (k3 == jVar) {
                    return B1.e.f36o;
                }
                if (k3 == B1.e.f29h) {
                    return B1.e.f36o;
                }
                if (k3 == B1.e.f33l) {
                    k();
                    return B1.e.f36o;
                }
                if (k3 != B1.e.f28g && kVar.j(i2, k3, B1.e.f27f)) {
                    boolean z2 = k3 instanceof B1.u;
                    if (z2) {
                        k3 = ((B1.u) k3).f56a;
                    }
                    if (z(k3)) {
                        kVar.n(i2, B1.e.f30i);
                        k();
                        java.lang.Object obj3 = atomicReferenceArray.get(i2 * 2);
                        kVar.m(i2, null);
                        return obj3;
                    }
                    kVar.n(i2, jVar);
                    kVar.h();
                    if (z2) {
                        k();
                    }
                    return B1.e.f36o;
                }
            } else if (kVar.j(i2, k3, B1.e.f30i)) {
                k();
                java.lang.Object obj4 = atomicReferenceArray.get(i2 * 2);
                kVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int B(B1.k kVar, int i2, java.lang.Object obj, long j2, java.lang.Object obj2, boolean z2) {
        while (true) {
            java.lang.Object k2 = kVar.k(i2);
            if (k2 == null) {
                if (!f(j2) || z2) {
                    if (z2) {
                        if (kVar.j(i2, null, B1.e.f31j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(i2, null, B1.e.f25d)) {
                    return 1;
                }
            } else {
                if (k2 != B1.e.f26e) {
                    C.j jVar = B1.e.f32k;
                    if (k2 == jVar) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == B1.e.f29h) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == B1.e.f33l) {
                        kVar.m(i2, null);
                        s();
                        return 4;
                    }
                    kVar.m(i2, null);
                    if (k2 instanceof B1.u) {
                        k2 = ((B1.u) k2).f56a;
                    }
                    if (y(k2, obj)) {
                        kVar.n(i2, B1.e.f30i);
                        return 0;
                    }
                    if (kVar.f47f.getAndSet((i2 * 2) + 1, jVar) == jVar) {
                        return 5;
                    }
                    kVar.l(i2, true);
                    return 5;
                }
                if (kVar.j(i2, k2, B1.e.f25d)) {
                    return 1;
                }
            }
        }
    }

    public final void C(long j2) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        if (u()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f12e;
        } while (atomicLongFieldUpdater.get(this) <= j2);
        int i2 = B1.e.f24c;
        int i3 = 0;
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = f13f;
            if (i3 >= i2) {
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, 4611686018427387904L + (j3 & 4611686018427387903L)));
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(this);
                    long j6 = atomicLongFieldUpdater2.get(this);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z2 = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z2) {
                        atomicLongFieldUpdater2.compareAndSet(this, j6, j7 + 4611686018427387904L);
                    }
                }
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, j4 & 4611686018427387903L));
                return;
            }
            long j8 = atomicLongFieldUpdater.get(this);
            if (j8 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j8 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // B1.s
    public final void a(java.util.concurrent.CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new java.util.concurrent.CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        c(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c8, code lost:
    
        r2.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014e, code lost:
    
        r19.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0151, code lost:
    
        r1 = r27;
        r2 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [z1.f] */
    @Override // B1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object e(java.lang.Object obj, k1.d dVar) {
        B1.k kVar;
        java.lang.Object obj2;
        ?? r2;
        z1.C1053f c1053f;
        h1.C0177i c0177i;
        z1.C1053f c1053f2;
        B1.k kVar2;
        java.lang.Object obj3;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14g;
        B1.k kVar3 = (B1.k) atomicReferenceFieldUpdater.get(this);
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f10c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r3 = r(andIncrement, false);
            int i2 = B1.e.f23b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = kVar3.f303c;
            h1.C0177i c0177i2 = h1.C0177i.f3302a;
            l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
            if (j5 != j4) {
                B1.k b2 = b(this, j4, kVar3);
                if (b2 != null) {
                    kVar = b2;
                } else if (r3) {
                    obj2 = w(obj, dVar);
                    if (obj2 != enumC0927a) {
                        return c0177i2;
                    }
                }
            } else {
                kVar = kVar3;
            }
            int d2 = d(this, kVar, i3, obj, j2, null, r3);
            if (d2 == 0) {
                kVar.a();
                return c0177i2;
            }
            if (d2 == 1) {
                break;
            }
            if (d2 != 2) {
                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = f11d;
                if (d2 == 3) {
                    z1.C1053f c2 = z1.AbstractC1068v.c(u0.AbstractC0995a.o(dVar));
                    B1.k kVar4 = kVar;
                    try {
                        int d3 = d(this, kVar4, i3, obj, j2, c2, false);
                        try {
                            if (d3 != 0) {
                                if (d3 != 1) {
                                    if (d3 == 2) {
                                        c1053f = c2;
                                        c0177i = c0177i2;
                                        c1053f.a(kVar, i3 + i2);
                                    } else if (d3 == 4) {
                                        c1053f = c2;
                                        c0177i = c0177i2;
                                        if (j2 < atomicLongFieldUpdater2.get(this)) {
                                            kVar.a();
                                        }
                                        c(this, obj, c1053f);
                                    } else {
                                        if (d3 != 5) {
                                            throw new java.lang.IllegalStateException("unexpected");
                                        }
                                        kVar.a();
                                        B1.k kVar5 = (B1.k) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j6 = andIncrement2 & 1152921504606846975L;
                                            boolean r4 = r(andIncrement2, false);
                                            int i4 = B1.e.f23b;
                                            long j7 = i4;
                                            long j8 = j6 / j7;
                                            int i5 = (int) (j6 % j7);
                                            if (kVar5.f303c != j8) {
                                                try {
                                                    B1.k b3 = b(this, j8, kVar5);
                                                    if (b3 != null) {
                                                        c1053f2 = c2;
                                                        kVar2 = b3;
                                                    } else if (r4) {
                                                        break;
                                                    }
                                                } catch (java.lang.Throwable th) {
                                                    th = th;
                                                    z1.C1053f c1053f3 = c2;
                                                }
                                            } else {
                                                c1053f2 = c2;
                                                kVar2 = kVar5;
                                            }
                                            c2 = c1053f2;
                                            B1.k kVar6 = kVar2;
                                            int d4 = d(this, kVar2, i5, obj, j6, c2, r4);
                                            if (d4 == 0) {
                                                c1053f = c2;
                                                c0177i = c0177i2;
                                                kVar6.a();
                                                break;
                                            }
                                            if (d4 == 1) {
                                                break;
                                            }
                                            if (d4 == 2) {
                                                obj3 = obj;
                                                c1053f = c2;
                                                if (r4) {
                                                    kVar6.h();
                                                } else {
                                                    c1053f.a(kVar6, i5 + i4);
                                                }
                                            } else {
                                                if (d4 == 3) {
                                                    throw new java.lang.IllegalStateException("unexpected");
                                                }
                                                if (d4 == 4) {
                                                    break;
                                                }
                                                if (d4 == 5) {
                                                    kVar6.a();
                                                }
                                                kVar5 = kVar6;
                                            }
                                        }
                                        c(this, obj3, c1053f);
                                        c0177i = c0177i2;
                                    }
                                    obj2 = c1053f.t();
                                    if (obj2 != enumC0927a) {
                                        obj2 = c0177i;
                                    }
                                    if (obj2 != enumC0927a) {
                                        return c0177i;
                                    }
                                }
                                c1053f = c2;
                                c0177i = c0177i2;
                                c1053f.l(c0177i);
                                obj2 = c1053f.t();
                                if (obj2 != enumC0927a) {
                                }
                                if (obj2 != enumC0927a) {
                                }
                            } else {
                                c1053f = c2;
                                c0177i = c0177i2;
                                kVar.a();
                            }
                            c1053f.l(c0177i);
                            obj2 = c1053f.t();
                            if (obj2 != enumC0927a) {
                            }
                            if (obj2 != enumC0927a) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            r2 = kVar4;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        r2 = c2;
                    }
                } else if (d2 != 4) {
                    if (d2 == 5) {
                        kVar.a();
                    }
                    kVar3 = kVar;
                } else {
                    if (j2 < atomicLongFieldUpdater2.get(this)) {
                        kVar.a();
                    }
                    java.lang.Object w2 = w(obj, dVar);
                    if (w2 == enumC0927a) {
                        return w2;
                    }
                }
            } else {
                if (!r3) {
                    return c0177i2;
                }
                kVar.h();
                obj2 = w(obj, dVar);
                if (obj2 != enumC0927a) {
                    return c0177i2;
                }
            }
        }
        return obj2;
    }

    public final boolean f(long j2) {
        return j2 < f12e.get(this) || j2 < f11d.get(this) + ((long) this.f19a);
    }

    public final boolean g(java.lang.Throwable th, boolean z2) {
        boolean z3;
        long j2;
        long j3;
        long j4;
        java.lang.Object obj;
        long j5;
        long j6;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f10c;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                B1.k kVar = B1.e.f22a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (1 << 60) + (j6 & 1152921504606846975L)));
        }
        C.j jVar = B1.e.f40s;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, jVar, th)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != jVar) {
                z3 = false;
                break;
            }
        }
        if (z2) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (3 << 60) + (j5 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j4 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j2 & 1152921504606846975L;
                    j4 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, (j4 << 60) + j3));
        }
        s();
        if (z3) {
            loop3: while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f18k;
                obj = atomicReferenceFieldUpdater2.get(this);
                C.j jVar2 = obj == null ? B1.e.f38q : B1.e.f39r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, jVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                kotlin.jvm.internal.s.a(1, obj);
                ((s1.l) obj).invoke(m());
            }
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // B1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object h(java.lang.Object obj) {
        B1.k kVar;
        B1.k kVar2;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f10c;
        boolean z2 = r(atomicLongFieldUpdater.get(this), false) ? false : !f(r0 & 1152921504606846975L);
        B1.i iVar = B1.j.f45a;
        if (!z2) {
            F.InterfaceC0009i interfaceC0009i = B1.e.f31j;
            B1.k kVar3 = (B1.k) f14g.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean r2 = r(andIncrement, false);
                int i2 = B1.e.f23b;
                long j3 = i2;
                long j4 = j2 / j3;
                int i3 = (int) (j2 % j3);
                if (kVar3.f303c != j4) {
                    B1.k b2 = b(this, j4, kVar3);
                    if (b2 != null) {
                        kVar = b2;
                    } else if (r2) {
                        return new B1.h(o());
                    }
                } else {
                    kVar = kVar3;
                }
                B1.k kVar4 = kVar;
                int d2 = d(this, kVar, i3, obj, j2, interfaceC0009i, r2);
                h1.C0177i c0177i = h1.C0177i.f3302a;
                if (d2 == 0) {
                    kVar4.a();
                    break;
                }
                if (d2 == 1) {
                    break;
                }
                if (d2 == 2) {
                    if (r2) {
                        kVar4.h();
                        return new B1.h(o());
                    }
                    z1.l0 l0Var = interfaceC0009i instanceof z1.l0 ? (z1.l0) interfaceC0009i : null;
                    if (l0Var != null) {
                        kVar2 = kVar4;
                        l0Var.a(kVar2, i3 + i2);
                    } else {
                        kVar2 = kVar4;
                    }
                    kVar2.h();
                    return iVar;
                }
                if (d2 == 3) {
                    throw new java.lang.IllegalStateException("unexpected");
                }
                if (d2 == 4) {
                    if (j2 < f11d.get(this)) {
                        kVar4.a();
                    }
                    return new B1.h(o());
                }
                if (d2 == 5) {
                    kVar4.a();
                }
                kVar3 = kVar4;
            }
        } else {
            return iVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (B1.k) ((E1.d) E1.d.f270b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B1.k i(long j2) {
        java.lang.Object obj;
        long j3;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.lang.Object obj2 = f16i.get(this);
        B1.k kVar = (B1.k) f14g.get(this);
        if (kVar.f303c > ((B1.k) obj2).f303c) {
            obj2 = kVar;
        }
        B1.k kVar2 = (B1.k) f15h.get(this);
        if (kVar2.f303c > ((B1.k) obj2).f303c) {
            obj2 = kVar2;
        }
        E1.d dVar = (E1.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            java.lang.Object obj3 = E1.d.f269a.get(dVar);
            C.j jVar = E1.AbstractC0000a.f262b;
            obj = null;
            if (obj3 == jVar) {
                break;
            }
            E1.d dVar2 = (E1.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = E1.d.f269a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, jVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        B1.k kVar3 = (B1.k) dVar;
        if (t()) {
            B1.k kVar4 = kVar3;
            loop2: do {
                int i2 = B1.e.f23b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (kVar4.f303c * B1.e.f23b) + i2;
                    if (j3 < f11d.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        java.lang.Object k2 = kVar4.k(i2);
                        if (k2 != null && k2 != B1.e.f26e) {
                            if (k2 == B1.e.f25d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i2, k2, B1.e.f33l)) {
                                kVar4.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (kVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                j(j3);
            }
        }
        loop5: for (B1.k kVar5 = kVar3; kVar5 != null; kVar5 = (B1.k) ((E1.d) E1.d.f270b.get(kVar5))) {
            for (int i3 = B1.e.f23b - 1; -1 < i3; i3--) {
                if ((kVar5.f303c * B1.e.f23b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    java.lang.Object k3 = kVar5.k(i3);
                    if (k3 != null && k3 != B1.e.f26e) {
                        if (!(k3 instanceof B1.u)) {
                            if (!(k3 instanceof z1.l0)) {
                                break;
                            }
                            if (kVar5.j(i3, k3, B1.e.f33l)) {
                                obj = E1.AbstractC0000a.f(obj, k3);
                                kVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i3, k3, B1.e.f33l)) {
                                obj = E1.AbstractC0000a.f(obj, ((B1.u) k3).f56a);
                                kVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i3, k3, B1.e.f33l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (obj instanceof java.util.ArrayList) {
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    x((z1.l0) arrayList.get(size), true);
                }
            } else {
                x((z1.l0) obj, true);
            }
        }
        return kVar3;
    }

    public final void j(long j2) {
        E1.A a2;
        B1.k kVar = (B1.k) f15h.get(this);
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f11d;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < java.lang.Math.max(this.f19a + j3, f12e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = B1.e.f23b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (kVar.f303c != j5) {
                    B1.k l2 = l(j5, kVar);
                    if (l2 == null) {
                        continue;
                    } else {
                        kVar = l2;
                    }
                }
                java.lang.Object A2 = A(kVar, i2, j3, null);
                if (A2 != B1.e.f36o) {
                    kVar.a();
                    s1.l lVar = this.f20b;
                    if (lVar != null && (a2 = E1.AbstractC0000a.a(lVar, A2, null)) != null) {
                        throw a2;
                    }
                } else if (j3 < p()) {
                    kVar.a();
                }
            }
        }
    }

    public final void k() {
        java.lang.Object b2;
        if (u()) {
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16i;
        B1.k kVar = (B1.k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f12e.getAndIncrement(this);
            long j2 = andIncrement / B1.e.f23b;
            if (p() <= andIncrement) {
                if (kVar.f303c < j2 && kVar.b() != null) {
                    v(j2, kVar);
                }
                q(this);
                return;
            }
            if (kVar.f303c != j2) {
                B1.d dVar = B1.d.f21a;
                while (true) {
                    b2 = E1.AbstractC0000a.b(kVar, j2, dVar);
                    if (!E1.AbstractC0000a.e(b2)) {
                        E1.u c2 = E1.AbstractC0000a.c(b2);
                        while (true) {
                            E1.u uVar = (E1.u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f303c >= c2.f303c) {
                                break;
                            }
                            if (!c2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c2)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (c2.e()) {
                                        c2.d();
                                    }
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                B1.k kVar2 = null;
                if (E1.AbstractC0000a.e(b2)) {
                    s();
                    v(j2, kVar);
                    q(this);
                } else {
                    B1.k kVar3 = (B1.k) E1.AbstractC0000a.c(b2);
                    long j3 = kVar3.f303c;
                    if (j3 > j2) {
                        long j4 = j3 * B1.e.f23b;
                        if (f12e.compareAndSet(this, andIncrement + 1, j4)) {
                            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f13f;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i2 = (int) (andIncrement % B1.e.f23b);
            java.lang.Object k2 = kVar.k(i2);
            boolean z2 = k2 instanceof z1.l0;
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = f11d;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i2, k2, B1.e.f28g)) {
                while (true) {
                    java.lang.Object k3 = kVar.k(i2);
                    if (!(k3 instanceof z1.l0)) {
                        if (k3 != B1.e.f31j) {
                            if (k3 != null) {
                                if (k3 == B1.e.f25d || k3 == B1.e.f29h || k3 == B1.e.f30i || k3 == B1.e.f32k || k3 == B1.e.f33l) {
                                    break loop0;
                                }
                                if (k3 != B1.e.f27f) {
                                    throw new java.lang.IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (kVar.j(i2, k3, B1.e.f26e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i2, k3, new B1.u((z1.l0) k3))) {
                            break loop0;
                        }
                    } else if (kVar.j(i2, k3, B1.e.f28g)) {
                        if (z(k3)) {
                            kVar.n(i2, B1.e.f25d);
                            break;
                        } else {
                            kVar.n(i2, B1.e.f31j);
                            kVar.h();
                        }
                    }
                }
            } else if (z(k2)) {
                kVar.n(i2, B1.e.f25d);
                break;
            } else {
                kVar.n(i2, B1.e.f31j);
                kVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final B1.k l(long j2, B1.k kVar) {
        java.lang.Object b2;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        B1.k kVar2 = B1.e.f22a;
        B1.d dVar = B1.d.f21a;
        loop0: while (true) {
            b2 = E1.AbstractC0000a.b(kVar, j2, dVar);
            if (!E1.AbstractC0000a.e(b2)) {
                E1.u c2 = E1.AbstractC0000a.c(b2);
                while (true) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15h;
                    E1.u uVar = (E1.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f303c >= c2.f303c) {
                        break loop0;
                    }
                    if (!c2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c2)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (c2.e()) {
                                c2.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (E1.AbstractC0000a.e(b2)) {
            s();
            if (kVar.f303c * B1.e.f23b >= p()) {
                return null;
            }
            kVar.a();
            return null;
        }
        B1.k kVar3 = (B1.k) E1.AbstractC0000a.c(b2);
        boolean u2 = u();
        long j4 = kVar3.f303c;
        if (!u2 && j2 <= f12e.get(this) / B1.e.f23b) {
            while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16i;
                E1.u uVar2 = (E1.u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f303c >= j4 || !kVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, kVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                        if (kVar3.e()) {
                            kVar3.d();
                        }
                    }
                }
                if (uVar2.e()) {
                    uVar2.d();
                }
            }
        }
        if (j4 <= j2) {
            return kVar3;
        }
        long j5 = B1.e.f23b * j4;
        do {
            atomicLongFieldUpdater = f11d;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * B1.e.f23b >= p()) {
            return null;
        }
        kVar3.a();
        return null;
    }

    public final java.lang.Throwable m() {
        return (java.lang.Throwable) f17j.get(this);
    }

    public final java.lang.Throwable n() {
        java.lang.Throwable m2 = m();
        return m2 == null ? new B1.l("Channel was closed") : m2;
    }

    public final java.lang.Throwable o() {
        java.lang.Throwable m2 = m();
        return m2 == null ? new B1.m("Channel was closed") : m2;
    }

    public final long p() {
        return f10c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (B1.k) ((E1.d) E1.d.f270b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = f11d;
        if (i2 == 2) {
            i(j2 & 1152921504606846975L);
            if (z2) {
                while (true) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15h;
                    B1.k kVar = (B1.k) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (p() <= j3) {
                        break;
                    }
                    long j4 = B1.e.f23b;
                    long j5 = j3 / j4;
                    if (kVar.f303c != j5 && (kVar = l(j5, kVar)) == null) {
                        if (((B1.k) atomicReferenceFieldUpdater.get(this)).f303c < j5) {
                            break;
                        }
                    } else {
                        kVar.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            java.lang.Object k2 = kVar.k(i3);
                            if (k2 == null || k2 == B1.e.f26e) {
                                if (kVar.j(i3, k2, B1.e.f29h)) {
                                    k();
                                    break;
                                }
                            } else {
                                if (k2 == B1.e.f25d) {
                                    return false;
                                }
                                if (k2 != B1.e.f31j && k2 != B1.e.f33l && k2 != B1.e.f30i && k2 != B1.e.f29h) {
                                    if (k2 == B1.e.f28g) {
                                        return false;
                                    }
                                    if (k2 != B1.e.f27f && j3 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f11d.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException(B1.a.f(i2, "unexpected close status: ").toString());
            }
            B1.k i4 = i(j2 & 1152921504606846975L);
            E1.A a2 = null;
            java.lang.Object obj = null;
            loop0: do {
                int i5 = B1.e.f23b - 1;
                while (true) {
                    if (-1 >= i5) {
                        break;
                    }
                    long j6 = (i4.f303c * B1.e.f23b) + i5;
                    while (true) {
                        java.lang.Object k3 = i4.k(i5);
                        if (k3 == B1.e.f30i) {
                            break loop0;
                        }
                        C.j jVar = B1.e.f25d;
                        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = i4.f47f;
                        s1.l lVar = this.f20b;
                        if (k3 == jVar) {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (i4.j(i5, k3, B1.e.f33l)) {
                                if (lVar != null) {
                                    a2 = E1.AbstractC0000a.a(lVar, atomicReferenceArray.get(i5 * 2), a2);
                                }
                                i4.m(i5, null);
                                i4.h();
                            }
                        } else if (k3 == B1.e.f26e || k3 == null) {
                            if (i4.j(i5, k3, B1.e.f33l)) {
                                i4.h();
                                break;
                            }
                        } else if (!(k3 instanceof z1.l0) && !(k3 instanceof B1.u)) {
                            C.j jVar2 = B1.e.f28g;
                            if (k3 == jVar2 || k3 == B1.e.f27f) {
                                break loop0;
                            }
                            if (k3 != jVar2) {
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            z1.l0 l0Var = k3 instanceof B1.u ? ((B1.u) k3).f56a : (z1.l0) k3;
                            if (i4.j(i5, k3, B1.e.f33l)) {
                                if (lVar != null) {
                                    a2 = E1.AbstractC0000a.a(lVar, atomicReferenceArray.get(i5 * 2), a2);
                                }
                                obj = E1.AbstractC0000a.f(obj, l0Var);
                                i4.m(i5, null);
                                i4.h();
                            }
                        }
                    }
                    i5--;
                }
            } while (i4 != null);
            if (obj != null) {
                if (obj instanceof java.util.ArrayList) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        x((z1.l0) arrayList.get(size), false);
                    }
                } else {
                    x((z1.l0) obj, false);
                }
            }
            if (a2 != null) {
                throw a2;
            }
        }
        return true;
    }

    public final boolean s() {
        return r(f10c.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (B1.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a1, code lost:
    
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String toString() {
        java.lang.String obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = (int) (f10c.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f19a + ',');
        sb.append("data=[");
        int i3 = 0;
        java.util.List H2 = i1.AbstractC0191j.H(f15h.get(this), f14g.get(this), f16i.get(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : H2) {
            if (((B1.k) obj2) != B1.e.f22a) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((B1.k) next).f303c;
            do {
                java.lang.Object next2 = it.next();
                long j3 = ((B1.k) next2).f303c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        B1.k kVar = (B1.k) next;
        long j4 = f11d.get(this);
        long p2 = p();
        loop2: while (true) {
            int i4 = B1.e.f23b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (kVar.f303c * B1.e.f23b) + i5;
                if (j5 >= p2 && j5 >= j4) {
                    break loop2;
                }
                java.lang.Object k2 = kVar.k(i5);
                java.lang.Object obj3 = kVar.f47f.get(i5 * 2);
                if (k2 instanceof z1.InterfaceC1052e) {
                    obj = (j5 >= j4 || j5 < p2) ? (j5 >= p2 || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof B1.u) {
                    obj = "EB(" + k2 + ')';
                } else if (kotlin.jvm.internal.i.a(k2, B1.e.f27f) ? true : kotlin.jvm.internal.i.a(k2, B1.e.f28g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? true : k2.equals(B1.e.f26e) ? true : kotlin.jvm.internal.i.a(k2, B1.e.f30i) ? true : kotlin.jvm.internal.i.a(k2, B1.e.f29h) ? true : kotlin.jvm.internal.i.a(k2, B1.e.f32k) ? true : kotlin.jvm.internal.i.a(k2, B1.e.f31j) ? true : kotlin.jvm.internal.i.a(k2, B1.e.f33l)) {
                    i5++;
                } else {
                    obj = k2.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i5++;
            }
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new java.util.NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(y1.g.O(sb)) == ',') {
            kotlin.jvm.internal.i.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j2 = f12e.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(long j2, B1.k kVar) {
        B1.k kVar2;
        B1.k kVar3;
        while (kVar.f303c < j2 && (kVar3 = (B1.k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (B1.k) kVar.b()) == null) {
                while (true) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16i;
                    E1.u uVar = (E1.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f303c >= kVar.f303c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (kVar.e()) {
                                kVar.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final java.lang.Object w(java.lang.Object obj, k1.d dVar) {
        E1.A a2;
        z1.C1053f c1053f = new z1.C1053f(1, u0.AbstractC0995a.o(dVar));
        c1053f.u();
        s1.l lVar = this.f20b;
        if (lVar == null || (a2 = E1.AbstractC0000a.a(lVar, obj, null)) == null) {
            c1053f.l(a.AbstractC0059a.i(o()));
        } else {
            Q1.d.b(a2, o());
            c1053f.l(a.AbstractC0059a.i(a2));
        }
        java.lang.Object t = c1053f.t();
        return t == l1.EnumC0927a.f8017a ? t : h1.C0177i.f3302a;
    }

    public final void x(z1.l0 l0Var, boolean z2) {
        if (l0Var instanceof z1.InterfaceC1052e) {
            ((k1.d) l0Var).l(a.AbstractC0059a.i(z2 ? n() : o()));
            return;
        }
        if (!(l0Var instanceof B1.b)) {
            throw new java.lang.IllegalStateException(("Unexpected waiter: " + l0Var).toString());
        }
        B1.b bVar = (B1.b) l0Var;
        z1.C1053f c1053f = bVar.f8b;
        kotlin.jvm.internal.i.b(c1053f);
        bVar.f8b = null;
        bVar.f7a = B1.e.f33l;
        java.lang.Throwable m2 = bVar.f9c.m();
        if (m2 == null) {
            c1053f.l(java.lang.Boolean.FALSE);
        } else {
            c1053f.l(a.AbstractC0059a.i(m2));
        }
    }

    public final boolean y(java.lang.Object obj, java.lang.Object obj2) {
        if (!(obj instanceof B1.b)) {
            if (!(obj instanceof z1.InterfaceC1052e)) {
                throw new java.lang.IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            z1.InterfaceC1052e interfaceC1052e = (z1.InterfaceC1052e) obj;
            s1.l lVar = this.f20b;
            return B1.e.a(interfaceC1052e, obj2, lVar != null ? new E1.p(lVar, obj2, interfaceC1052e.getContext()) : null);
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        B1.b bVar = (B1.b) obj;
        z1.C1053f c1053f = bVar.f8b;
        kotlin.jvm.internal.i.b(c1053f);
        bVar.f8b = null;
        bVar.f7a = obj2;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        s1.l lVar2 = bVar.f9c.f20b;
        return B1.e.a(c1053f, bool, lVar2 != null ? new E1.p(lVar2, obj2, c1053f.f8567e) : null);
    }
}
