package sg.bigo.ads.n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.u.C5485f;

/* renamed from: sg.bigo.ads.n.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5413y0 extends C5407v0 {
    public C5413y0(sg.bigo.ads.C.l lVar) {
        super(lVar);
    }

    @Override // sg.bigo.ads.n.C5407v0, sg.bigo.ads.n.U0
    public final void a(AbstractC5144a1 abstractC5144a1) {
        super.a(abstractC5144a1);
        this.D.setVisibility(4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
        marginLayoutParams.topMargin = AbstractC4963u.a(this.z.getContext(), 0);
        this.z.setLayoutParams(marginLayoutParams);
    }

    @Override // sg.bigo.ads.n.C5407v0, sg.bigo.ads.n.U0
    public final void b(int i) {
        super.b(i);
        C5485f c5485f = this.K;
        if ((c5485f != null ? c5485f.f13330a : null) == null) {
            return;
        }
        View findViewById = this.u.findViewById(R.id.inter_btn_cta_layout);
        Button button = (Button) this.u.findViewById(R.id.inter_btn_cta);
        if (button == null) {
            return;
        }
        button.postDelayed(new RunnableC5411x0(this, findViewById, button), Math.max(1, i) * 1000);
    }
}
