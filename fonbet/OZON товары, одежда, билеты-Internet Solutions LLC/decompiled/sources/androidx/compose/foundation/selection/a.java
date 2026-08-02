package androidx.compose.foundation.selection;

import S0.InterfaceC3967k;
import androidx.compose.foundation.t;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import n0.InterfaceC8367H;
import n0.InterfaceC8369J;
import t0.p;
import t0.q;

/* loaded from: classes8.dex */
final class a extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f39765b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ I1.i f39766c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f39767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(boolean z11, I1.i iVar, Function0 function0) {
        super(3);
        this.f39765b = z11;
        this.f39766c = iVar;
        this.f39767d = function0;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        q qVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(-2124609672);
        InterfaceC8367H interfaceC8367H = (InterfaceC8367H) interfaceC3967k2.m(t.a());
        if (interfaceC8367H instanceof InterfaceC8369J) {
            interfaceC3967k2.o(-1412264498);
            interfaceC3967k2.k();
            qVar = null;
        } else {
            interfaceC3967k2.o(-1412156525);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k2.x(C11);
            }
            qVar = (q) C11;
            interfaceC3967k2.k();
        }
        q qVar2 = qVar;
        androidx.compose.ui.e a11 = c.a(androidx.compose.ui.e.f40358c0, this.f39765b, qVar2, interfaceC8367H, true, this.f39766c, this.f39767d);
        interfaceC3967k2.k();
        return a11;
    }
}
