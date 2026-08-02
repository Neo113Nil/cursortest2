package J0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.b3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3272b3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f13149b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f13150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3272b3(long j11, C4912a c4912a) {
        super(2);
        this.f13149b = j11;
        this.f13150c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            j3.b(this.f13149b, null, this.f13150c, interfaceC3967k2, 0, 6);
        }
        return Unit.f71690a;
    }
}
