package J0;

import B1.InterfaceC2547p;
import S0.C3969l;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k1.C7464j;
import kotlin.jvm.functions.Function1;
import l1.C7807Z;
import l1.C7809a0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import r1.C9156d;

/* loaded from: classes.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.e f13007a = androidx.compose.foundation.layout.a0.n(androidx.compose.ui.e.f40358c0, 24);

    public static final void a(@NotNull AbstractC8972b abstractC8972b, String str, androidx.compose.ui.e eVar, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j12;
        androidx.compose.ui.e eVar2;
        androidx.compose.ui.e eVar3;
        C3969l u11 = interfaceC3967k.u(-1142959010);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(abstractC8972b) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.s(j11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            boolean z11 = (((i12 & 7168) ^ 3072) > 2048 && u11.s(j11)) || (i12 & 3072) == 2048;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                j12 = C7807Z.f72259m;
                C11 = C7807Z.p(j11, j12) ? null : C7809a0.a.a(5, j11);
                u11.x(C11);
            }
            C7809a0 c7809a0 = (C7809a0) C11;
            if (str != null) {
                u11.o(980462681);
                e.a aVar = androidx.compose.ui.e.f40358c0;
                boolean z12 = (i12 & 112) == 32;
                Object C12 = u11.C();
                if (z12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new S0(str);
                    u11.x(C12);
                }
                eVar2 = I1.o.c(aVar, false, (Function1) C12);
                u11.k();
            } else {
                u11.o(980601995);
                u11.k();
                eVar2 = androidx.compose.ui.e.f40358c0;
            }
            int i13 = C5236c1.f40825b;
            if (!C7464j.c(abstractC8972b.getF40457d(), 9205357640488583168L)) {
                long f40457d = abstractC8972b.getF40457d();
                if (!Float.isInfinite(C7464j.f(f40457d)) || !Float.isInfinite(C7464j.d(f40457d))) {
                    eVar3 = androidx.compose.ui.e.f40358c0;
                    C5185h.a(androidx.compose.ui.draw.e.a(eVar.l0(eVar3), abstractC8972b, null, InterfaceC2547p.a.d(), 0.0f, c7809a0, 22).l0(eVar2), u11, 0);
                }
            }
            eVar3 = f13007a;
            C5185h.a(androidx.compose.ui.draw.e.a(eVar.l0(eVar3), abstractC8972b, null, InterfaceC2547p.a.d(), 0.0f, c7809a0, 22).l0(eVar2), u11, 0);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new R0(abstractC8972b, str, eVar, j11, i11));
        }
    }

    public static final void b(@NotNull C9156d c9156d, String str, androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 4) != 0) {
            eVar = androidx.compose.ui.e.f40358c0;
        }
        a(r1.o.b(c9156d, interfaceC3967k), str, eVar, C7807Z.o(((Number) interfaceC3967k.m(C3359x.a())).floatValue(), ((C7807Z) interfaceC3967k.m(C3363y.a())).w()), interfaceC3967k, 56);
    }
}
