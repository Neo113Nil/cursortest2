package sg.bigo.ads.m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.C1;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.i.C5231c;
import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.j.C5252f;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public class m0 extends sg.bigo.ads.H.p {
    public boolean v;

    public m0(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar) {
        super(lVar, qVar);
        this.v = false;
    }

    public static void a(View view, ViewGroup viewGroup, FrameLayout.LayoutParams layoutParams, sg.bigo.ads.k.d dVar) {
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height == -2) {
            layoutParams2.height = -1;
            sg.bigo.ads.K0.X.a(viewGroup, new j0(view, viewGroup, layoutParams, dVar));
        } else {
            if (layoutParams2 != null) {
                dVar.a(layoutParams2.width, layoutParams2.height);
            }
            sg.bigo.ads.K0.X.a(view, viewGroup, layoutParams, -1);
        }
    }

    @Override // sg.bigo.ads.H.p
    public void d(ViewGroup viewGroup) {
        if (!this.v || viewGroup == null) {
            super.d(viewGroup);
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_warning);
        if (textView != null) {
            textView.setVisibility(8);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_popup_msg);
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
    }

    @Override // sg.bigo.ads.H.p
    public final int g() {
        sg.bigo.ads.T0.q qVar = this.q;
        if (qVar == null) {
            return 1;
        }
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.close_button_style"));
        if (a2 != null) {
            return a2.intValue();
        }
        return 0;
    }

    @Override // sg.bigo.ads.H.p
    public final boolean h() {
        sg.bigo.ads.T0.q qVar = this.q;
        return qVar != null && qVar.b("endpage.is_cta_show_animation") == 1;
    }

    @Override // sg.bigo.ads.H.p
    public final boolean i() {
        sg.bigo.ads.T0.q qVar = this.q;
        return qVar != null && qVar.b("endpage.is_widget") == 1;
    }

    @Override // sg.bigo.ads.H.p
    public final void a(Context context, ViewGroup viewGroup) {
        viewGroup.post(new l0(new sg.bigo.ads.H.o(context, viewGroup), viewGroup));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(MediaView mediaView, C5185l1 c5185l1, boolean z) {
        int intValue;
        int i;
        sg.bigo.ads.T0.q qVar = this.q;
        int i2 = 0;
        if (qVar == null) {
            intValue = 1;
        } else {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ad_component_layout"));
            intValue = a2 != null ? a2.intValue() : 0;
        }
        if (intValue == 1) {
            int width = mediaView.getWidth();
            int height = mediaView.getHeight();
            ViewGroup.LayoutParams layoutParams = mediaView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(width, height);
            } else {
                layoutParams.width = width;
                layoutParams.height = height;
            }
            mediaView.setLayoutParams(layoutParams);
        }
        this.v = false;
        C5241m c5241m = c5185l1.X;
        if (c5241m != null && !c5241m.b && c5241m.f12988a) {
            if (c5241m.c()) {
                View view = c5241m.p.o;
                c5241m.f();
                if (view != null) {
                    mediaView.removeAllViews();
                    a(view, mediaView, new FrameLayout.LayoutParams(-1, -1, 17), c5241m);
                    view.setTag(19);
                    mediaView.setTag(19);
                    c5241m.a(1);
                    this.v = true;
                    i = 5;
                    if (i == 0) {
                        C5231c c5231c = c5185l1.Y;
                        if (c5231c != null && c5231c.f12978a) {
                            if (c5231c.c()) {
                                View e = c5231c.e();
                                if (e != null) {
                                    AbstractC5140Q.b((ViewGroup) mediaView);
                                    mediaView.removeAllViews();
                                    a(e, mediaView, new FrameLayout.LayoutParams(-1, -1, 17), c5231c);
                                    e.setTag(20);
                                    mediaView.setTag(20);
                                    c5231c.a(1);
                                    this.v = c5231c.b instanceof C5252f;
                                    i = 7;
                                }
                            } else {
                                c5231c.b();
                            }
                        }
                        i = 0;
                    }
                    if (i == 0 || !z) {
                        i2 = i;
                    } else {
                        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) c5185l1.W.e());
                        Pair pair = kVar.V0;
                        if (pair != null) {
                            this.s = (Bitmap) pair.first;
                            AbstractC5140Q.a((ViewGroup) mediaView);
                            mediaView.removeAllViews();
                            b((ViewGroup) mediaView);
                            mediaView.a((Bitmap) kVar.V0.first);
                        } else {
                            C5241m c5241m2 = c5185l1.X;
                            if (c5241m2 != null && c5241m2.c()) {
                                kVar.T0 = 3;
                                View view2 = c5241m2.p.o;
                                if (view2 != null) {
                                    AbstractC5140Q.b((ViewGroup) mediaView);
                                    mediaView.removeAllViews();
                                    a(view2, mediaView, new FrameLayout.LayoutParams(-1, -1, 17), c5241m2);
                                    view2.setTag(19);
                                    mediaView.setTag(19);
                                    c5241m2.a(1);
                                    this.v = true;
                                }
                            }
                        }
                        i2 = 1;
                    }
                    if (i2 == 0) {
                        return i2;
                    }
                    h0 h0Var = new h0(this, mediaView);
                    Bitmap bitmap = this.n;
                    if (bitmap != null) {
                        h0Var.onReceiveValue(bitmap);
                        return 1;
                    }
                    i0 i0Var = new i0(h0Var);
                    synchronized (this) {
                        a(new C1(this, i0Var));
                    }
                    return 1;
                }
            } else {
                AbstractC5496a.a("PopupEndPageRender", "playableAdCompanion is not ResourceReady");
                c5241m.p.b();
            }
        }
        i = 0;
        if (i == 0) {
        }
        if (i == 0) {
        }
        i2 = i;
        if (i2 == 0) {
        }
    }

    @Override // sg.bigo.ads.H.p
    public void a(AdCountDownButton adCountDownButton, ViewGroup viewGroup, sg.bigo.ads.H.n nVar) {
        Integer a2;
        super.a(adCountDownButton, viewGroup, nVar);
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() == 0) {
            adCountDownButton.clearAnimation();
            adCountDownButton.setVisibility(4);
        }
        k0 k0Var = new k0(adCountDownButton);
        sg.bigo.ads.T0.q qVar = this.q;
        int i = 0;
        if (qVar != null && (a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.force_staying_time"))) != null) {
            i = a2.intValue();
        }
        AbstractC5446j.a(2, null, k0Var, i * 1000);
    }
}
