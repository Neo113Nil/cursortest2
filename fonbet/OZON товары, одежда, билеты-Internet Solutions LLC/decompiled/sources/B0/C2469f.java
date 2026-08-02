package B0;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2469f extends AbstractC7737t implements InterfaceC6511n<androidx.compose.ui.e, InterfaceC3967k, Integer, androidx.compose.ui.e> {

    /* renamed from: b, reason: collision with root package name */
    public static final C2469f f1709b = new C2469f(3);

    @Override // fd.InterfaceC6511n
    public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        androidx.compose.ui.e eVar2 = eVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(-2126899193);
        long b11 = ((I0.j1) interfaceC3967k2.m(I0.k1.b())).b();
        e.a aVar = androidx.compose.ui.e.f40358c0;
        boolean s11 = interfaceC3967k2.s(b11);
        Object C11 = interfaceC3967k2.C();
        if (s11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C2466e(b11);
            interfaceC3967k2.x(C11);
        }
        androidx.compose.ui.e l02 = eVar2.l0(androidx.compose.ui.draw.c.c(aVar, (Function1) C11));
        interfaceC3967k2.k();
        return l02;
    }
}
