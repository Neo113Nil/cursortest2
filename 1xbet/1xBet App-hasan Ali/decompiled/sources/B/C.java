package B;

import P.C0299j0;
import a.AbstractC0444a;
import i4.InterfaceC2015a;
import x.P;

/* loaded from: classes.dex */
public final class C extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f611l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F f612m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(F f, int i) {
        super(0);
        this.f611l = i;
        this.f612m = f;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        long b3;
        switch (this.f611l) {
            case 0:
                F f = this.f612m;
                A.E e3 = f.f624z.f45a;
                if (e3.g().f115n == P.f20695k) {
                    x0.P p5 = e3.g().f118q;
                    b3 = AbstractC0444a.b(p5.getWidth(), p5.c()) & 4294967295L;
                } else {
                    x0.P p6 = e3.g().f118q;
                    b3 = AbstractC0444a.b(p6.getWidth(), p6.c()) >> 32;
                }
                int i = (int) b3;
                A.E e5 = f.f624z.f45a;
                return Float.valueOf(i - ((-e5.g().f112k) + e5.g().f116o));
            case 1:
                A.E e6 = this.f612m.f624z.f45a;
                return Float.valueOf((((C0299j0) e6.f12d.f133b).h() * 500) + ((C0299j0) e6.f12d.f134c).h());
            default:
                A.E e7 = this.f612m.f624z.f45a;
                int h3 = ((C0299j0) e7.f12d.f133b).h();
                int h4 = ((C0299j0) e7.f12d.f134c).h();
                return Float.valueOf(e7.c() ? (h3 * 500) + h4 + 100 : (h3 * 500) + h4);
        }
    }
}
