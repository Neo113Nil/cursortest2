package J0;

import B1.C2533b;
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
import u0.InterfaceC9914x;

/* loaded from: classes8.dex */
final class m3 implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13301a;

    /* renamed from: b, reason: collision with root package name */
    private final float f13302b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9915y f13303c;

    static final class a extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13304b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.D(num.intValue()));
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f13305b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.Y(num.intValue()));
        }
    }

    static final class c extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B1.m0 f13306b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13307c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13308d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13309e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13310f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B1.m0 f13311g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ B1.m0 f13312h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ B1.m0 f13313i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ B1.m0 f13314j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ m3 f13315k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13316l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f13317m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ B1.Y f13318n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(B1.m0 m0Var, int i11, int i12, int i13, int i14, B1.m0 m0Var2, B1.m0 m0Var3, B1.m0 m0Var4, B1.m0 m0Var5, m3 m3Var, int i15, int i16, B1.Y y11) {
            super(1);
            this.f13306b = m0Var;
            this.f13307c = i11;
            this.f13308d = i12;
            this.f13309e = i13;
            this.f13310f = i14;
            this.f13311g = m0Var2;
            this.f13312h = m0Var3;
            this.f13313i = m0Var4;
            this.f13314j = m0Var5;
            this.f13315k = m3Var;
            this.f13316l = i15;
            this.f13317m = i16;
            this.f13318n = y11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            m3 m3Var = this.f13315k;
            B1.m0 m0Var = this.f13311g;
            B1.Y y11 = this.f13318n;
            B1.m0 m0Var2 = this.f13314j;
            B1.m0 m0Var3 = this.f13313i;
            B1.m0 m0Var4 = this.f13312h;
            int i11 = this.f13310f;
            int i12 = this.f13309e;
            B1.m0 m0Var5 = this.f13306b;
            if (m0Var5 != null) {
                int i13 = this.f13307c - this.f13308d;
                if (i13 < 0) {
                    i13 = 0;
                }
                boolean z11 = m3Var.f13301a;
                int i14 = this.f13316l + this.f13317m;
                float f7 = m3Var.f13302b;
                float g10 = y11.g();
                int i15 = l3.f13286b;
                if (m0Var3 != null) {
                    aVar2.h(m0Var3, 0, InterfaceC6250b.a.i().a(m0Var3.l0(), i11), 0.0f);
                }
                if (m0Var2 != null) {
                    aVar2.h(m0Var2, i12 - m0Var2.u0(), InterfaceC6250b.a.i().a(m0Var2.l0(), i11), 0.0f);
                }
                aVar2.h(m0Var5, j3.i(m0Var3), (z11 ? InterfaceC6250b.a.i().a(m0Var5.l0(), i11) : C6915b.c(j3.f() * g10)) - C6915b.c((r0 - i13) * f7), 0.0f);
                aVar2.h(m0Var, j3.i(m0Var3), i14, 0.0f);
                if (m0Var4 != null) {
                    aVar2.h(m0Var4, j3.i(m0Var3), i14, 0.0f);
                }
            } else {
                boolean z12 = m3Var.f13301a;
                float g11 = y11.g();
                InterfaceC9914x interfaceC9914x = m3Var.f13303c;
                int i16 = l3.f13286b;
                int c11 = C6915b.c(((C9915y) interfaceC9914x).d() * g11);
                if (m0Var3 != null) {
                    aVar2.h(m0Var3, 0, InterfaceC6250b.a.i().a(m0Var3.l0(), i11), 0.0f);
                }
                if (m0Var2 != null) {
                    aVar2.h(m0Var2, i12 - m0Var2.u0(), InterfaceC6250b.a.i().a(m0Var2.l0(), i11), 0.0f);
                }
                aVar2.h(m0Var, j3.i(m0Var3), z12 ? InterfaceC6250b.a.i().a(m0Var.l0(), i11) : c11, 0.0f);
                if (m0Var4 != null) {
                    if (z12) {
                        c11 = InterfaceC6250b.a.i().a(m0Var4.l0(), i11);
                    }
                    aVar2.h(m0Var4, j3.i(m0Var3), c11, 0.0f);
                }
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f13319b = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.O(num.intValue()));
        }
    }

    static final class e extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f13320b = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.T(num.intValue()));
        }
    }

    public m3(boolean z11, float f7, @NotNull C9915y c9915y) {
        this.f13301a = z11;
        this.f13302b = f7;
        this.f13303c = c9915y;
    }

    private final int d(AbstractC2810k0 abstractC2810k0, List list, int i11, Function2 function2) {
        Object obj;
        Object obj2;
        int i12;
        int i13;
        Object obj3;
        int i14;
        Object obj4;
        int size = list.size();
        int i15 = 0;
        while (true) {
            obj = null;
            if (i15 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i15);
            if (Intrinsics.d(j3.e((InterfaceC2552v) obj2), "Leading")) {
                break;
            }
            i15++;
        }
        InterfaceC2552v interfaceC2552v = (InterfaceC2552v) obj2;
        if (interfaceC2552v != null) {
            int Y11 = interfaceC2552v.Y(Integer.MAX_VALUE);
            int i16 = l3.f13286b;
            i12 = i11 == Integer.MAX_VALUE ? i11 : i11 - Y11;
            i13 = ((Number) function2.invoke(interfaceC2552v, Integer.valueOf(i11))).intValue();
        } else {
            i12 = i11;
            i13 = 0;
        }
        int size2 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i17);
            if (Intrinsics.d(j3.e((InterfaceC2552v) obj3), "Trailing")) {
                break;
            }
            i17++;
        }
        InterfaceC2552v interfaceC2552v2 = (InterfaceC2552v) obj3;
        if (interfaceC2552v2 != null) {
            int Y12 = interfaceC2552v2.Y(Integer.MAX_VALUE);
            int i18 = l3.f13286b;
            if (i12 != Integer.MAX_VALUE) {
                i12 -= Y12;
            }
            i14 = ((Number) function2.invoke(interfaceC2552v2, Integer.valueOf(i11))).intValue();
        } else {
            i14 = 0;
        }
        int size3 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i19);
            if (Intrinsics.d(j3.e((InterfaceC2552v) obj4), "Label")) {
                break;
            }
            i19++;
        }
        InterfaceC2552v interfaceC2552v3 = (InterfaceC2552v) obj4;
        int intValue = interfaceC2552v3 != null ? ((Number) function2.invoke(interfaceC2552v3, Integer.valueOf(i12))).intValue() : 0;
        int size4 = list.size();
        for (int i21 = 0; i21 < size4; i21++) {
            Object obj5 = list.get(i21);
            if (Intrinsics.d(j3.e((InterfaceC2552v) obj5), "TextField")) {
                int intValue2 = ((Number) function2.invoke(obj5, Integer.valueOf(i12))).intValue();
                int size5 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i22);
                    if (Intrinsics.d(j3.e((InterfaceC2552v) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i22++;
                }
                InterfaceC2552v interfaceC2552v4 = (InterfaceC2552v) obj;
                return l3.b(intValue2, intValue > 0, intValue, i13, i14, interfaceC2552v4 != null ? ((Number) function2.invoke(interfaceC2552v4, Integer.valueOf(i12))).intValue() : 0, j3.g(), abstractC2810k0.g(), this.f13303c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static int e(List list, int i11, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj5 = list.get(i12);
            if (Intrinsics.d(j3.e((InterfaceC2552v) obj5), "TextField")) {
                int intValue = ((Number) function2.invoke(obj5, Integer.valueOf(i11))).intValue();
                int size2 = list.size();
                int i13 = 0;
                while (true) {
                    obj = null;
                    if (i13 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i13);
                    if (Intrinsics.d(j3.e((InterfaceC2552v) obj2), "Label")) {
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
                    if (Intrinsics.d(j3.e((InterfaceC2552v) obj3), "Trailing")) {
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
                    if (Intrinsics.d(j3.e((InterfaceC2552v) obj4), "Leading")) {
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
                        break;
                    }
                    Object obj6 = list.get(i16);
                    if (Intrinsics.d(j3.e((InterfaceC2552v) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i16++;
                }
                InterfaceC2552v interfaceC2552v4 = (InterfaceC2552v) obj;
                int intValue5 = interfaceC2552v4 != null ? ((Number) function2.invoke(interfaceC2552v4, Integer.valueOf(i11))).intValue() : 0;
                long g10 = j3.g();
                int i17 = l3.f13286b;
                return Math.max(Math.max(intValue, Math.max(intValue2, intValue5)) + intValue4 + intValue3, Z1.b.m(g10));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // B1.V
    public final int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return d((AbstractC2810k0) interfaceC2553w, list, i11, a.f13304b);
    }

    @Override // B1.V
    public final int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return e(list, i11, b.f13305b);
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        B1.U u11;
        B1.U u12;
        int i11;
        B1.U u13;
        int i12;
        B1.U u14;
        B1.W z02;
        m3 m3Var = this;
        List<? extends B1.U> list2 = list;
        C9915y c9915y = m3Var.f13303c;
        int Y02 = y11.Y0(c9915y.d());
        int Y03 = y11.Y0(c9915y.a());
        int Y04 = y11.Y0(l3.c());
        long c11 = Z1.b.c(0, 0, 0, 0, 10, j11);
        int size = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                u11 = null;
                break;
            }
            u11 = list2.get(i13);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u11), "Leading")) {
                break;
            }
            i13++;
        }
        B1.U u15 = u11;
        B1.m0 a02 = u15 != null ? u15.a0(c11) : null;
        int i14 = j3.i(a02);
        int size2 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                u12 = null;
                break;
            }
            u12 = list2.get(i15);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u12), "Trailing")) {
                break;
            }
            i15++;
        }
        B1.U u16 = u12;
        B1.m0 a03 = u16 != null ? u16.a0(Z1.c.l(-i14, 0, 2, c11)) : null;
        int i16 = j3.i(a03) + i14;
        int i17 = -Y03;
        int i18 = -i16;
        long k11 = Z1.c.k(i18, i17, c11);
        int size3 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                i11 = Y03;
                u13 = null;
                break;
            }
            u13 = list2.get(i19);
            i11 = Y03;
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u13), "Label")) {
                break;
            }
            i19++;
            Y03 = i11;
        }
        B1.U u17 = u13;
        B1.m0 a04 = u17 != null ? u17.a0(k11) : null;
        if (a04 != null) {
            i12 = a04.E(C2533b.b());
            if (i12 == Integer.MIN_VALUE) {
                i12 = a04.l0();
            }
        } else {
            i12 = 0;
        }
        int max = Math.max(i12, Y02);
        long k12 = Z1.c.k(i18, a04 != null ? (i17 - Y04) - max : (-Y02) - i11, Z1.b.c(0, 0, 0, 0, 11, j11));
        int size4 = list2.size();
        int i21 = 0;
        while (i21 < size4) {
            B1.U u18 = list2.get(i21);
            B1.m0 m0Var = a04;
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u18), "TextField")) {
                B1.m0 a05 = u18.a0(k12);
                long c12 = Z1.b.c(0, 0, 0, 0, 14, k12);
                int size5 = list2.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size5) {
                        u14 = null;
                        break;
                    }
                    u14 = list2.get(i22);
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(u14), "Hint")) {
                        break;
                    }
                    i22++;
                    list2 = list;
                }
                B1.U u19 = u14;
                B1.m0 a06 = u19 != null ? u19.a0(c12) : null;
                int max2 = Math.max(Math.max(a05.u0(), Math.max(j3.i(m0Var), j3.i(a06))) + j3.i(a02) + j3.i(a03), Z1.b.m(j11));
                int b11 = l3.b(a05.l0(), m0Var != null, max, j3.h(a02), j3.h(a03), j3.h(a06), j11, y11.g(), m3Var.f13303c);
                z02 = y11.z0(max2, b11, kotlin.collections.U.c(), new c(m0Var, Y02, i12, max2, b11, a05, a06, a02, a03, m3Var, max, Y04, y11));
                return z02;
            }
            i21++;
            m3Var = this;
            list2 = list;
            a04 = m0Var;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // B1.V
    public final int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return d((AbstractC2810k0) interfaceC2553w, list, i11, d.f13319b);
    }

    @Override // B1.V
    public final int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return e(list, i11, e.f13320b);
    }
}
