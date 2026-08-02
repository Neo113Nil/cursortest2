package B0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class H1 extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<C7459e, Unit> f1403b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t0.q f1404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    H1(Function1<? super C7459e, Unit> function1, t0.q qVar) {
        super(3);
        this.f1403b = function1;
        this.f1404c = qVar;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(-102778667);
        Object C11 = interfaceC3967k2.C();
        if (C11 == InterfaceC3967k.a.a()) {
            Object d11 = new S0.D(S0.Q.j(kotlin.coroutines.g.f71771a, interfaceC3967k2));
            interfaceC3967k2.x(d11);
            C11 = d11;
        }
        xe.M a11 = ((S0.D) C11).a();
        Object C12 = interfaceC3967k2.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = S0.n1.f(null, S0.D1.f25195a);
            interfaceC3967k2.x(C12);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C12;
        InterfaceC3978p0 l11 = S0.n1.l(this.f1403b, interfaceC3967k2);
        t0.q qVar = this.f1404c;
        boolean n11 = interfaceC3967k2.n(qVar);
        Object C13 = interfaceC3967k2.C();
        if (n11 || C13 == InterfaceC3967k.a.a()) {
            C13 = new F1(interfaceC3978p0, qVar);
            interfaceC3967k2.x(C13);
        }
        S0.Q.c(qVar, (Function1) C13, interfaceC3967k2);
        e.a aVar = androidx.compose.ui.e.f40358c0;
        boolean F11 = interfaceC3967k2.F(a11) | interfaceC3967k2.n(qVar) | interfaceC3967k2.n(l11);
        Object C14 = interfaceC3967k2.C();
        if (F11 || C14 == InterfaceC3967k.a.a()) {
            Object g12 = new G1(a11, interfaceC3978p0, this.f1404c, l11, null);
            interfaceC3967k2.x(g12);
            C14 = g12;
        }
        androidx.compose.ui.e b11 = x1.L.b(aVar, qVar, (Function2) C14);
        interfaceC3967k2.k();
        return b11;
    }
}
