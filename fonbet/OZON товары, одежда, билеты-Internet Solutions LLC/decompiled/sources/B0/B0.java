package B0;

import P1.AbstractC3809p;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class B0 extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1343b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1344c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K1.T f1345d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B0(int i11, int i12, K1.T t2) {
        super(3);
        this.f1343b = i11;
        this.f1344c = i12;
        this.f1345d = t2;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        long j11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(408240218);
        int i11 = this.f1343b;
        int i12 = this.f1344c;
        C0.e(i11, i12);
        if (i11 == 1 && i12 == Integer.MAX_VALUE) {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            interfaceC3967k2.k();
            return aVar;
        }
        Z1.d dVar = (Z1.d) interfaceC3967k2.m(androidx.compose.ui.platform.K0.e());
        AbstractC3809p.a aVar2 = (AbstractC3809p.a) interfaceC3967k2.m(androidx.compose.ui.platform.K0.g());
        Z1.s sVar = (Z1.s) interfaceC3967k2.m(androidx.compose.ui.platform.K0.k());
        K1.T t2 = this.f1345d;
        boolean n11 = interfaceC3967k2.n(t2) | interfaceC3967k2.n(sVar);
        Object C11 = interfaceC3967k2.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = K1.U.b(t2, sVar);
            interfaceC3967k2.x(C11);
        }
        K1.T t11 = (K1.T) C11;
        boolean n12 = interfaceC3967k2.n(aVar2) | interfaceC3967k2.n(t11);
        Object C12 = interfaceC3967k2.C();
        if (n12 || C12 == InterfaceC3967k.a.a()) {
            AbstractC3809p h11 = t11.h();
            P1.F l11 = t11.l();
            if (l11 == null) {
                l11 = P1.F.f21509g;
            }
            P1.A j12 = t11.j();
            int b11 = j12 != null ? j12.b() : 0;
            P1.B k11 = t11.k();
            C12 = aVar2.a(h11, l11, b11, k11 != null ? k11.b() : 1);
            interfaceC3967k2.x(C12);
        }
        S0.A1 a12 = (S0.A1) C12;
        boolean n13 = interfaceC3967k2.n(a12.getValue()) | interfaceC3967k2.n(dVar) | interfaceC3967k2.n(aVar2) | interfaceC3967k2.n(t2) | interfaceC3967k2.n(sVar);
        Object C13 = interfaceC3967k2.C();
        if (n13 || C13 == InterfaceC3967k.a.a()) {
            j11 = 4294967295L;
            C13 = Integer.valueOf((int) (C2501p1.a(t11, dVar, aVar2, C2501p1.c(), 1) & 4294967295L));
            interfaceC3967k2.x(C13);
        } else {
            j11 = 4294967295L;
        }
        int intValue = ((Number) C13).intValue();
        boolean n14 = interfaceC3967k2.n(sVar) | interfaceC3967k2.n(t2) | interfaceC3967k2.n(dVar) | interfaceC3967k2.n(aVar2) | interfaceC3967k2.n(a12.getValue());
        Object C14 = interfaceC3967k2.C();
        if (n14 || C14 == InterfaceC3967k.a.a()) {
            C14 = Integer.valueOf((int) (C2501p1.a(t11, dVar, aVar2, C2501p1.c() + '\n' + C2501p1.c(), 2) & j11));
            interfaceC3967k2.x(C14);
        }
        int intValue2 = ((Number) C14).intValue() - intValue;
        Integer valueOf = i11 == 1 ? null : Integer.valueOf(((i11 - 1) * intValue2) + intValue);
        Integer valueOf2 = i12 != Integer.MAX_VALUE ? Integer.valueOf(((i12 - 1) * intValue2) + intValue) : null;
        androidx.compose.ui.e g10 = androidx.compose.foundation.layout.a0.g(androidx.compose.ui.e.f40358c0, valueOf != null ? dVar.B(valueOf.intValue()) : Float.NaN, valueOf2 != null ? dVar.B(valueOf2.intValue()) : Float.NaN);
        interfaceC3967k2.k();
        return g10;
    }
}
