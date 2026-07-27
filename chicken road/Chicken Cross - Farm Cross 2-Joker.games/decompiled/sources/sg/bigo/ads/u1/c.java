package sg.bigo.ads.u1;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f13335a;

    public c(g gVar) {
        this.f13335a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.I0.g.c(this.f13335a.f)) {
            this.f13335a.a();
            return;
        }
        g gVar = this.f13335a;
        gVar.b = null;
        gVar.b();
    }
}
