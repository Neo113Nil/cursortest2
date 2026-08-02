package P0;

import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class S1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f20809b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f20810c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f20811d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f20812e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f20813f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S1(Function2 function2, C4912a c4912a, C4912a c4912a2, long j11, long j12) {
        super(2);
        this.f20809b = function2;
        this.f20810c = c4912a;
        this.f20811d = c4912a2;
        this.f20812e = j11;
        this.f20813f = j12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            K1.T b11 = v2.b(R0.o.i(), interfaceC3967k2);
            K1.T b12 = v2.b(R0.o.b(), interfaceC3967k2);
            C3996z.a(p2.d().c(b11), a1.c.c(835891690, new R1(this.f20809b, this.f20810c, this.f20811d, b12, this.f20812e, this.f20813f), interfaceC3967k2), interfaceC3967k2, 56);
        }
        return Unit.f71690a;
    }
}
