package androidx.compose.foundation;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import n0.InterfaceC8367H;
import n0.InterfaceC8369J;

/* loaded from: classes.dex */
final class h extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f39282b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f39283c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ I1.i f39284d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f39285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(boolean z11, String str, I1.i iVar, Function0<Unit> function0) {
        super(3);
        this.f39282b = z11;
        this.f39283c = str;
        this.f39284d = iVar;
        this.f39285e = function0;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        t0.q qVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(-756081143);
        InterfaceC8367H interfaceC8367H = (InterfaceC8367H) interfaceC3967k2.m(t.a());
        if (interfaceC8367H instanceof InterfaceC8369J) {
            interfaceC3967k2.o(617140216);
            interfaceC3967k2.k();
            qVar = null;
        } else {
            interfaceC3967k2.o(617248189);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = t0.p.a();
                interfaceC3967k2.x(C11);
            }
            qVar = (t0.q) C11;
            interfaceC3967k2.k();
        }
        t0.q qVar2 = qVar;
        androidx.compose.ui.e a11 = i.a(androidx.compose.ui.e.f40358c0, qVar2, interfaceC8367H, this.f39282b, this.f39283c, this.f39284d, this.f39285e);
        interfaceC3967k2.k();
        return a11;
    }
}
