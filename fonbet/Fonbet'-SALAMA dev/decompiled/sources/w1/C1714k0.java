package w1;

/* renamed from: w1.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1714k0 implements I2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1682c0 f17757b;

    public /* synthetic */ C1714k0(C1682c0 c1682c0, int i7) {
        this.f17756a = i7;
        this.f17757b = c1682c0;
    }

    @Override // w1.I2
    public final /* synthetic */ void a(Object obj) {
        switch (this.f17756a) {
            case 0:
                this.f17757b.d(new com.flurry.android.marketing.messaging.notification.b(8, this, (C1686d0) obj));
                break;
            default:
                this.f17757b.d(new com.flurry.android.marketing.messaging.notification.b(9, this, (I) obj));
                break;
        }
    }
}
