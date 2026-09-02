package d1;

import b1.C0017e;
import b1.InterfaceC0016d;
import b1.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f904c = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f905d = AtomicLongFieldUpdater.newUpdater(c.class, "receivers");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f906e = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f907f = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f908g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f909h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f910i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f911j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f912k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    public final int f913a;

    /* renamed from: b, reason: collision with root package name */
    public final U0.l f914b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public c(int i2, U0.l lVar) {
        this.f913a = i2;
        this.f914b = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        k kVar = e.f916a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f906e.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment = kVar2;
        this.receiveSegment = kVar2;
        if (r()) {
            kVar2 = e.f916a;
            kotlin.jvm.internal.j.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = kVar2;
        this._closeCause = e.f934s;
    }

    public static final k b(c cVar, long j2, k kVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        cVar.getClass();
        k kVar2 = e.f916a;
        d dVar = d.f915a;
        loop0: while (true) {
            c2 = g1.a.c(j2, kVar);
            if (!g1.a.f(c2)) {
                g1.u d2 = g1.a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f908g;
                    g1.u uVar = (g1.u) atomicReferenceFieldUpdater.get(cVar);
                    if (uVar.f1179c >= d2.f1179c) {
                        break loop0;
                    }
                    if (!d2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, uVar, d2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != uVar) {
                            if (d2.e()) {
                                d2.d();
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
        boolean f2 = g1.a.f(c2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f905d;
        if (f2) {
            cVar.p();
            if (kVar.f1179c * e.f917b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) g1.a.d(c2);
        long j5 = kVar3.f1179c;
        if (j5 <= j2) {
            return kVar3;
        }
        long j6 = e.f917b * j5;
        do {
            atomicLongFieldUpdater = f904c;
            j3 = atomicLongFieldUpdater.get(cVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * e.f917b >= atomicLongFieldUpdater2.get(cVar)) {
            return null;
        }
        kVar3.a();
        return null;
    }

    public static final int c(c cVar, k kVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        cVar.getClass();
        kVar.m(i2, obj);
        if (z2) {
            return cVar.x(kVar, i2, obj, j2, obj2, z2);
        }
        Object k2 = kVar.k(i2);
        if (k2 == null) {
            if (cVar.e(j2)) {
                if (kVar.j(i2, null, e.f919d)) {
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
        } else if (k2 instanceof c0) {
            kVar.m(i2, null);
            if (cVar.u(k2, obj)) {
                kVar.n(i2, e.f924i);
                return 0;
            }
            C0.a aVar = e.f926k;
            if (kVar.f941f.getAndSet((i2 * 2) + 1, aVar) != aVar) {
                kVar.l(i2, true);
            }
            return 5;
        }
        return cVar.x(kVar, i2, obj, j2, obj2, z2);
    }

    public static void n(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f907f;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean v(Object obj) {
        if (obj instanceof InterfaceC0016d) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e.a((InterfaceC0016d) obj, K0.i.f206a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    @Override // d1.s
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // d1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Object obj) {
        k kVar;
        k kVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f904c;
        boolean z2 = o(atomicLongFieldUpdater.get(this), false) ? false : !e(r0 & 1152921504606846975L);
        i iVar = j.f939a;
        if (!z2) {
            D0.j jVar = e.f925j;
            k kVar3 = (k) f908g.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean o2 = o(andIncrement, false);
                int i2 = e.f917b;
                long j3 = i2;
                long j4 = j2 / j3;
                int i3 = (int) (j2 % j3);
                if (kVar3.f1179c != j4) {
                    k b2 = b(this, j4, kVar3);
                    if (b2 != null) {
                        kVar = b2;
                    } else if (o2) {
                        return new h(l());
                    }
                } else {
                    kVar = kVar3;
                }
                k kVar4 = kVar;
                int c2 = c(this, kVar, i3, obj, j2, jVar, o2);
                K0.i iVar2 = K0.i.f206a;
                if (c2 == 0) {
                    kVar4.a();
                    break;
                }
                if (c2 == 1) {
                    break;
                }
                if (c2 == 2) {
                    if (o2) {
                        kVar4.h();
                        return new h(l());
                    }
                    c0 c0Var = jVar instanceof c0 ? (c0) jVar : null;
                    if (c0Var != null) {
                        kVar2 = kVar4;
                        c0Var.a(kVar2, i3 + i2);
                    } else {
                        kVar2 = kVar4;
                    }
                    kVar2.h();
                    return iVar;
                }
                if (c2 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (c2 == 4) {
                    if (j2 < f905d.get(this)) {
                        kVar4.a();
                    }
                    return new h(l());
                }
                if (c2 == 5) {
                    kVar4.a();
                }
                kVar3 = kVar4;
            }
        } else {
            return iVar;
        }
    }

    public final boolean e(long j2) {
        return j2 < f906e.get(this) || j2 < f905d.get(this) + ((long) this.f913a);
    }

    public final boolean f(Throwable th, boolean z2) {
        boolean z3;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f904c;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                k kVar = e.f916a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (1 << 60) + (j6 & 1152921504606846975L)));
        }
        C0.a aVar = e.f934s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f911j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, th)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != aVar) {
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
        p();
        if (z3) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f912k;
                obj = atomicReferenceFieldUpdater2.get(this);
                C0.a aVar2 = obj == null ? e.f932q : e.f933r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, aVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                kotlin.jvm.internal.p.a(1, obj);
                ((U0.l) obj).invoke(k());
            }
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (d1.k) ((g1.d) g1.d.f1145b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k g(long j2) {
        Object obj;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f910i.get(this);
        k kVar = (k) f908g.get(this);
        if (kVar.f1179c > ((k) obj2).f1179c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f909h.get(this);
        if (kVar2.f1179c > ((k) obj2).f1179c) {
            obj2 = kVar2;
        }
        g1.d dVar = (g1.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = g1.d.f1144a.get(dVar);
            C0.a aVar = g1.a.f1137b;
            obj = null;
            if (obj3 == aVar) {
                break;
            }
            g1.d dVar2 = (g1.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = g1.d.f1144a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, aVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        k kVar3 = (k) dVar;
        if (q()) {
            k kVar4 = kVar3;
            loop2: do {
                int i2 = e.f917b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (kVar4.f1179c * e.f917b) + i2;
                    if (j3 < f905d.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = kVar4.k(i2);
                        if (k2 != null && k2 != e.f920e) {
                            if (k2 == e.f919d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i2, k2, e.f927l)) {
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
                h(j3);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((g1.d) g1.d.f1145b.get(kVar5))) {
            for (int i3 = e.f917b - 1; -1 < i3; i3--) {
                if ((kVar5.f1179c * e.f917b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = kVar5.k(i3);
                    if (k3 != null && k3 != e.f920e) {
                        if (!(k3 instanceof u)) {
                            if (!(k3 instanceof c0)) {
                                break;
                            }
                            if (kVar5.j(i3, k3, e.f927l)) {
                                obj = g1.a.g(obj, k3);
                                kVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i3, k3, e.f927l)) {
                                obj = g1.a.g(obj, ((u) k3).f949a);
                                kVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i3, k3, e.f927l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    t((c0) arrayList.get(size), true);
                }
            } else {
                t((c0) obj, true);
            }
        }
        return kVar3;
    }

    public final void h(long j2) {
        H.a b2;
        k kVar = (k) f909h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f905d;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f913a + j3, f906e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = e.f917b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (kVar.f1179c != j5) {
                    k j6 = j(j5, kVar);
                    if (j6 == null) {
                        continue;
                    } else {
                        kVar = j6;
                    }
                }
                Object w2 = w(kVar, i2, j3, null);
                if (w2 != e.f930o) {
                    kVar.a();
                    U0.l lVar = this.f914b;
                    if (lVar != null && (b2 = g1.a.b(lVar, w2, null)) != null) {
                        throw b2;
                    }
                } else if (j3 < m()) {
                    kVar.a();
                }
            }
        }
    }

    public final void i() {
        Object c2;
        if (r()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f910i;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f906e.getAndIncrement(this);
            long j2 = andIncrement / e.f917b;
            if (m() <= andIncrement) {
                if (kVar.f1179c < j2 && kVar.b() != null) {
                    s(j2, kVar);
                }
                n(this);
                return;
            }
            if (kVar.f1179c != j2) {
                d dVar = d.f915a;
                while (true) {
                    c2 = g1.a.c(j2, kVar);
                    if (!g1.a.f(c2)) {
                        g1.u d2 = g1.a.d(c2);
                        while (true) {
                            g1.u uVar = (g1.u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f1179c >= d2.f1179c) {
                                break;
                            }
                            if (!d2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d2)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (d2.e()) {
                                        d2.d();
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
                k kVar2 = null;
                if (g1.a.f(c2)) {
                    p();
                    s(j2, kVar);
                    n(this);
                } else {
                    k kVar3 = (k) g1.a.d(c2);
                    long j3 = kVar3.f1179c;
                    if (j3 > j2) {
                        long j4 = j3 * e.f917b;
                        if (f906e.compareAndSet(this, andIncrement + 1, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f907f;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            n(this);
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
            int i2 = (int) (andIncrement % e.f917b);
            Object k2 = kVar.k(i2);
            boolean z2 = k2 instanceof c0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f905d;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i2, k2, e.f922g)) {
                while (true) {
                    Object k3 = kVar.k(i2);
                    if (!(k3 instanceof c0)) {
                        if (k3 != e.f925j) {
                            if (k3 != null) {
                                if (k3 == e.f919d || k3 == e.f923h || k3 == e.f924i || k3 == e.f926k || k3 == e.f927l) {
                                    break loop0;
                                }
                                if (k3 != e.f921f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (kVar.j(i2, k3, e.f920e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i2, k3, new u((c0) k3))) {
                            break loop0;
                        }
                    } else if (kVar.j(i2, k3, e.f922g)) {
                        if (v(k3)) {
                            kVar.n(i2, e.f919d);
                            break;
                        } else {
                            kVar.n(i2, e.f925j);
                            kVar.h();
                        }
                    }
                }
            } else if (v(k2)) {
                kVar.n(i2, e.f919d);
                break;
            } else {
                kVar.n(i2, e.f925j);
                kVar.h();
                n(this);
            }
        }
        n(this);
    }

    public final k j(long j2, k kVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        k kVar2 = e.f916a;
        d dVar = d.f915a;
        loop0: while (true) {
            c2 = g1.a.c(j2, kVar);
            if (!g1.a.f(c2)) {
                g1.u d2 = g1.a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f909h;
                    g1.u uVar = (g1.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1179c >= d2.f1179c) {
                        break loop0;
                    }
                    if (!d2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d2)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (d2.e()) {
                                d2.d();
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
        if (g1.a.f(c2)) {
            p();
            if (kVar.f1179c * e.f917b >= m()) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) g1.a.d(c2);
        boolean r2 = r();
        long j4 = kVar3.f1179c;
        if (!r2 && j2 <= f906e.get(this) / e.f917b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f910i;
                g1.u uVar2 = (g1.u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f1179c >= j4 || !kVar3.i()) {
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
        long j5 = e.f917b * j4;
        do {
            atomicLongFieldUpdater = f905d;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * e.f917b >= m()) {
            return null;
        }
        kVar3.a();
        return null;
    }

    public final Throwable k() {
        return (Throwable) f911j.get(this);
    }

    public final Throwable l() {
        Throwable k2 = k();
        return k2 == null ? new m("Channel was closed") : k2;
    }

    public final long m() {
        return f904c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (d1.k) ((g1.d) g1.d.f1145b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f905d;
        if (i2 == 2) {
            g(j2 & 1152921504606846975L);
            if (z2) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f909h;
                    k kVar = (k) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (m() <= j3) {
                        break;
                    }
                    long j4 = e.f917b;
                    long j5 = j3 / j4;
                    if (kVar.f1179c != j5 && (kVar = j(j5, kVar)) == null) {
                        if (((k) atomicReferenceFieldUpdater.get(this)).f1179c < j5) {
                            break;
                        }
                    } else {
                        kVar.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            Object k2 = kVar.k(i3);
                            if (k2 == null || k2 == e.f920e) {
                                if (kVar.j(i3, k2, e.f923h)) {
                                    i();
                                    break;
                                }
                            } else {
                                if (k2 == e.f919d) {
                                    return false;
                                }
                                if (k2 != e.f925j && k2 != e.f927l && k2 != e.f924i && k2 != e.f923h) {
                                    if (k2 == e.f922g) {
                                        return false;
                                    }
                                    if (k2 != e.f921f && j3 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f905d.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(C0.g.g(i2, "unexpected close status: ").toString());
            }
            k g2 = g(j2 & 1152921504606846975L);
            H.a aVar = null;
            Object obj = null;
            loop0: do {
                int i4 = e.f917b - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    long j6 = (g2.f1179c * e.f917b) + i4;
                    while (true) {
                        Object k3 = g2.k(i4);
                        if (k3 == e.f924i) {
                            break loop0;
                        }
                        C0.a aVar2 = e.f919d;
                        AtomicReferenceArray atomicReferenceArray = g2.f941f;
                        U0.l lVar = this.f914b;
                        if (k3 == aVar2) {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (g2.j(i4, k3, e.f927l)) {
                                if (lVar != null) {
                                    aVar = g1.a.b(lVar, atomicReferenceArray.get(i4 * 2), aVar);
                                }
                                g2.m(i4, null);
                                g2.h();
                            }
                        } else if (k3 == e.f920e || k3 == null) {
                            if (g2.j(i4, k3, e.f927l)) {
                                g2.h();
                                break;
                            }
                        } else if (!(k3 instanceof c0) && !(k3 instanceof u)) {
                            C0.a aVar3 = e.f922g;
                            if (k3 == aVar3 || k3 == e.f921f) {
                                break loop0;
                            }
                            if (k3 != aVar3) {
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            c0 c0Var = k3 instanceof u ? ((u) k3).f949a : (c0) k3;
                            if (g2.j(i4, k3, e.f927l)) {
                                if (lVar != null) {
                                    aVar = g1.a.b(lVar, atomicReferenceArray.get(i4 * 2), aVar);
                                }
                                obj = g1.a.g(obj, c0Var);
                                g2.m(i4, null);
                                g2.h();
                            }
                        }
                    }
                    i4--;
                }
            } while (g2 != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        t((c0) arrayList.get(size), false);
                    }
                } else {
                    t((c0) obj, false);
                }
            }
            if (aVar != null) {
                throw aVar;
            }
        }
        return true;
    }

    public final boolean p() {
        return o(f904c.get(this), false);
    }

    public boolean q() {
        return false;
    }

    public final boolean r() {
        long j2 = f906e.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(long j2, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f1179c < j2 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f910i;
                    g1.u uVar = (g1.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1179c >= kVar.f1179c) {
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

    public final void t(c0 c0Var, boolean z2) {
        Throwable l2;
        if (c0Var instanceof InterfaceC0016d) {
            M0.d dVar = (M0.d) c0Var;
            if (z2) {
                l2 = k();
                if (l2 == null) {
                    l2 = new l("Channel was closed");
                }
            } else {
                l2 = l();
            }
            dVar.f(V.a.k(l2));
            return;
        }
        if (!(c0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + c0Var).toString());
        }
        a aVar = (a) c0Var;
        C0017e c0017e = aVar.f902b;
        kotlin.jvm.internal.j.b(c0017e);
        aVar.f902b = null;
        aVar.f901a = e.f927l;
        Throwable k2 = aVar.f903c.k();
        if (k2 == null) {
            c0017e.f(Boolean.FALSE);
        } else {
            c0017e.f(V.a.k(k2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (d1.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a1, code lost:
    
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f904c.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f913a + ',');
        sb.append("data=[");
        int i3 = 0;
        List O2 = L0.e.O(f909h.get(this), f908g.get(this), f910i.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : O2) {
            if (((k) obj2) != e.f916a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((k) next).f1179c;
            do {
                Object next2 = it.next();
                long j3 = ((k) next2).f1179c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j4 = f905d.get(this);
        long m2 = m();
        loop2: while (true) {
            int i4 = e.f917b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (kVar.f1179c * e.f917b) + i5;
                if (j5 >= m2 && j5 >= j4) {
                    break loop2;
                }
                Object k2 = kVar.k(i5);
                Object obj3 = kVar.f941f.get(i5 * 2);
                if (k2 instanceof InterfaceC0016d) {
                    obj = (j5 >= j4 || j5 < m2) ? (j5 >= m2 || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof u) {
                    obj = "EB(" + k2 + ')';
                } else if (kotlin.jvm.internal.j.a(k2, e.f921f) ? true : kotlin.jvm.internal.j.a(k2, e.f922g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? true : k2.equals(e.f920e) ? true : kotlin.jvm.internal.j.a(k2, e.f924i) ? true : kotlin.jvm.internal.j.a(k2, e.f923h) ? true : kotlin.jvm.internal.j.a(k2, e.f926k) ? true : kotlin.jvm.internal.j.a(k2, e.f925j) ? true : kotlin.jvm.internal.j.a(k2, e.f927l)) {
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
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(a1.h.P(sb)) == ',') {
            kotlin.jvm.internal.j.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0016d)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0016d interfaceC0016d = (InterfaceC0016d) obj;
            U0.l lVar = this.f914b;
            return e.a(interfaceC0016d, obj2, lVar != null ? new g1.p(lVar, obj2, ((C0017e) interfaceC0016d).f659e) : null);
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0017e c0017e = aVar.f902b;
        kotlin.jvm.internal.j.b(c0017e);
        aVar.f902b = null;
        aVar.f901a = obj2;
        Boolean bool = Boolean.TRUE;
        U0.l lVar2 = aVar.f903c.f914b;
        return e.a(c0017e, bool, lVar2 != null ? new g1.p(lVar2, obj2, c0017e.f659e) : null);
    }

    public final Object w(k kVar, int i2, long j2, a aVar) {
        Object k2 = kVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = kVar.f941f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f904c;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (aVar == null) {
                    return e.f929n;
                }
                if (kVar.j(i2, k2, aVar)) {
                    i();
                    return e.f928m;
                }
            }
        } else if (k2 == e.f919d && kVar.j(i2, k2, e.f924i)) {
            i();
            Object obj = atomicReferenceArray.get(i2 * 2);
            kVar.m(i2, null);
            return obj;
        }
        while (true) {
            Object k3 = kVar.k(i2);
            if (k3 == null || k3 == e.f920e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i2, k3, e.f923h)) {
                        i();
                        return e.f930o;
                    }
                } else {
                    if (aVar == null) {
                        return e.f929n;
                    }
                    if (kVar.j(i2, k3, aVar)) {
                        i();
                        return e.f928m;
                    }
                }
            } else if (k3 != e.f919d) {
                C0.a aVar2 = e.f925j;
                if (k3 == aVar2) {
                    return e.f930o;
                }
                if (k3 == e.f923h) {
                    return e.f930o;
                }
                if (k3 == e.f927l) {
                    i();
                    return e.f930o;
                }
                if (k3 != e.f922g && kVar.j(i2, k3, e.f921f)) {
                    boolean z2 = k3 instanceof u;
                    if (z2) {
                        k3 = ((u) k3).f949a;
                    }
                    if (v(k3)) {
                        kVar.n(i2, e.f924i);
                        i();
                        Object obj2 = atomicReferenceArray.get(i2 * 2);
                        kVar.m(i2, null);
                        return obj2;
                    }
                    kVar.n(i2, aVar2);
                    kVar.h();
                    if (z2) {
                        i();
                    }
                    return e.f930o;
                }
            } else if (kVar.j(i2, k3, e.f924i)) {
                i();
                Object obj3 = atomicReferenceArray.get(i2 * 2);
                kVar.m(i2, null);
                return obj3;
            }
        }
    }

    public final int x(k kVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        while (true) {
            Object k2 = kVar.k(i2);
            if (k2 == null) {
                if (!e(j2) || z2) {
                    if (z2) {
                        if (kVar.j(i2, null, e.f925j)) {
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
                } else if (kVar.j(i2, null, e.f919d)) {
                    return 1;
                }
            } else {
                if (k2 != e.f920e) {
                    C0.a aVar = e.f926k;
                    if (k2 == aVar) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == e.f923h) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == e.f927l) {
                        kVar.m(i2, null);
                        p();
                        return 4;
                    }
                    kVar.m(i2, null);
                    if (k2 instanceof u) {
                        k2 = ((u) k2).f949a;
                    }
                    if (u(k2, obj)) {
                        kVar.n(i2, e.f924i);
                        return 0;
                    }
                    if (kVar.f941f.getAndSet((i2 * 2) + 1, aVar) == aVar) {
                        return 5;
                    }
                    kVar.l(i2, true);
                    return 5;
                }
                if (kVar.j(i2, k2, e.f919d)) {
                    return 1;
                }
            }
        }
    }
}
