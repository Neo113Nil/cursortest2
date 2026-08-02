package w1;

import java.util.HashMap;

/* renamed from: w1.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1682c0 extends G2 {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f17654C = 0;

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f17655A;

    /* renamed from: B, reason: collision with root package name */
    public Object f17656B;

    public /* synthetic */ C1682c0(int i7) {
        this.f17655A = i7;
    }

    public static /* synthetic */ void j(C1682c0 c1682c0, boolean z4) {
        int i7 = z4 ? 2 : 3;
        int i8 = ((K2) c1682c0.f17656B).f17444b;
        if (i8 != i7) {
            c1682c0.f17656B = new K2(i8, i7);
            c1682c0.k();
        }
    }

    @Override // w1.G2
    public void i(I2 i22) {
        switch (this.f17655A) {
            case 2:
                super.i(i22);
                d(new com.flurry.android.marketing.messaging.notification.b(25, i22, (K2) this.f17656B, false));
                break;
            default:
                super.i(i22);
                break;
        }
    }

    public void k() {
        K2 k22 = (K2) this.f17656B;
        int i7 = k22.f17443a;
        int i8 = k22.f17444b;
        HashMap hashMap = new HashMap();
        hashMap.put("previous_state", L.q(((K2) this.f17656B).f17443a));
        hashMap.put("current_state", L.q(((K2) this.f17656B).f17444b));
        K2 k23 = (K2) this.f17656B;
        h(new K2(k23.f17443a, k23.f17444b));
    }
}
