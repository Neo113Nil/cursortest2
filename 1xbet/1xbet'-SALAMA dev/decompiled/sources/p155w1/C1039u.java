package p155w1;

import com.flurry.android.marketing.messaging.notification.b;

/* JADX INFO: renamed from: w1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1039u implements I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1042v f17881b;

    public /* synthetic */ C1039u(C1042v c1042v, int i7) {
        this.f17880a = i7;
        this.f17881b = c1042v;
    }

    @Override // p155w1.I2
    public final /* synthetic */ void a(Object obj) {
        switch (this.f17880a) {
            case 0:
                this.f17881b.d(new b(3, this, (I) obj));
                break;
            default:
                this.f17881b.j();
                break;
        }
    }
}
