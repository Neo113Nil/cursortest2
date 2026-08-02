package Gf0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import ff0.C6554a;
import g3.C6616a;
import g3.C6617b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import mf0.InterfaceC8142d;

/* renamed from: Gf0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3101d extends Ze0.a {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ze0.a
    public final void a(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-911766548);
        interfaceC3967k.o(1843075630);
        z0.b bVar = (z0.b) interfaceC3967k.m(Sf0.k.a());
        interfaceC3967k.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(kotlin.jvm.internal.N.b(M.class), a11, null, bVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        interfaceC3967k.k();
        M m11 = (M) a12;
        InterfaceC8142d interfaceC8142d = (InterfaceC8142d) interfaceC3967k.m(C6554a.a());
        interfaceC3967k.o(1984626621);
        boolean F11 = interfaceC3967k.F(m11) | interfaceC3967k.F(interfaceC8142d);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C3099b(m11, interfaceC8142d, null);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        S0.Q.e(interfaceC3967k, interfaceC8142d, (Function2) C11);
        InterfaceC3978p0 b11 = n1.b(m11.i0(), interfaceC3967k);
        interfaceC3967k.o(1984632069);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            Object c3100c = new C3100c(1, m11, M.class, "onIntent", "onIntent$ozon_network_release(Lru/ozon/network/internal/debugMenu/screen/addDomain/AddDomainUiIntent;)V", 0);
            interfaceC3967k.x(c3100c);
            C12 = c3100c;
        }
        interfaceC3967k.k();
        C3105h.e((D) b11.getValue(), (Function1) ((kotlin.reflect.h) C12), interfaceC3967k, 48);
        interfaceC3967k.k();
    }
}
