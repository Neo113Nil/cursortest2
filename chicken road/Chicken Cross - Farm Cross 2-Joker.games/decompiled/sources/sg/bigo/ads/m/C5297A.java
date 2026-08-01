package sg.bigo.ads.m;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.EnumC5207t;

/* renamed from: sg.bigo.ads.m.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5297A extends AbstractC5325d {
    public View o;
    public RoundedImageView p;
    public TextView q;
    public TextView r;
    public Button s;

    public C5297A(sg.bigo.ads.C.l lVar, int i, sg.bigo.ads.T0.q qVar, sg.bigo.ads.q.o oVar) {
        super(lVar, qVar, oVar);
    }

    public void a(int i) {
        Button button = (Button) this.k.findViewById(R.id.inter_btn_cta);
        this.s = button;
        if (button != null) {
            float a2 = AbstractC4963u.a(this.k.getContext(), 8);
            this.s.setBackground(AbstractC4962t.a(a2, a2, a2, a2, (Rect) null, i));
            sg.bigo.ads.h.T.a(this.s, sg.bigo.ads.E0.p.b(i));
            EnumC5207t.f.a(this.s);
        }
    }

    @Override // sg.bigo.ads.h.O1
    public final boolean e() {
        return true;
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public int f() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_14_15;
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void h() {
        String str = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.d.e())).L;
        TextView textView = (TextView) this.k.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }

    public void k() {
        if (this.s == null || !g()) {
            return;
        }
        AbstractC5140Q.a(this.s);
    }

    public void l() {
        if (this.o != null) {
            float a2 = AbstractC4963u.a(this.k.getContext(), 16);
            this.o.setBackground(AbstractC4962t.a(a2, a2, a2, a2, (Rect) null, -1));
            EnumC5207t.f.a(this.o);
        }
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public void a(int i, boolean z, boolean z2) {
        sg.bigo.ads.C.f.a(this.o, 5);
        if (z) {
            sg.bigo.ads.C.f.a(this.j, this.o, 4, this.d, i);
        } else {
            sg.bigo.ads.C.f.a(this.j, this.o, 4, AbstractC5144a1.p, 0);
        }
        sg.bigo.ads.C.f.a(this.k, 9);
        if (z2) {
            sg.bigo.ads.C.f.a(this.j, this.k, 4, this.d, i);
        } else {
            sg.bigo.ads.C.f.a(this.j, this.k, 4, AbstractC5144a1.p, 0);
        }
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public void f(AbstractC5144a1 abstractC5144a1) {
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            return;
        }
        this.o = viewGroup.findViewById(R.id.inter_end_page);
        l();
        this.q = (TextView) this.k.findViewById(R.id.inter_title);
        this.r = (TextView) this.k.findViewById(R.id.inter_description);
        this.p = (RoundedImageView) this.k.findViewById(R.id.inter_icon);
        EnumC5207t.f.a(this.q, this.r);
        RoundedImageView roundedImageView = this.p;
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(AbstractC4963u.a(roundedImageView.getContext(), 8));
        }
        a(c(abstractC5144a1));
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public final void a(View view) {
        View findViewById;
        if (view == null || this.f == null || (findViewById = view.findViewById(R.id.inter_ad_tag_layout)) == null) {
            return;
        }
        this.f.a(findViewById, 0);
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public void a(double d) {
        TextView textView;
        int i;
        if (d <= 3.0d) {
            textView = this.l;
            if (textView == null) {
                return;
            } else {
                i = -14671580;
            }
        } else {
            textView = this.l;
            if (textView == null) {
                return;
            } else {
                i = -1;
            }
        }
        textView.setTextColor(sg.bigo.ads.E0.p.a(i, (int) 153.0f));
    }

    @Override // sg.bigo.ads.m.AbstractC5325d
    public void a(RunnableC5324c runnableC5324c) {
        RunnableC5344w runnableC5344w = new RunnableC5344w(this, runnableC5324c);
        if (this.k == null) {
            runnableC5344w.run();
        } else {
            sg.bigo.ads.K0.X.d(0, 0, this.o);
            this.k.post(new RunnableC5347z(this, runnableC5344w));
        }
    }
}
