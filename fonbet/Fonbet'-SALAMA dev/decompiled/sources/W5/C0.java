package W5;

import U5.EnumC0446m;

/* loaded from: classes2.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q0 f6752b;

    public /* synthetic */ C0(Q0 q02, int i7) {
        this.f6751a = i7;
        this.f6752b = q02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6751a) {
            case 0:
                this.f6752b.B(true);
                break;
            case 1:
                Q0 q02 = this.f6752b;
                if (!q02.f6939J.get() && q02.f6930A != null) {
                    q02.B(false);
                    Q0.y(q02);
                    break;
                }
                break;
            case 2:
                this.f6752b.C();
                if (this.f6752b.f6931B != null) {
                    this.f6752b.f6931B.getClass();
                }
                I0 i02 = this.f6752b.f6930A;
                if (i02 != null) {
                    ((U5.N) i02.f6822d.f17374c).e();
                    break;
                }
                break;
            case 3:
                Q0 q03 = this.f6752b;
                q03.f6947R.l(2, "Entering SHUTDOWN state");
                q03.f6977u.b(EnumC0446m.f6554e);
                break;
            case 4:
                Q0 q04 = this.f6752b;
                if (!q04.f6940K) {
                    q04.f6940K = true;
                    Q0.z(q04);
                    break;
                }
                break;
            default:
                Q0 q05 = this.f6752b;
                if (q05.f6930A != null) {
                    Q0.y(q05);
                    break;
                }
                break;
        }
    }
}
