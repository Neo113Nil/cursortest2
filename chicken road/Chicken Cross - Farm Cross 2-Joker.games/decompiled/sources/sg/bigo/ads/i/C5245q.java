package sg.bigo.ads.i;

import sg.bigo.ads.K0.z;
import sg.bigo.ads.h.G2;
import sg.bigo.ads.h.H2;

/* renamed from: sg.bigo.ads.i.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5245q {

    /* renamed from: a, reason: collision with root package name */
    public final G2 f12991a;
    public final sg.bigo.ads.T0.q b;
    public long c = 0;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public C5244p g;

    public C5245q(G2 g2, sg.bigo.ads.T0.q qVar) {
        this.f12991a = g2;
        this.b = qVar;
    }

    public final boolean a() {
        Integer a2;
        if (!this.d) {
            this.d = true;
            sg.bigo.ads.T0.q qVar = this.b;
            int intValue = (qVar == null || (a2 = z.a(qVar.a("playable_attr.playable_show_delay"))) == null) ? 0 : a2.intValue();
            this.c = intValue > 0 ? intValue * 1000 : 0L;
        }
        return this.c > 0;
    }

    public final void b() {
        sg.bigo.ads.T0.q qVar;
        Integer a2;
        if (this.e || this.f || !a()) {
            return;
        }
        H2 h2 = (H2) this.f12991a.f12823a.get();
        if (((h2 == null || (qVar = h2.t) == null || (a2 = z.a(qVar.a("mid_page.show_time"))) == null) ? 0 : a2.intValue()) == -1) {
            return;
        }
        H2 h22 = (H2) this.f12991a.f12823a.get();
        C5241m N0 = h22 == null ? null : h22.N0();
        if (N0 == null || !N0.f12988a || N0.b) {
            return;
        }
        H2 h23 = (H2) this.f12991a.f12823a.get();
        int d0 = h23 != null ? h23.d0() : -1;
        this.f12991a.getClass();
        if (d0 != 0) {
            return;
        }
        C5244p c5244p = this.g;
        if (c5244p == null) {
            this.g = new C5244p(this, this.c);
        } else if (c5244p.f) {
            return;
        }
        this.g.e();
    }
}
