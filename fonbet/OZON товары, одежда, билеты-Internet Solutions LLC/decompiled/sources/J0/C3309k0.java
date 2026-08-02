package J0;

import S0.C3969l;
import S0.InterfaceC3967k;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3309k0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3309k0 f13256a = new C3309k0();

    public final void a(boolean z11, Function0 function0, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(1752693020);
        if ((((u11.p(z11) ? 4 : 2) | i11 | 48) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C3293g0 c3293g0 = C3293g0.f13223b;
            Q0.a(c3293g0, I1.o.a(androidx.compose.ui.e.f40358c0, C3297h0.f13232b), false, a1.c.c(-689144648, new C3301i0(z11), u11), u11, 24582, 12);
            function0 = c3293g0;
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3305j0(this, z11, function0, i11));
        }
    }
}
