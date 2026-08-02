package J0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9891D;
import u0.InterfaceC9890C;

/* renamed from: J0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3283e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> f13194b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3283e(InterfaceC6511n interfaceC6511n) {
        super(2);
        this.f13194b = interfaceC6511n;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            this.f13194b.invoke(C9891D.f99599a, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
