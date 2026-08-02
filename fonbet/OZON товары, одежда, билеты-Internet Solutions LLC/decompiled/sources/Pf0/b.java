package Pf0;

import S0.InterfaceC3967k;
import Sf0.k;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import kotlin.jvm.internal.N;

/* loaded from: classes3.dex */
public final class b extends Ze0.a {
    @Override // Ze0.a
    public final void a(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-1307788240);
        interfaceC3967k.o(1843075630);
        z0.b bVar = (z0.b) interfaceC3967k.m(k.a());
        interfaceC3967k.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(N.b(a.class), a11, null, bVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        interfaceC3967k.k();
        c.a((a) a12, interfaceC3967k, 0);
        interfaceC3967k.k();
    }
}
