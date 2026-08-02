package K1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: K1.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3431k extends AbstractC7737t implements Function1<C3437q, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f15058b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float[] f15059c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.K f15060d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.J f15061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3431k(long j11, float[] fArr, kotlin.jvm.internal.K k11, kotlin.jvm.internal.J j12) {
        super(1);
        this.f15058b = j11;
        this.f15059c = fArr;
        this.f15060d = k11;
        this.f15061e = j12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C3437q c3437q) {
        C3437q c3437q2 = c3437q;
        int f7 = c3437q2.f();
        long j11 = this.f15058b;
        long a11 = S.a(c3437q2.q(f7 > Q.h(j11) ? c3437q2.f() : Q.h(j11)), c3437q2.q(c3437q2.b() < Q.g(j11) ? c3437q2.b() : Q.g(j11)));
        InterfaceC3436p e11 = c3437q2.e();
        kotlin.jvm.internal.K k11 = this.f15060d;
        int i11 = k11.f71785a;
        float[] fArr = this.f15059c;
        ((C3421a) e11).b(a11, fArr, i11);
        int f11 = (Q.f(a11) * 4) + k11.f71785a;
        int i12 = k11.f71785a;
        while (true) {
            kotlin.jvm.internal.J j12 = this.f15061e;
            if (i12 >= f11) {
                k11.f71785a = f11;
                j12.f71784a = ((C3421a) c3437q2.e()).h() + j12.f71784a;
                return Unit.f71690a;
            }
            int i13 = i12 + 1;
            float f12 = fArr[i13];
            float f13 = j12.f71784a;
            fArr[i13] = f12 + f13;
            int i14 = i12 + 3;
            fArr[i14] = fArr[i14] + f13;
            i12 += 4;
        }
    }
}
