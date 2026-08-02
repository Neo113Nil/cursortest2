package I0;

import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class Q extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M0 f11362b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f11363c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3215w0 f11364d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f11365e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(M0 m02, androidx.compose.ui.e eVar, C3215w0 c3215w0, C4912a c4912a) {
        super(2);
        this.f11362b = m02;
        this.f11363c = eVar;
        this.f11364d = c3215w0;
        this.f11365e = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C3996z.a(O0.a().c(this.f11362b), a1.c.c(935424596, new P(this.f11363c, this.f11364d, this.f11365e), interfaceC3967k2), interfaceC3967k2, 56);
        }
        return Unit.f71690a;
    }
}
