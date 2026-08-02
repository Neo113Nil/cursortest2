package J0;

import B0.C2454a;
import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class C1 extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q1.K f12691b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f12692c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2454a f12693d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t0.q f12694e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4912a f12695f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f12696g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ A0.a f12697h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ T2 f12698i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1(Q1.K k11, boolean z11, C2454a c2454a, t0.q qVar, C4912a c4912a, C4912a c4912a2, A0.a aVar, T2 t2) {
        super(3);
        this.f12691b = k11;
        this.f12692c = z11;
        this.f12693d = c2454a;
        this.f12694e = qVar;
        this.f12695f = c4912a;
        this.f12696g = c4912a2;
        this.f12697h = aVar;
        this.f12698i = t2;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> function2, InterfaceC3967k interfaceC3967k, Integer num) {
        Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> function22 = function2;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.F(function22) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            W2 w22 = W2.f13064a;
            String f7 = this.f12691b.f();
            T2 t2 = this.f12698i;
            boolean z11 = this.f12692c;
            t0.q qVar = this.f12694e;
            A0.a aVar = this.f12697h;
            w22.b(f7, function22, z11, false, this.f12693d, qVar, false, this.f12695f, null, this.f12696g, aVar, t2, null, a1.c.c(-794566495, new B1(z11, qVar, t2, aVar), interfaceC3967k2), interfaceC3967k2, (intValue << 3) & 112);
        }
        return Unit.f71690a;
    }
}
