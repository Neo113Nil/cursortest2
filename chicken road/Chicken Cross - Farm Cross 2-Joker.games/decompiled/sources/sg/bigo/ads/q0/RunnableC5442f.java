package sg.bigo.ads.q0;

/* renamed from: sg.bigo.ads.q0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5442f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5444h f13253a;

    public RunnableC5442f(RunnableC5444h runnableC5444h) {
        this.f13253a = runnableC5444h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13253a.f13255a.run();
        RunnableC5444h runnableC5444h = this.f13253a;
        runnableC5444h.d.post(runnableC5444h.e);
    }
}
