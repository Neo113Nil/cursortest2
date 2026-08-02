package P0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class R1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f20784b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f20785c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f20786d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K1.T f20787e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f20788f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f20789g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R1(Function2 function2, C4912a c4912a, C4912a c4912a2, K1.T t2, long j11, long j12) {
        super(2);
        this.f20784b = function2;
        this.f20785c = c4912a;
        this.f20786d = c4912a2;
        this.f20787e = t2;
        this.f20788f = j11;
        this.f20789g = j12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            interfaceC3967k2.o(-810701708);
            b2.c(this.f20785c, this.f20784b, this.f20786d, this.f20787e, this.f20788f, this.f20789g, interfaceC3967k2, 0);
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}
