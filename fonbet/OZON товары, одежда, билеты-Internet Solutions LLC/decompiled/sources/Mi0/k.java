package Mi0;

import D1.InterfaceC2801g;
import J0.P;
import P0.C3753m;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.e;
import bj0.C5680b;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import u0.InterfaceC9914x;

/* loaded from: classes3.dex */
final class k extends AbstractC7737t implements InterfaceC6511n<InterfaceC9914x, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f18108b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f18109c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f18110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(n nVar, o oVar, InterfaceC3978p0 interfaceC3978p0) {
        super(3);
        this.f18108b = nVar;
        this.f18109c = oVar;
        this.f18110d = interfaceC3978p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9914x interfaceC9914x, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9914x it = interfaceC9914x;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e c11 = z.c(a0.e(T.h(aVar, 16, 0.0f, 2), 1.0f), z.b(interfaceC3967k2), 14);
            C5194q a11 = C5193p.a(C5179b.n(8), InterfaceC6250b.a.k(), interfaceC3967k2, 6);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, c11);
            InterfaceC2801g.f5440U.getClass();
            Function0 a12 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a12);
            } else {
                interfaceC3967k2.e();
            }
            Function2 c12 = P.c(interfaceC3967k2, a11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(c12, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            InterfaceC3978p0 interfaceC3978p0 = this.f18110d;
            Qi0.a f11 = ((Pi0.a) interfaceC3978p0.getValue()).f();
            n nVar = this.f18108b;
            n.f(nVar, "Track Campaign", f11, interfaceC3967k2, 6);
            n.f(nVar, "Event V2", ((Pi0.a) interfaceC3978p0.getValue()).c(), interfaceC3967k2, 6);
            n.f(nVar, "Trinity Event", ((Pi0.a) interfaceC3978p0.getValue()).g(), interfaceC3967k2, 6);
            n.f(nVar, "Page View Event", ((Pi0.a) interfaceC3978p0.getValue()).e(), interfaceC3967k2, 6);
            n.f(nVar, "Custom Event", ((Pi0.a) interfaceC3978p0.getValue()).b(), interfaceC3967k2, 6);
            androidx.compose.ui.e e11 = a0.e(C5680b.a(54, interfaceC3967k2, aVar, "ProductTrackerEvents.DispatchEvents.Button"), 1.0f);
            interfaceC3967k2.o(1664116905);
            o oVar = this.f18109c;
            boolean F11 = interfaceC3967k2.F(oVar);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new j(oVar);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            C3753m.a((Function0) C11, e11, false, null, null, null, null, a.f18087a, interfaceC3967k2, 805306368, 508);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
