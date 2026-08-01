package sg.bigo.ads.x;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.P;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.F1;
import sg.bigo.ads.m.AbstractC5325d;
import sg.bigo.ads.m.z0;
import sg.bigo.ads.n.AbstractC5391n;
import sg.bigo.ads.w.InterfaceC5495a;

/* loaded from: classes3.dex */
public class q extends AbstractC5144a1 {
    public int A;
    public boolean B;
    public l C;
    public final m D;
    public final RoundedFrameLayout q;
    public final sg.bigo.ads.C.l r;
    public F1 s;
    public AbstractC5325d t;
    public final InterfaceC5495a u;
    public boolean v;
    public final int w;
    public final View x;
    public ViewGroup y;
    public final boolean z;

    public q(Activity activity, InterfaceC5495a interfaceC5495a, RoundedFrameLayout roundedFrameLayout, sg.bigo.ads.C.l lVar, int i, View view, boolean z) {
        super(activity);
        this.C = new l(this);
        this.D = new m();
        this.u = interfaceC5495a;
        this.q = roundedFrameLayout;
        this.r = lVar;
        F1 a2 = AbstractC5391n.a(lVar, 0);
        this.s = a2;
        a2.e = this.c;
        this.w = i;
        this.x = view;
        this.z = z;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final int G() {
        return R.layout.bigo_ad_activity_vertical_twins_sub;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final int H() {
        int i = R.layout.bigo_ad_activity_vertical_twins_sub;
        Activity activity = this.f12687a;
        RoundedFrameLayout roundedFrameLayout = this.q;
        AbstractC4944a.a(activity, i, roundedFrameLayout, roundedFrameLayout != null);
        return i;
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final boolean L() {
        return true;
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void R() {
        super.R();
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void S() {
        super.S();
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1
    public final int T() {
        return 0;
    }

    public void Y() {
        View view;
        sg.bigo.ads.T0.q qVar = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.r.e())).I;
        if (qVar == null || this.q == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Integer a2 = z.a(qVar.a("multi_ads.interaction_type"));
        this.A = a2 != null ? a2.intValue() : 2;
        Integer a3 = z.a(qVar.a("multi_ads.click_type"));
        int intValue = a3 != null ? a3.intValue() : 0;
        MediaView mediaView = (MediaView) this.q.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.setMediaAreaClickable(true);
            ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) mediaView.getViewImpl())).a(false);
        }
        Integer a4 = z.a(qVar.a("multi_ads.media_view_clickable_switch"));
        boolean z = (a4 != null ? a4.intValue() : 0) == 1;
        View findViewById = this.q.findViewById(R.id.inter_media_layout);
        if (z) {
            if (findViewById != null) {
                findViewById.setTag(10);
                arrayList.add(findViewById);
            }
            arrayList.add(mediaView);
        } else {
            if (mediaView != null) {
                sg.bigo.ads.C.f.a(this.q, mediaView, 8, this.D, intValue);
            }
            if (findViewById != null) {
                sg.bigo.ads.C.f.a(this.q, findViewById, 8, this.D, intValue);
            }
        }
        Integer a5 = z.a(qVar.a("multi_ads.other_space_clickable_switch"));
        if ((a5 != null ? a5.intValue() : 0) == 1 && (view = this.x) != null && this.w == 0 && this.z) {
            view.setTag(9);
            sg.bigo.ads.C.f.a(this.q, this.x, 13, this.C, intValue);
        }
        Integer a6 = z.a(qVar.a("multi_ads.ad_component_clickable_switch"));
        boolean z2 = (a6 != null ? a6.intValue() : 0) == 1;
        View findViewById2 = this.q.findViewById(R.id.bigo_ad_sub_bottom_component);
        if (z2) {
            if (findViewById2 != null) {
                findViewById2.setTag(9);
                arrayList.add(findViewById2);
            }
        } else if (findViewById2 != null) {
            sg.bigo.ads.C.f.a(this.q, findViewById2, 8, this.D, intValue);
        }
        View findViewById3 = this.q.findViewById(R.id.inter_title);
        if (findViewById3 != null) {
            findViewById3.setVisibility(0);
            findViewById3.setTag(2);
            arrayList.add(findViewById3);
        }
        View findViewById4 = this.q.findViewById(R.id.inter_icon);
        if (findViewById4 != null) {
            findViewById4.setTag(1);
            arrayList.add(findViewById4);
        }
        View findViewById5 = this.q.findViewById(R.id.bigo_ad_tv_more);
        if (findViewById5 != null) {
            findViewById5.setVisibility(0);
            findViewById5.setTag(35);
            arrayList.add(findViewById5);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            if (view2 != null) {
                sg.bigo.ads.C.f.a(this.q, view2, 8, this.C, intValue);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r5.w == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r5.w == 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        if (this.v) {
            return false;
        }
        sg.bigo.ads.T0.q qVar = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.r.e())).I;
        if (this.t == null) {
            this.t = AbstractC5325d.a(this.r, qVar, null, null, false);
        }
        if (this.t instanceof z0) {
            this.q.setCornerRadius(0.0f);
            this.q.removeAllViews();
            Integer a2 = z.a(qVar.a("multi_ads_endpage.ad_component_layout"));
            int intValue = a2 != null ? a2.intValue() : 0;
            if (4 != intValue) {
                if (5 == intValue) {
                }
            }
            AbstractC5325d abstractC5325d = this.t;
            ((z0) abstractC5325d).o = intValue;
            abstractC5325d.a(this, this.q, 2);
            InterfaceC5495a interfaceC5495a = this.u;
            if (interfaceC5495a != null) {
                interfaceC5495a.c(11);
            }
            this.v = true;
        }
        return true;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public void f(int i) {
        try {
            sg.bigo.ads.U.r a2 = AbstractC5164f1.a(this.r);
            if (a2.b > a2.f12567a) {
                Context context = this.q.getContext();
                int a3 = AbstractC4963u.a(context, k.j0 - 55) - AbstractC4963u.a(context, 16);
                int i2 = (int) (a3 * ((a2.f12567a * 1.0f) / a2.b));
                MediaView mediaView = (MediaView) this.q.findViewById(R.id.inter_media);
                if (mediaView != null) {
                    ViewGroup viewGroup = (ViewGroup) mediaView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(mediaView);
                    }
                    mediaView.setMediaAreaClickable(true);
                    ((sg.bigo.ads.d1.s) ((sg.bigo.ads.N.g) mediaView.getViewImpl())).a(false);
                    RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, a3, 49);
                    layoutParams.topMargin = AbstractC4963u.a(context, 8);
                    roundedFrameLayout.setLayoutParams(layoutParams);
                    roundedFrameLayout.setCornerRadius(AbstractC4963u.a(context, 16));
                    roundedFrameLayout.addView(mediaView);
                    this.q.addView(roundedFrameLayout);
                    ViewGroup.LayoutParams layoutParams2 = mediaView.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = i2;
                        layoutParams2.height = a3;
                        mediaView.setLayoutParams(layoutParams2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (this.s != null && ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.r.e())).W0 && !this.B) {
            this.B = true;
            F1 f1 = this.s;
            RoundedFrameLayout roundedFrameLayout2 = this.q;
            f1.a(roundedFrameLayout2, roundedFrameLayout2, 1, 8, 0, new View[0]);
        }
        AbstractC5164f1.a(this.r, new o(this));
        Y();
        RoundedImageView roundedImageView = (RoundedImageView) this.q.findViewById(R.id.inter_icon);
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(AbstractC4963u.a(this.q.getContext(), 6));
        }
        if (this.z || this.q == null) {
            return;
        }
        try {
            Activity activity = this.f12687a;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.y = frameLayout;
            frameLayout.setBackgroundColor(-1);
            ProgressBar progressBar = new ProgressBar(activity);
            progressBar.setBackgroundColor(AbstractC4944a.a(activity, android.R.color.transparent));
            P.a(activity, progressBar, R.drawable.bigo_ad_default_progressbar, I.a(-16776961, "#FF009DFF"));
            this.y.addView(progressBar, new FrameLayout.LayoutParams(-2, -2, 17));
            this.q.addView(this.y, new FrameLayout.LayoutParams(-1, -1, 17));
            sg.bigo.ads.C.f.a(this.q, this.y, 8, this.D, 0);
        } catch (Throwable unused2) {
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void g(int i) {
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void w() {
        super.w();
        this.C = null;
        this.t = null;
        this.s = null;
    }
}
