package I0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class P extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f11357b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3215w0 f11358c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f11359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(androidx.compose.ui.e eVar, C3215w0 c3215w0, C4912a c4912a) {
        super(2);
        this.f11357b = eVar;
        this.f11358c = c3215w0;
        this.f11359d = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C3215w0 c3215w0 = this.f11358c;
            R0.a(this.f11357b.l0(c3215w0.v()), a1.c.c(1375295262, new O(this.f11359d, c3215w0), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
