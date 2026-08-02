package A0;

import G1.C0140k;
import K0.C0203h;
import P.InterfaceC0289e0;
import a.AbstractC0444a;
import android.view.KeyEvent;
import f0.C1938b;
import h0.C1988b;
import h0.C1989c;
import i4.InterfaceC2015a;
import o1.C2218e;
import t0.C2407d;
import z0.AbstractC2740P;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.C2731G;
import z0.C2732H;
import z0.C2735K;
import z0.EnumC2729E;

/* renamed from: A0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060u extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f580l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f581m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f582n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0060u(int i, Object obj, Object obj2) {
        super(0);
        this.f580l = i;
        this.f581m = obj;
        this.f582n = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x02ff, code lost:
    
        if (kotlin.jvm.internal.l.a(r8.f4681c, ((P0.w) r7.getValue()).f4681c) == false) goto L148;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v7, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [R.e] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [R.e] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v7, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r6v3, types: [i4.a, kotlin.jvm.internal.m] */
    @Override // i4.InterfaceC2015a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean dispatchKeyEvent;
        H0.n nVar;
        C2731G c2731g;
        long j5;
        long j6;
        E.F0 d5;
        E.Z z3;
        C0203h c0203h;
        int i = 3;
        W3.o oVar = W3.o.f6046a;
        int i5 = 1;
        Object obj = this.f582n;
        Object obj2 = this.f581m;
        switch (this.f580l) {
            case 0:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
            case 1:
                C0038j1 c0038j1 = (C0038j1) obj2;
                H0.h hVar = c0038j1.f522o;
                H0.h hVar2 = c0038j1.f523p;
                Float f = c0038j1.f520m;
                Float f5 = c0038j1.f521n;
                float floatValue = (hVar == null || f == null) ? 0.0f : ((Number) hVar.f2075a.invoke()).floatValue() - f.floatValue();
                float floatValue2 = (hVar2 == null || f5 == null) ? 0.0f : ((Number) hVar2.f2075a.invoke()).floatValue() - f5.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    N n5 = (N) obj;
                    int v4 = n5.v(c0038j1.f518k);
                    H0.o oVar2 = (H0.o) n5.o().b(n5.f354n);
                    if (oVar2 != null) {
                        try {
                            C2218e c2218e = n5.f356p;
                            if (c2218e != null) {
                                c2218e.f18616a.setBoundsInScreen(n5.f(oVar2));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    H0.o oVar3 = (H0.o) n5.o().b(n5.f355o);
                    if (oVar3 != null) {
                        try {
                            C2218e c2218e2 = n5.f357q;
                            if (c2218e2 != null) {
                                c2218e2.f18616a.setBoundsInScreen(n5.f(oVar3));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    n5.f346d.invalidate();
                    H0.o oVar4 = (H0.o) n5.o().b(v4);
                    if (oVar4 != null && (nVar = oVar4.f2117a) != null && (c2731g = nVar.f2113c) != null) {
                        if (hVar != null) {
                            n5.f359s.g(v4, hVar);
                        }
                        if (hVar2 != null) {
                            n5.f360t.g(v4, hVar2);
                        }
                        n5.r(c2731g);
                    }
                }
                if (hVar != null) {
                    c0038j1.f520m = (Float) hVar.f2075a.invoke();
                }
                if (hVar2 != null) {
                    c0038j1.f521n = (Float) hVar2.f2075a.invoke();
                }
                return oVar;
            case 2:
                C1989c c1989c = (C1989c) obj2;
                if (c1989c != null) {
                    return c1989c;
                }
                z0.e0 e0Var = (z0.e0) obj;
                if (!e0Var.I0().f7175x) {
                    e0Var = null;
                }
                if (e0Var != null) {
                    return G4.l.f(0L, AbstractC0444a.d0(e0Var.f20975m));
                }
                return null;
            case 3:
                P0.w wVar = (P0.w) obj2;
                InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) obj;
                if (K0.N.a(wVar.f4680b, ((P0.w) interfaceC0289e0.getValue()).f4680b)) {
                    break;
                }
                interfaceC0289e0.setValue(wVar);
                return oVar;
            case 4:
                ((E.Z) obj2).f1106u.c(new P0.j(((P0.k) obj).f4662e));
                return Boolean.TRUE;
            case 5:
                E.Z z5 = (E.Z) obj2;
                if (z5.b()) {
                    InterfaceC0044l1 interfaceC0044l1 = z5.f1090c;
                    if (interfaceC0044l1 != null) {
                        ((L0) interfaceC0044l1).b();
                    }
                } else {
                    g0.o oVar5 = (g0.o) obj;
                    oVar5.getClass();
                    oVar5.a(new g0.l(i5, i));
                }
                return Boolean.TRUE;
            case 6:
                ((H1.o) obj2).e((C0140k) obj, false);
                return oVar;
            case 7:
                long j7 = ((W0.l) ((InterfaceC0289e0) obj).getValue()).f6015a;
                I.O o5 = (I.O) obj2;
                C1988b g5 = o5.g();
                if (g5 != null) {
                    E.Z z6 = o5.f2426d;
                    C0203h c0203h2 = z6 != null ? z6.f1088a.f1193a : null;
                    if (c0203h2 != null && c0203h2.f2829l.length() != 0) {
                        E.N n6 = (E.N) o5.f2435o.getValue();
                        int i6 = n6 == null ? -1 : I.S.f2447a[n6.ordinal()];
                        if (i6 != -1) {
                            if (i6 == 1 || i6 == 2) {
                                long j8 = o5.j().f4680b;
                                int i7 = K0.N.f2802c;
                                j6 = j8 >> 32;
                            } else {
                                if (i6 != 3) {
                                    throw new D2.e();
                                }
                                long j9 = o5.j().f4680b;
                                int i8 = K0.N.f2802c;
                                j6 = j9 & 4294967295L;
                            }
                            int i9 = (int) j6;
                            E.Z z7 = o5.f2426d;
                            if (z7 != null && (d5 = z7.d()) != null && (z3 = o5.f2426d) != null && (c0203h = z3.f1088a.f1193a) != null) {
                                int t5 = AbstractC0444a.t(o5.f2424b.b(i9), 0, c0203h.f2829l.length());
                                float d6 = C1988b.d(d5.d(g5.f17191a));
                                K0.L l5 = d5.f1029a;
                                int e3 = l5.e(t5);
                                float f6 = l5.f(e3);
                                float g6 = l5.g(e3);
                                float s2 = AbstractC0444a.s(d6, Math.min(f6, g6), Math.max(f6, g6));
                                if (W0.l.a(j7, 0L) || Math.abs(d6 - s2) <= ((int) (j7 >> 32)) / 2) {
                                    K0.r rVar = l5.f2793b;
                                    float d7 = rVar.d(e3);
                                    j5 = G4.d.d(s2, ((rVar.b(e3) - d7) / 2) + d7);
                                    return new C1988b(j5);
                                }
                            }
                        }
                    }
                }
                j5 = 9205357640488583168L;
                return new C1988b(j5);
            case 8:
                ((C1938b) obj2).f16920A.c((f0.c) obj);
                return oVar;
            case 9:
                ((kotlin.jvm.internal.w) obj2).f17624k = ((g0.s) obj).z0();
                return oVar;
            case 10:
                ((C2407d) obj2).d((b0.o) obj);
                return oVar;
            case 11:
                ((r4.g) obj2).q(obj);
                return oVar;
            case 12:
                ((kotlin.jvm.internal.w) obj2).f17624k = AbstractC2749f.i((v.O) obj, x0.X.f20971a);
                return oVar;
            case 13:
                z0.c0 c0Var = ((C2731G) obj2).f21612O;
                if ((c0Var.f.f7165n & 8) != 0) {
                    for (b0.o oVar6 = c0Var.f21770e; oVar6 != null; oVar6 = oVar6.f7166o) {
                        if ((oVar6.f7164m & 8) != 0) {
                            AbstractC2756m abstractC2756m = oVar6;
                            ?? r22 = 0;
                            while (abstractC2756m != 0) {
                                if (abstractC2756m instanceof z0.v0) {
                                    z0.v0 v0Var = (z0.v0) abstractC2756m;
                                    kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) obj;
                                    if (v0Var.X()) {
                                        H0.j jVar = new H0.j();
                                        wVar2.f17624k = jVar;
                                        jVar.f2106n = true;
                                    }
                                    if (v0Var.Z()) {
                                        ((H0.j) wVar2.f17624k).f2105m = true;
                                    }
                                    v0Var.j0((H0.j) wVar2.f17624k);
                                } else if ((abstractC2756m.f7164m & 8) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                    b0.o oVar7 = abstractC2756m.f21839z;
                                    int i10 = 0;
                                    abstractC2756m = abstractC2756m;
                                    r22 = r22;
                                    while (oVar7 != null) {
                                        if ((oVar7.f7164m & 8) != 0) {
                                            i10++;
                                            r22 = r22;
                                            if (i10 == 1) {
                                                abstractC2756m = oVar7;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new R.e(new b0.o[16]);
                                                }
                                                if (abstractC2756m != 0) {
                                                    r22.c(abstractC2756m);
                                                    abstractC2756m = 0;
                                                }
                                                r22.c(oVar7);
                                            }
                                        }
                                        oVar7 = oVar7.f7167p;
                                        abstractC2756m = abstractC2756m;
                                        r22 = r22;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC2756m = AbstractC2749f.f(r22);
                            }
                        }
                    }
                }
                return oVar;
            default:
                z0.U u5 = (z0.U) obj2;
                C2735K c2735k = u5.f21709p;
                c2735k.f21656h = 0;
                R.e y5 = c2735k.f21650a.y();
                Object[] objArr = y5.f5106k;
                int i11 = y5.f5108m;
                for (int i12 = 0; i12 < i11; i12++) {
                    z0.U u6 = ((C2731G) objArr[i12]).f21613P.f21664q;
                    kotlin.jvm.internal.l.c(u6);
                    u6.f21711r = u6.f21712s;
                    u6.f21712s = Integer.MAX_VALUE;
                    if (u6.f21713t == EnumC2729E.f21593l) {
                        u6.f21713t = EnumC2729E.f21594m;
                    }
                }
                C2735K c2735k2 = u5.f21709p;
                R.e y6 = c2735k2.f21650a.y();
                Object[] objArr2 = y6.f5106k;
                int i13 = y6.f5108m;
                for (int i14 = 0; i14 < i13; i14++) {
                    z0.U u7 = ((C2731G) objArr2[i14]).f21613P.f21664q;
                    kotlin.jvm.internal.l.c(u7);
                    u7.f21702A.getClass();
                }
                z0.r rVar2 = u5.r().f21857Z;
                C2731G c2731g2 = c2735k2.f21650a;
                if (rVar2 != null) {
                    boolean z8 = rVar2.f21683u;
                    R.b bVar = (R.b) c2731g2.n();
                    int i15 = bVar.f5100k.f5108m;
                    for (int i16 = 0; i16 < i15; i16++) {
                        AbstractC2740P G02 = ((C2731G) bVar.get(i16)).f21612O.f21769d.G0();
                        if (G02 != null) {
                            G02.f21683u = z8;
                        }
                    }
                }
                ((z0.r) obj).q0().b();
                if (u5.r().f21857Z != null) {
                    R.b bVar2 = (R.b) c2731g2.n();
                    int i17 = bVar2.f5100k.f5108m;
                    for (int i18 = 0; i18 < i17; i18++) {
                        AbstractC2740P G03 = ((C2731G) bVar2.get(i18)).f21612O.f21769d.G0();
                        if (G03 != null) {
                            G03.f21683u = false;
                        }
                    }
                }
                R.e y7 = c2731g2.y();
                Object[] objArr3 = y7.f5106k;
                int i19 = y7.f5108m;
                for (int i20 = 0; i20 < i19; i20++) {
                    z0.U u8 = ((C2731G) objArr3[i20]).f21613P.f21664q;
                    kotlin.jvm.internal.l.c(u8);
                    int i21 = u8.f21711r;
                    int i22 = u8.f21712s;
                    if (i21 != i22 && i22 == Integer.MAX_VALUE) {
                        u8.f0(true);
                    }
                }
                R.e y8 = c2731g2.y();
                Object[] objArr4 = y8.f5106k;
                int i23 = y8.f5108m;
                for (int i24 = 0; i24 < i23; i24++) {
                    z0.U u9 = ((C2731G) objArr4[i24]).f21613P.f21664q;
                    kotlin.jvm.internal.l.c(u9);
                    C2732H c2732h = u9.f21702A;
                    c2732h.getClass();
                    c2732h.f21642c = false;
                }
                return oVar;
        }
    }
}
