package sg.bigo.ads.n;

/* loaded from: classes3.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5400s f13188a;

    public r(RunnableC5400s runnableC5400s) {
        this.f13188a = runnableC5400s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC5400s runnableC5400s = this.f13188a;
        runnableC5400s.b.a(runnableC5400s.f13190a > 0);
    }
}
