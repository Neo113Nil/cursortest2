package P0;

import B0.C2454a;
import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class R0 extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f20775b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f20776c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2454a f20777d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t0.q f20778e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f20779f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f20780g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f20781h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ k2 f20782i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ l1.J0 f20783j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R0(String str, boolean z11, C2454a c2454a, t0.q qVar, boolean z12, C4912a c4912a, C4912a c4912a2, k2 k2Var, l1.J0 j02) {
        super(3);
        this.f20775b = str;
        this.f20776c = z11;
        this.f20777d = c2454a;
        this.f20778e = qVar;
        this.f20779f = z12;
        this.f20780g = c4912a;
        this.f20781h = c4912a2;
        this.f20782i = k2Var;
        this.f20783j = j02;
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
            int i11 = intValue;
            O0 o02 = O0.f20735a;
            k2 k2Var = this.f20782i;
            l1.J0 j02 = this.f20783j;
            boolean z11 = this.f20776c;
            boolean z12 = this.f20779f;
            t0.q qVar = this.f20778e;
            o02.b(this.f20775b, function22, z11, this.f20777d, qVar, z12, this.f20780g, this.f20781h, k2Var, null, a1.c.c(2108828640, new Q0(z11, z12, qVar, k2Var, j02), interfaceC3967k2), interfaceC3967k2, (i11 << 3) & 112);
        }
        return Unit.f71690a;
    }
}
