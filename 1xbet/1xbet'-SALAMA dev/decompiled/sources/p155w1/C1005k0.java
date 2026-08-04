package p155w1;

import com.flurry.android.marketing.messaging.notification.b;

/* JADX INFO: renamed from: w1.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1005k0 implements I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0973c0 f17763b;

    public /* synthetic */ C1005k0(C0973c0 c0973c0, int i7) {
        this.f17762a = i7;
        this.f17763b = c0973c0;
    }

    @Override // p155w1.I2
    public final /* synthetic */ void a(Object obj) {
        switch (this.f17762a) {
            case 0:
                this.f17763b.d(new b(8, this, (C0977d0) obj));
                break;
            default:
                this.f17763b.d(new b(9, this, (I) obj));
                break;
        }
    }
}
