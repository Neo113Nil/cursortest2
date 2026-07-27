package sg.bigo.ads.I;

import android.app.Activity;
import android.view.View;
import java.util.HashMap;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5163f0;
import sg.bigo.ads.h.C5178j0;
import sg.bigo.ads.h.C5181k0;
import sg.bigo.ads.h.C5190n0;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class f extends C5178j0 {
    public g n;
    public final boolean o;
    public boolean p;
    public boolean q;
    public boolean r;

    public f(Activity activity) {
        super(activity);
        this.o = true;
        this.p = false;
        this.q = false;
        this.r = false;
    }

    @Override // sg.bigo.ads.h.C5178j0
    public final void T() {
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null) {
            return;
        }
        sg.bigo.ads.A.e eVar = ((C5190n0) abstractC5163f0).b0;
        C5181k0 c5181k0 = eVar != null ? eVar.c : null;
        if (c5181k0 == null) {
            this.g.a(15, new b(this));
            return;
        }
        int i = c5181k0.b;
        if (i < 0) {
            this.g.setShowCloseButtonInCountdown(false);
        }
        this.g.setTakeoverTickEvent(true);
        this.g.a(i, null);
        d dVar = new d(this, (c5181k0.e >= 5 ? r0 : 15) * 1000);
        this.m = dVar;
        dVar.e();
    }

    public final void U() {
        g gVar = this.n;
        if (gVar == null || this.p) {
            if (gVar == null) {
                AbstractC5496a.a(2, 6, "", "Failed to claim reward because of null RewardVideoAd.");
                return;
            }
            return;
        }
        this.p = true;
        HashMap a2 = sg.bigo.ads.s1.b.a(gVar.k.f12482a, (sg.bigo.ads.Q.b) null, false);
        a2.put("rew_rslt", "1");
        a2.put("out_ad", String.valueOf(gVar.f));
        sg.bigo.ads.s1.b.a(a2, (sg.bigo.ads.Q.b) gVar, false);
        sg.bigo.ads.s1.b.a("06002019", a2);
        RewardAdInteractionListener rewardAdInteractionListener = gVar.c0;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdRewarded();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0
    public final void c(boolean z) {
        if (this.g.getVisibility() == 0) {
            AdCountDownButton adCountDownButton = this.g;
            if (adCountDownButton.c) {
                if (!this.q && !this.r) {
                    new l(this.f12687a).a(new e(this));
                    return;
                }
                adCountDownButton.c();
                U();
                C();
            }
        }
    }

    @Override // sg.bigo.ads.h.C5178j0, sg.bigo.ads.h.AbstractC5151c0
    public final void g(int i) {
        super.g(i);
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void u() {
        if (this.o) {
            c(true);
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void v() {
        super.v();
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null) {
            return;
        }
        if (abstractC5163f0 instanceof g) {
            this.n = (g) abstractC5163f0;
        }
        if (this.n == null) {
            a("Illegal reward banner content.");
        }
        if (this.g.getVisibility() != 0) {
            this.g.setVisibility(0);
            AbstractC5140Q.b((View) this.g);
        }
    }
}
