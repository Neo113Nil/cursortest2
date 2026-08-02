package J0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;
import u0.InterfaceC9890C;

/* renamed from: J0.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3320n extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9915y f13321b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> f13322c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3320n(C9915y c9915y, InterfaceC6511n interfaceC6511n) {
        super(2);
        this.f13321b = c9915y;
        this.f13322c = interfaceC6511n;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            u3.a(((D3) interfaceC3967k2.m(E3.c())).c(), a1.c.c(-630330208, new C3316m(this.f13321b, this.f13322c), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
