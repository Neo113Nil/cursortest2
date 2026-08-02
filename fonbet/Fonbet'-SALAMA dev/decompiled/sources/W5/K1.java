package W5;

import C0.RunnableC0085d;

/* loaded from: classes2.dex */
public final class K1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1 f6843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2 f6844c;

    public /* synthetic */ K1(h2 h2Var, M1 m12, int i7) {
        this.f6842a = i7;
        this.f6844c = h2Var;
        this.f6843b = m12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h2 h2Var = this.f6844c;
        switch (this.f6842a) {
            case 0:
                ((F0) h2Var.f7233c).f6778b.execute(new RunnableC0085d(this, 23));
                break;
            default:
                F0 f02 = (F0) h2Var.f7233c;
                U5.W w7 = F0.f6769E;
                f02.r(this.f6843b);
                break;
        }
    }
}
