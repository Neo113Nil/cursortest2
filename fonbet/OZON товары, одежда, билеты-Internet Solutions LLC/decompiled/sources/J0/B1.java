package J0;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class B1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f12673b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t0.q f12674c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ T2 f12675d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ A0.a f12676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B1(boolean z11, t0.q qVar, T2 t2, A0.a aVar) {
        super(2);
        this.f12673b = z11;
        this.f12674c = qVar;
        this.f12675d = t2;
        this.f12676e = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            W2.f13064a.a(this.f12673b, false, this.f12674c, this.f12675d, this.f12676e, 0.0f, 0.0f, interfaceC3967k2, 12582912);
        }
        return Unit.f71690a;
    }
}
