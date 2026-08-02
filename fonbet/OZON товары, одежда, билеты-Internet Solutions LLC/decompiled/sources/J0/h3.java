package J0;

import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;

/* loaded from: classes8.dex */
final class h3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f13234b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Float f13235c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f13236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h3(long j11, C4912a c4912a, Float f7) {
        super(2);
        this.f13234b = j11;
        this.f13235c = f7;
        this.f13236d = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            S0.O a11 = C3363y.a();
            long j11 = this.f13234b;
            C3996z.a(a11.c(C7807Z.m(j11)), a1.c.c(-1132188434, new g3(j11, this.f13236d, this.f13235c), interfaceC3967k2), interfaceC3967k2, 56);
        }
        return Unit.f71690a;
    }
}
