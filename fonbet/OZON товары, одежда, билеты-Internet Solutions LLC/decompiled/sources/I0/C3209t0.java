package I0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import k1.C7459e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C8006o;

/* renamed from: I0.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3209t0 extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<C7459e> f11604b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Function0<C7459e>, androidx.compose.ui.e> f11605c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3209t0(Function0<C7459e> function0, Function1<? super Function0<C7459e>, ? extends androidx.compose.ui.e> function1) {
        super(3);
        this.f11604b = function0;
        this.f11605c = function1;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(759876635);
        C8006o b11 = C3205r0.b(this.f11604b, interfaceC3967k2);
        boolean n11 = interfaceC3967k2.n(b11);
        Object C11 = interfaceC3967k2.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C3207s0(b11);
            interfaceC3967k2.x(C11);
        }
        androidx.compose.ui.e invoke = this.f11605c.invoke((Function0) C11);
        interfaceC3967k2.k();
        return invoke;
    }
}
