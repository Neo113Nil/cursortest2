package P0;

import D1.InterfaceC2801g;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.material3.MinimumInteractiveModifier;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class D {
    public static final void a(@NotNull Function0 function0, androidx.compose.ui.e eVar, boolean z11, B b11, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        androidx.compose.ui.e eVar2;
        int i13;
        B c11;
        boolean z12;
        androidx.compose.ui.e eVar3;
        B b12;
        long j11;
        long j12;
        androidx.compose.ui.e b13;
        C4912a c4912a2;
        androidx.compose.ui.e eVar4;
        B b14;
        C3969l u11 = interfaceC3967k.u(-1142896114);
        int i14 = i11 | (u11.F(function0) ? 4 : 2);
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 = i14 | 48;
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            i13 = i14 | (u11.n(eVar2) ? 32 : 16);
        }
        if (((i13 | 25984) & 74899) == 74898 && u11.b()) {
            u11.j();
            b14 = b11;
            c4912a2 = c4912a;
            eVar4 = eVar2;
            z12 = z11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                androidx.compose.ui.e eVar5 = i15 != 0 ? androidx.compose.ui.e.f40358c0 : eVar2;
                u11.o(-1519621781);
                long w11 = ((C7807Z) u11.m(C3776u.a())).w();
                C3756n c3756n = (C3756n) u11.m(C3759o.d());
                B d11 = c3756n.d();
                if (d11 == null) {
                    j11 = C7807Z.f72258l;
                    j12 = C7807Z.f72258l;
                    B b15 = new B(j11, w11, j12, C7807Z.o(0.38f, w11));
                    c3756n.S(b15);
                    d11 = b15;
                }
                if (C7807Z.p(d11.d(), w11)) {
                    u11.k();
                    c11 = d11;
                } else {
                    c11 = B.c(d11, w11, C7807Z.o(0.38f, w11));
                    u11.k();
                }
                z12 = true;
                eVar3 = eVar5;
                b12 = c11;
            } else {
                u11.j();
                b12 = b11;
                eVar3 = eVar2;
                z12 = z11;
            }
            u11.j0();
            int i16 = H.f20643b;
            b13 = androidx.compose.foundation.e.b(C6988h.a(androidx.compose.foundation.layout.a0.n(eVar3.l0(MinimumInteractiveModifier.f40162a), R0.g.c()), C3764p1.b(R0.g.b(), u11)), b12.a(z12), l1.y0.a());
            androidx.compose.ui.e b16 = androidx.compose.foundation.i.b(b13, null, androidx.compose.material3.d.d(R0.g.c() / 2, u11, 54, 4), z12, null, I1.i.a(0), function0, 8);
            B1.V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            S0.A0 d12 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, b16);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = T7.E.f(u11, f7, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            S0.F1.b(u11, f11, InterfaceC2801g.a.f());
            c4912a2 = c4912a;
            C3996z.a(C3776u.a().c(C7807Z.m(b12.b(z12))), c4912a2, u11, 56);
            u11.f();
            eVar4 = eVar3;
            b14 = b12;
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C(function0, eVar4, z12, b14, c4912a2, i11, i12));
        }
    }
}
