package A;

import B.C0080i;
import B.K;
import M.C0231b;
import M.C0236g;
import M.g0;
import P.AbstractC0329z;
import P.C0299j0;
import P.C0315s;
import S3.f0;
import a.AbstractC0444a;
import e2.C1930k;
import i0.J;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import k4.AbstractC2036a;
import l4.C2062d;
import m4.InterfaceC2104g;
import p4.InterfaceC2280u;
import v.AbstractC2529y;
import x.P;
import x0.j0;
import z.C2681E;
import z.InterfaceC2704f;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f89l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f90m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2681E f91n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f92o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f93p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f94q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f95r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f96s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(E e3, C2681E c2681e, InterfaceC2104g interfaceC2104g, InterfaceC2704f interfaceC2704f, boolean z3, InterfaceC2280u interfaceC2280u, i0.u uVar, b0.f fVar) {
        super(2);
        this.f92o = e3;
        this.f91n = c2681e;
        this.f93p = interfaceC2104g;
        this.f94q = interfaceC2704f;
        this.f90m = z3;
        this.f95r = interfaceC2280u;
        this.f96s = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x074b A[LOOP:15: B:249:0x0749->B:250:0x074b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x078d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x08f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x078a  */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v25 */
    /* JADX WARN: Type inference failed for: r19v5, types: [int] */
    /* JADX WARN: Type inference failed for: r19v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r6v5, types: [B.x] */
    /* JADX WARN: Type inference failed for: r8v47, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // i4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        InterfaceC2704f interfaceC2704f;
        int i5;
        ?? arrayList;
        int i6;
        X3.v vVar;
        boolean z3;
        C2062d c2062d;
        long j5;
        long j6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f;
        float f5;
        List list;
        int i13;
        int i14;
        ArrayList arrayList2;
        int i15;
        List list2;
        List list3;
        int size;
        int i16;
        int size2;
        int i17;
        int g5;
        int f6;
        int i18;
        boolean z5;
        boolean z6;
        u uVar;
        B.u uVar2;
        X3.k kVar;
        ArrayList arrayList3;
        E e3;
        t tVar;
        j0 j0Var;
        boolean z7;
        u uVar3;
        float f7;
        float f8;
        u uVar4;
        u uVar5;
        int i19;
        Object obj3;
        int min;
        int i20;
        u uVar6;
        Object obj4;
        int i21;
        Object obj5 = this.f94q;
        Object obj6 = this.f93p;
        Object obj7 = this.f96s;
        Object obj8 = this.f95r;
        Object obj9 = this.f92o;
        switch (this.f89l) {
            case 0:
                B.u uVar7 = (B.u) obj;
                long j7 = ((W0.a) obj2).f6000a;
                E e5 = (E) obj9;
                e5.f24r.getValue();
                boolean z8 = e5.f10b || uVar7.f713l.t();
                P p5 = P.f20695k;
                AbstractC2529y.a(j7, p5);
                C2681E c2681e = this.f91n;
                int K = uVar7.f713l.K(c2681e.a(uVar7.f713l.getLayoutDirection()));
                int i22 = -1;
                int K5 = uVar7.f713l.K(c2681e.b(uVar7.f713l.getLayoutDirection()));
                int K6 = uVar7.f713l.K(c2681e.f21475b);
                j0 j0Var2 = uVar7.f713l;
                int K7 = j0Var2.K(c2681e.f21477d) + K6;
                int i23 = K5 + K;
                int i24 = K7 - K6;
                long i25 = W0.b.i(-i23, -K7, j7);
                k kVar2 = (k) ((InterfaceC2104g) obj6).invoke();
                C0003c c0003c = kVar2.f60c;
                int h3 = W0.a.h(i25);
                int g6 = W0.a.g(i25);
                c0003c.f43a.i(h3);
                c0003c.f44b.i(g6);
                InterfaceC2704f interfaceC2704f2 = (InterfaceC2704f) obj5;
                if (interfaceC2704f2 == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                int K8 = j0Var2.K(interfaceC2704f2.a());
                int c5 = kVar2.c();
                int g7 = W0.a.g(j7) - K7;
                p pVar = new p(i25, kVar2, uVar7, c5, K8, (b0.f) obj7, K6, i24, G4.l.a(K, K6), (E) obj9);
                long j8 = i25;
                Z.f d5 = Z.q.d();
                i4.c e6 = d5 != null ? d5.e() : null;
                Z.f g8 = Z.q.g(d5);
                try {
                    v vVar2 = e5.f12d;
                    int h4 = ((C0299j0) vVar2.f133b).h();
                    int w5 = AbstractC2036a.w(h4, kVar2, vVar2.f135d);
                    if (h4 != w5) {
                        interfaceC2704f = interfaceC2704f2;
                        ((C0299j0) vVar2.f133b).i(w5);
                        B.v vVar3 = (B.v) vVar2.f136e;
                        i5 = g7;
                        if (h4 != vVar3.f717l) {
                            vVar3.f717l = h4;
                            int i26 = (h4 / 30) * 30;
                            i = w5;
                            vVar3.f716k.setValue(AbstractC0444a.f0(Math.max(i26 - 100, 0), i26 + 130));
                        } else {
                            i = w5;
                        }
                    } else {
                        i = w5;
                        interfaceC2704f = interfaceC2704f2;
                        i5 = g7;
                    }
                    int h5 = ((C0299j0) vVar2.f134c).h();
                    Z.q.k(d5, g8, e6);
                    C1930k c1930k = e5.f20n;
                    boolean z9 = ((R.e) c1930k.f16910l).f5108m != 0;
                    X3.v vVar4 = X3.v.f6090k;
                    ?? r6 = e5.f23q;
                    if (z9 || !r6.f723k.isEmpty()) {
                        arrayList = new ArrayList();
                        R.e eVar = (R.e) c1930k.f16910l;
                        if (eVar.f5108m != 0) {
                            int i27 = eVar.f5108m;
                            if (i27 == 0) {
                                throw new NoSuchElementException("MutableVector is empty.");
                            }
                            i6 = h5;
                            Object[] objArr = eVar.f5106k;
                            int i28 = ((C0080i) objArr[0]).f678a;
                            if (i27 > 0) {
                                int i29 = 0;
                                while (true) {
                                    vVar = vVar4;
                                    int i30 = ((C0080i) objArr[i29]).f678a;
                                    if (i30 < i28) {
                                        i28 = i30;
                                    }
                                    int i31 = i29 + 1;
                                    if (i31 < i27) {
                                        i29 = i31;
                                        vVar4 = vVar;
                                    }
                                }
                            } else {
                                vVar = vVar4;
                            }
                            if (i28 < 0) {
                                throw new IllegalArgumentException("negative minIndex");
                            }
                            int i32 = eVar.f5108m;
                            if (i32 == 0) {
                                throw new NoSuchElementException("MutableVector is empty.");
                            }
                            Object[] objArr2 = eVar.f5106k;
                            z3 = false;
                            int i33 = ((C0080i) objArr2[0]).f679b;
                            if (i32 > 0) {
                                int i34 = 0;
                                while (true) {
                                    Object[] objArr3 = objArr2;
                                    int i35 = ((C0080i) objArr2[i34]).f679b;
                                    if (i35 > i33) {
                                        i33 = i35;
                                    }
                                    i34++;
                                    if (i34 < i32) {
                                        objArr2 = objArr3;
                                    }
                                }
                            }
                            c2062d = new C2062d(i28, Math.min(i33, kVar2.c() - 1), 1);
                        } else {
                            i6 = h5;
                            vVar = vVar4;
                            z3 = false;
                            c2062d = C2062d.f17858n;
                        }
                        int size3 = r6.f723k.size();
                        for (?? r22 = z3; r22 < size3; r22++) {
                            B.w wVar = (B.w) r6.get(r22);
                            int w6 = AbstractC2036a.w(wVar.f720c.h(), kVar2, wVar.f718a);
                            int i36 = c2062d.f17851k;
                            if ((w6 > c2062d.f17852l || i36 > w6) && w6 >= 0 && w6 < kVar2.c()) {
                                arrayList.add(Integer.valueOf(w6));
                            }
                        }
                        int i37 = c2062d.f17851k;
                        int i38 = c2062d.f17852l;
                        if (i37 <= i38) {
                            while (true) {
                                arrayList.add(Integer.valueOf(i37));
                                if (i37 != i38) {
                                    i37++;
                                }
                            }
                        }
                    } else {
                        i6 = h5;
                        arrayList = vVar4;
                        vVar = arrayList;
                        z3 = false;
                    }
                    float floatValue = (j0Var2.t() || !z8) ? e5.f14g : ((Number) e5.f28v.f19846l.getValue()).floatValue();
                    if (this.f90m) {
                        kVar2.f59b.getClass();
                    }
                    boolean t5 = j0Var2.t();
                    t tVar2 = e5.f11c;
                    if (K6 < 0) {
                        throw new IllegalArgumentException("invalid beforeContentPadding");
                    }
                    if (i24 < 0) {
                        throw new IllegalArgumentException("invalid afterContentPadding");
                    }
                    X3.w wVar2 = X3.w.f6091k;
                    k kVar3 = pVar.f80a;
                    InterfaceC2280u interfaceC2280u = (InterfaceC2280u) obj8;
                    float f9 = floatValue;
                    androidx.compose.foundation.lazy.layout.a aVar = e5.f19m;
                    K k5 = kVar3.f61d;
                    if (c5 <= 0) {
                        int j9 = W0.a.j(j8);
                        int i39 = W0.a.i(j8);
                        aVar.b(j9, i39, new ArrayList(), k5, pVar, t5, z8, 0, 0);
                        if (!t5) {
                            aVar.a();
                            if (!W0.l.a(0L, 0L)) {
                                i21 = W0.b.g((int) 0, j8);
                                i39 = W0.b.f((int) 0, j8);
                                e3 = e5;
                                tVar = new t(null, 0, false, 0.0f, j0Var2.i(W0.b.g(i21 + i23, j7), W0.b.f(i39 + K7, j7), wVar2, r.f97m), 0.0f, false, interfaceC2280u, uVar7, pVar.f82c, vVar, -K6, i5 + i24, 0, p5, i24, K8);
                                j0Var = j0Var2;
                                z7 = z3;
                            }
                        }
                        i21 = j9;
                        e3 = e5;
                        tVar = new t(null, 0, false, 0.0f, j0Var2.i(W0.b.g(i21 + i23, j7), W0.b.f(i39 + K7, j7), wVar2, r.f97m), 0.0f, false, interfaceC2280u, uVar7, pVar.f82c, vVar, -K6, i5 + i24, 0, p5, i24, K8);
                        j0Var = j0Var2;
                        z7 = z3;
                    } else {
                        int i40 = i;
                        boolean z10 = z3;
                        ?? r19 = i6;
                        if (i40 >= c5) {
                            i40 = c5 - 1;
                            r19 = z10;
                        }
                        int round = Math.round(f9);
                        int i41 = r19 - round;
                        ?? r192 = i41;
                        r192 = i41;
                        if (i40 == 0 && i41 < 0) {
                            round += i41;
                            r192 = z10;
                        }
                        X3.k kVar4 = new X3.k();
                        int i42 = i40;
                        int i43 = -K6;
                        int i44 = i43 + (K8 < 0 ? K8 : 0);
                        int i45 = r192 + i44;
                        int i46 = 0;
                        while (true) {
                            j5 = pVar.f82c;
                            if (i45 < 0 && i42 > 0) {
                                X3.w wVar3 = wVar2;
                                int i47 = i42 - 1;
                                u a5 = pVar.a(i47, j5);
                                kVar4.add(0, a5);
                                i46 = Math.max(i46, a5.f129m);
                                i45 += a5.f128l;
                                i42 = i47;
                                wVar2 = wVar3;
                            }
                        }
                        X3.w wVar4 = wVar2;
                        if (i45 < i44) {
                            round += i45;
                            i45 = i44;
                        }
                        int i48 = round;
                        int i49 = i45 - i44;
                        int i50 = i5 + i24;
                        int i51 = i46;
                        int i52 = i50 < 0 ? 0 : i50;
                        int i53 = -i49;
                        int i54 = i49;
                        int i55 = i42;
                        int i56 = 0;
                        boolean z11 = false;
                        while (i56 < kVar4.f6086m) {
                            if (i53 >= i52) {
                                kVar4.d(i56);
                                z11 = true;
                            } else {
                                i55++;
                                i53 += ((u) kVar4.get(i56)).f128l;
                                i56++;
                            }
                        }
                        int i57 = i53;
                        int i58 = i51;
                        int i59 = i55;
                        while (true) {
                            if (i59 >= c5) {
                                j6 = j8;
                                i7 = i5;
                            } else if (i57 < i52 || i57 <= 0 || kVar4.isEmpty()) {
                                int i60 = i52;
                                u a6 = pVar.a(i59, j5);
                                long j10 = j8;
                                int i61 = a6.f128l;
                                i57 += i61;
                                if (i57 > i44 || i59 == c5 - 1) {
                                    i58 = Math.max(i58, a6.f129m);
                                    kVar4.addLast(a6);
                                } else {
                                    i54 -= i61;
                                    i42 = i59 + 1;
                                    z11 = true;
                                }
                                i59++;
                                i52 = i60;
                                j8 = j10;
                            } else {
                                j6 = j8;
                                i7 = i5;
                            }
                        }
                        if (i57 < i7) {
                            int i62 = i7 - i57;
                            int i63 = i57 + i62;
                            i10 = i54 - i62;
                            while (i10 < K6 && i42 > 0) {
                                int i64 = i42 - 1;
                                int i65 = i62;
                                u a7 = pVar.a(i64, j5);
                                kVar4.add(0, a7);
                                i58 = Math.max(i58, a7.f129m);
                                i10 += a7.f128l;
                                i42 = i64;
                                i62 = i65;
                                i63 = i63;
                            }
                            int i66 = i63;
                            i8 = i48 + i62;
                            if (i10 < 0) {
                                i8 += i10;
                                i57 = i66 + i10;
                                i9 = i42;
                                i10 = 0;
                            } else {
                                i9 = i42;
                                i57 = i66;
                            }
                        } else {
                            i8 = i48;
                            i9 = i42;
                            i10 = i54;
                        }
                        int i67 = i58;
                        float f10 = (Integer.signum(Math.round(f9)) != Integer.signum(i8) || Math.abs(Math.round(f9)) < Math.abs(i8)) ? f9 : i8;
                        float f11 = f9 - f10;
                        float f12 = (!t5 || i8 <= i48 || f11 > 0.0f) ? 0.0f : (i8 - i48) + f11;
                        if (i10 < 0) {
                            throw new IllegalArgumentException("negative currentFirstItemScrollOffset");
                        }
                        int i68 = -i10;
                        u uVar8 = (u) kVar4.first();
                        if (K6 > 0 || K8 < 0) {
                            i11 = i68;
                            int i69 = kVar4.f6086m;
                            u uVar9 = uVar8;
                            int i70 = i10;
                            int i71 = 0;
                            while (i71 < i69) {
                                int i72 = i69;
                                int i73 = ((u) kVar4.get(i71)).f128l;
                                if (i70 != 0 && i73 <= i70 && i71 != X3.n.N(kVar4)) {
                                    i70 -= i73;
                                    i71++;
                                    uVar9 = (u) kVar4.get(i71);
                                    i69 = i72;
                                }
                                i10 = i70;
                                uVar8 = uVar9;
                                i12 = 0;
                                f = f10;
                            }
                            i10 = i70;
                            uVar8 = uVar9;
                            i12 = 0;
                            f = f10;
                        } else {
                            i11 = i68;
                            f = f10;
                            i12 = 0;
                        }
                        int max = Math.max(i12, i9);
                        int i74 = i9 - 1;
                        if (max <= i74) {
                            list = null;
                            while (true) {
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                f5 = f12;
                                list.add(pVar.a(i74, j5));
                                if (i74 != max) {
                                    i74--;
                                    f12 = f5;
                                }
                            }
                        } else {
                            f5 = f12;
                            list = null;
                        }
                        int size4 = arrayList.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i75 = size4 - 1;
                                int intValue = ((Number) arrayList.get(size4)).intValue();
                                if (intValue < max) {
                                    if (list == null) {
                                        list = new ArrayList();
                                    }
                                    list.add(pVar.a(intValue, j5));
                                }
                                if (i75 >= 0) {
                                    size4 = i75;
                                }
                            }
                        }
                        if (list == null) {
                            list = vVar;
                        }
                        int i76 = i67;
                        int i77 = 0;
                        for (int size5 = list.size(); i77 < size5; size5 = size5) {
                            i76 = Math.max(i76, ((u) list.get(i77)).f129m);
                            i77++;
                        }
                        int i78 = c5 - 1;
                        int min2 = Math.min(((u) X3.m.e0(kVar4)).f119a, i78);
                        int i79 = i76;
                        int i80 = ((u) X3.m.e0(kVar4)).f119a + 1;
                        if (i80 <= min2) {
                            ArrayList arrayList4 = null;
                            while (true) {
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                i14 = i10;
                                arrayList2 = arrayList4;
                                i13 = i59;
                                arrayList2.add(pVar.a(i80, j5));
                                if (i80 != min2) {
                                    i80++;
                                    i59 = i13;
                                    arrayList4 = arrayList2;
                                    i10 = i14;
                                }
                            }
                        } else {
                            i13 = i59;
                            i14 = i10;
                            arrayList2 = null;
                        }
                        if (t5 && tVar2 != null) {
                            ?? r8 = tVar2.f111j;
                            if (!r8.isEmpty()) {
                                ArrayList arrayList5 = arrayList2;
                                for (int size6 = r8.size() - 1; i22 < size6; size6--) {
                                    if (((u) r8.get(size6)).f119a <= min2 || (size6 != 0 && ((u) r8.get(size6 - 1)).f119a > min2)) {
                                        i22 = -1;
                                    } else {
                                        uVar3 = (u) r8.get(size6);
                                        u uVar10 = (u) X3.m.e0(r8);
                                        if (uVar3 != null || (i20 = uVar3.f119a) > (min = Math.min(uVar10.f119a, i78))) {
                                            i15 = i7;
                                            list2 = list;
                                            list3 = arrayList5;
                                        } else {
                                            list3 = arrayList5;
                                            while (true) {
                                                if (list3 != null) {
                                                    list2 = list;
                                                    int size7 = list3.size();
                                                    i15 = i7;
                                                    int i81 = 0;
                                                    while (true) {
                                                        if (i81 < size7) {
                                                            obj4 = list3.get(i81);
                                                            int i82 = i81;
                                                            if (((u) obj4).f119a != i20) {
                                                                i81 = i82 + 1;
                                                            }
                                                        } else {
                                                            obj4 = null;
                                                        }
                                                    }
                                                    uVar6 = (u) obj4;
                                                } else {
                                                    i15 = i7;
                                                    list2 = list;
                                                    uVar6 = null;
                                                }
                                                if (uVar6 == null) {
                                                    if (list3 == null) {
                                                        list3 = new ArrayList();
                                                    }
                                                    list3.add(pVar.a(i20, j5));
                                                }
                                                if (i20 != min) {
                                                    i20++;
                                                    list = list2;
                                                    i7 = i15;
                                                }
                                            }
                                        }
                                        f7 = ((tVar2.f113l - uVar10.f126j) - uVar10.f127k) - f;
                                        if (f7 > 0.0f) {
                                            int i83 = uVar10.f119a + 1;
                                            List list4 = list3;
                                            int i84 = 0;
                                            while (i83 < c5 && i84 < f7) {
                                                if (i83 <= min2) {
                                                    int c6 = kVar4.c();
                                                    int i85 = 0;
                                                    while (true) {
                                                        if (i85 < c6) {
                                                            obj3 = kVar4.get(i85);
                                                            f8 = f7;
                                                            if (((u) obj3).f119a != i83) {
                                                                i85++;
                                                                f7 = f8;
                                                            }
                                                        } else {
                                                            f8 = f7;
                                                            obj3 = null;
                                                        }
                                                    }
                                                    uVar4 = (u) obj3;
                                                } else {
                                                    f8 = f7;
                                                    if (list4 != null) {
                                                        int size8 = list4.size();
                                                        int i86 = 0;
                                                        while (true) {
                                                            if (i86 < size8) {
                                                                uVar5 = list4.get(i86);
                                                                if (((u) uVar5).f119a != i83) {
                                                                    i86++;
                                                                }
                                                            } else {
                                                                uVar5 = 0;
                                                            }
                                                        }
                                                        uVar4 = uVar5;
                                                    } else {
                                                        uVar4 = null;
                                                    }
                                                }
                                                if (uVar4 != null) {
                                                    i83++;
                                                    i19 = uVar4.f128l;
                                                } else {
                                                    if (list4 == null) {
                                                        list4 = new ArrayList();
                                                    }
                                                    list4.add(pVar.a(i83, j5));
                                                    i83++;
                                                    i19 = ((u) X3.m.e0(list4)).f128l;
                                                }
                                                i84 += i19;
                                                f7 = f8;
                                            }
                                            list3 = list4;
                                        }
                                        if (list3 != null && ((u) X3.m.e0(list3)).f119a > min2) {
                                            min2 = ((u) X3.m.e0(list3)).f119a;
                                        }
                                        size = arrayList.size();
                                        for (i16 = 0; i16 < size; i16++) {
                                            int intValue2 = ((Number) arrayList.get(i16)).intValue();
                                            if (intValue2 > min2) {
                                                if (list3 == null) {
                                                    list3 = new ArrayList();
                                                }
                                                list3.add(pVar.a(intValue2, j5));
                                            }
                                        }
                                        if (list3 == null) {
                                            list3 = vVar;
                                        }
                                        size2 = list3.size();
                                        int i87 = i79;
                                        for (i17 = 0; i17 < size2; i17++) {
                                            i87 = Math.max(i87, ((u) list3.get(i17)).f129m);
                                        }
                                        boolean z12 = !kotlin.jvm.internal.l.a(uVar8, kVar4.first()) && list2.isEmpty() && list3.isEmpty();
                                        long j11 = j6;
                                        g5 = W0.b.g(i87, j11);
                                        f6 = W0.b.f(i57, j11);
                                        i18 = i15;
                                        z5 = i57 < Math.min(f6, i18);
                                        if (!z5 && i11 != 0) {
                                            throw new IllegalStateException("non-zero itemsScrollOffset");
                                        }
                                        ArrayList arrayList6 = new ArrayList(list3.size() + list2.size() + kVar4.c());
                                        if (!z5) {
                                            z6 = z12;
                                            uVar = uVar8;
                                            uVar2 = uVar7;
                                            int size9 = list2.size();
                                            int i88 = i11;
                                            int i89 = 0;
                                            while (i89 < size9) {
                                                List list5 = list2;
                                                int i90 = size9;
                                                u uVar11 = (u) list5.get(i89);
                                                i88 -= uVar11.f128l;
                                                uVar11.c(i88, g5, f6);
                                                arrayList6.add(uVar11);
                                                i89++;
                                                list2 = list5;
                                                size9 = i90;
                                            }
                                            int c7 = kVar4.c();
                                            int i91 = i11;
                                            for (int i92 = 0; i92 < c7; i92++) {
                                                u uVar12 = (u) kVar4.get(i92);
                                                uVar12.c(i91, g5, f6);
                                                arrayList6.add(uVar12);
                                                i91 += uVar12.f128l;
                                            }
                                            int size10 = list3.size();
                                            for (int i93 = 0; i93 < size10; i93++) {
                                                u uVar13 = (u) list3.get(i93);
                                                uVar13.c(i91, g5, f6);
                                                arrayList6.add(uVar13);
                                                i91 += uVar13.f128l;
                                            }
                                        } else {
                                            if (!list2.isEmpty() || !list3.isEmpty()) {
                                                throw new IllegalArgumentException("no extra items");
                                            }
                                            int c8 = kVar4.c();
                                            int[] iArr = new int[c8];
                                            for (int i94 = 0; i94 < c8; i94++) {
                                                iArr[i94] = ((u) kVar4.get(i94)).f127k;
                                            }
                                            int[] iArr2 = new int[c8];
                                            int i95 = 0;
                                            while (i95 < c8) {
                                                iArr2[i95] = 0;
                                                i95++;
                                                z12 = z12;
                                            }
                                            z6 = z12;
                                            if (interfaceC2704f == null) {
                                                throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                                            }
                                            uVar2 = uVar7;
                                            interfaceC2704f.c(f6, uVar2, iArr, iArr2);
                                            uVar = uVar8;
                                            C2062d c2062d2 = new C2062d(0, c8 - 1, 1);
                                            int i96 = c2062d2.f17852l;
                                            int i97 = c2062d2.f17853m;
                                            if ((i97 > 0 && i96 >= 0) || (i97 < 0 && i96 <= 0)) {
                                                int i98 = 0;
                                                while (true) {
                                                    int i99 = iArr2[i98];
                                                    int i100 = i97;
                                                    u uVar14 = (u) kVar4.get(i98);
                                                    uVar14.c(i99, g5, f6);
                                                    arrayList6.add(uVar14);
                                                    if (i98 != i96) {
                                                        i98 += i100;
                                                        i97 = i100;
                                                    }
                                                }
                                            }
                                        }
                                        int i101 = i57;
                                        B.u uVar15 = uVar2;
                                        int i102 = i14;
                                        aVar.b(g5, f6, arrayList6, k5, pVar, t5, z8, i102, i101);
                                        int i103 = f6;
                                        if (t5) {
                                            kVar = kVar4;
                                        } else {
                                            aVar.a();
                                            kVar = kVar4;
                                            if (!W0.l.a(0L, 0L)) {
                                                g5 = W0.b.g(Math.max(g5, (int) 0), j11);
                                                int f13 = W0.b.f(Math.max(i103, (int) 0), j11);
                                                if (f13 != i103) {
                                                    int size11 = arrayList6.size();
                                                    for (int i104 = 0; i104 < size11; i104++) {
                                                        ((u) arrayList6.get(i104)).f130n = f13;
                                                    }
                                                }
                                                i103 = f13;
                                            }
                                        }
                                        boolean z13 = i13 >= c5 || i101 > i18;
                                        x0.P i105 = j0Var2.i(W0.b.g(g5 + i23, j7), W0.b.f(i103 + K7, j7), wVar4, new s(arrayList6, (u) null, t5, e5.f27u));
                                        if (z6) {
                                            arrayList3 = arrayList6;
                                        } else {
                                            ArrayList arrayList7 = new ArrayList(arrayList6.size());
                                            int size12 = arrayList6.size();
                                            for (int i106 = 0; i106 < size12; i106++) {
                                                Object obj10 = arrayList6.get(i106);
                                                u uVar16 = (u) obj10;
                                                if (uVar16.f119a >= ((u) kVar.first()).f119a) {
                                                    if (uVar16.f119a <= ((u) kVar.last()).f119a) {
                                                        arrayList7.add(obj10);
                                                    }
                                                }
                                            }
                                            arrayList3 = arrayList7;
                                        }
                                        e3 = e5;
                                        j0Var = j0Var2;
                                        z7 = false;
                                        tVar = new t(uVar, i102, z13, f, i105, f5, z11, interfaceC2280u, uVar15, pVar.f82c, arrayList3, i43, i50, c5, p5, i24, K8);
                                    }
                                }
                                uVar3 = null;
                                u uVar102 = (u) X3.m.e0(r8);
                                if (uVar3 != null) {
                                }
                                i15 = i7;
                                list2 = list;
                                list3 = arrayList5;
                                f7 = ((tVar2.f113l - uVar102.f126j) - uVar102.f127k) - f;
                                if (f7 > 0.0f) {
                                }
                                if (list3 != null) {
                                    min2 = ((u) X3.m.e0(list3)).f119a;
                                }
                                size = arrayList.size();
                                while (i16 < size) {
                                }
                                if (list3 == null) {
                                }
                                size2 = list3.size();
                                int i872 = i79;
                                while (i17 < size2) {
                                }
                                if (kotlin.jvm.internal.l.a(uVar8, kVar4.first())) {
                                }
                                long j112 = j6;
                                g5 = W0.b.g(i872, j112);
                                f6 = W0.b.f(i57, j112);
                                i18 = i15;
                                if (i57 < Math.min(f6, i18)) {
                                }
                                if (!z5) {
                                }
                                ArrayList arrayList62 = new ArrayList(list3.size() + list2.size() + kVar4.c());
                                if (!z5) {
                                }
                                int i1012 = i57;
                                B.u uVar152 = uVar2;
                                int i1022 = i14;
                                aVar.b(g5, f6, arrayList62, k5, pVar, t5, z8, i1022, i1012);
                                int i1032 = f6;
                                if (t5) {
                                }
                                if (i13 >= c5) {
                                }
                                x0.P i1052 = j0Var2.i(W0.b.g(g5 + i23, j7), W0.b.f(i1032 + K7, j7), wVar4, new s(arrayList62, (u) null, t5, e5.f27u));
                                if (z6) {
                                }
                                e3 = e5;
                                j0Var = j0Var2;
                                z7 = false;
                                tVar = new t(uVar, i1022, z13, f, i1052, f5, z11, interfaceC2280u, uVar152, pVar.f82c, arrayList3, i43, i50, c5, p5, i24, K8);
                            }
                        }
                        i15 = i7;
                        list2 = list;
                        list3 = arrayList2;
                        if (list3 != null) {
                        }
                        size = arrayList.size();
                        while (i16 < size) {
                        }
                        if (list3 == null) {
                        }
                        size2 = list3.size();
                        int i8722 = i79;
                        while (i17 < size2) {
                        }
                        if (kotlin.jvm.internal.l.a(uVar8, kVar4.first())) {
                        }
                        long j1122 = j6;
                        g5 = W0.b.g(i8722, j1122);
                        f6 = W0.b.f(i57, j1122);
                        i18 = i15;
                        if (i57 < Math.min(f6, i18)) {
                        }
                        if (!z5) {
                        }
                        ArrayList arrayList622 = new ArrayList(list3.size() + list2.size() + kVar4.c());
                        if (!z5) {
                        }
                        int i10122 = i57;
                        B.u uVar1522 = uVar2;
                        int i10222 = i14;
                        aVar.b(g5, f6, arrayList622, k5, pVar, t5, z8, i10222, i10122);
                        int i10322 = f6;
                        if (t5) {
                        }
                        if (i13 >= c5) {
                        }
                        x0.P i10522 = j0Var2.i(W0.b.g(g5 + i23, j7), W0.b.f(i10322 + K7, j7), wVar4, new s(arrayList622, (u) null, t5, e5.f27u));
                        if (z6) {
                        }
                        e3 = e5;
                        j0Var = j0Var2;
                        z7 = false;
                        tVar = new t(uVar, i10222, z13, f, i10522, f5, z11, interfaceC2280u, uVar1522, pVar.f82c, arrayList3, i43, i50, c5, p5, i24, K8);
                    }
                    e3.f(tVar, j0Var.t(), z7);
                    return tVar;
                } catch (Throwable th) {
                    Z.q.k(d5, g8, e6);
                    throw th;
                }
            default:
                ((Number) obj2).intValue();
                int B5 = AbstractC0329z.B(805309489);
                X.d dVar = f0.f5485a;
                g0.b((InterfaceC2015a) obj9, (b0.p) obj6, this.f90m, (J) obj5, (C0231b) obj8, (C0236g) obj7, this.f91n, (C0315s) obj, B5);
                return W3.o.f6046a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InterfaceC2015a interfaceC2015a, b0.p pVar, boolean z3, J j5, C0231b c0231b, C0236g c0236g, C2681E c2681e, int i) {
        super(2);
        X.d dVar = f0.f5485a;
        this.f92o = interfaceC2015a;
        this.f93p = pVar;
        this.f90m = z3;
        this.f94q = j5;
        this.f95r = c0231b;
        this.f96s = c0236g;
        this.f91n = c2681e;
    }
}
