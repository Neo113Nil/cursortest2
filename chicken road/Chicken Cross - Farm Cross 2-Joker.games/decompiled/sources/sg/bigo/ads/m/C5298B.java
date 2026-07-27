package sg.bigo.ads.m;

import android.graphics.Rect;
import android.widget.Button;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.EnumC5207t;

/* renamed from: sg.bigo.ads.m.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5298B extends C5297A {
    public Button t;

    public C5298B(sg.bigo.ads.C.l lVar, int i, sg.bigo.ads.T0.q qVar, sg.bigo.ads.q.o oVar) {
        super(lVar, i, qVar, oVar);
    }

    @Override // sg.bigo.ads.m.C5297A
    public final void a(int i) {
        super.a(i);
        Button button = (Button) this.k.findViewById(R.id.inter_btn_cta_main);
        this.t = button;
        if (button != null) {
            button.setVisibility(0);
            float a2 = AbstractC4963u.a(this.k.getContext(), 8);
            this.t.setBackground(AbstractC4962t.a(a2, a2, a2, a2, (Rect) null, -16724924));
            this.t.setTextColor(-1);
            EnumC5207t.f.a(this.t);
        }
    }

    @Override // sg.bigo.ads.m.C5297A
    public final void k() {
        super.k();
        if (this.t == null || !g()) {
            return;
        }
        AbstractC5140Q.a(this.t);
    }
}
