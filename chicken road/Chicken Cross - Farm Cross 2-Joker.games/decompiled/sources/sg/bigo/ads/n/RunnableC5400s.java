package sg.bigo.ads.n;

/* renamed from: sg.bigo.ads.n.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5400s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13190a;
    public final /* synthetic */ C5408w b;

    public RunnableC5400s(C5408w c5408w, int i) {
        this.b = c5408w;
        this.f13190a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.D.post(new r(this));
    }
}
