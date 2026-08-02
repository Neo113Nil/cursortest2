package B0;

import P1.AbstractC3809p;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class Q1 extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K1.T f1499b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q1(K1.T t2) {
        super(3);
        this.f1499b = t2;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(1582736677);
        Z1.d dVar = (Z1.d) interfaceC3967k2.m(androidx.compose.ui.platform.K0.e());
        AbstractC3809p.a aVar = (AbstractC3809p.a) interfaceC3967k2.m(androidx.compose.ui.platform.K0.g());
        Z1.s sVar = (Z1.s) interfaceC3967k2.m(androidx.compose.ui.platform.K0.k());
        K1.T t2 = this.f1499b;
        boolean n11 = interfaceC3967k2.n(t2) | interfaceC3967k2.n(sVar);
        Object C11 = interfaceC3967k2.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = K1.U.b(t2, sVar);
            interfaceC3967k2.x(C11);
        }
        K1.T t11 = (K1.T) C11;
        boolean n12 = interfaceC3967k2.n(aVar) | interfaceC3967k2.n(t11);
        Object C12 = interfaceC3967k2.C();
        if (n12 || C12 == InterfaceC3967k.a.a()) {
            AbstractC3809p h11 = t11.h();
            P1.F l11 = t11.l();
            if (l11 == null) {
                l11 = P1.F.f21509g;
            }
            P1.A j11 = t11.j();
            int b11 = j11 != null ? j11.b() : 0;
            P1.B k11 = t11.k();
            C12 = aVar.a(h11, l11, b11, k11 != null ? k11.b() : 1);
            interfaceC3967k2.x(C12);
        }
        S0.A1 a12 = (S0.A1) C12;
        Object C13 = interfaceC3967k2.C();
        if (C13 == InterfaceC3967k.a.a()) {
            C13 = new N1(sVar, dVar, aVar, this.f1499b, a12.getValue());
            interfaceC3967k2.x(C13);
        }
        N1 n13 = (N1) C13;
        n13.b(sVar, dVar, aVar, t11, a12.getValue());
        e.a aVar2 = androidx.compose.ui.e.f40358c0;
        boolean F11 = interfaceC3967k2.F(n13);
        Object C14 = interfaceC3967k2.C();
        if (F11 || C14 == InterfaceC3967k.a.a()) {
            C14 = new P1(n13);
            interfaceC3967k2.x(C14);
        }
        androidx.compose.ui.e a11 = androidx.compose.ui.layout.b.a((InterfaceC6511n) C14, aVar2);
        interfaceC3967k2.k();
        return a11;
    }
}
