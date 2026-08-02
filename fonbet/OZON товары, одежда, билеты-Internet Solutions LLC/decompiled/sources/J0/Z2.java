package J0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class Z2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f13119b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f13120c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f13121d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f13122e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f13123f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z2(float f7, long j11, C4912a c4912a, boolean z11, long j12) {
        super(2);
        this.f13119b = f7;
        this.f13120c = j11;
        this.f13121d = c4912a;
        this.f13122e = z11;
        this.f13123f = j12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            K1.T a11 = K1.U.a(((D3) interfaceC3967k2.m(E3.c())).f(), ((D3) interfaceC3967k2.m(E3.c())).d(), this.f13119b);
            if (this.f13122e) {
                a11 = K1.T.c(a11, this.f13123f, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
            }
            j3.b(this.f13120c, a11, this.f13121d, interfaceC3967k2, 384, 0);
        }
        return Unit.f71690a;
    }
}
