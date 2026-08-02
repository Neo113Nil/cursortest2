package J0;

import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f12917a = 56;

    /* renamed from: b, reason: collision with root package name */
    private static final float f12918b = 48;

    /* renamed from: c, reason: collision with root package name */
    private static final float f12919c = 20;

    public static final void a(@NotNull Function0 function0, e.a aVar, A0.a aVar2, long j11, long j12, D0 d02, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e.a aVar3;
        D0 d03;
        A0.a aVar4;
        long j13;
        long j14;
        e.a aVar5;
        C4912a c4912a = W1.b.f33190a;
        C3969l u11 = interfaceC3967k.u(-1555720195);
        int i13 = i11 | (u11.F(function0) ? 32 : 16) | 38366592;
        if ((38347923 & i13) == 38347922 && u11.b()) {
            u11.j();
            aVar5 = aVar;
            aVar4 = aVar2;
            j13 = j11;
            j14 = j12;
            d03 = d02;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                e.a aVar6 = androidx.compose.ui.e.f40358c0;
                A0.a copy = ((C3286e2) u11.m(C3291f2.a())).c().copy(A0.c.a());
                long j15 = ((C3339s) u11.m(C3343t.d())).j();
                long b11 = C3343t.b(j15, u11);
                float f7 = 6;
                float f11 = 12;
                float f12 = 8;
                float f13 = 8;
                boolean q11 = u11.q(f7) | u11.q(f11) | u11.q(f12) | u11.q(f13);
                Object C11 = u11.C();
                if (q11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new H(f7, f11, f12, f13);
                    u11.x(C11);
                }
                i12 = i13 & (-268369921);
                aVar3 = aVar6;
                d03 = (H) C11;
                aVar4 = copy;
                j13 = j15;
                j14 = b11;
            } else {
                u11.j();
                aVar4 = aVar2;
                j13 = j11;
                j14 = j12;
                d03 = d02;
                i12 = i13 & (-268369921);
                aVar3 = aVar;
            }
            u11.j0();
            float f14 = f12918b;
            b(function0, androidx.compose.foundation.layout.a0.q(aVar3, f14, f14, 0.0f, 12), aVar4, j13, j14, d03, a1.c.c(1418981691, new H0(2), u11), u11, 12583296 | ((i12 >> 3) & 14));
            aVar5 = aVar3;
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new I0(function0, aVar5, aVar4, j13, j14, d03, i11));
        }
    }

    public static final void b(@NotNull Function0 function0, androidx.compose.ui.e eVar, A0.a aVar, long j11, long j12, D0 d02, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        Function0 function02;
        int i12;
        A0.a aVar2;
        long j13;
        C3969l u11 = interfaceC3967k.u(1028985328);
        if ((i11 & 6) == 0) {
            function02 = function0;
            i12 = (u11.F(function02) ? 4 : 2) | i11;
        } else {
            function02 = function0;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(null) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            aVar2 = aVar;
            i12 |= u11.n(aVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            aVar2 = aVar;
        }
        if ((i11 & 24576) == 0) {
            j13 = j11;
            i12 |= u11.s(j13) ? 16384 : 8192;
        } else {
            j13 = j11;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.s(j12) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.n(d02) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(c4912a) ? 8388608 : 4194304;
        }
        if ((4793491 & i12) == 4793490 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            u11.o(-1991754265);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = t0.p.a();
                u11.x(C11);
            }
            t0.q qVar = (t0.q) C11;
            u11.k();
            Function0 function03 = function02;
            R2.b(function03, I1.o.c(eVar, false, J0.f12871b), false, aVar2, j13, j12, ((Z1.h) d02.a(qVar, u11, (i12 >> 15) & 112).getValue()).d(), qVar, a1.c.c(1972871863, new M0(j12, c4912a), u11), u11, (i12 & 7168) | (i12 & 14) | 805306368 | (57344 & i12) | (i12 & 458752), 68);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new N0(function0, eVar, aVar, j11, j12, d02, c4912a, i11));
        }
    }
}
