package sg.bigo.ads.B;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.F1;
import sg.bigo.ads.h.Q1;

/* loaded from: classes3.dex */
public class b extends AbstractC5144a1 {
    public Q1 q;
    public q r;
    public final a s;
    public boolean t;

    public b(Activity activity) {
        super(activity);
        this.s = new a(this);
        this.t = true;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public int G() {
        return R.layout.bigo_ad_activity_interstitial_vpaid;
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void I() {
        this.l = ((C5185l1) this.e).D();
        q qVar = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) ((C5185l1) this.e).W.e())).I;
        this.r = qVar;
        Q1 q1 = new Q1();
        if (qVar != null) {
            q1.f = qVar.b("video_play_page.media_view_clickable_switch") == 1;
            q1.g = this.r.b("video_play_page.other_space_clickable_switch") == 1;
            Integer a2 = z.a(this.r.a("video_play_page.click_type"));
            q1.i = a2 != null ? a2.intValue() : 0;
            Integer a3 = z.a(this.r.a("video_play_page.force_staying_time"));
            q1.c = a3 != null ? a3.intValue() : 0;
        }
        this.q = q1;
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void R() {
        VideoController W = W();
        boolean z = W != null && W.isPlaying();
        this.t = z;
        if (z) {
            W.pause();
        }
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.a();
        }
        super.R();
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void S() {
        super.S();
        VideoController W = W();
        if (W != null && W.isPaused() && this.t) {
            W.play();
            this.t = false;
        }
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton == null || adCountDownButton.c) {
            return;
        }
        adCountDownButton.b();
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1
    public final int T() {
        return 0;
    }

    public void Y() {
        if (this.g == null) {
            return;
        }
        int i = this.q.c;
        if (((sg.bigo.ads.U0.b) ((InterfaceC5087a) ((C5185l1) this.e).W.e())).l != 4) {
            i = 0;
        }
        this.g.a(i, null);
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void g(int i) {
        super.g(i);
        if (this.m == null) {
            a("can not find ad root view.");
            return;
        }
        if (this.e == null) {
            a("Illegal InterstitialAd.");
            return;
        }
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            sg.bigo.ads.Z.c.a(adCountDownButton, this.s);
            this.g.setShowCloseButtonInCountdown(false);
            this.g.setTakeoverTickEvent(false);
            if (this.g.getVisibility() != 0) {
                this.g.setVisibility(0);
                AbstractC5140Q.b((View) this.g);
            }
            Y();
        }
        ViewGroup viewGroup = this.m;
        if (viewGroup != null && this.l != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
            TextView textView2 = (TextView) this.m.findViewById(R.id.inter_ad_label);
            String advertiser = this.l.getAdvertiser();
            if (textView != null && textView2 != null) {
                boolean isEmpty = TextUtils.isEmpty(advertiser);
                textView.setVisibility(!isEmpty ? 0 : 8);
                if (!isEmpty) {
                    textView.setText(advertiser);
                    textView2.setText(R.string.bigo_ad_tag);
                }
            }
        }
        F1 X = X();
        ViewGroup viewGroup2 = this.m;
        X.a(viewGroup2, viewGroup2, V(), 12, this.q.i, this.g);
    }
}
