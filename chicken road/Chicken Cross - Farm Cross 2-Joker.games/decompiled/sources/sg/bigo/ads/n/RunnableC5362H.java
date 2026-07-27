package sg.bigo.ads.n;

/* renamed from: sg.bigo.ads.n.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5362H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f13135a;
    public final /* synthetic */ N b;

    public RunnableC5362H(N n, RunnableC5360F runnableC5360F) {
        this.b = n;
        this.f13135a = runnableC5360F;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.D.post(new RunnableC5361G(this));
    }
}
