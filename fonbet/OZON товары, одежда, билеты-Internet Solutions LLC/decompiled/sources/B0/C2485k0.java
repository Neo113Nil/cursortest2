package B0;

import B0.O0;
import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2485k0 extends AbstractC7737t implements InterfaceC6511n<Integer, Integer, Boolean, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Q1.D f1828b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f1829c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Q1.K f1830d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1831e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ O0 f1832f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2485k0(Q1.D d11, boolean z11, Q1.K k11, I0.W0 w02, O0 o02) {
        super(3);
        this.f1828b = d11;
        this.f1829c = z11;
        this.f1830d = k11;
        this.f1831e = w02;
        this.f1832f = o02;
    }

    @Override // fd.InterfaceC6511n
    public final Boolean invoke(Integer num, Integer num2, Boolean bool) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        boolean booleanValue = bool.booleanValue();
        Q1.D d11 = this.f1828b;
        if (!booleanValue) {
            intValue = d11.transformedToOriginal(intValue);
        }
        if (!booleanValue) {
            intValue2 = d11.transformedToOriginal(intValue2);
        }
        boolean z11 = false;
        if (this.f1829c) {
            Q1.K k11 = this.f1830d;
            long e11 = k11.e();
            int i11 = K1.Q.f15010c;
            if (intValue != ((int) (e11 >> 32)) || intValue2 != ((int) (k11.e() & 4294967295L))) {
                int min = Math.min(intValue, intValue2);
                I0.W0 w02 = this.f1831e;
                if (min < 0 || Math.max(intValue, intValue2) > k11.c().length()) {
                    w02.u();
                } else {
                    z11 = true;
                    if (booleanValue || intValue == intValue2) {
                        w02.u();
                    } else {
                        w02.t(true);
                    }
                    ((O0.b) this.f1832f.m()).invoke(new Q1.K(k11.c(), K1.S.a(intValue, intValue2), 4));
                }
            }
        }
        return Boolean.valueOf(z11);
    }
}
