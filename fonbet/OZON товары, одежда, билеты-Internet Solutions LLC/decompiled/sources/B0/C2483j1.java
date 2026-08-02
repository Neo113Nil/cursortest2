package B0;

import k1.C7460f;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import n1.InterfaceC8410c;

/* renamed from: B0.j1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2483j1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E0.G f1822b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Q1.D f1823c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Q1.K f1824d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ O0 f1825e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC7799Q f1826f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2483j1(E0.G g10, Q1.D d11, Q1.K k11, O0 o02, AbstractC7799Q abstractC7799Q) {
        super(1);
        this.f1822b = g10;
        this.f1823c = d11;
        this.f1824d = k11;
        this.f1825e = o02;
        this.f1826f = abstractC7799Q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        K1.K e11;
        InterfaceC8410c interfaceC8410c2 = interfaceC8410c;
        interfaceC8410c2.F0();
        float d11 = this.f1822b.d();
        if (d11 != 0.0f) {
            long e12 = this.f1824d.e();
            int i11 = K1.Q.f15010c;
            int originalToTransformed = this.f1823c.originalToTransformed((int) (e12 >> 32));
            R1 j11 = this.f1825e.j();
            C7460f c7460f = (j11 == null || (e11 = j11.e()) == null) ? new C7460f(0.0f, 0.0f, 0.0f, 0.0f) : e11.e(originalToTransformed);
            float v12 = interfaceC8410c2.v1(C2489l1.a());
            float f7 = v12 / 2;
            float n11 = c7460f.n() + f7;
            float f11 = C7464j.f(interfaceC8410c2.i()) - f7;
            if (n11 > f11) {
                n11 = f11;
            }
            if (n11 >= f7) {
                f7 = n11;
            }
            interfaceC8410c2.h0(this.f1826f, P9.a.a(f7, c7460f.q()), P9.a.a(f7, c7460f.h()), v12, (r17 & 64) != 0 ? 1.0f : d11);
        }
        return Unit.f71690a;
    }
}
