package J0;

import a1.C4912a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.a2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3266a2 extends AbstractC7737t implements Function2<B1.z0, Z1.b, B1.W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f13124b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f13125c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f13126d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f13127e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ u0.J f13128f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f13129g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f13130h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3266a2(C4912a c4912a, C4912a c4912a2, C4912a c4912a3, int i11, u0.J j11, C4912a c4912a4, C4912a c4912a5) {
        super(2);
        this.f13124b = c4912a;
        this.f13125c = c4912a2;
        this.f13126d = c4912a3;
        this.f13127e = i11;
        this.f13128f = j11;
        this.f13129g = c4912a4;
        this.f13130h = c4912a5;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x023d A[LOOP:3: B:49:0x023b->B:50:0x023d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x030a A[LOOP:4: B:68:0x0308->B:69:0x030a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0255  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B1.W invoke(B1.z0 z0Var, Z1.b bVar) {
        Object obj;
        u0.J j11;
        Object obj2;
        C3368z0 c3368z0;
        ArrayList arrayList;
        int size;
        int i11;
        Object obj3;
        Integer num;
        int i12;
        int i13;
        int size2;
        int i14;
        B1.W z02;
        int a11;
        float f7;
        int Y02;
        float f11;
        Object obj4;
        Object obj5;
        int i15;
        float f12;
        float f13;
        int Y03;
        float f14;
        float f15;
        B1.z0 z0Var2 = z0Var;
        long p11 = bVar.p();
        int k11 = Z1.b.k(p11);
        int j12 = Z1.b.j(p11);
        long c11 = Z1.b.c(0, 0, 0, 0, 10, p11);
        List<B1.U> L02 = z0Var2.L0(EnumC3276c2.TopBar, this.f13124b);
        ArrayList arrayList2 = new ArrayList(L02.size());
        int size3 = L02.size();
        for (int i16 = 0; i16 < size3; i16++) {
            arrayList2.add(L02.get(i16).a0(c11));
        }
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int l02 = ((B1.m0) obj).l0();
            int P11 = C7714v.P(arrayList2);
            if (1 <= P11) {
                int i17 = 1;
                while (true) {
                    Object obj6 = arrayList2.get(i17);
                    int l03 = ((B1.m0) obj6).l0();
                    if (l02 < l03) {
                        obj = obj6;
                        l02 = l03;
                    }
                    if (i17 == P11) {
                        break;
                    }
                    i17++;
                }
            }
        }
        B1.m0 m0Var = (B1.m0) obj;
        int l04 = m0Var != null ? m0Var.l0() : 0;
        List<B1.U> L03 = z0Var2.L0(EnumC3276c2.Snackbar, this.f13125c);
        ArrayList arrayList3 = new ArrayList(L03.size());
        int size4 = L03.size();
        int i18 = 0;
        while (true) {
            j11 = this.f13128f;
            if (i18 >= size4) {
                break;
            }
            arrayList3.add(L03.get(i18).a0(Z1.c.k((-j11.a(z0Var2, z0Var2.getLayoutDirection())) - j11.d(z0Var2, z0Var2.getLayoutDirection()), -j11.b(z0Var2), c11)));
            i18++;
            k11 = k11;
        }
        int i19 = k11;
        if (arrayList3.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList3.get(0);
            int l05 = ((B1.m0) obj2).l0();
            int P12 = C7714v.P(arrayList3);
            if (1 <= P12) {
                int i21 = 1;
                while (true) {
                    Object obj7 = arrayList3.get(i21);
                    int l06 = ((B1.m0) obj7).l0();
                    if (l05 < l06) {
                        obj2 = obj7;
                        l05 = l06;
                    }
                    if (i21 == P12) {
                        break;
                    }
                    i21++;
                }
            }
        }
        B1.m0 m0Var2 = (B1.m0) obj2;
        int l07 = m0Var2 != null ? m0Var2.l0() : 0;
        List<B1.U> L04 = z0Var2.L0(EnumC3276c2.Fab, this.f13126d);
        ArrayList arrayList4 = new ArrayList(L04.size());
        int size5 = L04.size();
        for (int i22 = 0; i22 < size5; i22++) {
            arrayList4.add(L04.get(i22).a0(Z1.c.k((-j11.a(z0Var2, z0Var2.getLayoutDirection())) - j11.d(z0Var2, z0Var2.getLayoutDirection()), -j11.b(z0Var2), c11)));
        }
        if (!arrayList4.isEmpty()) {
            if (arrayList4.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList4.get(0);
                int u02 = ((B1.m0) obj4).u0();
                int P13 = C7714v.P(arrayList4);
                if (1 <= P13) {
                    int i23 = 1;
                    while (true) {
                        Object obj8 = arrayList4.get(i23);
                        int u03 = ((B1.m0) obj8).u0();
                        if (u02 < u03) {
                            obj4 = obj8;
                            u02 = u03;
                        }
                        if (i23 == P13) {
                            break;
                        }
                        i23++;
                    }
                }
            }
            B1.m0 m0Var3 = (B1.m0) obj4;
            int u04 = m0Var3 != null ? m0Var3.u0() : 0;
            if (arrayList4.isEmpty()) {
                obj5 = null;
            } else {
                obj5 = arrayList4.get(0);
                int l08 = ((B1.m0) obj5).l0();
                int P14 = C7714v.P(arrayList4);
                if (1 <= P14) {
                    int i24 = 1;
                    while (true) {
                        Object obj9 = arrayList4.get(i24);
                        int l09 = ((B1.m0) obj9).l0();
                        if (l08 < l09) {
                            obj5 = obj9;
                            l08 = l09;
                        }
                        if (i24 == P14) {
                            break;
                        }
                        i24++;
                    }
                }
            }
            B1.m0 m0Var4 = (B1.m0) obj5;
            int l010 = m0Var4 != null ? m0Var4.l0() : 0;
            if (u04 != 0 && l010 != 0) {
                int i25 = this.f13127e;
                if (i25 != 0) {
                    if (i25 != 2) {
                        i15 = (i19 - u04) / 2;
                    } else if (z0Var2.getLayoutDirection() == Z1.s.Ltr) {
                        f13 = Q1.f12948b;
                        Y03 = z0Var2.Y0(f13);
                        i15 = (i19 - Y03) - u04;
                    } else {
                        f12 = Q1.f12948b;
                        i15 = z0Var2.Y0(f12);
                    }
                    c3368z0 = new C3368z0(i15, l010);
                } else if (z0Var2.getLayoutDirection() == Z1.s.Ltr) {
                    f15 = Q1.f12948b;
                    i15 = z0Var2.Y0(f15);
                    c3368z0 = new C3368z0(i15, l010);
                } else {
                    f14 = Q1.f12948b;
                    Y03 = z0Var2.Y0(f14);
                    i15 = (i19 - Y03) - u04;
                    c3368z0 = new C3368z0(i15, l010);
                }
                List<B1.U> L05 = z0Var2.L0(EnumC3276c2.BottomBar, new C4912a(true, 424088350, new Z1(c3368z0, this.f13129g)));
                arrayList = new ArrayList(L05.size());
                size = L05.size();
                for (i11 = 0; i11 < size; i11++) {
                    arrayList.add(L05.get(i11).a0(c11));
                }
                if (arrayList.isEmpty()) {
                    obj3 = arrayList.get(0);
                    int l011 = ((B1.m0) obj3).l0();
                    int P15 = C7714v.P(arrayList);
                    if (1 <= P15) {
                        int i26 = 1;
                        while (true) {
                            Object obj10 = arrayList.get(i26);
                            int l012 = ((B1.m0) obj10).l0();
                            if (l011 < l012) {
                                l011 = l012;
                                obj3 = obj10;
                            }
                            if (i26 == P15) {
                                break;
                            }
                            i26++;
                        }
                    }
                } else {
                    obj3 = null;
                }
                B1.m0 m0Var5 = (B1.m0) obj3;
                Integer valueOf = m0Var5 == null ? Integer.valueOf(m0Var5.l0()) : null;
                if (c3368z0 == null) {
                    if (valueOf == null) {
                        int a12 = c3368z0.a();
                        f11 = Q1.f12948b;
                        a11 = z0Var2.Y0(f11) + a12;
                        Y02 = j11.b(z0Var2);
                    } else {
                        a11 = c3368z0.a() + valueOf.intValue();
                        f7 = Q1.f12948b;
                        Y02 = z0Var2.Y0(f7);
                    }
                    num = Integer.valueOf(Y02 + a11);
                } else {
                    num = null;
                }
                if (l07 == 0) {
                    i12 = l04;
                    i13 = l07 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : j11.b(z0Var2));
                } else {
                    i12 = l04;
                    i13 = 0;
                }
                int i27 = j12 - i12;
                Integer num2 = valueOf;
                List<B1.U> L06 = z0Var2.L0(EnumC3276c2.MainContent, new C4912a(true, -570781649, new Y1(this.f13128f, z0Var2, arrayList2, arrayList, num2, this.f13130h)));
                ArrayList arrayList5 = new ArrayList(L06.size());
                size2 = L06.size();
                i14 = 0;
                while (i14 < size2) {
                    long j13 = c11;
                    arrayList5.add(L06.get(i14).a0(Z1.b.c(0, 0, 0, i27, 7, j13)));
                    i14++;
                    arrayList3 = arrayList3;
                    c11 = j13;
                }
                z02 = z0Var2.z0(i19, j12, kotlin.collections.U.c(), new X1(arrayList5, arrayList2, arrayList3, arrayList, arrayList4, i12, j12, i13, num2, c3368z0, num));
                return z02;
            }
        }
        c3368z0 = null;
        List<B1.U> L052 = z0Var2.L0(EnumC3276c2.BottomBar, new C4912a(true, 424088350, new Z1(c3368z0, this.f13129g)));
        arrayList = new ArrayList(L052.size());
        size = L052.size();
        while (i11 < size) {
        }
        if (arrayList.isEmpty()) {
        }
        B1.m0 m0Var52 = (B1.m0) obj3;
        if (m0Var52 == null) {
        }
        if (c3368z0 == null) {
        }
        if (l07 == 0) {
        }
        int i272 = j12 - i12;
        Integer num22 = valueOf;
        List<B1.U> L062 = z0Var2.L0(EnumC3276c2.MainContent, new C4912a(true, -570781649, new Y1(this.f13128f, z0Var2, arrayList2, arrayList, num22, this.f13130h)));
        ArrayList arrayList52 = new ArrayList(L062.size());
        size2 = L062.size();
        i14 = 0;
        while (i14 < size2) {
        }
        z02 = z0Var2.z0(i19, j12, kotlin.collections.U.c(), new X1(arrayList52, arrayList2, arrayList3, arrayList, arrayList4, i12, j12, i13, num22, c3368z0, num));
        return z02;
    }
}
