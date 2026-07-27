package sg.bigo.ads.n;

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

/* loaded from: classes3.dex */
public final class C0 extends U0 {
    public RoundedFrameLayout P;
    public LinearLayout Q;
    public RoundedFrameLayout R;
    public ImageView S;
    public TextView T;
    public TextView U;
    public ImageView V;
    public RoundedFrameLayout W;
    public Button X;
    public boolean Y;

    public C0(sg.bigo.ads.C.l lVar) {
        super(lVar);
        this.Y = false;
    }

    @Override // sg.bigo.ads.n.U0
    public final void a(AbstractC5144a1 abstractC5144a1) {
        Bitmap a2;
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
        this.Q = (LinearLayout) roundedFrameLayout.findViewById(R.id.inter_media_ad_card_info_container);
        this.R = (RoundedFrameLayout) this.P.findViewById(R.id.inter_rounded_icon_layout);
        this.S = (ImageView) this.P.findViewById(R.id.inter_icon);
        this.T = (TextView) this.P.findViewById(R.id.inter_title);
        this.U = (TextView) this.P.findViewById(R.id.inter_description);
        this.W = (RoundedFrameLayout) this.u.findViewById(R.id.inter_btn_cta_layout);
        this.X = (Button) this.P.findViewById(R.id.inter_btn_cta);
        this.V = (ImageView) this.P.findViewById(R.id.inter_star);
        RoundedFrameLayout roundedFrameLayout2 = this.P;
        roundedFrameLayout2.a(roundedFrameLayout2.getCornerRadiusTopLeft(), this.P.getCornerRadiusTopRight(), this.W.getCornerRadiusBottomLeft(), this.W.getCornerRadiusBottomRight());
        ImageView imageView = this.V;
        if (imageView != null && (a2 = AbstractC5164f1.a(imageView.getContext(), this.d, this.y, sg.bigo.ads.h.Z.BLACK, false)) != null) {
            this.V.setImageBitmap(a2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
        marginLayoutParams2.topMargin = AbstractC4963u.a(this.z.getContext(), 0);
        this.z.setLayoutParams(marginLayoutParams2);
        this.s.a(this.T);
        this.s.a(this.U);
        this.s.a(this.z);
    }

    @Override // sg.bigo.ads.n.U0
    public final void b(int i) {
        this.u.postDelayed(new B0(this, new boolean[]{false, false}, o(), AbstractC4963u.a(this.u.getContext(), 12), AbstractC4963u.a(this.u.getContext(), 16), AbstractC4963u.a(this.u.getContext(), 20), AbstractC4963u.a(this.u.getContext(), 72)), Math.max(1, i) * 1000);
    }

    @Override // sg.bigo.ads.n.U0
    public final void z() {
        ViewGroup viewGroup;
        RoundedFrameLayout roundedFrameLayout;
        sg.bigo.ads.d1.u uVar;
        int i;
        super.z();
        if (this.w.h) {
            sg.bigo.ads.C.f.a(this.P, 18);
            viewGroup = this.u;
            roundedFrameLayout = this.P;
            uVar = this.d;
            i = this.w.i;
        } else {
            viewGroup = this.u;
            roundedFrameLayout = this.P;
            uVar = AbstractC5144a1.p;
            i = 0;
        }
        sg.bigo.ads.C.f.a(viewGroup, roundedFrameLayout, 8, uVar, i);
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
        if (this.Y) {
            return;
        }
        if (d <= 3.0d) {
            button = this.X;
            if (button == null) {
                return;
            } else {
                i = 857743652;
            }
        } else {
            button = this.X;
            if (button == null) {
                return;
            } else {
                i = 872415231;
            }
        }
        button.setBackgroundColor(i);
    }
}
