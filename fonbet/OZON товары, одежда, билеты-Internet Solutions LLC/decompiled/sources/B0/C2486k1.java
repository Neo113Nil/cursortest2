package B0;

import K1.C3422b;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;

/* renamed from: B0.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2486k1 extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7799Q f1833b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ O0 f1834c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Q1.K f1835d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Q1.D f1836e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2486k1(AbstractC7799Q abstractC7799Q, O0 o02, Q1.K k11, Q1.D d11) {
        super(3);
        this.f1833b = abstractC7799Q;
        this.f1834c = o02;
        this.f1835d = k11;
        this.f1836e = d11;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        androidx.compose.ui.e eVar2;
        androidx.compose.ui.e eVar3 = eVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(-84507373);
        Object C11 = interfaceC3967k2.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new E0.G();
            interfaceC3967k2.x(C11);
        }
        E0.G g10 = (E0.G) C11;
        AbstractC7799Q abstractC7799Q = this.f1833b;
        boolean z11 = ((abstractC7799Q instanceof l1.K0) && ((l1.K0) abstractC7799Q).a() == 16) ? false : true;
        if (((androidx.compose.ui.platform.i2) interfaceC3967k2.m(androidx.compose.ui.platform.K0.s())).a()) {
            O0 o02 = this.f1834c;
            if (o02.e()) {
                Q1.K k11 = this.f1835d;
                if (K1.Q.e(k11.e()) && z11) {
                    interfaceC3967k2.o(808320157);
                    C3422b c11 = k11.c();
                    K1.Q b11 = K1.Q.b(k11.e());
                    boolean F11 = interfaceC3967k2.F(g10);
                    Object C12 = interfaceC3967k2.C();
                    if (F11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new C2480i1(g10, null);
                        interfaceC3967k2.x(C12);
                    }
                    S0.Q.g(c11, b11, (Function2) C12, interfaceC3967k2);
                    boolean F12 = interfaceC3967k2.F(g10) | interfaceC3967k2.F(this.f1836e) | interfaceC3967k2.n(k11) | interfaceC3967k2.F(o02) | interfaceC3967k2.n(abstractC7799Q);
                    Object C13 = interfaceC3967k2.C();
                    if (F12 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new C2483j1(g10, this.f1836e, this.f1835d, o02, abstractC7799Q);
                        interfaceC3967k2.x(C13);
                    }
                    eVar2 = androidx.compose.ui.draw.c.d(eVar3, (Function1) C13);
                    interfaceC3967k2.k();
                    interfaceC3967k2.k();
                    return eVar2;
                }
            }
        }
        interfaceC3967k2.o(809534830);
        interfaceC3967k2.k();
        eVar2 = androidx.compose.ui.e.f40358c0;
        interfaceC3967k2.k();
        return eVar2;
    }
}
