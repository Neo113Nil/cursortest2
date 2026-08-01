package sg.bigo.ads.I;

import android.app.Activity;
import android.view.View;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5163f0;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.C5202r0;
import sg.bigo.ads.h.H2;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.h.q2;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public class w extends H2 {
    public x s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;

    public w(Activity activity) {
        super(activity);
        this.t0 = true;
        this.u0 = false;
        this.v0 = false;
        this.w0 = false;
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public void I() {
        super.I();
        if (this.t != null) {
            C5202r0 c5202r0 = this.K;
            String str = (c5202r0 == null || !c5202r0.b()) ? "video_play_page.force_staying_time" : "play_page.force_staying_time";
            boolean z = this.t0;
            Integer a2 = z.a(this.t.a(str));
            this.t0 = z & ((a2 != null ? a2.intValue() : 0) != -1);
        } else {
            boolean z2 = this.t0;
            Integer a3 = z.a(this.s.a("interstitial_video_style.style"));
            this.t0 = z2 & ((a3 != null ? a3.intValue() : 0) != 2);
        }
        if (this.t0) {
            return;
        }
        Q1 q1 = this.z;
        q1.b = 0;
        q1.c = -1;
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5151c0
    public final void O() {
        this.w = true;
        if (n0()) {
            e0();
        }
    }

    @Override // sg.bigo.ads.h.H2
    public final void P0() {
        super.P0();
        C5202r0 c5202r0 = this.K;
        if (c5202r0 != null) {
            c5202r0.p = this;
        }
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5151c0
    public final void Q() {
        this.v0 = true;
        if (this.p0) {
            this.C.removeCallbacks(this.q0);
            this.p0 = false;
        }
        AbstractC5446j.b(new q2(this));
    }

    @Override // sg.bigo.ads.h.H2
    public final void S0() {
        if (this.w0) {
            return;
        }
        W0();
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5144a1
    public final int V() {
        Integer a2 = z.a(this.s.a("interstitial_video_style.video_play_page.icon_strategy"));
        int i = (a2 != null ? a2.intValue() : 0) != 2 ? 1 : 2;
        if (this.H.get()) {
            return 3;
        }
        return i;
    }

    public final void W0() {
        x xVar = this.s0;
        if (xVar != null && !this.u0 && !(this instanceof sg.bigo.ads.w.b)) {
            this.u0 = true;
            xVar.G();
        } else if (xVar == null) {
            AbstractC5496a.a(2, 6, "", "Failed to claim reward because of null RewardVideoAd.");
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void Z() {
        super.Z();
        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) ((C5185l1) this.e).W.e();
        if (!this.H.get() || ((sg.bigo.ads.U0.k) interfaceC5087a).V0 == null || this.t0) {
            return;
        }
        Q1 q1 = this.z;
        q1.b = 0;
        q1.c = 15;
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.N.h
    public final void a(boolean z) {
        AdCountDownButton adCountDownButton;
        super.a(z);
        if (z || d0() != 0 || this.t0 || (adCountDownButton = this.g) == null) {
            return;
        }
        adCountDownButton.setTakeoverTickEvent(false);
        this.g.a(15, null);
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s
    public final boolean f(boolean z) {
        if (this instanceof sg.bigo.ads.w.b) {
            return super.f(z);
        }
        if (this.H.get()) {
            AdCountDownButton adCountDownButton = this.g;
            if (adCountDownButton != null) {
                adCountDownButton.c();
            }
        } else if (!this.u0 && this.t0) {
            int d0 = d0();
            C5202r0 c5202r0 = this.K;
            boolean z2 = c5202r0 != null && c5202r0.b();
            if ((d0 == 0 || (z2 && d0 == 14)) && !this.w0) {
                new l(this.f12687a).a(new v(this, W()));
                return false;
            }
        }
        boolean f = super.f(z);
        if (f && (this.H.get() || this.v0)) {
            W0();
        }
        return f;
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void u() {
        if (this.t0 && d0() == 0) {
            c(true);
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void v() {
        AdCountDownButton adCountDownButton;
        Integer a2;
        super.v();
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 == null) {
            return;
        }
        if (abstractC5163f0 instanceof x) {
            this.s0 = (x) abstractC5163f0;
        }
        if (this.s0 == null || abstractC5163f0 == null || !((C5185l1) abstractC5163f0).A()) {
            a("Illegal video content.");
        }
        if (d0() != 0) {
            return;
        }
        sg.bigo.ads.T0.q qVar = this.t;
        if (((qVar == null || (a2 = z.a(qVar.a("video_play_page.rw_timing"))) == null) ? 0 : a2.intValue()) == 0 || (adCountDownButton = this.g) == null) {
            return;
        }
        adCountDownButton.c();
        if (this.g.getVisibility() != 0) {
            this.g.setVisibility(0);
            AbstractC5140Q.b((View) this.g);
        }
        if (d0() == 0) {
            x xVar = this.s0;
            int z = xVar != null ? xVar.z() : 0;
            int i = this.z.c;
            if (i >= 0) {
                z = Math.max(0, Math.min(z, i));
            }
            this.g.setTakeoverTickEvent(false);
            this.g.a(z, new u(this));
        }
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.h.AbstractC5204s
    public final void w0() {
        super.w0();
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(this.t0);
        }
    }

    @Override // sg.bigo.ads.h.H2, sg.bigo.ads.l.InterfaceC5288d
    public final void a(boolean z, boolean z2) {
        super.a(z, z2);
        if (z || z2) {
            AdCountDownButton adCountDownButton = this.g;
            if (adCountDownButton != null) {
                adCountDownButton.c();
            }
            W0();
        }
    }
}
