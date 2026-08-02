package J0;

import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k1.C7464j;
import k1.C7465k;
import kd.InterfaceC7663b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import m0.C8004n;
import m0.C8025y;
import m0.O;
import m0.V;
import n0.C8392m;
import n1.C8416i;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class I1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f12827a = H1.a();

    /* renamed from: b, reason: collision with root package name */
    private static final float f12828b = 240;

    /* renamed from: c, reason: collision with root package name */
    private static final float f12829c = 40;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C8025y f12830d;

    static final class a extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f12831b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8416i f12832c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f12833d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12834e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ O.a f12835f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ O.a f12836g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ O.a f12837h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ O.a f12838i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f7, long j11, long j12, O.a aVar, O.a aVar2, O.a aVar3, O.a aVar4, C8416i c8416i) {
            super(1);
            this.f12831b = j11;
            this.f12832c = c8416i;
            this.f12833d = f7;
            this.f12834e = j12;
            this.f12835f = aVar;
            this.f12836g = aVar2;
            this.f12837h = aVar3;
            this.f12838i = aVar4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC8412e interfaceC8412e) {
            InterfaceC8412e interfaceC8412e2 = interfaceC8412e;
            long j11 = this.f12831b;
            C8416i c8416i = this.f12832c;
            I1.c(interfaceC8412e2, j11, c8416i);
            float floatValue = ((Number) this.f12836g.getValue()).floatValue();
            O.a aVar = this.f12837h;
            I1.d(interfaceC8412e2, ((Number) this.f12838i.getValue()).floatValue() + (((((Number) this.f12835f.getValue()).intValue() * 216.0f) % 360.0f) - 90.0f) + ((Number) aVar.getValue()).floatValue(), this.f12833d, Math.abs(floatValue - ((Number) aVar.getValue()).floatValue()), this.f12834e, c8416i);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f12839b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f12840c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f12841d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12842e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f12843f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f12844g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f12845h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, long j11, float f7, long j12, int i11, int i12, int i13) {
            super(2);
            this.f12839b = eVar;
            this.f12840c = j11;
            this.f12841d = f7;
            this.f12842e = j12;
            this.f12843f = i11;
            this.f12844g = i12;
            this.f12845h = i13;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f12844g | 1);
            float f7 = this.f12841d;
            I1.a(this.f12839b, this.f12840c, f7, this.f12842e, this.f12843f, interfaceC3967k, e11, this.f12845h);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<V.b<Float>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f12846b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(V.b<Float> bVar) {
            V.b<Float> bVar2 = bVar;
            bVar2.e(1332);
            bVar2.f(0, Float.valueOf(0.0f)).c(I1.f12830d);
            bVar2.f(666, Float.valueOf(290.0f));
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<V.b<Float>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f12847b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(V.b<Float> bVar) {
            V.b<Float> bVar2 = bVar;
            bVar2.e(1332);
            bVar2.f(666, Float.valueOf(0.0f)).c(I1.f12830d);
            bVar2.f(bVar2.b(), Float.valueOf(290.0f));
            return Unit.f71690a;
        }
    }

    static {
        new C8025y(0.2f, 0.0f, 0.8f, 1.0f);
        new C8025y(0.4f, 0.0f, 1.0f, 1.0f);
        new C8025y(0.0f, 0.0f, 0.65f, 1.0f);
        new C8025y(0.1f, 0.0f, 0.45f, 1.0f);
        f12830d = new C8025y(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.e eVar, long j11, float f7, long j12, int i11, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        androidx.compose.ui.e eVar2;
        int i14;
        long j13;
        float f11;
        int i15;
        int i16;
        androidx.compose.ui.e eVar3;
        long j14;
        float f12;
        long j15;
        boolean F11;
        Object C11;
        float f13;
        long j16;
        int i17;
        float f14;
        long j17;
        long j18;
        androidx.compose.ui.e eVar4;
        S0.J0 m02;
        int i18;
        C3969l u11 = interfaceC3967k.u(-1119119072);
        int i19 = i13 & 1;
        if (i19 != 0) {
            i14 = i12 | 6;
            eVar2 = eVar;
        } else if ((i12 & 6) == 0) {
            eVar2 = eVar;
            i14 = (u11.n(eVar2) ? 4 : 2) | i12;
        } else {
            eVar2 = eVar;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            j13 = j11;
            i14 |= ((i13 & 2) == 0 && u11.s(j13)) ? 32 : 16;
        } else {
            j13 = j11;
        }
        int i21 = i13 & 4;
        if (i21 != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            f11 = f7;
            i14 |= u11.q(f11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i15 = i14 | 3072;
            if ((i12 & 24576) != 0) {
                if ((i13 & 16) == 0) {
                    i16 = i11;
                    if (u11.r(i16)) {
                        i18 = 16384;
                        i15 |= i18;
                    }
                } else {
                    i16 = i11;
                }
                i18 = 8192;
                i15 |= i18;
            } else {
                i16 = i11;
            }
            if ((i15 & 9363) == 9362 || !u11.b()) {
                u11.Q0();
                if ((i12 & 1) != 0 || u11.w0()) {
                    eVar3 = i19 == 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                    if ((i13 & 2) != 0) {
                        j13 = ((C3339s) u11.m(C3343t.d())).h();
                        i15 &= -113;
                    }
                    if (i21 != 0) {
                        f11 = H1.a();
                    }
                    j14 = C7807Z.f72258l;
                    if ((i13 & 16) != 0) {
                        i15 &= -57345;
                        i16 = 2;
                    }
                    f12 = f11;
                    j15 = j14;
                } else {
                    u11.j();
                    if ((i13 & 2) != 0) {
                        i15 &= -113;
                    }
                    if ((i13 & 16) != 0) {
                        i15 &= -57345;
                    }
                    j15 = j12;
                    eVar3 = eVar2;
                    f12 = f11;
                }
                u11.j0();
                int i22 = i16;
                C8416i c8416i = new C8416i(((Z1.d) u11.m(androidx.compose.ui.platform.K0.e())).v1(f12), 0.0f, i22, 0, null, 26);
                m0.O c11 = m0.T.c(null, u11, 1);
                androidx.compose.ui.e eVar5 = eVar3;
                O.a b11 = m0.T.b(c11, 0, 5, m0.W0.c(), C8004n.a(C8004n.d(6660, 0, m0.G.b(), 2), null, 6), null, u11, 33208, 16);
                O.a a11 = m0.T.a(c11, 0.0f, 286.0f, C8004n.a(C8004n.d(1332, 0, m0.G.b(), 2), null, 6), null, u11, 4536, 8);
                O.a a12 = m0.T.a(c11, 0.0f, 290.0f, C8004n.a(C8004n.b(c.f12846b), null, 6), null, u11, 4536, 8);
                O.a a13 = m0.T.a(c11, 0.0f, 290.0f, C8004n.a(C8004n.b(d.f12847b), null, 6), null, u11, 4536, 8);
                androidx.compose.ui.e n11 = androidx.compose.foundation.layout.a0.n(n0.c0.a(eVar5), f12829c);
                F11 = ((i15 & 896) != 256) | ((i15 & 7168) != 2048) | u11.F(c8416i) | u11.n(b11) | u11.n(a12) | u11.n(a13) | u11.n(a11) | ((((i15 & 112) ^ 48) <= 32 && u11.s(j13)) || (i15 & 48) == 32);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    f13 = f12;
                    j16 = j13;
                    C11 = new a(f13, j15, j16, b11, a12, a13, a11, c8416i);
                    u11.x(C11);
                } else {
                    f13 = f12;
                    j16 = j13;
                }
                C8392m.a(n11, (Function1) C11, u11, 0);
                i17 = i22;
                f14 = f13;
                j17 = j15;
                j18 = j16;
                eVar4 = eVar5;
            } else {
                u11.j();
                eVar4 = eVar2;
                j18 = j13;
                f14 = f11;
                i17 = i16;
                j17 = j12;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new b(eVar4, j18, f14, j17, i17, i12, i13));
                return;
            }
            return;
        }
        f11 = f7;
        i15 = i14 | 3072;
        if ((i12 & 24576) != 0) {
        }
        if ((i15 & 9363) == 9362) {
        }
        u11.Q0();
        if ((i12 & 1) != 0) {
        }
        if (i19 == 0) {
        }
        if ((i13 & 2) != 0) {
        }
        if (i21 != 0) {
        }
        j14 = C7807Z.f72258l;
        if ((i13 & 16) != 0) {
        }
        f12 = f11;
        j15 = j14;
        u11.j0();
        int i222 = i16;
        C8416i c8416i2 = new C8416i(((Z1.d) u11.m(androidx.compose.ui.platform.K0.e())).v1(f12), 0.0f, i222, 0, null, 26);
        m0.O c112 = m0.T.c(null, u11, 1);
        androidx.compose.ui.e eVar52 = eVar3;
        O.a b112 = m0.T.b(c112, 0, 5, m0.W0.c(), C8004n.a(C8004n.d(6660, 0, m0.G.b(), 2), null, 6), null, u11, 33208, 16);
        O.a a112 = m0.T.a(c112, 0.0f, 286.0f, C8004n.a(C8004n.d(1332, 0, m0.G.b(), 2), null, 6), null, u11, 4536, 8);
        O.a a122 = m0.T.a(c112, 0.0f, 290.0f, C8004n.a(C8004n.b(c.f12846b), null, 6), null, u11, 4536, 8);
        O.a a132 = m0.T.a(c112, 0.0f, 290.0f, C8004n.a(C8004n.b(d.f12847b), null, 6), null, u11, 4536, 8);
        androidx.compose.ui.e n112 = androidx.compose.foundation.layout.a0.n(n0.c0.a(eVar52), f12829c);
        F11 = ((i15 & 896) != 256) | ((i15 & 7168) != 2048) | u11.F(c8416i2) | u11.n(b112) | u11.n(a122) | u11.n(a132) | u11.n(a112) | ((((i15 & 112) ^ 48) <= 32 && u11.s(j13)) || (i15 & 48) == 32);
        C11 = u11.C();
        if (F11) {
        }
        f13 = f12;
        j16 = j13;
        C11 = new a(f13, j15, j16, b112, a122, a132, a112, c8416i2);
        u11.x(C11);
        C8392m.a(n112, (Function1) C11, u11, 0);
        i17 = i222;
        f14 = f13;
        j17 = j15;
        j18 = j16;
        eVar4 = eVar52;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    public static final void b(float f7, androidx.compose.ui.e eVar, long j11, long j12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        C3969l u11 = interfaceC3967k.u(-531984864);
        int i13 = i12 | (u11.q(f7) ? 4 : 2) | (u11.n(eVar) ? 32 : 16) | (u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.s(j12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | (u11.r(i11) ? 16384 : 8192);
        if ((i13 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i12 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            float f11 = f7 < 0.0f ? 0.0f : f7;
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            float f12 = 10;
            boolean z11 = true;
            androidx.compose.ui.e o11 = androidx.compose.foundation.layout.a0.o(n0.c0.b(androidx.compose.foundation.layout.T.h(I1.o.c(androidx.compose.ui.layout.b.a(new M1(f12), eVar), true, N1.f12909b), 0.0f, f12, 1), f11), f12828b, f12827a);
            boolean q11 = ((((i13 & 7168) ^ 3072) > 2048 && u11.s(j12)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) > 16384 && u11.r(i11)) || (i13 & 24576) == 16384) | u11.q(f11);
            if ((((i13 & 896) ^ 384) <= 256 || !u11.s(j11)) && (i13 & 384) != 256) {
                z11 = false;
            }
            boolean z12 = q11 | z11;
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                J1 j13 = new J1(j12, i11, f11, j11);
                u11.x(j13);
                C11 = j13;
            }
            C8392m.a(o11, (Function1) C11, u11, 0);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new K1(f7, eVar, j11, j12, i11, i12));
        }
    }

    public static final void c(InterfaceC8412e interfaceC8412e, long j11, C8416i c8416i) {
        h(interfaceC8412e, 0.0f, 360.0f, j11, c8416i);
    }

    public static final void d(InterfaceC8412e interfaceC8412e, float f7, float f11, float f12, long j11, C8416i c8416i) {
        float f13;
        if (c8416i.a() == 0) {
            f13 = 0.0f;
        } else {
            f13 = ((f11 / (f12829c / 2)) * 57.29578f) / 2.0f;
        }
        h(interfaceC8412e, f7 + f13, Math.max(f12, 0.1f), j11, c8416i);
    }

    public static final void f(InterfaceC8412e interfaceC8412e, long j11, float f7, int i11) {
        i(interfaceC8412e, 1.0f, j11, f7, i11);
    }

    private static final void h(InterfaceC8412e interfaceC8412e, float f7, float f11, long j11, C8416i c8416i) {
        float f12 = 2;
        float e11 = c8416i.e() / f12;
        float f13 = C7464j.f(interfaceC8412e.i()) - (f12 * e11);
        interfaceC8412e.E1(j11, f7, f11, P9.a.a(e11, e11), C7465k.a(f13, f13), c8416i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC8412e interfaceC8412e, float f7, long j11, float f11, int i11) {
        float f12 = C7464j.f(interfaceC8412e.i());
        float d11 = C7464j.d(interfaceC8412e.i());
        float f13 = 2;
        float f14 = d11 / f13;
        boolean z11 = interfaceC8412e.getLayoutDirection() == Z1.s.Ltr;
        float f15 = (z11 ? 0.0f : 1.0f - f7) * f12;
        float f16 = (z11 ? f7 : 1.0f) * f12;
        if (i11 == 0 || d11 > f12) {
            interfaceC8412e.U(j11, P9.a.a(f15, f14), P9.a.a(f16, f14), f11, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
            return;
        }
        float f17 = f11 / f13;
        InterfaceC7663b l11 = kotlin.ranges.h.l(f17, f12 - f17);
        float floatValue = ((Number) kotlin.ranges.h.i(Float.valueOf(f15), l11)).floatValue();
        float floatValue2 = ((Number) kotlin.ranges.h.i(Float.valueOf(f16), l11)).floatValue();
        if (Math.abs(f7 - 0.0f) > 0.0f) {
            interfaceC8412e.U(j11, P9.a.a(floatValue, f14), P9.a.a(floatValue2, f14), f11, (r21 & 16) != 0 ? 0 : i11, (r21 & 32) != 0 ? null : null);
        }
    }
}
