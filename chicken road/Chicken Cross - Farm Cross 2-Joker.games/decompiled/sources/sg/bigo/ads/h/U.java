package sg.bigo.ads.h;

/* loaded from: classes3.dex */
public final class U extends sg.bigo.ads.K0.E {
    public final /* synthetic */ Runnable i;
    public final /* synthetic */ W j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w, long j, Runnable runnable) {
        super(j, 1000L);
        this.j = w;
        this.i = runnable;
    }

    @Override // sg.bigo.ads.K0.E
    public final void a(long j) {
    }

    @Override // sg.bigo.ads.K0.E
    public final void c() {
        Runnable runnable;
        W w = this.j;
        if (w.f12858a || (runnable = this.i) == null) {
            return;
        }
        V v = w.c;
        if (v != null) {
            v.a(runnable);
        } else {
            runnable.run();
        }
    }
}
