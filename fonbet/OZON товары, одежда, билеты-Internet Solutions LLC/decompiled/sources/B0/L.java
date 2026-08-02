package B0;

import F0.C2990k;
import I0.C3215w0;
import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import q0.C8949d;
import q0.C8960o;

/* loaded from: classes.dex */
public final class L {
    public static final void a(@NotNull C2990k c2990k, boolean z11, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z12;
        C4912a c4912a2;
        C3969l u11 = interfaceC3967k.u(2103477555);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(c2990k) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(c4912a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            z12 = z11;
            c4912a2 = c4912a;
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new C8960o(0);
                u11.x(C11);
            }
            C8960o c8960o = (C8960o) C11;
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new G(c8960o);
                u11.x(C12);
            }
            int i13 = i12 << 9;
            z12 = z11;
            c4912a2 = c4912a;
            C8949d.b(c8960o, (Function0) C12, F0.N.a(c2990k, c8960o), null, z12, c4912a2, u11, (57344 & i13) | 54 | (i13 & 458752), 8);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new H(c2990k, z12, c4912a2, i11));
        }
    }

    public static final void b(@NotNull C3215w0 c3215w0, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        C4912a c4912a2;
        C3969l u11 = interfaceC3967k.u(605522716);
        if ((((u11.F(c3215w0) ? 4 : 2) | i11) & 19) == 18 && u11.b()) {
            u11.j();
            c4912a2 = c4912a;
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new C8960o(0);
                u11.x(C11);
            }
            C8960o c8960o = (C8960o) C11;
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new I(c8960o);
                u11.x(C12);
            }
            c4912a2 = c4912a;
            C8949d.b(c8960o, (Function0) C12, I0.E0.a(c3215w0, c8960o), null, false, c4912a2, u11, 196662, 24);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new J(c3215w0, c4912a2, i11));
        }
    }

    public static final void c(@NotNull I0.W0 w02, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C4912a c4912a2;
        C3969l u11 = interfaceC3967k.u(-1985516685);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(w02) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(c4912a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            c4912a2 = c4912a;
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new C8960o(0);
                u11.x(C11);
            }
            C8960o c8960o = (C8960o) C11;
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new E(c8960o);
                u11.x(C12);
            }
            c4912a2 = c4912a;
            C8949d.b(c8960o, (Function0) C12, I0.c1.a(w02, c8960o), null, w02.A(), c4912a2, u11, ((i12 << 12) & 458752) | 54, 8);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new F(w02, c4912a2, i11));
        }
    }
}
