package I0;

import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.compose.ui.platform.C5236c1;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class h1 extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W0 f11533b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h1(W0 w02) {
        super(3);
        this.f11533b = w02;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        androidx.compose.ui.e b11;
        androidx.compose.ui.e eVar2 = eVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(1980580247);
        Z1.d dVar = (Z1.d) interfaceC3967k2.m(androidx.compose.ui.platform.K0.e());
        Object C11 = interfaceC3967k2.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(Z1.q.a(0L), D1.f25195a);
            interfaceC3967k2.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        W0 w02 = this.f11533b;
        boolean F11 = interfaceC3967k2.F(w02);
        Object C12 = interfaceC3967k2.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new d1(w02, interfaceC3978p0);
            interfaceC3967k2.x(C12);
        }
        Function0 function0 = (Function0) C12;
        boolean n11 = interfaceC3967k2.n(dVar);
        Object C13 = interfaceC3967k2.C();
        if (n11 || C13 == InterfaceC3967k.a.a()) {
            C13 = new g1(dVar, interfaceC3978p0);
            interfaceC3967k2.x(C13);
        }
        int i11 = C3205r0.f11590e;
        b11 = androidx.compose.ui.c.b(eVar2, C5236c1.a(), new C3209t0(function0, (Function1) C13));
        interfaceC3967k2.k();
        return b11;
    }
}
