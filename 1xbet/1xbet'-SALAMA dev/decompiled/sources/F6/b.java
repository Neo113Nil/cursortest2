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
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class b implements f {
    private volatile Object _closeCause;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f2798b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2790c = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2791d = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2792e = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2793f = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2794x = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2795y = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2796z = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2788A = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
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
        Object objB;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j7;
        bVar.getClass();
        j jVar2 = d.f2800a;
        c cVar = c.f2799z;
        loop0: while (true) {
            objB = I6.a.b(jVar, j, cVar);
            if (!I6.a.e(objB)) {
                u uVarC = I6.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2794x;
                    u uVar = (u) atomicReferenceFieldUpdater.get(bVar);
                    if (uVar.f3759c >= uVarC.f3759c) {
                        break loop0;
                    }
                    if (!uVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(bVar, uVar, uVarC)) {
                            if (!uVar.e()) {
                                break loop0;
                            }
                            uVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(bVar) == uVar);
                    if (uVarC.e()) {
                        uVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = I6.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2791d;
        if (zE) {
            bVar.r();
            if (jVar.f3759c * ((long) d.f2801b) >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) I6.a.c(objB);
        long j8 = jVar3.f3759c;
        if (j8 <= j) {
            return jVar3;
        }
        long j9 = ((long) d.f2801b) * j8;
        do {
            atomicLongFieldUpdater = f2790c;
            j3 = atomicLongFieldUpdater.get(bVar);
            j7 = 1152921504606846975L & j3;
            if (j7 >= j9) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j3, j7 + (((long) ((int) (j3 >> 60))) << 60)));
        if (j8 * ((long) d.f2801b) >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void c(b bVar, Object obj, C0130m c0130m) throws IllegalAccessException, InvocationTargetException {
        W wA;
        Function1 function1 = bVar.f2798b;
        if (function1 != null && (wA = I6.a.a(function1, obj, null)) != null) {
            E.k(c0130m.f1858e, wA);
        }
        c0130m.resumeWith(p003a.a.h(bVar.n()));
    }

    public static final int d(b bVar, j jVar, int i7, Object obj, long j, Object obj2, boolean z4) {
        bVar.getClass();
        jVar.m(i7, obj);
        if (z4) {
            return bVar.A(jVar, i7, obj, j, obj2, z4);
        }
        Object objK = jVar.k(i7);
        if (objK == null) {
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
        } else if (objK instanceof I0) {
            jVar.m(i7, null);
            if (bVar.x(objK, obj)) {
                jVar.n(i7, d.f2808i);
                return 0;
            }
            W0 w7 = d.f2809k;
            if (jVar.f2824f.getAndSet((i7 * 2) + 1, w7) != w7) {
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
            return d.a((InterfaceC0129l) obj, p044f6.i.f13014a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final int A(j jVar, int i7, Object obj, long j, Object obj2, boolean z4) {
        while (true) {
            Object objK = jVar.k(i7);
            if (objK == null) {
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
                if (objK != d.f2804e) {
                    W0 w7 = d.f2809k;
                    if (objK == w7) {
                        jVar.m(i7, null);
                        return 5;
                    }
                    if (objK == d.f2807h) {
                        jVar.m(i7, null);
                        return 5;
                    }
                    if (objK == d.f2810l) {
                        jVar.m(i7, null);
                        r();
                        return 4;
                    }
                    jVar.m(i7, null);
                    if (objK instanceof s) {
                        objK = ((s) objK).f2832a;
                    }
                    if (x(objK, obj)) {
                        jVar.n(i7, d.f2808i);
                        return 0;
                    }
                    if (jVar.f2824f.getAndSet((i7 * 2) + 1, w7) == w7) {
                        return 5;
                    }
                    jVar.l(i7, true);
                    return 5;
                }
                if (jVar.j(i7, objK, d.f2803d)) {
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

    /* JADX WARN: Code duplicated, block: B:104:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [D6.m] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // F6.r
    public Object a(p065i6.d dVar, Object obj) throws Throwable {
        j jVar;
        Object objV;
        ?? r7;
        C0130m c0130m;
        j6.a aVar;
        j jVar2;
        C0130m c0130m2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2794x;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2790c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zQ = q(andIncrement, false);
            int i7 = d.f2801b;
            long j3 = i7;
            long j7 = j / j3;
            int i8 = (int) (j % j3);
            long j8 = jVar3.f3759c;
            p044f6.i iVar = p044f6.i.f13014a;
            if (j8 != j7) {
                j jVarB = b(this, j7, jVar3);
                if (jVarB != null) {
                    jVar = jVarB;
                } else if (zQ) {
                    objV = v(dVar, obj);
                    if (objV == j6.a.f14648a) {
                        break;
                    }
                    return iVar;
                }
            } else {
                jVar = jVar3;
            }
            p044f6.i iVar2 = iVar;
            j jVar4 = jVar;
            int iD = d(this, jVar, i8, obj, j, null, zQ);
            if (iD == 0) {
                jVar4.a();
                return iVar2;
            }
            if (iD != 1) {
                if (iD == 2) {
                    if (!zQ) {
                        return iVar2;
                    }
                    jVar4.h();
                    objV = v(dVar, obj);
                    if (objV == j6.a.f14648a) {
                        break;
                    }
                    return iVar2;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2791d;
                if (iD == 3) {
                    C0130m c0130mJ = E.j(P6.b.v(dVar));
                    try {
                        int iD2 = d(this, jVar4, i8, obj, j, c0130mJ, false);
                        try {
                            if (iD2 != 0) {
                                if (iD2 == 1) {
                                    c0130m = c0130mJ;
                                    iVar2 = iVar2;
                                    c0130m.resumeWith(iVar2);
                                } else if (iD2 == 2) {
                                    c0130m = c0130mJ;
                                    iVar2 = iVar2;
                                    c0130m.a(jVar4, i8 + i7);
                                } else {
                                    if (iD2 != 4) {
                                        if (iD2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar4.a();
                                        j jVar5 = (j) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j9 = andIncrement2 & 1152921504606846975L;
                                            boolean zQ2 = q(andIncrement2, false);
                                            int i9 = d.f2801b;
                                            long j10 = i9;
                                            long j11 = j9 / j10;
                                            int i10 = (int) (j9 % j10);
                                            if (jVar5.f3759c != j11) {
                                                try {
                                                    j jVarB2 = b(this, j11, jVar5);
                                                    if (jVarB2 != null) {
                                                        jVar2 = jVarB2;
                                                    } else if (zQ2) {
                                                        c0130m2 = c0130mJ;
                                                        try {
                                                            c(this, obj, c0130m2);
                                                            c0130m = c0130m2;
                                                            iVar2 = iVar2;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            r7 = c0130m2;
                                                            r7.z();
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    c0130m2 = c0130mJ;
                                                }
                                            } else {
                                                jVar2 = jVar5;
                                            }
                                            c0130mJ = c0130mJ;
                                            j jVar6 = jVar2;
                                            int iD3 = d(this, jVar2, i10, obj, j9, c0130mJ, zQ2);
                                            if (iD3 == 0) {
                                                c0130m = c0130mJ;
                                                jVar6.a();
                                            } else if (iD3 != 1) {
                                                if (iD3 == 2) {
                                                    c0130m = c0130mJ;
                                                    if (zQ2) {
                                                        jVar6.h();
                                                    } else {
                                                        c0130m.a(jVar6, i10 + i9);
                                                    }
                                                    iVar2 = iVar2;
                                                } else {
                                                    if (iD3 == 3) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    if (iD3 != 4) {
                                                        if (iD3 == 5) {
                                                            jVar6.a();
                                                        }
                                                        jVar5 = jVar6;
                                                    } else {
                                                        if (j9 < atomicLongFieldUpdater2.get(this)) {
                                                            jVar6.a();
                                                        }
                                                        c0130m = c0130mJ;
                                                    }
                                                }
                                                c(this, obj, c0130m);
                                                iVar2 = iVar2;
                                            } else {
                                                c0130m = c0130mJ;
                                                iVar2 = iVar2;
                                                c0130m.resumeWith(iVar2);
                                            }
                                        }
                                        r7.z();
                                        throw th;
                                    }
                                    c0130m = c0130mJ;
                                    iVar2 = iVar2;
                                    if (j < atomicLongFieldUpdater2.get(this)) {
                                        jVar4.a();
                                    }
                                    c(this, obj, c0130m);
                                }
                                objV = c0130m.r();
                                aVar = j6.a.f14648a;
                                if (objV != aVar) {
                                    objV = iVar2;
                                }
                                if (objV != aVar) {
                                    break;
                                }
                                return iVar2;
                            }
                            c0130m = c0130mJ;
                            jVar4.a();
                            c0130m.resumeWith(iVar2);
                            objV = c0130m.r();
                            aVar = j6.a.f14648a;
                            if (objV != aVar) {
                                objV = iVar2;
                            }
                            if (objV != aVar) {
                                break;
                            }
                            return iVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            r7 = iD2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r7 = c0130mJ;
                    }
                } else if (iD != 4) {
                    if (iD == 5) {
                        jVar4.a();
                    }
                    jVar3 = jVar4;
                } else {
                    if (j < atomicLongFieldUpdater2.get(this)) {
                        jVar4.a();
                    }
                    Object objV2 = v(dVar, obj);
                    if (objV2 == j6.a.f14648a) {
                        return objV2;
                    }
                }
            }
            return iVar2;
        }
        return objV;
    }

    @Override // F6.q
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(true, cancellationException);
    }

    @Override // F6.r
    public Object e(Object obj) throws IllegalAccessException, InvocationTargetException {
        j jVar;
        j jVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2790c;
        long j = atomicLongFieldUpdater.get(this);
        boolean z4 = q(j, false) ? false : !f(j & 1152921504606846975L);
        h hVar = i.f2822a;
        if (z4) {
            return hVar;
        }
        Object obj2 = d.j;
        j jVar3 = (j) f2794x.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean zQ = q(andIncrement, false);
            int i7 = d.f2801b;
            long j7 = i7;
            long j8 = j3 / j7;
            int i8 = (int) (j3 % j7);
            if (jVar3.f3759c != j8) {
                j jVarB = b(this, j8, jVar3);
                if (jVarB != null) {
                    jVar = jVarB;
                } else if (zQ) {
                    return new g(n());
                }
            } else {
                jVar = jVar3;
            }
            j jVar4 = jVar;
            int iD = d(this, jVar, i8, obj, j3, obj2, zQ);
            p044f6.i iVar = p044f6.i.f13014a;
            if (iD == 0) {
                jVar4.a();
            } else if (iD != 1) {
                if (iD == 2) {
                    if (zQ) {
                        jVar4.h();
                        return new g(n());
                    }
                    I0 i9 = obj2 instanceof I0 ? (I0) obj2 : null;
                    if (i9 != null) {
                        jVar2 = jVar4;
                        i9.a(jVar2, i8 + i7);
                    } else {
                        jVar2 = jVar4;
                    }
                    jVar2.h();
                    return hVar;
                }
                if (iD == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iD == 4) {
                    if (j3 < f2791d.get(this)) {
                        jVar4.a();
                    }
                    return new g(n());
                }
                if (iD == 5) {
                    jVar4.a();
                }
                jVar3 = jVar4;
            }
            return iVar;
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
            } while (!atomicLongFieldUpdater.compareAndSet(this, j9, (((long) 1) << 60) + (j9 & 1152921504606846975L)));
        }
        W0 w7 = d.f2817s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2788A;
            if (atomicReferenceFieldUpdater.compareAndSet(this, w7, th)) {
                z7 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != w7) {
                z7 = false;
                break;
            }
        }
        if (z4) {
            do {
                j8 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j8, (((long) 3) << 60) + (j8 & 1152921504606846975L)));
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
                W0 w8 = obj == null ? d.f2815q : d.f2816r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, w8)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                t6.s.a(1, obj);
                ((Function1) obj).invoke(l());
            }
        }
        return z7;
    }

    public final j h(long j) throws IllegalAccessException, InvocationTargetException {
        Object objF;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = f2796z.get(this);
        j jVar = (j) f2794x.get(this);
        if (jVar.f3759c > ((j) obj).f3759c) {
            obj = jVar;
        }
        j jVar2 = (j) f2795y.get(this);
        if (jVar2.f3759c > ((j) obj).f3759c) {
            obj = jVar2;
        }
        I6.d dVar = (I6.d) obj;
        loop0: while (true) {
            dVar.getClass();
            Object obj2 = I6.d.f3724a.get(dVar);
            W0 w7 = I6.a.f3717b;
            objF = null;
            if (obj2 == w7) {
                break;
            }
            I6.d dVar2 = (I6.d) obj2;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = I6.d.f3724a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, w7)) {
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
            loop2: while (true) {
                int i7 = d.f2801b - 1;
                while (true) {
                    if (-1 < i7) {
                        j3 = (jVar4.f3759c * ((long) d.f2801b)) + ((long) i7);
                        if (j3 >= f2791d.get(this)) {
                            while (true) {
                                Object objK = jVar4.k(i7);
                                if (objK != null && objK != d.f2804e) {
                                    if (objK != d.f2803d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (jVar4.j(i7, objK, d.f2810l)) {
                                    jVar4.h();
                                    break;
                                }
                            }
                            i7--;
                        }
                    } else {
                        jVar4 = (j) ((I6.d) I6.d.f3725b.get(jVar4));
                        if (jVar4 == null) {
                        }
                    }
                    j3 = -1;
                    break;
                }
            }
            if (j3 != -1) {
                i(j3);
            }
        }
        loop5: for (j jVar5 = jVar3; jVar5 != null; jVar5 = (j) ((I6.d) I6.d.f3725b.get(jVar5))) {
            for (int i8 = d.f2801b - 1; -1 < i8; i8--) {
                if ((jVar5.f3759c * ((long) d.f2801b)) + ((long) i8) < j) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = jVar5.k(i8);
                    if (objK2 != null && objK2 != d.f2804e) {
                        if (!(objK2 instanceof s)) {
                            if (!(objK2 instanceof I0)) {
                                break;
                            }
                            if (jVar5.j(i8, objK2, d.f2810l)) {
                                objF = I6.a.f(objF, objK2);
                                jVar5.l(i8, true);
                                break;
                            }
                        } else {
                            if (jVar5.j(i8, objK2, d.f2810l)) {
                                objF = I6.a.f(objF, ((s) objK2).f2832a);
                                jVar5.l(i8, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar5.j(i8, objK2, d.f2810l)) {
                            jVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (objF instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objF;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    w((I0) arrayList.get(size), true);
                }
            } else {
                w((I0) objF, true);
            }
        }
        return jVar3;
    }

    public final void i(long j) {
        W wA;
        j jVar = (j) f2795y.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2791d;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f2797a) + j3, f2792e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j7 = d.f2801b;
                long j8 = j3 / j7;
                int i7 = (int) (j3 % j7);
                if (jVar.f3759c != j8) {
                    j jVarK = k(j8, jVar);
                    if (jVarK == null) {
                        continue;
                    } else {
                        jVar = jVarK;
                    }
                }
                Object objZ = z(jVar, i7, j3, null);
                if (objZ != d.f2813o) {
                    jVar.a();
                    Function1 function1 = this.f2798b;
                    if (function1 != null && (wA = I6.a.a(function1, objZ, null)) != null) {
                        throw wA;
                    }
                } else if (j3 < o()) {
                    jVar.a();
                }
            }
        }
    }

    public final void j() {
        Object objB;
        if (t()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2796z;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f2792e.getAndIncrement(this);
            long j = andIncrement / ((long) d.f2801b);
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
                    objB = I6.a.b(jVar, j, cVar);
                    if (!I6.a.e(objB)) {
                        u uVarC = I6.a.c(objB);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f3759c >= uVarC.f3759c) {
                                break;
                            }
                            if (!uVarC.i()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarC)) {
                                    if (!uVar.e()) {
                                        break;
                                    }
                                    uVar.d();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == uVar);
                            if (uVarC.e()) {
                                uVarC.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                j jVar2 = null;
                if (I6.a.e(objB)) {
                    r();
                    u(j, jVar);
                    p(this);
                } else {
                    j jVar3 = (j) I6.a.c(objB);
                    long j3 = jVar3.f3759c;
                    if (j3 > j) {
                        long j7 = j3 * ((long) d.f2801b);
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
            int i7 = (int) (andIncrement % ((long) d.f2801b));
            Object objK = jVar.k(i7);
            boolean z4 = objK instanceof I0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2791d;
            if (!z4 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(i7, objK, d.f2806g)) {
                while (true) {
                    Object objK2 = jVar.k(i7);
                    if (objK2 instanceof I0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (jVar.j(i7, objK2, new s((I0) objK2))) {
                                p(this);
                                return;
                            }
                        } else if (jVar.j(i7, objK2, d.f2806g)) {
                            if (!y(objK2)) {
                                jVar.n(i7, d.j);
                                jVar.h();
                                break;
                            } else {
                                jVar.n(i7, d.f2803d);
                                p(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == d.j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (jVar.j(i7, objK2, d.f2804e)) {
                                p(this);
                                return;
                            }
                        } else if (objK2 == d.f2803d || objK2 == d.f2807h || objK2 == d.f2808i || objK2 == d.f2809k || objK2 == d.f2810l) {
                            p(this);
                            return;
                        } else if (objK2 != d.f2805f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                p(this);
            } else if (y(objK)) {
                jVar.n(i7, d.f2803d);
                p(this);
                return;
            } else {
                jVar.n(i7, d.j);
                jVar.h();
                p(this);
            }
        }
    }

    public final j k(long j, j jVar) {
        Object objB;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        j jVar2 = d.f2800a;
        c cVar = c.f2799z;
        loop0: while (true) {
            objB = I6.a.b(jVar, j, cVar);
            if (!I6.a.e(objB)) {
                u uVarC = I6.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2795y;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f3759c >= uVarC.f3759c) {
                        break loop0;
                    }
                    if (!uVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarC)) {
                            if (!uVar.e()) {
                                break loop0;
                            }
                            uVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == uVar);
                    if (uVarC.e()) {
                        uVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        if (I6.a.e(objB)) {
            r();
            if (jVar.f3759c * ((long) d.f2801b) >= o()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) I6.a.c(objB);
        boolean zT = t();
        long j7 = jVar3.f3759c;
        if (!zT && j <= f2792e.get(this) / ((long) d.f2801b)) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2796z;
                u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f3759c >= j7 || !jVar3.i()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, jVar3)) {
                        if (!uVar2.e()) {
                            break loop3;
                        }
                        uVar2.d();
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == uVar2);
                if (jVar3.e()) {
                    jVar3.d();
                }
            }
        }
        if (j7 <= j) {
            return jVar3;
        }
        long j8 = ((long) d.f2801b) * j7;
        do {
            atomicLongFieldUpdater = f2791d;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j8) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j8));
        if (j7 * ((long) d.f2801b) >= o()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public final Throwable l() {
        return (Throwable) f2788A.get(this);
    }

    public final Throwable m() {
        Throwable thL = l();
        return thL == null ? new k("Channel was closed") : thL;
    }

    public final Throwable n() {
        Throwable thL = l();
        return thL == null ? new Z("Channel was closed") : thL;
    }

    public final long o() {
        return f2790c.get(this) & 1152921504606846975L;
    }

    public final boolean q(long j, boolean z4) throws IllegalAccessException, InvocationTargetException {
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
                    j jVarK = (j) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (o() <= j3) {
                        break;
                    }
                    long j7 = d.f2801b;
                    long j8 = j3 / j7;
                    if (jVarK.f3759c != j8 && (jVarK = k(j8, jVarK)) == null) {
                        if (((j) atomicReferenceFieldUpdater.get(this)).f3759c < j8) {
                            break;
                        }
                    } else {
                        jVarK.a();
                        int i8 = (int) (j3 % j7);
                        while (true) {
                            Object objK = jVarK.k(i8);
                            if (objK != null && objK != d.f2804e) {
                                if (objK != d.f2803d) {
                                    if (objK != d.j && objK != d.f2810l && objK != d.f2808i && objK != d.f2807h) {
                                        if (objK != d.f2806g) {
                                            if (objK == d.f2805f || j3 != atomicLongFieldUpdater.get(this)) {
                                                break;
                                                break;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    break;
                                    break;
                                    break;
                                    break;
                                }
                                return false;
                            }
                            if (jVarK.j(i8, objK, d.f2807h)) {
                                j();
                                break;
                            }
                        }
                        f2791d.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i7 != 3) {
                throw new IllegalStateException(p031e1.k.d(i7, "unexpected close status: ").toString());
            }
            j jVarH = h(j & 1152921504606846975L);
            W wA = null;
            Object objF = null;
            loop0: do {
                for (int i9 = d.f2801b - 1; -1 < i9; i9--) {
                    long j9 = (jVarH.f3759c * ((long) d.f2801b)) + ((long) i9);
                    while (true) {
                        Object objK2 = jVarH.k(i9);
                        if (objK2 == d.f2808i) {
                            break loop0;
                        }
                        W0 w7 = d.f2803d;
                        AtomicReferenceArray atomicReferenceArray = jVarH.f2824f;
                        Function1 function1 = this.f2798b;
                        if (objK2 != w7) {
                            if (objK2 != d.f2804e && objK2 != null) {
                                if (!(objK2 instanceof I0) && !(objK2 instanceof s)) {
                                    W0 w8 = d.f2806g;
                                    if (objK2 == w8 || objK2 == d.f2805f) {
                                        break loop0;
                                    }
                                    if (objK2 != w8) {
                                        break;
                                    }
                                } else {
                                    if (j9 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    I0 i10 = objK2 instanceof s ? ((s) objK2).f2832a : (I0) objK2;
                                    if (jVarH.j(i9, objK2, d.f2810l)) {
                                        if (function1 != null) {
                                            wA = I6.a.a(function1, atomicReferenceArray.get(i9 * 2), wA);
                                        }
                                        objF = I6.a.f(objF, i10);
                                        jVarH.m(i9, null);
                                        jVarH.h();
                                        break;
                                    }
                                }
                            } else if (jVarH.j(i9, objK2, d.f2810l)) {
                                jVarH.h();
                                break;
                            }
                        } else {
                            if (j9 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (jVarH.j(i9, objK2, d.f2810l)) {
                                if (function1 != null) {
                                    wA = I6.a.a(function1, atomicReferenceArray.get(i9 * 2), wA);
                                }
                                jVarH.m(i9, null);
                                jVarH.h();
                                break;
                            }
                        }
                    }
                }
                jVarH = (j) ((I6.d) I6.d.f3725b.get(jVarH));
            } while (jVarH != null);
            if (objF != null) {
                if (objF instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) objF;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        w((I0) arrayList.get(size), false);
                    }
                } else {
                    w((I0) objF, false);
                }
            }
            if (wA != null) {
                throw wA;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
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
        List listM0 = p050g6.i.M0(f2795y.get(this), f2794x.get(this), f2796z.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM0) {
            if (((j) obj) != d.f2800a) {
                arrayList.add(obj);
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
        long jO = o();
        loop2: while (true) {
            int i9 = d.f2801b;
            for (int i10 = i8; i10 < i9; i10++) {
                long j8 = (jVar.f3759c * ((long) d.f2801b)) + ((long) i10);
                if (j8 >= jO && j8 >= j7) {
                    break loop2;
                }
                Object objK = jVar.k(i10);
                Object obj2 = jVar.f2824f.get(i10 * 2);
                if (objK instanceof InterfaceC0129l) {
                    string = (j8 >= j7 || j8 < jO) ? (j8 >= jO || j8 < j7) ? "cont" : "send" : "receive";
                } else if (objK instanceof s) {
                    string = "EB(" + objK + ')';
                } else if (t6.h.a(objK, d.f2805f) ? true : t6.h.a(objK, d.f2806g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objK == null ? true : objK.equals(d.f2804e) ? true : t6.h.a(objK, d.f2808i) ? true : t6.h.a(objK, d.f2807h) ? true : t6.h.a(objK, d.f2809k) ? true : t6.h.a(objK, d.j) ? true : t6.h.a(objK, d.f2810l))) {
                        string = objK.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            jVar = (j) jVar.b();
            if (jVar == null) {
                break;
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
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, jVar)) {
                            if (uVar.e()) {
                                uVar.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == uVar);
                    if (jVar.e()) {
                        jVar.d();
                    }
                }
            } else {
                jVar = jVar2;
            }
        }
    }

    public final Object v(p065i6.d dVar, Object obj) throws IllegalAccessException, InvocationTargetException {
        W wA;
        C0130m c0130m = new C0130m(1, P6.b.v(dVar));
        c0130m.s();
        Function1 function1 = this.f2798b;
        if (function1 == null || (wA = I6.a.a(function1, obj, null)) == null) {
            c0130m.resumeWith(p003a.a.h(n()));
        } else {
            Q0.a.c(wA, n());
            c0130m.resumeWith(p003a.a.h(wA));
        }
        Object objR = c0130m.r();
        return objR == j6.a.f14648a ? objR : p044f6.i.f13014a;
    }

    public final void w(I0 i7, boolean z4) throws IllegalAccessException, InvocationTargetException {
        if (i7 instanceof InterfaceC0129l) {
            ((p065i6.d) i7).resumeWith(p003a.a.h(z4 ? m() : n()));
            return;
        }
        if (!(i7 instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + i7).toString());
        }
        a aVar = (a) i7;
        C0130m c0130m = aVar.f2786b;
        t6.h.b(c0130m);
        aVar.f2786b = null;
        aVar.f2785a = d.f2810l;
        Throwable thL = aVar.f2787c.l();
        if (thL == null) {
            c0130m.resumeWith(Boolean.FALSE);
        } else {
            c0130m.resumeWith(p003a.a.h(thL));
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
        Function1 function2 = aVar.f2787c.f2798b;
        return d.a(c0130m, bool, function2 != null ? new I6.p(function2, obj2, c0130m.f1858e) : null);
    }

    public final Object z(j jVar, int i7, long j, Object obj) {
        Object objK = jVar.k(i7);
        AtomicReferenceArray atomicReferenceArray = jVar.f2824f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2790c;
        if (objK == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f2812n;
                }
                if (jVar.j(i7, objK, obj)) {
                    j();
                    return d.f2811m;
                }
            }
        } else if (objK == d.f2803d && jVar.j(i7, objK, d.f2808i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            jVar.m(i7, null);
            return obj2;
        }
        while (true) {
            Object objK2 = jVar.k(i7);
            if (objK2 == null || objK2 == d.f2804e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i7, objK2, d.f2807h)) {
                        j();
                        return d.f2813o;
                    }
                } else {
                    if (obj == null) {
                        return d.f2812n;
                    }
                    if (jVar.j(i7, objK2, obj)) {
                        j();
                        return d.f2811m;
                    }
                }
            } else if (objK2 != d.f2803d) {
                W0 w7 = d.j;
                if (objK2 == w7) {
                    return d.f2813o;
                }
                if (objK2 == d.f2807h) {
                    return d.f2813o;
                }
                if (objK2 == d.f2810l) {
                    j();
                    return d.f2813o;
                }
                if (objK2 != d.f2806g && jVar.j(i7, objK2, d.f2805f)) {
                    boolean z4 = objK2 instanceof s;
                    if (z4) {
                        objK2 = ((s) objK2).f2832a;
                    }
                    if (y(objK2)) {
                        jVar.n(i7, d.f2808i);
                        j();
                        Object obj3 = atomicReferenceArray.get(i7 * 2);
                        jVar.m(i7, null);
                        return obj3;
                    }
                    jVar.n(i7, w7);
                    jVar.h();
                    if (z4) {
                        j();
                    }
                    return d.f2813o;
                }
            } else if (jVar.j(i7, objK2, d.f2808i)) {
                j();
                Object obj4 = atomicReferenceArray.get(i7 * 2);
                jVar.m(i7, null);
                return obj4;
            }
        }
    }
}
