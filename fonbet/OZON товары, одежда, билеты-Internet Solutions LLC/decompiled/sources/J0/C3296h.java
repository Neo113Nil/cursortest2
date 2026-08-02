package J0;

import D1.InterfaceC2801g;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;

/* renamed from: J0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3296h {

    /* renamed from: a, reason: collision with root package name */
    private static final float f13228a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f13229b = 8;

    /* renamed from: c, reason: collision with root package name */
    private static final long f13230c = Hj0.T.d(10);

    /* renamed from: d, reason: collision with root package name */
    private static final float f13231d;

    static {
        float f7 = 4;
        f13228a = f7;
        f13231d = f7;
    }

    public static final void a(androidx.compose.ui.e eVar, long j11, long j12, C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        long b11;
        long j13;
        C3969l u11 = interfaceC3967k.u(1133484502);
        if (((i11 | 6 | (u11.s(j11) ? 32 : 16) | UserVerificationMethods.USER_VERIFY_PATTERN) & 1171) == 1170 && u11.b()) {
            u11.j();
            j13 = j12;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                eVar = androidx.compose.ui.e.f40358c0;
                b11 = C3343t.b(j11, u11);
            } else {
                u11.j();
                b11 = j12;
            }
            u11.j0();
            float f7 = c4912a != null ? f13229b : f13228a;
            A0.g b12 = A0.h.b(f7);
            float f11 = f7 * 2;
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.T.h(C6988h.a(androidx.compose.foundation.e.b(androidx.compose.foundation.layout.a0.a(eVar, f11, f11), j11, b12), b12), f13231d, 0.0f, 2);
            androidx.compose.foundation.layout.Y b13 = androidx.compose.foundation.layout.X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, h11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h12);
            }
            S0.F1.b(u11, f12, InterfaceC2801g.a.f());
            if (c4912a != null) {
                u11.o(1448079226);
                C3996z.a(C3363y.a().c(C7807Z.m(b11)), a1.c.c(1784526485, new C3288f(c4912a), u11), u11, 56);
                u11.k();
            } else {
                u11.o(1448429030);
                u11.k();
            }
            u11.f();
            j13 = b11;
        }
        androidx.compose.ui.e eVar2 = eVar;
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3292g(eVar2, j11, j13, c4912a, i11));
        }
    }
}
