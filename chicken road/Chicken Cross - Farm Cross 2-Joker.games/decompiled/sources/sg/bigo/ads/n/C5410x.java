package sg.bigo.ads.n;

import android.view.ViewGroup;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;

/* renamed from: sg.bigo.ads.n.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5410x extends C5408w {
    public C5410x(sg.bigo.ads.C.l lVar) {
        super(lVar);
    }

    @Override // sg.bigo.ads.n.C5408w
    public final void C() {
        super.C();
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = this.D;
        if (realtimeBlurLinearLayout != null) {
            ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += -AbstractC4963u.a(this.D.getContext(), 60);
                this.D.requestLayout();
            }
        }
    }

    @Override // sg.bigo.ads.n.C5408w
    public int w() {
        return R.id.inter_component_20;
    }
}
