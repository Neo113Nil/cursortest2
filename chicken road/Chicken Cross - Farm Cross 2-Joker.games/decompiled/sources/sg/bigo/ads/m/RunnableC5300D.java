package sg.bigo.ads.m;

/* renamed from: sg.bigo.ads.m.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5300D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f13063a;
    public final /* synthetic */ C5301E b;

    public RunnableC5300D(C5301E c5301e, RunnableC5324c runnableC5324c) {
        this.b = c5301e;
        this.f13063a = runnableC5324c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f13063a;
        if (runnable != null) {
            runnable.run();
        }
        this.b.k();
    }
}
