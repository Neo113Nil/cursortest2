package sg.bigo.ads.h;

import sg.bigo.ads.i.C5241m;

/* loaded from: classes3.dex */
public final class k2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5241m f12901a;
    public final /* synthetic */ int b = 7;
    public final /* synthetic */ H2 c;

    public k2(H2 h2, C5241m c5241m) {
        this.c = h2;
        this.f12901a = c5241m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.c.e)) {
            return;
        }
        H2 h2 = this.c;
        j2 j2Var = h2.g0;
        if (j2Var != null) {
            C5241m c5241m = this.f12901a;
            if (c5241m.e == j2Var) {
                c5241m.e = null;
            }
        }
        h2.p(this.b);
    }
}
