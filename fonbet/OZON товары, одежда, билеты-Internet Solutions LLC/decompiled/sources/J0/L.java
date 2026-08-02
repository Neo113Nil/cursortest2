package J0;

import S0.C3969l;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import l1.C7807Z;

/* loaded from: classes8.dex */
public final class L {
    public static final void a(float f7, long j11, float f11, androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        long o11;
        androidx.compose.ui.e eVar2;
        float f12;
        float f13;
        androidx.compose.ui.e b11;
        androidx.compose.ui.e eVar3;
        long j12;
        float f14;
        C3969l u11 = interfaceC3967k.u(-1249392198);
        if (((i11 | 3478) & 1171) == 1170 && u11.b()) {
            u11.j();
            j12 = j11;
            f14 = f11;
            eVar3 = eVar;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                e.a aVar = androidx.compose.ui.e.f40358c0;
                o11 = C7807Z.o(0.12f, ((C3339s) u11.m(C3343t.d())).g());
                eVar2 = aVar;
                f7 = 1;
                f12 = 0;
            } else {
                u11.j();
                o11 = j11;
                f12 = f11;
                eVar2 = eVar;
            }
            u11.j0();
            androidx.compose.ui.e j13 = f12 == 0.0f ? androidx.compose.ui.e.f40358c0 : androidx.compose.foundation.layout.T.j(androidx.compose.ui.e.f40358c0, f12, 0.0f, 0.0f, 0.0f, 14);
            if (Z1.h.b(f7, 0.0f)) {
                u11.o(-129374855);
                f13 = 1.0f / ((Z1.d) u11.m(androidx.compose.ui.platform.K0.e())).g();
                u11.k();
            } else {
                u11.o(-129316234);
                u11.k();
                f13 = f7;
            }
            b11 = androidx.compose.foundation.e.b(androidx.compose.foundation.layout.a0.f(androidx.compose.foundation.layout.a0.e(eVar2.l0(j13), 1.0f), f13), o11, l1.y0.a());
            C5185h.a(b11, u11, 0);
            eVar3 = eVar2;
            j12 = o11;
            f14 = f12;
        }
        float f15 = f7;
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new K(f15, j12, f14, eVar3, i11));
        }
    }
}
