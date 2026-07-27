package sg.bigo.ads.n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5144a1;

/* loaded from: classes3.dex */
public final class G0 extends U0 {
    public RoundedFrameLayout P;
    public LinearLayout Q;
    public LinearLayout R;
    public RoundedFrameLayout S;
    public ImageView T;
    public TextView U;
    public TextView V;
    public TextView W;
    public IconListView X;
    public RoundedFrameLayout Y;
    public Button Z;
    public boolean a0;

    public G0(sg.bigo.ads.C.l lVar) {
        super(lVar);
        this.a0 = false;
    }

    @Override // sg.bigo.ads.n.U0
    public final void a(AbstractC5144a1 abstractC5144a1) {
        if (C()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.D.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.height = AbstractC4963u.a(this.u.getContext(), 24);
            this.D.setLayoutParams(marginLayoutParams);
            this.D.setVisibility(4);
        }
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.u.findViewById(R.id.inter_media_ad_card_layout);
        this.P = roundedFrameLayout;
        this.Q = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_container);
        this.R = (LinearLayout) this.P.findViewById(R.id.inter_media_ad_card_top_layout);
        this.S = (RoundedFrameLayout) this.P.findViewById(R.id.inter_rounded_icon_layout);
        this.T = (ImageView) this.P.findViewById(R.id.inter_icon);
        this.U = (TextView) this.P.findViewById(R.id.inter_title);
        this.V = (TextView) this.P.findViewById(R.id.inter_company);
        this.W = (TextView) this.P.findViewById(R.id.inter_description);
        this.Y = (RoundedFrameLayout) this.P.findViewById(R.id.inter_btn_cta_layout);
        this.Z = (Button) this.P.findViewById(R.id.inter_btn_cta);
        RoundedFrameLayout roundedFrameLayout2 = this.P;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.Y.getCornerRadiusTopRight(), this.P.getCornerRadiusBottomLeft(), this.Y.getCornerRadiusBottomRight());
        IconListView iconListView = (IconListView) this.P.findViewById(R.id.inter_download_msg);
        this.X = iconListView;
        iconListView.a(this.y);
        this.X.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
        marginLayoutParams2.topMargin = AbstractC4963u.a(this.z.getContext(), 0);
        this.z.setLayoutParams(marginLayoutParams2);
        this.s.a(this.U);
        this.s.a(this.W);
        this.s.a(this.z);
    }

    @Override // sg.bigo.ads.n.U0
    public final void b(int i) {
        int a2 = AbstractC4963u.a(this.u.getContext(), 16);
        int a3 = AbstractC4963u.a(this.u.getContext(), 40);
        int a4 = AbstractC4963u.a(this.u.getContext(), 72);
        boolean o = o();
        if (this.y != null) {
            this.u.postDelayed(new F0(this, new boolean[]{false, false}, o, a2, a4, a3), Math.max(1, i) * 1000);
            return;
        }
        RoundedFrameLayout roundedFrameLayout = this.Y;
        if (roundedFrameLayout == null || !o) {
            return;
        }
        AbstractC5140Q.a((View) roundedFrameLayout);
    }

    @Override // sg.bigo.ads.n.U0
    public final void z() {
        super.z();
        if (this.w.h) {
            sg.bigo.ads.C.f.a(this.P, 18);
            sg.bigo.ads.C.f.a(this.u, this.P, 8, this.d, this.w.i);
        } else {
            sg.bigo.ads.C.f.a(this.u, this.P, 8, AbstractC5144a1.p, 0);
        }
        IconListView iconListView = this.X;
        if (iconListView != null) {
            List<sg.bigo.ads.v.g> items = iconListView.getItems();
            for (int i = 0; items != null && i < items.size(); i++) {
                sg.bigo.ads.v.g gVar = items.get(i);
                sg.bigo.ads.C.f.a(gVar.d, 26);
                sg.bigo.ads.C.f.a(this.u, gVar.d, 8, this.d, this.w.i);
                sg.bigo.ads.C.f.a(gVar.g, 26);
                sg.bigo.ads.C.f.a(this.u, gVar.g, 8, this.d, this.w.i);
            }
        }
    }

    @Override // sg.bigo.ads.h.F1
    public final void a(View view) {
        View findViewById;
        if (this.e == null || (findViewById = view.findViewById(R.id.inter_media_ad_extra)) == null) {
            return;
        }
        this.e.a(findViewById, 0);
    }

    @Override // sg.bigo.ads.n.U0, sg.bigo.ads.n.AbstractC5391n
    public final void a(double d) {
        Button button;
        int i;
        super.a(d);
        if (this.a0) {
            return;
        }
        if (d <= 3.0d) {
            button = this.Z;
            if (button == null) {
                return;
            } else {
                i = 857743652;
            }
        } else {
            button = this.Z;
            if (button == null) {
                return;
            } else {
                i = 872415231;
            }
        }
        button.setBackgroundColor(i);
    }
}
