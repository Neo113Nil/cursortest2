package X20;

import A0.g;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import J0.u3;
import K1.T;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import V1.h;
import V1.r;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {
    public static final void a(e eVar, boolean z11, C7807Z c7807z, AbstractC7799Q abstractC7799Q, String str, T t2, r rVar, @NotNull e.a backgroundImageModifier, @NotNull e.a paranjaModifier, @NotNull e.a graphicModifier, @NotNull e.a labelModifier, g gVar, long j11, long j12, @NotNull AbstractC7799Q borderBrush, float f7, float f11, float f12, float f13, @NotNull InterfaceC2547p contentScale, AbstractC7799Q abstractC7799Q2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z12;
        C7807Z c7807z2;
        AbstractC7799Q abstractC7799Q3;
        Intrinsics.checkNotNullParameter(backgroundImageModifier, "backgroundImageModifier");
        Intrinsics.checkNotNullParameter(paranjaModifier, "paranjaModifier");
        Intrinsics.checkNotNullParameter(graphicModifier, "graphicModifier");
        Intrinsics.checkNotNullParameter(labelModifier, "labelModifier");
        Intrinsics.checkNotNullParameter(borderBrush, "borderBrush");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        C3969l u11 = interfaceC3967k.u(1953086758);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            z12 = z11;
            i12 |= u11.p(z12) ? 32 : 16;
        } else {
            z12 = z11;
        }
        int i13 = i11 & 384;
        int i14 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i13 == 0) {
            i12 |= u11.n(null) ? 256 : 128;
        }
        int i15 = i11 & 3072;
        int i16 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i15 == 0) {
            c7807z2 = c7807z;
            i12 |= u11.n(c7807z2) ? 2048 : 1024;
        } else {
            c7807z2 = c7807z;
        }
        if ((i11 & 24576) == 0) {
            abstractC7799Q3 = abstractC7799Q;
            i12 |= u11.n(abstractC7799Q3) ? 16384 : 8192;
        } else {
            abstractC7799Q3 = abstractC7799Q;
        }
        if ((i11 & 196608) == 0) {
            i12 |= u11.n(str) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= u11.n(t2) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= u11.n(rVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i12 |= u11.n(backgroundImageModifier) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i12 |= u11.n(paranjaModifier) ? 536870912 : 268435456;
        }
        int i17 = 54 | (u11.n(null) ? 256 : 128) | (u11.n(gVar) ? 2048 : 1024) | (u11.p(false) ? 16384 : 8192) | (u11.s(j11) ? 131072 : 65536) | (u11.p(false) ? 1048576 : 524288) | (u11.s(j12) ? 8388608 : 4194304) | (u11.n(borderBrush) ? 67108864 : 33554432) | (u11.q(f7) ? 536870912 : 268435456);
        int i18 = (u11.q(f11) ? 4 : 2) | (u11.q(f12) ? 32 : 16);
        if (u11.q(f13)) {
            i14 = 256;
        }
        int i19 = i18 | i14;
        if (u11.n(contentScale)) {
            i16 = 2048;
        }
        int i21 = i19 | i16 | (u11.n(abstractC7799Q2) ? 16384 : 8192);
        if ((i12 & 306783379) == 306783378 && (i17 & 306783379) == 306783378 && (i21 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else if (gVar != null) {
            u11.o(-1965902847);
            u11.o(-1964813259);
            int i22 = i17 >> 3;
            b(eVar, z12, c7807z2, abstractC7799Q3, str, t2, rVar, backgroundImageModifier, paranjaModifier, graphicModifier, labelModifier, gVar, j11, j12, abstractC7799Q2, f7, f11, f12, contentScale, u11, i12 & 2147483646, (i17 & 524286) | (3670016 & i22) | ((i21 << 9) & 29360128) | (i22 & 234881024) | (1879048192 & (i21 << 27)), ((i21 >> 3) & 14) | ((i21 >> 6) & 112));
            u11 = u11;
            u11.k();
            u11.k();
        } else {
            u11.o(-1963820205);
            c(eVar, z11, c7807z, abstractC7799Q, str, t2, graphicModifier, labelModifier, f11, u11, (4194302 & i12) | 113246208 | ((i21 << 27) & 1879048192));
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(eVar, z11, c7807z, abstractC7799Q, str, t2, rVar, backgroundImageModifier, paranjaModifier, graphicModifier, labelModifier, gVar, j11, j12, borderBrush, f7, f11, f12, f13, contentScale, abstractC7799Q2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(e eVar, boolean z11, C7807Z c7807z, AbstractC7799Q abstractC7799Q, String str, T t2, r rVar, e.a aVar, e.a aVar2, e.a aVar3, e.a aVar4, g gVar, long j11, long j12, AbstractC7799Q abstractC7799Q2, float f7, float f11, float f12, InterfaceC2547p interfaceC2547p, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(1281997658);
        if ((i11 & 6) == 0) {
            i14 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= u11.p(z11) ? 32 : 16;
        }
        int i17 = i11 & 384;
        int i18 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i17 == 0) {
            i14 |= u11.n(null) ? 256 : 128;
        }
        int i19 = i11 & 3072;
        int i21 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i19 == 0) {
            i14 |= u11.n(c7807z) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= u11.n(abstractC7799Q) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i14 |= u11.n(str) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= u11.n(t2) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= u11.n(rVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i14 |= u11.n(aVar) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i14 |= u11.n(aVar2) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i15 = i12 | (u11.n(aVar3) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= u11.n(aVar4) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            if (u11.n(null)) {
                i18 = 256;
            }
            i15 |= i18;
        }
        if ((i12 & 3072) == 0) {
            if (u11.n(gVar)) {
                i21 = 2048;
            }
            i15 |= i21;
        }
        if ((i12 & 24576) == 0) {
            i15 |= u11.p(false) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i15 |= u11.s(j11) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i15 |= u11.s(j12) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i15 |= u11.n(abstractC7799Q2) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i15 |= u11.q(f7) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i15 |= u11.q(f11) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i16 = i13 | (u11.q(f12) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= u11.n(interfaceC2547p) ? 32 : 16;
        }
        if ((i14 & 306783379) == 306783378 && (i15 & 306783379) == 306783378 && (i16 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e n11 = a0.n(abstractC7799Q2 != null ? androidx.compose.foundation.e.a(eVar, abstractC7799Q2, gVar, 4) : androidx.compose.foundation.e.b(eVar, j12, gVar), f7);
            V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f14 = androidx.compose.ui.c.f(u11, n11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f15 = E.f(u11, f13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            u11.o(399727044);
            u11.k();
            u11.o(399738263);
            u11.k();
            if (z11) {
                u11.o(-492753566);
                e.a aVar5 = e.f40358c0;
                e h11 = androidx.compose.foundation.layout.T.h(c5187j.a(aVar4, InterfaceC6250b.a.e()), f12, 0.0f, 2);
                Intrinsics.f(str);
                Intrinsics.f(t2);
                u3.b(str, h11, c7807z.w(), 0L, null, 0L, h.a(3), 0L, 1, false, 1, 0, null, t2, u11, 0, 3072, 54776);
                c3969l = u11;
                c3969l.k();
                Unit unit = Unit.f71690a;
            } else {
                c3969l = u11;
                c3969l.o(-492297184);
                c3969l.k();
            }
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new b(eVar, z11, c7807z, abstractC7799Q, str, t2, rVar, aVar, aVar2, aVar3, aVar4, gVar, j11, j12, abstractC7799Q2, f7, f11, f12, interfaceC2547p, i11, i12, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(e eVar, boolean z11, C7807Z c7807z, AbstractC7799Q abstractC7799Q, String str, T t2, e.a aVar, e.a aVar2, float f7, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C7807Z c7807z2;
        AbstractC7799Q abstractC7799Q2;
        T t11;
        e.a aVar3;
        e.a aVar4;
        float f11;
        C3969l u11 = interfaceC3967k.u(180650605);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(null) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            c7807z2 = c7807z;
            i12 |= u11.n(c7807z2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            c7807z2 = c7807z;
        }
        if ((i11 & 24576) == 0) {
            abstractC7799Q2 = abstractC7799Q;
            i12 |= u11.n(abstractC7799Q2) ? 16384 : 8192;
        } else {
            abstractC7799Q2 = abstractC7799Q;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(str) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            t11 = t2;
            i12 |= u11.n(t11) ? 1048576 : 524288;
        } else {
            t11 = t2;
        }
        if ((12582912 & i11) == 0) {
            aVar3 = aVar;
            i12 |= u11.n(aVar3) ? 8388608 : 4194304;
        } else {
            aVar3 = aVar;
        }
        if ((100663296 & i11) == 0) {
            aVar4 = aVar2;
            i12 |= u11.n(aVar4) ? 67108864 : 33554432;
        } else {
            aVar4 = aVar2;
        }
        if ((805306368 & i11) == 0) {
            f11 = f7;
            i12 |= u11.q(f11) ? 536870912 : 268435456;
        } else {
            f11 = f7;
        }
        if ((i12 & 306783379) == 306783378 && u11.b()) {
            u11.j();
        } else {
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f13 = androidx.compose.ui.c.f(u11, eVar);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f14);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            if (z11) {
                u11.o(2035688991);
                e.a aVar5 = e.f40358c0;
                e n11 = a0.n(aVar2, f7);
                Intrinsics.f(str);
                Intrinsics.f(t11);
                u3.b(str, n11, c7807z2.w(), 0L, null, 0L, h.a(3), 0L, 2, false, 1, 0, null, t11, u11, 0, 3120, 54776);
                u11.k();
            } else {
                u11.o(2036091216);
                u11.k();
            }
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(eVar, z11, c7807z2, abstractC7799Q2, str, t2, aVar3, aVar4, f11, i11));
        }
    }
}
