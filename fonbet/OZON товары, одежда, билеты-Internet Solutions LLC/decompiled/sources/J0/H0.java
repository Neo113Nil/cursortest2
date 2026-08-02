package J0;

import D1.InterfaceC2801g;
import I0.C3173b;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

/* loaded from: classes8.dex */
final class H0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        float f7;
        float f11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            f7 = O0.f12919c;
            e.a aVar = androidx.compose.ui.e.f40358c0;
            f11 = O0.f12919c;
            androidx.compose.ui.e j11 = androidx.compose.foundation.layout.T.j(aVar, f7, 0.0f, f11, 0.0f, 10);
            androidx.compose.foundation.layout.Y b11 = androidx.compose.foundation.layout.X.b(C5179b.f(), InterfaceC6250b.a.i(), interfaceC3967k2, 48);
            int I11 = interfaceC3967k2.I();
            S0.A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(interfaceC3967k2, j11);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a11);
            } else {
                interfaceC3967k2.e();
            }
            Function2 f13 = C3173b.f(interfaceC3967k2, b11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(f13, I11, interfaceC3967k2, I11);
            }
            S0.F1.b(interfaceC3967k2, f12, InterfaceC2801g.a.f());
            interfaceC3967k2.o(-565074185);
            interfaceC3967k2.k();
            W1.b.f33190a.invoke(interfaceC3967k2, 0);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
