package W20;

import B1.V;
import D1.InterfaceC2801g;
import Fr.g;
import J0.T0;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6981a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

/* loaded from: classes3.dex */
public final class e {
    public static final void a(@NotNull AbstractC8972b icon, long j11, AbstractC7799Q abstractC7799Q, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(icon, "icon");
        C3969l u11 = interfaceC3967k.u(-149115967);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(icon) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(abstractC7799Q) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.q(Float.NaN) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(null) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(eVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.n(eVar2) ? 1048576 : 524288;
        }
        int i13 = i12 | 12582912;
        if ((4793491 & i13) == 4793490 && u11.b()) {
            u11.j();
        } else {
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, eVar);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            u11.o(2069222012);
            u11.k();
            u11.o(2069227681);
            androidx.compose.ui.e a12 = C6981a.a(a0.n(eVar2, Float.NaN), 1.0f);
            if (abstractC7799Q != null) {
                e.a aVar = androidx.compose.ui.e.f40358c0;
                u11.o(-143775734);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = a.f33217b;
                    u11.x(C11);
                }
                u11.k();
                androidx.compose.ui.e a13 = androidx.compose.ui.graphics.a.a(aVar, (Function1) C11);
                u11.o(-143772505);
                boolean z11 = (i13 & 896) == 256;
                Object C12 = u11.C();
                if (z11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new c(abstractC7799Q);
                    u11.x(C12);
                }
                u11.k();
                a12 = a12.l0(androidx.compose.ui.draw.c.c(a13, (Function1) C12));
            }
            u11.k();
            T0.a(icon, null, a12, abstractC7799Q != null ? C7807Z.f72259m : j11, u11, (i13 & 14) | 48);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(icon, j11, abstractC7799Q, eVar, eVar2, i11));
        }
    }
}
