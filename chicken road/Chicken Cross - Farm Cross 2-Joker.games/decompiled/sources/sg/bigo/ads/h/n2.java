package sg.bigo.ads.h;

/* loaded from: classes3.dex */
public final class n2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H2 f12910a;

    public n2(H2 h2) {
        this.f12910a = h2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.f12910a.e)) {
            return;
        }
        this.f12910a.o(5);
        this.f12910a.p0 = false;
    }
}
