package i4;

import n4.C1473g;
import n4.C1479m;
import v4.r;

/* renamed from: i4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1268e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f13993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q4.e f13994c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1269f f13995d;

    public /* synthetic */ RunnableC1268e(C1269f c1269f, r rVar, q4.e eVar, int i7) {
        this.f13992a = i7;
        this.f13995d = c1269f;
        this.f13993b = rVar;
        this.f13994c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13992a) {
            case 0:
                C1269f c1269f = this.f13995d;
                ((C1479m) c1269f.f1723b).s((C1473g) c1269f.f1725d, this.f13993b, (q4.j) this.f13994c.f15858b);
                break;
            default:
                C1269f c1269f2 = this.f13995d;
                ((C1479m) c1269f2.f1723b).s(((C1473g) c1269f2.f1725d).t(v4.c.f17171d), this.f13993b, (q4.j) this.f13994c.f15858b);
                break;
        }
    }
}
