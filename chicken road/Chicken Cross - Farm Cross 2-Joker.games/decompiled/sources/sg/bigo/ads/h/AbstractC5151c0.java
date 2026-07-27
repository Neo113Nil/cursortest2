package sg.bigo.ads.h;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.AdInteractionListener;

/* renamed from: sg.bigo.ads.h.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5151c0 extends sg.bigo.ads.X0.s {
    public AbstractC5163f0 e;
    public ViewGroup f;
    public AdCountDownButton g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public long j;
    public long k;

    public AbstractC5151c0(Activity activity) {
        super(activity);
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(true);
        this.j = 0L;
        this.k = 0L;
    }

    public boolean A() {
        return true;
    }

    public boolean B() {
        return true;
    }

    public final void C() {
        if (this.e != null && !this.h.get()) {
            this.j = (SystemClock.elapsedRealtime() - this.k) + this.j;
            AbstractC5163f0 abstractC5163f0 = this.e;
            sg.bigo.ads.s1.b.a(abstractC5163f0.k.f12482a, E(), abstractC5163f0.U > 0 ? SystemClock.elapsedRealtime() - abstractC5163f0.U : 0L, this.j, abstractC5163f0);
            this.j = 0L;
        }
        this.f12687a.finish();
    }

    public int D() {
        return R.layout.bigo_ad_activity_interstitial;
    }

    public int E() {
        return 1;
    }

    public sg.bigo.ads.e.h F() {
        return this.e;
    }

    public abstract int G();

    public int H() {
        int G = G();
        Activity activity = this.f12687a;
        ViewGroup viewGroup = this.f;
        AbstractC4944a.a(activity, G, viewGroup, viewGroup != null);
        return G;
    }

    public abstract void I();

    public boolean J() {
        return false;
    }

    public boolean K() {
        return this instanceof sg.bigo.ads.B.c;
    }

    public boolean L() {
        return false;
    }

    public abstract boolean M();

    public boolean N() {
        return true;
    }

    public void O() {
    }

    public void P() {
    }

    public void Q() {
    }

    public void R() {
        this.i.set(true);
        this.j = (SystemClock.elapsedRealtime() - this.k) + this.j;
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton == null || adCountDownButton.c) {
            return;
        }
        adCountDownButton.a();
    }

    public void S() {
        this.i.set(false);
        this.k = SystemClock.elapsedRealtime();
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton == null || adCountDownButton.c || !N()) {
            return;
        }
        this.g.b();
    }

    public final void a(String str) {
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 != null) {
            abstractC5163f0.b(2003, 0, str);
        }
        this.f12687a.finish();
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void b(boolean z) {
        if (z) {
            q();
        }
    }

    public void c(boolean z) {
        C();
    }

    public void f(int i) {
    }

    public abstract void g(int i);

    public final void h(int i) {
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null) {
            adCountDownButton.setCloseImageResource(i);
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final boolean s() {
        return K();
    }

    @Override // sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void t() {
    }

    @Override // sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void u() {
    }

    @Override // sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void v() {
        try {
            AbstractC5163f0 abstractC5163f0 = (AbstractC5163f0) this.d;
            this.e = abstractC5163f0;
            if (abstractC5163f0 == null) {
                this.f12687a.finish();
                return;
            }
            if (!L()) {
                q();
                if (K()) {
                    int i = R.layout.bigo_ad_activity_popup;
                    int c = AbstractC4963u.c(this.f12687a);
                    int i2 = this.f12687a.getResources().getDisplayMetrics().heightPixels;
                    this.f12687a.setContentView(AbstractC4944a.a(this.f12687a, i, null, false), new ViewGroup.LayoutParams(c, i2));
                } else {
                    this.f12687a.setContentView(AbstractC4944a.a(this.f12687a, D(), null, false));
                }
            }
            I();
            this.f = (ViewGroup) this.f12687a.findViewById(R.id.inter_main);
            if (J()) {
                AdCountDownButton adCountDownButton = (AdCountDownButton) this.f12687a.findViewById(R.id.inter_btn_close);
                this.g = adCountDownButton;
                if (adCountDownButton != null) {
                    a(adCountDownButton);
                    this.g.setOnCloseListener(new C5147b0(this));
                }
                P();
                z();
                return;
            }
            if (L()) {
                f(H());
                this.e.S = this;
                return;
            }
            int H = H();
            AdCountDownButton adCountDownButton2 = (AdCountDownButton) this.f12687a.findViewById(R.id.inter_btn_close);
            this.g = adCountDownButton2;
            if (adCountDownButton2 != null) {
                a(adCountDownButton2);
                this.g.setOnCloseListener(new C5147b0(this));
            }
            g(H);
            this.e.S = this;
            z();
        } catch (Exception unused) {
            a("Illegal InterstitialAd.");
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void w() {
        C5213v c5213v;
        AdCountDownButton adCountDownButton = this.g;
        if (adCountDownButton != null && (c5213v = adCountDownButton.b) != null) {
            c5213v.a();
        }
        if (this.e != null && !L() && this.h.compareAndSet(false, true)) {
            this.e.d(E());
        }
        if (this.e == null || L()) {
            return;
        }
        this.e.destroy();
    }

    @Override // sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void x() {
        if (A() && this.i.compareAndSet(false, true)) {
            R();
        }
        sg.bigo.ads.Y0.D.a(this.f12687a, F());
    }

    @Override // sg.bigo.ads.X0.s, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void y() {
        if (B() && this.i.compareAndSet(true, false)) {
            S();
        }
        sg.bigo.ads.P.e p = F().p();
        if (p == null || p.f12477a != 4 || p.d) {
            if (this.e.T) {
                c(true);
                this.e.T = false;
                return;
            }
            return;
        }
        F().p().d = true;
        sg.bigo.ads.Y0.D.a(this.f12687a, F());
        Activity activity = this.f12687a;
        sg.bigo.ads.j1.b.a(activity, p.b, activity.getPackageName(), p.c);
    }

    public void z() {
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (!abstractC5163f0.q) {
            abstractC5163f0.q = true;
            abstractC5163f0.A = SystemClock.elapsedRealtime();
        }
        AdInteractionListener adInteractionListener = abstractC5163f0.j;
        if (adInteractionListener != null) {
            adInteractionListener.onAdOpened();
        }
        abstractC5163f0.U = SystemClock.elapsedRealtime();
        HashMap a2 = sg.bigo.ads.s1.b.a(abstractC5163f0.k.f12482a, (sg.bigo.ads.Q.b) null, false);
        a2.put("out_ad", String.valueOf(abstractC5163f0.f));
        sg.bigo.ads.s1.b.a(a2, (sg.bigo.ads.Q.b) abstractC5163f0, false);
        sg.bigo.ads.s1.b.a("06002022", a2);
    }
}
