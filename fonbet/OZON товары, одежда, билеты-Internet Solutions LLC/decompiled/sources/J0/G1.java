package J0;

import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.m0;
import Bl0.C2656q;
import D1.AbstractC2810k0;
import e1.InterfaceC6250b;
import hd.C6915b;
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
final class G1 implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<C7464j, Unit> f12791a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12792b;

    /* renamed from: c, reason: collision with root package name */
    private final float f12793c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C9915y f12794d;

    static final class a extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f12795b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.D(num.intValue()));
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f12796b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.Y(num.intValue()));
        }
    }

    static final class c extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12797b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12798c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B1.m0 f12799d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ B1.m0 f12800e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B1.m0 f12801f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B1.m0 f12802g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ B1.m0 f12803h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ B1.m0 f12804i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ G1 f12805j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ B1.Y f12806k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, int i12, B1.m0 m0Var, B1.m0 m0Var2, B1.m0 m0Var3, B1.m0 m0Var4, B1.m0 m0Var5, B1.m0 m0Var6, G1 g12, B1.Y y11) {
            super(1);
            this.f12797b = i11;
            this.f12798c = i12;
            this.f12799d = m0Var;
            this.f12800e = m0Var2;
            this.f12801f = m0Var3;
            this.f12802g = m0Var4;
            this.f12803h = m0Var5;
            this.f12804i = m0Var6;
            this.f12805j = g12;
            this.f12806k = y11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            G1 g12 = this.f12805j;
            float f7 = g12.f12793c;
            boolean z11 = g12.f12792b;
            B1.Y y11 = this.f12806k;
            float g10 = y11.g();
            Z1.s layoutDirection = y11.getLayoutDirection();
            InterfaceC9914x interfaceC9914x = g12.f12794d;
            int i11 = F1.f12775c;
            C9915y c9915y = (C9915y) interfaceC9914x;
            int c11 = C6915b.c(c9915y.d() * g10);
            int c12 = C6915b.c(androidx.compose.foundation.layout.T.d(c9915y, layoutDirection) * g10);
            float c13 = j3.c() * g10;
            int i12 = this.f12797b;
            B1.m0 m0Var = this.f12799d;
            if (m0Var != null) {
                aVar2.h(m0Var, 0, InterfaceC6250b.a.i().a(m0Var.l0(), i12), 0.0f);
            }
            B1.m0 m0Var2 = this.f12800e;
            if (m0Var2 != null) {
                aVar2.h(m0Var2, this.f12798c - m0Var2.u0(), InterfaceC6250b.a.i().a(m0Var2.l0(), i12), 0.0f);
            }
            B1.m0 m0Var3 = this.f12802g;
            if (m0Var3 != null) {
                aVar2.h(m0Var3, C6915b.c(m0Var == null ? 0.0f : (1 - f7) * (m0Var.u0() - c13)) + c12, C2656q.c(f7, z11 ? InterfaceC6250b.a.i().a(m0Var3.l0(), i12) : c11, -(m0Var3.l0() / 2)), 0.0f);
            }
            B1.m0 m0Var4 = this.f12801f;
            aVar2.h(m0Var4, j3.i(m0Var), Math.max(z11 ? InterfaceC6250b.a.i().a(m0Var4.l0(), i12) : c11, j3.h(m0Var3) / 2), 0.0f);
            B1.m0 m0Var5 = this.f12803h;
            if (m0Var5 != null) {
                if (z11) {
                    c11 = InterfaceC6250b.a.i().a(m0Var5.l0(), i12);
                }
                aVar2.h(m0Var5, j3.i(m0Var), Math.max(c11, j3.h(m0Var3) / 2), 0.0f);
            }
            aVar2.f(this.f12804i, 0L, 0.0f);
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f12807b = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.O(num.intValue()));
        }
    }

    static final class e extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f12808b = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
            return Integer.valueOf(interfaceC2552v.T(num.intValue()));
        }
    }

    public G1(@NotNull Function1 function1, boolean z11, float f7, @NotNull C9915y c9915y) {
        this.f12791a = function1;
        this.f12792b = z11;
        this.f12793c = f7;
        this.f12794d = c9915y;
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
            int i16 = F1.f12775c;
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
            int i18 = F1.f12775c;
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
        int intValue = interfaceC2552v3 != null ? ((Number) function2.invoke(interfaceC2552v3, Integer.valueOf(C2656q.c(this.f12793c, i12, i11)))).intValue() : 0;
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
                return F1.d(i13, i14, intValue2, intValue, interfaceC2552v4 != null ? ((Number) function2.invoke(interfaceC2552v4, Integer.valueOf(i12))).intValue() : 0, this.f12793c, j3.g(), abstractC2810k0.g(), this.f12794d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int e(AbstractC2810k0 abstractC2810k0, List list, int i11, Function2 function2) {
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
                return F1.e(intValue4, intValue3, intValue, intValue2, interfaceC2552v4 != null ? ((Number) function2.invoke(interfaceC2552v4, Integer.valueOf(i11))).intValue() : 0, this.f12793c, j3.g(), abstractC2810k0.g(), this.f12794d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // B1.V
    public final int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return d((AbstractC2810k0) interfaceC2553w, list, i11, a.f12795b);
    }

    @Override // B1.V
    public final int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return e((AbstractC2810k0) interfaceC2553w, list, i11, b.f12796b);
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        B1.U u11;
        B1.U u12;
        B1.U u13;
        B1.U u14;
        B1.W z02;
        G1 g12 = this;
        C9915y c9915y = g12.f12794d;
        int Y02 = y11.Y0(c9915y.a());
        long c11 = Z1.b.c(0, 0, 0, 0, 10, j11);
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                u11 = null;
                break;
            }
            u11 = list.get(i11);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u11), "Leading")) {
                break;
            }
            i11++;
        }
        B1.U u15 = u11;
        B1.m0 a02 = u15 != null ? u15.a0(c11) : null;
        int i12 = j3.i(a02);
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                u12 = null;
                break;
            }
            u12 = list.get(i13);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u12), "Trailing")) {
                break;
            }
            i13++;
        }
        B1.U u16 = u12;
        B1.m0 a03 = u16 != null ? u16.a0(Z1.c.l(-i12, 0, 2, c11)) : null;
        int i14 = j3.i(a03) + i12;
        int Y03 = y11.Y0(c9915y.c(y11.getLayoutDirection())) + y11.Y0(c9915y.b(y11.getLayoutDirection()));
        int i15 = -i14;
        int i16 = -Y02;
        long k11 = Z1.c.k(C2656q.c(g12.f12793c, i15 - Y03, -Y03), i16, c11);
        int size3 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                u13 = null;
                break;
            }
            u13 = list.get(i17);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u13), "Label")) {
                break;
            }
            i17++;
        }
        B1.U u17 = u13;
        B1.m0 a04 = u17 != null ? u17.a0(k11) : null;
        g12.f12791a.invoke(C7464j.a(a04 != null ? C7465k.a(a04.u0(), a04.l0()) : 0L));
        long j12 = j11;
        long c12 = Z1.b.c(0, 0, 0, 0, 11, Z1.c.k(i15, i16 - Math.max(j3.h(a04) / 2, y11.Y0(c9915y.d())), j12));
        int size4 = list.size();
        int i18 = 0;
        while (i18 < size4) {
            B1.U u18 = list.get(i18);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u18), "TextField")) {
                B1.m0 a05 = u18.a0(c12);
                long c13 = Z1.b.c(0, 0, 0, 0, 14, c12);
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        u14 = null;
                        break;
                    }
                    u14 = list.get(i19);
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(u14), "Hint")) {
                        break;
                    }
                    i19++;
                }
                B1.U u19 = u14;
                B1.m0 a06 = u19 != null ? u19.a0(c13) : null;
                int e11 = F1.e(j3.i(a02), j3.i(a03), a05.u0(), j3.i(a04), j3.i(a06), g12.f12793c, j12, y11.g(), g12.f12794d);
                int d11 = F1.d(j3.h(a02), j3.h(a03), a05.l0(), j3.h(a04), j3.h(a06), g12.f12793c, j11, y11.g(), g12.f12794d);
                int size6 = list.size();
                int i21 = 0;
                while (i21 < size6) {
                    B1.U u21 = list.get(i21);
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(u21), "border")) {
                        z02 = y11.z0(e11, d11, kotlin.collections.U.c(), new c(d11, e11, a02, a03, a05, a04, a06, u21.a0(Z1.c.a(e11 != Integer.MAX_VALUE ? e11 : 0, e11, d11 != Integer.MAX_VALUE ? d11 : 0, d11)), g12, y11));
                        return z02;
                    }
                    i21++;
                    g12 = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i18++;
            g12 = this;
            j12 = j11;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // B1.V
    public final int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return d((AbstractC2810k0) interfaceC2553w, list, i11, d.f12807b);
    }

    @Override // B1.V
    public final int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        return e((AbstractC2810k0) interfaceC2553w, list, i11, e.f12808b);
    }
}
