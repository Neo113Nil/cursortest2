package sg.bigo.ads.h;

/* renamed from: sg.bigo.ads.h.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5173h2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H2 f12892a;

    public RunnableC5173h2(H2 h2) {
        this.f12892a = h2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H2 h2 = this.f12892a;
        if (!h2.l0 && !h2.w && h2.z != null && h2.R0()) {
            h2.w = true;
            ((C5185l1) h2.e).D().a((sg.bigo.ads.U.j) null, 8, 22);
        }
        Y0 y0 = this.f12892a.J;
        if (y0 != null) {
            if (y0.N) {
                return;
            }
            if (y0.I.a(new RunnableC5169g2(this))) {
                return;
            }
        }
        this.f12892a.o(1);
    }
}
