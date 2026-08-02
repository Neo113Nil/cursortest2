package D4;

import B4.C2581j;
import S0.C3969l;
import S0.C3996z;
import S0.H0;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import b1.InterfaceC5505h;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* renamed from: D4.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2843s {
    public static final void a(@NotNull C2581j c2581j, @NotNull InterfaceC5505h interfaceC5505h, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1579360880);
        if ((((u11.F(c2581j) ? 4 : 2) | i11 | (u11.F(interfaceC5505h) ? 32 : 16)) & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            C3996z.b(new H0[]{C6616a.b(c2581j), e3.r.a().c(c2581j), AndroidCompositionLocals_androidKt.g().c(c2581j)}, a1.c.c(-52928304, new C2841p(interfaceC5505h, c4912a), u11), u11, 56);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C2842q(c2581j, interfaceC5505h, c4912a, i11));
        }
    }

    public static final void b(InterfaceC5505h interfaceC5505h, C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1211832233);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(interfaceC5505h) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(c4912a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            u11.B(1729797275);
            B0 a11 = C6616a.a(u11);
            if (a11 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            w0 a12 = C6617b.a(kotlin.jvm.internal.N.b(C2826a.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, u11);
            u11.K();
            C2826a c2826a = (C2826a) a12;
            c2826a.f5882b = new WeakReference<>(interfaceC5505h);
            interfaceC5505h.c(c2826a.getF5881a(), c4912a, u11, ((i12 << 6) & 896) | (i12 & 112));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new r(interfaceC5505h, c4912a, i11));
        }
    }
}
