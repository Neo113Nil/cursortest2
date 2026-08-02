package J0;

import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;

/* loaded from: classes8.dex */
final class M0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f12897b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f12898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M0(long j11, C4912a c4912a) {
        super(2);
        this.f12897b = j11;
        this.f12898c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C3996z.a(C3359x.a().c(Float.valueOf(C7807Z.q(this.f12897b))), a1.c.c(1867794295, new L0(this.f12898c), interfaceC3967k2), interfaceC3967k2, 56);
        }
        return Unit.f71690a;
    }
}
