package Mi0;

import D1.InterfaceC2801g;
import E0.C2942q;
import I0.C3173b;
import J0.P;
import P0.D;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import bj0.C5680b;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Qi0.a f18093b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f18094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Qi0.a aVar, n nVar) {
        super(2);
        this.f18093b = aVar;
        this.f18094c = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e e11 = a0.e(androidx.compose.ui.e.f40358c0, 1.0f);
            float f7 = 8;
            Y b11 = X.b(C5179b.n(f7), InterfaceC6250b.a.i(), interfaceC3967k2, 54);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, e11);
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
            Function2 f12 = C3173b.f(interfaceC3967k2, b11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(f12, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C5194q a12 = C5193p.a(C5179b.n(f7), InterfaceC6250b.a.k(), interfaceC3967k2, 6);
            int I12 = interfaceC3967k2.I();
            A0 d12 = interfaceC3967k2.d();
            androidx.compose.ui.e f13 = androidx.compose.ui.c.f(interfaceC3967k2, layoutWeightElement);
            Function0 a13 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a13);
            } else {
                interfaceC3967k2.e();
            }
            Function2 c11 = P.c(interfaceC3967k2, a12, interfaceC3967k2, d12);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                Nk.a.d(c11, I12, interfaceC3967k2, I12);
            }
            Ek.a.g(f13, interfaceC3967k2, -1381378625);
            Qi0.a aVar = this.f18093b;
            for (Qi0.c cVar : aVar.c()) {
                boolean z11 = cVar instanceof Qi0.b;
                n nVar = this.f18094c;
                if (z11) {
                    interfaceC3967k2.o(1593286038);
                    n.g(nVar, (Qi0.b) cVar, interfaceC3967k2, 0);
                    interfaceC3967k2.k();
                } else if (cVar instanceof Qi0.f) {
                    interfaceC3967k2.o(1593287895);
                    n.h(nVar, (Qi0.f) cVar, interfaceC3967k2, 0);
                    interfaceC3967k2.k();
                } else {
                    interfaceC3967k2.o(2147319893);
                    interfaceC3967k2.k();
                }
            }
            interfaceC3967k2.k();
            interfaceC3967k2.f();
            Qi0.e b12 = aVar.b();
            D.a(b12.b(), C5680b.a(6, interfaceC3967k2, androidx.compose.ui.e.f40358c0, b12.a()), false, null, a.f18088b, interfaceC3967k2, 196608, 28);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
