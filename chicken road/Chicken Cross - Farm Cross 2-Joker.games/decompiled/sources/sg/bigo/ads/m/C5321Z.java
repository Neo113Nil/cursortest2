package sg.bigo.ads.m;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.u.C5485f;

/* renamed from: sg.bigo.ads.m.Z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5321Z extends e0 {
    public LinearLayout A;
    public RoundedFrameLayout B;
    public ImageView C;
    public TextView D;
    public TextView E;
    public ImageView F;
    public RoundedFrameLayout G;
    public Button H;
    public boolean I;
    public RoundedFrameLayout z;

    public C5321Z(sg.bigo.ads.C.l lVar, int i, sg.bigo.ads.T0.q qVar, C5485f c5485f, sg.bigo.ads.q.o oVar) {
        super(lVar, i, qVar, c5485f, oVar);
        this.I = false;
    }

    @Override // sg.bigo.ads.m.e0, sg.bigo.ads.m.AbstractC5325d
    public final void a(int i, boolean z, boolean z2) {
        super.a(i, z, z2);
        sg.bigo.ads.T0.q qVar = this.e;
        boolean z3 = true;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ad_component_clickable_switch"));
            if ((a2 != null ? a2.intValue() : 0) != 1) {
                z3 = false;
            }
        }
        sg.bigo.ads.C.f.a(this.z, 18);
        if (z3) {
            sg.bigo.ads.C.f.a(this.j, this.z, 8, this.d, i);
        } else {
            sg.bigo.ads.C.f.a(this.j, this.z, 8, AbstractC5144a1.p, 0);
        }
    }

    @Override // sg.bigo.ads.m.e0
    public final void b(double d) {
        Button button;
        int i;
        super.b(d);
        if (this.I) {
            return;
        }
        if (d <= 3.0d) {
            button = this.H;
            if (button == null) {
                return;
            } else {
                i = 857743652;
            }
        } else {
            button = this.H;
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
        this.k.postDelayed(new RunnableC5320Y(this, new boolean[]{false, false}, d(abstractC5144a1), AbstractC4963u.a(this.k.getContext(), 12), AbstractC4963u.a(this.k.getContext(), 16), AbstractC4963u.a(this.k.getContext(), 20), AbstractC4963u.a(this.k.getContext(), 72)), Math.max(1, 1) * 1000);
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final int f() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_8;
    }

    @Override // sg.bigo.ads.m.e0
    public final void g(AbstractC5144a1 abstractC5144a1) {
        Bitmap a2;
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
        this.A = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_info_container);
        this.B = (RoundedFrameLayout) this.z.findViewById(R.id.inter_rounded_icon_layout);
        this.C = (ImageView) this.z.findViewById(R.id.inter_icon);
        this.D = (TextView) this.z.findViewById(R.id.inter_title);
        this.E = (TextView) this.z.findViewById(R.id.inter_description);
        this.G = (RoundedFrameLayout) this.k.findViewById(R.id.inter_btn_cta_layout);
        this.H = (Button) this.z.findViewById(R.id.inter_btn_cta);
        this.F = (ImageView) this.z.findViewById(R.id.inter_star);
        RoundedFrameLayout roundedFrameLayout2 = this.z;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.z.getCornerRadiusTopRight(), this.G.getCornerRadiusBottomLeft(), this.G.getCornerRadiusBottomRight());
        ImageView imageView = this.F;
        if (imageView != null && (a2 = AbstractC5164f1.a(imageView.getContext(), this.d, this.i, sg.bigo.ads.h.Z.BLACK, false)) != null) {
            this.F.setImageBitmap(a2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
        marginLayoutParams2.topMargin = AbstractC4963u.a(this.l.getContext(), 0);
        this.l.setLayoutParams(marginLayoutParams2);
        this.o.a(this.D);
        this.o.a(this.E);
        this.o.a(this.l);
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
