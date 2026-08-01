package sg.bigo.ads.h1;

/* loaded from: classes3.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f12968a;

    public o(p pVar) {
        this.f12968a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.I0.g.c(this.f12968a.d)) {
            this.f12968a.b();
            return;
        }
        p pVar = this.f12968a;
        sg.bigo.ads.i1.c.a(pVar.e);
        pVar.e = null;
        this.f12968a.c();
    }
}
