package J0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C8004n;
import m0.D0;

/* loaded from: classes8.dex */
final class r3 extends AbstractC7737t implements InterfaceC6511n<D0.b<U0>, InterfaceC3967k, Integer, m0.H<Float>> {

    /* renamed from: b, reason: collision with root package name */
    public static final r3 f13374b = new r3(3);

    @Override // fd.InterfaceC6511n
    public final m0.H<Float> invoke(D0.b<U0> bVar, InterfaceC3967k interfaceC3967k, Integer num) {
        D0.b<U0> bVar2 = bVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(-1079955085);
        U0 u02 = U0.Focused;
        U0 u03 = U0.UnfocusedEmpty;
        m0.H<Float> d11 = bVar2.a(u02, u03) ? C8004n.d(67, 0, m0.G.b(), 2) : (bVar2.a(u03, u02) || bVar2.a(U0.UnfocusedNotEmpty, u03)) ? new m0.T0(83, 67, m0.G.b()) : C8004n.c(0.0f, null, 7);
        interfaceC3967k2.k();
        return d11;
    }
}
