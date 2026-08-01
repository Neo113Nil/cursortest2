package sg.bigo.ads.o;

import android.view.View;
import sg.bigo.ads.C.l;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.e0.C5085c;
import sg.bigo.ads.n.C5408w;

/* renamed from: sg.bigo.ads.o.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5419b extends C5408w {
    public C5419b(l lVar) {
        super(lVar);
    }

    @Override // sg.bigo.ads.n.C5408w, sg.bigo.ads.h.F1
    public final void a(View view) {
        View findViewById = view.findViewById(R.id.inter_ad_tag_layout);
        View findViewById2 = view.findViewById(R.id.inter_options);
        C5085c c5085c = this.e;
        if (c5085c == null) {
            return;
        }
        c5085c.a(findViewById, 0);
        this.e.a(findViewById2, 0);
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final int g() {
        Integer a2;
        q qVar = this.x;
        if (qVar == null || (a2 = z.a(qVar.a("video_play_page.ad_component_show_time"))) == null) {
            return 0;
        }
        return a2.intValue();
    }

    @Override // sg.bigo.ads.n.AbstractC5391n
    public final boolean o() {
        q qVar = this.x;
        return qVar != null && qVar.b("video_play_page.guide_click") == 1;
    }

    @Override // sg.bigo.ads.n.C5408w
    public final void z() {
        q qVar;
        if (!o() || this.D == null || (qVar = this.x) == null) {
            return;
        }
        Integer a2 = z.a(qVar.a("video_play_page.guide_click_timing"));
        int intValue = a2 != null ? a2.intValue() : 0;
        if (intValue >= 0) {
            this.D.postDelayed(new RunnableC5418a(this), intValue * 1000);
        }
    }
}
