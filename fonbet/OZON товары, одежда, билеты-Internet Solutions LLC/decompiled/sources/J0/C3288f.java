package J0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.InterfaceC9890C;

/* renamed from: J0.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3288f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> f13206b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3288f(InterfaceC6511n interfaceC6511n) {
        super(2);
        this.f13206b = interfaceC6511n;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        long j11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            K1.T c11 = ((D3) interfaceC3967k2.m(E3.c())).c();
            j11 = C3296h.f13230c;
            u3.a(K1.T.c(c11, 0L, j11, null, null, null, 0L, null, null, 0L, null, null, 16777213), a1.c.c(915155142, new C3283e(this.f13206b), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
