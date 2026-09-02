package o0;

import a.AbstractC0018a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.C0048e;
import m0.InterfaceC0047d;
import m0.d0;
import r0.AbstractC0088a;
import r0.v;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1054c = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1055d = AtomicLongFieldUpdater.newUpdater(c.class, "receivers");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1056e = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1057f = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1058g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1059h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1060i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1061j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1062k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: b, reason: collision with root package name */
    public final int f1063b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public c(int i2) {
        this.f1063b = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        k kVar = e.f1065a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f1056e.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment = kVar2;
        this.receiveSegment = kVar2;
        if (r()) {
            kVar2 = e.f1065a;
            g0.h.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = kVar2;
        this._closeCause = e.f1083s;
    }

    public static final k b(c cVar, long j2, k kVar) {
        Object a2;
        c cVar2;
        k kVar2 = e.f1065a;
        d dVar = d.f1064j;
        loop0: while (true) {
            a2 = AbstractC0088a.a(j2, kVar);
            if (!AbstractC0088a.d(a2)) {
                v b2 = AbstractC0088a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1058g;
                    v vVar = (v) atomicReferenceFieldUpdater.get(cVar);
                    if (vVar.f1197c >= b2.f1197c) {
                        break loop0;
                    }
                    if (!b2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, vVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != vVar) {
                            if (b2.e()) {
                                b2.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean d2 = AbstractC0088a.d(a2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1055d;
        if (d2) {
            cVar.p();
            if (kVar.f1197c * e.f1066b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) AbstractC0088a.b(a2);
            long j3 = kVar3.f1197c;
            if (j3 <= j2) {
                return kVar3;
            }
            long j4 = e.f1066b * j3;
            while (true) {
                long j5 = f1054c.get(cVar);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f1054c.compareAndSet(cVar2, j5, (((int) (j5 >> 60)) << 60) + j6)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j3 * e.f1066b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final int c(c cVar, k kVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        kVar.m(i2, obj);
        if (z2) {
            return cVar.x(kVar, i2, obj, j2, obj2, z2);
        }
        Object k2 = kVar.k(i2);
        if (k2 == null) {
            if (cVar.d(j2)) {
                if (kVar.j(i2, null, e.f1068d)) {
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
        } else if (k2 instanceof d0) {
            kVar.m(i2, null);
            if (cVar.u(k2, obj)) {
                kVar.n(i2, e.f1073i);
                return 0;
            }
            io.flutter.plugin.platform.i iVar = e.f1075k;
            if (kVar.f1090f.getAndSet((i2 * 2) + 1, iVar) == iVar) {
                return 5;
            }
            kVar.l(i2, true);
            return 5;
        }
        return cVar.x(kVar, i2, obj, j2, obj2, z2);
    }

    public static void n(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1057f;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean v(Object obj) {
        if (obj instanceof InterfaceC0047d) {
            g0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e.a((InterfaceC0047d) obj, W.g.f394a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    @Override // o0.s
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        e(cancellationException, true);
    }

    public final boolean d(long j2) {
        return j2 < f1056e.get(this) || j2 < f1055d.get(this) + ((long) this.f1063b);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(Throwable th, boolean z2) {
        c cVar;
        io.flutter.plugin.platform.i iVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z3;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1054c;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) == 0) {
                    k kVar = e.f1065a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j6, (j6 & 1152921504606846975L) + (1 << 60)));
            iVar = e.f1083s;
            while (true) {
                atomicReferenceFieldUpdater = f1061j;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, th)) {
                    z3 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != iVar) {
                    z3 = false;
                    break;
                }
            }
            if (z2) {
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
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j2, (j4 << 60) + j3));
            } else {
                do {
                    j5 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j5, (3 << 60) + (j5 & 1152921504606846975L)));
            }
            p();
            if (z3) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1062k;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    io.flutter.plugin.platform.i iVar2 = obj == null ? e.f1081q : e.f1082r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, iVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    g0.n.a(1, obj);
                    ((f0.l) obj).i(k());
                    return z3;
                }
            }
            return z3;
        }
        cVar = this;
        iVar = e.f1083s;
        while (true) {
            atomicReferenceFieldUpdater = f1061j;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, th)) {
            }
        }
        if (z2) {
        }
        p();
        if (z3) {
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (o0.k) ((r0.d) r0.d.f1164b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k f(long j2) {
        Object obj;
        long j3;
        Object obj2 = f1060i.get(this);
        k kVar = (k) f1058g.get(this);
        if (kVar.f1197c > ((k) obj2).f1197c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f1059h.get(this);
        if (kVar2.f1197c > ((k) obj2).f1197c) {
            obj2 = kVar2;
        }
        r0.d dVar = (r0.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r0.d.f1163a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            io.flutter.plugin.platform.i iVar = AbstractC0088a.f1156b;
            obj = null;
            if (obj3 == iVar) {
                break;
            }
            r0.d dVar2 = (r0.d) obj3;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, iVar)) {
                    if (atomicReferenceFieldUpdater.get(dVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            dVar = dVar2;
        }
        k kVar3 = (k) dVar;
        if (q()) {
            k kVar4 = kVar3;
            loop2: do {
                int i2 = e.f1066b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (kVar4.f1197c * e.f1066b) + i2;
                    if (j3 < f1055d.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = kVar4.k(i2);
                        if (k2 != null && k2 != e.f1069e) {
                            if (k2 == e.f1068d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i2, k2, e.f1076l)) {
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
                g(j3);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((r0.d) r0.d.f1164b.get(kVar5))) {
            for (int i3 = e.f1066b - 1; -1 < i3; i3--) {
                if ((kVar5.f1197c * e.f1066b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = kVar5.k(i3);
                    if (k3 != null && k3 != e.f1069e) {
                        if (!(k3 instanceof u)) {
                            if (!(k3 instanceof d0)) {
                                break;
                            }
                            if (kVar5.j(i3, k3, e.f1076l)) {
                                obj = AbstractC0088a.e(obj, k3);
                                kVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i3, k3, e.f1076l)) {
                                obj = AbstractC0088a.e(obj, ((u) k3).f1097a);
                                kVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i3, k3, e.f1076l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                t((d0) obj, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                t((d0) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    public final void g(long j2) {
        k kVar = (k) f1059h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1055d;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f1063b + j3, f1056e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = e.f1066b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (kVar.f1197c != j5) {
                    k j6 = j(j5, kVar);
                    if (j6 != null) {
                        kVar = j6;
                    }
                }
                k kVar2 = kVar;
                if (w(kVar2, i2, j3, null) != e.f1079o) {
                    kVar2.a();
                } else if (j3 < m()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    public final void h() {
        Object a2;
        if (r()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1060i;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f1056e.getAndIncrement(this);
            long j2 = andIncrement / e.f1066b;
            if (m() <= andIncrement) {
                if (kVar.f1197c < j2 && kVar.b() != null) {
                    s(j2, kVar);
                }
                n(this);
                return;
            }
            if (kVar.f1197c != j2) {
                d dVar = d.f1064j;
                while (true) {
                    a2 = AbstractC0088a.a(j2, kVar);
                    if (!AbstractC0088a.d(a2)) {
                        v b2 = AbstractC0088a.b(a2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            if (vVar.f1197c >= b2.f1197c) {
                                break;
                            }
                            if (!b2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b2)) {
                                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                    if (b2.e()) {
                                        b2.d();
                                    }
                                }
                            }
                            if (vVar.e()) {
                                vVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (AbstractC0088a.d(a2)) {
                    p();
                    s(j2, kVar);
                    n(this);
                } else {
                    k kVar3 = (k) AbstractC0088a.b(a2);
                    long j3 = kVar3.f1197c;
                    if (j3 > j2) {
                        long j4 = j3 * e.f1066b;
                        if (f1056e.compareAndSet(this, 1 + andIncrement, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f1057f;
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
            int i2 = (int) (andIncrement % e.f1066b);
            Object k2 = kVar.k(i2);
            boolean z2 = k2 instanceof d0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1055d;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i2, k2, e.f1071g)) {
                while (true) {
                    Object k3 = kVar.k(i2);
                    if (!(k3 instanceof d0)) {
                        if (k3 != e.f1074j) {
                            if (k3 != null) {
                                if (k3 == e.f1068d || k3 == e.f1072h || k3 == e.f1073i || k3 == e.f1075k || k3 == e.f1076l) {
                                    break loop0;
                                }
                                if (k3 != e.f1070f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (kVar.j(i2, k3, e.f1069e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i2, k3, new u((d0) k3))) {
                            break loop0;
                        }
                    } else if (kVar.j(i2, k3, e.f1071g)) {
                        if (v(k3)) {
                            kVar.n(i2, e.f1068d);
                            break;
                        } else {
                            kVar.n(i2, e.f1074j);
                            kVar.h();
                        }
                    }
                }
            } else if (v(k2)) {
                kVar.n(i2, e.f1068d);
                break;
            } else {
                kVar.n(i2, e.f1074j);
                kVar.h();
                n(this);
            }
        }
        n(this);
    }

    @Override // o0.t
    public Object i(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1054c;
        boolean z2 = false;
        long j2 = 1152921504606846975L;
        boolean z3 = o(atomicLongFieldUpdater.get(this), false) ? false : !d(r1 & 1152921504606846975L);
        i iVar = j.f1088a;
        if (z3) {
            return iVar;
        }
        p0.d dVar = e.f1074j;
        k kVar = (k) f1058g.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean o2 = o(andIncrement, z2);
            int i2 = e.f1066b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (kVar.f1197c != j5) {
                k b2 = b(this, j5, kVar);
                if (b2 != null) {
                    kVar = b2;
                } else {
                    if (o2) {
                        return new h(l());
                    }
                    z2 = false;
                    j2 = 1152921504606846975L;
                }
            }
            int c2 = c(this, kVar, i3, obj, j3, dVar, o2);
            W.g gVar = W.g.f394a;
            if (c2 == 0) {
                kVar.a();
                return gVar;
            }
            if (c2 == 1) {
                return gVar;
            }
            if (c2 == 2) {
                if (o2) {
                    kVar.h();
                    return new h(l());
                }
                d0 d0Var = dVar instanceof d0 ? (d0) dVar : null;
                if (d0Var != null) {
                    d0Var.a(kVar, i3 + i2);
                }
                kVar.h();
                return iVar;
            }
            if (c2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (c2 == 4) {
                if (j3 < f1055d.get(this)) {
                    kVar.a();
                }
                return new h(l());
            }
            if (c2 == 5) {
                kVar.a();
            }
            z2 = false;
            j2 = 1152921504606846975L;
        }
    }

    public final k j(long j2, k kVar) {
        Object a2;
        long j3;
        k kVar2 = e.f1065a;
        d dVar = d.f1064j;
        loop0: while (true) {
            a2 = AbstractC0088a.a(j2, kVar);
            if (!AbstractC0088a.d(a2)) {
                v b2 = AbstractC0088a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1059h;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f1197c >= b2.f1197c) {
                        break loop0;
                    }
                    if (!b2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (b2.e()) {
                                b2.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC0088a.d(a2)) {
            p();
            if (kVar.f1197c * e.f1066b < m()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) AbstractC0088a.b(a2);
            long j4 = kVar3.f1197c;
            if (!r() && j2 <= f1056e.get(this) / e.f1066b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1060i;
                    v vVar2 = (v) atomicReferenceFieldUpdater2.get(this);
                    if (vVar2.f1197c >= j4 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, vVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != vVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (vVar2.e()) {
                        vVar2.d();
                    }
                }
            }
            if (j4 <= j2) {
                return kVar3;
            }
            long j5 = j4 * e.f1066b;
            do {
                j3 = f1055d.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!f1055d.compareAndSet(this, j3, j5));
            if (j4 * e.f1066b < m()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable k() {
        return (Throwable) f1061j.get(this);
    }

    public final Throwable l() {
        Throwable k2 = k();
        return k2 == null ? new m("Channel was closed") : k2;
    }

    public final long m() {
        return f1054c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (o0.k) ((r0.d) r0.d.f1164b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1055d;
            if (i2 == 2) {
                f(1152921504606846975L & j2);
                if (z2) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1059h;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (m() <= j3) {
                            break;
                        }
                        long j4 = e.f1066b;
                        long j5 = j3 / j4;
                        if (kVar.f1197c != j5 && (kVar = j(j5, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).f1197c < j5) {
                                break;
                            }
                        } else {
                            kVar.a();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object k2 = kVar.k(i3);
                                if (k2 == null || k2 == e.f1069e) {
                                    if (kVar.j(i3, k2, e.f1072h)) {
                                        h();
                                        break;
                                    }
                                } else {
                                    if (k2 == e.f1068d) {
                                        break;
                                    }
                                    if (k2 != e.f1074j) {
                                        if (k2 != e.f1076l) {
                                            if (k2 != e.f1073i) {
                                                if (k2 != e.f1072h) {
                                                    if (k2 == e.f1071g) {
                                                        break;
                                                    }
                                                    if (k2 != e.f1070f && j3 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f1055d.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(("unexpected close status: " + i2).toString());
                }
                k f2 = f(1152921504606846975L & j2);
                Object obj = null;
                loop0: do {
                    int i4 = e.f1066b - 1;
                    while (true) {
                        if (-1 >= i4) {
                            break;
                        }
                        long j6 = (f2.f1197c * e.f1066b) + i4;
                        while (true) {
                            Object k3 = f2.k(i4);
                            if (k3 == e.f1073i) {
                                break loop0;
                            }
                            if (k3 == e.f1068d) {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (f2.j(i4, k3, e.f1076l)) {
                                    f2.m(i4, null);
                                    f2.h();
                                    break;
                                }
                            } else if (k3 != e.f1069e && k3 != null) {
                                if (!(k3 instanceof d0) && !(k3 instanceof u)) {
                                    io.flutter.plugin.platform.i iVar = e.f1071g;
                                    if (k3 == iVar || k3 == e.f1070f) {
                                        break loop0;
                                    }
                                    if (k3 != iVar) {
                                        break;
                                    }
                                } else {
                                    if (j6 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    d0 d0Var = k3 instanceof u ? ((u) k3).f1097a : (d0) k3;
                                    if (f2.j(i4, k3, e.f1076l)) {
                                        obj = AbstractC0088a.e(obj, d0Var);
                                        f2.m(i4, null);
                                        f2.h();
                                        break;
                                    }
                                }
                            } else if (f2.j(i4, k3, e.f1076l)) {
                                f2.h();
                                break;
                            }
                        }
                        i4--;
                    }
                } while (f2 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            t((d0) arrayList.get(size), false);
                        }
                    } else {
                        t((d0) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean p() {
        return o(f1054c.get(this), false);
    }

    public boolean q() {
        return false;
    }

    public final boolean r() {
        long j2 = f1056e.get(this);
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
        while (kVar.f1197c < j2 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1060i;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f1197c >= kVar.f1197c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (kVar.e()) {
                                kVar.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final void t(d0 d0Var, boolean z2) {
        Throwable l2;
        if (d0Var instanceof InterfaceC0047d) {
            Y.d dVar = (Y.d) d0Var;
            if (z2) {
                l2 = k();
                if (l2 == null) {
                    l2 = new l("Channel was closed");
                }
            } else {
                l2 = l();
            }
            dVar.k(AbstractC0018a.h(l2));
            return;
        }
        if (!(d0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + d0Var).toString());
        }
        a aVar = (a) d0Var;
        C0048e c0048e = aVar.f1052c;
        g0.h.b(c0048e);
        aVar.f1052c = null;
        aVar.f1051b = e.f1076l;
        Throwable k2 = aVar.f1053d.k();
        if (k2 == null) {
            c0048e.k(Boolean.FALSE);
        } else {
            c0048e.k(AbstractC0018a.h(k2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01af, code lost:
    
        r16 = r7;
        r3 = (o0.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b8, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z2;
        String obj;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f1054c.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f1063b + ',');
        sb.append("data=[");
        int i3 = 0;
        boolean z3 = true;
        List asList = Arrays.asList(f1059h.get(this), f1058g.get(this), f1060i.get(this));
        g0.h.d(asList, "asList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : asList) {
            if (((k) obj2) != e.f1065a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((k) next).f1197c;
            do {
                Object next2 = it.next();
                long j3 = ((k) next2).f1197c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j4 = f1055d.get(this);
        long m2 = m();
        loop2: while (true) {
            int i4 = e.f1066b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (kVar.f1197c * e.f1066b) + i5;
                if (j5 >= m2 && j5 >= j4) {
                    break loop2;
                }
                Object k2 = kVar.k(i5);
                boolean z4 = z3;
                Object obj3 = kVar.f1090f.get(i5 * 2);
                if (k2 instanceof InterfaceC0047d) {
                    obj = (j5 >= j4 || j5 < m2) ? (j5 >= m2 || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof u) {
                    obj = "EB(" + k2 + ')';
                } else if (g0.h.a(k2, e.f1070f) ? z4 : g0.h.a(k2, e.f1071g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? z4 : k2.equals(e.f1069e) ? z4 : g0.h.a(k2, e.f1073i) ? z4 : g0.h.a(k2, e.f1072h) ? z4 : g0.h.a(k2, e.f1075k) ? z4 : g0.h.a(k2, e.f1074j) ? z4 : g0.h.a(k2, e.f1076l)) {
                    i5++;
                    z3 = z4;
                } else {
                    obj = k2.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i5++;
                z3 = z4;
            }
            z3 = z2;
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            g0.h.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (obj instanceof InterfaceC0047d) {
                g0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return e.a((InterfaceC0047d) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        g0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0048e c0048e = aVar.f1052c;
        g0.h.b(c0048e);
        aVar.f1052c = null;
        aVar.f1051b = obj2;
        return e.a(c0048e, Boolean.TRUE, null);
    }

    public final Object w(k kVar, int i2, long j2, a aVar) {
        AtomicReferenceArray atomicReferenceArray = kVar.f1090f;
        Object k2 = kVar.k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1054c;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (aVar == null) {
                    return e.f1078n;
                }
                if (kVar.j(i2, k2, aVar)) {
                    h();
                    return e.f1077m;
                }
            }
        } else if (k2 == e.f1068d && kVar.j(i2, k2, e.f1073i)) {
            h();
            Object obj = atomicReferenceArray.get(i2 * 2);
            kVar.m(i2, null);
            return obj;
        }
        while (true) {
            Object k3 = kVar.k(i2);
            if (k3 == null || k3 == e.f1069e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i2, k3, e.f1072h)) {
                        h();
                        return e.f1079o;
                    }
                } else {
                    if (aVar == null) {
                        return e.f1078n;
                    }
                    if (kVar.j(i2, k3, aVar)) {
                        h();
                        return e.f1077m;
                    }
                }
            } else if (k3 != e.f1068d) {
                io.flutter.plugin.platform.i iVar = e.f1074j;
                if (k3 == iVar) {
                    return e.f1079o;
                }
                if (k3 == e.f1072h) {
                    return e.f1079o;
                }
                if (k3 == e.f1076l) {
                    h();
                    return e.f1079o;
                }
                if (k3 != e.f1071g && kVar.j(i2, k3, e.f1070f)) {
                    boolean z2 = k3 instanceof u;
                    if (z2) {
                        k3 = ((u) k3).f1097a;
                    }
                    if (v(k3)) {
                        kVar.n(i2, e.f1073i);
                        h();
                        Object obj2 = atomicReferenceArray.get(i2 * 2);
                        kVar.m(i2, null);
                        return obj2;
                    }
                    kVar.n(i2, iVar);
                    kVar.h();
                    if (z2) {
                        h();
                    }
                    return e.f1079o;
                }
            } else if (kVar.j(i2, k3, e.f1073i)) {
                h();
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
                if (!d(j2) || z2) {
                    if (z2) {
                        if (kVar.j(i2, null, e.f1074j)) {
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
                } else if (kVar.j(i2, null, e.f1068d)) {
                    break;
                }
            } else {
                if (k2 != e.f1069e) {
                    io.flutter.plugin.platform.i iVar = e.f1075k;
                    if (k2 == iVar) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == e.f1072h) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == e.f1076l) {
                        kVar.m(i2, null);
                        p();
                        return 4;
                    }
                    kVar.m(i2, null);
                    if (k2 instanceof u) {
                        k2 = ((u) k2).f1097a;
                    }
                    if (u(k2, obj)) {
                        kVar.n(i2, e.f1073i);
                        return 0;
                    }
                    if (kVar.f1090f.getAndSet((i2 * 2) + 1, iVar) != iVar) {
                        kVar.l(i2, true);
                    }
                    return 5;
                }
                if (kVar.j(i2, k2, e.f1068d)) {
                    break;
                }
            }
        }
        return 1;
    }
}
