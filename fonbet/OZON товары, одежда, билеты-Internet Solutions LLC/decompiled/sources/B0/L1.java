package B0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import r0.C9110K;
import r0.EnumC9142v;
import r0.InterfaceC9108I;

/* loaded from: classes.dex */
final class L1 extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M1 f1423b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f1424c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ t0.q f1425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L1(M1 m12, boolean z11, t0.q qVar) {
        super(3);
        this.f1423b = m12;
        this.f1424c = z11;
        this.f1425d = qVar;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(805428266);
        boolean z11 = interfaceC3967k2.m(androidx.compose.ui.platform.K0.k()) == Z1.s.Rtl;
        M1 m12 = this.f1423b;
        boolean z12 = m12.e() == EnumC9142v.Vertical || !z11;
        boolean n11 = interfaceC3967k2.n(m12);
        Object C11 = interfaceC3967k2.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new J1(m12);
            interfaceC3967k2.x(C11);
        }
        InterfaceC9108I b11 = C9110K.b(interfaceC3967k2, (Function1) C11);
        boolean n12 = interfaceC3967k2.n(b11) | interfaceC3967k2.n(m12);
        Object C12 = interfaceC3967k2.C();
        if (n12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new K1(b11, m12);
            interfaceC3967k2.x(C12);
        }
        androidx.compose.ui.e g10 = androidx.compose.foundation.gestures.J.g(androidx.compose.ui.e.f40358c0, (K1) C12, m12.e(), this.f1424c && m12.b() != 0.0f, z12, this.f1425d);
        interfaceC3967k2.k();
        return g10;
    }
}
