package sg.bigo.ads.n;

/* renamed from: sg.bigo.ads.n.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5385k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13176a;
    public final /* synthetic */ C5387l b;

    public RunnableC5385k(C5387l c5387l, int i) {
        this.b = c5387l;
        this.f13176a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5387l c5387l = this.b;
        sg.bigo.ads.h.T.a(c5387l.f13178a, this.f13176a, c5387l.b);
    }
}
