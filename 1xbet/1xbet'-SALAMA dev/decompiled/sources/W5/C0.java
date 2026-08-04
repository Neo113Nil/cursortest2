package W5;

import U5.EnumC0446m;

/* JADX INFO: loaded from: classes2.dex */
public final class C0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q0 f6752b;

    public /* synthetic */ C0(Q0 q1, int i7) {
        this.f6751a = i7;
        this.f6752b = q1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6751a) {
            case 0:
                this.f6752b.B(true);
                break;
            case 1:
                Q0 q1 = this.f6752b;
                if (!q1.f6939J.get() && q1.f6930A != null) {
                    q1.B(false);
                    Q0.y(q1);
                    break;
                }
                break;
            case 2:
                this.f6752b.C();
                if (this.f6752b.f6931B != null) {
                    this.f6752b.f6931B.getClass();
                }
                I0 i7 = this.f6752b.f6930A;
                if (i7 != null) {
                    ((U5.N) i7.f6822d.f17380c).e();
                }
                break;
            case 3:
                Q0 q7 = this.f6752b;
                q7.f6947R.l(2, "Entering SHUTDOWN state");
                q7.f6977u.b(EnumC0446m.f6554e);
                break;
            case 4:
                Q0 q8 = this.f6752b;
                if (!q8.f6940K) {
                    q8.f6940K = true;
                    Q0.z(q8);
                    break;
                }
                break;
            default:
                Q0 q9 = this.f6752b;
                if (q9.f6930A != null) {
                    Q0.y(q9);
                    break;
                }
                break;
        }
    }
}
