package F6;

import A1.W;
import A1.Z;
import D6.C0130m;
import D6.E;
import D6.I0;
import D6.InterfaceC0129l;
import F2.W0;
import I6.u;
import W5.AbstractC0486a1;
import a.AbstractC0603a;
import f6.C1116i;
import g6.AbstractC1160i;
import i6.InterfaceC1287d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public class b implements f {
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    public final int f2797a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f2798b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2790c = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2791d = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2792e = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2793f = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2794x = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2795y = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2796z = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: A, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2788A = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: B, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2789B = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");

    public b(int i7, Function1 function1) {
        this.f2797a = i7;
        this.f2798b = function1;
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        j jVar = d.f2800a;
        this.bufferEnd = i7 != 0 ? i7 != Integer.MAX_VALUE ? i7 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f2792e.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (t()) {
            jVar2 = d.f2800a;
            t6.h.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f2817s;
    }

    public static final j b(b bVar, long j, j jVar) {
        Object b7;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j7;
        bVar.getClass();
        j jVar2 = d.f2800a;
        c cVar = c.f2799z;
        loop0: while (true) {
            b7 = I6.a.b(jVar, j, cVar);
            if (!I6.a.e(b7)) {
                u c3 = I6.a.c(b7);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2794x;
                    u uVar = (u) atomicReferenceFieldUpdater.get(bVar);
                    if (uVar.f3759c >= c3.f3759c) {
                        break loop0;
                    }
                    if (!c3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, uVar, c3)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != uVar) {
                            if (c3.e()) {
                                c3.d();
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
        boolean e7 = I6.a.e(b7);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2791d;
        if (e7) {
            bVar.r();
            if (jVar.f3759c * d.f2801b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) I6.a.c(b7);
        long j8 = jVar3.f3759c;
        if (j8 <= j) {
            return jVar3;
        }
        long j9 = d.f2801b * j8;
        do {
            atomicLongFieldUpdater = f2790c;
            j3 = atomicLongFieldUpdater.get(bVar);
            j7 = 1152921504606846975L & j3;
            if (j7 >= j9) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j3, j7 + (((int) (j3 >> 60)) << 60)));
        if (j8 * d.f2801b >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void c(b bVar, Object obj, C0130m c0130m) {
        W a2;
        Function1 function1 = bVar.f2798b;
        if (function1 != null && (a2 = I6.a.a(function1, obj, null)) != null) {
            E.k(c0130m.f1858e, a2);
        }
        c0130m.resumeWith(AbstractC0603a.h(bVar.n()));
    }

    public static final int d(b bVar, j jVar, int i7, Object obj, long j, Object obj2, boolean z4) {
        bVar.getClass();
        jVar.m(i7, obj);
        if (z4) {
            return bVar.A(jVar, i7, obj, j, obj2, z4);
        }
        Object k7 = jVar.k(i7);
        if (k7 == null) {
            if (bVar.f(j)) {
                if (jVar.j(i7, null, d.f2803d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (k7 instanceof I0) {
            jVar.m(i7, null);
            if (bVar.x(k7, obj)) {
                jVar.n(i7, d.f2808i);
                return 0;
            }
            W0 w02 = d.f2809k;
            if (jVar.f2824f.getAndSet((i7 * 2) + 1, w02) != w02) {
                jVar.l(i7, true);
            }
            return 5;
        }
        return bVar.A(jVar, i7, obj, j, obj2, z4);
    }

    public static void p(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2793f;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean y(Object obj) {
        if (obj instanceof InterfaceC0129l) {
            t6.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0129l) obj, C1116i.f13008a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final int A(j jVar, int i7, Object obj, long j, Object obj2, boolean z4) {
        while (true) {
            Object k7 = jVar.k(i7);
            if (k7 == null) {
                if (!f(j) || z4) {
                    if (z4) {
                        if (jVar.j(i7, null, d.j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(i7, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(i7, null, d.f2803d)) {
                    return 1;
                }
            } else {
                if (k7 != d.f2804e) {
                    W0 w02 = d.f2809k;
                    if (k7 == w02) {
                        jVar.m(i7, null);
                        return 5;
                    }
                    if (k7 == d.f2807h) {
                        jVar.m(i7, null);
                        return 5;
                    }
                    if (k7 == d.f2810l) {
                        jVar.m(i7, null);
                        r();
                        return 4;
                    }
                    jVar.m(i7, null);
                    if (k7 instanceof s) {
                        k7 = ((s) k7).f2832a;
                    }
                    if (x(k7, obj)) {
                        jVar.n(i7, d.f2808i);
                        return 0;
                    }
                    if (jVar.f2824f.getAndSet((i7 * 2) + 1, w02) == w02) {
                        return 5;
                    }
                    jVar.l(i7, true);
                    return 5;
                }
                if (jVar.j(i7, k7, d.f2803d)) {
                    return 1;
                }
            }
        }
    }

    public final void B(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j7;
        if (t()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f2792e;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i7 = d.f2802c;
        int i8 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2793f;
            if (i8 >= i7) {
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, 4611686018427387904L + (j3 & 4611686018427387903L)));
                while (true) {
                    long j8 = atomicLongFieldUpdater.get(this);
                    long j9 = atomicLongFieldUpdater2.get(this);
                    long j10 = j9 & 4611686018427387903L;
                    boolean z4 = (j9 & 4611686018427387904L) != 0;
                    if (j8 == j10 && j8 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z4) {
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
                i8++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        c(r26, r28, r5);
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
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0149, code lost:
    
        c(r26, r28, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // F6.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(InterfaceC1287d interfaceC1287d, Object obj) {
        j jVar;
        Object obj2;
        C0130m c0130m;
        C0130m c0130m2;
        C1116i c1116i;
        j6.a aVar;
        C0130m c0130m3;
        j jVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2794x;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2790c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean q7 = q(andIncrement, false);
            int i7 = d.f2801b;
            long j3 = i7;
            long j7 = j / j3;
            int i8 = (int) (j % j3);
            long j8 = jVar3.f3759c;
            C1116i c1116i2 = C1116i.f13008a;
            if (j8 != j7) {
                j b7 = b(this, j7, jVar3);
                if (b7 != null) {
                    jVar = b7;
                } else if (q7) {
                    obj2 = v(interfaceC1287d, obj);
                    if (obj2 != j6.a.f14642a) {
                        return c1116i2;
                    }
                }
            } else {
                jVar = jVar3;
            }
            j jVar4 = jVar;
            int d7 = d(this, jVar, i8, obj, j, null, q7);
            if (d7 == 0) {
                jVar4.a();
                return c1116i2;
            }
            if (d7 == 1) {
                break;
            }
            if (d7 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2791d;
                if (d7 == 3) {
                    C0130m j9 = E.j(P6.b.v(interfaceC1287d));
                    try {
                        int d8 = d(this, jVar4, i8, obj, j, j9, false);
                        try {
                            if (d8 != 0) {
                                if (d8 != 1) {
                                    if (d8 == 2) {
                                        c0130m2 = j9;
                                        c1116i = c1116i2;
                                        c0130m2.a(jVar4, i8 + i7);
                                    } else if (d8 == 4) {
                                        c0130m2 = j9;
                                        c1116i = c1116i2;
                                        if (j < atomicLongFieldUpdater2.get(this)) {
                                            jVar4.a();
                                        }
                                        c(this, obj, c0130m2);
                                    } else {
                                        if (d8 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar4.a();
                                        j jVar5 = (j) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j10 = andIncrement2 & 1152921504606846975L;
                                            boolean q8 = q(andIncrement2, false);
                                            int i9 = d.f2801b;
                                            long j11 = i9;
                                            long j12 = j10 / j11;
                                            int i10 = (int) (j10 % j11);
                                            if (jVar5.f3759c != j12) {
                                                try {
                                                    j b8 = b(this, j12, jVar5);
                                                    if (b8 != null) {
                                                        c0130m3 = j9;
                                                        jVar2 = b8;
                                                    } else if (q8) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0130m c0130m4 = j9;
                                                }
                                            } else {
                                                c0130m3 = j9;
                                                jVar2 = jVar5;
                                            }
                                            j9 = c0130m3;
                                            j jVar6 = jVar2;
                                            int d9 = d(this, jVar2, i10, obj, j10, j9, q8);
                                            if (d9 == 0) {
                                                c0130m2 = j9;
                                                c1116i = c1116i2;
                                                jVar6.a();
                                                break;
                                            }
                                            if (d9 == 1) {
                                                break;
                                            }
                                            if (d9 == 2) {
                                                c0130m2 = j9;
                                                if (q8) {
                                                    jVar6.h();
                                                } else {
                                                    c0130m2.a(jVar6, i10 + i9);
                                                }
                                            } else {
                                                if (d9 == 3) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                if (d9 == 4) {
                                                    break;
                                                }
                                                if (d9 == 5) {
                                                    jVar6.a();
                                                }
                                                jVar5 = jVar6;
                                            }
                                        }
                                        c1116i = c1116i2;
                                    }
                                    obj2 = c0130m2.r();
                                    aVar = j6.a.f14642a;
                                    if (obj2 != aVar) {
                                        obj2 = c1116i;
                                    }
                                    if (obj2 != aVar) {
                                        return c1116i;
                                    }
                                }
                                c0130m2 = j9;
                                c1116i = c1116i2;
                                c0130m2.resumeWith(c1116i);
                                obj2 = c0130m2.r();
                                aVar = j6.a.f14642a;
                                if (obj2 != aVar) {
                                }
                                if (obj2 != aVar) {
                                }
                            } else {
                                c0130m2 = j9;
                                c1116i = c1116i2;
                                jVar4.a();
                            }
                            c0130m2.resumeWith(c1116i);
                            obj2 = c0130m2.r();
                            aVar = j6.a.f14642a;
                            if (obj2 != aVar) {
                            }
                            if (obj2 != aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c0130m = d8;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c0130m = j9;
                    }
                } else if (d7 != 4) {
                    if (d7 == 5) {
                        jVar4.a();
                    }
                    jVar3 = jVar4;
                } else {
                    if (j < atomicLongFieldUpdater2.get(this)) {
                        jVar4.a();
                    }
                    Object v6 = v(interfaceC1287d, obj);
                    if (v6 == j6.a.f14642a) {
                        return v6;
                    }
                }
            } else {
                if (!q7) {
                    return c1116i2;
                }
                jVar4.h();
                obj2 = v(interfaceC1287d, obj);
                if (obj2 != j6.a.f14642a) {
                    return c1116i2;
                }
            }
        }
        return obj2;
    }

    @Override // F6.q
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(true, cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // F6.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(Object obj) {
        j jVar;
        j jVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2790c;
        boolean z4 = q(atomicLongFieldUpdater.get(this), false) ? false : !f(r0 & 1152921504606846975L);
        h hVar = i.f2822a;
        if (!z4) {
            Object obj2 = d.j;
            j jVar3 = (j) f2794x.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j = andIncrement & 1152921504606846975L;
                boolean q7 = q(andIncrement, false);
                int i7 = d.f2801b;
                long j3 = i7;
                long j7 = j / j3;
                int i8 = (int) (j % j3);
                if (jVar3.f3759c != j7) {
                    j b7 = b(this, j7, jVar3);
                    if (b7 != null) {
                        jVar = b7;
                    } else if (q7) {
                        return new g(n());
                    }
                } else {
                    jVar = jVar3;
                }
                j jVar4 = jVar;
                int d7 = d(this, jVar, i8, obj, j, obj2, q7);
                C1116i c1116i = C1116i.f13008a;
                if (d7 == 0) {
                    jVar4.a();
                    break;
                }
                if (d7 == 1) {
                    break;
                }
                if (d7 == 2) {
                    if (q7) {
                        jVar4.h();
                        return new g(n());
                    }
                    I0 i02 = obj2 instanceof I0 ? (I0) obj2 : null;
                    if (i02 != null) {
                        jVar2 = jVar4;
                        i02.a(jVar2, i8 + i7);
                    } else {
                        jVar2 = jVar4;
                    }
                    jVar2.h();
                    return hVar;
                }
                if (d7 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (d7 == 4) {
                    if (j < f2791d.get(this)) {
                        jVar4.a();
                    }
                    return new g(n());
                }
                if (d7 == 5) {
                    jVar4.a();
                }
                jVar3 = jVar4;
            }
        } else {
            return hVar;
        }
    }

    public final boolean f(long j) {
        return j < f2792e.get(this) || j < f2791d.get(this) + ((long) this.f2797a);
    }

    public final boolean g(boolean z4, Throwable th) {
        boolean z7;
        long j;
        long j3;
        long j7;
        Object obj;
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2790c;
        if (z4) {
            do {
                j9 = atomicLongFieldUpdater.get(this);
                if (((int) (j9 >> 60)) != 0) {
                    break;
                }
                j jVar = d.f2800a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j9, (1 << 60) + (j9 & 1152921504606846975L)));
        }
        W0 w02 = d.f2817s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2788A;
            if (atomicReferenceFieldUpdater.compareAndSet(this, w02, th)) {
                z7 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != w02) {
                z7 = false;
                break;
            }
        }
        if (z4) {
            do {
                j8 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j8, (3 << 60) + (j8 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j >> 60);
                if (i7 == 0) {
                    j3 = j & 1152921504606846975L;
                    j7 = 2;
                } else {
                    if (i7 != 1) {
                        break;
                    }
                    j3 = j & 1152921504606846975L;
                    j7 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j, (j7 << 60) + j3));
        }
        r();
        if (z7) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2789B;
                obj = atomicReferenceFieldUpdater2.get(this);
                W0 w03 = obj == null ? d.f2815q : d.f2816r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, w03)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                t6.s.a(1, obj);
                ((Function1) obj).invoke(l());
            }
        }
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (F6.j) ((I6.d) I6.d.f3725b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j h(long j) {
        Object obj;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f2796z.get(this);
        j jVar = (j) f2794x.get(this);
        if (jVar.f3759c > ((j) obj2).f3759c) {
            obj2 = jVar;
        }
        j jVar2 = (j) f2795y.get(this);
        if (jVar2.f3759c > ((j) obj2).f3759c) {
            obj2 = jVar2;
        }
        I6.d dVar = (I6.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = I6.d.f3724a.get(dVar);
            W0 w02 = I6.a.f3717b;
            obj = null;
            if (obj3 == w02) {
                break;
            }
            I6.d dVar2 = (I6.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = I6.d.f3724a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, w02)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        j jVar3 = (j) dVar;
        if (s()) {
            j jVar4 = jVar3;
            loop2: do {
                int i7 = d.f2801b - 1;
                while (true) {
                    if (-1 >= i7) {
                        break;
                    }
                    j3 = (jVar4.f3759c * d.f2801b) + i7;
                    if (j3 < f2791d.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k7 = jVar4.k(i7);
                        if (k7 != null && k7 != d.f2804e) {
                            if (k7 == d.f2803d) {
                                break loop2;
                            }
                        } else {
                            if (jVar4.j(i7, k7, d.f2810l)) {
                                jVar4.h();
                                break;
                            }
                        }
                    }
                    i7--;
                }
            } while (jVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                i(j3);
            }
        }
        loop5: for (j jVar5 = jVar3; jVar5 != null; jVar5 = (j) ((I6.d) I6.d.f3725b.get(jVar5))) {
            for (int i8 = d.f2801b - 1; -1 < i8; i8--) {
                if ((jVar5.f3759c * d.f2801b) + i8 < j) {
                    break loop5;
                }
                while (true) {
                    Object k8 = jVar5.k(i8);
                    if (k8 != null && k8 != d.f2804e) {
                        if (!(k8 instanceof s)) {
                            if (!(k8 instanceof I0)) {
                                break;
                            }
                            if (jVar5.j(i8, k8, d.f2810l)) {
                                obj = I6.a.f(obj, k8);
                                jVar5.l(i8, true);
                                break;
                            }
                        } else {
                            if (jVar5.j(i8, k8, d.f2810l)) {
                                obj = I6.a.f(obj, ((s) k8).f2832a);
                                jVar5.l(i8, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar5.j(i8, k8, d.f2810l)) {
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
                    w((I0) arrayList.get(size), true);
                }
            } else {
                w((I0) obj, true);
            }
        }
        return jVar3;
    }

    public final void i(long j) {
        W a2;
        j jVar = (j) f2795y.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2791d;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f2797a + j3, f2792e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j7 = d.f2801b;
                long j8 = j3 / j7;
                int i7 = (int) (j3 % j7);
                if (jVar.f3759c != j8) {
                    j k7 = k(j8, jVar);
                    if (k7 == null) {
                        continue;
                    } else {
                        jVar = k7;
                    }
                }
                Object z4 = z(jVar, i7, j3, null);
                if (z4 != d.f2813o) {
                    jVar.a();
                    Function1 function1 = this.f2798b;
                    if (function1 != null && (a2 = I6.a.a(function1, z4, null)) != null) {
                        throw a2;
                    }
                } else if (j3 < o()) {
                    jVar.a();
                }
            }
        }
    }

    public final void j() {
        Object b7;
        if (t()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2796z;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f2792e.getAndIncrement(this);
            long j = andIncrement / d.f2801b;
            if (o() <= andIncrement) {
                if (jVar.f3759c < j && jVar.b() != null) {
                    u(j, jVar);
                }
                p(this);
                return;
            }
            if (jVar.f3759c != j) {
                c cVar = c.f2799z;
                while (true) {
                    b7 = I6.a.b(jVar, j, cVar);
                    if (!I6.a.e(b7)) {
                        u c3 = I6.a.c(b7);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f3759c >= c3.f3759c) {
                                break;
                            }
                            if (!c3.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c3)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (c3.e()) {
                                        c3.d();
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
                if (I6.a.e(b7)) {
                    r();
                    u(j, jVar);
                    p(this);
                } else {
                    j jVar3 = (j) I6.a.c(b7);
                    long j3 = jVar3.f3759c;
                    if (j3 > j) {
                        long j7 = j3 * d.f2801b;
                        if (f2792e.compareAndSet(this, andIncrement + 1, j7)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f2793f;
                            if ((atomicLongFieldUpdater.addAndGet(this, j7 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            p(this);
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
            int i7 = (int) (andIncrement % d.f2801b);
            Object k7 = jVar.k(i7);
            boolean z4 = k7 instanceof I0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2791d;
            if (!z4 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(i7, k7, d.f2806g)) {
                while (true) {
                    Object k8 = jVar.k(i7);
                    if (!(k8 instanceof I0)) {
                        if (k8 != d.j) {
                            if (k8 != null) {
                                if (k8 == d.f2803d || k8 == d.f2807h || k8 == d.f2808i || k8 == d.f2809k || k8 == d.f2810l) {
                                    break loop0;
                                }
                                if (k8 != d.f2805f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k8).toString());
                                }
                            } else if (jVar.j(i7, k8, d.f2804e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (jVar.j(i7, k8, new s((I0) k8))) {
                            break loop0;
                        }
                    } else if (jVar.j(i7, k8, d.f2806g)) {
                        if (y(k8)) {
                            jVar.n(i7, d.f2803d);
                            break;
                        } else {
                            jVar.n(i7, d.j);
                            jVar.h();
                        }
                    }
                }
            } else if (y(k7)) {
                jVar.n(i7, d.f2803d);
                break;
            } else {
                jVar.n(i7, d.j);
                jVar.h();
                p(this);
            }
        }
        p(this);
    }

    public final j k(long j, j jVar) {
        Object b7;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        j jVar2 = d.f2800a;
        c cVar = c.f2799z;
        loop0: while (true) {
            b7 = I6.a.b(jVar, j, cVar);
            if (!I6.a.e(b7)) {
                u c3 = I6.a.c(b7);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2795y;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f3759c >= c3.f3759c) {
                        break loop0;
                    }
                    if (!c3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c3)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (c3.e()) {
                                c3.d();
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
        if (I6.a.e(b7)) {
            r();
            if (jVar.f3759c * d.f2801b >= o()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) I6.a.c(b7);
        boolean t7 = t();
        long j7 = jVar3.f3759c;
        if (!t7 && j <= f2792e.get(this) / d.f2801b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2796z;
                u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f3759c >= j7 || !jVar3.i()) {
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
        if (j7 <= j) {
            return jVar3;
        }
        long j8 = d.f2801b * j7;
        do {
            atomicLongFieldUpdater = f2791d;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j8) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j8));
        if (j7 * d.f2801b >= o()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public final Throwable l() {
        return (Throwable) f2788A.get(this);
    }

    public final Throwable m() {
        Throwable l7 = l();
        return l7 == null ? new k("Channel was closed") : l7;
    }

    public final Throwable n() {
        Throwable l7 = l();
        return l7 == null ? new Z("Channel was closed") : l7;
    }

    public final long o() {
        return f2790c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (F6.j) ((I6.d) I6.d.f3725b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(long j, boolean z4) {
        int i7 = (int) (j >> 60);
        if (i7 == 0 || i7 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2791d;
        if (i7 == 2) {
            h(j & 1152921504606846975L);
            if (z4) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2795y;
                    j jVar = (j) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (o() <= j3) {
                        break;
                    }
                    long j7 = d.f2801b;
                    long j8 = j3 / j7;
                    if (jVar.f3759c != j8 && (jVar = k(j8, jVar)) == null) {
                        if (((j) atomicReferenceFieldUpdater.get(this)).f3759c < j8) {
                            break;
                        }
                    } else {
                        jVar.a();
                        int i8 = (int) (j3 % j7);
                        while (true) {
                            Object k7 = jVar.k(i8);
                            if (k7 == null || k7 == d.f2804e) {
                                if (jVar.j(i8, k7, d.f2807h)) {
                                    j();
                                    break;
                                }
                            } else {
                                if (k7 == d.f2803d) {
                                    return false;
                                }
                                if (k7 != d.j && k7 != d.f2810l && k7 != d.f2808i && k7 != d.f2807h) {
                                    if (k7 == d.f2806g) {
                                        return false;
                                    }
                                    if (k7 != d.f2805f && j3 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f2791d.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i7 != 3) {
                throw new IllegalStateException(e1.k.d(i7, "unexpected close status: ").toString());
            }
            j h6 = h(j & 1152921504606846975L);
            W w7 = null;
            Object obj = null;
            loop0: do {
                int i9 = d.f2801b - 1;
                while (true) {
                    if (-1 >= i9) {
                        break;
                    }
                    long j9 = (h6.f3759c * d.f2801b) + i9;
                    while (true) {
                        Object k8 = h6.k(i9);
                        if (k8 == d.f2808i) {
                            break loop0;
                        }
                        W0 w02 = d.f2803d;
                        AtomicReferenceArray atomicReferenceArray = h6.f2824f;
                        Function1 function1 = this.f2798b;
                        if (k8 == w02) {
                            if (j9 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (h6.j(i9, k8, d.f2810l)) {
                                if (function1 != null) {
                                    w7 = I6.a.a(function1, atomicReferenceArray.get(i9 * 2), w7);
                                }
                                h6.m(i9, null);
                                h6.h();
                            }
                        } else if (k8 == d.f2804e || k8 == null) {
                            if (h6.j(i9, k8, d.f2810l)) {
                                h6.h();
                                break;
                            }
                        } else if (!(k8 instanceof I0) && !(k8 instanceof s)) {
                            W0 w03 = d.f2806g;
                            if (k8 == w03 || k8 == d.f2805f) {
                                break loop0;
                            }
                            if (k8 != w03) {
                                break;
                            }
                        } else {
                            if (j9 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            I0 i02 = k8 instanceof s ? ((s) k8).f2832a : (I0) k8;
                            if (h6.j(i9, k8, d.f2810l)) {
                                if (function1 != null) {
                                    w7 = I6.a.a(function1, atomicReferenceArray.get(i9 * 2), w7);
                                }
                                obj = I6.a.f(obj, i02);
                                h6.m(i9, null);
                                h6.h();
                            }
                        }
                    }
                    i9--;
                }
            } while (h6 != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        w((I0) arrayList.get(size), false);
                    }
                } else {
                    w((I0) obj, false);
                }
            }
            if (w7 != null) {
                throw w7;
            }
        }
        return true;
    }

    public final boolean r() {
        return q(f2790c.get(this), false);
    }

    public boolean s() {
        return false;
    }

    public final boolean t() {
        long j = f2792e.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (F6.j) r3.b();
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
        int i7 = (int) (f2790c.get(this) >> 60);
        if (i7 == 2) {
            sb.append("closed,");
        } else if (i7 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f2797a + ',');
        sb.append("data=[");
        int i8 = 0;
        List M02 = AbstractC1160i.M0(f2795y.get(this), f2794x.get(this), f2796z.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : M02) {
            if (((j) obj2) != d.f2800a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((j) next).f3759c;
            do {
                Object next2 = it.next();
                long j3 = ((j) next2).f3759c;
                if (j > j3) {
                    next = next2;
                    j = j3;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j7 = f2791d.get(this);
        long o7 = o();
        loop2: while (true) {
            int i9 = d.f2801b;
            int i10 = i8;
            while (true) {
                if (i10 >= i9) {
                    break;
                }
                long j8 = (jVar.f3759c * d.f2801b) + i10;
                if (j8 >= o7 && j8 >= j7) {
                    break loop2;
                }
                Object k7 = jVar.k(i10);
                Object obj3 = jVar.f2824f.get(i10 * 2);
                if (k7 instanceof InterfaceC0129l) {
                    obj = (j8 >= j7 || j8 < o7) ? (j8 >= o7 || j8 < j7) ? "cont" : "send" : "receive";
                } else if (k7 instanceof s) {
                    obj = "EB(" + k7 + ')';
                } else if (t6.h.a(k7, d.f2805f) ? true : t6.h.a(k7, d.f2806g)) {
                    obj = "resuming_sender";
                } else if (k7 == null ? true : k7.equals(d.f2804e) ? true : t6.h.a(k7, d.f2808i) ? true : t6.h.a(k7, d.f2807h) ? true : t6.h.a(k7, d.f2809k) ? true : t6.h.a(k7, d.j) ? true : t6.h.a(k7, d.f2810l)) {
                    i10++;
                } else {
                    obj = k7.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i10++;
            }
            i8 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(C6.o.r0(sb)) == ',') {
            t6.h.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(long j, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f3759c < j && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2796z;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f3759c >= jVar.f3759c) {
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

    public final Object v(InterfaceC1287d interfaceC1287d, Object obj) {
        W a2;
        C0130m c0130m = new C0130m(1, P6.b.v(interfaceC1287d));
        c0130m.s();
        Function1 function1 = this.f2798b;
        if (function1 == null || (a2 = I6.a.a(function1, obj, null)) == null) {
            c0130m.resumeWith(AbstractC0603a.h(n()));
        } else {
            Q0.a.c(a2, n());
            c0130m.resumeWith(AbstractC0603a.h(a2));
        }
        Object r7 = c0130m.r();
        return r7 == j6.a.f14642a ? r7 : C1116i.f13008a;
    }

    public final void w(I0 i02, boolean z4) {
        if (i02 instanceof InterfaceC0129l) {
            ((InterfaceC1287d) i02).resumeWith(AbstractC0603a.h(z4 ? m() : n()));
            return;
        }
        if (!(i02 instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + i02).toString());
        }
        a aVar = (a) i02;
        C0130m c0130m = aVar.f2786b;
        t6.h.b(c0130m);
        aVar.f2786b = null;
        aVar.f2785a = d.f2810l;
        Throwable l7 = aVar.f2787c.l();
        if (l7 == null) {
            c0130m.resumeWith(Boolean.FALSE);
        } else {
            c0130m.resumeWith(AbstractC0603a.h(l7));
        }
    }

    public final boolean x(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0129l)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            t6.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0129l interfaceC0129l = (InterfaceC0129l) obj;
            Function1 function1 = this.f2798b;
            return d.a(interfaceC0129l, obj2, function1 != null ? new I6.p(function1, obj2, interfaceC0129l.getContext()) : null);
        }
        t6.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0130m c0130m = aVar.f2786b;
        t6.h.b(c0130m);
        aVar.f2786b = null;
        aVar.f2785a = obj2;
        Boolean bool = Boolean.TRUE;
        Function1 function12 = aVar.f2787c.f2798b;
        return d.a(c0130m, bool, function12 != null ? new I6.p(function12, obj2, c0130m.f1858e) : null);
    }

    public final Object z(j jVar, int i7, long j, Object obj) {
        Object k7 = jVar.k(i7);
        AtomicReferenceArray atomicReferenceArray = jVar.f2824f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2790c;
        if (k7 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f2812n;
                }
                if (jVar.j(i7, k7, obj)) {
                    j();
                    return d.f2811m;
                }
            }
        } else if (k7 == d.f2803d && jVar.j(i7, k7, d.f2808i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            jVar.m(i7, null);
            return obj2;
        }
        while (true) {
            Object k8 = jVar.k(i7);
            if (k8 == null || k8 == d.f2804e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i7, k8, d.f2807h)) {
                        j();
                        return d.f2813o;
                    }
                } else {
                    if (obj == null) {
                        return d.f2812n;
                    }
                    if (jVar.j(i7, k8, obj)) {
                        j();
                        return d.f2811m;
                    }
                }
            } else if (k8 != d.f2803d) {
                W0 w02 = d.j;
                if (k8 == w02) {
                    return d.f2813o;
                }
                if (k8 == d.f2807h) {
                    return d.f2813o;
                }
                if (k8 == d.f2810l) {
                    j();
                    return d.f2813o;
                }
                if (k8 != d.f2806g && jVar.j(i7, k8, d.f2805f)) {
                    boolean z4 = k8 instanceof s;
                    if (z4) {
                        k8 = ((s) k8).f2832a;
                    }
                    if (y(k8)) {
                        jVar.n(i7, d.f2808i);
                        j();
                        Object obj3 = atomicReferenceArray.get(i7 * 2);
                        jVar.m(i7, null);
                        return obj3;
                    }
                    jVar.n(i7, w02);
                    jVar.h();
                    if (z4) {
                        j();
                    }
                    return d.f2813o;
                }
            } else if (jVar.j(i7, k8, d.f2808i)) {
                j();
                Object obj4 = atomicReferenceArray.get(i7 * 2);
                jVar.m(i7, null);
                return obj4;
            }
        }
    }
}
