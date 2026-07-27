package sg.bigo.ads.i;

/* renamed from: sg.bigo.ads.i.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5233e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12980a;
    public final /* synthetic */ C5234f b;

    public RunnableC5233e(C5234f c5234f, int i) {
        this.b = c5234f;
        this.f12980a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int min;
        C5236h c5236h = this.b.f12981a;
        if (c5236h.i || c5236h.j) {
            return;
        }
        int i = this.f12980a;
        if (c5236h.c != null && (min = Math.min(i, 95)) > c5236h.k) {
            c5236h.k = min;
            c5236h.c.setProgress(min);
        }
    }
}
