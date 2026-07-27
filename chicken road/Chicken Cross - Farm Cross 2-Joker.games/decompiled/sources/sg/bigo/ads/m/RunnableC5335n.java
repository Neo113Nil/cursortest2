package sg.bigo.ads.m;

/* renamed from: sg.bigo.ads.m.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5335n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5336o f13093a;

    public RunnableC5335n(RunnableC5336o runnableC5336o) {
        this.f13093a = runnableC5336o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var = this.f13093a.f13094a;
        if (e0Var.q.r) {
            return;
        }
        e0.a(e0Var, 3L, 0L, 300L);
    }
}
