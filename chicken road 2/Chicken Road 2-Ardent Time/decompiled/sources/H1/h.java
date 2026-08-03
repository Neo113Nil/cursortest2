package H1;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f629b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(H1.h.class, java.lang.Object.class, "head");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f630c = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(H1.h.class, "deqIdx");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f631d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(H1.h.class, java.lang.Object.class, "tail");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater f632e = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(H1.h.class, "enqIdx");

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f633f = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(H1.h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final B1.p f634a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile java.lang.Object head;
    private volatile java.lang.Object tail;

    public h(int i2) {
        if (i2 < 0 || i2 > 1) {
            throw new java.lang.IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        H1.j jVar = new H1.j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1 - i2;
        this.f634a = new B1.p(2, this);
    }

    public final void a(H1.c cVar) {
        java.lang.Object b2;
        H1.f fVar;
        long j2;
        while (true) {
            int andDecrement = f633f.getAndDecrement(this);
            if (andDecrement <= 1) {
                java.lang.Object obj = h1.C0177i.f3302a;
                s1.l lVar = this.f634a;
                if (andDecrement > 0) {
                    cVar.d(obj, lVar);
                    return;
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f631d;
                H1.j jVar = (H1.j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f632e.getAndIncrement(this);
                H1.f fVar2 = H1.f.f627a;
                long j3 = andIncrement / H1.i.f640f;
                while (true) {
                    b2 = E1.AbstractC0000a.b(jVar, j3, fVar2);
                    if (!E1.AbstractC0000a.e(b2)) {
                        E1.u c2 = E1.AbstractC0000a.c(b2);
                        while (true) {
                            E1.u uVar = (E1.u) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j2 = j3;
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
                                    fVar2 = fVar;
                                    j3 = j2;
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    fVar2 = fVar;
                    j3 = j2;
                }
                H1.j jVar2 = (H1.j) E1.AbstractC0000a.c(b2);
                int i2 = (int) (andIncrement % H1.i.f640f);
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = jVar2.f641e;
                while (!atomicReferenceArray.compareAndSet(i2, null, cVar)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        C.j jVar3 = H1.i.f636b;
                        C.j jVar4 = H1.i.f637c;
                        while (!atomicReferenceArray.compareAndSet(i2, jVar3, jVar4)) {
                            if (atomicReferenceArray.get(i2) != jVar3) {
                                break;
                            }
                        }
                        cVar.d(obj, lVar);
                        return;
                    }
                }
                cVar.a(jVar2, i2);
                return;
            }
        }
    }

    public final void b() {
        boolean z2;
        int i2;
        java.lang.Object b2;
        do {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f633f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z2 = true;
            if (andIncrement >= 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
                throw new java.lang.IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f629b;
            H1.j jVar = (H1.j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f630c.getAndIncrement(this);
            long j2 = andIncrement2 / H1.i.f640f;
            H1.g gVar = H1.g.f628a;
            while (true) {
                b2 = E1.AbstractC0000a.b(jVar, j2, gVar);
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
            H1.j jVar2 = (H1.j) E1.AbstractC0000a.c(b2);
            jVar2.a();
            boolean z3 = false;
            if (jVar2.f303c <= j2) {
                int i3 = (int) (andIncrement2 % H1.i.f640f);
                C.j jVar3 = H1.i.f636b;
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = jVar2.f641e;
                java.lang.Object andSet = atomicReferenceArray.getAndSet(i3, jVar3);
                if (andSet == null) {
                    int i4 = H1.i.f635a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            C.j jVar4 = H1.i.f636b;
                            C.j jVar5 = H1.i.f638d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i3, jVar4, jVar5)) {
                                    z3 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i3) != jVar4) {
                                    break;
                                }
                            }
                            z2 = true ^ z3;
                        } else if (atomicReferenceArray.get(i3) == H1.i.f637c) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                } else if (andSet != H1.i.f639e) {
                    if (!(andSet instanceof z1.InterfaceC1052e)) {
                        throw new java.lang.IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    z1.InterfaceC1052e interfaceC1052e = (z1.InterfaceC1052e) andSet;
                    C.j c3 = interfaceC1052e.c(h1.C0177i.f3302a, this.f634a);
                    if (c3 != null) {
                        interfaceC1052e.n(c3);
                    }
                }
            }
            z2 = false;
        } while (!z2);
    }
}
