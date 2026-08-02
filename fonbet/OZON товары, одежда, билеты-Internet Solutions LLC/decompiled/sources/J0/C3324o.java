package J0;

import S0.C3996z;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import u0.C9915y;
import u0.InterfaceC9890C;

/* renamed from: J0.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3324o extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ S0.A1<C7807Z> f13335b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9915y f13336c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> f13337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3324o(S0.A1 a12, C9915y c9915y, InterfaceC6511n interfaceC6511n) {
        super(2);
        this.f13335b = a12;
        this.f13336c = c9915y;
        this.f13337d = interfaceC6511n;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C3996z.a(C3359x.a().c(Float.valueOf(C7807Z.q(this.f13335b.getValue().w()))), a1.c.c(-1699085201, new C3320n(this.f13336c, this.f13337d), interfaceC3967k2), interfaceC3967k2, 56);
        }
        return Unit.f71690a;
    }
}
