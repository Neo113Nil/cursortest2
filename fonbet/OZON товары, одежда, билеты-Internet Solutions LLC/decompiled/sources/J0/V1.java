package J0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class V1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f13026b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f13027c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f13028d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f13029e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3341s1 f13030f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4912a f13031g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f13032h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C3281d2 f13033i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V1(int i11, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C3341s1 c3341s1, C4912a c4912a4, C4912a c4912a5, C3281d2 c3281d2) {
        super(2);
        this.f13026b = i11;
        this.f13027c = c4912a;
        this.f13028d = c4912a2;
        this.f13029e = c4912a3;
        this.f13030f = c3341s1;
        this.f13031g = c4912a4;
        this.f13032h = c4912a5;
        this.f13033i = c3281d2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C4912a c11 = a1.c.c(433906483, new U1(this.f13032h, this.f13033i), interfaceC3967k2);
            C4912a c4912a = this.f13029e;
            Q1.c(this.f13026b, this.f13027c, this.f13028d, c11, c4912a, this.f13030f, this.f13031g, interfaceC3967k2, 24576);
        }
        return Unit.f71690a;
    }
}
