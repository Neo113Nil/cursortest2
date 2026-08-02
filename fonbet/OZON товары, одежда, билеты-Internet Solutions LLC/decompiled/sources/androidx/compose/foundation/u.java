package androidx.compose.foundation;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;
import n0.InterfaceC8367H;
import n0.InterfaceC8368I;

/* loaded from: classes8.dex */
final class u extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC8367H f39867b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t0.q f39868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(InterfaceC8367H interfaceC8367H, t0.q qVar) {
        super(3);
        this.f39867b = interfaceC8367H;
        this.f39868c = qVar;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(-353972293);
        InterfaceC8368I a11 = this.f39867b.a(this.f39868c, interfaceC3967k2);
        boolean n11 = interfaceC3967k2.n(a11);
        Object C11 = interfaceC3967k2.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new v(a11);
            interfaceC3967k2.x(C11);
        }
        v vVar = (v) C11;
        interfaceC3967k2.k();
        return vVar;
    }
}
