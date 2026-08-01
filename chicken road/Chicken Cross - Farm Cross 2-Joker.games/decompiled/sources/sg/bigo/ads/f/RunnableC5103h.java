package sg.bigo.ads.f;

/* renamed from: sg.bigo.ads.f.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5103h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.Q.a f12766a;
    public final /* synthetic */ C5111p b;

    public RunnableC5103h(C5111p c5111p, sg.bigo.ads.Q.a aVar) {
        this.b = c5111p;
        this.f12766a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5111p c5111p = this.b;
        if (c5111p.d != 0) {
            if (c5111p.a(this.f12766a)) {
                return;
            }
            this.f12766a.a(new sg.bigo.ads.P.d(3001, 10102, "Adx media load error when preload"));
            return;
        }
        C5110o c5110o = c5111p.e;
        if (c5110o != null) {
            c5110o.a(new sg.bigo.ads.P.d(3001, 10102, "Adx media load error because of destroying before loaded"));
        }
        this.b.e = new C5110o(this.f12766a);
        C5110o c5110o2 = this.b.e;
        c5110o2.c.postDelayed(new RunnableC5109n(c5110o2), 15000L);
        C5111p c5111p2 = this.b;
        if (c5111p2.a(c5111p2.e)) {
            return;
        }
        this.b.e.a(new sg.bigo.ads.P.d(3001, 10102, "Adx media load error when preload"));
    }
}
