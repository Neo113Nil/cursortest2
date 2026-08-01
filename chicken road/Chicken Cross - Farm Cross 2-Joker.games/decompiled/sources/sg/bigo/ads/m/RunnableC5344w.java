package sg.bigo.ads.m;

/* renamed from: sg.bigo.ads.m.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5344w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f13103a;
    public final /* synthetic */ C5297A b;

    public RunnableC5344w(C5297A c5297a, RunnableC5324c runnableC5324c) {
        this.b = c5297a;
        this.f13103a = runnableC5324c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f13103a;
        if (runnable != null) {
            runnable.run();
        }
        this.b.k();
    }
}
