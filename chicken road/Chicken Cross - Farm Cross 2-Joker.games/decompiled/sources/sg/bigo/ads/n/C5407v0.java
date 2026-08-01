package sg.bigo.ads.n;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;

/* renamed from: sg.bigo.ads.n.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5407v0 extends U0 {
    public View P;
    public TextView Q;

    public C5407v0(sg.bigo.ads.C.l lVar) {
        super(lVar);
    }

    @Override // sg.bigo.ads.n.U0
    public void a(AbstractC5144a1 abstractC5144a1) {
        View view;
        if (abstractC5144a1 != null) {
            view = abstractC5144a1.f12687a.findViewById(R.id.inter_btn_close);
        } else {
            view = null;
        }
        this.P = view;
        TextView textView = (TextView) this.u.findViewById(R.id.inter_title);
        this.Q = textView;
        this.s.a(textView);
        this.s.a(this.z);
        if (C()) {
            this.D.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
            marginLayoutParams.topMargin = AbstractC4963u.a(this.z.getContext(), 0);
            this.z.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // sg.bigo.ads.n.U0
    public void b(int i) {
        View findViewById = this.u.findViewById(R.id.inter_media_ad_desc);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(4);
        if (i <= -1) {
            return;
        }
        findViewById.postDelayed(new RunnableC5403t0(this, findViewById), i * 1000);
    }

    @Override // sg.bigo.ads.n.U0, sg.bigo.ads.n.AbstractC5391n
    public final void q() {
        super.q();
        if (y() == 5) {
            if (this.E != null) {
                this.D.setType(1);
                LinearLayout linearLayout = (LinearLayout) this.u.findViewById(R.id.inter_media_container);
                if (linearLayout != null) {
                    Object tag = this.E.getTag(-188383023);
                    if (tag instanceof sg.bigo.ads.v.f) {
                        sg.bigo.ads.v.f fVar = (sg.bigo.ads.v.f) tag;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fVar.f.getLayoutParams();
                        layoutParams.gravity = 17;
                        layoutParams.topMargin = 0;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.height = -1;
                        layoutParams.width = -1;
                        fVar.f.setLayoutParams(layoutParams);
                    }
                    this.C.removeView(this.E);
                    Context context = this.C.getContext();
                    int a2 = AbstractC4963u.a(context, 20);
                    int a3 = AbstractC4963u.a(context, 12);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.leftMargin = a2;
                    layoutParams2.rightMargin = a2;
                    layoutParams2.bottomMargin = a3;
                    linearLayout.addView(this.E, 1, layoutParams2);
                    sg.bigo.ads.K0.X.a(this.C, new ViewTreeObserverOnGlobalLayoutListenerC5405u0(this, (LinearLayout.LayoutParams) this.C.getLayoutParams(), layoutParams2));
                }
            }
            w();
        }
    }

    @Override // sg.bigo.ads.n.U0
    public final int x() {
        if (y() == 5) {
            return 1;
        }
        return super.x();
    }

    @Override // sg.bigo.ads.n.U0
    public final int y() {
        int y = super.y();
        if ((this instanceof C5413y0) || y != 2) {
            return y;
        }
        sg.bigo.ads.U.r a2 = AbstractC5164f1.a(this.d);
        if (!a2.a() || a2.f12567a < a2.b) {
            return y;
        }
        return 5;
    }

    @Override // sg.bigo.ads.h.F1
    public final void a(View view) {
        View findViewById;
        if (this.e == null || (findViewById = view.findViewById(R.id.inter_media_ad_extra)) == null) {
            return;
        }
        this.e.a(findViewById, 0);
    }

    @Override // sg.bigo.ads.n.U0
    public final void a(int i, boolean z, int i2, boolean z2) {
        if (y() == 5) {
            z2 = false;
            i2 = i;
        }
        super.a(i, z, i2, z2);
    }
}
