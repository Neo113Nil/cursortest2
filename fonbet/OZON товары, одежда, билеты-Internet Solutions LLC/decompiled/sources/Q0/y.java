package Q0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C8004n;
import m0.D0;
import m0.G;
import m0.H;
import m0.T0;

/* loaded from: classes8.dex */
public final class y extends AbstractC7737t implements InterfaceC6511n<D0.b<f>, InterfaceC3967k, Integer, H<Float>> {

    /* renamed from: b, reason: collision with root package name */
    public static final y f22806b = new y(3);

    @Override // fd.InterfaceC6511n
    public final H<Float> invoke(D0.b<f> bVar, InterfaceC3967k interfaceC3967k, Integer num) {
        D0.b<f> bVar2 = bVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        interfaceC3967k2.o(-1154662212);
        f fVar = f.Focused;
        f fVar2 = f.UnfocusedEmpty;
        H<Float> d11 = bVar2.a(fVar, fVar2) ? C8004n.d(67, 0, G.b(), 2) : (bVar2.a(fVar2, fVar) || bVar2.a(f.UnfocusedNotEmpty, fVar2)) ? new T0(83, 67, G.b()) : C8004n.c(0.0f, null, 7);
        interfaceC3967k2.k();
        return d11;
    }
}
