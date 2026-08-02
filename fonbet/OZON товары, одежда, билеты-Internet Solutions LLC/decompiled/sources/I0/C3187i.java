package I0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: I0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3187i extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Boolean> f11534b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f11535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3187i(boolean z11, Function0 function0) {
        super(3);
        this.f11534b = function0;
        this.f11535c = z11;
    }

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        androidx.compose.ui.e eVar2 = eVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(-196777734);
        long b11 = ((j1) interfaceC3967k2.m(k1.b())).b();
        boolean s11 = interfaceC3967k2.s(b11);
        Function0<Boolean> function0 = this.f11534b;
        boolean n11 = s11 | interfaceC3967k2.n(function0);
        boolean z11 = this.f11535c;
        boolean p11 = n11 | interfaceC3967k2.p(z11);
        Object C11 = interfaceC3967k2.C();
        if (p11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C3185h(function0, b11, z11);
            interfaceC3967k2.x(C11);
        }
        androidx.compose.ui.e c11 = androidx.compose.ui.draw.c.c(eVar2, (Function1) C11);
        interfaceC3967k2.k();
        return c11;
    }
}
