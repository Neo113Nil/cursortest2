package P0;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;

/* loaded from: classes8.dex */
final class Y1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f20926b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3793z1 f20927c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f20928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y1(long j11, InterfaceC3793z1 interfaceC3793z1, String str) {
        super(2);
        this.f20926b = j11;
        this.f20927c = interfaceC3793z1;
        this.f20928d = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            int i11 = C3723c.f20990e;
            j11 = C7807Z.f72259m;
            j12 = C7807Z.f72259m;
            j13 = C7807Z.f72259m;
            C3756n c3756n = (C3756n) interfaceC3967k2.m(C3759o.d());
            C3720b g10 = c3756n.g();
            if (g10 == null) {
                j14 = C7807Z.f72258l;
                long c11 = C3759o.c(c3756n, R0.q.c());
                j15 = C7807Z.f72258l;
                g10 = new C3720b(j14, c11, j15, C7807Z.o(0.38f, C3759o.c(c3756n, R0.q.b())));
                c3756n.V(g10);
            }
            C3720b c12 = g10.c(j11, this.f20926b, j12, j13);
            InterfaceC3793z1 interfaceC3793z1 = this.f20927c;
            boolean n11 = interfaceC3967k2.n(interfaceC3793z1);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new W1(interfaceC3793z1);
                interfaceC3967k2.x(C11);
            }
            C3753m.c((Function0) C11, null, false, null, c12, null, a1.c.c(521110564, new X1(this.f20928d), interfaceC3967k2), interfaceC3967k2, 805306368);
        }
        return Unit.f71690a;
    }
}
