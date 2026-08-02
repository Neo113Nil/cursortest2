package P;

import A0.o1;
import Q.C0336a;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4.InterfaceC2280u;
import r.C2342u;
import s.AbstractC2351a;
import u2.C2496k;

/* renamed from: P.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0329z {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4605a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final K f4606b = new K();

    public static final int A(C2342u c2342u) {
        int c5;
        int i = c2342u.f19051b;
        int c6 = c2342u.c(0);
        while (c2342u.f19051b != 0 && c2342u.c(0) == c6) {
            int i5 = c2342u.f19051b;
            if (i5 == 0) {
                AbstractC2351a.e("IntList is empty.");
                throw null;
            }
            c2342u.e(0, c2342u.f19050a[i5 - 1]);
            c2342u.d(c2342u.f19051b - 1);
            int i6 = c2342u.f19051b;
            int i7 = i6 >>> 1;
            int i8 = 0;
            while (i8 < i7) {
                int c7 = c2342u.c(i8);
                int i9 = (i8 + 1) * 2;
                int i10 = i9 - 1;
                int c8 = c2342u.c(i10);
                if (i9 >= i6 || (c5 = c2342u.c(i9)) <= c8) {
                    if (c8 > c7) {
                        c2342u.e(i8, c8);
                        c2342u.e(i10, c7);
                        i8 = i10;
                    }
                } else if (c5 > c7) {
                    c2342u.e(i8, c5);
                    c2342u.e(i9, c7);
                    i8 = i9;
                }
            }
        }
        return c6;
    }

    public static final int B(int i) {
        int i5 = 306783378 & i;
        int i6 = 613566756 & i;
        return (i & (-920350135)) | (i6 >> 1) | i5 | ((i5 << 1) & i6);
    }

    public static final X.i C(C0322v0[] c0322v0Arr, InterfaceC0314r0 interfaceC0314r0, InterfaceC0314r0 interfaceC0314r02) {
        X.h hVar = new X.h(X.i.f6059n);
        for (C0322v0 c0322v0 : c0322v0Arr) {
            AbstractC0320u0 abstractC0320u0 = (AbstractC0320u0) c0322v0.f4568d;
            if (c0322v0.f4567c || !((X.i) interfaceC0314r0).containsKey(abstractC0320u0)) {
                hVar.put(abstractC0320u0, abstractC0320u0.c(c0322v0, (g1) ((X.i) interfaceC0314r02).get(abstractC0320u0)));
            }
        }
        return hVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C0322v0 c0322v0, i4.e eVar, C0315s c0315s, int i) {
        g1 g1Var;
        boolean z3;
        C0326x0 s2;
        c0315s.Z(-149765515);
        InterfaceC0314r0 l5 = c0315s.l();
        c0315s.V(201, AbstractC0317t.f4558b);
        Object M5 = c0315s.M();
        if (kotlin.jvm.internal.l.a(M5, C0302l.f4480a)) {
            g1Var = null;
        } else {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>", M5);
            g1Var = (g1) M5;
        }
        AbstractC0320u0 abstractC0320u0 = (AbstractC0320u0) c0322v0.f4568d;
        g1 c5 = abstractC0320u0.c(c0322v0, g1Var);
        boolean equals = c5.equals(g1Var);
        if (!equals) {
            c0315s.i0(c5);
        }
        if (c0315s.f4530S) {
            if (c0322v0.f4567c || !((X.i) l5).containsKey(abstractC0320u0)) {
                l5 = ((X.i) l5).b(abstractC0320u0, c5);
            }
            c0315s.J = true;
        } else {
            L0 l02 = c0315s.f4520G;
            Object b3 = l02.b(l02.f4332b, l02.f4336g);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", b3);
            InterfaceC0314r0 interfaceC0314r0 = (InterfaceC0314r0) b3;
            if (!(c0315s.B() && equals) && (c0322v0.f4567c || !((X.i) l5).containsKey(abstractC0320u0))) {
                l5 = ((X.i) l5).b(abstractC0320u0, c5);
            } else if ((equals && !c0315s.f4553w) || !c0315s.f4553w) {
                l5 = interfaceC0314r0;
            }
            if (c0315s.f4555y || interfaceC0314r0 != l5) {
                z3 = true;
                if (z3 && !c0315s.f4530S) {
                    c0315s.K(l5);
                }
                boolean z5 = c0315s.f4553w;
                Q q5 = c0315s.f4554x;
                q5.c(z5 ? 1 : 0);
                c0315s.f4553w = z3;
                c0315s.K = l5;
                c0315s.T(202, 0, AbstractC0317t.f4559c, l5);
                eVar.invoke(c0315s, Integer.valueOf((i >> 3) & 14));
                c0315s.q(false);
                c0315s.q(false);
                c0315s.f4553w = q5.b() != 0;
                c0315s.K = null;
                s2 = c0315s.s();
                if (s2 == null) {
                    s2.f4578d = new O3.p(i, 1, c0322v0, eVar);
                    return;
                }
                return;
            }
        }
        z3 = false;
        if (z3) {
            c0315s.K(l5);
        }
        boolean z52 = c0315s.f4553w;
        Q q52 = c0315s.f4554x;
        q52.c(z52 ? 1 : 0);
        c0315s.f4553w = z3;
        c0315s.K = l5;
        c0315s.T(202, 0, AbstractC0317t.f4559c, l5);
        eVar.invoke(c0315s, Integer.valueOf((i >> 3) & 14));
        c0315s.q(false);
        c0315s.q(false);
        c0315s.f4553w = q52.b() != 0;
        c0315s.K = null;
        s2 = c0315s.s();
        if (s2 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [P.r0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C0322v0[] c0322v0Arr, i4.e eVar, C0315s c0315s, int i) {
        X.i h02;
        boolean z3;
        C0326x0 s2;
        c0315s.Z(415205898);
        InterfaceC0314r0 l5 = c0315s.l();
        c0315s.V(201, AbstractC0317t.f4558b);
        if (c0315s.f4530S) {
            h02 = c0315s.h0(l5, C(c0322v0Arr, l5, X.i.f6059n));
            c0315s.J = true;
        } else {
            L0 l02 = c0315s.f4520G;
            Object h3 = l02.h(l02.f4336g, 0);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", h3);
            ?? r1 = (InterfaceC0314r0) h3;
            L0 l03 = c0315s.f4520G;
            Object h4 = l03.h(l03.f4336g, 1);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", h4);
            InterfaceC0314r0 interfaceC0314r0 = (InterfaceC0314r0) h4;
            X.i C5 = C(c0322v0Arr, l5, interfaceC0314r0);
            if (c0315s.B() && !c0315s.f4555y && interfaceC0314r0.equals(C5)) {
                c0315s.f4542l = c0315s.f4520G.s() + c0315s.f4542l;
                h02 = r1;
            } else {
                h02 = c0315s.h0(l5, C5);
                if (c0315s.f4555y || !kotlin.jvm.internal.l.a(h02, r1)) {
                    z3 = true;
                    if (z3 && !c0315s.f4530S) {
                        c0315s.K(h02);
                    }
                    boolean z5 = c0315s.f4553w;
                    Q q5 = c0315s.f4554x;
                    q5.c(z5 ? 1 : 0);
                    c0315s.f4553w = z3;
                    c0315s.K = h02;
                    c0315s.T(202, 0, AbstractC0317t.f4559c, h02);
                    eVar.invoke(c0315s, Integer.valueOf((i >> 3) & 14));
                    c0315s.q(false);
                    c0315s.q(false);
                    c0315s.f4553w = q5.b() != 0;
                    c0315s.K = null;
                    s2 = c0315s.s();
                    if (s2 == null) {
                        s2.f4578d = new O3.p(i, 2, c0322v0Arr, eVar);
                        return;
                    }
                    return;
                }
            }
        }
        z3 = false;
        if (z3) {
            c0315s.K(h02);
        }
        boolean z52 = c0315s.f4553w;
        Q q52 = c0315s.f4554x;
        q52.c(z52 ? 1 : 0);
        c0315s.f4553w = z3;
        c0315s.K = h02;
        c0315s.T(202, 0, AbstractC0317t.f4559c, h02);
        eVar.invoke(c0315s, Integer.valueOf((i >> 3) & 14));
        c0315s.q(false);
        c0315s.q(false);
        c0315s.f4553w = q52.b() != 0;
        c0315s.K = null;
        s2 = c0315s.s();
        if (s2 == null) {
        }
    }

    public static final void c(Object obj, i4.c cVar, C0315s c0315s) {
        boolean f = c0315s.f(obj);
        Object M5 = c0315s.M();
        if (f || M5 == C0302l.f4480a) {
            M5 = new I(cVar);
            c0315s.i0(M5);
        }
    }

    public static final void d(Object obj, Object obj2, i4.c cVar, C0315s c0315s) {
        boolean f = c0315s.f(obj) | c0315s.f(obj2);
        Object M5 = c0315s.M();
        if (f || M5 == C0302l.f4480a) {
            M5 = new I(cVar);
            c0315s.i0(M5);
        }
    }

    public static final void e(C0315s c0315s, i4.e eVar, Object obj) {
        a4.h hVar = c0315s.f4529R;
        boolean f = c0315s.f(obj);
        Object M5 = c0315s.M();
        if (f || M5 == C0302l.f4480a) {
            M5 = new X(hVar, eVar);
            c0315s.i0(M5);
        }
    }

    public static final void f(Object obj, Object obj2, i4.e eVar, C0315s c0315s) {
        a4.h hVar = c0315s.f4529R;
        boolean f = c0315s.f(obj) | c0315s.f(obj2);
        Object M5 = c0315s.M();
        if (f || M5 == C0302l.f4480a) {
            M5 = new X(hVar, eVar);
            c0315s.i0(M5);
        }
    }

    public static final void g(InterfaceC2015a interfaceC2015a, C0315s c0315s) {
        C0336a c0336a = c0315s.f4524M.f4815b;
        c0336a.getClass();
        Q.A a5 = Q.A.f4800c;
        Q.K k5 = c0336a.f;
        k5.w0(a5);
        N4.b.T(k5, 0, interfaceC2015a);
    }

    public static final void h(C2342u c2342u, int i) {
        if (c2342u.f19051b == 0 || !(c2342u.c(0) == i || c2342u.c(c2342u.f19051b - 1) == i)) {
            int i5 = c2342u.f19051b;
            c2342u.a(i);
            while (i5 > 0) {
                int i6 = ((i5 + 1) >>> 1) - 1;
                int c5 = c2342u.c(i6);
                if (i <= c5) {
                    break;
                }
                c2342u.e(i5, c5);
                i5 = i6;
            }
            c2342u.e(i5, i);
        }
    }

    public static void i(P0 p02, List list, C0327y c0327y) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int c5 = p02.c((C0280a) list.get(i));
            int M5 = p02.M(p02.f4367b, p02.r(c5));
            Object obj = M5 < p02.g(p02.f4367b, p02.r(c5 + 1)) ? p02.f4368c[p02.h(M5)] : C0302l.f4480a;
            C0326x0 c0326x0 = obj instanceof C0326x0 ? (C0326x0) obj : null;
            if (c0326x0 != null) {
                c0326x0.f4575a = c0327y;
            }
        }
    }

    public static final InterfaceC0289e0 k(s4.y yVar, Object obj, a4.h hVar, C0315s c0315s, int i, int i5) {
        if ((i5 & 2) != 0) {
            hVar = a4.i.f6649k;
        }
        boolean h3 = c0315s.h(hVar) | c0315s.h(yVar);
        Object M5 = c0315s.M();
        Object obj2 = C0302l.f4480a;
        if (h3 || M5 == obj2) {
            M5 = new a1(hVar, yVar, null);
            c0315s.i0(M5);
        }
        i4.e eVar = (i4.e) M5;
        Object M6 = c0315s.M();
        if (M6 == obj2) {
            M6 = t(obj);
            c0315s.i0(M6);
        }
        InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M6;
        boolean h4 = c0315s.h(eVar);
        Object M7 = c0315s.M();
        if (h4 || M7 == obj2) {
            M7 = new X0(eVar, interfaceC0289e0, null);
            c0315s.i0(M7);
        }
        f(yVar, hVar, (i4.e) M7, c0315s);
        return interfaceC0289e0;
    }

    public static final InterfaceC0289e0 l(s4.K k5, C0315s c0315s) {
        return k(k5, k5.getValue(), a4.i.f6649k, c0315s, 0, 0);
    }

    public static final InterfaceC2280u m(C0315s c0315s) {
        return new J0(c0315s.f4529R);
    }

    public static final R.e n() {
        v3.e eVar = V0.f4409b;
        R.e eVar2 = (R.e) eVar.u();
        if (eVar2 != null) {
            return eVar2;
        }
        R.e eVar3 = new R.e(new C0312q[0]);
        eVar.L(eVar3);
        return eVar3;
    }

    public static final H o(InterfaceC2015a interfaceC2015a) {
        v3.e eVar = V0.f4408a;
        return new H(interfaceC2015a, null);
    }

    public static final int p(C0315s c0315s) {
        long j5 = c0315s.f4531T;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static final InterfaceC0281a0 q(a4.h hVar) {
        InterfaceC0281a0 interfaceC0281a0 = (InterfaceC0281a0) hVar.l(Z.f4430l);
        if (interfaceC0281a0 != null) {
            return interfaceC0281a0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List s(P0 p02, int i, P0 p03, boolean z3, boolean z5, boolean z6) {
        X3.v vVar;
        boolean H5;
        int i5;
        int i6;
        int t5 = p02.t(i);
        int i7 = i + t5;
        int f = p02.f(i);
        int f5 = p02.f(i7);
        int i8 = f5 - f;
        boolean z7 = i >= 0 && (p02.f4367b[(p02.r(i) * 5) + 1] & 201326592) != 0;
        p03.v(t5);
        p03.w(i8, p03.f4383t);
        if (p02.f4371g < i7) {
            p02.A(i7);
        }
        if (p02.f4374k < f5) {
            p02.B(f5, i7);
        }
        int[] iArr = p03.f4367b;
        int i9 = p03.f4383t;
        int i10 = i9 * 5;
        X3.l.s0(i10, i * 5, i7 * 5, p02.f4367b, iArr);
        Object[] objArr = p03.f4368c;
        int i11 = p03.i;
        System.arraycopy(p02.f4368c, f, objArr, i11, i8);
        int i12 = p03.f4385v;
        iArr[i10 + 2] = i12;
        int i13 = i9 - i;
        int i14 = i9 + t5;
        int g5 = i11 - p03.g(iArr, i9);
        int i15 = p03.f4376m;
        int i16 = p03.f4375l;
        int length = objArr.length;
        boolean z8 = z7;
        int i17 = i15;
        int i18 = i9;
        while (i18 < i14) {
            if (i18 != i9) {
                int i19 = (i18 * 5) + 2;
                iArr[i19] = iArr[i19] + i13;
            }
            int[] iArr2 = iArr;
            int g6 = p03.g(iArr, i18) + g5;
            if (i17 < i18) {
                i5 = i9;
                i6 = 0;
            } else {
                i5 = i9;
                i6 = p03.f4374k;
            }
            iArr2[(i18 * 5) + 4] = P0.i(g6, i6, i16, length);
            if (i18 == i17) {
                i17++;
            }
            i18++;
            i9 = i5;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        p03.f4376m = i17;
        int b3 = O0.b(p02.f4369d, i, p02.p());
        int b5 = O0.b(p02.f4369d, i7, p02.p());
        if (b3 < b5) {
            ArrayList arrayList = p02.f4369d;
            ArrayList arrayList2 = new ArrayList(b5 - b3);
            for (int i20 = b3; i20 < b5; i20++) {
                C0280a c0280a = (C0280a) arrayList.get(i20);
                c0280a.f4439a += i13;
                arrayList2.add(c0280a);
            }
            p03.f4369d.addAll(O0.b(p03.f4369d, p03.f4383t, p03.p()), arrayList2);
            arrayList.subList(b3, b5).clear();
            vVar = arrayList2;
        } else {
            vVar = X3.v.f6090k;
        }
        if (!vVar.isEmpty()) {
            HashMap hashMap = p02.f4370e;
            HashMap hashMap2 = p03.f4370e;
            if (hashMap != null && hashMap2 != null) {
                int size = vVar.size();
                for (int i21 = 0; i21 < size; i21++) {
                }
            }
        }
        int i22 = p03.f4385v;
        p03.N(i12);
        int D5 = p02.D(p02.f4367b, i);
        if (!z6) {
            H5 = false;
        } else if (z3) {
            boolean z9 = D5 >= 0;
            if (z9) {
                p02.O();
                p02.a(D5 - p02.f4383t);
                p02.O();
            }
            p02.a(i - p02.f4383t);
            boolean G5 = p02.G();
            if (z9) {
                p02.L();
                p02.j();
                p02.L();
                p02.j();
            }
            H5 = G5;
        } else {
            H5 = p02.H(i, t5);
            p02.I(f, i8, i - 1);
        }
        if (H5) {
            AbstractC0317t.c("Unexpectedly removed anchors");
        }
        int i23 = p03.f4378o;
        int i24 = iArr3[i10 + 1];
        p03.f4378o = i23 + ((1073741824 & i24) == 0 ? i24 & 67108863 : 1);
        if (z5) {
            p03.f4383t = i14;
            p03.i = i11 + i8;
        }
        if (z8) {
            p03.S(i12);
        }
        return vVar;
    }

    public static C0305m0 t(Object obj) {
        return new C0305m0(obj, Z.f4434p);
    }

    public static final Object u(InterfaceC0314r0 interfaceC0314r0, AbstractC0320u0 abstractC0320u0) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>", abstractC0320u0);
        X.i iVar = (X.i) interfaceC0314r0;
        Object obj = iVar.get(abstractC0320u0);
        if (obj == null) {
            obj = abstractC0320u0.b();
        }
        return ((g1) obj).a(iVar);
    }

    public static final C0310p v(C0315s c0315s) {
        C0315s c0315s2;
        c0315s.V(206, AbstractC0317t.f4561e);
        if (c0315s.f4530S) {
            P0.y(c0315s.f4522I);
        }
        Object E5 = c0315s.E();
        C0308o c0308o = E5 instanceof C0308o ? (C0308o) E5 : null;
        if (c0308o == null) {
            long j5 = c0315s.f4531T;
            boolean z3 = c0315s.f4547q;
            boolean z5 = c0315s.f4516C;
            C0327y c0327y = c0315s.f4539h;
            if (c0327y == null) {
                c0327y = null;
            }
            c0315s2 = c0315s;
            c0308o = new C0308o(new C0310p(c0315s2, j5, z3, z5, c0327y != null ? c0327y.f4582B : null));
            c0315s2.j0(c0308o);
        } else {
            c0315s2 = c0315s;
        }
        InterfaceC0314r0 l5 = c0315s2.l();
        C0310p c0310p = c0308o.f4493k;
        c0310p.f.setValue(l5);
        c0315s2.q(false);
        return c0310p;
    }

    public static final InterfaceC0289e0 w(Object obj, C0315s c0315s) {
        Object M5 = c0315s.M();
        if (M5 == C0302l.f4480a) {
            M5 = t(obj);
            c0315s.i0(M5);
        }
        InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) M5;
        interfaceC0289e0.setValue(obj);
        return interfaceC0289e0;
    }

    public static final void y(C0315s c0315s, i4.e eVar, Object obj) {
        if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), obj)) {
            c0315s.i0(obj);
            c0315s.b(eVar, obj);
        }
    }

    public static final C2496k z(InterfaceC2015a interfaceC2015a) {
        return new C2496k(new b1(interfaceC2015a, null));
    }

    public abstract void j();

    public abstract void r();

    public abstract boolean x(o1 o1Var);
}
