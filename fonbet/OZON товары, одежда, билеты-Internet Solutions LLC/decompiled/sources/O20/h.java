package O20;

import B4.C2584m;
import J20.C3373c;
import J20.C3378h;
import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import v0.InterfaceC10165e;

/* loaded from: classes3.dex */
public final class h extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f19887b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f19888c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2584m f19889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List list, k kVar, C2584m c2584m) {
        super(4);
        this.f19887b = list;
        this.f19888c = kVar;
        this.f19889d = c2584m;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        int i11;
        InterfaceC3967k interfaceC3967k2;
        k kVar;
        boolean z11;
        InterfaceC10165e interfaceC10165e2 = interfaceC10165e;
        int intValue = num.intValue();
        InterfaceC3967k interfaceC3967k3 = interfaceC3967k;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i11 = (interfaceC3967k3.n(interfaceC10165e2) ? 4 : 2) | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i11 |= interfaceC3967k3.r(intValue) ? 32 : 16;
        }
        if ((i11 & 147) == 146 && interfaceC3967k3.b()) {
            interfaceC3967k3.j();
        } else {
            b bVar = (b) this.f19887b.get(intValue);
            interfaceC3967k3.o(-482930507);
            boolean d11 = bVar.d();
            C2584m c2584m = this.f19889d;
            k kVar2 = this.f19888c;
            if (d11) {
                interfaceC3967k3.o(-482921673);
                String c11 = bVar.c();
                String a11 = bVar.a();
                if (C7714v.P(kVar2.b()) == intValue) {
                    kVar = kVar2;
                    z11 = true;
                } else {
                    kVar = kVar2;
                    z11 = false;
                }
                interfaceC3967k3.o(1646996685);
                boolean F11 = interfaceC3967k3.F(c2584m) | interfaceC3967k3.n(kVar) | interfaceC3967k3.n(bVar);
                Object C11 = interfaceC3967k3.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new d(c2584m, kVar, bVar);
                    interfaceC3967k3.x(C11);
                }
                interfaceC3967k3.k();
                C3378h.b(c11, a11, z11, null, (Function0) C11, interfaceC3967k3, 8);
                interfaceC3967k3.k();
                interfaceC3967k2 = interfaceC3967k3;
            } else {
                boolean z12 = true;
                interfaceC3967k3.o(-482539381);
                String c12 = bVar.c();
                String a12 = bVar.a();
                if (C7714v.P(kVar2.b()) != intValue) {
                    z12 = false;
                }
                interfaceC3967k3.o(1647010381);
                boolean F12 = interfaceC3967k3.F(c2584m) | interfaceC3967k3.n(kVar2) | interfaceC3967k3.n(bVar);
                Object C12 = interfaceC3967k3.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new e(c2584m, kVar2, bVar);
                    interfaceC3967k3.x(C12);
                }
                interfaceC3967k3.k();
                C3373c.b(c12, a12, "Не переводится", z12, null, null, (Function0) C12, null, interfaceC3967k3, 384, 368);
                InterfaceC3967k interfaceC3967k4 = interfaceC3967k3;
                interfaceC3967k4.k();
                interfaceC3967k2 = interfaceC3967k4;
            }
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}
