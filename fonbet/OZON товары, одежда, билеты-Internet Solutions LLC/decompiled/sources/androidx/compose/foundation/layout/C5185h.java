package androidx.compose.foundation.layout;

import B1.m0;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import e1.InterfaceC6250b;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.foundation.layout.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5185h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final HashMap<InterfaceC6250b, B1.V> f39485a = d(true);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final HashMap<InterfaceC6250b, B1.V> f39486b = d(false);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final B1.V f39487c = b.f39490a;

    /* renamed from: androidx.compose.foundation.layout.h$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f39488b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f39489c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, int i11) {
            super(2);
            this.f39488b = eVar;
            this.f39489c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f39489c | 1);
            C5185h.a(this.f39488b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.h$b */
    static final class b implements B1.V {

        /* renamed from: a, reason: collision with root package name */
        public static final b f39490a = new b();

        /* renamed from: androidx.compose.foundation.layout.h$b$a */
        static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f39491b = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                return Unit.f71690a;
            }
        }

        @Override // B1.V
        @NotNull
        /* renamed from: measure-3p2s80s */
        public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
            B1.W z02;
            z02 = y11.z0(Z1.b.m(j11), Z1.b.l(j11), kotlin.collections.U.c(), a.f39491b);
            return z02;
        }
    }

    public static final void a(@NotNull androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-211209833);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            B1.V v11 = f39487c;
            int I11 = u11.I();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, eVar);
            A0 d11 = u11.d();
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            F1.b(u11, v11, InterfaceC2801g.a.e());
            F1.b(u11, d11, InterfaceC2801g.a.g());
            F1.b(u11, f7, InterfaceC2801g.a.f());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, b11);
            }
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(eVar, i11));
        }
    }

    public static final boolean b(B1.U u11) {
        Object m11 = u11.m();
        C5184g c5184g = m11 instanceof C5184g ? (C5184g) m11 : null;
        if (c5184g != null) {
            return c5184g.J1();
        }
        return false;
    }

    public static final void c(m0.a aVar, m0 m0Var, B1.U u11, Z1.s sVar, int i11, int i12, InterfaceC6250b interfaceC6250b) {
        InterfaceC6250b I12;
        Object m11 = u11.m();
        C5184g c5184g = m11 instanceof C5184g ? (C5184g) m11 : null;
        aVar.f(m0Var, ((c5184g == null || (I12 = c5184g.I1()) == null) ? interfaceC6250b : I12).a(Z1.r.a(m0Var.u0(), m0Var.l0()), Z1.r.a(i11, i12), sVar), 0.0f);
    }

    private static final HashMap<InterfaceC6250b, B1.V> d(boolean z11) {
        HashMap<InterfaceC6250b, B1.V> hashMap = new HashMap<>(9);
        e(hashMap, z11, InterfaceC6250b.a.o());
        e(hashMap, z11, InterfaceC6250b.a.m());
        e(hashMap, z11, InterfaceC6250b.a.n());
        e(hashMap, z11, InterfaceC6250b.a.h());
        e(hashMap, z11, InterfaceC6250b.a.e());
        e(hashMap, z11, InterfaceC6250b.a.f());
        e(hashMap, z11, InterfaceC6250b.a.d());
        e(hashMap, z11, InterfaceC6250b.a.b());
        e(hashMap, z11, InterfaceC6250b.a.c());
        return hashMap;
    }

    private static final void e(HashMap hashMap, boolean z11, e1.d dVar) {
        hashMap.put(dVar, new C5186i(dVar, z11));
    }

    @NotNull
    public static final B1.V f(@NotNull InterfaceC6250b interfaceC6250b, boolean z11) {
        B1.V v11 = (z11 ? f39485a : f39486b).get(interfaceC6250b);
        return v11 == null ? new C5186i(interfaceC6250b, z11) : v11;
    }
}
