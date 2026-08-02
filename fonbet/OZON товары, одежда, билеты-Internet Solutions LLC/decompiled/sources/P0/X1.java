package P0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import u0.InterfaceC9890C;

/* loaded from: classes8.dex */
final class X1 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f20907b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X1(String str) {
        super(3);
        this.f20907b = str;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            p2.b(this.f20907b, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, interfaceC3967k2, 0, 0, 131070);
        }
        return Unit.f71690a;
    }
}
