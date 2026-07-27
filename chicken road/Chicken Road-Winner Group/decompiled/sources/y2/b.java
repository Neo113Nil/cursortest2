package y2;

import B2.t;
import B2.v;
import d2.C0279i;
import e2.AbstractC0293h;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i1.C0331a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w2.AbstractC1242v;
import w2.C1227f;
import w2.InterfaceC1226e;
import w2.l0;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10591b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10592c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10593d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10594e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10595g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10596h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10597i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10598j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    public final int f10599a;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i3) {
        this.f10599a = i3;
        if (i3 < 0) {
            throw new IllegalArgumentException(B0.c.i(i3, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        j jVar = d.f10601a;
        this.bufferEnd = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f10593d.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (u()) {
            jVar2 = d.f10601a;
            kotlin.jvm.internal.j.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f10618s;
    }

    public static final j a(b bVar, long j3, j jVar) {
        Object a3;
        b bVar2;
        bVar.getClass();
        j jVar2 = d.f10601a;
        c cVar = c.f10600a;
        loop0: while (true) {
            a3 = B2.a.a(jVar, j3, cVar);
            if (!B2.a.d(a3)) {
                t b3 = B2.a.b(a3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    t tVar = (t) atomicReferenceFieldUpdater.get(bVar);
                    if (tVar.f181c >= b3.f181c) {
                        break loop0;
                    }
                    if (!b3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, tVar, b3)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != tVar) {
                            if (b3.e()) {
                                b3.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean d3 = B2.a.d(a3);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10592c;
        if (d3) {
            bVar.s();
            if (jVar.f181c * d.f10602b < atomicLongFieldUpdater.get(bVar)) {
                jVar.a();
                return null;
            }
        } else {
            j jVar3 = (j) B2.a.b(a3);
            long j4 = jVar3.f181c;
            if (j4 <= j3) {
                return jVar3;
            }
            long j5 = d.f10602b * j4;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10591b;
                long j6 = atomicLongFieldUpdater2.get(bVar);
                long j7 = 1152921504606846975L & j6;
                if (j7 >= j5) {
                    bVar2 = bVar;
                    break;
                }
                bVar2 = bVar;
                if (atomicLongFieldUpdater2.compareAndSet(bVar2, j6, j7 + (((int) (j6 >> 60)) << 60))) {
                    break;
                }
                bVar = bVar2;
            }
            if (j4 * d.f10602b < atomicLongFieldUpdater.get(bVar2)) {
                jVar3.a();
            }
        }
        return null;
    }

    public static final void c(b bVar, Object obj, C1227f c1227f) {
        bVar.getClass();
        c1227f.e(X0.a.n(bVar.o()));
    }

    public static final int d(b bVar, j jVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        bVar.getClass();
        jVar.m(i3, obj);
        if (z3) {
            return bVar.B(jVar, i3, obj, j3, obj2, z3);
        }
        Object k3 = jVar.k(i3);
        if (k3 == null) {
            if (bVar.e(j3)) {
                if (jVar.j(null, i3, d.f10604d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(null, i3, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof l0) {
            jVar.m(i3, null);
            if (bVar.y(k3, obj)) {
                jVar.n(i3, d.f10608i);
                return 0;
            }
            v vVar = d.f10610k;
            if (jVar.f.getAndSet((i3 * 2) + 1, vVar) == vVar) {
                return 5;
            }
            jVar.l(i3, true);
            return 5;
        }
        return bVar.B(jVar, i3, obj, j3, obj2, z3);
    }

    public static void q(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10594e;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (!(obj instanceof InterfaceC1226e)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC1226e interfaceC1226e = (InterfaceC1226e) obj;
        j jVar = d.f10601a;
        v f3 = interfaceC1226e.f(C0279i.f4852a, null);
        if (f3 == null) {
            return false;
        }
        interfaceC1226e.m(f3);
        return true;
    }

    public final Object A(j jVar, int i3, long j3, Object obj) {
        Object k3 = jVar.k(i3);
        AtomicReferenceArray atomicReferenceArray = jVar.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10591b;
        if (k3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f10613n;
                }
                if (jVar.j(k3, i3, obj)) {
                    i();
                    return d.f10612m;
                }
            }
        } else if (k3 == d.f10604d && jVar.j(k3, i3, d.f10608i)) {
            i();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            jVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object k4 = jVar.k(i3);
            if (k4 == null || k4 == d.f10605e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(k4, i3, d.f10607h)) {
                        i();
                        return d.f10614o;
                    }
                } else {
                    if (obj == null) {
                        return d.f10613n;
                    }
                    if (jVar.j(k4, i3, obj)) {
                        i();
                        return d.f10612m;
                    }
                }
            } else if (k4 != d.f10604d) {
                v vVar = d.f10609j;
                if (k4 == vVar) {
                    return d.f10614o;
                }
                if (k4 == d.f10607h) {
                    return d.f10614o;
                }
                if (k4 == d.f10611l) {
                    i();
                    return d.f10614o;
                }
                if (k4 != d.f10606g && jVar.j(k4, i3, d.f)) {
                    boolean z3 = k4 instanceof r;
                    if (z3) {
                        k4 = ((r) k4).f10629a;
                    }
                    if (z(k4)) {
                        jVar.n(i3, d.f10608i);
                        i();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        jVar.m(i3, null);
                        return obj3;
                    }
                    jVar.n(i3, vVar);
                    jVar.h();
                    if (z3) {
                        i();
                    }
                    return d.f10614o;
                }
            } else if (jVar.j(k4, i3, d.f10608i)) {
                i();
                Object obj4 = atomicReferenceArray.get(i3 * 2);
                jVar.m(i3, null);
                return obj4;
            }
        }
    }

    public final int B(j jVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        while (true) {
            Object k3 = jVar.k(i3);
            if (k3 == null) {
                if (!e(j3) || z3) {
                    if (z3) {
                        if (jVar.j(null, i3, d.f10609j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(null, i3, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(null, i3, d.f10604d)) {
                    break;
                }
            } else {
                if (k3 != d.f10605e) {
                    v vVar = d.f10610k;
                    if (k3 == vVar) {
                        jVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == d.f10607h) {
                        jVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == d.f10611l) {
                        jVar.m(i3, null);
                        s();
                        return 4;
                    }
                    jVar.m(i3, null);
                    if (k3 instanceof r) {
                        k3 = ((r) k3).f10629a;
                    }
                    if (y(k3, obj)) {
                        jVar.n(i3, d.f10608i);
                        return 0;
                    }
                    if (jVar.f.getAndSet((i3 * 2) + 1, vVar) != vVar) {
                        jVar.l(i3, true);
                    }
                    return 5;
                }
                if (jVar.j(k3, i3, d.f10604d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void C(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        b bVar = this;
        if (bVar.u()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f10593d;
            if (atomicLongFieldUpdater.get(bVar) > j3) {
                break;
            } else {
                bVar = this;
            }
        }
        int i3 = d.f10603c;
        int i4 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10594e;
            if (i4 < i3) {
                long j4 = atomicLongFieldUpdater.get(bVar);
                if (j4 == (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) && j4 == atomicLongFieldUpdater.get(bVar)) {
                    return;
                } else {
                    i4++;
                }
            } else {
                while (true) {
                    long j5 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j5, (j5 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bVar = this;
                    }
                }
                while (true) {
                    long j6 = atomicLongFieldUpdater.get(bVar);
                    long j7 = atomicLongFieldUpdater2.get(bVar);
                    long j8 = j7 & 4611686018427387903L;
                    boolean z3 = (j7 & 4611686018427387904L) != 0;
                    if (j6 == j8 && j6 == atomicLongFieldUpdater.get(bVar)) {
                        break;
                    }
                    if (!z3) {
                        atomicLongFieldUpdater2.compareAndSet(this, j7, 4611686018427387904L + j8);
                    }
                    bVar = this;
                }
                while (true) {
                    long j9 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j9, j9 & 4611686018427387903L)) {
                        return;
                    } else {
                        bVar = this;
                    }
                }
            }
        }
    }

    @Override // y2.p
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j3) {
        return j3 < f10593d.get(this) || j3 < f10592c.get(this) + ((long) this.f10599a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(Throwable th, boolean z3) {
        b bVar;
        v vVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z4;
        long j3;
        long j4;
        long j5;
        Object obj;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10591b;
        if (z3) {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                if (((int) (j7 >> 60)) == 0) {
                    j jVar = d.f10601a;
                    bVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j7, (j7 & 1152921504606846975L) + (1 << 60)));
            vVar = d.f10618s;
            while (true) {
                atomicReferenceFieldUpdater = f10597i;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, th)) {
                    z4 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                    z4 = false;
                    break;
                }
            }
            if (z3) {
                do {
                    j3 = atomicLongFieldUpdater.get(this);
                    int i3 = (int) (j3 >> 60);
                    if (i3 == 0) {
                        j4 = j3 & 1152921504606846975L;
                        j5 = 2;
                    } else {
                        if (i3 != 1) {
                            break;
                        }
                        j4 = j3 & 1152921504606846975L;
                        j5 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(bVar, j3, (j5 << 60) + j4));
            } else {
                do {
                    j6 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(bVar, j6, (3 << 60) + (j6 & 1152921504606846975L)));
            }
            s();
            if (z4) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10598j;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    v vVar2 = obj == null ? d.f10616q : d.f10617r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, vVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    kotlin.jvm.internal.t.a(1, obj);
                    ((o2.l) obj).invoke(m());
                    return z4;
                }
            }
            return z4;
        }
        bVar = this;
        vVar = d.f10618s;
        while (true) {
            atomicReferenceFieldUpdater = f10597i;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, th)) {
            }
        }
        if (z3) {
        }
        s();
        if (z4) {
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (y2.j) ((B2.d) B2.d.f154b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j g(long j3) {
        Object obj;
        long j4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f10596h.get(this);
        j jVar = (j) f.get(this);
        if (jVar.f181c > ((j) obj2).f181c) {
            obj2 = jVar;
        }
        j jVar2 = (j) f10595g.get(this);
        if (jVar2.f181c > ((j) obj2).f181c) {
            obj2 = jVar2;
        }
        B2.d dVar = (B2.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = B2.d.f153a.get(dVar);
            v vVar = B2.a.f147b;
            obj = null;
            if (obj3 == vVar) {
                break;
            }
            B2.d dVar2 = (B2.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = B2.d.f153a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, vVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        j jVar3 = (j) dVar;
        if (t()) {
            j jVar4 = jVar3;
            loop2: do {
                int i3 = d.f10602b - 1;
                while (true) {
                    if (-1 >= i3) {
                        break;
                    }
                    j4 = (jVar4.f181c * d.f10602b) + i3;
                    if (j4 < f10592c.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k3 = jVar4.k(i3);
                        if (k3 != null && k3 != d.f10605e) {
                            if (k3 == d.f10604d) {
                                break loop2;
                            }
                        } else {
                            if (jVar4.j(k3, i3, d.f10611l)) {
                                jVar4.h();
                                break;
                            }
                        }
                    }
                    i3--;
                }
            } while (jVar4 != null);
            j4 = -1;
            if (j4 != -1) {
                h(j4);
            }
        }
        loop5: for (j jVar5 = jVar3; jVar5 != null; jVar5 = (j) ((B2.d) B2.d.f154b.get(jVar5))) {
            for (int i4 = d.f10602b - 1; -1 < i4; i4--) {
                if ((jVar5.f181c * d.f10602b) + i4 < j3) {
                    break loop5;
                }
                while (true) {
                    Object k4 = jVar5.k(i4);
                    if (k4 != null && k4 != d.f10605e) {
                        if (!(k4 instanceof r)) {
                            if (!(k4 instanceof l0)) {
                                break;
                            }
                            if (jVar5.j(k4, i4, d.f10611l)) {
                                obj = B2.a.e(obj, k4);
                                jVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (jVar5.j(k4, i4, d.f10611l)) {
                                obj = B2.a.e(obj, ((r) k4).f10629a);
                                jVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar5.j(k4, i4, d.f10611l)) {
                            jVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                x((l0) obj, true);
                return jVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                x((l0) arrayList.get(size), true);
            }
        }
        return jVar3;
    }

    public final void h(long j3) {
        j jVar = (j) f10595g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10592c;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f10599a + j4, f10593d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, 1 + j4)) {
                long j5 = d.f10602b;
                long j6 = j4 / j5;
                int i3 = (int) (j4 % j5);
                if (jVar.f181c != j6) {
                    j k3 = k(j6, jVar);
                    if (k3 != null) {
                        jVar = k3;
                    }
                }
                j jVar2 = jVar;
                if (A(jVar2, i3, j4, null) != d.f10614o) {
                    jVar2.a();
                } else if (j4 < p()) {
                    jVar2.a();
                }
                jVar = jVar2;
            }
        }
    }

    public final void i() {
        Object a3;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10596h;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f10593d.getAndIncrement(this);
            long j3 = andIncrement / d.f10602b;
            if (p() <= andIncrement) {
                if (jVar.f181c < j3 && jVar.b() != null) {
                    v(j3, jVar);
                }
                q(this);
                return;
            }
            if (jVar.f181c != j3) {
                c cVar = c.f10600a;
                while (true) {
                    a3 = B2.a.a(jVar, j3, cVar);
                    if (!B2.a.d(a3)) {
                        t b3 = B2.a.b(a3);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f181c >= b3.f181c) {
                                break;
                            }
                            if (!b3.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b3)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (b3.e()) {
                                        b3.d();
                                    }
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                j jVar2 = null;
                if (B2.a.d(a3)) {
                    s();
                    v(j3, jVar);
                    q(this);
                } else {
                    j jVar3 = (j) B2.a.b(a3);
                    long j4 = jVar3.f181c;
                    if (j4 > j3) {
                        long j5 = j4 * d.f10602b;
                        if (f10593d.compareAndSet(this, 1 + andIncrement, j5)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f10594e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j5 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        jVar2 = jVar3;
                    }
                }
                if (jVar2 == null) {
                    continue;
                } else {
                    jVar = jVar2;
                }
            }
            int i3 = (int) (andIncrement % d.f10602b);
            Object k3 = jVar.k(i3);
            boolean z3 = k3 instanceof l0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10592c;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(k3, i3, d.f10606g)) {
                while (true) {
                    Object k4 = jVar.k(i3);
                    if (!(k4 instanceof l0)) {
                        if (k4 != d.f10609j) {
                            if (k4 != null) {
                                if (k4 == d.f10604d || k4 == d.f10607h || k4 == d.f10608i || k4 == d.f10610k || k4 == d.f10611l) {
                                    break loop0;
                                }
                                if (k4 != d.f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k4).toString());
                                }
                            } else if (jVar.j(k4, i3, d.f10605e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (jVar.j(k4, i3, new r((l0) k4))) {
                            break loop0;
                        }
                    } else if (jVar.j(k4, i3, d.f10606g)) {
                        if (z(k4)) {
                            jVar.n(i3, d.f10604d);
                            break;
                        } else {
                            jVar.n(i3, d.f10609j);
                            jVar.h();
                        }
                    }
                }
            } else if (z(k3)) {
                jVar.n(i3, d.f10604d);
                break;
            } else {
                jVar.n(i3, d.f10609j);
                jVar.h();
                q(this);
            }
        }
        q(this);
    }

    @Override // y2.q
    public Object j(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10591b;
        boolean z3 = false;
        long j3 = 1152921504606846975L;
        boolean z4 = r(atomicLongFieldUpdater.get(this), false) ? false : !e(r1 & 1152921504606846975L);
        h hVar = i.f10623a;
        if (z4) {
            return hVar;
        }
        Object obj2 = d.f10609j;
        j jVar = (j) f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean r3 = r(andIncrement, z3);
            int i3 = d.f10602b;
            long j5 = i3;
            long j6 = j4 / j5;
            int i4 = (int) (j4 % j5);
            if (jVar.f181c != j6) {
                j a3 = a(this, j6, jVar);
                if (a3 != null) {
                    jVar = a3;
                } else {
                    if (r3) {
                        return new g(o());
                    }
                    z3 = false;
                    j3 = 1152921504606846975L;
                }
            }
            int d3 = d(this, jVar, i4, obj, j4, obj2, r3);
            C0279i c0279i = C0279i.f4852a;
            if (d3 == 0) {
                jVar.a();
                return c0279i;
            }
            if (d3 == 1) {
                return c0279i;
            }
            if (d3 == 2) {
                if (r3) {
                    jVar.h();
                    return new g(o());
                }
                l0 l0Var = obj2 instanceof l0 ? (l0) obj2 : null;
                if (l0Var != null) {
                    l0Var.a(jVar, i4 + i3);
                }
                jVar.h();
                return hVar;
            }
            if (d3 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (d3 == 4) {
                if (j4 < f10592c.get(this)) {
                    jVar.a();
                }
                return new g(o());
            }
            if (d3 == 5) {
                jVar.a();
            }
            z3 = false;
            j3 = 1152921504606846975L;
        }
    }

    public final j k(long j3, j jVar) {
        Object a3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        j jVar2 = d.f10601a;
        c cVar = c.f10600a;
        loop0: while (true) {
            a3 = B2.a.a(jVar, j3, cVar);
            if (!B2.a.d(a3)) {
                t b3 = B2.a.b(a3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10595g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f181c >= b3.f181c) {
                        break loop0;
                    }
                    if (!b3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b3)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (b3.e()) {
                                b3.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (B2.a.d(a3)) {
            s();
            if (jVar.f181c * d.f10602b < p()) {
                jVar.a();
                return null;
            }
        } else {
            j jVar3 = (j) B2.a.b(a3);
            boolean u3 = u();
            long j5 = jVar3.f181c;
            if (!u3 && j3 <= f10593d.get(this) / d.f10602b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10596h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f181c >= j5 || !jVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, jVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            if (jVar3.e()) {
                                jVar3.d();
                            }
                        }
                    }
                    if (tVar2.e()) {
                        tVar2.d();
                    }
                }
            }
            if (j5 <= j3) {
                return jVar3;
            }
            long j6 = j5 * d.f10602b;
            do {
                atomicLongFieldUpdater = f10592c;
                j4 = atomicLongFieldUpdater.get(this);
                if (j4 >= j6) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j6));
            if (j5 * d.f10602b < p()) {
                jVar3.a();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0178, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164 A[RETURN] */
    @Override // y2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(InterfaceC0319c interfaceC0319c, Object obj) {
        Object s3;
        Object obj2;
        b bVar;
        j jVar;
        int i3;
        b bVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        j jVar2 = (j) atomicReferenceFieldUpdater.get(bVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10591b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar2);
            long j3 = andIncrement & 1152921504606846975L;
            boolean r3 = bVar2.r(andIncrement, false);
            int i4 = d.f10602b;
            long j4 = i4;
            long j5 = j3 / j4;
            int i5 = (int) (j3 % j4);
            long j6 = jVar2.f181c;
            C0279i c0279i = C0279i.f4852a;
            EnumC0326a enumC0326a = EnumC0326a.f4994a;
            if (j6 != j5) {
                j a3 = a(bVar2, j5, jVar2);
                if (a3 != null) {
                    jVar2 = a3;
                } else if (r3) {
                    Object w3 = w(interfaceC0319c, obj);
                    if (w3 == enumC0326a) {
                        return w3;
                    }
                }
            }
            int d3 = d(bVar2, jVar2, i5, obj, j3, null, r3);
            if (d3 == 0) {
                jVar2.a();
                return c0279i;
            }
            if (d3 == 1) {
                break;
            }
            if (d3 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10592c;
                if (d3 == 3) {
                    C1227f d4 = AbstractC1242v.d(F2.b.y(interfaceC0319c));
                    Object obj3 = obj;
                    try {
                        int d5 = d(bVar2, jVar2, i5, obj3, j3, d4, false);
                        try {
                            if (d5 != 0) {
                                if (d5 == 1) {
                                    d4.e(c0279i);
                                } else if (d5 != 2) {
                                    if (d5 != 4) {
                                        String str = "unexpected";
                                        if (d5 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar2.a();
                                        j jVar3 = (j) atomicReferenceFieldUpdater.get(bVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(bVar2);
                                            long j7 = andIncrement2 & 1152921504606846975L;
                                            boolean r4 = bVar2.r(andIncrement2, false);
                                            int i6 = d.f10602b;
                                            long j8 = i6;
                                            String str2 = str;
                                            long j9 = j7 / j8;
                                            int i7 = (int) (j7 % j8);
                                            if (jVar3.f181c != j9) {
                                                j a4 = a(bVar2, j9, jVar3);
                                                if (a4 != null) {
                                                    i3 = i6;
                                                    jVar = a4;
                                                } else {
                                                    if (r4) {
                                                        break;
                                                    }
                                                    str = str2;
                                                }
                                            } else {
                                                jVar = jVar3;
                                                i3 = i6;
                                            }
                                            int d6 = d(bVar2, jVar, i7, obj3, j7, d4, r4);
                                            Object obj4 = obj3;
                                            bVar = bVar2;
                                            j jVar4 = jVar;
                                            obj2 = obj4;
                                            if (d6 == 0) {
                                                jVar4.a();
                                                break;
                                            }
                                            if (d6 == 1) {
                                                break;
                                            }
                                            if (d6 != 2) {
                                                if (d6 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (d6 != 4) {
                                                    if (d6 == 5) {
                                                        jVar4.a();
                                                    }
                                                    jVar3 = jVar4;
                                                    bVar2 = bVar;
                                                    str = str2;
                                                    obj3 = obj2;
                                                } else if (j7 < atomicLongFieldUpdater2.get(bVar)) {
                                                    jVar4.a();
                                                }
                                            } else if (r4) {
                                                jVar4.h();
                                            } else {
                                                d4.a(jVar4, i7 + i3);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        bVar = bVar2;
                                        if (j3 < atomicLongFieldUpdater2.get(bVar)) {
                                            jVar2.a();
                                        }
                                    }
                                    c(bVar, obj2, d4);
                                } else {
                                    d4.a(jVar2, i5 + i4);
                                }
                                s3 = d4.s();
                                if (s3 != enumC0326a) {
                                    s3 = c0279i;
                                }
                                if (s3 != enumC0326a) {
                                    return s3;
                                }
                            } else {
                                jVar2.a();
                            }
                            d4.e(c0279i);
                            s3 = d4.s();
                            if (s3 != enumC0326a) {
                            }
                            if (s3 != enumC0326a) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            d4.z();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (d3 == 4) {
                    if (j3 < atomicLongFieldUpdater2.get(bVar2)) {
                        jVar2.a();
                    }
                    Object w4 = w(interfaceC0319c, obj);
                    if (w4 == enumC0326a) {
                        return w4;
                    }
                } else if (d3 == 5) {
                    jVar2.a();
                }
            } else if (r3) {
                jVar2.h();
                Object w5 = w(interfaceC0319c, obj);
                if (w5 == enumC0326a) {
                    return w5;
                }
            }
        }
    }

    public final Throwable m() {
        return (Throwable) f10597i.get(this);
    }

    public final Throwable n() {
        Throwable m3 = m();
        return m3 == null ? new k("Channel was closed") : m3;
    }

    public final Throwable o() {
        Throwable m3 = m();
        return m3 == null ? new C0331a("Channel was closed") : m3;
    }

    public final long p() {
        return f10591b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (y2.j) ((B2.d) B2.d.f154b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j3, boolean z3) {
        int i3 = (int) (j3 >> 60);
        if (i3 != 0 && i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10592c;
            if (i3 == 2) {
                g(1152921504606846975L & j3);
                if (z3) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10595g;
                        j jVar = (j) atomicReferenceFieldUpdater.get(this);
                        long j4 = atomicLongFieldUpdater.get(this);
                        if (p() <= j4) {
                            break;
                        }
                        long j5 = d.f10602b;
                        long j6 = j4 / j5;
                        if (jVar.f181c != j6 && (jVar = k(j6, jVar)) == null) {
                            if (((j) atomicReferenceFieldUpdater.get(this)).f181c < j6) {
                                break;
                            }
                        } else {
                            jVar.a();
                            int i4 = (int) (j4 % j5);
                            while (true) {
                                Object k3 = jVar.k(i4);
                                if (k3 == null || k3 == d.f10605e) {
                                    if (jVar.j(k3, i4, d.f10607h)) {
                                        i();
                                        break;
                                    }
                                } else {
                                    if (k3 == d.f10604d) {
                                        break;
                                    }
                                    if (k3 != d.f10609j) {
                                        if (k3 != d.f10611l) {
                                            if (k3 != d.f10608i) {
                                                if (k3 != d.f10607h) {
                                                    if (k3 == d.f10606g) {
                                                        break;
                                                    }
                                                    if (k3 != d.f && j4 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f10592c.compareAndSet(this, j4, j4 + 1);
                        }
                    }
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException(B0.c.h(i3, "unexpected close status: ").toString());
                }
                j g3 = g(1152921504606846975L & j3);
                Object obj = null;
                loop0: do {
                    int i5 = d.f10602b - 1;
                    while (true) {
                        if (-1 >= i5) {
                            break;
                        }
                        long j7 = (g3.f181c * d.f10602b) + i5;
                        while (true) {
                            Object k4 = g3.k(i5);
                            if (k4 == d.f10608i) {
                                break loop0;
                            }
                            if (k4 == d.f10604d) {
                                if (j7 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (g3.j(k4, i5, d.f10611l)) {
                                    g3.m(i5, null);
                                    g3.h();
                                    break;
                                }
                            } else if (k4 != d.f10605e && k4 != null) {
                                if (!(k4 instanceof l0) && !(k4 instanceof r)) {
                                    v vVar = d.f10606g;
                                    if (k4 == vVar || k4 == d.f) {
                                        break loop0;
                                    }
                                    if (k4 != vVar) {
                                        break;
                                    }
                                } else {
                                    if (j7 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    l0 l0Var = k4 instanceof r ? ((r) k4).f10629a : (l0) k4;
                                    if (g3.j(k4, i5, d.f10611l)) {
                                        obj = B2.a.e(obj, l0Var);
                                        g3.m(i5, null);
                                        g3.h();
                                        break;
                                    }
                                }
                            } else if (g3.j(k4, i5, d.f10611l)) {
                                g3.h();
                                break;
                            }
                        }
                        i5--;
                    }
                } while (g3 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            x((l0) arrayList.get(size), false);
                        }
                    } else {
                        x((l0) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean s() {
        return r(f10591b.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01aa, code lost:
    
        r16 = r7;
        r3 = (y2.j) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z3;
        String obj;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (f10591b.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f10599a + ',');
        sb.append("data=[");
        int i4 = 0;
        boolean z4 = true;
        List S2 = AbstractC0293h.S(f10595g.get(this), f.get(this), f10596h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : S2) {
            if (((j) obj2) != d.f10601a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j3 = ((j) next).f181c;
            do {
                Object next2 = it.next();
                long j4 = ((j) next2).f181c;
                if (j3 > j4) {
                    next = next2;
                    j3 = j4;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j5 = f10592c.get(this);
        long p3 = p();
        loop2: while (true) {
            int i5 = d.f10602b;
            int i6 = i4;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                long j6 = (jVar.f181c * d.f10602b) + i6;
                if (j6 >= p3 && j6 >= j5) {
                    break loop2;
                }
                Object k3 = jVar.k(i6);
                boolean z5 = z4;
                Object obj3 = jVar.f.get(i6 * 2);
                if (k3 instanceof InterfaceC1226e) {
                    obj = (j6 >= j5 || j6 < p3) ? (j6 >= p3 || j6 < j5) ? "cont" : "send" : "receive";
                } else if (k3 instanceof r) {
                    obj = "EB(" + k3 + ')';
                } else if (kotlin.jvm.internal.j.a(k3, d.f) ? z5 : kotlin.jvm.internal.j.a(k3, d.f10606g)) {
                    obj = "resuming_sender";
                } else if (k3 == null ? z5 : k3.equals(d.f10605e) ? z5 : kotlin.jvm.internal.j.a(k3, d.f10608i) ? z5 : kotlin.jvm.internal.j.a(k3, d.f10607h) ? z5 : kotlin.jvm.internal.j.a(k3, d.f10610k) ? z5 : kotlin.jvm.internal.j.a(k3, d.f10609j) ? z5 : kotlin.jvm.internal.j.a(k3, d.f10611l)) {
                    i6++;
                    z4 = z5;
                } else {
                    obj = k3.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i6++;
                z4 = z5;
            }
            z4 = z3;
            i4 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(v2.m.l0(sb)) == ',') {
            kotlin.jvm.internal.j.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j3 = f10593d.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(long j3, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f181c < j3 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10596h;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f181c >= jVar.f181c) {
                        return;
                    }
                    if (!jVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, jVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (jVar.e()) {
                                jVar.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                        return;
                    }
                    return;
                }
            }
            jVar = jVar2;
        }
    }

    public final Object w(InterfaceC0319c interfaceC0319c, Object obj) {
        C1227f c1227f = new C1227f(1, F2.b.y(interfaceC0319c));
        c1227f.t();
        c1227f.e(X0.a.n(o()));
        Object s3 = c1227f.s();
        return s3 == EnumC0326a.f4994a ? s3 : C0279i.f4852a;
    }

    public final void x(l0 l0Var, boolean z3) {
        if (l0Var instanceof InterfaceC1226e) {
            ((InterfaceC0319c) l0Var).e(X0.a.n(z3 ? n() : o()));
            return;
        }
        if (!(l0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + l0Var).toString());
        }
        a aVar = (a) l0Var;
        C1227f c1227f = aVar.f10589b;
        kotlin.jvm.internal.j.b(c1227f);
        aVar.f10589b = null;
        aVar.f10588a = d.f10611l;
        Throwable m3 = aVar.f10590c.m();
        if (m3 == null) {
            c1227f.e(Boolean.FALSE);
        } else {
            c1227f.e(X0.a.n(m3));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC1226e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC1226e interfaceC1226e = (InterfaceC1226e) obj;
            j jVar = d.f10601a;
            v f3 = interfaceC1226e.f(obj2, null);
            if (f3 == null) {
                return false;
            }
            interfaceC1226e.m(f3);
            return true;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C1227f c1227f = aVar.f10589b;
        kotlin.jvm.internal.j.b(c1227f);
        aVar.f10589b = null;
        aVar.f10588a = obj2;
        Boolean bool = Boolean.TRUE;
        aVar.f10590c.getClass();
        j jVar2 = d.f10601a;
        v f4 = c1227f.f(bool, null);
        if (f4 == null) {
            return false;
        }
        c1227f.m(f4);
        return true;
    }
}
