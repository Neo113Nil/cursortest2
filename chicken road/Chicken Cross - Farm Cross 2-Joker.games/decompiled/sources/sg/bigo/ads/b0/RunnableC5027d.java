package sg.bigo.ads.b0;

/* renamed from: sg.bigo.ads.b0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5027d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12691a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ g c;

    public RunnableC5027d(g gVar, f fVar, e eVar) {
        this.c = gVar;
        this.f12691a = fVar;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f12691a;
        fVar.b.run();
        fVar.f12693a.countDown();
        this.b.run();
        synchronized (this.c.b) {
            this.c.f12694a.remove(this.b);
        }
    }
}
