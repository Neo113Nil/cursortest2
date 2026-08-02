package P0;

import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.m0;
import D1.AbstractC2810k0;
import e1.InterfaceC6250b;
import hd.C6915b;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* loaded from: classes8.dex */
final class o2 implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    private final float f21275a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9915y f21276b;

    static final class a extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21277b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.D(num.intValue()));
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f21278b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.Y(num.intValue()));
        }
    }

    static final class c extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B1.m0 f21279b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21280c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21281d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ B1.m0 f21282e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B1.m0 f21283f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B1.m0 f21284g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ B1.m0 f21285h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ B1.m0 f21286i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ B1.m0 f21287j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ B1.m0 f21288k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ B1.m0 f21289l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ o2 f21290m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f21291n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ B1.Y f21292o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(B1.m0 m0Var, int i11, int i12, B1.m0 m0Var2, B1.m0 m0Var3, B1.m0 m0Var4, B1.m0 m0Var5, B1.m0 m0Var6, B1.m0 m0Var7, B1.m0 m0Var8, B1.m0 m0Var9, o2 o2Var, int i13, B1.Y y11) {
            super(1);
            this.f21279b = m0Var;
            this.f21280c = i11;
            this.f21281d = i12;
            this.f21282e = m0Var2;
            this.f21283f = m0Var3;
            this.f21284g = m0Var4;
            this.f21285h = m0Var5;
            this.f21286i = m0Var6;
            this.f21287j = m0Var7;
            this.f21288k = m0Var8;
            this.f21289l = m0Var9;
            this.f21290m = o2Var;
            this.f21291n = i13;
            this.f21292o = y11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            o2 o2Var = this.f21290m;
            B1.m0 m0Var = this.f21282e;
            B1.Y y11 = this.f21292o;
            B1.m0 m0Var2 = this.f21279b;
            if (m0Var2 != null) {
                int l02 = m0Var2.l0() + this.f21291n;
                float f7 = o2Var.f21275a;
                float g10 = y11.g();
                aVar2.f(this.f21288k, 0L, 0.0f);
                B1.m0 m0Var3 = this.f21289l;
                int o11 = this.f21281d - Q0.A.o(m0Var3);
                B1.m0 m0Var4 = this.f21284g;
                if (m0Var4 != null) {
                    aVar2.h(m0Var4, 0, InterfaceC6250b.a.i().a(m0Var4.l0(), o11), 0.0f);
                }
                aVar2.h(m0Var2, Q0.A.q(m0Var4), C6915b.c(Q0.A.m() * g10) - C6915b.c((r1 - r5) * f7), 0.0f);
                B1.m0 m0Var5 = this.f21286i;
                if (m0Var5 != null) {
                    aVar2.h(m0Var5, Q0.A.q(m0Var4), l02, 0.0f);
                }
                int q11 = Q0.A.q(m0Var5) + Q0.A.q(m0Var4);
                aVar2.h(m0Var, q11, l02, 0.0f);
                B1.m0 m0Var6 = this.f21283f;
                if (m0Var6 != null) {
                    aVar2.h(m0Var6, q11, l02, 0.0f);
                }
                int i11 = this.f21280c;
                B1.m0 m0Var7 = this.f21285h;
                B1.m0 m0Var8 = this.f21287j;
                if (m0Var8 != null) {
                    aVar2.h(m0Var8, (i11 - Q0.A.q(m0Var7)) - m0Var8.u0(), l02, 0.0f);
                }
                if (m0Var7 != null) {
                    aVar2.h(m0Var7, i11 - m0Var7.u0(), InterfaceC6250b.a.i().a(m0Var7.l0(), o11), 0.0f);
                }
                if (m0Var3 != null) {
                    aVar2.h(m0Var3, 0, o11, 0.0f);
                }
            } else {
                n2.c(aVar2, this.f21280c, this.f21281d, m0Var, this.f21283f, this.f21284g, this.f21285h, this.f21286i, this.f21287j, this.f21288k, this.f21289l, false, y11.g(), o2Var.f21276b);
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f21293b = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.O(num.intValue()));
        }
    }

    static final class e extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f21294b = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.T(num.intValue()));
        }
    }

    public o2(float f7, @NotNull C9915y c9915y) {
        this.f21275a = f7;
        this.f21276b = c9915y;
    }

    private final int c(AbstractC2810k0 abstractC2810k0, List list, int i11, Function2 function2) {
        Object obj;
        int i12;
        int i13;
        Object obj2;
        int i14;
        Object obj3;
        Object obj4;
        int i15;
        Object obj5;
        int i16;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i17);
            if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj), "Leading")) {
                break;
            }
            i17++;
        }
        InterfaceC2552v interfaceC2552v = (InterfaceC2552v) obj;
        if (interfaceC2552v != null) {
            i12 = i11 == Integer.MAX_VALUE ? i11 : i11 - interfaceC2552v.Y(Integer.MAX_VALUE);
            i13 = ((Number) function2.invoke(interfaceC2552v, Integer.valueOf(i11))).intValue();
        } else {
            i12 = i11;
            i13 = 0;
        }
        int size2 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i18);
            if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj2), "Trailing")) {
                break;
            }
            i18++;
        }
        InterfaceC2552v interfaceC2552v2 = (InterfaceC2552v) obj2;
        if (interfaceC2552v2 != null) {
            int Y11 = interfaceC2552v2.Y(Integer.MAX_VALUE);
            if (i12 != Integer.MAX_VALUE) {
                i12 -= Y11;
            }
            i14 = ((Number) function2.invoke(interfaceC2552v2, Integer.valueOf(i11))).intValue();
        } else {
            i14 = 0;
        }
        int size3 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i19);
            if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj3), "Label")) {
                break;
            }
            i19++;
        }
        InterfaceC2552v interfaceC2552v3 = (InterfaceC2552v) obj3;
        int intValue = interfaceC2552v3 != null ? ((Number) function2.invoke(interfaceC2552v3, Integer.valueOf(i12))).intValue() : 0;
        int size4 = list.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i21);
            if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj4), "Prefix")) {
                break;
            }
            i21++;
        }
        InterfaceC2552v interfaceC2552v4 = (InterfaceC2552v) obj4;
        if (interfaceC2552v4 != null) {
            int intValue2 = ((Number) function2.invoke(interfaceC2552v4, Integer.valueOf(i12))).intValue();
            int Y12 = interfaceC2552v4.Y(Integer.MAX_VALUE);
            if (i12 != Integer.MAX_VALUE) {
                i12 -= Y12;
            }
            i15 = intValue2;
        } else {
            i15 = 0;
        }
        int size5 = list.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i22);
            if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj5), "Suffix")) {
                break;
            }
            i22++;
        }
        InterfaceC2552v interfaceC2552v5 = (InterfaceC2552v) obj5;
        if (interfaceC2552v5 != null) {
            int intValue3 = ((Number) function2.invoke(interfaceC2552v5, Integer.valueOf(i12))).intValue();
            int Y13 = interfaceC2552v5.Y(Integer.MAX_VALUE);
            if (i12 != Integer.MAX_VALUE) {
                i12 -= Y13;
            }
            i16 = intValue3;
        } else {
            i16 = 0;
        }
        int size6 = list.size();
        for (int i23 = 0; i23 < size6; i23++) {
            Object obj8 = list.get(i23);
            if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj8), "TextField")) {
                int intValue4 = ((Number) function2.invoke(obj8, Integer.valueOf(i12))).intValue();
                int size7 = list.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i24);
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj6), "Hint")) {
                        break;
                    }
                    i24++;
                }
                InterfaceC2552v interfaceC2552v6 = (InterfaceC2552v) obj6;
                int intValue5 = interfaceC2552v6 != null ? ((Number) function2.invoke(interfaceC2552v6, Integer.valueOf(i12))).intValue() : 0;
                int size8 = list.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj9 = list.get(i25);
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj9), "Supporting")) {
                        obj7 = obj9;
                        break;
                    }
                    i25++;
                }
                InterfaceC2552v interfaceC2552v7 = (InterfaceC2552v) obj7;
                return n2.b(intValue4, intValue, i13, i14, i15, i16, intValue5, interfaceC2552v7 != null ? ((Number) function2.invoke(interfaceC2552v7, Integer.valueOf(i11))).intValue() : 0, this.f21275a, Q0.A.n(), abstractC2810k0.g(), this.f21276b);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static int d(List list, int i11, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj7 = list.get(i12);
            if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj7), "TextField")) {
                int intValue = ((Number) function2.invoke(obj7, Integer.valueOf(i11))).intValue();
                int size2 = list.size();
                int i13 = 0;
                while (true) {
                    obj = null;
                    if (i13 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i13);
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj2), "Label")) {
                        break;
                    }
                    i13++;
                }
                InterfaceC2552v interfaceC2552v = (InterfaceC2552v) obj2;
                int intValue2 = interfaceC2552v != null ? ((Number) function2.invoke(interfaceC2552v, Integer.valueOf(i11))).intValue() : 0;
                int size3 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i14);
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj3), "Trailing")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC2552v interfaceC2552v2 = (InterfaceC2552v) obj3;
                int intValue3 = interfaceC2552v2 != null ? ((Number) function2.invoke(interfaceC2552v2, Integer.valueOf(i11))).intValue() : 0;
                int size4 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i15);
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj4), "Prefix")) {
                        break;
                    }
                    i15++;
                }
                InterfaceC2552v interfaceC2552v3 = (InterfaceC2552v) obj4;
                int intValue4 = interfaceC2552v3 != null ? ((Number) function2.invoke(interfaceC2552v3, Integer.valueOf(i11))).intValue() : 0;
                int size5 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i16);
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj5), "Suffix")) {
                        break;
                    }
                    i16++;
                }
                InterfaceC2552v interfaceC2552v4 = (InterfaceC2552v) obj5;
                int intValue5 = interfaceC2552v4 != null ? ((Number) function2.invoke(interfaceC2552v4, Integer.valueOf(i11))).intValue() : 0;
                int size6 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i17);
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj6), "Leading")) {
                        break;
                    }
                    i17++;
                }
                InterfaceC2552v interfaceC2552v5 = (InterfaceC2552v) obj6;
                int intValue6 = interfaceC2552v5 != null ? ((Number) function2.invoke(interfaceC2552v5, Integer.valueOf(i11))).intValue() : 0;
                int size7 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i18);
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i18++;
                }
                InterfaceC2552v interfaceC2552v6 = (InterfaceC2552v) obj;
                int i19 = intValue4 + intValue5;
                return Math.max(Math.max(intValue + i19, Math.max((interfaceC2552v6 != null ? ((Number) function2.invoke(interfaceC2552v6, Integer.valueOf(i11))).intValue() : 0) + i19, intValue2)) + intValue6 + intValue3, Z1.b.m(Q0.A.n()));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // B1.V
    public final int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return c((AbstractC2810k0) interfaceC2553w, list, i11, a.f21277b);
    }

    @Override // B1.V
    public final int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return d(list, i11, b.f21278b);
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        B1.U u11;
        B1.U u12;
        B1.U u13;
        int i11;
        B1.m0 m0Var;
        B1.U u14;
        B1.U u15;
        int i12;
        B1.m0 m0Var2;
        B1.U u16;
        B1.m0 m0Var3;
        B1.U u17;
        B1.W z02;
        o2 o2Var = this;
        C9915y c9915y = o2Var.f21276b;
        int Y02 = y11.Y0(c9915y.d());
        int Y03 = y11.Y0(c9915y.a());
        long c11 = Z1.b.c(0, 0, 0, 0, 10, j11);
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                u11 = null;
                break;
            }
            u11 = list.get(i13);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u11), "Leading")) {
                break;
            }
            i13++;
        }
        B1.U u18 = u11;
        B1.m0 a02 = u18 != null ? u18.a0(c11) : null;
        int q11 = Q0.A.q(a02);
        int max = Math.max(0, Q0.A.o(a02));
        int size2 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                u12 = null;
                break;
            }
            u12 = list.get(i14);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u12), "Trailing")) {
                break;
            }
            i14++;
        }
        B1.U u19 = u12;
        B1.m0 a03 = u19 != null ? u19.a0(Z1.c.l(-q11, 0, 2, c11)) : null;
        int q12 = Q0.A.q(a03) + q11;
        int max2 = Math.max(max, Q0.A.o(a03));
        int size3 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                u13 = null;
                break;
            }
            u13 = list.get(i15);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u13), "Prefix")) {
                break;
            }
            i15++;
        }
        B1.U u21 = u13;
        if (u21 != null) {
            i11 = q12;
            m0Var = u21.a0(Z1.c.l(-q12, 0, 2, c11));
        } else {
            i11 = q12;
            m0Var = null;
        }
        int q13 = Q0.A.q(m0Var) + i11;
        int max3 = Math.max(max2, Q0.A.o(m0Var));
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                u14 = null;
                break;
            }
            u14 = list.get(i16);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u14), "Suffix")) {
                break;
            }
            i16++;
        }
        B1.U u22 = u14;
        B1.m0 a04 = u22 != null ? u22.a0(Z1.c.l(-q13, 0, 2, c11)) : null;
        int q14 = Q0.A.q(a04) + q13;
        int max4 = Math.max(max3, Q0.A.o(a04));
        int i17 = -q14;
        long k11 = Z1.c.k(i17, -Y03, c11);
        int size5 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size5) {
                u15 = null;
                break;
            }
            u15 = list.get(i18);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u15), "Label")) {
                break;
            }
            i18++;
        }
        B1.U u23 = u15;
        if (u23 != null) {
            i12 = Y03;
            m0Var2 = u23.a0(k11);
        } else {
            i12 = Y03;
            m0Var2 = null;
        }
        int size6 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size6) {
                u16 = null;
                break;
            }
            u16 = list.get(i19);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u16), "Supporting")) {
                break;
            }
            i19++;
        }
        B1.U u24 = u16;
        int O11 = u24 != null ? u24.O(Z1.b.m(j11)) : 0;
        int o11 = Q0.A.o(m0Var2) + Y02;
        B1.m0 m0Var4 = m0Var2;
        int i21 = i12;
        long k12 = Z1.c.k(i17, ((-o11) - i21) - O11, Z1.b.c(0, 0, 0, 0, 11, j11));
        int size7 = list.size();
        int i22 = 0;
        while (i22 < size7) {
            B1.U u25 = list.get(i22);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u25), "TextField")) {
                B1.m0 a05 = u25.a0(k12);
                long c12 = Z1.b.c(0, 0, 0, 0, 14, k12);
                int size8 = list.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size8) {
                        m0Var3 = a05;
                        u17 = null;
                        break;
                    }
                    u17 = list.get(i23);
                    m0Var3 = a05;
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(u17), "Hint")) {
                        break;
                    }
                    i23++;
                    a05 = m0Var3;
                }
                B1.U u26 = u17;
                B1.m0 a06 = u26 != null ? u26.a0(c12) : null;
                int max5 = Math.max(max4, Math.max(m0Var3.l0(), Q0.A.o(a06)) + o11 + i21);
                int q15 = Q0.A.q(a02);
                int q16 = Q0.A.q(a03);
                int q17 = Q0.A.q(m0Var) + Q0.A.q(a04);
                int max6 = Math.max(Math.max(m0Var3.u0() + q17, Math.max(Q0.A.q(a06) + q17, Q0.A.q(m0Var4))) + q15 + q16, Z1.b.m(j11));
                int i24 = max6;
                B1.m0 a07 = u24 != null ? u24.a0(Z1.b.c(0, max6, 0, 0, 9, Z1.c.l(0, -max5, 1, c11))) : null;
                int o12 = Q0.A.o(a07);
                int b11 = n2.b(m0Var3.l0(), Q0.A.o(m0Var4), Q0.A.o(a02), Q0.A.o(a03), Q0.A.o(m0Var), Q0.A.o(a04), Q0.A.o(a06), Q0.A.o(a07), o2Var.f21275a, j11, y11.g(), o2Var.f21276b);
                int i25 = b11 - o12;
                int size9 = list.size();
                int i26 = 0;
                while (i26 < size9) {
                    B1.U u27 = list.get(i26);
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(u27), "Container")) {
                        B1.m0 a08 = u27.a0(Z1.c.a(i24 != Integer.MAX_VALUE ? i24 : 0, i24, i25 != Integer.MAX_VALUE ? i25 : 0, i25));
                        int i27 = i24;
                        int i28 = b11;
                        z02 = y11.z0(i27, i28, kotlin.collections.U.c(), new c(m0Var4, i27, i28, m0Var3, a06, a02, a03, m0Var, a04, a08, a07, o2Var, Y02, y11));
                        return z02;
                    }
                    i26++;
                    i24 = i24;
                    b11 = b11;
                    a02 = a02;
                    a06 = a06;
                    o2Var = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i22++;
            k12 = k12;
            o2Var = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // B1.V
    public final int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return c((AbstractC2810k0) interfaceC2553w, list, i11, d.f21293b);
    }

    @Override // B1.V
    public final int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return d(list, i11, e.f21294b);
    }
}
