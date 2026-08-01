package sg.bigo.ads.q0;

/* renamed from: sg.bigo.ads.q0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5443g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5444h f13254a;

    public RunnableC5443g(RunnableC5444h runnableC5444h) {
        this.f13254a = runnableC5444h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13254a.f13255a.run();
        RunnableC5444h runnableC5444h = this.f13254a;
        runnableC5444h.d.post(runnableC5444h.e);
    }
}
