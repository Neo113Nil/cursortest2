package P0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9915y;

/* renamed from: P0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3741i extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f21076b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9915y f21077c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f21078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3741i(long j11, C9915y c9915y, C4912a c4912a) {
        super(2);
        this.f21076b = j11;
        this.f21077c = c9915y;
        this.f21078d = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            Q0.i.a(this.f21076b, ((u2) interfaceC3967k2.m(v2.a())).j(), a1.c.c(1327513942, new C3738h(this.f21077c, this.f21078d), interfaceC3967k2), interfaceC3967k2, 384);
        }
        return Unit.f71690a;
    }
}
