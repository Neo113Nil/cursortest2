package sg.bigo.ads.m;

import android.util.Pair;
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
import sg.bigo.ads.u.C5485f;

/* loaded from: classes3.dex */
public class d0 extends e0 {
    public LinearLayout A;
    public LinearLayout B;
    public RoundedFrameLayout C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public IconListView H;
    public RoundedFrameLayout I;
    public Button J;
    public boolean K;
    public RoundedFrameLayout z;

    public d0(sg.bigo.ads.C.l lVar, int i, sg.bigo.ads.T0.q qVar, C5485f c5485f, sg.bigo.ads.q.o oVar) {
        super(lVar, i, qVar, c5485f, oVar);
        this.K = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[ORIG_RETURN, RETURN] */
    @Override // sg.bigo.ads.m.e0, sg.bigo.ads.m.AbstractC5325d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, boolean z, boolean z2) {
        IconListView iconListView;
        super.a(i, z, z2);
        sg.bigo.ads.T0.q qVar = this.e;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ad_component_clickable_switch"));
            if ((a2 != null ? a2.intValue() : 0) != 1) {
                sg.bigo.ads.C.f.a(this.j, this.z, 8, AbstractC5144a1.p, 0);
                iconListView = this.H;
                if (iconListView == null) {
                    List<sg.bigo.ads.v.g> items = iconListView.getItems();
                    for (int i2 = 0; items != null && i2 < items.size(); i2++) {
                        sg.bigo.ads.v.g gVar = items.get(i2);
                        sg.bigo.ads.C.f.a(gVar.d, 26);
                        sg.bigo.ads.C.f.a(this.j, gVar.d, 8, this.d, i);
                        sg.bigo.ads.C.f.a(gVar.g, 26);
                        sg.bigo.ads.C.f.a(this.j, gVar.g, 8, this.d, i);
                    }
                    return;
                }
                return;
            }
        }
        sg.bigo.ads.C.f.a(this.z, 18);
        sg.bigo.ads.C.f.a(this.j, this.z, 8, this.d, i);
        iconListView = this.H;
        if (iconListView == null) {
        }
    }

    @Override // sg.bigo.ads.m.e0
    public final void b(double d) {
        Button button;
        int i;
        super.b(d);
        if (this.K) {
            return;
        }
        if (d <= 3.0d) {
            button = this.J;
            if (button == null) {
                return;
            } else {
                i = 857743652;
            }
        } else {
            button = this.J;
            if (button == null) {
                return;
            } else {
                i = 872415231;
            }
        }
        button.setBackgroundColor(i);
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void e(AbstractC5144a1 abstractC5144a1) {
        int a2 = AbstractC4963u.a(this.k.getContext(), 16);
        int a3 = AbstractC4963u.a(this.j.getContext(), 40);
        int a4 = AbstractC4963u.a(this.k.getContext(), 72);
        Pair d = d(abstractC5144a1);
        if (this.i != null) {
            this.k.postDelayed(new c0(this, new boolean[]{false, false}, d, a2, a4, a3), Math.max(1, 1) * 1000);
        } else {
            if (this.I == null || !((Boolean) d.second).booleanValue()) {
                return;
            }
            AbstractC5140Q.a((View) this.I);
        }
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final int f() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_9;
    }

    @Override // sg.bigo.ads.m.e0
    public final void g(AbstractC5144a1 abstractC5144a1) {
        if (k()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.r.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.height = AbstractC4963u.a(this.k.getContext(), 24);
            this.r.setLayoutParams(marginLayoutParams);
            this.r.setVisibility(4);
        }
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.k.findViewById(R.id.inter_media_ad_card_layout);
        this.z = roundedFrameLayout;
        this.A = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_container);
        this.B = (LinearLayout) this.z.findViewById(R.id.inter_media_ad_card_top_layout);
        this.C = (RoundedFrameLayout) this.z.findViewById(R.id.inter_rounded_icon_layout);
        this.D = (ImageView) this.z.findViewById(R.id.inter_icon);
        this.E = (TextView) this.z.findViewById(R.id.inter_title);
        this.F = (TextView) this.z.findViewById(R.id.inter_company);
        this.G = (TextView) this.z.findViewById(R.id.inter_description);
        this.I = (RoundedFrameLayout) this.z.findViewById(R.id.inter_btn_cta_layout);
        this.J = (Button) this.z.findViewById(R.id.inter_btn_cta);
        RoundedFrameLayout roundedFrameLayout2 = this.z;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.I.getCornerRadiusTopRight(), this.z.getCornerRadiusBottomLeft(), this.I.getCornerRadiusBottomRight());
        IconListView iconListView = (IconListView) this.z.findViewById(R.id.inter_download_msg);
        this.H = iconListView;
        iconListView.a(this.i);
        this.H.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
        marginLayoutParams2.topMargin = AbstractC4963u.a(this.l.getContext(), 0);
        this.l.setLayoutParams(marginLayoutParams2);
        this.o.a(this.E);
        this.o.a(this.G);
        this.o.a(this.l);
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void a(View view) {
        View findViewById;
        if (view == null || this.f == null || (findViewById = view.findViewById(R.id.inter_media_ad_extra)) == null) {
            return;
        }
        this.f.a(findViewById, 0);
        this.f.a(view.findViewById(R.id.inter_options), 0);
    }
}
