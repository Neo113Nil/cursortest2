package sg.bigo.ads.h;

import sg.bigo.ads.m.AbstractC5325d;
import sg.bigo.ads.n.AbstractC5391n;

/* loaded from: classes3.dex */
public final class u2 implements sg.bigo.ads.N.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H2 f12933a;

    public u2(H2 h2) {
        this.f12933a = h2;
    }

    @Override // sg.bigo.ads.N.j
    public final void a(int i, int i2) {
        Float valueOf;
        F1 X = this.f12933a.X();
        X.f();
        if (X instanceof AbstractC5391n) {
            ((AbstractC5391n) X).r();
        }
        H2 h2 = this.f12933a;
        AbstractC5325d abstractC5325d = h2.i0;
        if (abstractC5325d != null && !abstractC5325d.h.isEmpty()) {
            O1.a(h2, new N1(abstractC5325d));
        }
        H2 h22 = this.f12933a;
        sg.bigo.ads.y.i iVar = h22.M;
        if (iVar != null && !iVar.h.isEmpty()) {
            O1.a(h22, new N1(iVar));
        }
        H2 h23 = this.f12933a;
        if (!h23.d0 && !h23.v && h23.c0 == 2) {
            float f = i / i2;
            Object a2 = h23.s.a("interstitial_video_style.video_play_page.cta_animation_show_wait_progress");
            if (a2 instanceof Float) {
                valueOf = (Float) a2;
            } else if (a2 instanceof Number) {
                valueOf = Float.valueOf(((Number) a2).floatValue());
            } else {
                if (a2 instanceof String) {
                    try {
                        valueOf = Float.valueOf((String) a2);
                    } catch (NumberFormatException unused) {
                    }
                }
                valueOf = null;
            }
            if (f >= (valueOf != null ? valueOf.floatValue() : 0.0f)) {
                this.f12933a.H0();
            }
        }
        H2 h24 = this.f12933a;
        sg.bigo.ads.T0.q qVar = h24.t;
        if (qVar == null || h24.d0 || !h24.v) {
            return;
        }
        Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.is_cta_show_animation"));
        if ((a3 != null ? a3.intValue() : 0) == 1) {
            this.f12933a.H0();
        }
    }
}
