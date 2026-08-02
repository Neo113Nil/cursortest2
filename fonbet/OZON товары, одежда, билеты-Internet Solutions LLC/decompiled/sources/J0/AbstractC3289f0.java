package J0;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC3289f0 {
    public final void a(boolean z11, @NotNull Function0 function0, e.a aVar, n0.d0 d0Var, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e.a aVar2;
        int i13;
        n0.d0 b11;
        long j11;
        n0.d0 d0Var2;
        e.a aVar3;
        C3969l u11 = interfaceC3967k.u(63962088);
        if ((i11 & 6) == 0) {
            i12 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function0) ? 32 : 16;
        }
        int i14 = i12 | 384;
        if ((i11 & 3072) == 0) {
            i14 = i12 | 1408;
        }
        if ((i11 & 24576) == 0) {
            i14 |= u11.F(c4912a) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i14 |= u11.n(this) ? 131072 : 65536;
        }
        if ((74899 & i14) == 74898 && u11.b()) {
            u11.j();
            aVar3 = aVar;
            d0Var2 = d0Var;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                aVar2 = androidx.compose.ui.e.f40358c0;
                i13 = i14 & (-7169);
                b11 = androidx.compose.foundation.z.b(u11);
            } else {
                u11.j();
                i13 = i14 & (-7169);
                aVar2 = aVar;
                b11 = d0Var;
            }
            u11.j0();
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new m0.Y(Boolean.FALSE);
                u11.x(C11);
            }
            m0.Y y11 = (m0.Y) C11;
            y11.i(Boolean.valueOf(z11));
            if (((Boolean) y11.a()).booleanValue() || ((Boolean) y11.b()).booleanValue()) {
                u11.o(-667706424);
                Object C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    j11 = l1.N0.f72232b;
                    C12 = S0.n1.f(l1.N0.b(j11), S0.D1.f25195a);
                    u11.x(C12);
                }
                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C12;
                Z1.d dVar = (Z1.d) u11.m(androidx.compose.ui.platform.K0.e());
                Object C13 = u11.C();
                if (C13 == InterfaceC3967k.a.a()) {
                    C13 = new C3284e0(interfaceC3978p0);
                    u11.x(C13);
                }
                N0.o.a(function0, new Y(dVar, (Function2) C13), a1.c.c(1001349006, new C3274c0(y11, interfaceC3978p0, b11, this, aVar2, c4912a), u11), u11, ((i13 >> 3) & 14) | 384);
                u11.k();
            } else {
                u11.o(-666809811);
                u11.k();
            }
            d0Var2 = b11;
            aVar3 = aVar2;
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3279d0(this, z11, function0, aVar3, d0Var2, c4912a, i11));
        }
    }

    @NotNull
    public abstract androidx.compose.ui.e b(@NotNull e.a aVar);
}
