package Mf0;

import D1.InterfaceC2801g;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import e1.InterfaceC6250b;
import f3.AbstractC6409a;
import ff0.C6554a;
import g3.C6616a;
import g3.C6617b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import mf0.InterfaceC8142d;

/* renamed from: Mf0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3629k extends Ze0.a {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ze0.a
    public final void a(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-1828246298);
        interfaceC3967k.o(1843075630);
        z0.b bVar = (z0.b) interfaceC3967k.m(Sf0.k.a());
        interfaceC3967k.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(kotlin.jvm.internal.N.b(O.class), a11, null, bVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        interfaceC3967k.k();
        O o11 = (O) a12;
        InterfaceC3978p0 b11 = n1.b(o11.getUiState(), interfaceC3967k);
        InterfaceC8142d interfaceC8142d = (InterfaceC8142d) interfaceC3967k.m(C6554a.a());
        androidx.compose.ui.e c11 = androidx.compose.foundation.z.c(a0.d(androidx.compose.ui.e.f40358c0), androidx.compose.foundation.z.b(interfaceC3967k), 14);
        C5194q a13 = C5193p.a(C5179b.n(16), InterfaceC6250b.a.k(), interfaceC3967k, 6);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k, c11);
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
        Function2 c12 = J0.P.c(interfaceC3967k, a13, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            Nk.a.d(c12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f7, InterfaceC2801g.a.f());
        N n11 = (N) b11.getValue();
        interfaceC3967k.o(-1451456901);
        boolean F11 = interfaceC3967k.F(o11);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            Object c3625g = new C3625g(5, o11, O.class, "executeRequest", "executeRequest(Ljava/lang/String;ZZZI)V", 0);
            interfaceC3967k.x(c3625g);
            C11 = c3625g;
        }
        interfaceC3967k.k();
        M.b(n11, (fd.p) ((kotlin.reflect.h) C11), interfaceC3967k, 0);
        interfaceC3967k.o(-1451453288);
        boolean F12 = interfaceC3967k.F(interfaceC8142d);
        Object C12 = interfaceC3967k.C();
        if (F12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new C3626h(interfaceC8142d);
            interfaceC3967k.x(C12);
        }
        Function0 function0 = (Function0) C12;
        interfaceC3967k.k();
        interfaceC3967k.o(-1451450055);
        boolean F13 = interfaceC3967k.F(interfaceC8142d);
        Object C13 = interfaceC3967k.C();
        if (F13 || C13 == InterfaceC3967k.a.a()) {
            C13 = new C3627i(interfaceC8142d);
            interfaceC3967k.x(C13);
        }
        Function0 function02 = (Function0) C13;
        interfaceC3967k.k();
        interfaceC3967k.o(-1451447253);
        boolean F14 = interfaceC3967k.F(interfaceC8142d);
        Object C14 = interfaceC3967k.C();
        if (F14 || C14 == InterfaceC3967k.a.a()) {
            C14 = new C3628j(interfaceC8142d);
            interfaceC3967k.x(C14);
        }
        interfaceC3967k.k();
        M.d(function0, function02, (Function0) C14, interfaceC3967k, 0);
        interfaceC3967k.f();
        interfaceC3967k.k();
    }
}
