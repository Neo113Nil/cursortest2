package p155w1;

import com.flurry.android.marketing.messaging.notification.b;
import java.util.HashMap;

/* JADX INFO: renamed from: w1.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0973c0 extends G2 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f17660C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f17661A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Object f17662B;

    public /* synthetic */ C0973c0(int i7) {
        this.f17661A = i7;
    }

    public static /* synthetic */ void j(C0973c0 c0973c0, boolean z4) {
        int i7 = z4 ? 2 : 3;
        int i8 = ((K2) c0973c0.f17662B).f17450b;
        if (i8 != i7) {
            c0973c0.f17662B = new K2(i8, i7);
            c0973c0.k();
        }
    }

    @Override // p155w1.G2
    public void i(I2 i7) {
        switch (this.f17661A) {
            case 2:
                super.i(i7);
                d(new b(25, i7, (K2) this.f17662B, false));
                break;
            default:
                super.i(i7);
                break;
        }
    }

    public void k() {
        K2 k7 = (K2) this.f17662B;
        int i7 = k7.f17449a;
        int i8 = k7.f17450b;
        HashMap map = new HashMap();
        map.put("previous_state", L.q(((K2) this.f17662B).f17449a));
        map.put("current_state", L.q(((K2) this.f17662B).f17450b));
        K2 k8 = (K2) this.f17662B;
        h(new K2(k8.f17449a, k8.f17450b));
    }
}
