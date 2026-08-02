package P;

import A0.o1;
import Q.C0336a;
import Q.C0337b;
import Q.C0338c;
import Q.C0340e;
import Q.C0344i;
import a.AbstractC0444a;
import a0.AbstractC0447c;
import a0.AbstractC0449e;
import a0.C0446b;
import a0.C0452h;
import android.os.Trace;
import e2.C1930k;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import n.AbstractC2107A;
import r.C2315A;
import r.C2316B;
import r.C2321G;
import r.C2322H;
import r.C2341t;
import r.C2343v;
import s.AbstractC2351a;
import t3.AbstractC2425d;

/* renamed from: P.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315s {

    /* renamed from: A, reason: collision with root package name */
    public int f4514A;

    /* renamed from: B, reason: collision with root package name */
    public int f4515B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4516C;

    /* renamed from: D, reason: collision with root package name */
    public final C0312q f4517D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f4518E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4519F;

    /* renamed from: G, reason: collision with root package name */
    public L0 f4520G;

    /* renamed from: H, reason: collision with root package name */
    public M0 f4521H;

    /* renamed from: I, reason: collision with root package name */
    public P0 f4522I;
    public boolean J;
    public InterfaceC0314r0 K;

    /* renamed from: L, reason: collision with root package name */
    public C0336a f4523L;

    /* renamed from: M, reason: collision with root package name */
    public final C0337b f4524M;

    /* renamed from: N, reason: collision with root package name */
    public C0280a f4525N;

    /* renamed from: O, reason: collision with root package name */
    public C0338c f4526O;

    /* renamed from: P, reason: collision with root package name */
    public o1 f4527P;

    /* renamed from: Q, reason: collision with root package name */
    public final C0446b f4528Q;

    /* renamed from: R, reason: collision with root package name */
    public final a4.h f4529R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f4530S;

    /* renamed from: T, reason: collision with root package name */
    public long f4531T;

    /* renamed from: U, reason: collision with root package name */
    public C0325x f4532U;

    /* renamed from: a, reason: collision with root package name */
    public final v3.e f4533a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0321v f4534b;

    /* renamed from: c, reason: collision with root package name */
    public final M0 f4535c;

    /* renamed from: d, reason: collision with root package name */
    public final r.J f4536d;

    /* renamed from: e, reason: collision with root package name */
    public final C0336a f4537e;
    public final C0336a f;

    /* renamed from: g, reason: collision with root package name */
    public final C1930k f4538g;

    /* renamed from: h, reason: collision with root package name */
    public final C0327y f4539h;

    /* renamed from: j, reason: collision with root package name */
    public C0313q0 f4540j;

    /* renamed from: k, reason: collision with root package name */
    public int f4541k;

    /* renamed from: l, reason: collision with root package name */
    public int f4542l;

    /* renamed from: m, reason: collision with root package name */
    public int f4543m;

    /* renamed from: o, reason: collision with root package name */
    public int[] f4545o;

    /* renamed from: p, reason: collision with root package name */
    public C2341t f4546p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4547q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4548r;

    /* renamed from: v, reason: collision with root package name */
    public C2343v f4552v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4553w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4555y;
    public final ArrayList i = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final Q f4544n = new Q();

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f4549s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final Q f4550t = new Q();

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0314r0 f4551u = X.i.f6059n;

    /* renamed from: x, reason: collision with root package name */
    public final Q f4554x = new Q();

    /* renamed from: z, reason: collision with root package name */
    public int f4556z = -1;

    public C0315s(v3.e eVar, AbstractC0321v abstractC0321v, M0 m02, r.J j5, C0336a c0336a, C0336a c0336a2, C1930k c1930k, C0327y c0327y) {
        this.f4533a = eVar;
        this.f4534b = abstractC0321v;
        this.f4535c = m02;
        this.f4536d = j5;
        this.f4537e = c0336a;
        this.f = c0336a2;
        this.f4538g = c1930k;
        this.f4539h = c0327y;
        this.f4516C = abstractC0321v.e() || abstractC0321v.c();
        this.f4517D = new C0312q(0, this);
        this.f4518E = new ArrayList();
        L0 e3 = m02.e();
        e3.c();
        this.f4520G = e3;
        M0 m03 = new M0();
        if (abstractC0321v.e()) {
            m03.d();
        }
        if (abstractC0321v.c()) {
            m03.f4353u = new C2343v();
        }
        this.f4521H = m03;
        P0 f = m03.f();
        f.e(true);
        this.f4522I = f;
        this.f4524M = new C0337b(this, c0336a);
        L0 e5 = this.f4521H.e();
        try {
            C0280a a5 = e5.a(0);
            e5.c();
            this.f4525N = a5;
            this.f4526O = new C0338c();
            this.f4528Q = new C0446b(this);
            a4.h i = abstractC0321v.i();
            a4.h A3 = A();
            this.f4529R = i.m(A3 == null ? a4.i.f6649k : A3);
        } catch (Throwable th) {
            e5.c();
            throw th;
        }
    }

    public static final int O(C0315s c0315s, int i, boolean z3, int i5) {
        L0 l02 = c0315s.f4520G;
        if (l02.j(i)) {
            int i6 = l02.i(i);
            Object p5 = l02.p(l02.f4332b, i);
            if (i6 == 206 && kotlin.jvm.internal.l.a(p5, AbstractC0317t.f4561e)) {
                Object h3 = l02.h(i, 0);
                C0308o c0308o = h3 instanceof C0308o ? (C0308o) h3 : null;
                if (c0308o != null) {
                    for (C0315s c0315s2 : c0308o.f4493k.f4502e) {
                        M0 m02 = c0315s2.f4535c;
                        if (m02.f4344l > 0 && (m02.f4343k[1] & 67108864) != 0) {
                            C0327y c0327y = c0315s2.f4539h;
                            synchronized (c0327y.f4589n) {
                                c0327y.o();
                                C2321G c2321g = c0327y.f4599x;
                                c0327y.f4599x = AbstractC2425d.o();
                                try {
                                    c0327y.f4584D.e0(c2321g);
                                } finally {
                                }
                            }
                            C0336a c0336a = new C0336a();
                            c0315s2.f4523L = c0336a;
                            L0 e3 = c0315s2.f4535c.e();
                            try {
                                c0315s2.f4520G = e3;
                                C0337b c0337b = c0315s2.f4524M;
                                C0336a c0336a2 = c0337b.f4815b;
                                try {
                                    c0337b.f4815b = c0336a;
                                    c0315s2.N(0);
                                    C0337b c0337b2 = c0315s2.f4524M;
                                    c0337b2.c();
                                    if (c0337b2.f4816c) {
                                        C0336a c0336a3 = c0337b2.f4815b;
                                        c0336a3.getClass();
                                        c0336a3.f.w0(Q.B.f4801c);
                                        if (c0337b2.f4816c) {
                                            c0337b2.e(false);
                                            c0337b2.e(false);
                                            C0336a c0336a4 = c0337b2.f4815b;
                                            c0336a4.getClass();
                                            c0336a4.f.w0(Q.m.f4834c);
                                            c0337b2.f4816c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                e3.c();
                            }
                        }
                        c0315s.f4534b.n(c0315s2.f4539h);
                    }
                }
                return l02.o(i);
            }
            if (!l02.l(i)) {
                return l02.o(i);
            }
        } else if (l02.d(i)) {
            int i7 = l02.f4332b[(i * 5) + 3] + i;
            int i8 = 0;
            for (int i9 = i + 1; i9 < i7; i9 += l02.f4332b[(i9 * 5) + 3]) {
                boolean l5 = l02.l(i9);
                if (l5) {
                    c0315s.f4524M.d();
                    C0337b c0337b3 = c0315s.f4524M;
                    Object n5 = l02.n(i9);
                    c0337b3.d();
                    c0337b3.f4820h.add(n5);
                }
                i8 += O(c0315s, i9, l5 || z3, l5 ? 0 : i5 + i8);
                if (l5) {
                    c0315s.f4524M.d();
                    c0315s.f4524M.b();
                }
            }
            if (!l02.l(i)) {
                return i8;
            }
        } else if (!l02.l(i)) {
            return l02.o(i);
        }
        return 1;
    }

    public final C0446b A() {
        if (this.f4516C) {
            return this.f4528Q;
        }
        return null;
    }

    public final boolean B() {
        C0326x0 y5;
        return (this.f4530S || this.f4555y || this.f4553w || (y5 = y()) == null || (y5.f4576b & 8) != 0) ? false : true;
    }

    public final void C(ArrayList arrayList) {
        C0336a c0336a = this.f;
        C0337b c0337b = this.f4524M;
        C0336a c0336a2 = c0337b.f4815b;
        try {
            c0337b.f4815b = c0336a;
            c0336a.f.w0(Q.z.f4850c);
            if (arrayList.size() > 0) {
                W3.h hVar = (W3.h) arrayList.get(0);
                AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) hVar.f6036k;
                abstractC0287d0.getClass();
                throw null;
            }
            C0336a c0336a3 = c0337b.f4815b;
            c0336a3.getClass();
            c0336a3.f.w0(Q.n.f4835c);
            c0337b.f = 0;
        } finally {
            c0337b.f4815b = c0336a2;
        }
    }

    public final void D(InterfaceC0314r0 interfaceC0314r0, Object obj) {
        T(126665345, 0, null, null);
        E();
        j0(obj);
        long j5 = this.f4531T;
        try {
            this.f4531T = 126665345;
            if (this.f4530S) {
                P0.y(this.f4522I);
            }
            boolean z3 = (this.f4530S || kotlin.jvm.internal.l.a(this.f4520G.f(), interfaceC0314r0)) ? false : true;
            if (z3) {
                K(interfaceC0314r0);
            }
            T(202, 0, AbstractC0317t.f4559c, interfaceC0314r0);
            this.K = null;
            boolean z5 = this.f4553w;
            this.f4553w = z3;
            X.e.c(this, new X.d(316014703, new r(0, obj), true));
            this.f4553w = z5;
        } finally {
        }
    }

    public final Object E() {
        boolean z3 = this.f4530S;
        Z z5 = C0302l.f4480a;
        if (!z3) {
            Object m5 = this.f4520G.m();
            if (!this.f4555y || (m5 instanceof C0308o)) {
                return m5;
            }
        } else if (this.f4548r) {
            AbstractC0317t.c("A call to createNode(), emitNode() or useNode() expected");
            return z5;
        }
        return z5;
    }

    public final List F() {
        AbstractC0321v abstractC0321v = this.f4534b;
        InterfaceC0319u g5 = abstractC0321v.g();
        C0327y c0327y = AbstractC2107A.A(g5) ? (C0327y) g5 : null;
        X3.v vVar = X3.v.f6090k;
        if (c0327y != null) {
            M0 m02 = c0327y.f4591p;
            L0 e3 = m02.e();
            try {
                Integer K = AbstractC0444a.K(e3, abstractC0321v, 0, e3.f4333c);
                if (K != null) {
                    try {
                        return AbstractC0444a.e0(m02.e(), K.intValue(), 0);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return vVar;
    }

    public final int G(int i) {
        int q5 = this.f4520G.q(i) + 1;
        int i5 = 0;
        while (q5 < i) {
            if (!this.f4520G.k(q5)) {
                i5++;
            }
            q5 += O0.a(this.f4520G.f4332b, q5);
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(C0327y c0327y, C0327y c0327y2, Integer num, List list, InterfaceC2015a interfaceC2015a) {
        Object invoke;
        boolean z3 = this.f4519F;
        int i = this.f4541k;
        try {
            this.f4519F = true;
            this.f4541k = 0;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                W3.h hVar = (W3.h) list.get(i5);
                C0326x0 c0326x0 = (C0326x0) hVar.f6036k;
                Object obj = hVar.f6037l;
                if (obj != null) {
                    d0(c0326x0, obj);
                } else {
                    d0(c0326x0, null);
                }
            }
            if (c0327y != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (c0327y2 == null || c0327y2.equals(c0327y) || intValue < 0) {
                    invoke = interfaceC2015a.invoke();
                } else {
                    c0327y.f4601z = c0327y2;
                    c0327y.f4581A = intValue;
                    try {
                        invoke = interfaceC2015a.invoke();
                        c0327y.f4601z = null;
                        c0327y.f4581A = 0;
                    } catch (Throwable th) {
                        c0327y.f4601z = null;
                        c0327y.f4581A = 0;
                        throw th;
                    }
                }
            }
            invoke = interfaceC2015a.invoke();
            this.f4519F = z3;
            this.f4541k = i;
            return invoke;
        } catch (Throwable th2) {
            this.f4519F = z3;
            this.f4541k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.f4393b < r5) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        S s2;
        int i;
        int i5;
        long j5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        long j6;
        int i9;
        int i10;
        long j7;
        C2315A c2315a;
        int i11;
        int e3;
        int i12;
        long j8;
        long j9;
        int hashCode;
        Object b3;
        boolean z5 = this.f4519F;
        boolean z6 = true;
        this.f4519F = true;
        L0 l02 = this.f4520G;
        int i13 = l02.i;
        int i14 = (i13 * 5) + 3;
        int i15 = l02.f4332b[i14] + i13;
        int i16 = this.f4541k;
        long j10 = this.f4531T;
        int i17 = this.f4542l;
        int i18 = this.f4543m;
        ArrayList arrayList = this.f4549s;
        int e5 = AbstractC0317t.e(l02.f4336g, arrayList);
        if (e5 < 0) {
            e5 = -(e5 + 1);
        }
        if (e5 < arrayList.size()) {
            s2 = (S) arrayList.get(e5);
        }
        s2 = null;
        boolean z7 = false;
        int i19 = i13;
        while (s2 != null) {
            boolean z8 = z6;
            int i20 = s2.f4393b;
            int e6 = AbstractC0317t.e(i20, arrayList);
            if (e6 >= 0) {
            }
            Object obj = s2.f4394c;
            C0326x0 c0326x0 = s2.f4392a;
            if (obj == null) {
                c0326x0.getClass();
                i = i14;
            } else {
                int i21 = 8;
                C2321G c2321g = c0326x0.f4580g;
                if (c2321g == null) {
                    i = i14;
                } else {
                    i = i14;
                    if (obj instanceof H) {
                        z3 = C0326x0.a((H) obj, c2321g);
                        i5 = i16;
                        j5 = j10;
                        i6 = i17;
                        i7 = i18;
                    } else if (obj instanceof C2322H) {
                        C2322H c2322h = (C2322H) obj;
                        if (c2322h.h()) {
                            Object[] objArr = c2322h.f18934b;
                            long[] jArr = c2322h.f18933a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                i5 = i16;
                                i6 = i17;
                                i7 = i18;
                                int i22 = 0;
                                while (true) {
                                    long j11 = jArr[i22];
                                    j5 = j10;
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i22 - length)) >>> 31);
                                        int i24 = 0;
                                        while (i24 < i23) {
                                            if ((j11 & 255) < 128) {
                                                i8 = i24;
                                                Object obj2 = objArr[(i22 << 3) + i24];
                                                j6 = j11;
                                                if (!(obj2 instanceof H) || C0326x0.a((H) obj2, c2321g)) {
                                                    break;
                                                }
                                            } else {
                                                i8 = i24;
                                                j6 = j11;
                                            }
                                            j11 = j6 >> i21;
                                            i24 = i8 + 1;
                                        }
                                        if (i23 != i21) {
                                            break;
                                        }
                                    }
                                    if (i22 == length) {
                                        break;
                                    }
                                    i22++;
                                    j10 = j5;
                                    i21 = 8;
                                }
                                z3 = z8 ? 1 : 0;
                            }
                        }
                        i5 = i16;
                        j5 = j10;
                        i6 = i17;
                        i7 = i18;
                        z3 = false;
                    }
                    if (z3) {
                        long j12 = j5;
                        ArrayList arrayList2 = this.f4518E;
                        arrayList2.add(c0326x0);
                        this.f4538g.d();
                        C0327y c0327y = c0326x0.f4575a;
                        if (c0327y == null || (c2315a = c0326x0.f) == null) {
                            i9 = i13;
                            i10 = i15;
                            j7 = j12;
                        } else {
                            c0326x0.e(z8);
                            try {
                                Object[] objArr2 = c2315a.f18900b;
                                int[] iArr = c2315a.f18901c;
                                long[] jArr2 = c2315a.f18899a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    j7 = j12;
                                    int i25 = 0;
                                    while (true) {
                                        long j13 = jArr2[i25];
                                        i9 = i13;
                                        i10 = i15;
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i26 = 8 - ((~(i25 - length2)) >>> 31);
                                            for (int i27 = 0; i27 < i26; i27 = i11 + 1) {
                                                if ((j13 & 255) < 128) {
                                                    int i28 = (i25 << 3) + i27;
                                                    i11 = i27;
                                                    Object obj3 = objArr2[i28];
                                                    int i29 = iArr[i28];
                                                    c0327y.y(obj3);
                                                } else {
                                                    i11 = i27;
                                                }
                                                j13 >>= 8;
                                            }
                                            if (i26 != 8) {
                                                break;
                                            }
                                        }
                                        if (i25 == length2) {
                                            break;
                                        }
                                        i25++;
                                        i13 = i9;
                                        i15 = i10;
                                    }
                                } else {
                                    i9 = i13;
                                    i10 = i15;
                                    j7 = j12;
                                }
                                c0326x0.e(false);
                            } catch (Throwable th) {
                                c0326x0.e(false);
                                throw th;
                            }
                        }
                        z8 = true;
                        arrayList2.remove(arrayList2.size() - 1);
                    } else {
                        this.f4520G.r(i20);
                        int i30 = this.f4520G.f4336g;
                        L(i19, i30, i13);
                        int q5 = this.f4520G.q(i30);
                        while (q5 != i13 && !this.f4520G.l(q5)) {
                            q5 = this.f4520G.q(q5);
                        }
                        int i31 = this.f4520G.l(q5) ? 0 : i5;
                        if (q5 != i30) {
                            int k02 = (k0(q5) - this.f4520G.o(i30)) + i31;
                            while (i31 < k02 && q5 != i20) {
                                q5++;
                                while (q5 < i20) {
                                    L0 l03 = this.f4520G;
                                    int i32 = l03.f4332b[(q5 * 5) + 3] + q5;
                                    if (i20 >= i32) {
                                        i31 += l03.l(q5) ? z8 ? 1 : 0 : k0(q5);
                                        q5 = i32;
                                    }
                                }
                                break;
                            }
                        }
                        this.f4541k = i31;
                        this.f4543m = G(i30);
                        int q6 = this.f4520G.q(i30);
                        long j14 = 0;
                        int i33 = 3;
                        int i34 = 0;
                        while (true) {
                            if (q6 < 0) {
                                i12 = i30;
                                j8 = j5;
                                break;
                            }
                            if (q6 == i13) {
                                j8 = j5;
                                j14 ^= Long.rotateLeft(j8, i34);
                                i12 = i30;
                                break;
                            }
                            j8 = j5;
                            L0 l04 = this.f4520G;
                            boolean k5 = l04.k(q6);
                            i12 = i30;
                            int[] iArr2 = l04.f4332b;
                            if (k5) {
                                Object p5 = l04.p(iArr2, q6);
                                if (p5 != null) {
                                    hashCode = p5 instanceof Enum ? ((Enum) p5).ordinal() : p5.hashCode();
                                    j9 = j14;
                                } else {
                                    j9 = j14;
                                    hashCode = 0;
                                }
                            } else {
                                int i35 = l04.i(q6);
                                j9 = j14;
                                hashCode = (i35 != 207 || (b3 = l04.b(iArr2, q6)) == null || b3.equals(C0302l.f4480a)) ? i35 : b3.hashCode();
                            }
                            if (hashCode == 126665345) {
                                j14 = j9 ^ Long.rotateLeft(hashCode, i34);
                                break;
                            }
                            j14 = Long.rotateLeft(this.f4520G.k(q6) ? 0 : G(q6), i34) ^ (j9 ^ Long.rotateLeft(hashCode, i33));
                            i33 = (i33 + 6) % 64;
                            i34 = (i34 + 6) % 64;
                            q6 = this.f4520G.q(q6);
                            j5 = j8;
                            i30 = i12;
                        }
                        this.f4531T = j14;
                        this.K = null;
                        i4.e eVar = c0326x0.f4578d;
                        if (eVar == null) {
                            throw new IllegalStateException("Invalid restart scope");
                        }
                        eVar.invoke(this, Integer.valueOf(z8 ? 1 : 0));
                        this.K = null;
                        L0 l05 = this.f4520G;
                        int i36 = l05.f4332b[i] + i13;
                        int i37 = l05.f4336g;
                        if (!((i37 < i13 || i37 > i36) ? false : z8 ? 1 : 0)) {
                            AbstractC0317t.c("Index " + i13 + " is not a parent of " + i37);
                        }
                        l05.i = i13;
                        l05.f4337h = i36;
                        l05.f4340l = 0;
                        l05.f4341m = 0;
                        i9 = i13;
                        i10 = i15;
                        j7 = j8;
                        i19 = i12;
                        z7 = z8 ? 1 : 0;
                    }
                    e3 = AbstractC0317t.e(this.f4520G.f4336g, arrayList);
                    if (e3 < 0) {
                        e3 = -(e3 + 1);
                    }
                    if (e3 >= arrayList.size()) {
                        s2 = (S) arrayList.get(e3);
                        i15 = i10;
                        if (s2.f4393b < i15) {
                            z6 = z8;
                            i14 = i;
                            i13 = i9;
                            i16 = i5;
                            i17 = i6;
                            i18 = i7;
                            j10 = j7;
                        }
                    } else {
                        i15 = i10;
                    }
                    s2 = null;
                    z6 = z8;
                    i14 = i;
                    i13 = i9;
                    i16 = i5;
                    i17 = i6;
                    i18 = i7;
                    j10 = j7;
                }
            }
            i5 = i16;
            j5 = j10;
            i6 = i17;
            i7 = i18;
            z3 = z8 ? 1 : 0;
            if (z3) {
            }
            e3 = AbstractC0317t.e(this.f4520G.f4336g, arrayList);
            if (e3 < 0) {
            }
            if (e3 >= arrayList.size()) {
            }
            s2 = null;
            z6 = z8;
            i14 = i;
            i13 = i9;
            i16 = i5;
            i17 = i6;
            i18 = i7;
            j10 = j7;
        }
        int i38 = i13;
        int i39 = i16;
        long j15 = j10;
        int i40 = i17;
        int i41 = i18;
        if (z7) {
            L(i19, i38, i38);
            this.f4520G.t();
            int k03 = k0(i38);
            this.f4541k = i39 + k03;
            this.f4542l = i40 + k03;
            this.f4543m = i41;
        } else {
            R();
        }
        this.f4531T = j15;
        this.f4519F = z5;
    }

    public final void J() {
        N(this.f4520G.f4336g);
        C0337b c0337b = this.f4524M;
        c0337b.e(false);
        C0315s c0315s = c0337b.f4814a;
        L0 l02 = c0315s.f4520G;
        if (l02.f4333c > 0) {
            int i = l02.i;
            Q q5 = c0337b.f4817d;
            if (q5.a(-2) != i) {
                if (!c0337b.f4816c && c0337b.f4818e) {
                    c0337b.e(false);
                    C0336a c0336a = c0337b.f4815b;
                    c0336a.getClass();
                    c0336a.f.w0(Q.q.f4838c);
                    c0337b.f4816c = true;
                }
                if (i > 0) {
                    C0280a a5 = l02.a(i);
                    q5.c(i);
                    c0337b.e(false);
                    C0336a c0336a2 = c0337b.f4815b;
                    c0336a2.getClass();
                    Q.p pVar = Q.p.f4837c;
                    Q.K k5 = c0336a2.f;
                    k5.w0(pVar);
                    N4.b.T(k5, 0, a5);
                    c0337b.f4816c = true;
                }
            }
        }
        C0336a c0336a3 = c0337b.f4815b;
        c0336a3.getClass();
        c0336a3.f.w0(Q.x.f4848c);
        int i5 = c0337b.f;
        L0 l03 = c0315s.f4520G;
        c0337b.f = l03.f4332b[(l03.f4336g * 5) + 3] + i5;
    }

    public final void K(InterfaceC0314r0 interfaceC0314r0) {
        C2343v c2343v = this.f4552v;
        if (c2343v == null) {
            c2343v = new C2343v();
            this.f4552v = c2343v;
        }
        c2343v.g(this.f4520G.f4336g, interfaceC0314r0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(int i, int i5, int i6) {
        L0 l02 = this.f4520G;
        if (i != i5) {
            if (i != i6 && i5 != i6) {
                if (l02.q(i) == i5) {
                    i6 = i5;
                } else if (l02.q(i5) != i) {
                    if (l02.q(i) == l02.q(i5)) {
                        i6 = l02.q(i);
                    } else {
                        int i7 = i;
                        int i8 = 0;
                        while (i7 > 0 && i7 != i6) {
                            i7 = l02.q(i7);
                            i8++;
                        }
                        int i9 = i5;
                        int i10 = 0;
                        while (i9 > 0 && i9 != i6) {
                            i9 = l02.q(i9);
                            i10++;
                        }
                        int i11 = i8 - i10;
                        int i12 = i;
                        for (int i13 = 0; i13 < i11; i13++) {
                            i12 = l02.q(i12);
                        }
                        int i14 = i10 - i8;
                        int i15 = i5;
                        for (int i16 = 0; i16 < i14; i16++) {
                            i15 = l02.q(i15);
                        }
                        i6 = i12;
                        for (int i17 = i15; i6 != i17; i17 = l02.q(i17)) {
                            i6 = l02.q(i6);
                        }
                    }
                }
            }
            while (i > 0 && i != i6) {
                if (!l02.l(i)) {
                    this.f4524M.b();
                }
                i = l02.q(i);
            }
            p(i5, i6);
        }
        i6 = i;
        while (i > 0) {
            if (!l02.l(i)) {
            }
            i = l02.q(i);
        }
        p(i5, i6);
    }

    public final Object M() {
        boolean z3 = this.f4530S;
        Z z5 = C0302l.f4480a;
        if (!z3) {
            Object m5 = this.f4520G.m();
            if (!this.f4555y || (m5 instanceof C0308o)) {
                return m5 instanceof H0 ? ((H0) m5).f4319a : m5;
            }
        } else if (this.f4548r) {
            AbstractC0317t.c("A call to createNode(), emitNode() or useNode() expected");
            return z5;
        }
        return z5;
    }

    public final void N(int i) {
        boolean l5 = this.f4520G.l(i);
        C0337b c0337b = this.f4524M;
        if (l5) {
            c0337b.d();
            Object n5 = this.f4520G.n(i);
            c0337b.d();
            c0337b.f4820h.add(n5);
        }
        O(this, i, l5, 0);
        c0337b.d();
        if (l5) {
            c0337b.b();
        }
    }

    public final boolean P(int i, boolean z3) {
        if ((i & 1) == 0 && (this.f4530S || this.f4555y)) {
            if (this.f4527P != null) {
                y();
                return true;
            }
        } else if (!z3 && B()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        int[] iArr;
        long rotateLeft;
        long j5;
        if (this.f4549s.isEmpty()) {
            this.f4542l = this.f4520G.s() + this.f4542l;
            return;
        }
        L0 l02 = this.f4520G;
        int g5 = l02.g();
        int i = l02.f4336g;
        int i5 = l02.f4337h;
        int[] iArr2 = l02.f4332b;
        Object p5 = i < i5 ? l02.p(iArr2, i) : null;
        Object f = l02.f();
        int i6 = this.f4543m;
        Z z3 = C0302l.f4480a;
        if (p5 != null) {
            iArr = iArr2;
            rotateLeft = Long.rotateLeft((p5 instanceof Enum ? ((Enum) p5).ordinal() : p5.hashCode()) ^ Long.rotateLeft(this.f4531T, 3), 3);
            j5 = 0;
        } else {
            if (f != null && g5 == 207 && !f.equals(z3)) {
                iArr = iArr2;
                this.f4531T = Long.rotateLeft(f.hashCode() ^ Long.rotateLeft(this.f4531T, 3), 3) ^ i6;
                W(null, (iArr[(l02.f4336g * 5) + 1] & 1073741824) != 0);
                I();
                l02.e();
                if (p5 == null) {
                    if (p5 instanceof Enum) {
                        this.f4531T = Long.rotateRight(Long.rotateRight(this.f4531T ^ 0, 3) ^ ((Enum) p5).ordinal(), 3);
                        return;
                    } else {
                        this.f4531T = Long.rotateRight(Long.rotateRight(this.f4531T ^ 0, 3) ^ p5.hashCode(), 3);
                        return;
                    }
                }
                if (f == null || g5 != 207 || f.equals(z3)) {
                    this.f4531T = Long.rotateRight(g5 ^ Long.rotateRight(this.f4531T ^ i6, 3), 3);
                    return;
                } else {
                    this.f4531T = Long.rotateRight(Long.rotateRight(this.f4531T ^ i6, 3) ^ f.hashCode(), 3);
                    return;
                }
            }
            iArr = iArr2;
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.f4531T, 3) ^ g5, 3);
            j5 = i6;
        }
        this.f4531T = rotateLeft ^ j5;
        W(null, (iArr[(l02.f4336g * 5) + 1] & 1073741824) != 0);
        I();
        l02.e();
        if (p5 == null) {
        }
    }

    public final void R() {
        int i;
        L0 l02 = this.f4520G;
        int i5 = l02.i;
        if (i5 >= 0) {
            i = l02.f4332b[(i5 * 5) + 1] & 67108863;
        } else {
            i = 0;
        }
        this.f4542l = i;
        l02.t();
    }

    public final void S() {
        if (this.f4542l != 0) {
            AbstractC0317t.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f4530S) {
            return;
        }
        C0326x0 y5 = y();
        if (y5 != null) {
            int i = y5.f4576b;
            if ((i & 128) == 0) {
                y5.f4576b = i | 16;
            }
        }
        if (this.f4549s.isEmpty()) {
            R();
        } else {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i, int i5, Object obj, Object obj2) {
        long rotateLeft;
        long j5;
        int i6;
        C0313q0 c0313q0;
        C0313q0 c0313q02;
        Object obj3;
        int i7;
        Object[] objArr;
        Object[] objArr2;
        int i8;
        int i9;
        Object obj4 = obj;
        if (this.f4548r) {
            AbstractC0317t.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i10 = this.f4543m;
        Z z3 = C0302l.f4480a;
        if (obj4 != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.f4531T, 3) ^ (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode()), 3);
            j5 = 0;
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(z3)) {
                this.f4531T = Long.rotateLeft(Long.rotateLeft(this.f4531T, 3) ^ obj2.hashCode(), 3) ^ i10;
                if (obj4 == null) {
                    this.f4543m++;
                }
                boolean z5 = i5 == 0;
                if (!this.f4530S) {
                    this.f4520G.f4339k++;
                    P0 p02 = this.f4522I;
                    int i11 = p02.f4383t;
                    if (z5) {
                        p02.P(i, z3, z3, true);
                    } else if (obj2 != null) {
                        if (obj4 == null) {
                            obj4 = z3;
                        }
                        p02.P(i, obj4, obj2, false);
                    } else {
                        if (obj4 == null) {
                            obj4 = z3;
                        }
                        p02.P(i, obj4, z3, false);
                    }
                    C0313q0 c0313q03 = this.f4540j;
                    if (c0313q03 != null) {
                        int i12 = (-2) - i11;
                        V v4 = new V(-1, i, i12, -1);
                        c0313q03.f4511e.g(i12, new N(-1, this.f4541k - c0313q03.f4508b, 0));
                        c0313q03.f4510d.add(v4);
                    }
                    w(z5, null);
                    return;
                }
                boolean z6 = i5 == 1 && this.f4555y;
                if (this.f4540j == null) {
                    int g5 = this.f4520G.g();
                    if (!z6 && g5 == i) {
                        L0 l02 = this.f4520G;
                        int i13 = l02.f4336g;
                        if (kotlin.jvm.internal.l.a(obj4, i13 < l02.f4337h ? l02.p(l02.f4332b, i13) : null)) {
                            W(obj2, z5);
                        }
                    }
                    L0 l03 = this.f4520G;
                    l03.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (l03.f4339k > 0) {
                        i6 = -1;
                    } else {
                        int i14 = l03.f4336g;
                        i6 = -1;
                        while (i14 < l03.f4337h) {
                            int i15 = i14 * 5;
                            int[] iArr = l03.f4332b;
                            int i16 = iArr[i15];
                            Object p5 = l03.p(iArr, i14);
                            int i17 = iArr[i15 + 1];
                            arrayList.add(new V(p5, i16, i14, (i17 & 1073741824) != 0 ? 1 : i17 & 67108863));
                            i14 += iArr[i15 + 3];
                        }
                    }
                    this.f4540j = new C0313q0(this.f4541k, arrayList);
                    c0313q0 = this.f4540j;
                    if (c0313q0 != null) {
                        Object u5 = obj4 != null ? new U(Integer.valueOf(i), obj4) : Integer.valueOf(i);
                        C2321G c2321g = ((R.a) c0313q0.f.getValue()).f5099a;
                        Object g6 = c2321g.g(u5);
                        if (g6 == null) {
                            obj3 = null;
                        } else if (g6 instanceof C2316B) {
                            C2316B c2316b = (C2316B) g6;
                            obj3 = c2316b.j(0);
                            if (c2316b.g()) {
                                c2321g.k(u5);
                            }
                            if (c2316b.f18905b == 1) {
                                c2321g.m(u5, c2316b.d());
                            }
                        } else {
                            c2321g.k(u5);
                            obj3 = g6;
                        }
                        V v5 = (V) obj3;
                        ArrayList arrayList2 = c0313q0.f4510d;
                        C2343v c2343v = c0313q0.f4511e;
                        int i18 = c0313q0.f4508b;
                        if (z6 || v5 == null) {
                            this.f4520G.f4339k++;
                            this.f4530S = true;
                            this.K = null;
                            if (this.f4522I.f4386w) {
                                P0 f = this.f4521H.f();
                                this.f4522I = f;
                                f.L();
                                this.J = false;
                                this.K = null;
                            }
                            this.f4522I.d();
                            P0 p03 = this.f4522I;
                            int i19 = p03.f4383t;
                            if (z5) {
                                p03.P(i, z3, z3, true);
                            } else if (obj2 != null) {
                                if (obj4 == null) {
                                    obj4 = z3;
                                }
                                p03.P(i, obj4, obj2, false);
                            } else {
                                if (obj4 == null) {
                                    obj4 = z3;
                                }
                                p03.P(i, obj4, z3, false);
                            }
                            this.f4525N = this.f4522I.b(i19);
                            int i20 = (-2) - i19;
                            int i21 = i6;
                            V v6 = new V(Integer.valueOf(i6), i, i20, i21);
                            c2343v.g(i20, new N(i21, this.f4541k - i18, 0));
                            arrayList2.add(v6);
                            c0313q02 = new C0313q0(z5 ? 0 : this.f4541k, new ArrayList());
                            w(z5, c0313q02);
                            return;
                        }
                        arrayList2.add(v5);
                        int i22 = v5.f4406c;
                        N n5 = (N) c2343v.b(i22);
                        this.f4541k = (n5 != null ? n5.f4355b : i6) + i18;
                        N n6 = (N) c2343v.b(i22);
                        int i23 = n6 != null ? n6.f4354a : i6;
                        int i24 = c0313q0.f4509c;
                        int i25 = i23 - i24;
                        int i26 = 8;
                        if (i23 > i24) {
                            Object[] objArr3 = c2343v.f19013c;
                            long[] jArr = c2343v.f19011a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i27 = 0;
                                while (true) {
                                    long j6 = jArr[i27];
                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i28 = 8 - ((~(i27 - length)) >>> 31);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            if ((j6 & 255) < 128) {
                                                i9 = i26;
                                                N n7 = (N) objArr3[(i27 << 3) + i29];
                                                i8 = i25;
                                                int i30 = n7.f4354a;
                                                if (i30 == i23) {
                                                    n7.f4354a = i24;
                                                } else if (i24 <= i30 && i30 < i23) {
                                                    n7.f4354a = i30 + 1;
                                                }
                                            } else {
                                                i8 = i25;
                                                i9 = i26;
                                            }
                                            j6 >>= i9;
                                            i29++;
                                            i25 = i8;
                                            i26 = i9;
                                        }
                                        i7 = i25;
                                        if (i28 != i26) {
                                            break;
                                        }
                                    } else {
                                        i7 = i25;
                                    }
                                    if (i27 == length) {
                                        break;
                                    }
                                    i27++;
                                    i25 = i7;
                                    i26 = 8;
                                }
                            } else {
                                i7 = i25;
                            }
                        } else {
                            i7 = i25;
                            if (i24 > i23) {
                                Object[] objArr4 = c2343v.f19013c;
                                long[] jArr2 = c2343v.f19011a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i31 = 0;
                                    while (true) {
                                        long j7 = jArr2[i31];
                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i32 = 8 - ((~(i31 - length2)) >>> 31);
                                            int i33 = 0;
                                            while (i33 < i32) {
                                                if ((j7 & 255) < 128) {
                                                    N n8 = (N) objArr4[(i31 << 3) + i33];
                                                    int i34 = n8.f4354a;
                                                    if (i34 == i23) {
                                                        n8.f4354a = i24;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i23 + 1 <= i34 && i34 < i24) {
                                                            n8.f4354a = i34 - 1;
                                                        }
                                                        j7 >>= 8;
                                                        i33++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j7 >>= 8;
                                                i33++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i32 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i31 == length2) {
                                            break;
                                        }
                                        i31++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        C0337b c0337b = this.f4524M;
                        int i35 = c0337b.f;
                        C0315s c0315s = c0337b.f4814a;
                        c0337b.f = (i22 - c0315s.f4520G.f4336g) + i35;
                        this.f4520G.r(i22);
                        if (i7 > 0) {
                            c0337b.e(false);
                            L0 l04 = c0315s.f4520G;
                            if (l04.f4333c > 0) {
                                int i36 = l04.i;
                                Q q5 = c0337b.f4817d;
                                if (q5.a(-2) != i36) {
                                    if (!c0337b.f4816c && c0337b.f4818e) {
                                        c0337b.e(false);
                                        C0336a c0336a = c0337b.f4815b;
                                        c0336a.getClass();
                                        c0336a.f.w0(Q.q.f4838c);
                                        c0337b.f4816c = true;
                                    }
                                    if (i36 > 0) {
                                        C0280a a5 = l04.a(i36);
                                        q5.c(i36);
                                        c0337b.e(false);
                                        C0336a c0336a2 = c0337b.f4815b;
                                        c0336a2.getClass();
                                        Q.p pVar = Q.p.f4837c;
                                        Q.K k5 = c0336a2.f;
                                        k5.w0(pVar);
                                        N4.b.T(k5, 0, a5);
                                        c0337b.f4816c = true;
                                    }
                                }
                            }
                            C0336a c0336a3 = c0337b.f4815b;
                            c0336a3.getClass();
                            Q.u uVar = Q.u.f4845c;
                            Q.K k6 = c0336a3.f;
                            k6.w0(uVar);
                            k6.f4811h[k6.i - k6.f[k6.f4810g - 1].f4808a] = i7;
                        }
                        W(obj2, z5);
                    }
                    c0313q02 = null;
                    w(z5, c0313q02);
                    return;
                }
                i6 = -1;
                c0313q0 = this.f4540j;
                if (c0313q0 != null) {
                }
                c0313q02 = null;
                w(z5, c0313q02);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.f4531T, 3) ^ i, 3);
            j5 = i10;
        }
        this.f4531T = rotateLeft ^ j5;
        if (obj4 == null) {
        }
        if (i5 == 0) {
        }
        if (!this.f4530S) {
        }
    }

    public final void U() {
        T(-127, 0, null, null);
    }

    public final void V(int i, C0293g0 c0293g0) {
        T(i, 0, c0293g0, null);
    }

    public final void W(Object obj, boolean z3) {
        if (z3) {
            L0 l02 = this.f4520G;
            if (l02.f4339k <= 0) {
                if ((l02.f4332b[(l02.f4336g * 5) + 1] & 1073741824) == 0) {
                    AbstractC0316s0.a("Expected a node group");
                }
                l02.u();
                return;
            }
            return;
        }
        if (obj != null && this.f4520G.f() != obj) {
            C0337b c0337b = this.f4524M;
            c0337b.getClass();
            c0337b.e(false);
            C0336a c0336a = c0337b.f4815b;
            c0336a.getClass();
            Q.E e3 = Q.E.f4804c;
            Q.K k5 = c0336a.f;
            k5.w0(e3);
            N4.b.T(k5, 0, obj);
        }
        this.f4520G.u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if ((r0.f4332b[(r4 * 5) + 1] & 536870912) != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(int i) {
        int i5;
        if (this.f4540j != null) {
            T(i, 0, null, null);
            return;
        }
        if (this.f4548r) {
            AbstractC0317t.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f4531T = Long.rotateLeft(Long.rotateLeft(this.f4531T, 3) ^ i, 3) ^ this.f4543m;
        this.f4543m++;
        L0 l02 = this.f4520G;
        boolean z3 = this.f4530S;
        Z z5 = C0302l.f4480a;
        if (z3) {
            l02.f4339k++;
            this.f4522I.P(i, z5, z5, false);
            w(false, null);
            return;
        }
        if (l02.g() == i) {
            int i6 = l02.f4336g;
            if (i6 < l02.f4337h) {
            }
            l02.u();
            w(false, null);
            return;
        }
        if (l02.f4339k <= 0 && (i5 = l02.f4336g) != l02.f4337h) {
            int i7 = this.f4541k;
            J();
            this.f4524M.f(i7, l02.s());
            AbstractC0317t.a(this.f4549s, i5, l02.f4336g);
        }
        l02.f4339k++;
        this.f4530S = true;
        this.K = null;
        if (this.f4522I.f4386w) {
            P0 f = this.f4521H.f();
            this.f4522I = f;
            f.L();
            this.J = false;
            this.K = null;
        }
        P0 p02 = this.f4522I;
        p02.d();
        int i8 = p02.f4383t;
        p02.P(i, z5, z5, false);
        this.f4525N = p02.b(i8);
        w(false, null);
    }

    public final void Y(int i) {
        T(i, 0, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0315s Z(int i) {
        C0326x0 c0326x0;
        boolean z3;
        int i5;
        X(i);
        boolean z5 = this.f4530S;
        C1930k c1930k = this.f4538g;
        ArrayList arrayList = this.f4518E;
        C0327y c0327y = this.f4539h;
        if (z5) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl", c0327y);
            C0326x0 c0326x02 = new C0326x0(c0327y);
            arrayList.add(c0326x02);
            j0(c0326x02);
            c0326x02.f4579e = this.f4515B;
            c0326x02.f4576b &= -17;
            c1930k.d();
            return this;
        }
        ArrayList arrayList2 = this.f4549s;
        int e3 = AbstractC0317t.e(this.f4520G.i, arrayList2);
        S s2 = e3 >= 0 ? (S) arrayList2.remove(e3) : null;
        Object m5 = this.f4520G.m();
        if (kotlin.jvm.internal.l.a(m5, C0302l.f4480a)) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl", c0327y);
            c0326x0 = new C0326x0(c0327y);
            j0(c0326x0);
        } else {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl", m5);
            c0326x0 = (C0326x0) m5;
        }
        if (s2 == null) {
            int i6 = c0326x0.f4576b;
            boolean z6 = (i6 & 64) != 0;
            if (z6) {
                c0326x0.f4576b = i6 & (-65);
            }
            if (!z6) {
                z3 = false;
                int i7 = c0326x0.f4576b;
                c0326x0.f4576b = !z3 ? i7 | 8 : i7 & (-9);
                arrayList.add(c0326x0);
                c0326x0.f4579e = this.f4515B;
                c0326x0.f4576b &= -17;
                c1930k.d();
                i5 = c0326x0.f4576b;
                if ((i5 & 256) != 0) {
                    c0326x0.f4576b = (i5 & (-257)) | 512;
                    C0336a c0336a = this.f4524M.f4815b;
                    c0336a.getClass();
                    Q.C c5 = Q.C.f4802c;
                    Q.K k5 = c0336a.f;
                    k5.w0(c5);
                    N4.b.T(k5, 0, c0326x0);
                    if (!this.f4555y) {
                        int i8 = c0326x0.f4576b;
                        if ((i8 & 128) != 0) {
                            this.f4555y = true;
                            c0326x0.f4576b = i8 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z3 = true;
        int i72 = c0326x0.f4576b;
        c0326x0.f4576b = !z3 ? i72 | 8 : i72 & (-9);
        arrayList.add(c0326x0);
        c0326x0.f4579e = this.f4515B;
        c0326x0.f4576b &= -17;
        c1930k.d();
        i5 = c0326x0.f4576b;
        if ((i5 & 256) != 0) {
        }
        return this;
    }

    public final void a() {
        i();
        this.i.clear();
        this.f4544n.f4389b = 0;
        this.f4550t.f4389b = 0;
        this.f4554x.f4389b = 0;
        this.f4552v = null;
        C0338c c0338c = this.f4526O;
        c0338c.f4824g.s0();
        c0338c.f.s0();
        this.f4531T = 0;
        this.f4514A = 0;
        this.f4548r = false;
        this.f4530S = false;
        this.f4555y = false;
        this.f4519F = false;
        this.f4556z = -1;
        L0 l02 = this.f4520G;
        if (!l02.f) {
            l02.c();
        }
        if (this.f4522I.f4386w) {
            return;
        }
        x();
    }

    public final void a0(Object obj) {
        if (!this.f4530S && this.f4520G.g() == 207 && !kotlin.jvm.internal.l.a(this.f4520G.f(), obj) && this.f4556z < 0) {
            this.f4556z = this.f4520G.f4336g;
            this.f4555y = true;
        }
        T(207, 0, null, obj);
    }

    public final void b(i4.e eVar, Object obj) {
        if (this.f4530S) {
            C0338c c0338c = this.f4526O;
            c0338c.getClass();
            Q.F f = Q.F.f4805c;
            Q.K k5 = c0338c.f;
            k5.w0(f);
            N4.b.T(k5, 0, obj);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>", eVar);
            kotlin.jvm.internal.z.b(2, eVar);
            N4.b.T(k5, 1, eVar);
            return;
        }
        C0337b c0337b = this.f4524M;
        c0337b.c();
        C0336a c0336a = c0337b.f4815b;
        c0336a.getClass();
        Q.F f5 = Q.F.f4805c;
        Q.K k6 = c0336a.f;
        k6.w0(f5);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>", eVar);
        kotlin.jvm.internal.z.b(2, eVar);
        N4.b.U(k6, 0, obj, 1, eVar);
    }

    public final void b0() {
        T(125, 2, null, null);
        this.f4548r = true;
    }

    public final boolean c(float f) {
        Object E5 = E();
        if ((E5 instanceof Float) && f == ((Number) E5).floatValue()) {
            return false;
        }
        j0(Float.valueOf(f));
        return true;
    }

    public final void c0() {
        this.f4543m = 0;
        this.f4520G = this.f4535c.e();
        T(100, 0, null, null);
        AbstractC0321v abstractC0321v = this.f4534b;
        abstractC0321v.o();
        InterfaceC0314r0 h3 = abstractC0321v.h();
        this.f4554x.c(this.f4553w ? 1 : 0);
        this.f4553w = f(h3);
        this.K = null;
        if (!this.f4547q) {
            this.f4547q = abstractC0321v.d();
        }
        if (!this.f4516C) {
            this.f4516C = abstractC0321v.e();
        }
        if (this.f4516C) {
            e1 e1Var = AbstractC0447c.f6365a;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>", e1Var);
            h3 = ((X.i) h3).b(e1Var, new f1(A()));
        }
        this.f4551u = h3;
        Set set = (Set) AbstractC0329z.u(h3, AbstractC0449e.f6367a);
        if (set != null) {
            C0325x c0325x = this.f4532U;
            if (c0325x == null) {
                c0325x = new C0325x(this.f4539h);
                this.f4532U = c0325x;
            }
            set.add(c0325x);
            abstractC0321v.l(set);
        }
        long f = abstractC0321v.f();
        T((int) (f ^ (f >>> 32)), 0, null, null);
    }

    public final boolean d(int i) {
        Object E5 = E();
        if ((E5 instanceof Integer) && i == ((Number) E5).intValue()) {
            return false;
        }
        j0(Integer.valueOf(i));
        return true;
    }

    public final boolean d0(C0326x0 c0326x0, Object obj) {
        C0280a c0280a = c0326x0.f4577c;
        if (c0280a == null) {
            return false;
        }
        int c5 = this.f4520G.f4331a.c(c0280a);
        if (!this.f4519F || c5 < this.f4520G.f4336g) {
            return false;
        }
        ArrayList arrayList = this.f4549s;
        int e3 = AbstractC0317t.e(c5, arrayList);
        if (e3 < 0) {
            int i = -(e3 + 1);
            if (!(obj instanceof H)) {
                obj = null;
            }
            arrayList.add(i, new S(c0326x0, c5, obj));
            return true;
        }
        S s2 = (S) arrayList.get(e3);
        if (!(obj instanceof H)) {
            s2.f4394c = null;
            return true;
        }
        Object obj2 = s2.f4394c;
        if (obj2 == null) {
            s2.f4394c = obj;
            return true;
        }
        if (obj2 instanceof C2322H) {
            ((C2322H) obj2).a(obj);
            return true;
        }
        int i5 = r.P.f18958a;
        C2322H c2322h = new C2322H(2);
        c2322h.i(obj2);
        c2322h.i(obj);
        s2.f4394c = c2322h;
        return true;
    }

    public final boolean e(long j5) {
        Object E5 = E();
        if ((E5 instanceof Long) && j5 == ((Number) E5).longValue()) {
            return false;
        }
        j0(Long.valueOf(j5));
        return true;
    }

    public final void e0(C2321G c2321g) {
        ArrayList arrayList = this.f4549s;
        for (int N5 = X3.n.N(arrayList); -1 < N5; N5--) {
            S s2 = (S) arrayList.get(N5);
            C0280a c0280a = s2.f4392a.f4577c;
            if (c0280a == null || !c0280a.a()) {
                arrayList.remove(N5);
            } else {
                int i = s2.f4393b;
                int i5 = c0280a.f4439a;
                if (i != i5) {
                    s2.f4393b = i5;
                }
            }
        }
        Object[] objArr = c2321g.f18929b;
        Object[] objArr2 = c2321g.f18930c;
        long[] jArr = c2321g.f18928a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j5) < 128) {
                            int i9 = (i6 << 3) + i8;
                            Object obj = objArr[i9];
                            Object obj2 = objArr2[i9];
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl", obj);
                            C0326x0 c0326x0 = (C0326x0) obj;
                            C0280a c0280a2 = c0326x0.f4577c;
                            if (c0280a2 != null) {
                                int i10 = c0280a2.f4439a;
                                if (obj2 == Z.f4433o) {
                                    obj2 = null;
                                }
                                arrayList.add(new S(c0326x0, i10, obj2));
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        X3.r.T(arrayList, AbstractC0317t.f);
    }

    public final boolean f(Object obj) {
        if (kotlin.jvm.internal.l.a(E(), obj)) {
            return false;
        }
        j0(obj);
        return true;
    }

    public final void f0(int i, int i5) {
        if (k0(i) != i5) {
            if (i < 0) {
                C2341t c2341t = this.f4546p;
                if (c2341t == null) {
                    c2341t = new C2341t();
                    this.f4546p = c2341t;
                }
                c2341t.f(i, i5);
                return;
            }
            int[] iArr = this.f4545o;
            if (iArr == null) {
                int i6 = this.f4520G.f4333c;
                int[] iArr2 = new int[i6];
                Arrays.fill(iArr2, 0, i6, -1);
                this.f4545o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i5;
        }
    }

    public final boolean g(boolean z3) {
        Object E5 = E();
        if ((E5 instanceof Boolean) && z3 == ((Boolean) E5).booleanValue()) {
            return false;
        }
        j0(Boolean.valueOf(z3));
        return true;
    }

    public final void g0(int i, int i5) {
        int k02 = k0(i);
        if (k02 != i5) {
            int i6 = i5 - k02;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int k03 = k0(i) + i6;
                f0(i, k03);
                int i7 = size;
                while (true) {
                    if (-1 < i7) {
                        C0313q0 c0313q0 = (C0313q0) arrayList.get(i7);
                        if (c0313q0 != null && c0313q0.a(i, k03)) {
                            size = i7 - 1;
                            break;
                        }
                        i7--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f4520G.i;
                } else if (this.f4520G.l(i)) {
                    return;
                } else {
                    i = this.f4520G.q(i);
                }
            }
        }
    }

    public final boolean h(Object obj) {
        if (E() == obj) {
            return false;
        }
        j0(obj);
        return true;
    }

    public final X.i h0(InterfaceC0314r0 interfaceC0314r0, X.i iVar) {
        X.i iVar2 = (X.i) interfaceC0314r0;
        iVar2.getClass();
        X.h hVar = new X.h(iVar2);
        hVar.putAll(iVar);
        X.i b3 = hVar.b();
        V(204, AbstractC0317t.f4560d);
        E();
        j0(b3);
        E();
        j0(iVar);
        q(false);
        return b3;
    }

    public final void i() {
        this.f4540j = null;
        this.f4541k = 0;
        this.f4542l = 0;
        this.f4531T = 0L;
        this.f4548r = false;
        C0337b c0337b = this.f4524M;
        c0337b.f4816c = false;
        c0337b.f4817d.f4389b = 0;
        c0337b.f = 0;
        c0337b.f4818e = true;
        c0337b.f4819g = 0;
        c0337b.f4820h.clear();
        c0337b.i = -1;
        c0337b.f4821j = -1;
        c0337b.f4822k = -1;
        c0337b.f4823l = 0;
        this.f4518E.clear();
        this.f4545o = null;
        this.f4546p = null;
    }

    public final void i0(Object obj) {
        int i;
        L0 l02;
        int i5;
        P0 p02;
        if (obj instanceof G0) {
            G0 g02 = (G0) obj;
            C0280a c0280a = null;
            if (this.f4530S) {
                P0 p03 = this.f4522I;
                int i6 = p03.f4383t;
                if (i6 > p03.f4385v + 1) {
                    int i7 = i6 - 1;
                    int D5 = p03.D(p03.f4367b, i7);
                    while (true) {
                        i5 = i7;
                        i7 = D5;
                        p02 = this.f4522I;
                        if (i7 == p02.f4385v || i7 < 0) {
                            break;
                        } else {
                            D5 = p02.D(p02.f4367b, i7);
                        }
                    }
                    c0280a = p02.b(i5);
                }
            } else {
                L0 l03 = this.f4520G;
                int i8 = l03.f4336g;
                if (i8 > l03.i + 1) {
                    int i9 = i8 - 1;
                    int q5 = l03.q(i9);
                    while (true) {
                        i = i9;
                        i9 = q5;
                        l02 = this.f4520G;
                        if (i9 == l02.i || i9 < 0) {
                            break;
                        } else {
                            q5 = l02.q(i9);
                        }
                    }
                    c0280a = l02.a(i);
                }
            }
            H0 h02 = new H0(g02, c0280a);
            if (this.f4530S) {
                C0336a c0336a = this.f4524M.f4815b;
                c0336a.getClass();
                Q.w wVar = Q.w.f4847c;
                Q.K k5 = c0336a.f;
                k5.w0(wVar);
                N4.b.T(k5, 0, h02);
            }
            this.f4536d.add(obj);
            obj = h02;
        }
        j0(obj);
    }

    public final Object j(AbstractC0320u0 abstractC0320u0) {
        return AbstractC0329z.u(l(), abstractC0320u0);
    }

    public final void j0(Object obj) {
        if (this.f4530S) {
            P0 p02 = this.f4522I;
            if (p02.f4377n <= 0 || p02.i == p02.f4374k) {
                p02.E(obj);
                return;
            }
            C2343v c2343v = p02.f4382s;
            if (c2343v == null) {
                c2343v = new C2343v();
            }
            p02.f4382s = c2343v;
            int i = p02.f4385v;
            Object b3 = c2343v.b(i);
            if (b3 == null) {
                b3 = new C2316B();
                c2343v.g(i, b3);
            }
            ((C2316B) b3).a(obj);
            return;
        }
        L0 l02 = this.f4520G;
        boolean z3 = l02.f4342n;
        C0337b c0337b = this.f4524M;
        if (!z3) {
            C0280a a5 = l02.a(l02.i);
            C0336a c0336a = c0337b.f4815b;
            c0336a.getClass();
            C0340e c0340e = C0340e.f4826c;
            Q.K k5 = c0336a.f;
            k5.w0(c0340e);
            N4.b.U(k5, 0, a5, 1, obj);
            return;
        }
        int c5 = (l02.f4340l - O0.c(l02.f4332b, l02.i)) - 1;
        if (c0337b.f4814a.f4520G.i - c0337b.f >= 0) {
            c0337b.e(true);
            C0336a c0336a2 = c0337b.f4815b;
            Q.r rVar = Q.r.f4841g;
            Q.K k6 = c0336a2.f;
            k6.w0(rVar);
            N4.b.T(k6, 0, obj);
            k6.f4811h[k6.i - k6.f[k6.f4810g - 1].f4808a] = c5;
            return;
        }
        L0 l03 = this.f4520G;
        C0280a a6 = l03.a(l03.i);
        C0336a c0336a3 = c0337b.f4815b;
        Q.r rVar2 = Q.r.f;
        Q.K k7 = c0336a3.f;
        k7.w0(rVar2);
        N4.b.U(k7, 0, obj, 1, a6);
        k7.f4811h[k7.i - k7.f[k7.f4810g - 1].f4808a] = c5;
    }

    public final void k(InterfaceC2015a interfaceC2015a) {
        if (!this.f4548r) {
            AbstractC0317t.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f4548r = false;
        if (!this.f4530S) {
            AbstractC0317t.c("createNode() can only be called when inserting");
        }
        Q q5 = this.f4544n;
        int i = q5.f4388a[q5.f4389b - 1];
        P0 p02 = this.f4522I;
        C0280a b3 = p02.b(p02.f4385v);
        this.f4542l++;
        C0338c c0338c = this.f4526O;
        Q.r rVar = Q.r.f4839d;
        Q.K k5 = c0338c.f;
        k5.w0(rVar);
        N4.b.T(k5, 0, interfaceC2015a);
        k5.f4811h[k5.i - k5.f[k5.f4810g - 1].f4808a] = i;
        N4.b.T(k5, 1, b3);
        Q.r rVar2 = Q.r.f4840e;
        Q.K k6 = c0338c.f4824g;
        k6.w0(rVar2);
        k6.f4811h[k6.i - k6.f[k6.f4810g - 1].f4808a] = i;
        N4.b.T(k6, 0, b3);
    }

    public final int k0(int i) {
        int i5;
        if (i >= 0) {
            int[] iArr = this.f4545o;
            return (iArr == null || (i5 = iArr[i]) < 0) ? this.f4520G.o(i) : i5;
        }
        C2341t c2341t = this.f4546p;
        if (c2341t == null || c2341t.c(i) < 0) {
            return 0;
        }
        int c5 = c2341t.c(i);
        if (c5 >= 0) {
            return c2341t.f19047c[c5];
        }
        AbstractC2351a.e("Cannot find value for key " + i);
        throw null;
    }

    public final InterfaceC0314r0 l() {
        InterfaceC0314r0 interfaceC0314r0;
        InterfaceC0314r0 interfaceC0314r02 = this.K;
        if (interfaceC0314r02 != null) {
            return interfaceC0314r02;
        }
        int i = this.f4520G.i;
        boolean z3 = this.f4530S;
        C0293g0 c0293g0 = AbstractC0317t.f4559c;
        if (z3 && this.J) {
            int i5 = this.f4522I.f4385v;
            while (i5 > 0) {
                P0 p02 = this.f4522I;
                if (p02.f4367b[p02.r(i5) * 5] == 202 && kotlin.jvm.internal.l.a(this.f4522I.s(i5), c0293g0)) {
                    Object q5 = this.f4522I.q(i5);
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", q5);
                    InterfaceC0314r0 interfaceC0314r03 = (InterfaceC0314r0) q5;
                    this.K = interfaceC0314r03;
                    return interfaceC0314r03;
                }
                P0 p03 = this.f4522I;
                i5 = p03.D(p03.f4367b, i5);
            }
        }
        if (this.f4520G.f4333c > 0) {
            while (i > 0) {
                if (this.f4520G.i(i) == 202) {
                    L0 l02 = this.f4520G;
                    if (kotlin.jvm.internal.l.a(l02.p(l02.f4332b, i), c0293g0)) {
                        C2343v c2343v = this.f4552v;
                        if (c2343v == null || (interfaceC0314r0 = (InterfaceC0314r0) c2343v.b(i)) == null) {
                            L0 l03 = this.f4520G;
                            Object b3 = l03.b(l03.f4332b, i);
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", b3);
                            interfaceC0314r0 = (InterfaceC0314r0) b3;
                        }
                        this.K = interfaceC0314r0;
                        return interfaceC0314r0;
                    }
                }
                i = this.f4520G.q(i);
            }
        }
        InterfaceC0314r0 interfaceC0314r04 = this.f4551u;
        this.K = interfaceC0314r04;
        return interfaceC0314r04;
    }

    public final void l0() {
        if (!this.f4548r) {
            AbstractC0317t.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f4548r = false;
        if (this.f4530S) {
            AbstractC0317t.c("useNode() called while inserting");
        }
        L0 l02 = this.f4520G;
        Object n5 = l02.n(l02.i);
        C0337b c0337b = this.f4524M;
        c0337b.d();
        c0337b.f4820h.add(n5);
        if (this.f4555y && (n5 instanceof InterfaceC0298j)) {
            c0337b.c();
            C0336a c0336a = c0337b.f4815b;
            c0336a.getClass();
            if (((InterfaceC0298j) n5) != null) {
                c0336a.f.w0(Q.H.f4807c);
            }
        }
    }

    public final List m() {
        boolean z3 = this.f4516C;
        List list = X3.v.f6090k;
        if (!z3) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        P0 p02 = this.f4522I;
        arrayList.addAll(AbstractC0444a.i(p02, null, p02.f4383t, null));
        L0 l02 = this.f4520G;
        if (!l02.f && l02.f4333c != 0) {
            C0452h c0452h = new C0452h(l02);
            int i = l02.i;
            Object valueOf = Integer.valueOf(l02.f4340l - O0.c(l02.f4332b, i));
            while (i >= 0) {
                c0452h.g(l02.f4331a.h(i), valueOf);
                valueOf = l02.a(i);
                i = l02.q(i);
            }
            list = (ArrayList) c0452h.f2693a;
        }
        arrayList.addAll(list);
        arrayList.addAll(F());
        return arrayList;
    }

    public final void n(boolean z3) {
        if (this.f4542l != 0) {
            AbstractC0317t.c("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.f4530S) {
            return;
        }
        if (!z3) {
            R();
            return;
        }
        L0 l02 = this.f4520G;
        int i = l02.f4336g;
        int i5 = l02.f4337h;
        C0337b c0337b = this.f4524M;
        c0337b.getClass();
        c0337b.e(false);
        C0336a c0336a = c0337b.f4815b;
        c0336a.getClass();
        c0336a.f.w0(C0344i.f4830c);
        AbstractC0317t.a(this.f4549s, i, i5);
        this.f4520G.t();
    }

    public final void o(C2321G c2321g, i4.e eVar) {
        ArrayList arrayList = this.f4549s;
        if (this.f4519F) {
            AbstractC0317t.c("Reentrant composition is not supported");
        }
        this.f4538g.d();
        Trace.beginSection("Compose:recompose");
        try {
            long g5 = Z.l.k().g();
            this.f4515B = (int) (g5 ^ (g5 >>> 32));
            this.f4552v = null;
            e0(c2321g);
            this.f4541k = 0;
            this.f4519F = true;
            try {
                c0();
                Object E5 = E();
                if (E5 != eVar && eVar != null) {
                    j0(eVar);
                }
                C0312q c0312q = this.f4517D;
                R.e n5 = AbstractC0329z.n();
                try {
                    n5.c(c0312q);
                    C0293g0 c0293g0 = AbstractC0317t.f4557a;
                    if (eVar != null) {
                        V(200, c0293g0);
                        X.e.c(this, eVar);
                        q(false);
                    } else if (!this.f4553w || E5 == null || E5.equals(C0302l.f4480a)) {
                        Q();
                    } else {
                        V(200, c0293g0);
                        kotlin.jvm.internal.z.b(2, E5);
                        X.e.c(this, (i4.e) E5);
                        q(false);
                    }
                    n5.l(n5.f5108m - 1);
                    v();
                    this.f4519F = false;
                    arrayList.clear();
                    if (!this.f4522I.f4386w) {
                        AbstractC0317t.c("Check failed");
                    }
                    x();
                } catch (Throwable th) {
                    n5.l(n5.f5108m - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void p(int i, int i5) {
        if (i <= 0 || i == i5) {
            return;
        }
        p(this.f4520G.q(i), i5);
        if (this.f4520G.l(i)) {
            Object n5 = this.f4520G.n(i);
            C0337b c0337b = this.f4524M;
            c0337b.d();
            c0337b.f4820h.add(n5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05bf  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z3) {
        long rotateRight;
        Q q5;
        ArrayList arrayList;
        int i;
        boolean z5;
        int i5;
        L0 l02;
        C0313q0 c0313q0;
        ?? r6;
        int i6;
        C0313q0 c0313q02;
        ArrayList arrayList2;
        int i7;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        LinkedHashSet linkedHashSet;
        int i8;
        int i9;
        Object[] objArr;
        long[] jArr;
        int i10;
        Object[] objArr2;
        long[] jArr2;
        int i11;
        Object[] objArr3;
        long[] jArr3;
        int i12;
        Object[] objArr4;
        long[] jArr4;
        long rotateRight2;
        Q q6 = this.f4544n;
        int i13 = q6.f4388a[q6.f4389b - 2] - 1;
        boolean z6 = this.f4530S;
        Z z7 = C0302l.f4480a;
        if (z6) {
            P0 p02 = this.f4522I;
            int i14 = p02.f4385v;
            int i15 = p02.f4367b[p02.r(i14) * 5];
            Object s2 = this.f4522I.s(i14);
            Object q7 = this.f4522I.q(i14);
            if (s2 != null) {
                rotateRight2 = Long.rotateRight(this.f4531T ^ 0, 3) ^ (s2 instanceof Enum ? ((Enum) s2).ordinal() : s2.hashCode());
            } else if (q7 == null || i15 != 207 || q7.equals(z7)) {
                rotateRight2 = i15 ^ Long.rotateRight(this.f4531T ^ i13, 3);
            } else {
                this.f4531T = Long.rotateRight(q7.hashCode() ^ Long.rotateRight(this.f4531T ^ i13, 3), 3);
            }
            this.f4531T = Long.rotateRight(rotateRight2, 3);
        } else {
            L0 l03 = this.f4520G;
            int i16 = l03.i;
            int i17 = l03.i(i16);
            L0 l04 = this.f4520G;
            Object p5 = l04.p(l04.f4332b, i16);
            L0 l05 = this.f4520G;
            Object b3 = l05.b(l05.f4332b, i16);
            if (p5 != null) {
                rotateRight = Long.rotateRight(this.f4531T ^ 0, 3) ^ (p5 instanceof Enum ? ((Enum) p5).ordinal() : p5.hashCode());
            } else if (b3 == null || i17 != 207 || b3.equals(z7)) {
                rotateRight = i17 ^ Long.rotateRight(this.f4531T ^ i13, 3);
            } else {
                this.f4531T = Long.rotateRight(b3.hashCode() ^ Long.rotateRight(this.f4531T ^ i13, 3), 3);
            }
            this.f4531T = Long.rotateRight(rotateRight, 3);
        }
        int i18 = this.f4542l;
        C0313q0 c0313q03 = this.f4540j;
        ArrayList arrayList5 = this.f4549s;
        C0337b c0337b = this.f4524M;
        if (c0313q03 != null) {
            ArrayList arrayList6 = c0313q03.f4507a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = c0313q03.f4510d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i19 = 0; i19 < size; i19++) {
                    hashSet2.add(arrayList7.get(i19));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                i = -1;
                while (i21 < size3) {
                    V v4 = (V) arrayList6.get(i21);
                    boolean contains = hashSet2.contains(v4);
                    Q q8 = q6;
                    C2343v c2343v = c0313q03.f4511e;
                    int i23 = i21;
                    int i24 = c0313q03.f4508b;
                    if (!contains) {
                        N n5 = (N) c2343v.b(v4.f4406c);
                        c0337b.f((n5 != null ? n5.f4355b : -1) + i24, v4.f4407d);
                        int i25 = v4.f4406c;
                        c0313q03.a(i25, 0);
                        c0337b.f = (i25 - c0337b.f4814a.f4520G.f4336g) + c0337b.f;
                        this.f4520G.r(i25);
                        J();
                        this.f4520G.s();
                        AbstractC0317t.a(arrayList5, i25, this.f4520G.f4332b[(i25 * 5) + 3] + i25);
                    } else if (!linkedHashSet2.contains(v4)) {
                        if (i22 < size2) {
                            V v5 = (V) arrayList7.get(i22);
                            if (v5 != v4) {
                                N n6 = (N) c2343v.b(v5.f4406c);
                                int i26 = n6 != null ? n6.f4355b : -1;
                                linkedHashSet2.add(v5);
                                c0313q02 = c0313q03;
                                if (i26 != i20) {
                                    N n7 = (N) c2343v.b(v5.f4406c);
                                    int i27 = n7 != null ? n7.f4356c : v5.f4407d;
                                    i7 = i22;
                                    int i28 = i26 + i24;
                                    arrayList3 = arrayList6;
                                    int i29 = i20 + i24;
                                    if (i27 > 0) {
                                        arrayList4 = arrayList7;
                                        int i30 = c0337b.f4823l;
                                        if (i30 > 0) {
                                            hashSet = hashSet2;
                                            if (c0337b.f4821j == i28 - i30 && c0337b.f4822k == i29 - i30) {
                                                c0337b.f4823l = i30 + i27;
                                            }
                                        } else {
                                            hashSet = hashSet2;
                                        }
                                        c0337b.d();
                                        c0337b.f4821j = i28;
                                        c0337b.f4822k = i29;
                                        c0337b.f4823l = i27;
                                    } else {
                                        arrayList4 = arrayList7;
                                        hashSet = hashSet2;
                                        c0337b.getClass();
                                    }
                                    if (i26 > i20) {
                                        Object[] objArr5 = c2343v.f19013c;
                                        long[] jArr5 = c2343v.f19011a;
                                        int length = jArr5.length - 2;
                                        if (length >= 0) {
                                            linkedHashSet = linkedHashSet2;
                                            i8 = size2;
                                            int i31 = 0;
                                            while (true) {
                                                long j5 = jArr5[i31];
                                                int i32 = i27;
                                                arrayList2 = arrayList5;
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i33 = 8 - ((~(i31 - length)) >>> 31);
                                                    int i34 = 0;
                                                    while (i34 < i33) {
                                                        if ((j5 & 255) < 128) {
                                                            i12 = i34;
                                                            N n8 = (N) objArr5[(i31 << 3) + i34];
                                                            objArr4 = objArr5;
                                                            int i35 = n8.f4355b;
                                                            jArr4 = jArr5;
                                                            if (i26 <= i35 && i35 < i26 + i32) {
                                                                n8.f4355b = (i35 - i26) + i20;
                                                            } else if (i20 <= i35 && i35 < i26) {
                                                                n8.f4355b = i35 + i32;
                                                            }
                                                        } else {
                                                            i12 = i34;
                                                            objArr4 = objArr5;
                                                            jArr4 = jArr5;
                                                        }
                                                        j5 >>= 8;
                                                        i34 = i12 + 1;
                                                        objArr5 = objArr4;
                                                        jArr5 = jArr4;
                                                    }
                                                    objArr3 = objArr5;
                                                    jArr3 = jArr5;
                                                    if (i33 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    objArr3 = objArr5;
                                                    jArr3 = jArr5;
                                                }
                                                if (i31 == length) {
                                                    break;
                                                }
                                                i31++;
                                                arrayList5 = arrayList2;
                                                i27 = i32;
                                                objArr5 = objArr3;
                                                jArr5 = jArr3;
                                            }
                                        } else {
                                            arrayList2 = arrayList5;
                                        }
                                    } else {
                                        int i36 = i27;
                                        arrayList2 = arrayList5;
                                        linkedHashSet = linkedHashSet2;
                                        i8 = size2;
                                        if (i20 > i26) {
                                            Object[] objArr6 = c2343v.f19013c;
                                            long[] jArr6 = c2343v.f19011a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                int i37 = 0;
                                                while (true) {
                                                    long j6 = jArr6[i37];
                                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i37 - length2)) >>> 31);
                                                        int i39 = 0;
                                                        while (i39 < i38) {
                                                            if ((j6 & 255) < 128) {
                                                                objArr2 = objArr6;
                                                                N n9 = (N) objArr6[(i37 << 3) + i39];
                                                                jArr2 = jArr6;
                                                                int i40 = n9.f4355b;
                                                                i11 = i26;
                                                                if (i26 <= i40 && i40 < i11 + i36) {
                                                                    n9.f4355b = (i40 - i11) + i20;
                                                                } else if (i11 + 1 <= i40 && i40 < i20) {
                                                                    n9.f4355b = i40 - i36;
                                                                }
                                                            } else {
                                                                objArr2 = objArr6;
                                                                jArr2 = jArr6;
                                                                i11 = i26;
                                                            }
                                                            j6 >>= 8;
                                                            i39++;
                                                            jArr6 = jArr2;
                                                            objArr6 = objArr2;
                                                            i26 = i11;
                                                        }
                                                        objArr = objArr6;
                                                        jArr = jArr6;
                                                        i10 = i26;
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr = objArr6;
                                                        jArr = jArr6;
                                                        i10 = i26;
                                                    }
                                                    if (i37 == length2) {
                                                        break;
                                                    }
                                                    i37++;
                                                    jArr6 = jArr;
                                                    objArr6 = objArr;
                                                    i26 = i10;
                                                }
                                            }
                                        }
                                    }
                                    i9 = i23;
                                } else {
                                    arrayList2 = arrayList5;
                                    i7 = i22;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                }
                                linkedHashSet = linkedHashSet2;
                                i8 = size2;
                                i9 = i23;
                            } else {
                                c0313q02 = c0313q03;
                                arrayList2 = arrayList5;
                                i7 = i22;
                                arrayList3 = arrayList6;
                                arrayList4 = arrayList7;
                                hashSet = hashSet2;
                                linkedHashSet = linkedHashSet2;
                                i8 = size2;
                                i9 = i23 + 1;
                            }
                            i22 = i7 + 1;
                            N n10 = (N) c2343v.b(v5.f4406c);
                            i20 += n10 != null ? n10.f4356c : v5.f4407d;
                            i21 = i9;
                            arrayList7 = arrayList4;
                            q6 = q8;
                            c0313q03 = c0313q02;
                            arrayList6 = arrayList3;
                            hashSet2 = hashSet;
                            linkedHashSet2 = linkedHashSet;
                            size2 = i8;
                            arrayList5 = arrayList2;
                        } else {
                            q6 = q8;
                            i21 = i23;
                        }
                    }
                    i21 = i23 + 1;
                    q6 = q8;
                }
                q5 = q6;
                arrayList = arrayList5;
                c0337b.d();
                if (arrayList6.size() > 0) {
                    L0 l06 = this.f4520G;
                    c0337b.f = (l06.f4337h - c0337b.f4814a.f4520G.f4336g) + c0337b.f;
                    l06.t();
                }
                z5 = this.f4530S;
                if (!z5) {
                    L0 l07 = this.f4520G;
                    int i41 = l07.f4341m - l07.f4340l;
                    if (i41 > 0) {
                        if (i41 > 0) {
                            c0337b.e(false);
                            L0 l08 = c0337b.f4814a.f4520G;
                            if (l08.f4333c > 0) {
                                int i42 = l08.i;
                                Q q9 = c0337b.f4817d;
                                if (q9.a(-2) != i42) {
                                    if (!c0337b.f4816c && c0337b.f4818e) {
                                        c0337b.e(false);
                                        C0336a c0336a = c0337b.f4815b;
                                        c0336a.getClass();
                                        c0336a.f.w0(Q.q.f4838c);
                                        c0337b.f4816c = true;
                                    }
                                    if (i42 > 0) {
                                        C0280a a5 = l08.a(i42);
                                        q9.c(i42);
                                        c0337b.e(false);
                                        C0336a c0336a2 = c0337b.f4815b;
                                        c0336a2.getClass();
                                        Q.p pVar = Q.p.f4837c;
                                        Q.K k5 = c0336a2.f;
                                        k5.w0(pVar);
                                        N4.b.T(k5, 0, a5);
                                        c0337b.f4816c = true;
                                    }
                                }
                            }
                            C0336a c0336a3 = c0337b.f4815b;
                            c0336a3.getClass();
                            Q.D d5 = Q.D.f4803c;
                            Q.K k6 = c0336a3.f;
                            k6.w0(d5);
                            k6.f4811h[k6.i - k6.f[k6.f4810g - 1].f4808a] = i41;
                        } else {
                            c0337b.getClass();
                        }
                    }
                }
                i5 = this.f4541k;
                while (true) {
                    l02 = this.f4520G;
                    if (l02.f4339k > 0 && (i6 = l02.f4336g) != l02.f4337h) {
                        J();
                        c0337b.f(i5, this.f4520G.s());
                        ArrayList arrayList8 = arrayList;
                        AbstractC0317t.a(arrayList8, i6, this.f4520G.f4336g);
                        i = i;
                        arrayList = arrayList8;
                    }
                }
                if (z5) {
                    if (z3) {
                        c0337b.b();
                    }
                    int i43 = c0337b.f4814a.f4520G.i;
                    Q q10 = c0337b.f4817d;
                    int i44 = i;
                    if (q10.a(i44) > i43) {
                        AbstractC0317t.c("Missed recording an endGroup");
                    }
                    if (q10.a(i44) == i43) {
                        c0337b.e(false);
                        q10.b();
                        C0336a c0336a4 = c0337b.f4815b;
                        c0336a4.getClass();
                        c0336a4.f.w0(Q.m.f4834c);
                    }
                    int i45 = this.f4520G.i;
                    if (i18 != k0(i45)) {
                        g0(i45, i18);
                    }
                    if (z3) {
                        i18 = 1;
                    }
                    this.f4520G.e();
                    c0337b.d();
                } else {
                    if (z3) {
                        C0338c c0338c = this.f4526O;
                        Q.K k7 = c0338c.f4824g;
                        if (!k7.v0()) {
                            AbstractC0317t.c("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        Q.I[] iArr = k7.f;
                        int i46 = k7.f4810g - 1;
                        k7.f4810g = i46;
                        Q.I i47 = iArr[i46];
                        iArr[i46] = null;
                        Q.K k8 = c0338c.f;
                        k8.w0(i47);
                        Object[] objArr7 = k7.f4812j;
                        Object[] objArr8 = k8.f4812j;
                        int i48 = k8.f4813k;
                        int i49 = i47.f4809b;
                        int i50 = k7.f4813k;
                        int i51 = i50 - i49;
                        System.arraycopy(objArr7, i51, objArr8, i48 - i49, i50 - i51);
                        Object[] objArr9 = k7.f4812j;
                        int i52 = k7.f4813k;
                        X3.l.B0(objArr9, i52 - i49, i52);
                        int[] iArr2 = k7.f4811h;
                        int[] iArr3 = k8.f4811h;
                        int i53 = k8.i;
                        int i54 = i47.f4808a;
                        int i55 = k7.i;
                        X3.l.s0(i53 - i54, i55 - i54, i55, iArr2, iArr3);
                        k7.f4813k -= i49;
                        k7.i -= i54;
                        i18 = 1;
                    }
                    if (this.f4520G.f4339k <= 0) {
                        AbstractC0316s0.a("Unbalanced begin/end empty");
                    }
                    r4.f4339k--;
                    P0 p03 = this.f4522I;
                    int i56 = p03.f4385v;
                    p03.j();
                    if (this.f4520G.f4339k <= 0) {
                        int i57 = (-2) - i56;
                        this.f4522I.k();
                        this.f4522I.e(true);
                        C0280a c0280a = this.f4525N;
                        if (this.f4526O.f.u0()) {
                            M0 m02 = this.f4521H;
                            c0337b.c();
                            c0337b.e(false);
                            L0 l09 = c0337b.f4814a.f4520G;
                            if (l09.f4333c > 0) {
                                int i58 = l09.i;
                                Q q11 = c0337b.f4817d;
                                if (q11.a(-2) != i58) {
                                    if (!c0337b.f4816c && c0337b.f4818e) {
                                        c0337b.e(false);
                                        C0336a c0336a5 = c0337b.f4815b;
                                        c0336a5.getClass();
                                        c0336a5.f.w0(Q.q.f4838c);
                                        c0337b.f4816c = true;
                                    }
                                    if (i58 > 0) {
                                        C0280a a6 = l09.a(i58);
                                        q11.c(i58);
                                        c0337b.e(false);
                                        C0336a c0336a6 = c0337b.f4815b;
                                        c0336a6.getClass();
                                        Q.p pVar2 = Q.p.f4837c;
                                        Q.K k9 = c0336a6.f;
                                        k9.w0(pVar2);
                                        N4.b.T(k9, 0, a6);
                                        c0337b.f4816c = true;
                                    }
                                }
                            }
                            c0337b.d();
                            C0336a c0336a7 = c0337b.f4815b;
                            c0336a7.getClass();
                            Q.s sVar = Q.s.f4843c;
                            Q.K k10 = c0336a7.f;
                            k10.w0(sVar);
                            N4.b.U(k10, 0, c0280a, 1, m02);
                            r6 = 0;
                        } else {
                            M0 m03 = this.f4521H;
                            C0338c c0338c2 = this.f4526O;
                            c0337b.c();
                            c0337b.e(false);
                            L0 l010 = c0337b.f4814a.f4520G;
                            if (l010.f4333c > 0) {
                                int i59 = l010.i;
                                Q q12 = c0337b.f4817d;
                                if (q12.a(-2) != i59) {
                                    if (!c0337b.f4816c && c0337b.f4818e) {
                                        c0337b.e(false);
                                        C0336a c0336a8 = c0337b.f4815b;
                                        c0336a8.getClass();
                                        c0336a8.f.w0(Q.q.f4838c);
                                        c0337b.f4816c = true;
                                    }
                                    if (i59 > 0) {
                                        C0280a a7 = l010.a(i59);
                                        q12.c(i59);
                                        c0337b.e(false);
                                        C0336a c0336a9 = c0337b.f4815b;
                                        c0336a9.getClass();
                                        Q.p pVar3 = Q.p.f4837c;
                                        Q.K k11 = c0336a9.f;
                                        k11.w0(pVar3);
                                        N4.b.T(k11, 0, a7);
                                        c0337b.f4816c = true;
                                    }
                                }
                            }
                            c0337b.d();
                            C0336a c0336a10 = c0337b.f4815b;
                            c0336a10.getClass();
                            Q.t tVar = Q.t.f4844c;
                            Q.K k12 = c0336a10.f;
                            k12.w0(tVar);
                            int i60 = k12.f4813k - k12.f[k12.f4810g - 1].f4809b;
                            Object[] objArr10 = k12.f4812j;
                            objArr10[i60] = c0280a;
                            objArr10[i60 + 1] = m03;
                            objArr10[i60 + 2] = c0338c2;
                            this.f4526O = new C0338c();
                            r6 = 0;
                        }
                        this.f4530S = r6;
                        if (this.f4535c.f4344l != 0) {
                            f0(i57, r6);
                            g0(i57, i18);
                        }
                    }
                }
                c0313q0 = (C0313q0) this.i.remove(r3.size() - 1);
                if (c0313q0 != null && !z5) {
                    c0313q0.f4509c++;
                }
                this.f4540j = c0313q0;
                this.f4541k = q5.b() + i18;
                this.f4543m = q5.b();
                this.f4542l = q5.b() + i18;
            }
        }
        q5 = q6;
        arrayList = arrayList5;
        i = -1;
        z5 = this.f4530S;
        if (!z5) {
        }
        i5 = this.f4541k;
        while (true) {
            l02 = this.f4520G;
            if (l02.f4339k > 0) {
                break;
            }
            J();
            c0337b.f(i5, this.f4520G.s());
            ArrayList arrayList82 = arrayList;
            AbstractC0317t.a(arrayList82, i6, this.f4520G.f4336g);
            i = i;
            arrayList = arrayList82;
        }
        if (z5) {
        }
        c0313q0 = (C0313q0) this.i.remove(r3.size() - 1);
        if (c0313q0 != null) {
            c0313q0.f4509c++;
        }
        this.f4540j = c0313q0;
        this.f4541k = q5.b() + i18;
        this.f4543m = q5.b();
        this.f4542l = q5.b() + i18;
    }

    public final void r() {
        q(false);
        C0326x0 y5 = y();
        if (y5 != null) {
            int i = y5.f4576b;
            if ((i & 1) != 0) {
                y5.f4576b = i | 2;
            }
        }
    }

    public final C0326x0 s() {
        C0326x0 c0326x0;
        C0280a a5;
        i4.c cVar;
        ArrayList arrayList = this.f4518E;
        final C0326x0 c0326x02 = !arrayList.isEmpty() ? (C0326x0) arrayList.remove(arrayList.size() - 1) : null;
        if (c0326x02 != null) {
            c0326x02.f4576b &= -9;
            this.f4538g.d();
            final int i = this.f4515B;
            final C2315A c2315a = c0326x02.f;
            if (c2315a != null && (c0326x02.f4576b & 16) == 0) {
                Object[] objArr = c2315a.f18900b;
                int[] iArr = c2315a.f18901c;
                long[] jArr = c2315a.f18899a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    loop0: while (true) {
                        long j5 = jArr[i5];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j5 & 255) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    Object obj = objArr[i8];
                                    if (iArr[i8] != i) {
                                        cVar = new i4.c() { // from class: P.w0
                                            @Override // i4.c
                                            public final Object c(Object obj2) {
                                                InterfaceC0319u interfaceC0319u;
                                                InterfaceC0319u interfaceC0319u2;
                                                int i9;
                                                InterfaceC0319u interfaceC0319u3 = (InterfaceC0319u) obj2;
                                                C0326x0 c0326x03 = C0326x0.this;
                                                int i10 = c0326x03.f4579e;
                                                int i11 = i;
                                                if (i10 == i11) {
                                                    C2315A c2315a2 = c0326x03.f;
                                                    C2315A c2315a3 = c2315a;
                                                    if (kotlin.jvm.internal.l.a(c2315a3, c2315a2) && (interfaceC0319u3 instanceof C0327y)) {
                                                        long[] jArr2 = c2315a3.f18899a;
                                                        int length2 = jArr2.length - 2;
                                                        if (length2 >= 0) {
                                                            int i12 = 0;
                                                            while (true) {
                                                                long j6 = jArr2[i12];
                                                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i13 = 8;
                                                                    int i14 = 8 - ((~(i12 - length2)) >>> 31);
                                                                    int i15 = 0;
                                                                    while (i15 < i14) {
                                                                        if ((255 & j6) < 128) {
                                                                            int i16 = (i12 << 3) + i15;
                                                                            Object obj3 = c2315a3.f18900b[i16];
                                                                            boolean z3 = c2315a3.f18901c[i16] != i11;
                                                                            if (z3) {
                                                                                i9 = i13;
                                                                                C0327y c0327y = (C0327y) interfaceC0319u3;
                                                                                AbstractC2425d.E(c0327y.f4592q, obj3, c0326x03);
                                                                                if (obj3 instanceof H) {
                                                                                    H h3 = (H) obj3;
                                                                                    interfaceC0319u2 = interfaceC0319u3;
                                                                                    if (!c0327y.f4592q.c(h3)) {
                                                                                        AbstractC2425d.F(c0327y.f4595t, h3);
                                                                                    }
                                                                                    C2321G c2321g = c0326x03.f4580g;
                                                                                    if (c2321g != null) {
                                                                                        c2321g.k(obj3);
                                                                                    }
                                                                                } else {
                                                                                    interfaceC0319u2 = interfaceC0319u3;
                                                                                }
                                                                            } else {
                                                                                interfaceC0319u2 = interfaceC0319u3;
                                                                                i9 = i13;
                                                                            }
                                                                            if (z3) {
                                                                                c2315a3.g(i16);
                                                                            }
                                                                        } else {
                                                                            interfaceC0319u2 = interfaceC0319u3;
                                                                            i9 = i13;
                                                                        }
                                                                        j6 >>= i9;
                                                                        i15++;
                                                                        i13 = i9;
                                                                        interfaceC0319u3 = interfaceC0319u2;
                                                                    }
                                                                    interfaceC0319u = interfaceC0319u3;
                                                                    if (i14 != i13) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    interfaceC0319u = interfaceC0319u3;
                                                                }
                                                                if (i12 == length2) {
                                                                    break;
                                                                }
                                                                i12++;
                                                                interfaceC0319u3 = interfaceC0319u;
                                                            }
                                                        }
                                                    }
                                                }
                                                return W3.o.f6046a;
                                            }
                                        };
                                        break loop0;
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                    }
                }
            }
            cVar = null;
            C0337b c0337b = this.f4524M;
            if (cVar != null) {
                C0336a c0336a = c0337b.f4815b;
                c0336a.getClass();
                Q.l lVar = Q.l.f4833c;
                Q.K k5 = c0336a.f;
                k5.w0(lVar);
                N4.b.U(k5, 0, cVar, 1, this.f4539h);
            }
            int i9 = c0326x02.f4576b;
            if ((i9 & 512) != 0) {
                c0326x02.f4576b = i9 & (-513);
                C0336a c0336a2 = c0337b.f4815b;
                c0336a2.getClass();
                Q.o oVar = Q.o.f4836c;
                Q.K k6 = c0336a2.f;
                k6.w0(oVar);
                N4.b.T(k6, 0, c0326x02);
                int i10 = c0326x02.f4576b;
                c0326x02.f4576b = i10 & (-129);
                if ((i10 & 1024) != 0) {
                    c0326x02.f4576b = i10 & (-1153);
                    this.f4555y = false;
                }
            }
        }
        if (c0326x02 != null) {
            int i11 = c0326x02.f4576b;
            if ((i11 & 16) == 0 && ((i11 & 1) != 0 || this.f4547q)) {
                if (c0326x02.f4577c == null) {
                    if (this.f4530S) {
                        P0 p02 = this.f4522I;
                        a5 = p02.b(p02.f4385v);
                    } else {
                        L0 l02 = this.f4520G;
                        a5 = l02.a(l02.i);
                    }
                    c0326x02.f4577c = a5;
                }
                c0326x02.f4576b &= -5;
                c0326x0 = c0326x02;
                q(false);
                return c0326x0;
            }
        }
        c0326x0 = null;
        q(false);
        return c0326x0;
    }

    public final void t() {
        if (this.f4555y && this.f4520G.i == this.f4556z) {
            this.f4556z = -1;
            this.f4555y = false;
        }
        q(false);
    }

    public final void u() {
        if (this.f4519F || this.f4556z != 100) {
            AbstractC0316s0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f4556z = -1;
        this.f4555y = false;
    }

    public final void v() {
        q(false);
        this.f4534b.b();
        q(false);
        C0337b c0337b = this.f4524M;
        if (c0337b.f4816c) {
            c0337b.e(false);
            c0337b.e(false);
            C0336a c0336a = c0337b.f4815b;
            c0336a.getClass();
            c0336a.f.w0(Q.m.f4834c);
            c0337b.f4816c = false;
        }
        c0337b.c();
        if (c0337b.f4817d.f4389b != 0) {
            AbstractC0317t.c("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            AbstractC0317t.c("Start/end imbalance");
        }
        i();
        this.f4520G.c();
        this.f4553w = this.f4554x.b() != 0;
    }

    public final void w(boolean z3, C0313q0 c0313q0) {
        this.i.add(this.f4540j);
        this.f4540j = c0313q0;
        int i = this.f4542l;
        Q q5 = this.f4544n;
        q5.c(i);
        q5.c(this.f4543m);
        q5.c(this.f4541k);
        if (z3) {
            this.f4541k = 0;
        }
        this.f4542l = 0;
        this.f4543m = 0;
    }

    public final void x() {
        M0 m02 = new M0();
        if (this.f4516C) {
            m02.d();
        }
        if (this.f4534b.c()) {
            m02.f4353u = new C2343v();
        }
        this.f4521H = m02;
        P0 f = m02.f();
        f.e(true);
        this.f4522I = f;
    }

    public final C0326x0 y() {
        if (this.f4514A != 0) {
            return null;
        }
        ArrayList arrayList = this.f4518E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C0326x0) arrayList.get(arrayList.size() - 1);
    }

    public final boolean z() {
        if (!B() || this.f4553w) {
            return true;
        }
        C0326x0 y5 = y();
        return (y5 == null || (y5.f4576b & 4) == 0) ? false : true;
    }
}
