package sg.bigo.ads.h;

/* loaded from: classes3.dex */
public final class D0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y0 f12811a;

    public D0(Y0 y0) {
        this.f12811a = y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        if (!Y0.a(this.f12811a)) {
            Runnable runnable2 = this.f12811a.G;
            if (runnable2 != null) {
                runnable2.run();
                this.f12811a.G = null;
            }
            Y0 y0 = this.f12811a;
            if (y0.t && (runnable = y0.g) != null) {
                runnable.run();
                y0.f = null;
            }
        }
        Y0 y02 = this.f12811a;
        y02.E = null;
        y02.F = null;
    }
}
