package sg.bigo.ads.h;

/* loaded from: classes3.dex */
public final class v2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H2 f12936a;

    public v2(H2 h2) {
        this.f12936a = h2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y0 y0 = this.f12936a.J;
        if (y0 != null) {
            y0.c();
        }
    }
}
