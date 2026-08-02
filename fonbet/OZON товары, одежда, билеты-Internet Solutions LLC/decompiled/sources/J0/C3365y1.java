package J0;

import B0.C2454a;
import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.y1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3365y1 extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13498b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f13499c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f13500d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2454a f13501e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ t0.q f13502f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f13503g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f13504h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C4912a f13505i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C4912a f13506j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ A0.a f13507k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ T2 f13508l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3365y1(String str, boolean z11, boolean z12, C2454a c2454a, t0.q qVar, boolean z13, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, A0.a aVar, T2 t2) {
        super(3);
        this.f13498b = str;
        this.f13499c = z11;
        this.f13500d = z12;
        this.f13501e = c2454a;
        this.f13502f = qVar;
        this.f13503g = z13;
        this.f13504h = c4912a;
        this.f13505i = c4912a2;
        this.f13506j = c4912a3;
        this.f13507k = aVar;
        this.f13508l = t2;
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
            T2 t2 = this.f13508l;
            boolean z11 = this.f13499c;
            boolean z12 = this.f13503g;
            t0.q qVar = this.f13502f;
            A0.a aVar = this.f13507k;
            w22.b(this.f13498b, function22, z11, this.f13500d, this.f13501e, qVar, z12, this.f13504h, this.f13505i, this.f13506j, aVar, t2, null, a1.c.c(1757478222, new C3361x1(z11, z12, qVar, t2, aVar), interfaceC3967k2), interfaceC3967k2, (intValue << 3) & 112);
        }
        return Unit.f71690a;
    }
}
