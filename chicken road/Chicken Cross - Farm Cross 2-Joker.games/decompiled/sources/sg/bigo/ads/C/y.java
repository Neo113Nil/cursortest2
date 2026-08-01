package sg.bigo.ads.C;

/* loaded from: classes3.dex */
public final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f12242a;

    public y(z zVar) {
        this.f12242a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.R.b a2 = sg.bigo.ads.R.b.a(((sg.bigo.ads.U0.b) this.f12242a.f12243a.b.c).l);
        a2.c = false;
        B b = this.f12242a.f12243a.b;
        sg.bigo.ads.z1.p pVar = b.d;
        int i = pVar.v;
        int i2 = pVar.u;
        B b2 = this.f12242a.f12243a.b;
        b.g = new sg.bigo.ads.r1.j(b2.b, i, i2, a2, b2.c);
        B b3 = this.f12242a.f12243a.b;
        b3.g.setOnEventListener(b3.f);
    }
}
