package F4;

import D4.AbstractC0024y;
import D4.C0007g;
import D4.InterfaceC0006f;
import D4.x0;
import G0.C0051a;
import I4.u;
import b0.InterfaceC0263d;
import b2.AbstractC0279e;
import f4.v;
import g4.AbstractC0466k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f694c = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f695d = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f696e = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f697f = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f698g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f699h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f700i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f701j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f702k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    public final int f703a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1441l f704b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i2, InterfaceC1441l interfaceC1441l) {
        this.f703a = i2;
        this.f704b = interfaceC1441l;
        if (i2 < 0) {
            throw new IllegalArgumentException(B0.o.g(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        j jVar = d.f706a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f696e.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (v()) {
            jVar2 = d.f706a;
            kotlin.jvm.internal.i.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f724s;
    }

    public static boolean A(Object obj) {
        if (obj instanceof InterfaceC0006f) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0006f) obj, v.f5689a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final j a(b bVar, long j2, j jVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        long j7;
        bVar.getClass();
        j jVar2 = d.f706a;
        c cVar = c.f705a;
        loop0: while (true) {
            c2 = I4.a.c(jVar, j2, cVar);
            if (!I4.a.f(c2)) {
                u d6 = I4.a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f698g;
                    u uVar = (u) atomicReferenceFieldUpdater.get(bVar);
                    if (uVar.f1323c >= d6.f1323c) {
                        break loop0;
                    }
                    if (!d6.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, uVar, d6)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != uVar) {
                            if (d6.e()) {
                                d6.d();
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
        boolean f3 = I4.a.f(c2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f695d;
        if (f3) {
            bVar.t();
            if (jVar.f1323c * d.f707b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) I4.a.d(c2);
        long j8 = jVar3.f1323c;
        if (j8 <= j2) {
            return jVar3;
        }
        long j9 = d.f707b * j8;
        do {
            atomicLongFieldUpdater = f694c;
            j6 = atomicLongFieldUpdater.get(bVar);
            j7 = 1152921504606846975L & j6;
            if (j7 >= j9) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j6, j7 + (((int) (j6 >> 60)) << 60)));
        if (j8 * d.f707b >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void c(b bVar, Object obj, C0007g c0007g) {
        C1.b a6;
        InterfaceC1441l interfaceC1441l = bVar.f704b;
        if (interfaceC1441l != null && (a6 = I4.a.a(interfaceC1441l, obj, null)) != null) {
            AbstractC0024y.j(a6, c0007g.f512e);
        }
        c0007g.resumeWith(e5.g.l(bVar.p()));
    }

    public static final int d(b bVar, j jVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        bVar.getClass();
        jVar.m(i2, obj);
        if (z) {
            return bVar.C(jVar, i2, obj, j2, obj2, z);
        }
        Object k3 = jVar.k(i2);
        if (k3 == null) {
            if (bVar.f(j2)) {
                if (jVar.j(null, i2, d.f709d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof x0) {
            jVar.m(i2, null);
            if (bVar.z(k3, obj)) {
                jVar.n(i2, d.f714i);
                return 0;
            }
            C0051a c0051a = d.f716k;
            if (jVar.f731f.getAndSet((i2 * 2) + 1, c0051a) != c0051a) {
                jVar.l(i2, true);
            }
            return 5;
        }
        return bVar.C(jVar, i2, obj, j2, obj2, z);
    }

    public static void r(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f697f;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object B(j jVar, int i2, long j2, Object obj) {
        Object k3 = jVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = jVar.f731f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f694c;
        if (k3 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f719n;
                }
                if (jVar.j(k3, i2, obj)) {
                    l();
                    return d.f718m;
                }
            }
        } else if (k3 == d.f709d && jVar.j(k3, i2, d.f714i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            jVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k6 = jVar.k(i2);
            if (k6 == null || k6 == d.f710e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(k6, i2, d.f713h)) {
                        l();
                        return d.f720o;
                    }
                } else {
                    if (obj == null) {
                        return d.f719n;
                    }
                    if (jVar.j(k6, i2, obj)) {
                        l();
                        return d.f718m;
                    }
                }
            } else if (k6 != d.f709d) {
                C0051a c0051a = d.f715j;
                if (k6 == c0051a) {
                    return d.f720o;
                }
                if (k6 == d.f713h) {
                    return d.f720o;
                }
                if (k6 == d.f717l) {
                    l();
                    return d.f720o;
                }
                if (k6 != d.f712g && jVar.j(k6, i2, d.f711f)) {
                    boolean z = k6 instanceof t;
                    if (z) {
                        k6 = ((t) k6).f740a;
                    }
                    if (A(k6)) {
                        jVar.n(i2, d.f714i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        jVar.m(i2, null);
                        return obj3;
                    }
                    jVar.n(i2, c0051a);
                    jVar.h();
                    if (z) {
                        l();
                    }
                    return d.f720o;
                }
            } else if (jVar.j(k6, i2, d.f714i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                jVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int C(j jVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object k3 = jVar.k(i2);
            if (k3 == null) {
                if (!f(j2) || z) {
                    if (z) {
                        if (jVar.j(null, i2, d.f715j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(null, i2, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(null, i2, d.f709d)) {
                    return 1;
                }
            } else {
                if (k3 != d.f710e) {
                    C0051a c0051a = d.f716k;
                    if (k3 == c0051a) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k3 == d.f713h) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k3 == d.f717l) {
                        jVar.m(i2, null);
                        t();
                        return 4;
                    }
                    jVar.m(i2, null);
                    if (k3 instanceof t) {
                        k3 = ((t) k3).f740a;
                    }
                    if (z(k3, obj)) {
                        jVar.n(i2, d.f714i);
                        return 0;
                    }
                    if (jVar.f731f.getAndSet((i2 * 2) + 1, c0051a) == c0051a) {
                        return 5;
                    }
                    jVar.l(i2, true);
                    return 5;
                }
                if (jVar.j(k3, i2, d.f709d)) {
                    return 1;
                }
            }
        }
    }

    public final void D(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        long j7;
        if (v()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f696e;
        } while (atomicLongFieldUpdater.get(this) <= j2);
        int i2 = d.f708c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f697f;
            if (i3 >= i2) {
                do {
                    j6 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j6, 4611686018427387904L + (j6 & 4611686018427387903L)));
                while (true) {
                    long j8 = atomicLongFieldUpdater.get(this);
                    long j9 = atomicLongFieldUpdater2.get(this);
                    long j10 = j9 & 4611686018427387903L;
                    boolean z = (j9 & 4611686018427387904L) != 0;
                    if (j8 == j10 && j8 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j9, j10 + 4611686018427387904L);
                    }
                }
                do {
                    j7 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j7, j7 & 4611686018427387903L));
                return;
            }
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j11 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // F4.r
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [D4.g] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r18v0, types: [F4.b, java.lang.Object] */
    @Override // F4.r
    public final Object e(InterfaceC1218d interfaceC1218d) {
        j jVar;
        ?? r15;
        Object B5;
        C0007g c0007g;
        I4.p pVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f699h;
        j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f694c;
            if (s(atomicLongFieldUpdater.get(this), true)) {
                Throwable o2 = o();
                int i2 = I4.v.f1324a;
                throw o2;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f695d;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j2 = d.f707b;
            long j6 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (jVar2.f1323c != j6) {
                j m6 = m(j6, jVar2);
                if (m6 == null) {
                    continue;
                } else {
                    jVar = m6;
                }
            } else {
                jVar = jVar2;
            }
            Object B6 = B(jVar, i3, andIncrement, null);
            C0051a c0051a = d.f718m;
            if (B6 == c0051a) {
                throw new IllegalStateException("unexpected");
            }
            C0051a c0051a2 = d.f720o;
            if (B6 != c0051a2) {
                if (B6 != d.f719n) {
                    jVar.a();
                    return B6;
                }
                C0007g i6 = AbstractC0024y.i(B0.f.F(interfaceC1218d));
                try {
                    B5 = B(jVar, i3, andIncrement, i6);
                } catch (Throwable th) {
                    th = th;
                    r15 = i6;
                }
                try {
                    if (B5 == c0051a) {
                        c0007g = i6;
                        c0007g.a(jVar, i3);
                    } else {
                        c0007g = i6;
                        InterfaceC1441l interfaceC1441l = this.f704b;
                        InterfaceC1223i interfaceC1223i = c0007g.f512e;
                        if (B5 == c0051a2) {
                            if (andIncrement < q()) {
                                jVar.a();
                            }
                            j jVar3 = (j) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (s(atomicLongFieldUpdater.get(this), true)) {
                                    c0007g.resumeWith(e5.g.l(o()));
                                    break;
                                }
                                long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                long j7 = d.f707b;
                                AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                long j8 = andIncrement2 / j7;
                                int i7 = (int) (andIncrement2 % j7);
                                if (jVar3.f1323c != j8) {
                                    j m7 = m(j8, jVar3);
                                    if (m7 == null) {
                                        continue;
                                        atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    } else {
                                        jVar3 = m7;
                                    }
                                }
                                InterfaceC1223i interfaceC1223i2 = interfaceC1223i;
                                InterfaceC1441l interfaceC1441l2 = interfaceC1441l;
                                B5 = B(jVar3, i7, andIncrement2, c0007g);
                                if (B5 == d.f718m) {
                                    c0007g.a(jVar3, i7);
                                    break;
                                }
                                if (B5 == d.f720o) {
                                    if (andIncrement2 < q()) {
                                        jVar3.a();
                                    }
                                    interfaceC1223i = interfaceC1223i2;
                                    interfaceC1441l = interfaceC1441l2;
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                } else {
                                    if (B5 == d.f719n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    jVar3.a();
                                    pVar = interfaceC1441l2 != null ? new I4.p(interfaceC1441l2, B5, interfaceC1223i2) : null;
                                }
                            }
                        } else {
                            jVar.a();
                            pVar = interfaceC1441l != null ? new I4.p(interfaceC1441l, B5, interfaceC1223i) : null;
                        }
                        c0007g.f(B5, pVar);
                    }
                    Object r5 = c0007g.r();
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    return r5;
                } catch (Throwable th2) {
                    th = th2;
                    r15 = c0051a;
                    r15.z();
                    throw th;
                }
            }
            if (andIncrement < q()) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }

    public final boolean f(long j2) {
        return j2 < f696e.get(this) || j2 < f695d.get(this) + ((long) this.f703a);
    }

    public final boolean g(Throwable th, boolean z) {
        boolean z5;
        long j2;
        long j6;
        long j7;
        Object obj;
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f694c;
        if (z) {
            do {
                j9 = atomicLongFieldUpdater.get(this);
                if (((int) (j9 >> 60)) != 0) {
                    break;
                }
                j jVar = d.f706a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j9, (1 << 60) + (j9 & 1152921504606846975L)));
        }
        C0051a c0051a = d.f724s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f701j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c0051a, th)) {
                z5 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c0051a) {
                z5 = false;
                break;
            }
        }
        if (z) {
            do {
                j8 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j8, (3 << 60) + (j8 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j6 = j2 & 1152921504606846975L;
                    j7 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j6 = j2 & 1152921504606846975L;
                    j7 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, (j7 << 60) + j6));
        }
        t();
        if (z5) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f702k;
                obj = atomicReferenceFieldUpdater2.get(this);
                C0051a c0051a2 = obj == null ? d.f722q : d.f723r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c0051a2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                kotlin.jvm.internal.v.b(1, obj);
                ((InterfaceC1441l) obj).invoke(n());
            }
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // F4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(Object obj) {
        j jVar;
        j jVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f694c;
        boolean z = s(atomicLongFieldUpdater.get(this), false) ? false : !f(r0 & 1152921504606846975L);
        h hVar = i.f729a;
        if (!z) {
            InterfaceC0263d interfaceC0263d = d.f715j;
            j jVar3 = (j) f698g.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean s2 = s(andIncrement, false);
                int i2 = d.f707b;
                long j6 = i2;
                long j7 = j2 / j6;
                int i3 = (int) (j2 % j6);
                if (jVar3.f1323c != j7) {
                    j a6 = a(this, j7, jVar3);
                    if (a6 != null) {
                        jVar = a6;
                    } else if (s2) {
                        return new g(p());
                    }
                } else {
                    jVar = jVar3;
                }
                j jVar4 = jVar;
                int d6 = d(this, jVar, i3, obj, j2, interfaceC0263d, s2);
                v vVar = v.f5689a;
                if (d6 == 0) {
                    jVar4.a();
                    break;
                }
                if (d6 == 1) {
                    break;
                }
                if (d6 == 2) {
                    if (s2) {
                        jVar4.h();
                        return new g(p());
                    }
                    x0 x0Var = interfaceC0263d instanceof x0 ? (x0) interfaceC0263d : null;
                    if (x0Var != null) {
                        jVar2 = jVar4;
                        x0Var.a(jVar2, i3 + i2);
                    } else {
                        jVar2 = jVar4;
                    }
                    jVar2.h();
                    return hVar;
                }
                if (d6 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (d6 == 4) {
                    if (j2 < f695d.get(this)) {
                        jVar4.a();
                    }
                    return new g(p());
                }
                if (d6 == 5) {
                    jVar4.a();
                }
                jVar3 = jVar4;
            }
        } else {
            return hVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        c(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fb, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bc, code lost:
    
        r1.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bf, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0142, code lost:
    
        if (r23 >= r5.get(r26)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0144, code lost:
    
        r21.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0147, code lost:
    
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0149, code lost:
    
        c(r26, r27, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // F4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(Object obj, InterfaceC1218d interfaceC1218d) {
        j jVar;
        Object obj2;
        C0007g c0007g;
        C0007g c0007g2;
        v vVar;
        EnumC1260a enumC1260a;
        C0007g c0007g3;
        j jVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f698g;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f694c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean s2 = s(andIncrement, false);
            int i2 = d.f707b;
            long j6 = i2;
            long j7 = j2 / j6;
            int i3 = (int) (j2 % j6);
            long j8 = jVar3.f1323c;
            v vVar2 = v.f5689a;
            if (j8 != j7) {
                j a6 = a(this, j7, jVar3);
                if (a6 != null) {
                    jVar = a6;
                } else if (s2) {
                    obj2 = x(obj, interfaceC1218d);
                    if (obj2 != EnumC1260a.f11058a) {
                        return vVar2;
                    }
                }
            } else {
                jVar = jVar3;
            }
            j jVar4 = jVar;
            int d6 = d(this, jVar, i3, obj, j2, null, s2);
            if (d6 == 0) {
                jVar4.a();
                return vVar2;
            }
            if (d6 == 1) {
                break;
            }
            if (d6 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f695d;
                if (d6 == 3) {
                    C0007g i6 = AbstractC0024y.i(B0.f.F(interfaceC1218d));
                    try {
                        int d7 = d(this, jVar4, i3, obj, j2, i6, false);
                        try {
                            if (d7 != 0) {
                                if (d7 != 1) {
                                    if (d7 == 2) {
                                        c0007g2 = i6;
                                        vVar = vVar2;
                                        c0007g2.a(jVar4, i3 + i2);
                                    } else if (d7 == 4) {
                                        c0007g2 = i6;
                                        vVar = vVar2;
                                        if (j2 < atomicLongFieldUpdater2.get(this)) {
                                            jVar4.a();
                                        }
                                        c(this, obj, c0007g2);
                                    } else {
                                        if (d7 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar4.a();
                                        j jVar5 = (j) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j9 = andIncrement2 & 1152921504606846975L;
                                            boolean s4 = s(andIncrement2, false);
                                            int i7 = d.f707b;
                                            long j10 = i7;
                                            long j11 = j9 / j10;
                                            int i8 = (int) (j9 % j10);
                                            if (jVar5.f1323c != j11) {
                                                try {
                                                    j a7 = a(this, j11, jVar5);
                                                    if (a7 != null) {
                                                        c0007g3 = i6;
                                                        jVar2 = a7;
                                                    } else if (s4) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0007g c0007g4 = i6;
                                                }
                                            } else {
                                                c0007g3 = i6;
                                                jVar2 = jVar5;
                                            }
                                            i6 = c0007g3;
                                            j jVar6 = jVar2;
                                            int d8 = d(this, jVar2, i8, obj, j9, i6, s4);
                                            if (d8 == 0) {
                                                c0007g2 = i6;
                                                vVar = vVar2;
                                                jVar6.a();
                                                break;
                                            }
                                            if (d8 == 1) {
                                                break;
                                            }
                                            if (d8 == 2) {
                                                c0007g2 = i6;
                                                if (s4) {
                                                    jVar6.h();
                                                } else {
                                                    c0007g2.a(jVar6, i8 + i7);
                                                }
                                            } else {
                                                if (d8 == 3) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                if (d8 == 4) {
                                                    break;
                                                }
                                                if (d8 == 5) {
                                                    jVar6.a();
                                                }
                                                jVar5 = jVar6;
                                            }
                                        }
                                        vVar = vVar2;
                                    }
                                    obj2 = c0007g2.r();
                                    enumC1260a = EnumC1260a.f11058a;
                                    if (obj2 != enumC1260a) {
                                        obj2 = vVar;
                                    }
                                    if (obj2 != enumC1260a) {
                                        return vVar;
                                    }
                                }
                                c0007g2 = i6;
                                vVar = vVar2;
                                c0007g2.resumeWith(vVar);
                                obj2 = c0007g2.r();
                                enumC1260a = EnumC1260a.f11058a;
                                if (obj2 != enumC1260a) {
                                }
                                if (obj2 != enumC1260a) {
                                }
                            } else {
                                c0007g2 = i6;
                                vVar = vVar2;
                                jVar4.a();
                            }
                            c0007g2.resumeWith(vVar);
                            obj2 = c0007g2.r();
                            enumC1260a = EnumC1260a.f11058a;
                            if (obj2 != enumC1260a) {
                            }
                            if (obj2 != enumC1260a) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c0007g = d7;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c0007g = i6;
                    }
                } else if (d6 != 4) {
                    if (d6 == 5) {
                        jVar4.a();
                    }
                    jVar3 = jVar4;
                } else {
                    if (j2 < atomicLongFieldUpdater2.get(this)) {
                        jVar4.a();
                    }
                    Object x5 = x(obj, interfaceC1218d);
                    if (x5 == EnumC1260a.f11058a) {
                        return x5;
                    }
                }
            } else {
                if (!s2) {
                    return vVar2;
                }
                jVar4.h();
                obj2 = x(obj, interfaceC1218d);
                if (obj2 != EnumC1260a.f11058a) {
                    return vVar2;
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (F4.j) ((I4.d) I4.d.f1289b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j j(long j2) {
        Object obj;
        long j6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f700i.get(this);
        j jVar = (j) f698g.get(this);
        if (jVar.f1323c > ((j) obj2).f1323c) {
            obj2 = jVar;
        }
        j jVar2 = (j) f699h.get(this);
        if (jVar2.f1323c > ((j) obj2).f1323c) {
            obj2 = jVar2;
        }
        I4.d dVar = (I4.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = I4.d.f1288a.get(dVar);
            C0051a c0051a = I4.a.f1281b;
            obj = null;
            if (obj3 == c0051a) {
                break;
            }
            I4.d dVar2 = (I4.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = I4.d.f1288a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, c0051a)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        j jVar3 = (j) dVar;
        if (u()) {
            j jVar4 = jVar3;
            loop2: do {
                int i2 = d.f707b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j6 = (jVar4.f1323c * d.f707b) + i2;
                    if (j6 < f695d.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k3 = jVar4.k(i2);
                        if (k3 != null && k3 != d.f710e) {
                            if (k3 == d.f709d) {
                                break loop2;
                            }
                        } else {
                            if (jVar4.j(k3, i2, d.f717l)) {
                                jVar4.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (jVar4 != null);
            j6 = -1;
            if (j6 != -1) {
                k(j6);
            }
        }
        loop5: for (j jVar5 = jVar3; jVar5 != null; jVar5 = (j) ((I4.d) I4.d.f1289b.get(jVar5))) {
            for (int i3 = d.f707b - 1; -1 < i3; i3--) {
                if ((jVar5.f1323c * d.f707b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k6 = jVar5.k(i3);
                    if (k6 != null && k6 != d.f710e) {
                        if (!(k6 instanceof t)) {
                            if (!(k6 instanceof x0)) {
                                break;
                            }
                            if (jVar5.j(k6, i3, d.f717l)) {
                                obj = I4.a.g(obj, k6);
                                jVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (jVar5.j(k6, i3, d.f717l)) {
                                obj = I4.a.g(obj, ((t) k6).f740a);
                                jVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar5.j(k6, i3, d.f717l)) {
                            jVar5.h();
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
                    y((x0) arrayList.get(size), true);
                }
            } else {
                y((x0) obj, true);
            }
        }
        return jVar3;
    }

    public final void k(long j2) {
        C1.b a6;
        j jVar = (j) f699h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f695d;
            long j6 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f703a + j6, f696e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j6, j6 + 1)) {
                long j7 = d.f707b;
                long j8 = j6 / j7;
                int i2 = (int) (j6 % j7);
                if (jVar.f1323c != j8) {
                    j m6 = m(j8, jVar);
                    if (m6 == null) {
                        continue;
                    } else {
                        jVar = m6;
                    }
                }
                Object B5 = B(jVar, i2, j6, null);
                if (B5 != d.f720o) {
                    jVar.a();
                    InterfaceC1441l interfaceC1441l = this.f704b;
                    if (interfaceC1441l != null && (a6 = I4.a.a(interfaceC1441l, B5, null)) != null) {
                        throw a6;
                    }
                } else if (j6 < q()) {
                    jVar.a();
                }
            }
        }
    }

    public final void l() {
        Object c2;
        if (v()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f700i;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f696e.getAndIncrement(this);
            long j2 = andIncrement / d.f707b;
            if (q() <= andIncrement) {
                if (jVar.f1323c < j2 && jVar.b() != null) {
                    w(j2, jVar);
                }
                r(this);
                return;
            }
            if (jVar.f1323c != j2) {
                c cVar = c.f705a;
                while (true) {
                    c2 = I4.a.c(jVar, j2, cVar);
                    if (!I4.a.f(c2)) {
                        u d6 = I4.a.d(c2);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f1323c >= d6.f1323c) {
                                break;
                            }
                            if (!d6.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d6)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (d6.e()) {
                                        d6.d();
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
                j jVar2 = null;
                if (I4.a.f(c2)) {
                    t();
                    w(j2, jVar);
                    r(this);
                } else {
                    j jVar3 = (j) I4.a.d(c2);
                    long j6 = jVar3.f1323c;
                    if (j6 > j2) {
                        long j7 = j6 * d.f707b;
                        if (f696e.compareAndSet(this, andIncrement + 1, j7)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f697f;
                            if ((atomicLongFieldUpdater.addAndGet(this, j7 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            r(this);
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
            int i2 = (int) (andIncrement % d.f707b);
            Object k3 = jVar.k(i2);
            boolean z = k3 instanceof x0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f695d;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(k3, i2, d.f712g)) {
                while (true) {
                    Object k6 = jVar.k(i2);
                    if (!(k6 instanceof x0)) {
                        if (k6 != d.f715j) {
                            if (k6 != null) {
                                if (k6 == d.f709d || k6 == d.f713h || k6 == d.f714i || k6 == d.f716k || k6 == d.f717l) {
                                    break loop0;
                                }
                                if (k6 != d.f711f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k6).toString());
                                }
                            } else if (jVar.j(k6, i2, d.f710e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (jVar.j(k6, i2, new t((x0) k6))) {
                            break loop0;
                        }
                    } else if (jVar.j(k6, i2, d.f712g)) {
                        if (A(k6)) {
                            jVar.n(i2, d.f709d);
                            break;
                        } else {
                            jVar.n(i2, d.f715j);
                            jVar.h();
                        }
                    }
                }
            } else if (A(k3)) {
                jVar.n(i2, d.f709d);
                break;
            } else {
                jVar.n(i2, d.f715j);
                jVar.h();
                r(this);
            }
        }
        r(this);
    }

    public final j m(long j2, j jVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        j jVar2 = d.f706a;
        c cVar = c.f705a;
        loop0: while (true) {
            c2 = I4.a.c(jVar, j2, cVar);
            if (!I4.a.f(c2)) {
                u d6 = I4.a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f699h;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1323c >= d6.f1323c) {
                        break loop0;
                    }
                    if (!d6.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d6)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (d6.e()) {
                                d6.d();
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
        if (I4.a.f(c2)) {
            t();
            if (jVar.f1323c * d.f707b >= q()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) I4.a.d(c2);
        boolean v4 = v();
        long j7 = jVar3.f1323c;
        if (!v4 && j2 <= f696e.get(this) / d.f707b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f700i;
                u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f1323c >= j7 || !jVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, jVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                        if (jVar3.e()) {
                            jVar3.d();
                        }
                    }
                }
                if (uVar2.e()) {
                    uVar2.d();
                }
            }
        }
        if (j7 <= j2) {
            return jVar3;
        }
        long j8 = d.f707b * j7;
        do {
            atomicLongFieldUpdater = f695d;
            j6 = atomicLongFieldUpdater.get(this);
            if (j6 >= j8) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, j8));
        if (j7 * d.f707b >= q()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public final Throwable n() {
        return (Throwable) f701j.get(this);
    }

    public final Throwable o() {
        Throwable n6 = n();
        return n6 == null ? new k("Channel was closed") : n6;
    }

    public final Throwable p() {
        Throwable n6 = n();
        return n6 == null ? new l("Channel was closed") : n6;
    }

    public final long q() {
        return f694c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (F4.j) ((I4.d) I4.d.f1289b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f695d;
        if (i2 == 2) {
            j(j2 & 1152921504606846975L);
            if (z) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f699h;
                    j jVar = (j) atomicReferenceFieldUpdater.get(this);
                    long j6 = atomicLongFieldUpdater.get(this);
                    if (q() <= j6) {
                        break;
                    }
                    long j7 = d.f707b;
                    long j8 = j6 / j7;
                    if (jVar.f1323c != j8 && (jVar = m(j8, jVar)) == null) {
                        if (((j) atomicReferenceFieldUpdater.get(this)).f1323c < j8) {
                            break;
                        }
                    } else {
                        jVar.a();
                        int i3 = (int) (j6 % j7);
                        while (true) {
                            Object k3 = jVar.k(i3);
                            if (k3 == null || k3 == d.f710e) {
                                if (jVar.j(k3, i3, d.f713h)) {
                                    l();
                                    break;
                                }
                            } else {
                                if (k3 == d.f709d) {
                                    return false;
                                }
                                if (k3 != d.f715j && k3 != d.f717l && k3 != d.f714i && k3 != d.f713h) {
                                    if (k3 == d.f712g) {
                                        return false;
                                    }
                                    if (k3 != d.f711f && j6 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f695d.compareAndSet(this, j6, j6 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(AbstractC0279e.d(i2, "unexpected close status: ").toString());
            }
            j j9 = j(j2 & 1152921504606846975L);
            C1.b bVar = null;
            Object obj = null;
            loop0: do {
                int i6 = d.f707b - 1;
                while (true) {
                    if (-1 >= i6) {
                        break;
                    }
                    long j10 = (j9.f1323c * d.f707b) + i6;
                    while (true) {
                        Object k6 = j9.k(i6);
                        if (k6 == d.f714i) {
                            break loop0;
                        }
                        C0051a c0051a = d.f709d;
                        AtomicReferenceArray atomicReferenceArray = j9.f731f;
                        InterfaceC1441l interfaceC1441l = this.f704b;
                        if (k6 == c0051a) {
                            if (j10 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (j9.j(k6, i6, d.f717l)) {
                                if (interfaceC1441l != null) {
                                    bVar = I4.a.a(interfaceC1441l, atomicReferenceArray.get(i6 * 2), bVar);
                                }
                                j9.m(i6, null);
                                j9.h();
                            }
                        } else if (k6 == d.f710e || k6 == null) {
                            if (j9.j(k6, i6, d.f717l)) {
                                j9.h();
                                break;
                            }
                        } else if (!(k6 instanceof x0) && !(k6 instanceof t)) {
                            C0051a c0051a2 = d.f712g;
                            if (k6 == c0051a2 || k6 == d.f711f) {
                                break loop0;
                            }
                            if (k6 != c0051a2) {
                                break;
                            }
                        } else {
                            if (j10 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            x0 x0Var = k6 instanceof t ? ((t) k6).f740a : (x0) k6;
                            if (j9.j(k6, i6, d.f717l)) {
                                if (interfaceC1441l != null) {
                                    bVar = I4.a.a(interfaceC1441l, atomicReferenceArray.get(i6 * 2), bVar);
                                }
                                obj = I4.a.g(obj, x0Var);
                                j9.m(i6, null);
                                j9.h();
                            }
                        }
                    }
                    i6--;
                }
            } while (j9 != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        y((x0) arrayList.get(size), false);
                    }
                } else {
                    y((x0) obj, false);
                }
            }
            if (bVar != null) {
                throw bVar;
            }
        }
        return true;
    }

    public final boolean t() {
        return s(f694c.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (F4.j) r3.b();
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
        int i2 = (int) (f694c.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f703a + ',');
        sb.append("data=[");
        int i3 = 0;
        List A02 = AbstractC0466k.A0(f699h.get(this), f698g.get(this), f700i.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : A02) {
            if (((j) obj2) != d.f706a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((j) next).f1323c;
            do {
                Object next2 = it.next();
                long j6 = ((j) next2).f1323c;
                if (j2 > j6) {
                    next = next2;
                    j2 = j6;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j7 = f695d.get(this);
        long q5 = q();
        loop2: while (true) {
            int i6 = d.f707b;
            int i7 = i3;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                long j8 = (jVar.f1323c * d.f707b) + i7;
                if (j8 >= q5 && j8 >= j7) {
                    break loop2;
                }
                Object k3 = jVar.k(i7);
                Object obj3 = jVar.f731f.get(i7 * 2);
                if (k3 instanceof InterfaceC0006f) {
                    obj = (j8 >= j7 || j8 < q5) ? (j8 >= q5 || j8 < j7) ? "cont" : "send" : "receive";
                } else if (k3 instanceof t) {
                    obj = "EB(" + k3 + ')';
                } else if (kotlin.jvm.internal.i.a(k3, d.f711f) ? true : kotlin.jvm.internal.i.a(k3, d.f712g)) {
                    obj = "resuming_sender";
                } else if (k3 == null ? true : k3.equals(d.f710e) ? true : kotlin.jvm.internal.i.a(k3, d.f714i) ? true : kotlin.jvm.internal.i.a(k3, d.f713h) ? true : kotlin.jvm.internal.i.a(k3, d.f716k) ? true : kotlin.jvm.internal.i.a(k3, d.f715j) ? true : kotlin.jvm.internal.i.a(k3, d.f717l)) {
                    i7++;
                } else {
                    obj = k3.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i7++;
            }
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(B4.k.U(sb)) == ',') {
            kotlin.jvm.internal.i.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        return false;
    }

    public final boolean v() {
        long j2 = f696e.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(long j2, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f1323c < j2 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f700i;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1323c >= jVar.f1323c) {
                        return;
                    }
                    if (!jVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, jVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (jVar.e()) {
                                jVar.d();
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
            jVar = jVar2;
        }
    }

    public final Object x(Object obj, InterfaceC1218d interfaceC1218d) {
        C1.b a6;
        C0007g c0007g = new C0007g(1, B0.f.F(interfaceC1218d));
        c0007g.s();
        InterfaceC1441l interfaceC1441l = this.f704b;
        if (interfaceC1441l == null || (a6 = I4.a.a(interfaceC1441l, obj, null)) == null) {
            c0007g.resumeWith(e5.g.l(p()));
        } else {
            K1.b.C(a6, p());
            c0007g.resumeWith(e5.g.l(a6));
        }
        Object r5 = c0007g.r();
        return r5 == EnumC1260a.f11058a ? r5 : v.f5689a;
    }

    public final void y(x0 x0Var, boolean z) {
        if (x0Var instanceof InterfaceC0006f) {
            ((InterfaceC1218d) x0Var).resumeWith(e5.g.l(z ? o() : p()));
            return;
        }
        if (!(x0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + x0Var).toString());
        }
        a aVar = (a) x0Var;
        C0007g c0007g = aVar.f692b;
        kotlin.jvm.internal.i.b(c0007g);
        aVar.f692b = null;
        aVar.f691a = d.f717l;
        Throwable n6 = aVar.f693c.n();
        if (n6 == null) {
            c0007g.resumeWith(Boolean.FALSE);
        } else {
            c0007g.resumeWith(e5.g.l(n6));
        }
    }

    public final boolean z(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0006f)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0006f interfaceC0006f = (InterfaceC0006f) obj;
            InterfaceC1441l interfaceC1441l = this.f704b;
            return d.a(interfaceC0006f, obj2, interfaceC1441l != null ? new I4.p(interfaceC1441l, obj2, interfaceC0006f.getContext()) : null);
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0007g c0007g = aVar.f692b;
        kotlin.jvm.internal.i.b(c0007g);
        aVar.f692b = null;
        aVar.f691a = obj2;
        Boolean bool = Boolean.TRUE;
        InterfaceC1441l interfaceC1441l2 = aVar.f693c.f704b;
        return d.a(c0007g, bool, interfaceC1441l2 != null ? new I4.p(interfaceC1441l2, obj2, c0007g.f512e) : null);
    }
}
