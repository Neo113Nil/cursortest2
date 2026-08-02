package If0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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

/* renamed from: If0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3241g extends Ze0.a {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ze0.a
    public final void a(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-1413623376);
        interfaceC3967k.o(1843075630);
        z0.b bVar = (z0.b) interfaceC3967k.m(Sf0.k.a());
        interfaceC3967k.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(kotlin.jvm.internal.N.b(K.class), a11, null, bVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        interfaceC3967k.k();
        K k11 = (K) a12;
        InterfaceC3978p0 b11 = n1.b(k11.i0(), interfaceC3967k);
        interfaceC3967k.o(373973431);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            Object c3240f = new C3240f(1, k11, K.class, "onIntent", "onIntent(Lru/ozon/network/internal/debugMenu/screen/domainReachability/DomainReachabilityUiIntent;)V", 0);
            interfaceC3967k.x(c3240f);
            C11 = c3240f;
        }
        kotlin.reflect.h hVar = (kotlin.reflect.h) C11;
        interfaceC3967k.k();
        InterfaceC8142d interfaceC8142d = (InterfaceC8142d) interfaceC3967k.m(C6554a.a());
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        Boolean bool = Boolean.TRUE;
        interfaceC3967k.o(373978200);
        boolean F11 = interfaceC3967k.F(k11) | interfaceC3967k.F(context) | interfaceC3967k.F(interfaceC8142d);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new C3239e(k11, context, interfaceC8142d, null);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        S0.Q.e(interfaceC3967k, bool, (Function2) C12);
        C3250p.j((J) b11.getValue(), (Function1) hVar, interfaceC3967k, 48);
        interfaceC3967k.k();
    }
}
