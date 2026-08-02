package P0;

import a1.C4912a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: P0.j1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3746j1 extends AbstractC7737t implements Function2<B1.z0, Z1.b, B1.W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f21104b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f21105c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f21106d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f21107e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ u0.J f21108f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f21109g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f21110h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3746j1(C4912a c4912a, C4912a c4912a2, C4912a c4912a3, int i11, u0.J j11, C4912a c4912a4, C4912a c4912a5) {
        super(2);
        this.f21104b = c4912a;
        this.f21105c = c4912a2;
        this.f21106d = c4912a3;
        this.f21107e = i11;
        this.f21108f = j11;
        this.f21109g = c4912a4;
        this.f21110h = c4912a5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final B1.W invoke(B1.z0 z0Var, Z1.b bVar) {
        Object obj;
        u0.J j11;
        Object obj2;
        Object obj3;
        int i11;
        ArrayList arrayList;
        C3788y c3788y;
        Object obj4;
        Integer num;
        int i12;
        int i13;
        B1.W z02;
        float f7;
        int Y02;
        int b11;
        float f11;
        Object obj5;
        Object obj6;
        int i14;
        float f12;
        int Y03;
        float f13;
        int Y04;
        float f14;
        float f15;
        B1.z0 z0Var2 = z0Var;
        long p11 = bVar.p();
        int k11 = Z1.b.k(p11);
        int j12 = Z1.b.j(p11);
        long c11 = Z1.b.c(0, 0, 0, 0, 10, p11);
        List<B1.U> L02 = z0Var2.L0(EnumC3755m1.TopBar, this.f21104b);
        ArrayList arrayList2 = new ArrayList(L02.size());
        int size = L02.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList2.add(L02.get(i15).a0(c11));
        }
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int l02 = ((B1.m0) obj).l0();
            int P11 = C7714v.P(arrayList2);
            if (1 <= P11) {
                int i16 = 1;
                while (true) {
                    Object obj7 = arrayList2.get(i16);
                    int l03 = ((B1.m0) obj7).l0();
                    if (l02 < l03) {
                        obj = obj7;
                        l02 = l03;
                    }
                    if (i16 == P11) {
                        break;
                    }
                    i16++;
                }
            }
        }
        B1.m0 m0Var = (B1.m0) obj;
        int l04 = m0Var != null ? m0Var.l0() : 0;
        List<B1.U> L03 = z0Var2.L0(EnumC3755m1.Snackbar, this.f21105c);
        ArrayList arrayList3 = new ArrayList(L03.size());
        int size2 = L03.size();
        int i17 = 0;
        while (true) {
            j11 = this.f21108f;
            if (i17 >= size2) {
                break;
            }
            arrayList3.add(L03.get(i17).a0(Z1.c.k((-j11.a(z0Var2, z0Var2.getLayoutDirection())) - j11.d(z0Var2, z0Var2.getLayoutDirection()), -j11.b(z0Var2), c11)));
            i17++;
        }
        if (arrayList3.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList3.get(0);
            int l05 = ((B1.m0) obj2).l0();
            int P12 = C7714v.P(arrayList3);
            if (1 <= P12) {
                Object obj8 = obj2;
                int i18 = l05;
                int i19 = 1;
                while (true) {
                    Object obj9 = arrayList3.get(i19);
                    int l06 = ((B1.m0) obj9).l0();
                    if (i18 < l06) {
                        obj8 = obj9;
                        i18 = l06;
                    }
                    if (i19 == P12) {
                        break;
                    }
                    i19++;
                }
                obj2 = obj8;
            }
        }
        B1.m0 m0Var2 = (B1.m0) obj2;
        int l07 = m0Var2 != null ? m0Var2.l0() : 0;
        if (arrayList3.isEmpty()) {
            i11 = l07;
            obj3 = null;
        } else {
            obj3 = arrayList3.get(0);
            int u02 = ((B1.m0) obj3).u0();
            int P13 = C7714v.P(arrayList3);
            if (1 <= P13) {
                Object obj10 = obj3;
                int i21 = u02;
                int i22 = 1;
                while (true) {
                    Object obj11 = arrayList3.get(i22);
                    i11 = l07;
                    int u03 = ((B1.m0) obj11).u0();
                    if (i21 < u03) {
                        i21 = u03;
                        obj10 = obj11;
                    }
                    if (i22 == P13) {
                        break;
                    }
                    i22++;
                    l07 = i11;
                }
                obj3 = obj10;
            } else {
                i11 = l07;
            }
        }
        B1.m0 m0Var3 = (B1.m0) obj3;
        int u04 = m0Var3 != null ? m0Var3.u0() : 0;
        List<B1.U> L04 = z0Var2.L0(EnumC3755m1.Fab, this.f21106d);
        ArrayList arrayList4 = new ArrayList(L04.size());
        int size3 = L04.size();
        int i23 = 0;
        while (i23 < size3) {
            List<B1.U> list = L04;
            int i24 = size3;
            B1.m0 a02 = L04.get(i23).a0(Z1.c.k((-j11.a(z0Var2, z0Var2.getLayoutDirection())) - j11.d(z0Var2, z0Var2.getLayoutDirection()), -j11.b(z0Var2), c11));
            if (a02.l0() == 0 || a02.u0() == 0) {
                a02 = null;
            }
            if (a02 != null) {
                arrayList4.add(a02);
            }
            i23++;
            L04 = list;
            size3 = i24;
        }
        boolean isEmpty = arrayList4.isEmpty();
        int i25 = this.f21107e;
        if (isEmpty) {
            arrayList = arrayList2;
            c3788y = null;
        } else {
            if (arrayList4.isEmpty()) {
                arrayList = arrayList2;
                obj5 = null;
            } else {
                obj5 = arrayList4.get(0);
                int u05 = ((B1.m0) obj5).u0();
                int P14 = C7714v.P(arrayList4);
                if (1 <= P14) {
                    Object obj12 = obj5;
                    int i26 = u05;
                    int i27 = 1;
                    while (true) {
                        Object obj13 = arrayList4.get(i27);
                        arrayList = arrayList2;
                        int u06 = ((B1.m0) obj13).u0();
                        if (i26 < u06) {
                            i26 = u06;
                            obj12 = obj13;
                        }
                        if (i27 == P14) {
                            break;
                        }
                        i27++;
                        arrayList2 = arrayList;
                    }
                    obj5 = obj12;
                } else {
                    arrayList = arrayList2;
                }
            }
            Intrinsics.f(obj5);
            int u07 = ((B1.m0) obj5).u0();
            if (arrayList4.isEmpty()) {
                i14 = u07;
                obj6 = null;
            } else {
                obj6 = arrayList4.get(0);
                int l08 = ((B1.m0) obj6).l0();
                int P15 = C7714v.P(arrayList4);
                i14 = u07;
                if (1 <= P15) {
                    int i28 = 1;
                    while (true) {
                        Object obj14 = arrayList4.get(i28);
                        Object obj15 = obj6;
                        int l09 = ((B1.m0) obj14).l0();
                        if (l08 < l09) {
                            l08 = l09;
                            obj6 = obj14;
                        } else {
                            obj6 = obj15;
                        }
                        if (i28 == P15) {
                            break;
                        }
                        i28++;
                    }
                }
            }
            Intrinsics.f(obj6);
            int l010 = ((B1.m0) obj6).l0();
            if (i25 != 0) {
                if (i25 != 2 && i25 != 3) {
                    Y03 = (k11 - i14) / 2;
                } else if (z0Var2.getLayoutDirection() == Z1.s.Ltr) {
                    f13 = C3752l1.f21197a;
                    Y04 = z0Var2.Y0(f13);
                    Y03 = (k11 - Y04) - i14;
                } else {
                    f12 = C3752l1.f21197a;
                    Y03 = z0Var2.Y0(f12);
                }
                c3788y = new C3788y(Y03, l010);
            } else if (z0Var2.getLayoutDirection() == Z1.s.Ltr) {
                f15 = C3752l1.f21197a;
                Y03 = z0Var2.Y0(f15);
                c3788y = new C3788y(Y03, l010);
            } else {
                f14 = C3752l1.f21197a;
                Y04 = z0Var2.Y0(f14);
                Y03 = (k11 - Y04) - i14;
                c3788y = new C3788y(Y03, l010);
            }
        }
        int i29 = l04;
        List<B1.U> L05 = z0Var2.L0(EnumC3755m1.BottomBar, new C4912a(true, -2146438447, new C3743i1(this.f21109g)));
        ArrayList arrayList5 = new ArrayList(L05.size());
        int size4 = L05.size();
        for (int i31 = 0; i31 < size4; i31++) {
            arrayList5.add(L05.get(i31).a0(c11));
        }
        if (arrayList5.isEmpty()) {
            obj4 = null;
        } else {
            obj4 = arrayList5.get(0);
            int l011 = ((B1.m0) obj4).l0();
            int P16 = C7714v.P(arrayList5);
            if (1 <= P16) {
                int i32 = 1;
                while (true) {
                    Object obj16 = arrayList5.get(i32);
                    Object obj17 = obj4;
                    int l012 = ((B1.m0) obj16).l0();
                    if (l011 < l012) {
                        l011 = l012;
                        obj4 = obj16;
                    } else {
                        obj4 = obj17;
                    }
                    if (i32 == P16) {
                        break;
                    }
                    i32++;
                }
            }
        }
        B1.m0 m0Var4 = (B1.m0) obj4;
        Integer valueOf = m0Var4 != null ? Integer.valueOf(m0Var4.l0()) : null;
        if (c3788y != null) {
            if (valueOf == null || i25 == 3) {
                int a11 = c3788y.a();
                f7 = C3752l1.f21197a;
                Y02 = z0Var2.Y0(f7) + a11;
                b11 = j11.b(z0Var2);
            } else {
                Y02 = c3788y.a() + valueOf.intValue();
                f11 = C3752l1.f21197a;
                b11 = z0Var2.Y0(f11);
            }
            num = Integer.valueOf(b11 + Y02);
        } else {
            num = null;
        }
        if (i11 != 0) {
            int intValue = i11 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : j11.b(z0Var2));
            i12 = k11;
            i13 = intValue;
        } else {
            i12 = k11;
            i13 = 0;
        }
        ArrayList arrayList6 = arrayList;
        List<B1.U> L06 = z0Var2.L0(EnumC3755m1.MainContent, new C4912a(true, -1213360416, new C3740h1(this.f21108f, z0Var2, arrayList6, i29, arrayList5, valueOf, this.f21110h)));
        ArrayList arrayList7 = new ArrayList(L06.size());
        int size5 = L06.size();
        for (int i33 = 0; i33 < size5; i33++) {
            arrayList7.add(L06.get(i33).a0(c11));
        }
        int i34 = u04;
        Integer num2 = valueOf;
        int i35 = i12;
        z02 = z0Var2.z0(i35, j12, kotlin.collections.U.c(), new C3737g1(arrayList7, arrayList6, arrayList3, arrayList5, c3788y, i35, i34, this.f21108f, z0Var2, j12, i13, num2, arrayList4, num));
        return z02;
    }
}
