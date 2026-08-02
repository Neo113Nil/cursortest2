package J0;

import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;

/* loaded from: classes8.dex */
final class g3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Float f13225b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f13226c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f13227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g3(long j11, C4912a c4912a, Float f7) {
        super(2);
        this.f13225b = f7;
        this.f13226c = c4912a;
        this.f13227d = j11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C4912a c4912a = this.f13226c;
            Float f7 = this.f13225b;
            if (f7 != null) {
                interfaceC3967k2.o(-1178229056);
                C3996z.a(C3359x.a().c(f7), c4912a, interfaceC3967k2, 8);
                interfaceC3967k2.k();
            } else {
                interfaceC3967k2.o(-1178050310);
                C3996z.a(C3359x.a().c(Float.valueOf(C7807Z.q(this.f13227d))), c4912a, interfaceC3967k2, 8);
                interfaceC3967k2.k();
            }
        }
        return Unit.f71690a;
    }
}
