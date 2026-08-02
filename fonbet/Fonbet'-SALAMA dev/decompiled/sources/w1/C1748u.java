package w1;

/* renamed from: w1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1748u implements I2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1751v f17875b;

    public /* synthetic */ C1748u(C1751v c1751v, int i7) {
        this.f17874a = i7;
        this.f17875b = c1751v;
    }

    @Override // w1.I2
    public final /* synthetic */ void a(Object obj) {
        switch (this.f17874a) {
            case 0:
                this.f17875b.d(new com.flurry.android.marketing.messaging.notification.b(3, this, (I) obj));
                break;
            default:
                this.f17875b.j();
                break;
        }
    }
}
