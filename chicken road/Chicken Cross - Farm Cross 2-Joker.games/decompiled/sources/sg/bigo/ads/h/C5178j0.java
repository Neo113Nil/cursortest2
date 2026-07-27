package sg.bigo.ads.h;

import android.app.Activity;
import android.view.View;
import android.widget.RelativeLayout;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.e0.C5085c;
import sg.bigo.ads.f.C5111p;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.h.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5178j0 extends AbstractC5151c0 {
    public RelativeLayout l;
    public sg.bigo.ads.K0.E m;

    public C5178j0(Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public int G() {
        return R.layout.bigo_ad_activity_interstitial_banner;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final void I() {
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final void R() {
        super.R();
        sg.bigo.ads.K0.E e = this.m;
        if (e != null) {
            e.d();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final void S() {
        super.S();
        sg.bigo.ads.K0.E e = this.m;
        if (e == null || !e.b()) {
            return;
        }
        this.m.e();
    }

    public void T() {
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null) {
            return;
        }
        sg.bigo.ads.A.e eVar = ((C5190n0) abstractC5163f0).b0;
        C5181k0 c5181k0 = eVar != null ? eVar.c : null;
        if (c5181k0 == null) {
            return;
        }
        int max = Math.max(c5181k0.b, 0);
        this.g.setTakeoverTickEvent(true);
        this.g.a(max, null);
        C5175i0 c5175i0 = new C5175i0(this, Math.max(c5181k0.e, 0) * 1000);
        this.m = c5175i0;
        c5175i0.e();
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public void g(int i) {
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null) {
            a("Illegal InterstitialAd.");
            return;
        }
        C5190n0 c5190n0 = (C5190n0) abstractC5163f0;
        C5085c c5085c = this.c;
        C5111p c5111p = c5190n0.W;
        if (c5111p != null) {
            c5111p.y = c5085c;
        }
        c5190n0.X = new C5171h0(this);
        this.l = (RelativeLayout) this.f.findViewById(R.id.inter_banner_container);
        C5190n0 c5190n02 = (C5190n0) this.e;
        AdCountDownButton adCountDownButton = this.g;
        View findViewById = this.f12687a.findViewById(R.id.click_proxy);
        sg.bigo.ads.A.e eVar = c5190n02.b0;
        if (eVar != null && adCountDownButton != null) {
            int i2 = eVar.c.c;
            adCountDownButton.setCloseImageResource(i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? R.drawable.bigo_ad_ic_close : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4 : R.drawable.bigo_ad_ic_close3 : R.drawable.bigo_ad_ic_close2);
            adCountDownButton.setShowCloseButtonInCountdown(true);
            adCountDownButton.post(new sg.bigo.ads.A.a(eVar, adCountDownButton, findViewById));
        }
        C5190n0 c5190n03 = (C5190n0) this.e;
        c5190n03.getClass();
        if (!AbstractC5446j.e() && sg.bigo.ads.K0.Q.f12348a) {
            throw new IllegalArgumentException("adView() must run on UI thread");
        }
        View a2 = c5190n03.W.a();
        c5190n03.R.a(a2, false);
        if (a2 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            sg.bigo.ads.K0.X.a(a2, this.l, layoutParams, 0);
        }
        Activity activity = this.f12687a;
        C5111p c5111p2 = ((C5190n0) this.e).W;
        sg.bigo.ads.L0.C.a(activity, null, c5111p2 != null ? c5111p2.x : null);
        T();
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void w() {
        super.w();
        RelativeLayout relativeLayout = this.l;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        sg.bigo.ads.K0.E e = this.m;
        if (e != null) {
            e.a();
            this.m = null;
        }
    }
}
