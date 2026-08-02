package r4;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.z;
import n.AbstractC2107A;
import o4.AbstractC2227e;
import p4.AbstractC2282w;
import p4.C2268h;
import p4.InterfaceC2266f;
import p4.q0;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19113l = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19114m = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19115n = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19116o = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19117p = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19118q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19119r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19120s = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19121t = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: k, reason: collision with root package name */
    public final int f19122k;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i) {
        this.f19122k = i;
        if (i < 0) {
            throw new IllegalArgumentException(L1.a.l(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.f19124a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f19115n.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (w()) {
            kVar2 = e.f19124a;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>", kVar2);
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f19140s;
    }

    public static boolean B(Object obj) {
        if (!(obj instanceof InterfaceC2266f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>", obj);
        InterfaceC2266f interfaceC2266f = (InterfaceC2266f) obj;
        k kVar = e.f19124a;
        H3.g a5 = interfaceC2266f.a(W3.o.f6046a, null);
        if (a5 == null) {
            return false;
        }
        interfaceC2266f.u(a5);
        return true;
    }

    public static final k a(c cVar, long j5, k kVar) {
        Object b3;
        c cVar2;
        cVar.getClass();
        k kVar2 = e.f19124a;
        d dVar = d.f19123k;
        loop0: while (true) {
            b3 = u4.a.b(kVar, j5, dVar);
            if (!u4.a.e(b3)) {
                u4.q c5 = u4.a.c(b3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19117p;
                    u4.q qVar = (u4.q) atomicReferenceFieldUpdater.get(cVar);
                    if (qVar.f20113c >= c5.f20113c) {
                        break loop0;
                    }
                    if (!c5.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, qVar, c5)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != qVar) {
                            if (c5.e()) {
                                c5.d();
                            }
                        }
                    }
                    if (qVar.e()) {
                        qVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean e3 = u4.a.e(b3);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19114m;
        if (e3) {
            cVar.j();
            if (kVar.f20113c * e.f19125b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) u4.a.c(b3);
            long j6 = kVar3.f20113c;
            if (j6 <= j5) {
                return kVar3;
            }
            long j7 = e.f19125b * j6;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f19113l;
                long j8 = atomicLongFieldUpdater2.get(cVar);
                long j9 = 1152921504606846975L & j8;
                if (j9 >= j7) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (atomicLongFieldUpdater2.compareAndSet(cVar2, j8, j9 + (((int) (j8 >> 60)) << 60))) {
                    break;
                }
                cVar = cVar2;
            }
            if (j6 * e.f19125b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void b(c cVar, Object obj, C2268h c2268h) {
        cVar.getClass();
        c2268h.resumeWith(G4.l.p(cVar.r()));
    }

    public static final int f(c cVar, k kVar, int i, Object obj, long j5, Object obj2, boolean z3) {
        cVar.getClass();
        kVar.m(i, obj);
        if (z3) {
            return cVar.D(kVar, i, obj, j5, obj2, z3);
        }
        Object k5 = kVar.k(i);
        if (k5 == null) {
            if (cVar.g(j5)) {
                if (kVar.j(i, null, e.f19127d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (k5 instanceof q0) {
            kVar.m(i, null);
            if (cVar.A(k5, obj)) {
                kVar.n(i, e.i);
                return 0;
            }
            H3.g gVar = e.f19132k;
            if (kVar.f.getAndSet((i * 2) + 1, gVar) == gVar) {
                return 5;
            }
            kVar.l(i, true);
            return 5;
        }
        return cVar.D(kVar, i, obj, j5, obj2, z3);
    }

    public static void t(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19116o;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof InterfaceC2266f)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>", obj);
            InterfaceC2266f interfaceC2266f = (InterfaceC2266f) obj;
            k kVar = e.f19124a;
            H3.g a5 = interfaceC2266f.a(obj2, null);
            if (a5 == null) {
                return false;
            }
            interfaceC2266f.u(a5);
            return true;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>", obj);
        b bVar = (b) obj;
        C2268h c2268h = bVar.f19111l;
        kotlin.jvm.internal.l.c(c2268h);
        bVar.f19111l = null;
        bVar.f19110k = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f19112m.getClass();
        k kVar2 = e.f19124a;
        H3.g a6 = c2268h.a(bool, null);
        if (a6 == null) {
            return false;
        }
        c2268h.u(a6);
        return true;
    }

    public final Object C(k kVar, int i, long j5, Object obj) {
        Object k5 = kVar.k(i);
        AtomicReferenceArray atomicReferenceArray = kVar.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19113l;
        if (k5 == null) {
            if (j5 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f19135n;
                }
                if (kVar.j(i, k5, obj)) {
                    l();
                    return e.f19134m;
                }
            }
        } else if (k5 == e.f19127d && kVar.j(i, k5, e.i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i * 2);
            kVar.m(i, null);
            return obj2;
        }
        while (true) {
            Object k6 = kVar.k(i);
            if (k6 == null || k6 == e.f19128e) {
                if (j5 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i, k6, e.f19130h)) {
                        l();
                        return e.f19136o;
                    }
                } else {
                    if (obj == null) {
                        return e.f19135n;
                    }
                    if (kVar.j(i, k6, obj)) {
                        l();
                        return e.f19134m;
                    }
                }
            } else if (k6 != e.f19127d) {
                H3.g gVar = e.f19131j;
                if (k6 == gVar) {
                    return e.f19136o;
                }
                if (k6 == e.f19130h) {
                    return e.f19136o;
                }
                if (k6 == e.f19133l) {
                    l();
                    return e.f19136o;
                }
                if (k6 != e.f19129g && kVar.j(i, k6, e.f)) {
                    boolean z3 = k6 instanceof r;
                    if (z3) {
                        k6 = ((r) k6).f19148a;
                    }
                    if (B(k6)) {
                        kVar.n(i, e.i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        kVar.m(i, null);
                        return obj3;
                    }
                    kVar.n(i, gVar);
                    kVar.h();
                    if (z3) {
                        l();
                    }
                    return e.f19136o;
                }
            } else if (kVar.j(i, k6, e.i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i * 2);
                kVar.m(i, null);
                return obj4;
            }
        }
    }

    public final int D(k kVar, int i, Object obj, long j5, Object obj2, boolean z3) {
        while (true) {
            Object k5 = kVar.k(i);
            if (k5 == null) {
                if (!g(j5) || z3) {
                    if (z3) {
                        if (kVar.j(i, null, e.f19131j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(i, null, e.f19127d)) {
                    break;
                }
            } else {
                if (k5 != e.f19128e) {
                    H3.g gVar = e.f19132k;
                    if (k5 == gVar) {
                        kVar.m(i, null);
                        return 5;
                    }
                    if (k5 == e.f19130h) {
                        kVar.m(i, null);
                        return 5;
                    }
                    if (k5 == e.f19133l) {
                        kVar.m(i, null);
                        j();
                        return 4;
                    }
                    kVar.m(i, null);
                    if (k5 instanceof r) {
                        k5 = ((r) k5).f19148a;
                    }
                    if (A(k5, obj)) {
                        kVar.n(i, e.i);
                        return 0;
                    }
                    if (kVar.f.getAndSet((i * 2) + 1, gVar) != gVar) {
                        kVar.l(i, true);
                    }
                    return 5;
                }
                if (kVar.j(i, k5, e.f19127d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void E(long j5) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.w()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f19115n;
            if (atomicLongFieldUpdater.get(cVar) > j5) {
                break;
            } else {
                cVar = this;
            }
        }
        int i = e.f19126c;
        int i5 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f19116o;
            if (i5 < i) {
                long j6 = atomicLongFieldUpdater.get(cVar);
                if (j6 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j6 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i5++;
                }
            } else {
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j7, (j7 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater.get(cVar);
                    long j9 = atomicLongFieldUpdater2.get(cVar);
                    long j10 = j9 & 4611686018427387903L;
                    boolean z3 = (j9 & 4611686018427387904L) != 0;
                    if (j8 == j10 && j8 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (!z3) {
                        atomicLongFieldUpdater2.compareAndSet(this, j9, 4611686018427387904L + j10);
                    }
                    cVar = this;
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j11, j11 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // r4.p
    public final Object c(AbstractC0548i abstractC0548i) {
        k kVar;
        c cVar = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19118q;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f19113l;
            if (cVar.u(atomicLongFieldUpdater.get(cVar), true)) {
                Throwable p5 = p();
                int i = u4.r.f20114a;
                throw p5;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f19114m;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(cVar);
            long j5 = e.f19125b;
            long j6 = andIncrement / j5;
            int i5 = (int) (andIncrement % j5);
            if (kVar2.f20113c != j6) {
                k m5 = cVar.m(j6, kVar2);
                if (m5 == null) {
                    continue;
                } else {
                    kVar2 = m5;
                }
            }
            Object C5 = cVar.C(kVar2, i5, andIncrement, null);
            H3.g gVar = e.f19134m;
            if (C5 == gVar) {
                throw new IllegalStateException("unexpected");
            }
            H3.g gVar2 = e.f19136o;
            if (C5 != gVar2) {
                if (C5 != e.f19135n) {
                    kVar2.a();
                    return C5;
                }
                C2268h k5 = AbstractC2282w.k(AbstractC2346c.v(abstractC0548i));
                c cVar2 = this;
                try {
                    Object C6 = cVar2.C(kVar2, i5, andIncrement, k5);
                    if (C6 == gVar) {
                        k5.b(kVar2, i5);
                    } else if (C6 == gVar2) {
                        if (andIncrement < cVar2.s()) {
                            kVar2.a();
                        }
                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar2);
                        while (true) {
                            if (cVar2.u(atomicLongFieldUpdater.get(cVar2), true)) {
                                k5.resumeWith(G4.l.p(cVar2.p()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(cVar2);
                            long j7 = e.f19125b;
                            long j8 = andIncrement2 / j7;
                            int i6 = (int) (andIncrement2 % j7);
                            if (kVar3.f20113c != j8) {
                                kVar = cVar2.m(j8, kVar3);
                                if (kVar == null) {
                                }
                            } else {
                                kVar = kVar3;
                            }
                            Object C7 = cVar2.C(kVar, i6, andIncrement2, k5);
                            if (C7 == e.f19134m) {
                                k5.b(kVar, i6);
                                break;
                            }
                            if (C7 == e.f19136o) {
                                if (andIncrement2 < s()) {
                                    kVar.a();
                                }
                                cVar2 = this;
                                kVar3 = kVar;
                            } else {
                                if (C7 == e.f19135n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kVar.a();
                                k5.j(C7, null);
                            }
                        }
                    } else {
                        kVar2.a();
                        k5.j(C6, null);
                    }
                    return k5.q();
                } catch (Throwable th) {
                    k5.z();
                    throw th;
                }
            }
            if (andIncrement < s()) {
                kVar2.a();
            }
            cVar = this;
        }
    }

    @Override // r4.p
    public final void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0178, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        b(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164 A[RETURN] */
    @Override // r4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(a4.c cVar, Object obj) {
        Object q5;
        Object obj2;
        c cVar2;
        k kVar;
        int i;
        c cVar3 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19117p;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar3);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f19113l;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar3);
            long j5 = andIncrement & 1152921504606846975L;
            boolean u5 = cVar3.u(andIncrement, false);
            int i5 = e.f19125b;
            long j6 = i5;
            long j7 = j5 / j6;
            int i6 = (int) (j5 % j6);
            long j8 = kVar2.f20113c;
            W3.o oVar = W3.o.f6046a;
            EnumC0510a enumC0510a = EnumC0510a.f7289k;
            if (j8 != j7) {
                k a5 = a(cVar3, j7, kVar2);
                if (a5 != null) {
                    kVar2 = a5;
                } else if (u5) {
                    Object y5 = y(cVar, obj);
                    if (y5 == enumC0510a) {
                        return y5;
                    }
                }
            }
            int f = f(cVar3, kVar2, i6, obj, j5, null, u5);
            if (f == 0) {
                kVar2.a();
                return oVar;
            }
            if (f == 1) {
                break;
            }
            if (f != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f19114m;
                if (f == 3) {
                    C2268h k5 = AbstractC2282w.k(AbstractC2346c.v(cVar));
                    Object obj3 = obj;
                    try {
                        int f5 = f(cVar3, kVar2, i6, obj3, j5, k5, false);
                        try {
                            if (f5 != 0) {
                                if (f5 == 1) {
                                    k5.resumeWith(oVar);
                                } else if (f5 != 2) {
                                    if (f5 != 4) {
                                        String str = "unexpected";
                                        if (f5 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar3);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(cVar3);
                                            long j9 = andIncrement2 & 1152921504606846975L;
                                            boolean u6 = cVar3.u(andIncrement2, false);
                                            int i7 = e.f19125b;
                                            long j10 = i7;
                                            String str2 = str;
                                            long j11 = j9 / j10;
                                            int i8 = (int) (j9 % j10);
                                            if (kVar3.f20113c != j11) {
                                                k a6 = a(cVar3, j11, kVar3);
                                                if (a6 != null) {
                                                    i = i7;
                                                    kVar = a6;
                                                } else {
                                                    if (u6) {
                                                        break;
                                                    }
                                                    str = str2;
                                                }
                                            } else {
                                                kVar = kVar3;
                                                i = i7;
                                            }
                                            int f6 = f(cVar3, kVar, i8, obj3, j9, k5, u6);
                                            Object obj4 = obj3;
                                            cVar2 = cVar3;
                                            k kVar4 = kVar;
                                            obj2 = obj4;
                                            if (f6 == 0) {
                                                kVar4.a();
                                                break;
                                            }
                                            if (f6 == 1) {
                                                break;
                                            }
                                            if (f6 != 2) {
                                                if (f6 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (f6 != 4) {
                                                    if (f6 == 5) {
                                                        kVar4.a();
                                                    }
                                                    kVar3 = kVar4;
                                                    cVar3 = cVar2;
                                                    str = str2;
                                                    obj3 = obj2;
                                                } else if (j9 < atomicLongFieldUpdater2.get(cVar2)) {
                                                    kVar4.a();
                                                }
                                            } else if (u6) {
                                                kVar4.h();
                                            } else {
                                                k5.b(kVar4, i8 + i);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        cVar2 = cVar3;
                                        if (j5 < atomicLongFieldUpdater2.get(cVar2)) {
                                            kVar2.a();
                                        }
                                    }
                                    b(cVar2, obj2, k5);
                                } else {
                                    k5.b(kVar2, i6 + i5);
                                }
                                q5 = k5.q();
                                if (q5 != enumC0510a) {
                                    q5 = oVar;
                                }
                                if (q5 != enumC0510a) {
                                    return q5;
                                }
                            } else {
                                kVar2.a();
                            }
                            k5.resumeWith(oVar);
                            q5 = k5.q();
                            if (q5 != enumC0510a) {
                            }
                            if (q5 != enumC0510a) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            k5.z();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (f == 4) {
                    if (j5 < atomicLongFieldUpdater2.get(cVar3)) {
                        kVar2.a();
                    }
                    Object y6 = y(cVar, obj);
                    if (y6 == enumC0510a) {
                        return y6;
                    }
                } else if (f == 5) {
                    kVar2.a();
                }
            } else if (u5) {
                kVar2.h();
                Object y7 = y(cVar, obj);
                if (y7 == enumC0510a) {
                    return y7;
                }
            }
        }
    }

    public final boolean g(long j5) {
        return j5 < f19115n.get(this) || j5 < f19114m.get(this) + ((long) this.f19122k);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(Throwable th, boolean z3) {
        c cVar;
        H3.g gVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z5;
        long j5;
        long j6;
        long j7;
        Object obj;
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19113l;
        if (z3) {
            do {
                j9 = atomicLongFieldUpdater.get(this);
                if (((int) (j9 >> 60)) == 0) {
                    k kVar = e.f19124a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j9, (j9 & 1152921504606846975L) + (1 << 60)));
            gVar = e.f19140s;
            while (true) {
                atomicReferenceFieldUpdater = f19120s;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, gVar, th)) {
                    z5 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != gVar) {
                    z5 = false;
                    break;
                }
            }
            if (z3) {
                do {
                    j5 = atomicLongFieldUpdater.get(this);
                    int i = (int) (j5 >> 60);
                    if (i == 0) {
                        j6 = j5 & 1152921504606846975L;
                        j7 = 2;
                    } else {
                        if (i != 1) {
                            break;
                        }
                        j6 = j5 & 1152921504606846975L;
                        j7 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j5, (j7 << 60) + j6));
            } else {
                do {
                    j8 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j8, (3 << 60) + (j8 & 1152921504606846975L)));
            }
            j();
            if (z5) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19121t;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    H3.g gVar2 = obj == null ? e.f19138q : e.f19139r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, gVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    z.b(1, obj);
                    ((i4.c) obj).c(n());
                    return z5;
                }
            }
            return z5;
        }
        cVar = this;
        gVar = e.f19140s;
        while (true) {
            atomicReferenceFieldUpdater = f19120s;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, gVar, th)) {
            }
        }
        if (z3) {
        }
        j();
        if (z5) {
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (r4.k) ((u4.b) u4.b.f20082b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k i(long j5) {
        Object obj;
        long j6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f19119r.get(this);
        k kVar = (k) f19117p.get(this);
        if (kVar.f20113c > ((k) obj2).f20113c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f19118q.get(this);
        if (kVar2.f20113c > ((k) obj2).f20113c) {
            obj2 = kVar2;
        }
        u4.b bVar = (u4.b) obj2;
        loop0: while (true) {
            bVar.getClass();
            Object obj3 = u4.b.f20081a.get(bVar);
            H3.g gVar = u4.a.f20075a;
            obj = null;
            if (obj3 == gVar) {
                break;
            }
            u4.b bVar2 = (u4.b) obj3;
            if (bVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = u4.b.f20081a;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, gVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(bVar) == null);
            } else {
                bVar = bVar2;
            }
        }
        k kVar3 = (k) bVar;
        if (v()) {
            k kVar4 = kVar3;
            loop2: do {
                int i = e.f19125b - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j6 = (kVar4.f20113c * e.f19125b) + i;
                    if (j6 < f19114m.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k5 = kVar4.k(i);
                        if (k5 != null && k5 != e.f19128e) {
                            if (k5 == e.f19127d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i, k5, e.f19133l)) {
                                kVar4.h();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (kVar4 != null);
            j6 = -1;
            if (j6 != -1) {
                k(j6);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((u4.b) u4.b.f20082b.get(kVar5))) {
            for (int i5 = e.f19125b - 1; -1 < i5; i5--) {
                if ((kVar5.f20113c * e.f19125b) + i5 < j5) {
                    break loop5;
                }
                while (true) {
                    Object k6 = kVar5.k(i5);
                    if (k6 != null && k6 != e.f19128e) {
                        if (!(k6 instanceof r)) {
                            if (!(k6 instanceof q0)) {
                                break;
                            }
                            if (kVar5.j(i5, k6, e.f19133l)) {
                                obj = u4.a.f(obj, k6);
                                kVar5.l(i5, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i5, k6, e.f19133l)) {
                                obj = u4.a.f(obj, ((r) k6).f19148a);
                                kVar5.l(i5, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i5, k6, e.f19133l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                z((q0) obj, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                z((q0) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    @Override // r4.p
    public final b iterator() {
        return new b(this);
    }

    public final void j() {
        u(f19113l.get(this), false);
    }

    public final void k(long j5) {
        k kVar = (k) f19118q.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f19114m;
            long j6 = atomicLongFieldUpdater.get(this);
            if (j5 < Math.max(this.f19122k + j6, f19115n.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j6, 1 + j6)) {
                long j7 = e.f19125b;
                long j8 = j6 / j7;
                int i = (int) (j6 % j7);
                if (kVar.f20113c != j8) {
                    k m5 = m(j8, kVar);
                    if (m5 != null) {
                        kVar = m5;
                    }
                }
                k kVar2 = kVar;
                if (C(kVar2, i, j6, null) != e.f19136o) {
                    kVar2.a();
                } else if (j6 < s()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    public final void l() {
        Object b3;
        if (w()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19119r;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f19115n.getAndIncrement(this);
            long j5 = andIncrement / e.f19125b;
            if (s() <= andIncrement) {
                if (kVar.f20113c < j5 && kVar.b() != null) {
                    x(j5, kVar);
                }
                t(this);
                return;
            }
            if (kVar.f20113c != j5) {
                d dVar = d.f19123k;
                while (true) {
                    b3 = u4.a.b(kVar, j5, dVar);
                    if (!u4.a.e(b3)) {
                        u4.q c5 = u4.a.c(b3);
                        while (true) {
                            u4.q qVar = (u4.q) atomicReferenceFieldUpdater.get(this);
                            if (qVar.f20113c >= c5.f20113c) {
                                break;
                            }
                            if (!c5.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, c5)) {
                                if (atomicReferenceFieldUpdater.get(this) != qVar) {
                                    if (c5.e()) {
                                        c5.d();
                                    }
                                }
                            }
                            if (qVar.e()) {
                                qVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (u4.a.e(b3)) {
                    j();
                    x(j5, kVar);
                    t(this);
                } else {
                    k kVar3 = (k) u4.a.c(b3);
                    long j6 = kVar3.f20113c;
                    if (j6 > j5) {
                        long j7 = j6 * e.f19125b;
                        if (f19115n.compareAndSet(this, 1 + andIncrement, j7)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f19116o;
                            if ((atomicLongFieldUpdater.addAndGet(this, j7 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            t(this);
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
            int i = (int) (andIncrement % e.f19125b);
            Object k5 = kVar.k(i);
            boolean z3 = k5 instanceof q0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f19114m;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i, k5, e.f19129g)) {
                while (true) {
                    Object k6 = kVar.k(i);
                    if (!(k6 instanceof q0)) {
                        if (k6 != e.f19131j) {
                            if (k6 != null) {
                                if (k6 == e.f19127d || k6 == e.f19130h || k6 == e.i || k6 == e.f19132k || k6 == e.f19133l) {
                                    break loop0;
                                }
                                if (k6 != e.f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k6).toString());
                                }
                            } else if (kVar.j(i, k6, e.f19128e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i, k6, new r((q0) k6))) {
                            break loop0;
                        }
                    } else if (kVar.j(i, k6, e.f19129g)) {
                        if (B(k6)) {
                            kVar.n(i, e.f19127d);
                            break;
                        } else {
                            kVar.n(i, e.f19131j);
                            kVar.h();
                        }
                    }
                }
            } else if (B(k5)) {
                kVar.n(i, e.f19127d);
                break;
            } else {
                kVar.n(i, e.f19131j);
                kVar.h();
                t(this);
            }
        }
        t(this);
    }

    public final k m(long j5, k kVar) {
        Object b3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        k kVar2 = e.f19124a;
        d dVar = d.f19123k;
        loop0: while (true) {
            b3 = u4.a.b(kVar, j5, dVar);
            if (!u4.a.e(b3)) {
                u4.q c5 = u4.a.c(b3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19118q;
                    u4.q qVar = (u4.q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.f20113c >= c5.f20113c) {
                        break loop0;
                    }
                    if (!c5.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, c5)) {
                        if (atomicReferenceFieldUpdater.get(this) != qVar) {
                            if (c5.e()) {
                                c5.d();
                            }
                        }
                    }
                    if (qVar.e()) {
                        qVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (u4.a.e(b3)) {
            j();
            if (kVar.f20113c * e.f19125b < s()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) u4.a.c(b3);
            boolean w5 = w();
            long j7 = kVar3.f20113c;
            if (!w5 && j5 <= f19115n.get(this) / e.f19125b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19119r;
                    u4.q qVar2 = (u4.q) atomicReferenceFieldUpdater2.get(this);
                    if (qVar2.f20113c >= j7 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, qVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != qVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (qVar2.e()) {
                        qVar2.d();
                    }
                }
            }
            if (j7 <= j5) {
                return kVar3;
            }
            long j8 = j7 * e.f19125b;
            do {
                atomicLongFieldUpdater = f19114m;
                j6 = atomicLongFieldUpdater.get(this);
                if (j6 >= j8) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, j8));
            if (j7 * e.f19125b < s()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable n() {
        return (Throwable) f19120s.get(this);
    }

    @Override // r4.p
    public final Object o() {
        k kVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19114m;
        long j5 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f19113l;
        long j6 = atomicLongFieldUpdater2.get(this);
        if (u(j6, true)) {
            return new h(n());
        }
        long j7 = j6 & 1152921504606846975L;
        i iVar = j.f19144a;
        if (j5 >= j7) {
            return iVar;
        }
        Object obj = e.f19132k;
        k kVar2 = (k) f19118q.get(this);
        while (!u(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j8 = e.f19125b;
            long j9 = andIncrement / j8;
            int i = (int) (andIncrement % j8);
            if (kVar2.f20113c != j9) {
                k m5 = m(j9, kVar2);
                if (m5 == null) {
                    continue;
                } else {
                    kVar = m5;
                }
            } else {
                kVar = kVar2;
            }
            Object C5 = C(kVar, i, andIncrement, obj);
            k kVar3 = kVar;
            if (C5 == e.f19134m) {
                q0 q0Var = obj instanceof q0 ? (q0) obj : null;
                if (q0Var != null) {
                    q0Var.b(kVar3, i);
                }
                E(andIncrement);
                kVar3.h();
                return iVar;
            }
            if (C5 != e.f19136o) {
                if (C5 == e.f19135n) {
                    throw new IllegalStateException("unexpected");
                }
                kVar3.a();
                return C5;
            }
            if (andIncrement < s()) {
                kVar3.a();
            }
            kVar2 = kVar3;
        }
        return new h(n());
    }

    public final Throwable p() {
        Throwable n5 = n();
        return n5 == null ? new l("Channel was closed") : n5;
    }

    @Override // r4.q
    public Object q(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19113l;
        boolean z3 = false;
        long j5 = 1152921504606846975L;
        boolean z5 = u(atomicLongFieldUpdater.get(this), false) ? false : !g(r1 & 1152921504606846975L);
        i iVar = j.f19144a;
        if (z5) {
            return iVar;
        }
        U2.f fVar = e.f19131j;
        k kVar = (k) f19117p.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = andIncrement & j5;
            boolean u5 = u(andIncrement, z3);
            int i = e.f19125b;
            long j7 = i;
            long j8 = j6 / j7;
            int i5 = (int) (j6 % j7);
            if (kVar.f20113c != j8) {
                k a5 = a(this, j8, kVar);
                if (a5 != null) {
                    kVar = a5;
                } else {
                    if (u5) {
                        return new h(r());
                    }
                    z3 = false;
                    j5 = 1152921504606846975L;
                }
            }
            int f = f(this, kVar, i5, obj, j6, fVar, u5);
            W3.o oVar = W3.o.f6046a;
            if (f == 0) {
                kVar.a();
                return oVar;
            }
            if (f == 1) {
                return oVar;
            }
            if (f == 2) {
                if (u5) {
                    kVar.h();
                    return new h(r());
                }
                q0 q0Var = fVar instanceof q0 ? (q0) fVar : null;
                if (q0Var != null) {
                    q0Var.b(kVar, i5 + i);
                }
                kVar.h();
                return iVar;
            }
            if (f == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (f == 4) {
                if (j6 < f19114m.get(this)) {
                    kVar.a();
                }
                return new h(r());
            }
            if (f == 5) {
                kVar.a();
            }
            z3 = false;
            j5 = 1152921504606846975L;
        }
    }

    public final Throwable r() {
        Throwable n5 = n();
        return n5 == null ? new D3.b("Channel was closed") : n5;
    }

    public final long s() {
        return f19113l.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0194, code lost:
    
        r16 = r7;
        r3 = (r4.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019d, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z3;
        String str;
        StringBuilder sb = new StringBuilder();
        int i = (int) (f19113l.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f19122k + ',');
        sb.append("data=[");
        int i5 = 0;
        boolean z5 = true;
        List O5 = X3.n.O(f19118q.get(this), f19117p.get(this), f19119r.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : O5) {
            if (((k) obj) != e.f19124a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j5 = ((k) next).f20113c;
            do {
                Object next2 = it.next();
                long j6 = ((k) next2).f20113c;
                if (j5 > j6) {
                    next = next2;
                    j5 = j6;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j7 = f19114m.get(this);
        long s2 = s();
        loop2: while (true) {
            int i6 = e.f19125b;
            int i7 = i5;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                long j8 = (kVar.f20113c * e.f19125b) + i7;
                if (j8 >= s2 && j8 >= j7) {
                    break loop2;
                }
                Object k5 = kVar.k(i7);
                boolean z6 = z5;
                Object obj2 = kVar.f.get(i7 * 2);
                if (k5 instanceof InterfaceC2266f) {
                    str = (j8 >= j7 || j8 < s2) ? (j8 >= s2 || j8 < j7) ? "cont" : "send" : "receive";
                } else if (k5 instanceof r) {
                    str = "EB(" + k5 + ')';
                } else if (kotlin.jvm.internal.l.a(k5, e.f) || kotlin.jvm.internal.l.a(k5, e.f19129g)) {
                    str = "resuming_sender";
                } else {
                    if (k5 != null && !k5.equals(e.f19128e) && !k5.equals(e.i) && !k5.equals(e.f19130h) && !k5.equals(e.f19132k) && !k5.equals(e.f19131j) && !k5.equals(e.f19133l)) {
                        str = k5.toString();
                    }
                    i7++;
                    z5 = z6;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i7++;
                z5 = z6;
            }
            z5 = z3;
            i5 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(AbstractC2227e.D0(sb)) == ',') {
            kotlin.jvm.internal.l.e("deleteCharAt(...)", sb.deleteCharAt(sb.length() - 1));
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (r4.k) ((u4.b) u4.b.f20082b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(long j5, boolean z3) {
        int i = (int) (j5 >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f19114m;
            if (i == 2) {
                i(1152921504606846975L & j5);
                if (z3) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19118q;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j6 = atomicLongFieldUpdater.get(this);
                        if (s() <= j6) {
                            break;
                        }
                        long j7 = e.f19125b;
                        long j8 = j6 / j7;
                        if (kVar.f20113c != j8 && (kVar = m(j8, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).f20113c < j8) {
                                break;
                            }
                        } else {
                            kVar.a();
                            int i5 = (int) (j6 % j7);
                            while (true) {
                                Object k5 = kVar.k(i5);
                                if (k5 == null || k5 == e.f19128e) {
                                    if (kVar.j(i5, k5, e.f19130h)) {
                                        l();
                                        break;
                                    }
                                } else {
                                    if (k5 == e.f19127d) {
                                        break;
                                    }
                                    if (k5 != e.f19131j) {
                                        if (k5 != e.f19133l) {
                                            if (k5 != e.i) {
                                                if (k5 != e.f19130h) {
                                                    if (k5 == e.f19129g) {
                                                        break;
                                                    }
                                                    if (k5 != e.f && j6 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f19114m.compareAndSet(this, j6, j6 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(AbstractC2107A.q("unexpected close status: ", i).toString());
                }
                k i6 = i(1152921504606846975L & j5);
                Object obj = null;
                loop0: do {
                    int i7 = e.f19125b - 1;
                    while (true) {
                        if (-1 >= i7) {
                            break;
                        }
                        long j9 = (i6.f20113c * e.f19125b) + i7;
                        while (true) {
                            Object k6 = i6.k(i7);
                            if (k6 == e.i) {
                                break loop0;
                            }
                            if (k6 == e.f19127d) {
                                if (j9 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (i6.j(i7, k6, e.f19133l)) {
                                    i6.m(i7, null);
                                    i6.h();
                                    break;
                                }
                            } else if (k6 != e.f19128e && k6 != null) {
                                if (!(k6 instanceof q0) && !(k6 instanceof r)) {
                                    H3.g gVar = e.f19129g;
                                    if (k6 == gVar || k6 == e.f) {
                                        break loop0;
                                    }
                                    if (k6 != gVar) {
                                        break;
                                    }
                                } else {
                                    if (j9 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    q0 q0Var = k6 instanceof r ? ((r) k6).f19148a : (q0) k6;
                                    if (i6.j(i7, k6, e.f19133l)) {
                                        obj = u4.a.f(obj, q0Var);
                                        i6.m(i7, null);
                                        i6.h();
                                        break;
                                    }
                                }
                            } else if (i6.j(i7, k6, e.f19133l)) {
                                i6.h();
                                break;
                            }
                        }
                        i7--;
                    }
                } while (i6 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            z((q0) arrayList.get(size), false);
                        }
                    } else {
                        z((q0) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        long j5 = f19115n.get(this);
        return j5 == 0 || j5 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(long j5, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f20113c < j5 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19119r;
                    u4.q qVar = (u4.q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.f20113c >= kVar.f20113c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != qVar) {
                            if (kVar.e()) {
                                kVar.d();
                            }
                        }
                    }
                    if (qVar.e()) {
                        qVar.d();
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final Object y(a4.c cVar, Object obj) {
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(cVar));
        c2268h.r();
        c2268h.resumeWith(G4.l.p(r()));
        Object q5 = c2268h.q();
        return q5 == EnumC0510a.f7289k ? q5 : W3.o.f6046a;
    }

    public final void z(q0 q0Var, boolean z3) {
        if (q0Var instanceof InterfaceC2266f) {
            ((a4.c) q0Var).resumeWith(G4.l.p(z3 ? p() : r()));
            return;
        }
        if (!(q0Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + q0Var).toString());
        }
        b bVar = (b) q0Var;
        C2268h c2268h = bVar.f19111l;
        kotlin.jvm.internal.l.c(c2268h);
        bVar.f19111l = null;
        bVar.f19110k = e.f19133l;
        Throwable n5 = bVar.f19112m.n();
        if (n5 == null) {
            c2268h.resumeWith(Boolean.FALSE);
        } else {
            c2268h.resumeWith(G4.l.p(n5));
        }
    }
}
