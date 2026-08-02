package P0;

import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.m0;
import Bl0.C2656q;
import D1.AbstractC2810k0;
import java.util.List;
import java.util.NoSuchElementException;
import k1.C7464j;
import k1.C7465k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;
import u0.InterfaceC9914x;

/* loaded from: classes8.dex */
final class X0 implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<C7464j, Unit> f20887a;

    /* renamed from: b, reason: collision with root package name */
    private final float f20888b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9915y f20889c;

    static final class a extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20890b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.D(num.intValue()));
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f20891b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.Y(num.intValue()));
        }
    }

    static final class c extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20892b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f20893c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20894d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20895e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20896f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20897g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20898h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20899i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20900j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20901k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20902l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ X0 f20903m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ B1.Y f20904n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, int i12, B1.m0 m0Var, B1.m0 m0Var2, B1.m0 m0Var3, B1.m0 m0Var4, B1.m0 m0Var5, B1.m0 m0Var6, B1.m0 m0Var7, B1.m0 m0Var8, B1.m0 m0Var9, X0 x02, B1.Y y11) {
            super(1);
            this.f20892b = i11;
            this.f20893c = i12;
            this.f20894d = m0Var;
            this.f20895e = m0Var2;
            this.f20896f = m0Var3;
            this.f20897g = m0Var4;
            this.f20898h = m0Var5;
            this.f20899i = m0Var6;
            this.f20900j = m0Var7;
            this.f20901k = m0Var8;
            this.f20902l = m0Var9;
            this.f20903m = x02;
            this.f20904n = y11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            X0 x02 = this.f20903m;
            float f7 = x02.f20888b;
            B1.Y y11 = this.f20904n;
            float g10 = y11.g();
            Z1.s layoutDirection = y11.getLayoutDirection();
            InterfaceC9914x interfaceC9914x = x02.f20889c;
            W0.f(aVar, this.f20892b, this.f20893c, this.f20894d, this.f20895e, this.f20896f, this.f20897g, this.f20898h, this.f20899i, this.f20900j, this.f20901k, this.f20902l, f7, false, g10, layoutDirection, interfaceC9914x);
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f20905b = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.O(num.intValue()));
        }
    }

    static final class e extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f20906b = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.T(num.intValue()));
        }
    }

    public X0(@NotNull Function1 function1, float f7, @NotNull C9915y c9915y) {
        this.f20887a = function1;
        this.f20888b = f7;
        this.f20889c = c9915y;
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
            int Y11 = interfaceC2552v.Y(Integer.MAX_VALUE);
            int i18 = W0.f20884c;
            i12 = i11 == Integer.MAX_VALUE ? i11 : i11 - Y11;
            i13 = ((Number) function2.invoke(interfaceC2552v, Integer.valueOf(i11))).intValue();
        } else {
            i12 = i11;
            i13 = 0;
        }
        int size2 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i19);
            if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj2), "Trailing")) {
                break;
            }
            i19++;
        }
        InterfaceC2552v interfaceC2552v2 = (InterfaceC2552v) obj2;
        if (interfaceC2552v2 != null) {
            int Y12 = interfaceC2552v2.Y(Integer.MAX_VALUE);
            int i21 = W0.f20884c;
            if (i12 != Integer.MAX_VALUE) {
                i12 -= Y12;
            }
            i14 = ((Number) function2.invoke(interfaceC2552v2, Integer.valueOf(i11))).intValue();
        } else {
            i14 = 0;
        }
        int size3 = list.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i22);
            if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj3), "Label")) {
                break;
            }
            i22++;
        }
        InterfaceC2552v interfaceC2552v3 = (InterfaceC2552v) obj3;
        int intValue = interfaceC2552v3 != null ? ((Number) function2.invoke(interfaceC2552v3, Integer.valueOf(C2656q.c(this.f20888b, i12, i11)))).intValue() : 0;
        int size4 = list.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i23);
            if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj4), "Prefix")) {
                break;
            }
            i23++;
        }
        InterfaceC2552v interfaceC2552v4 = (InterfaceC2552v) obj4;
        if (interfaceC2552v4 != null) {
            i15 = ((Number) function2.invoke(interfaceC2552v4, Integer.valueOf(i12))).intValue();
            int Y13 = interfaceC2552v4.Y(Integer.MAX_VALUE);
            int i24 = W0.f20884c;
            if (i12 != Integer.MAX_VALUE) {
                i12 -= Y13;
            }
        } else {
            i15 = 0;
        }
        int size5 = list.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i25);
            if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj5), "Suffix")) {
                break;
            }
            i25++;
        }
        InterfaceC2552v interfaceC2552v5 = (InterfaceC2552v) obj5;
        if (interfaceC2552v5 != null) {
            int intValue2 = ((Number) function2.invoke(interfaceC2552v5, Integer.valueOf(i12))).intValue();
            int Y14 = interfaceC2552v5.Y(Integer.MAX_VALUE);
            int i26 = W0.f20884c;
            if (i12 != Integer.MAX_VALUE) {
                i12 -= Y14;
            }
            i16 = intValue2;
        } else {
            i16 = 0;
        }
        int size6 = list.size();
        for (int i27 = 0; i27 < size6; i27++) {
            Object obj8 = list.get(i27);
            if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj8), "TextField")) {
                int intValue3 = ((Number) function2.invoke(obj8, Integer.valueOf(i12))).intValue();
                int size7 = list.size();
                int i28 = 0;
                while (true) {
                    if (i28 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i28);
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj6), "Hint")) {
                        break;
                    }
                    i28++;
                }
                InterfaceC2552v interfaceC2552v6 = (InterfaceC2552v) obj6;
                int intValue4 = interfaceC2552v6 != null ? ((Number) function2.invoke(interfaceC2552v6, Integer.valueOf(i12))).intValue() : 0;
                int size8 = list.size();
                int i29 = 0;
                while (true) {
                    if (i29 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj9 = list.get(i29);
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj9), "Supporting")) {
                        obj7 = obj9;
                        break;
                    }
                    i29++;
                }
                InterfaceC2552v interfaceC2552v7 = (InterfaceC2552v) obj7;
                return W0.c(i13, i14, i15, i16, intValue3, intValue, intValue4, interfaceC2552v7 != null ? ((Number) function2.invoke(interfaceC2552v7, Integer.valueOf(i11))).intValue() : 0, this.f20888b, Q0.A.n(), abstractC2810k0.g(), this.f20889c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int d(AbstractC2810k0 abstractC2810k0, List list, int i11, Function2 function2) {
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
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj4), "Leading")) {
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
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj5), "Prefix")) {
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
                    if (Intrinsics.d(Q0.A.g((InterfaceC2552v) obj6), "Suffix")) {
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
                return W0.d(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, interfaceC2552v6 != null ? ((Number) function2.invoke(interfaceC2552v6, Integer.valueOf(i11))).intValue() : 0, this.f20888b, Q0.A.n(), abstractC2810k0.g(), this.f20889c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // B1.V
    public final int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return c((AbstractC2810k0) interfaceC2553w, list, i11, a.f20890b);
    }

    @Override // B1.V
    public final int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return d((AbstractC2810k0) interfaceC2553w, list, i11, b.f20891b);
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        B1.U u11;
        B1.U u12;
        B1.U u13;
        B1.m0 m0Var;
        B1.m0 m0Var2;
        B1.U u14;
        B1.m0 m0Var3;
        int i11;
        B1.m0 m0Var4;
        C9915y c9915y;
        int i12;
        B1.U u15;
        B1.U u16;
        B1.m0 m0Var5;
        B1.U u17;
        B1.W z02;
        X0 x02 = this;
        C9915y c9915y2 = x02.f20889c;
        int Y02 = y11.Y0(c9915y2.a());
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
            m0Var = a02;
            m0Var2 = u21.a0(Z1.c.l(-q12, 0, 2, c11));
        } else {
            m0Var = a02;
            m0Var2 = null;
        }
        int q13 = Q0.A.q(m0Var2) + q12;
        int max3 = Math.max(max2, Q0.A.o(m0Var2));
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
        if (u22 != null) {
            m0Var3 = m0Var2;
            i11 = q13;
            m0Var4 = u22.a0(Z1.c.l(-q13, 0, 2, c11));
        } else {
            m0Var3 = m0Var2;
            i11 = q13;
            m0Var4 = null;
        }
        int q14 = Q0.A.q(m0Var4) + i11;
        int max4 = Math.max(max3, Q0.A.o(m0Var4));
        int Y03 = y11.Y0(c9915y2.c(y11.getLayoutDirection())) + y11.Y0(c9915y2.b(y11.getLayoutDirection()));
        int i17 = -q14;
        int c12 = C2656q.c(x02.f20888b, i17 - Y03, -Y03);
        int i18 = -Y02;
        long k11 = Z1.c.k(c12, i18, c11);
        int size5 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size5) {
                c9915y = c9915y2;
                i12 = Y02;
                u15 = null;
                break;
            }
            u15 = list.get(i19);
            c9915y = c9915y2;
            i12 = Y02;
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u15), "Label")) {
                break;
            }
            i19++;
            Y02 = i12;
            c9915y2 = c9915y;
        }
        B1.U u23 = u15;
        B1.m0 a04 = u23 != null ? u23.a0(k11) : null;
        x02.f20887a.invoke(C7464j.a(a04 != null ? C7465k.a(a04.u0(), a04.l0()) : 0L));
        int size6 = list.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size6) {
                u16 = null;
                break;
            }
            u16 = list.get(i21);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u16), "Supporting")) {
                break;
            }
            i21++;
        }
        B1.U u24 = u16;
        int O11 = u24 != null ? u24.O(Z1.b.m(j11)) : 0;
        int max5 = Math.max(Q0.A.o(a04) / 2, y11.Y0(c9915y.d()));
        long c13 = Z1.b.c(0, 0, 0, 0, 11, Z1.c.k(i17, (i18 - max5) - O11, j11));
        int size7 = list.size();
        B1.m0 m0Var6 = m0Var4;
        int i22 = 0;
        while (i22 < size7) {
            int i23 = i22;
            B1.U u25 = list.get(i22);
            B1.m0 m0Var7 = a04;
            int i24 = size7;
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u25), "TextField")) {
                B1.m0 a05 = u25.a0(c13);
                long c14 = Z1.b.c(0, 0, 0, 0, 14, c13);
                int size8 = list.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size8) {
                        m0Var5 = a05;
                        u17 = null;
                        break;
                    }
                    u17 = list.get(i25);
                    m0Var5 = a05;
                    int i26 = size8;
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(u17), "Hint")) {
                        break;
                    }
                    i25++;
                    size8 = i26;
                    a05 = m0Var5;
                }
                B1.U u26 = u17;
                B1.m0 a06 = u26 != null ? u26.a0(c14) : null;
                int max6 = Math.max(max4, Math.max(m0Var5.l0(), Q0.A.o(a06)) + max5 + i12);
                int d11 = W0.d(Q0.A.q(m0Var), Q0.A.q(a03), Q0.A.q(m0Var3), Q0.A.q(m0Var6), m0Var5.u0(), Q0.A.q(m0Var7), Q0.A.q(a06), x02.f20888b, j11, y11.g(), x02.f20889c);
                long c15 = Z1.b.c(0, d11, 0, 0, 9, Z1.c.l(0, -max6, 1, c11));
                int i27 = d11;
                B1.m0 a07 = u24 != null ? u24.a0(c15) : null;
                int o11 = Q0.A.o(a07);
                int c16 = W0.c(Q0.A.o(m0Var), Q0.A.o(a03), Q0.A.o(m0Var3), Q0.A.o(m0Var6), m0Var5.l0(), Q0.A.o(m0Var7), Q0.A.o(a06), Q0.A.o(a07), x02.f20888b, j11, y11.g(), x02.f20889c);
                int i28 = c16 - o11;
                int size9 = list.size();
                int i29 = 0;
                while (i29 < size9) {
                    B1.U u27 = list.get(i29);
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(u27), "Container")) {
                        B1.m0 a08 = u27.a0(Z1.c.a(i27 != Integer.MAX_VALUE ? i27 : 0, i27, i28 != Integer.MAX_VALUE ? i28 : 0, i28));
                        int i31 = c16;
                        int i32 = i27;
                        z02 = y11.z0(i32, i31, kotlin.collections.U.c(), new c(i31, i32, m0Var, a03, m0Var3, m0Var6, m0Var5, m0Var7, a06, a08, a07, x02, y11));
                        return z02;
                    }
                    i29++;
                    i27 = i27;
                    c16 = c16;
                    x02 = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i22 = i23 + 1;
            x02 = this;
            size7 = i24;
            a04 = m0Var7;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // B1.V
    public final int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return c((AbstractC2810k0) interfaceC2553w, list, i11, d.f20905b);
    }

    @Override // B1.V
    public final int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return d((AbstractC2810k0) interfaceC2553w, list, i11, e.f20906b);
    }
}
