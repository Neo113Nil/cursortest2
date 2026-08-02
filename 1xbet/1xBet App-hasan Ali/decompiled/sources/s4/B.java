package s4;

import b4.EnumC0510a;
import java.util.Arrays;
import p4.C2265e;
import p4.C2268h;
import p4.U;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public class B extends t4.b implements u, InterfaceC2368e, t4.q {

    /* renamed from: o, reason: collision with root package name */
    public final int f19214o;

    /* renamed from: p, reason: collision with root package name */
    public final int f19215p;

    /* renamed from: q, reason: collision with root package name */
    public final r4.a f19216q;

    /* renamed from: r, reason: collision with root package name */
    public Object[] f19217r;

    /* renamed from: s, reason: collision with root package name */
    public long f19218s;

    /* renamed from: t, reason: collision with root package name */
    public long f19219t;

    /* renamed from: u, reason: collision with root package name */
    public int f19220u;

    /* renamed from: v, reason: collision with root package name */
    public int f19221v;

    public B(int i, int i5, r4.a aVar) {
        this.f19214o = i;
        this.f19215p = i5;
        this.f19216q = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x0079, B:20:0x0081, B:29:0x0094, B:32:0x009b, B:33:0x009f, B:35:0x00a0, B:41:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [t4.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [s4.B] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [s4.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [t4.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [s4.D] */
    /* JADX WARN: Type inference failed for: r9v8, types: [s4.D] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ae -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(B b3, InterfaceC2369f interfaceC2369f, a4.c cVar) {
        A a5;
        EnumC0510a enumC0510a;
        int i;
        ?? r5;
        InterfaceC2369f interfaceC2369f2;
        U u5;
        U u6;
        InterfaceC2369f interfaceC2369f3;
        Object t5;
        D d5;
        try {
            try {
                if (cVar instanceof A) {
                    a5 = (A) cVar;
                    int i5 = a5.f19213q;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        a5.f19213q = i5 - Integer.MIN_VALUE;
                        Object obj = a5.f19211o;
                        enumC0510a = EnumC0510a.f7289k;
                        i = a5.f19213q;
                        if (i != 0) {
                            G4.l.N(obj);
                            interfaceC2369f2 = interfaceC2369f;
                            interfaceC2369f = (D) b3.c();
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    u6 = a5.f19210n;
                                    D d6 = a5.f19209m;
                                    interfaceC2369f3 = a5.f19208l;
                                    B b5 = a5.f19207k;
                                    G4.l.N(obj);
                                    r5 = b5;
                                    interfaceC2369f = d6;
                                    do {
                                        t5 = r5.t(interfaceC2369f);
                                        if (t5 == C.f19222a) {
                                        }
                                    } while (r5.i(interfaceC2369f, a5) != enumC0510a);
                                    return;
                                }
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                u6 = a5.f19210n;
                                D d7 = a5.f19209m;
                                interfaceC2369f3 = a5.f19208l;
                                B b6 = a5.f19207k;
                                G4.l.N(obj);
                                B b7 = b6;
                                D d8 = d7;
                                interfaceC2369f2 = interfaceC2369f3;
                                u5 = u6;
                                b3 = b7;
                                d5 = d8;
                                r5 = b3;
                                u6 = u5;
                                interfaceC2369f3 = interfaceC2369f2;
                                interfaceC2369f = d5;
                                do {
                                    t5 = r5.t(interfaceC2369f);
                                    if (t5 == C.f19222a) {
                                        if (u6 != null && !u6.b()) {
                                            throw u6.s();
                                        }
                                        a5.f19207k = r5;
                                        a5.f19208l = interfaceC2369f3;
                                        a5.f19209m = interfaceC2369f;
                                        a5.f19210n = u6;
                                        a5.f19213q = 3;
                                        b7 = r5;
                                        d8 = interfaceC2369f;
                                        if (interfaceC2369f3.d(t5, a5) == enumC0510a) {
                                            return;
                                        }
                                        interfaceC2369f2 = interfaceC2369f3;
                                        u5 = u6;
                                        b3 = b7;
                                        d5 = d8;
                                        r5 = b3;
                                        u6 = u5;
                                        interfaceC2369f3 = interfaceC2369f2;
                                        interfaceC2369f = d5;
                                        t5 = r5.t(interfaceC2369f);
                                        if (t5 == C.f19222a) {
                                            a5.f19207k = r5;
                                            a5.f19208l = interfaceC2369f3;
                                            a5.f19209m = interfaceC2369f;
                                            a5.f19210n = u6;
                                            a5.f19213q = 2;
                                        }
                                    }
                                } while (r5.i(interfaceC2369f, a5) != enumC0510a);
                                return;
                            }
                            interfaceC2369f = a5.f19209m;
                            InterfaceC2369f interfaceC2369f4 = a5.f19208l;
                            B b8 = a5.f19207k;
                            try {
                                G4.l.N(obj);
                                interfaceC2369f2 = interfaceC2369f4;
                                b3 = b8;
                                interfaceC2369f = interfaceC2369f;
                            } catch (Throwable th) {
                                th = th;
                                r5 = b8;
                                r5.g(interfaceC2369f);
                                throw th;
                            }
                        }
                        u5 = (U) a5.getContext().l(p4.r.f18819l);
                        d5 = interfaceC2369f;
                        r5 = b3;
                        u6 = u5;
                        interfaceC2369f3 = interfaceC2369f2;
                        interfaceC2369f = d5;
                        do {
                            t5 = r5.t(interfaceC2369f);
                            if (t5 == C.f19222a) {
                            }
                        } while (r5.i(interfaceC2369f, a5) != enumC0510a);
                        return;
                    }
                }
                u5 = (U) a5.getContext().l(p4.r.f18819l);
                d5 = interfaceC2369f;
                r5 = b3;
                u6 = u5;
                interfaceC2369f3 = interfaceC2369f2;
                interfaceC2369f = d5;
                do {
                    t5 = r5.t(interfaceC2369f);
                    if (t5 == C.f19222a) {
                    }
                } while (r5.i(interfaceC2369f, a5) != enumC0510a);
                return;
            } catch (Throwable th2) {
                r5 = b3;
                th = th2;
                r5.g(interfaceC2369f);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        a5 = new A(b3, cVar);
        Object obj2 = a5.f19211o;
        enumC0510a = EnumC0510a.f7289k;
        i = a5.f19213q;
    }

    @Override // s4.InterfaceC2368e
    public final Object a(InterfaceC2369f interfaceC2369f, a4.c cVar) {
        k(this, interfaceC2369f, cVar);
        return EnumC0510a.f7289k;
    }

    @Override // t4.q
    public final InterfaceC2368e b(a4.h hVar, int i, r4.a aVar) {
        return C.i(this, hVar, i, aVar);
    }

    @Override // s4.InterfaceC2369f
    public final Object d(Object obj, a4.c cVar) {
        Throwable th;
        a4.c[] n5;
        z zVar;
        if (q(obj)) {
            return W3.o.f6046a;
        }
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(cVar));
        c2268h.r();
        a4.c[] cVarArr = t4.c.f19595a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        c2268h.resumeWith(W3.o.f6046a);
                        n5 = n(cVarArr);
                        zVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        z zVar2 = new z(this, o() + this.f19220u + this.f19221v, obj, c2268h);
                        m(zVar2);
                        this.f19221v++;
                        if (this.f19215p == 0) {
                            cVarArr = n(cVarArr);
                        }
                        n5 = cVarArr;
                        zVar = zVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (zVar != null) {
                    c2268h.v(new C2265e(1, zVar));
                }
                for (a4.c cVar2 : n5) {
                    if (cVar2 != null) {
                        cVar2.resumeWith(W3.o.f6046a);
                    }
                }
                Object q5 = c2268h.q();
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                if (q5 != enumC0510a) {
                    q5 = W3.o.f6046a;
                }
                return q5 == enumC0510a ? q5 : W3.o.f6046a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // t4.b
    public final t4.d e() {
        D d5 = new D();
        d5.f19225a = -1L;
        return d5;
    }

    @Override // t4.b
    public final t4.d[] f() {
        return new D[2];
    }

    public final Object i(D d5, A a5) {
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(a5));
        c2268h.r();
        synchronized (this) {
            if (s(d5) < 0) {
                d5.f19226b = c2268h;
            } else {
                c2268h.resumeWith(W3.o.f6046a);
            }
        }
        Object q5 = c2268h.q();
        return q5 == EnumC0510a.f7289k ? q5 : W3.o.f6046a;
    }

    public final void j() {
        if (this.f19215p != 0 || this.f19221v > 1) {
            Object[] objArr = this.f19217r;
            kotlin.jvm.internal.l.c(objArr);
            while (this.f19221v > 0) {
                long o5 = o();
                int i = this.f19220u;
                int i5 = this.f19221v;
                if (objArr[((int) ((o5 + (i + i5)) - 1)) & (objArr.length - 1)] != C.f19222a) {
                    return;
                }
                this.f19221v = i5 - 1;
                C.d(objArr, o() + this.f19220u + this.f19221v, null);
            }
        }
    }

    public final void l() {
        t4.d[] dVarArr;
        Object[] objArr = this.f19217r;
        kotlin.jvm.internal.l.c(objArr);
        C.d(objArr, o(), null);
        this.f19220u--;
        long o5 = o() + 1;
        if (this.f19218s < o5) {
            this.f19218s = o5;
        }
        if (this.f19219t < o5) {
            if (this.f19592l != 0 && (dVarArr = this.f19591k) != null) {
                for (t4.d dVar : dVarArr) {
                    if (dVar != null) {
                        D d5 = (D) dVar;
                        long j5 = d5.f19225a;
                        if (j5 >= 0 && j5 < o5) {
                            d5.f19225a = o5;
                        }
                    }
                }
            }
            this.f19219t = o5;
        }
    }

    public final void m(Object obj) {
        int i = this.f19220u + this.f19221v;
        Object[] objArr = this.f19217r;
        if (objArr == null) {
            objArr = p(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = p(objArr, i, objArr.length * 2);
        }
        C.d(objArr, o() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final a4.c[] n(a4.c[] cVarArr) {
        t4.d[] dVarArr;
        D d5;
        C2268h c2268h;
        int length = cVarArr.length;
        if (this.f19592l != 0 && (dVarArr = this.f19591k) != null) {
            int length2 = dVarArr.length;
            int i = 0;
            cVarArr = cVarArr;
            while (i < length2) {
                t4.d dVar = dVarArr[i];
                if (dVar != null && (c2268h = (d5 = (D) dVar).f19226b) != null && s(d5) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
                        cVarArr = copyOf;
                    }
                    cVarArr[length] = c2268h;
                    d5.f19226b = null;
                    length++;
                }
                i++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long o() {
        return Math.min(this.f19219t, this.f19218s);
    }

    public final Object[] p(Object[] objArr, int i, int i5) {
        if (i5 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i5];
        this.f19217r = objArr2;
        if (objArr != null) {
            long o5 = o();
            for (int i6 = 0; i6 < i; i6++) {
                long j5 = i6 + o5;
                C.d(objArr2, j5, objArr[((int) j5) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i;
        boolean z3;
        a4.c[] cVarArr = t4.c.f19595a;
        synchronized (this) {
            if (r(obj)) {
                cVarArr = n(cVarArr);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        for (a4.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.resumeWith(W3.o.f6046a);
            }
        }
        return z3;
    }

    public final boolean r(Object obj) {
        int i = this.f19592l;
        int i5 = this.f19214o;
        if (i != 0) {
            int i6 = this.f19220u;
            int i7 = this.f19215p;
            if (i6 >= i7 && this.f19219t <= this.f19218s) {
                int ordinal = this.f19216q.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new D2.e();
                    }
                }
            }
            m(obj);
            int i8 = this.f19220u + 1;
            this.f19220u = i8;
            if (i8 > i7) {
                l();
            }
            long o5 = o() + this.f19220u;
            long j5 = this.f19218s;
            if (((int) (o5 - j5)) > i5) {
                u(1 + j5, this.f19219t, o() + this.f19220u, o() + this.f19220u + this.f19221v);
            }
        } else if (i5 != 0) {
            m(obj);
            int i9 = this.f19220u + 1;
            this.f19220u = i9;
            if (i9 > i5) {
                l();
            }
            this.f19219t = o() + this.f19220u;
            return true;
        }
        return true;
    }

    public final long s(D d5) {
        long j5 = d5.f19225a;
        if (j5 < o() + this.f19220u) {
            return j5;
        }
        if (this.f19215p <= 0 && j5 <= o() && this.f19221v != 0) {
            return j5;
        }
        return -1L;
    }

    public final Object t(D d5) {
        Object obj;
        a4.c[] cVarArr = t4.c.f19595a;
        synchronized (this) {
            try {
                long s2 = s(d5);
                if (s2 < 0) {
                    obj = C.f19222a;
                } else {
                    long j5 = d5.f19225a;
                    Object[] objArr = this.f19217r;
                    kotlin.jvm.internal.l.c(objArr);
                    Object obj2 = objArr[((int) s2) & (objArr.length - 1)];
                    if (obj2 instanceof z) {
                        obj2 = ((z) obj2).f19319m;
                    }
                    d5.f19225a = s2 + 1;
                    Object obj3 = obj2;
                    cVarArr = v(j5);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (a4.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.resumeWith(W3.o.f6046a);
            }
        }
        return obj;
    }

    public final void u(long j5, long j6, long j7, long j8) {
        long min = Math.min(j6, j5);
        for (long o5 = o(); o5 < min; o5++) {
            Object[] objArr = this.f19217r;
            kotlin.jvm.internal.l.c(objArr);
            C.d(objArr, o5, null);
        }
        this.f19218s = j5;
        this.f19219t = j6;
        this.f19220u = (int) (j7 - min);
        this.f19221v = (int) (j8 - j7);
    }

    public final a4.c[] v(long j5) {
        long j6;
        long j7;
        long j8;
        int i;
        a4.c[] cVarArr;
        t4.d[] dVarArr;
        long j9 = this.f19219t;
        a4.c[] cVarArr2 = t4.c.f19595a;
        if (j5 <= j9) {
            long o5 = o();
            long j10 = this.f19220u + o5;
            int i5 = this.f19215p;
            if (i5 == 0 && this.f19221v > 0) {
                j10++;
            }
            int i6 = 0;
            if (this.f19592l != 0 && (dVarArr = this.f19591k) != null) {
                for (t4.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j11 = ((D) dVar).f19225a;
                        if (j11 >= 0 && j11 < j10) {
                            j10 = j11;
                        }
                    }
                }
            }
            if (j10 > this.f19219t) {
                long o6 = o() + this.f19220u;
                int min = this.f19592l > 0 ? Math.min(this.f19221v, i5 - ((int) (o6 - j10))) : this.f19221v;
                long j12 = this.f19221v + o6;
                H3.g gVar = C.f19222a;
                if (min > 0) {
                    a4.c[] cVarArr3 = new a4.c[min];
                    j8 = 1;
                    Object[] objArr = this.f19217r;
                    kotlin.jvm.internal.l.c(objArr);
                    i = i5;
                    long j13 = o6;
                    while (true) {
                        if (o6 >= j12) {
                            j6 = o5;
                            j7 = j10;
                            break;
                        }
                        j6 = o5;
                        Object obj = objArr[((int) o6) & (objArr.length - 1)];
                        if (obj != gVar) {
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter", obj);
                            z zVar = (z) obj;
                            int i7 = i6 + 1;
                            j7 = j10;
                            cVarArr3[i6] = zVar.f19320n;
                            C.d(objArr, o6, gVar);
                            C.d(objArr, j13, zVar.f19319m);
                            j13++;
                            if (i7 >= min) {
                                break;
                            }
                            i6 = i7;
                        } else {
                            j7 = j10;
                        }
                        o6++;
                        o5 = j6;
                        j10 = j7;
                    }
                    o6 = j13;
                    cVarArr = cVarArr3;
                } else {
                    j6 = o5;
                    j7 = j10;
                    j8 = 1;
                    i = i5;
                    cVarArr = cVarArr2;
                }
                int i8 = (int) (o6 - j6);
                long j14 = this.f19592l == 0 ? o6 : j7;
                long max = Math.max(this.f19218s, o6 - Math.min(this.f19214o, i8));
                if (i == 0 && max < j12) {
                    Object[] objArr2 = this.f19217r;
                    kotlin.jvm.internal.l.c(objArr2);
                    if (kotlin.jvm.internal.l.a(objArr2[((int) max) & (objArr2.length - 1)], gVar)) {
                        o6 += j8;
                        max += j8;
                    }
                }
                u(max, j14, o6, j12);
                j();
                return cVarArr.length == 0 ? cVarArr : n(cVarArr);
            }
        }
        return cVarArr2;
    }
}
