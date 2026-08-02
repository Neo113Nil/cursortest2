package P0;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class G1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<InterfaceC3793z1, InterfaceC3967k, Integer, Unit> f20640b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3793z1 f20641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    G1(InterfaceC6511n<? super InterfaceC3793z1, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC3793z1 interfaceC3793z1) {
        super(2);
        this.f20640b = interfaceC6511n;
        this.f20641c = interfaceC3793z1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            InterfaceC3793z1 interfaceC3793z1 = this.f20641c;
            Intrinsics.f(interfaceC3793z1);
            this.f20640b.invoke(interfaceC3793z1, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
