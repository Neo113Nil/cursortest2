package J0;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class G2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f12809b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3295g2 f12810c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f12811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G2(long j11, InterfaceC3295g2 interfaceC3295g2, String str) {
        super(2);
        this.f12809b = j11;
        this.f12810c = interfaceC3295g2;
        this.f12811d = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            int i11 = C3304j.f13245e;
            InterfaceC3300i e11 = C3304j.e(this.f12809b, interfaceC3967k2, 5);
            InterfaceC3295g2 interfaceC3295g2 = this.f12810c;
            boolean F11 = interfaceC3967k2.F(interfaceC3295g2);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new E2(interfaceC3295g2);
                interfaceC3967k2.x(C11);
            }
            C3332q.b((Function0) C11, null, e11, a1.c.c(-929149933, new F2(this.f12811d), interfaceC3967k2), interfaceC3967k2, 805306368, 382);
        }
        return Unit.f71690a;
    }
}
