package J0;

import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3265a1 {
    public static final void a(C3339s c3339s, D3 d32, C3286e2 c3286e2, @NotNull Function2 function2, InterfaceC3967k interfaceC3967k, int i11) {
        D3 d33;
        C3286e2 c3286e22;
        C3969l u11 = interfaceC3967k.u(-891417079);
        int i12 = (u11.n(c3339s) ? 4 : 2) | i11 | 144;
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            d33 = d32;
            c3286e22 = c3286e2;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                d33 = (D3) u11.m(E3.c());
                c3286e22 = (C3286e2) u11.m(C3291f2.a());
            } else {
                u11.j();
                d33 = d32;
                c3286e22 = c3286e2;
            }
            u11.j0();
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C3339s c3339s2 = new C3339s(c3339s.h(), c3339s.i(), c3339s.j(), c3339s.k(), c3339s.a(), c3339s.l(), c3339s.b(), c3339s.e(), c3339s.f(), c3339s.c(), c3339s.g(), c3339s.d(), c3339s.m());
                u11.x(c3339s2);
                C11 = c3339s2;
            }
            C3339s c3339s3 = (C3339s) C11;
            int i13 = C3343t.f13401b;
            c3339s3.v(c3339s.h());
            c3339s3.w(c3339s.i());
            c3339s3.x(c3339s.j());
            c3339s3.y(c3339s.k());
            c3339s3.n(c3339s.a());
            c3339s3.z(c3339s.l());
            c3339s3.o(c3339s.b());
            c3339s3.s(c3339s.e());
            c3339s3.t(c3339s.f());
            c3339s3.q(c3339s.c());
            c3339s3.u(c3339s.g());
            c3339s3.r(c3339s.d());
            c3339s3.p(c3339s.m());
            C3996z.b(new S0.H0[]{C3343t.d().c(c3339s3), C3359x.a().c(Float.valueOf(Bl0.k0.q(u11))), androidx.compose.foundation.t.a().c(androidx.compose.material.Q.g(false, 0.0f, u11, 0, 7)), O0.u.c().c(C3347u.f13414a), C3291f2.a().c(c3286e22), I0.k1.b().c(W0.b(c3339s3, u11)), E3.c().c(d33)}, a1.c.c(-1740102967, new Y0(d33, function2), u11), u11, 56);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Z0(c3339s, d33, c3286e22, function2, i11));
        }
    }
}
