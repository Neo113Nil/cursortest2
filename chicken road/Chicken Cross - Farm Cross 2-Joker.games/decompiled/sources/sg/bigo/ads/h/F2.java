package sg.bigo.ads.h;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class F2 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f12819a;

    public F2(H2 h2) {
        this.f12819a = new WeakReference(h2);
    }

    public final void a() {
        H2 h2 = (H2) this.f12819a.get();
        if (h2 == null || h2.g == null) {
            return;
        }
        sg.bigo.ads.T0.q qVar = h2.t;
        if (qVar != null) {
            h2.a((sg.bigo.ads.K0.z.a(qVar.a("endpage.close_click_seconds")) != null ? r1.intValue() : 0) * 1000);
        } else {
            h2.a(sg.bigo.ads.O.g.f12472a.C.c * 1000);
        }
        h2.g.c();
    }
}
