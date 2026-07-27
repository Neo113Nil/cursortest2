package sg.bigo.ads.n;

/* renamed from: sg.bigo.ads.n.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5373e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Integer f13165a;
    public final /* synthetic */ long b;
    public final /* synthetic */ C5375f c;

    public RunnableC5373e(C5375f c5375f, Integer num, long j) {
        this.c = c5375f;
        this.f13165a = num;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5391n abstractC5391n = this.c.f13167a;
        sg.bigo.ads.E0.p.a(abstractC5391n.u, abstractC5391n.s.a(this.f13165a.intValue()), new C5371d(this));
    }
}
