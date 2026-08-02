package J0;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.x1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3361x1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f13471b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f13472c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ t0.q f13473d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ T2 f13474e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ A0.a f13475f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3361x1(boolean z11, boolean z12, t0.q qVar, T2 t2, A0.a aVar) {
        super(2);
        this.f13471b = z11;
        this.f13472c = z12;
        this.f13473d = qVar;
        this.f13474e = t2;
        this.f13475f = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            W2.f13064a.a(this.f13471b, this.f13472c, this.f13473d, this.f13474e, this.f13475f, 0.0f, 0.0f, interfaceC3967k2, 12582912);
        }
        return Unit.f71690a;
    }
}
