package sg.bigo.ads.m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.u.C5485f;

/* renamed from: sg.bigo.ads.m.S, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5314S extends e0 {
    public TextView A;
    public View z;

    public C5314S(sg.bigo.ads.C.l lVar, int i, sg.bigo.ads.T0.q qVar, C5485f c5485f, sg.bigo.ads.q.o oVar) {
        super(lVar, i, qVar, c5485f, oVar);
    }

    public static void a(C5314S c5314s) {
        View view = c5314s.z;
        if (view == null || c5314s.A == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        c5314s.A.getLocationOnScreen(iArr2);
        ViewGroup.LayoutParams layoutParams = c5314s.A.getLayoutParams();
        layoutParams.width = (iArr[0] - iArr2[0]) - AbstractC4963u.a(c5314s.k.getContext(), 28);
        c5314s.A.setLayoutParams(layoutParams);
        c5314s.A.setLayerType(1, null);
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public void e(AbstractC5144a1 abstractC5144a1) {
        View findViewById = this.k.findViewById(R.id.inter_media_ad_desc);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(4);
        findViewById.postDelayed(new RunnableC5313Q(this, findViewById), 1 * 1000);
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public int f() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_6;
    }

    @Override // sg.bigo.ads.m.e0
    public void g(AbstractC5144a1 abstractC5144a1) {
        View view;
        if (abstractC5144a1 != null) {
            view = abstractC5144a1.f12687a.findViewById(R.id.inter_btn_close);
        } else {
            view = null;
        }
        this.z = view;
        TextView textView = (TextView) this.k.findViewById(R.id.inter_title);
        this.A = textView;
        this.o.a(textView);
        this.o.a(this.l);
        if (k()) {
            this.r.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            marginLayoutParams.topMargin = AbstractC4963u.a(this.l.getContext(), 0);
            this.l.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void a(View view) {
        View findViewById;
        if (view == null || this.f == null || (findViewById = view.findViewById(R.id.inter_media_ad_extra)) == null) {
            return;
        }
        this.f.a(findViewById, 0);
    }
}
