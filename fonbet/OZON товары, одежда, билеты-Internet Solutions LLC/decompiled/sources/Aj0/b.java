package Aj0;

import D1.InterfaceC2801g;
import J0.P;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import S0.n1;
import Yi0.d;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import e1.InterfaceC6250b;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import m3.C8060b;
import ui0.C10063b;
import wj0.C10566a;
import yj0.InterfaceC10914a;
import zj0.C11148b;

/* loaded from: classes3.dex */
public abstract class b extends d {
    @Override // Yi0.d
    protected final void b(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-491135625);
        interfaceC3967k.o(-1485211780);
        interfaceC3967k.o(932189391);
        z0.b bVar = (z0.b) interfaceC3967k.m(C10063b.a());
        interfaceC3967k.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(N.b(Wi0.b.class), a11, null, bVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        interfaceC3967k.k();
        Wi0.b bVar2 = (Wi0.b) a12;
        interfaceC3967k.k();
        InterfaceC10914a interfaceC10914a = (InterfaceC10914a) n1.b(bVar2.getUiState(), interfaceC3967k).getValue();
        if (interfaceC10914a instanceof InterfaceC10914a.b) {
            e.a aVar = e.f40358c0;
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
            int I11 = interfaceC3967k.I();
            A0 d11 = interfaceC3967k.d();
            e f7 = c.f(interfaceC3967k, aVar);
            InterfaceC2801g.f5440U.getClass();
            Function0 a14 = InterfaceC2801g.a.a();
            if (interfaceC3967k.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k.i();
            if (interfaceC3967k.t()) {
                interfaceC3967k.H(a14);
            } else {
                interfaceC3967k.e();
            }
            Function2 c11 = P.c(interfaceC3967k, a13, interfaceC3967k, d11);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
                Nk.a.d(c11, I11, interfaceC3967k, I11);
            }
            F1.b(interfaceC3967k, f7, InterfaceC2801g.a.f());
            InterfaceC10914a.b bVar3 = (InterfaceC10914a.b) interfaceC10914a;
            C11148b.a(bVar3.c(), bVar3.d(), bVar3.b(), interfaceC3967k, 0);
            List<C10566a> a15 = bVar3.a();
            e f11 = T.f(aVar, 16);
            interfaceC3967k.o(433655819);
            boolean F11 = interfaceC3967k.F(bVar2);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(bVar2);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            rj0.b.a(f11, a15, (Function1) C11, interfaceC3967k, 6, 0);
            interfaceC3967k.f();
        }
        interfaceC3967k.k();
    }
}
